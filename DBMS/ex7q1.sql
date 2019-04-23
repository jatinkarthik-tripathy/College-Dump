declare
num number;
sal number;
begin
select salary into sal from employee where ssn=&num;
dbms_output.put_line('the salary is:' || sal);
end;
/