begin
delete from emp where trunc((sysdate-birthday)/365))>60;
dbms_output.put_line('deleted record');
end;
/