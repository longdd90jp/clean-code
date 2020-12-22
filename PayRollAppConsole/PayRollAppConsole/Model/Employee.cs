using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PayRollAppConsole.Model
{
    public class Employee
    {
        public String Name {get;set;}
        public DateTime DateOfBirth { get; set; }
        public String Role { get; set; }
        public DateTime StartDate {get;set;}
        public int Salary {get;set;}
    }
}
