%problema de parcial.
% dados tres numeros, esta funciòn tiene que determinar què tipo de
% triàngulo es.
%
triangulo(A,B,C,Tipo):-A<0;B<0;C<0,Tipo="Inexistente",!.
triangulo(A,B,C,Tipo):-
(   A>B+C;B>A+C;C>B+A),Tipo ="Inexistente",!.
triangulo(A,B,C,Tipo):-A==B,B==C,Tipo = "Equilátero",!.
triangulo(A,B,C,Tipo):-(
    (A==B,B\=C);
    (A==C,B\=C);
    (B==C,A\=C)),Tipo = "Isóceles",!.
triangulo(A,B,C,Tipo):-A\=B,B\=C,C\=A,Tipo = "Escaleno",!.
