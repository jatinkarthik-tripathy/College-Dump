clc
clear all
a = 0;
b = 1;
n = input('Enter the number of fn evaluations: ');
l= b-a; 
disp('L: ') 
disp(l)
func = @(x)(25*x^2 + 54/(5*x)) 
for k = 1:n
w1 = a + 0.618*l;
w2 = b - 0.618*l;
f1 = func(min(w1, w2));
f2 = func(max(w1, w2)); 
if f1<f2
b = max(w1, w2); 
else
a = min(w1, w2);
end
l= max(w1, w2) - min(w1, w2)
end
disp('interval is: ') 
disp(a)
disp(b)
