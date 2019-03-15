#include <stdio.h> 
#include <pthread.h> 
#include <unistd.h> 

int S = 1;
void wait(int *S){
    printf("Thread entering wating, Semaphore val: %d\n", *S);
    while(*S<=0);
    *S = *S - 1 ;
    printf("Thread exiting wating, Semaphore val: %d\n", *S);
}
void signal(int *S){
    printf("Thread entering signal, Semaphore val: %d\n", *S);
    *S = *S + 1;
    printf("Thread exiting signal, Semaphore val: %d\n", *S);
}
void* thread(void* arg) 
{ 
    //wait 
    wait(&S);
    printf("\nEntered..\n"); 
  
    //critical section 
    sleep(4); 
      
    //signal 
    printf("\nJust Exiting...\n"); 
    signal(&S);
} 
  
  
int main() 
{ 
    pthread_t t1,t2; 
    pthread_create(&t1,NULL,thread,NULL); 
    sleep(2); 
    pthread_create(&t2,NULL,thread,NULL); 
    pthread_join(t1,NULL); 
    pthread_join(t2,NULL); 
    return 0; 
} 