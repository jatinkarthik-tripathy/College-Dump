//read a file using c prog
#include<fcntl.h>
#include<errno.h>
#include<stdio.h>
#include<stdlib.h>
int main(int argc, char** argv){
	char* c;
	int sz, fd;
	c = (char*)malloc(100*sizeof(char));

	fd = open("test2.txt", O_RDONLY);
	if(fd == -1){
		fprintf(stderr, "Error Occured %d\n", errno);
		perror("Program");
		exit(1);
	}

	sz = read(fd, c, 100);
	printf("called read(%d, c, 100), which read %d bytes \n", fd, sz);
	//c[sz]='\0';
	printf("thoese bytes are as follows: %s\n", c);
	close(fd);
	return 0;
}