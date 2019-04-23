begin
for i in (select ssn, first_name, last_name from employee where salary > 1000)
LOOP
dbms_output.put_line(i.ssn ||' '|| i.first_name ||' '|| i.last_name);
END LOOP;
end;
/