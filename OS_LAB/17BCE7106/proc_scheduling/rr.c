#include<stdio.h> 
int main() 
{ 
 
  int count,j,n,time,remaining,flag=0,tq; 
  int wt=0,tat=0,at[10],bt[10],rt[10]; 
  printf("Enter Total Process:\t "); 
  scanf("%d",&n); 
  remaining=n; 
  for(count=0;count<n;count++) 
  { 
    printf("Enter Arrival Time and Burst Time for Process Number %d: ",count+1); 
    scanf("%d",&at[count]); 
    scanf("%d",&bt[count]); 
    rt[count]=bt[count]; 
  } 
  printf("Enter Time Quantum:\t"); 
  scanf("%d",&tq); 
  printf("\n\nProcess\t|Turnaround Time|Waiting Time\n\n"); 
  for(time=0,count=0;remaining!=0;) 
  { 
    if(rt[count]<=tq && rt[count]>0) 
    { 
      time+=rt[count]; 
      rt[count]=0; 
      flag=1; 
    } 
    else if(rt[count]>0) 
    { 
      rt[count]-=tq; 
      time+=tq; 
    } 
    if(rt[count]==0 && flag==1) 
    { 
      remaining--; 
      printf("P[%d]\t|\t%d\t|\t%d\n",count+1,time-at[count],time-at[count]-bt[count]); 
      wt+=time-at[count]-bt[count]; 
      tat+=time-at[count]; 
      flag=0; 
    } 
    if(count==n-1) 
      count=0; 
    else if(at[count+1]<=time) 
      count++; 
    else 
      count=0; 
  } 
  printf("\nAverage Waiting Time= %f\n",wt*1.0/n); 
  printf("Avg Turnaround Time = %f",tat*1.0/n); 
  printf("\n");
  return 0; 
}