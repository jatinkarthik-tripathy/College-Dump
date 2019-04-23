declare 
ssn number;
begin
delete from emp where ssn=&ssn;
dbms_output.put_line('deleted record');
end;
/