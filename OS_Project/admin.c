#include <stdio.h>      
#include <semaphore.h>  
#include<stdlib.h>
#include<fcntl.h>
#include<sys/mman.h>
#include <sys/shm.h>
#include <sys/stat.h>

#define SNAME "/sema"

int main(){
	sem_unlink(SNAME);
	sem_t *sem = sem_open(SNAME, O_CREAT, 0666, 1);
	int value;
    sem_getvalue(sem, &value);
    printf("%d\n",value);
    //	atexit(unlink);
    int size = 4096;
	char *name = "msg";
	int shm_fd;
	void *ptr;
	shm_fd = shm_open(name, O_CREAT|O_RDWR, 0666);
	ftruncate(shm_fd, size);
	ptr = mmap(0, size, PROT_WRITE, MAP_SHARED, shm_fd, 0);
	sprintf(ptr, "%s", "");
    return 0;
}