#include<sys/types.h>
#include <stdio.h>
#include <unistd.h>
#include <string.h>
#include<stdlib.h>
int main(){
	int buf_size = 50;
	int read_end = 0;
	int write_end = 1;
	char w_msg[] = "hello world";
	char r_msg[buf_size];
	int fd[2];
	if(pipe(fd)==-1){
		fprintf(stderr, "PIPE FAILED\n");
	}

	pid_t pid;
	pid = fork();
	if(pid<0){
		fprintf(stderr, "FORK FAILED\n");
	}else if(pid == 0){
		close(fd[read_end]);
		write(fd[write_end], w_msg, strlen(w_msg)+1);
		close(fd[write_end]);
		exit(0);
	}else if (pid > 0){
		close(fd[write_end]);
		read(fd[read_end], r_msg, buf_size);
		printf("%s\n", r_msg);
		close(fd[read_end]);
	}
	return 0;
}