DECLARE
mark1 number:=&mark1;
mark2 number:=&mark2;
mark3 number:=&mark3;
avg1 number;
grade char(1);
BEGIN
avg1 := (mark1 + mark2 + mark3)/3;
CASE  
WHEN avg1>90 THEN grade:='S';
WHEN avg1>80 THEN grade:='A';
WHEN avg1>70 THEN grade:='B';
WHEN avg1>60 THEN grade:='C';
WHEN avg1>50 THEN grade:='D';
ELSE grade:='F';
END CASE;
dbms_output.put_line('Grade: '||grade);
END;
/