Feature: account
	mettre au point des classes permettant de retirer de l' argent d' un distributeur
	on doit pouvoir retirer de l' argent si le distributeur possede les coupures  necessaires


Scenario: retrait simple
	Given le distributeur possede au moins 1 billet de 20
	When je demande 20
	Then le distributeur me donne 20
	And le solde de billets de 20 a diminue de 1

	
Scenario: plus de billet
given le distributeur n' a plus de billet
when je demande 20
then le distributeur renvoie une erreur

Scenario: probleme coupures
given le distributeur n'a que des billets de 20
when je demande 10
then le distributeur renvoie une erreur

Scenario: coupures
given le distributeur possede des billets toutes les coupures
when je demande 30
then le solde de billets de 20 a diminue de 1
and le solde de billets de 10 a diminue de 1
and le distributeur me donne 30