/*
	Determine the output of the code snippet that uses the 		uppercase conversion characters in the printf
	function.
*/

#include <stdio.h>
int main()
{
	int a = 0x80ec;
	float b = 0.3e-12;
	printf(":%#4x: :%#10.2e:\n", a, b);
	printf(":%#4X :%#10.2E:\n", a, b);
	return 0;
}
