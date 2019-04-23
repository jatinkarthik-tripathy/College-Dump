clc

tic
wts = [11 13 17 14 ; 16 18 14 10 ; 21 24 3 10]; dmd = [200; 225; 275; 250];

avlb = [250; 300; 400];

X = zeros(size(wts))
avlb_size = size(avlb)

dmd_size = size(dmd)
if(sum(avlb)==sum(dmd))

for i=1:avlb_size
for j=1:dmd_size

X(i,j)=min(avlb(i), dmd(j));
avlb(i)=avlb(i)-X(i,j);

dmd(j)=dmd(j)-X(i,j);
avlb

dmd
end

end
else

disp('Ünbalanced TP');
end

disp('X table');
disp(X)

[m, n] = size(X);
tot_cost=0;

for i=1:m
for j=1:n

tot_cost=tot_cost + (X(i, j)*wts(i, j));
end

end
disp('total cost')
disp(tot_cost)

toc
