# Requêtes Postman

<br>

* ### Ajouter un produit avec la méthode HTTP
    > **url :** *localhost:9000/api/produit* **[POST]**
    
    #### Exemple valide :
    **body :**
    ```json
    {
      "nom": "Cuillère",
      "prix": 10,
      "categorie": {
        "id": 1
      }
    }
    ```
  
    #### Réponse :
    ```json
    {
      "id": 1,
      "nom": "Cuillère",
      "prix": 10.0,
      "categorie": {
        "id": 1,
        "libele": null
      }
    }
    ```

    #### Exemple invalide : 

    **body :**
    ```json
    {
    "nom":"",
    "prix":-4,
    "categorie": {
        "id": 1
      }
    }
    ```

    #### Réponse :
    ```json
    {
      "prix": "le prix doit être positif",
      "nom": "Le nom doit posséder au moins 2 caractères"
    }
    ```

    #### Exemple déjà enregistré
  
    **body :**
    ```json
    {
    "nom":"Cuillère",
    "prix":2,
    "categorie": {
        "id": 1
      }
    }
    ```

    #### Réponse :
    >*{<br>
    **"Erreur" :** "Ce produit existe déjà !"<br>}*

<br>

* ### Afficher tous les produits avec la méthode HTTP
  > **url :** *localhost:9000/api/produits* **[GET]**

    #### Exemple quand des produits sont enregistrés :
    ```json
    [
    {
        "id": 1,
        "nom": "Cuillère",
        "prix": 10.0,
        "categorie": {
            "id": 1,
            "libele": "Cuisine"
        }
    },
    {
        "id": 2,
        "nom": "Chaise",
        "prix": 5.0,
        "categorie": {
            "id": 2,
            "libele": "Mobilier"
        }
    }
    ]
    ```

    #### Exemple quand aucun produit n'existe :
    > *{<br>
    **"Erreur" :** "Aucun produit n'est enregistré !"<br>}*

<br>

* ### Afficher une catégorie par son ID avec la méthode HTTP
  > **url :** *localhost:9000/api/categorie/1* **[GET]**

  #### Exemple quand la catégorie existe :
  ```json
  {
    "id": 1,
    "libele": "Cuisine"
  }
  ```

  #### Exemple quand la catégorie n'existe pas :
  > *{<br>
  **"Erreur" :** "La catégorie avec id : 1 n'existe pas !"<br>}*