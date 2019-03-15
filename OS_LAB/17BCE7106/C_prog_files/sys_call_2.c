//writing to a file
#include<fcntl.h>
#include<errno.h>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(int argc, char** argv){
	int fd, sz;
	fd = open("test2.txt", O_RDWR | O_CREAT | O_APPEND, 0644);
	if(fd<0){
		perror("r1");
		exit(1);
	}
	sz = write(fd, "writing to file\n", strlen("writing to file\n"));
	printf("called write()\n");
	close(fd);
	return 0;
}
