#include<sys/types.h>
#include<stdio.h>
int main(){
	pid_t pid;
	pid=fork();
	if(pid==0){
		execlp("/bin/ls", "ls", NULL);
	}else{
		wait(NULL);
		printf("parent block\n");
	}
	return 0;
}