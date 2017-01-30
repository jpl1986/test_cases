//Converte Número de minutos em Horas e Minutos:


#include <stdio.h>
#include <conio.h>

void HorasMinutos(int totalmin, int *hor, int *minut ) {
*hor = totalmin/60;
*minut = totalmin%60;
}

int main () {
int tm = 120;
int h = 0;
int m = 0;
HorasMinutos(tm, &h, &m);
printf("horas: %d\nminutos: %d", h, m);

}

