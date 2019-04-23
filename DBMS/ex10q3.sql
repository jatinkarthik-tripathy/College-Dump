declare
name varchar(25) := '&name';
tot number;

function fn(dname varchar)
return number
is
total number;
begin
select count(ssn) into total from employee natural join dept where department_name=dname;
return total;
end;

begin
tot := fn(name);
dbms_output.put_line('The total num of employee is: '||tot);
end;
/
