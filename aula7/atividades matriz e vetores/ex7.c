#include <sdtio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	int matriz[3][3];
	int i,j;
	
	
	for(i = 0; i < 3; i++)
		for(j = 0; j < 3; j++)
			matriz[i][j] = rand()%10;
			
	for(i = 0; i < 3; i++){
		for(j = 0; j < 3; j++){
			printf("[%d]", &matriz[i][j]);
		}
		printf("\n");
	}
}
	
