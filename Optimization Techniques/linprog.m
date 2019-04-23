clear all;
clc;
f=[7 5]
A=[-4 -3;-2 -1]
b=[-240 -100]
[X, F]=linprog(f,A, b)
