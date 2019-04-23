clc
clear all

tic;
A=[-6 -8 1 0; -7 -12 0 1]

B=[-100; -120]
CB=[0 0]

CJ=[-12 -20 0 0]
display("initial table")

Au=[B A];
[m n]=size(Au);

display("Size = "+m+" "+n)
for i=1:3

disp("Iteration "+ i)
Au

for a=1:n-1
Z(a)=CB*Au(:,a+1);

end
for j=1:n-1

X(j)=Z(1,j)-CJ(j);
end

if(min(X)<0)
disp("Dual Simplex cannot be used here!!!!!!!!")

disp(Au) ;
break;

end
if(min(X)>=0 && min(B)>=0)

disp("Optimal solution found!!")
disp(Au) ;

break;
end

[Q pr]=min(Au(:,1))

for k=1:n-1
if Au(pr,k+1)<0

ratio(k)=X(1,k)/Au(pr,k+1);
else

ratio(k)=-1000000;
end

end
[S pc]=max(ratio);

div=Au(pr,pc+1);

Au(pr,:)=Au(pr,:)/div;

for l=1:pr-1

Au(l,:)=Au(l,:)-(Au(l,pc+1)*Au(pr,:));
end
for o=pr+1:m

Au(o,:)=Au(o,:)-(Au(o,pc+1)*Au(pr,:))

end

Au
CB(pr)=CJ(pc)

for b=1:m
B(b,1)=Au(1,b)

end
end

toc
