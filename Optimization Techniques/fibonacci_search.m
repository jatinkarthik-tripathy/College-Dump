clc
clear all
a = input('Enter lower bound: ');
b = input('Enter upper bound: ');
n = input('Enter the number of fn evaluations: ');
l= b-a; 
disp('L: ') 
disp(l) 
for k = 2:n
lk = (fibonacci(n+1-k+1)/fibonacci(n+2))*l; x1 = a + lk;
x2 = b - lk;
f1 = min(x1, x2)^2 + 54/min(x1, x2)
f2 = max(x1, x2)^2 + 54/max(x1, x2)
if f1<f2
b = max(x1, x2); 
else
a = min(x1, x2); 
end
end
disp('interval is: ')
disp(a)
disp(b)
