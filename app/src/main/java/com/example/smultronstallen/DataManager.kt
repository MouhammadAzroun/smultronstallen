package com.example.smultronstallen

object DataManager {
    val placeList = mutableListOf<Place>()

    val kosterhavet : String= "Sweden has lots of coastline, no doubt about that," +
            " but the best place to observe marine line under protected circumstances" +
            " is Kosterhavet National Park.\n" +
            "Kosterhavet, which borders Norway," +
            " is the country’s first marine national park. \n" +
            "With 6,000 species of marine life, the park is home" +
            "to several species that can’t be found anywhere else in Sweden.\n" +
            "The park is centered around the shores and sea of the Koster Islands.\n" +
            "Kosterhavet’s coral reefs make it popular with snorkelers and divers," +
            " while landlubbers can enjoy quaint fishing villages waiting" +
            " to be turned into picture postcards." +
    "Sweden has lots of coastline, no doubt about that," +
    " but the best place to observe marine line under protected circumstances" +
    " is Kosterhavet National Park.\n" +
    "Kosterhavet, which borders Norway," +
    " is the country’s first marine national park. \n" +
    "With 6,000 species of marine life, the park is home" +
    "to several species that can’t be found anywhere else in Sweden.\n" +
    "The park is centered around the shores and sea of the Koster Islands.\n" +
    "Kosterhavet’s coral reefs make it popular with snorkelers and divers," +
    " while landlubbers can enjoy quaint fishing villages waiting" +
    " to be turned into picture postcards." +
            "Sweden has lots of coastline, no doubt about that," +
            " but the best place to observe marine line under protected circumstances" +
            " is Kosterhavet National Park.\n" +
            "Kosterhavet, which borders Norway," +
            " is the country’s first marine national park. \n" +
            "With 6,000 species of marine life, the park is home" +
            "to several species that can’t be found anywhere else in Sweden.\n" +
            "The park is centered around the shores and sea of the Koster Islands.\n" +
            "Kosterhavet’s coral reefs make it popular with snorkelers and divers," +
            " while landlubbers can enjoy quaint fishing villages waiting" +
            " to be turned into picture postcards." +
            "Sweden has lots of coastline, no doubt about that," +
            " but the best place to observe marine line under protected circumstances" +
            " is Kosterhavet National Park.\n" +
            "Kosterhavet, which borders Norway," +
            " is the country’s first marine national park. \n" +
            "With 6,000 species of marine life, the park is home" +
            "to several species that can’t be found anywhere else in Sweden.\n" +
            "The park is centered around the shores and sea of the Koster Islands.\n" +
            "Kosterhavet’s coral reefs make it popular with snorkelers and divers," +
            " while landlubbers can enjoy quaint fishing villages waiting" +
            " to be turned into picture postcards."

    val marstrand: String = "Marstrand, a city since 1200, is known for two things: \n" +
            "sailing and an old fortress. This seaside community, located on" +
            " an island in western Sweden, hosts the annual Match Cup Sweden," +
            " an important sailing competition.\n" +
            "It also is home to the 17th century" +
            " Carlsten Fortress, a majestic stone structure that guards the city.\n" +
            "Visitors describe Marstrand, which makes a good day trip from Gothenburg," +
            " as a “Kodak moment” so be prepared to take lots of pictures of the ornate," +
            " pastel-colored historic buildings that line cobblestone streets.\n" +
            "Other “don’t miss” attractions include the Strandverket Art Museum," +
            " the restored Pater Noster Lighthouse, and scenic hiking trails."

    val malmo : String = "Something old, something new is perhaps the best way to describe Malmo," +
            " a medieval historic city with a landscape that’s studded with modern," +
            " contemporary buildings.\n" +
            "Sweden’s third largest city has a marvelous" +
            " Old Town (Gamla Stoden) with three main squares: Stortoget, Lilla Torg" +
            " and Gustav Adolfs Torg.\n" +
            "Old Town is also where you’ll find the castle Malmohus Slott.\n" +
            "This multicultural city, with 150 ethnicities, is linked via Oresund Bridge to Denmark.\n" +
            "A must-see “new” attraction is the Turning Torso, an architectural masterpiece" +
            " that twists more than 190 meters (600 feet) into the sky," +
            " making it Sweden’s most talked about building."

    init {
        addPlaces()
    }


    fun addPlaces(){
        placeList.add(Place("Kosterhavet National Park", kosterhavet))
        placeList.add(Place("Marstrand", marstrand))
        placeList.add(Place("Malmö", malmo))
    }
}