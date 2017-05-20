%factorial(X) =
%    1 si X= 0
%    x*factorial(x-1) si x != 0
%fac(0,1):-!.
fac(X,F):-X==0,F is 1,!.
fac(X,F):-X1 is X-1,fac(X1,F1),F is X*F1.
% fac(X,F):-F is X*(X-1),X is X-1.
