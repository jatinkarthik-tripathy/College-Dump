//open a file using c prog
#include<fcntl.h>
#include<errno.h>
#include<stdio.h>
int main(int argc, char** argv){
	int fd;
	fd = open("test.txt", O_RDONLY);
	printf("%d\n", fd);
	if(fd == -1){
		fprintf(stderr, "Error Occured %d\n", errno);
		perror("Program");
	}else{
		printf("file opened\n");
	}
	close(fd);
	return 0;
}