postre(flan,80).
postre(helado,50).
postre(tiramisu,110).

prodCart(X,Y):-postre(_,X),postre(_,Y).
seleccion(X,Y):-prodCart(X,Y),X<Y.
proyeccion(X):-seleccion(X,_).
postremaxcaro(Y):-postre(Y,X),not(proyeccion(X)).
postremasbarato(X):-postre(X,Y),not(seleccion(_,Y)).
