#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<sys/mman.h>
#include <sys/shm.h>
#include <sys/stat.h>
int main(){
	int size = 4096;
	char *name = "OS";
	char *msg = "hello world";
	int shm_fd;
	void *ptr;
	shm_fd = shm_open(name, O_RDONLY, 0666);
	ftruncate(shm_fd, size);
	ptr = mmap(0, size, PROT_READ, MAP_SHARED, shm_fd, 0);
	printf("%s\n", (char*)ptr);
	return 0;
}