declare
cursor emp_c is select * from employee natural join dept; 
begin
for i in emp_c
LOOP
dbms_output.put_line(i.ssn ||' '|| i.first_name ||' '|| i.last_name || ' ' || i.department_name);
END LOOP;
end;
/