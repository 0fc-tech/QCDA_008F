package com.example.mod10recyclerview

data class Film(
    val titre:String,
    val resume: String,
    val anneeSortie:Int
){
    companion object{
        val listFilms = arrayListOf(
            Film("Inception", "Un voleur professionnel entre dans les rêves des gens pour voler leurs secrets.", 2010),
            Film("Interstellar", "Des explorateurs voyagent à travers un trou de ver pour assurer la survie de l'humanité.", 2014),
            Film("The Dark Knight", "Batman affronte le Joker, un criminel psychopathe.", 2008),
            Film("Gladiator", "Un général romain se bat pour venger la mort de sa famille.", 2000),
            Film("The Matrix", "Un programmeur découvre que la réalité est une simulation créée par des machines.", 1999),
            Film("Avatar", "Un soldat paraplégique explore une planète extraterrestre par le biais d'un avatar.", 2009),
            Film("Forrest Gump", "L'histoire de la vie incroyable d'un homme simple.", 1994),
            Film("Titanic", "Un récit de la célèbre tragédie du Titanic en 1912.", 1997),
            Film("Star Wars: Episode IV - A New Hope", "Un jeune fermier rejoint la rébellion contre un empire galactique.", 1977),
            Film("Jurassic Park", "Un parc à thème de dinosaures tourne mal.", 1993),
            Film("Pulp Fiction", "Histoires croisées de criminels à Los Angeles.", 1994),
            Film("The Shawshank Redemption", "L'amitié entre deux prisonniers sur plusieurs décennies.", 1994),
            Film("The Godfather", "L'histoire d'une famille mafieuse italo-américaine.", 1972),
            Film("The Lord of the Rings: The Return of the King", "La conclusion épique de la lutte pour la Terre du Milieu.", 2003),
            Film("The Empire Strikes Back", "L'Empire attaque les rebelles dans ce second opus de Star Wars.", 1980),
            Film("Fight Club", "Un homme insatisfait forme un club de combat souterrain.", 1999),
            Film("Goodfellas", "La montée et la chute de gangsters sur plusieurs décennies.", 1990),
            Film("Schindler's List", "L'histoire de la sauvegarde de plus de mille Juifs pendant l'Holocauste.", 1993),
            Film("Fargo", "Une série de crimes maladroits tourne mal dans le Minnesota.", 1996),
            Film("Toy Story", "Les aventures de jouets qui prennent vie quand leurs propriétaires ne sont pas là.", 1995),
            Film("Jaws", "Une plage touristique est terrorisée par un grand requin blanc.", 1975),
            Film("The Big Lebowski", "Un paresseux est pris dans une affaire de rançon compliquée.", 1998),
            Film("The Shining", "Un gardien d'hôtel devient fou dans un hôtel isolé.", 1980),
            Film("Blade Runner", "Un détective futuriste traque des robots rebelles.", 1982),
            Film("Psycho", "Une secrétaire en fuite se retrouve dans un motel étrange.", 1960),
            Film("Casablanca", "Un amour retrouvé dans le contexte de la Seconde Guerre mondiale.", 1942),
            Film("Vertigo", "Un détective souffrant de vertige est pris dans une intrigue complexe.", 1958),
            Film("The Silence of the Lambs", "Une stagiaire du FBI traque un tueur en série avec l'aide d'un autre tueur en série.", 1991),
            Film("Heat", "Un détective traque une équipe de braqueurs de banque professionnels.", 1995),
            Film("Mad Max: Fury Road", "Dans un désert post-apocalyptique, un fugitif aide une femme à échapper à un tyran.", 2015),
            Film("Moonlight", "Un jeune homme afro-américain grandit dans un quartier difficile de Miami.", 2016),
            Film("Whiplash", "Un jeune batteur de jazz et son instructeur impitoyable.", 2014),
            Film("The Revenant", "Un chasseur lutte pour survivre après avoir été laissé pour mort dans la nature.", 2015),
            Film("La La Land", "L'histoire d'amour entre un musicien de jazz et une actrice à Los Angeles.", 2016),
            Film("Get Out", "Un jeune homme afro-américain rencontre la famille de sa petite amie blanche.", 2017),
            Film("Slumdog Millionaire", "Un jeune homme des bidonvilles de Mumbai participe à la version indienne de \"Qui veut gagner des millions ?\".", 2008),
            Film("Birdman", "Un acteur déchu tente de monter une pièce de théâtre à Broadway.", 2014),
            Film("Black Swan", "Une ballerine sombre dans la folie en jouant le rôle principal dans \"Le Lac des Cygnes\".", 2010),
            Film("The Grand Budapest Hotel", "Les aventures d'un concierge et d'un groom dans un célèbre hôtel européen.", 2014)
        )
    }
}
