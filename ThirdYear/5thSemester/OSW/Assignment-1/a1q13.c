/*13. C supports several assignment operators. The most commonly used assignment operator is =. Assign-
ment expressions that make use of this operator are written in the form identifier = expression,
where identifier generally represents a variable, and expression represents a constant, a vari-
able or a more complex expression. Determine the expression values assume that i is an integer-type
variable, and that the ASCII character set applies.*/

#include<stdio.h>
int main(){
	int x ,y;
	scanf("%d %d",&x,&y);
	
	int i;
	i=('x'-'o')/3;
	i = ('x'-'o')/3;
	i=('y'-'o')/3;
	
	int j = 5;
	
	i=2*j/2;
	i=2*(j/2);
	i=3.0;
	i=-3.5;
	
	printf("%d",i);
	return 0;
}
