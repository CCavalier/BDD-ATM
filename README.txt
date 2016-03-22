Projet pedagogique afin de presenter la librairie Cucumber

Step 1 - ajouter le scenario pour l' addition
  Scenario: Add two simple numbers.
  	Given two simple numbers 2 and 3
  	When I add them
  	Then the result is 5
  	
  Step 2 - Decommenter l' annotation sur la classe RunCukes
  La librairie cucumber est alors active
  
  Step 3 - Lancer le build maven OU l' execution du test dans JUnit
  les structures de methodes sont generes
  Copier/coller les signatures de methodes dans une nouvelle classe computeTest et corriger les imports (ctrl+shift+up sous eclipse)
  
  Step 4 - rediger des tests pertinents dans la classe compute test
  
  Step 5- executer comme junit la classe runCukes
  	Le scenario est automatiquement execute
  	il ne reste plus qu' a implementer la methode afin que celui ci passe au vert
  	
  
Exemple de Substract (démo)
Exemple de Multiply (hands on)

Sujet:
mettre au point des classes permettant de retirer de l' argent d' un distributeur
on doit pouvoir retirer de l' argent si le distributeur possede les coupures  necessaires