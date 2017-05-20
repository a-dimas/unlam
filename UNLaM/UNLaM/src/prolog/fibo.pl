%fibonacci(1) = 1
%fibonacci(2) = 1
%fibonacci(x) = fibonacci(x-1) + fibonacci(x-2)
fibo(1,1):-!.
fibo(2,1):-!.
fibo(X,F):-X1 is X-1,X2 is X-2,fibo(X1,F1),fibo(X2,F2),F is F1+F2.
