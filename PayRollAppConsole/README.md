# pay-roll-application
Ứng dụng tính lương nhân viên phiên bản 1.0

## Ứng dụng tính lương gồm các tính năng như sau:
1. Đọc vào danh sách nhân viên dạng file CSV gồm các trường: 
  - name: họ tên
  - dob: ngày sinh
  - role: chức vụ [director,manager,sales,engineer,staff,worker]
  - startdate: ngày bắt đầu làm việc ở công ty
  - startsal: mức lương khởi điểm

2. In ra màn hình tính đến ngày hôm nay:
  - Tuổi hiện tại của nhân viên
  - Số năm và tháng làm việc. Làm tròn xuống, 3 năm, 2 tháng 15 ngày --> 3 năm, 2 tháng
  
3. Công thức tăng lương theo thâm niên phiên bản 1.0:
  - Bất kỳ nhân viên nào không quan tâm đến chức vụ, cứ làm đủ 12 tháng là tăng một bậc lương 6% so với mức lương cũ. Cách tính này không cần đến đầu năm mới điều chỉnh.
  - Hãy tính lương tại thời điểm hiện tại của nhân viên

## Công cụ lập trình
1. Visual studio 2019 community https://visualstudio.microsoft.com/vs/community/

## Các yêu cầu để có thể chạy được
1. Phải có Microsoft .NET Framework 4.5 trở lên

## Cách sử dụng
1. Lấy source code về
2. Click vào file `PayRollAppConsole.sln` để mở project
3. Mở file `PayRollAppConsole\Resources\employees.csv` để nhập thông tin theo template có sẵn
4. Click `Ctrl + F5` để run chương trình hoặc `F5` để debug chương trình

## Cách thư viện sử dụng
1. CsvHelper verion 7.0.0 - https://www.nuget.org/packages/CsvHelper/ \
(file dll được đính kèm trong PayRollAppConsole\dll\CsvHelper.dll)

## Tác giả
Đặng Đình Long - Lớp clean code, công ty Luvina

