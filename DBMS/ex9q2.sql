declare 
i number:=1;
n number:=&N;
sum1 number:=0;
begin
while i<=n
loop
sum1 := sum1 + i;
i := i + 2;
end loop;
dbms_output.put_line(sum1);
end;
/
