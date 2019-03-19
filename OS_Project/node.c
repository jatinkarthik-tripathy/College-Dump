#include <stdio.h>      
#include <semaphore.h>
#include<string.h>  
#include<stdlib.h>
#include<fcntl.h>
#include<sys/mman.h>
#include <sys/shm.h>
#include <sys/stat.h>

#define SNAME "/sema"

int main(){
	//sem_unlink(SNAME);
	sem_t *sem = sem_open(SNAME, 0);
	int value;
    sem_getvalue(sem, &value);
    printf("%d\n",value);

    char cmd[5];
    
	int size = 4096;
	char *name = "msg";
	char msg[100];
	char *dump;
	int shm_fd;
	void *ptr;

	shm_fd = shm_open(name, O_CREAT|O_RDWR, 0666);
	ftruncate(shm_fd, size);
	ptr = mmap(0, size, PROT_WRITE, MAP_SHARED, shm_fd, 0);
	
	printf("Use 'ii' to insert\n");
	printf("Use 'dd' to display msges\n");
	printf("Use 'qq' to quit\n");
	while(1){
		printf("Enter your command:\n");
		gets(cmd);
		if(!strcmp(cmd, "qq")){
			printf("Exit\n");
			exit(0);
		}else if (!strcmp(cmd, "ii")){
			sem_wait(sem);
			printf("Insert Mode\n");
			gets(msg);
			dump = ("%s\n", (char*)ptr);
			strcat(dump, "\n");
			strcat(dump, msg);
			sprintf(ptr, "%s", dump);
			sem_post(sem);
    		strcpy(cmd," ");
		}else if(!strcmp(cmd, "dd")){
			printf("%s\n", (char*)ptr);
		}
		
	}
	return 0;
}