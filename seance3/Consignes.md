# Consignes

1. Créer une classe Test.java qui sera votre main. C'est le fichier dans lequel vous allez tester vos fonctions

2. Créer une classe Point.java. Cette classe contient les coordonnées d'un point. Les attributs seront privés[^private].

  ```java
  int x;
  int y;
  ```

  

3. Il sera possible de créer un point de la manière suivante dans le main : 

  

```java
Point p1 = new Point(0,1); // Creates a new point with x=0 and y=1
Point p2 = new Point(); 

System.out.println(p2); // Returns : (0,0)

```

4. Créer une fonction qui permet de vérifier l'égalité entre 2 points.
   
5. Créér un objet Bateau qui a un nom, des coordonnées (venant de la classe point) et une taille.

   Depuis le main on peut créer des bateaux comme ça :


   ```java
   Bateau b1 = new Bateau();
   Point p1 = new Point(2,3);
   Bateau b2 = new Bateau("Bateau 2", p1, 4);
   Bateau b3 = new Bateau("Bateau 3", 0, 2, 3); // Avec x=0, y=2 et taille = 3
   ```

   

6. Dans le main, créer plusieurs bateaux, pour chaque bateau afficher ses coordonées, son nom et sa taille.

   ### On commence on considérant des bateaux de taille = 1

7. Créer des méthodes de déplacement du bateau qui permettent de déplacer le bateau horizontalement ou verticalement et qui retourne les nouvelles coordonnées du bateau. Le déplacement déplacera le bateau de n en avant ou en arrière suivant l'axe choisi.

   Exemple d'appel des méthodes depuis le main: 

   

   ```java
   bateau1.deplacerX("avancer", 2); // Avance le bateau de 2 => new coo de x = x+2
   bateau1.deplacerY("reculer", 1); // Recule le bateau de 1 => new coo de y = y-1
   ```
   
   ### On considère maintenant des bateaux de tailles variables
   
8. Effectuer les changements nécessaires pour gérer des bateaux de tailles variables. Pour ce faire on utilisera la taille (nombre de points permettant de représenter la bateau) et la coordonnée utilisée à la création du bateau sera considèrée comme une extrémité.

   1. Adapter la structure des attributs[^indice]
   2. Créer des getters et setters appropriés : ```getCoordonnees(int indice)``` par exemple
   3. Créer un getter/setter pour gérer la coordonnée d'origine (celle donnée à la création d'un bateau) ```getOriginCoordonnees()```.
   4. Créer une méthode ayant cette signature : ```public void defineCoordonneesFromOrigin()```. Elle permet de déterminer les coordonnées des autres points
   5. Mettre à jour les méthodes nécessaire (ex ```deplacerX```)

9. On ajoute une orientation à notre bateau : Vertical ou Horizontal. Mettre en place les mécanismes nécessaires pour créer un bateau (de n'importe quelle taille) respectant son orientation. L'orientation par defaut du bateau sera l'orientation horizontale.

   1. Mettre à jour les constructeurs

   2. Gérer les getters / setters

   3. Mettre à jour ```defineCoordonneesFromOrigin```

      

   ### La prochaine fois si on a pas le temps :

10. Mettre en place une classe qui permet de visualiser les bateaux dans une grille de taille NxN.

    

[^private]: Il faut bien penser à créer des getters et setters dans ce cas
[^indice]: Créer un tableau avec toutes les coordonnées de tous les points