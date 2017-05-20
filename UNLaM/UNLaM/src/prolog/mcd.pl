%Definir la relaci�n mcd (+X,+Y,?Z) que se verifique si Z
%es el m�ximo com�n divisor entre X e Y.

mcd(X,X,Z):-Z is X,!.
mcd(X,0,Z):-Z is X,!.
mcd(X,Y,Z):-X>Y,M is X-Y,mcd(M,Y,Z1),Z is Z1,!.
mcd(X,Y,Z):-X<Y,M is Y-X,mcd(X,M,Z1),Z is Z1,!.





