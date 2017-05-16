esUnPais(argentina).
esUnPais(venezuela).
esUnPais(chile).
esUnPais(brasil).
esUnPais(peru).
esUnPais(bolivia).
esUnPais(paraguay).
esUnPais(uruguay).
esUnPais(colombia).
esUnPais("guayana francesa").

limita_con(argentina,chile).
limita_con(argentina,brasil).
limita_con(argentina,uruguay).
limita_con(argentina,bolivia).
limita_con(argentina,paraguay).
limita_con(brasil,peru).
limita_con(brasil,paraguay).
limita_con(brasil,"guayana francesa").
limita_con(venezuela,brasil).
limita_con(venezuela,colombia).
limita_con(chile,bolivia).
limita_con(bolivia,paraguay).
limita_con(bolivia,peru).

sonLimitrofes(X,Y):-limita_con(X,Y);limita_con(Y,X).
sonTL(X,Y):-sonLimitrofes(X,Z), sonLimitrofes(Z,Y),not(sonLimitrofes(X,Y)),dif(X,Y).


