using CsvHelper;
using PayRollAppConsole.Model;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.IO;
using System.Linq;

namespace PayRollAppConsole
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Employee> employees = ReadFileCSV();
            if (employees.Count > 0)
            {
                DateTime CurrentDate = DateTime.Now;
                foreach (Employee employee in employees)
                {
                    Console.WriteLine("**********************************");
                    Console.WriteLine("Tên nhân viên: " + employee.Name);
                    Console.WriteLine("Tuổi: " + CaculateAge(employee.DateOfBirth, CurrentDate));
                    Console.WriteLine("Số năm và tháng làm việc: " + CaculateWorkingYearMonth(employee.DateOfBirth, employee.StartDate));
                    Console.WriteLine("Lương: " + CaculateSalary(employee.StartDate, CurrentDate, employee.Salary).ToString("N0")); // format 12,345
                    Console.WriteLine("**********************************" + Environment.NewLine);
                }
            }
            else
            {
                Console.WriteLine("No Records");
            }
            Console.ReadLine();
        }
        private static List<Employee> ReadFileCSV() 
        {
            String CSVFilePath = @"Resources/employees.csv";
            String DATE_YYYYMMDD_FORMAT = "yyyyMMdd";
            List<Employee> employees = new List<Employee>();

            // read file csv and convert to Employee objects
            using (var reader = new StreamReader(CSVFilePath))
            using (var csv = new CsvReader(reader))
            {
                List<dynamic> records = csv.GetRecords<dynamic>().ToList();
                foreach (var record in records)
                {
                    Employee employee = new Employee
                    {
                        Name = record.name,
                        DateOfBirth = DateTime.ParseExact(record.dob, DATE_YYYYMMDD_FORMAT, CultureInfo.InvariantCulture),
                        Role = record.role,
                        StartDate = DateTime.ParseExact(record.startdate, DATE_YYYYMMDD_FORMAT, CultureInfo.InvariantCulture),
                        Salary = int.Parse(record.salary)
                    };
                    employees.Add(employee);
                }
            }
            return employees;
        }
        private static int CaculateAge(DateTime DateOfBirth, DateTime CurrentDate) 
        {
            return CurrentDate.Year - DateOfBirth.Year ;
        }
        private static String CaculateWorkingYearMonth(DateTime DateOfBirth, DateTime StartDate)
        {
            int MONTH_IN_YEAR = 12;
            int WorkingYear = StartDate.Year - DateOfBirth.Year;
            int WorkingMonth = StartDate.Month - DateOfBirth.Month;
            if(WorkingMonth < 0)
            {
                WorkingMonth = WorkingMonth + MONTH_IN_YEAR;
                WorkingYear = WorkingYear - 1;
            }
            return String.Format("{0} năm - {1} tháng", WorkingYear, WorkingMonth);
        }

        private static int CaculateSalary(DateTime StartDate, DateTime CurrentDate, int BaseSalary)
        {
            double COEFFICIENTS_SALARY = 1.06;
            int WorkingYear = CurrentDate.Year - StartDate.Year;
            int Salary = BaseSalary;

            for(int i = 0; i < WorkingYear; i++)
            {
                Salary = (int)(Salary * COEFFICIENTS_SALARY);
            }
            return Salary;
        }
    }
}
