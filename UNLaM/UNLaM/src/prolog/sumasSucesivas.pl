%Codifique en prolog las reglas necesarias para obtener el producto de dos numeros  X e Y,  aplicando sumas sucesivas.
%
prodss(0,0,0):-!.
prodss(X,Y,R):-X1 is X-1,prodss(X1,Y,R),R is R+Y.
