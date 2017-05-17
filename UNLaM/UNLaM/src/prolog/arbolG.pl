hombre(pedro) .
hombre(manuel) .
hombre(arturo) .
mujer(maría).
padre(pedro, manuel).
padre(pedro, arturo).
padre(pedro, maría) .


ninio(X,Y):-hijo(X,Y);hija(X,Y).
hijo(X,Y):-hombre(X),padre(Y,X).
hija(X,Y):-mujer(X),padre(Y,X).
hermano_o_hermana(X,Y):-hermano(X,Y);hermana(X,Y).
hermano(X,Y):-hijo(X,Z),(hijo(Y,Z);hija(Y,Z)),not(X==Y).
hermana(X,Y):-hija(X,Z),(hijo(Y,Z);hija(Y,Z)),not(X==Y).
