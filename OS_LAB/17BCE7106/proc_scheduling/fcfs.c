#include<stdio.h>  
void findWT(int processes[], int n,   
                          int bt[], int wt[])  
{  
    wt[0] = 0;  
    for (int  i = 1; i < n ; i++ )  
        wt[i] =  bt[i-1] + wt[i-1] ;  
}  
void findTAT( int processes[], int n,   
                  int bt[], int wt[], int tat[])  
{  
    for (int  i = 0; i < n ; i++)  
        tat[i] = bt[i] + wt[i];  
}  
void findAvgT( int processes[], int n, int bt[])  
{  
    int wt[n], tat[n], total_wt = 0, total_tat = 0;  
    findWT(processes, n, bt, wt);  
    findTAT(processes, n, bt, wt, tat);  
    printf("Processes   BT   WT   TAT\n");  
    for (int  i=0; i<n; i++)  
    {  
        total_wt = total_wt + wt[i];  
        total_tat = total_tat + tat[i];  
        printf("   %d ",(i+1)); 
        printf("       %d ", bt[i] ); 
        printf("       %d",wt[i] ); 
        printf("       %d\n",tat[i] );  
    }  
    int s=(float)total_wt / (float)n; 
    int t=(float)total_tat / (float)n; 
    printf("Average waiting time = %d",s); 
    printf("\n"); 
    printf("Average turn around time = %d \n",t);  
}  
int main()  
{  
    int processes[] = { 1, 2, 3};  
    int n = sizeof processes / sizeof processes[0];  
    int  burst_time[] = {2, 7, 4};  
    findAvgT(processes, n,  burst_time);  
    return 0;  
}  