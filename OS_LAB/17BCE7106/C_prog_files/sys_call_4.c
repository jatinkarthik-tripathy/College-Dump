#include<stdlib.h>
#include<stdio.h>
void fn1(){
	printf("fn1\n");
}
void fn2(){
	printf("fn2\n");
}
int main(){
	atexit(fn1);
	atexit(fn2);
	return 0;
}


