num(1).
num(2).
num(3).
tripla(X,Y,Z):-!,num(X),!,num(Y),!,num(Z),!.
%corta el backtrack. prolog eval�a de atr�s hacia adelante.
