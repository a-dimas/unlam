parcial1(ana,7).
parcial1(juan,4).
parcial1(jose,3).
parcial1(john,10).
parcial2(ana,9).
parcial2(juan,8).
parcial2(jose,3).

promociona(ALUMNO):-parcial1(ALUMNO,NOTA1),parcial2(ALUMNO,NOTA2),NOTA1>=7,NOTA2>=7.
cursada(ALUMNO):-parcial1(ALUMNO,NOTA1),parcial2(ALUMNO,NOTA2),NOTA1>=4,NOTA2>=4,(NOTA1+NOTA2)/2=<7.
recursa(ALUMNO):-parcial1(ALUMNO,NOTA1),parcial2(ALUMNO,NOTA2),(NOTA1<4;NOTA2<4).
prodCart(X,Y):-numero(X),numero(Y).
numero(1).
numero(2).
numero(3).
seleccion(X,Y):-prodCart(X,Y),X<Y.
proyeccion(X):-seleccion(X,_).
maximo(X):-numero(X),not(proyeccion(X)).

minimo(X):-numero(X),not((prodCart(X,Y),X>Y)).