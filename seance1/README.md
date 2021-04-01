# Objectifs de la séance :

- Revoir l'essentiel en vue de l'IE du vendredi 2 avril
  - Tableau 1D et 2D
  - Les bases de la POO
  - Retour sur des stratégies pour mieux gérer l'IE

# Notions vues lors de la séances :

## Les tableaux en java :

### Rappels sur les tableaux 1D

Vous avez déjà du voir qu'on pouvait travailler sur des tableaux en java. Un tableau c'est une sorte de liste d'objet.

Pour initialiser un tableau on peut faire :

```java
int[] mon_tableau = new int[TAILLE];
double[] mon_tableau_de_double = new double[TAILLE];
String[] mon_tableau_de_string = {"Coucou", "ceci", "est", "un", "tableau", "de", "string"};
```

Pour afficher un tableau, il faut le parcourir. 

Pour accéder à un élément du tableau on l'appelle par son index. **Attetion, l'indexation commence à 0**.

```java
int[] int_array = {12,32,45,128};
int troisieme_element = int_array[2];
```

Pour parcourir un tableau on utilise une boucle (`while` ou `for`). La plus pratique pour cet usage est la boucle `for`

```java
int[] int_array = {12,32,45,128};

for(int i=0; i<int_array.length; i++){
  System.out.println("Element à l'index "+i+" "+int_array[i]);
}
```

Pour assigner une valeur dans le tableau, on le fait en renseignant l'indice.

```java
// mon_tableau est un tableau d'entier déjà créé avant

mon_tableau[10] = 353; // On met à l'indice 10 la valeur 353, 
```

### Les tableaux 2D

Alors c'est une notion qui fait peur mais il ne faut pas, c'est pas si compliqué que ça. On a rapidement vu qu'un tableau était consititué d'élément d'un certain type. Ces éléments peuvent donc être aussi des tableaux !

Voici un exemple d'initialisation : 

