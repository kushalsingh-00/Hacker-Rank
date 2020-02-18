//sum of five digits

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n,rem,sum=0;
    scanf("%d", &n);
    //Complete the code to calculate the sum of the five digits on n.
    for(int i=n;i!=0;i=i/10)
    {
        rem=i%10;
        sum=sum+rem;
    }
    printf("%d",sum);

    return 0;
}

