package com.example.smultronstallen

object DataManager {
    val placeList = mutableListOf<Place>()

    init {
        addPlaces()
    }


    fun addPlaces(){
        placeList.add(Place("Kosterhavet National Park", kosterhavet ))
        placeList.add(Place("Marstrand", marstrand))
        placeList.add(Place("Malmö", malmo))
    }

    val kosterhavet = "Sweden has lots of coastline, no doubt about that, \n" +
            " but the best place to observe marine line under protected circumstances \n" +
            " is Kosterhavet National Park. Kosterhavet, which borders Norway, \n" +
            " is the country’s first marine national park. \n" +
            " With 6,000 species of marine life, the park is home \n" +
            "to several species that can’t be found anywhere else in Sweden.\n" +
            " The park is centered around the shores and sea of the Koster Islands.\n" +
            " Kosterhavet’s coral reefs make it popular with snorkelers and divers,\n" +
            " while landlubbers can enjoy quaint fishing villages waiting \n" +
            " to be turned into picture postcards."

    val marstrand = "Marstrand, a city since 1200, is known for two things: \n" +
            " sailing and an old fortress. This seaside community, located on\n" +
            " an island in western Sweden, hosts the annual Match Cup Sweden,\n" +
            " an important sailing competition. It also is home to the 17th century\n" +
            " Carlsten Fortress, a majestic stone structure that guards the city.\n" +
            " Visitors describe Marstrand, which makes a good day trip from Gothenburg,\n" +
            " as a “Kodak moment” so be prepared to take lots of pictures of the ornate,\n" +
            " pastel-colored historic buildings that line cobblestone streets.\n" +
            " Other “don’t miss” attractions include the Strandverket Art Museum,\n" +
            " the restored Pater Noster Lighthouse, and scenic hiking trails."

    val malmo = "Something old, something new is perhaps the best way to describe Malmo,\n" +
            " a medieval historic city with a landscape that’s studded with modern,\n" +
            " contemporary buildings. Sweden’s third largest city has a marvelous\n" +
            " Old Town (Gamla Stoden) with three main squares: Stortoget, Lilla Torg\n" +
            " and Gustav Adolfs Torg. Old Town is also where you’ll find the castle Malmohus Slott.\n" +
            " This multicultural city, with 150 ethnicities, is linked via Oresund Bridge to Denmark.\n" +
            " A must-see “new” attraction is the Turning Torso, an architectural masterpiece \n" +
            "that twists more than 190 meters (600 feet) into the sky,\n" +
            " making it Sweden’s most talked about building."
}