entrada(paella).
entrada(gazpacho).
entrada(consom�).

carne(filete_de_cerdo).
carne(pollo_asado).

pescado(trucha).
pescado(bacalao).

postre(flan).
postre(helado).
postre(pastel).

comida(X):-carne(X);pescado(X).

menu(X,Y,Z):-entrada(X),comida(Y),postre(Z).
