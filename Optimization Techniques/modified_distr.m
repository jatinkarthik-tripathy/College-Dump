clc
clear all
m = 4;
n = 5;
x = zeros(m,n);
A = [13 16 19 17 250;17 19 16 25 200;25 27 17 16 250;100 250 250 100 700]

rsum = 0;
csum = 0;
for i=1:m-1
rsum = rsum+A(i,n);
end
for j=1:n-1
csum = csum+A(m,j);
end
rsum
csum
C = 0;
if(rsum == csum)
for i=1:m
for j=1:n
x11=min(A(i,n),A(m,j));
x(i,j)=x11;
A(i,n)=A(i,n)-x11;
A(m,j)=A(m,j)-x11;
end
end
else
display("Unbalanced Transportation Problem");
end
total_cost = 0;
for i=1:m
for j=1:n
total_cost = total_cost+A(i,j)*x(i,j);
end
end
a=1;
b=0;
u=zeros(1,m-1);
v=zeros(n-1,1);
u(1)=0;
for i=1:m-1
for j=1:n-1
if(x(i,j)==0)
continu	e
else
if(j==b+1)
v(j)=A(i,j)-u(i);
b=j;	
else
u(i)=A(i,j)-v(j);
end
end	
end
end
final_cost=0;
for i=1:m-1
for j=1:n-1
final_cost=final_cost+A(i,j)*x(i,j);
end
end
final_cost
