#include<stdio.h>
#include<unistd.h>
// pid_t is a datatype which is defined in unistd.h

int main(){
	


pid_t pid = fork();
if(pid<0)
	printf("Fork Failed\n");
else if (pid == 0)
{
	printf("Child Process\n");
	printf("Child Process id = %d\n",getpid());
	while(1);{
		
	}
}
else{
	printf("Parent Process\n");
	printf("Parent Process Id %d\n",getpid());
	wait(NULL);
	// When the child Process is killed then a signal is sent to parent and  then parent process will also get terminated.
	while(1);
}

	return 0;
}
