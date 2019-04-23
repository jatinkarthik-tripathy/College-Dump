declare
num varchar2(5):=&num;			 
len number(2);			 
revnum varchar2(5);		 

begin
len := length(num);				 
for i in reverse 1.. len 
loop 	 
revnum := revnum || substr(num,i,1); 
end loop; 

dbms_output.put_line('given number ='|| num); 
dbms_output.put_line('reverse number ='|| revnum); 
end;						 
/