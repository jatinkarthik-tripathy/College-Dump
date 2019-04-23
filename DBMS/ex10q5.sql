declare
name varchar(25) := '&name';

procedure fn(ename varchar)
is
dname varchar(30);
begin
select department_name into dname from employee natural join dept where first_name=ename;
dbms_output.put_line('The deparment of employee is: '||dname);
end;

begin
fn(name);
end;
/
