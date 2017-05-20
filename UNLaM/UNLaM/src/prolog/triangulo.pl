%problema de parcial.
% dados tres numeros, esta funci�n tiene que determinar qu� tipo de
% tri�ngulo es.
%
triangulo(A,B,C,Tipo):-A<0;B<0;C<0,Tipo="Inexistente",!.
triangulo(A,B,C,Tipo):-
(   A>B+C;B>A+C;C>B+A),Tipo ="Inexistente",!.
triangulo(A,B,C,Tipo):-A==B,B==C,Tipo = "Equil�tero",!.
triangulo(A,B,C,Tipo):-(
    (A==B,B\=C);
    (A==C,B\=C);
    (B==C,A\=C)),Tipo = "Is�celes",!.
triangulo(A,B,C,Tipo):-A\=B,B\=C,C\=A,Tipo = "Escaleno",!.
