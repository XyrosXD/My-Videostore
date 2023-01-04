fun main() {
    // Meine kleine Videothek :)

    // Das Sortiment: (Liste)

    var filmeAngebot = mutableListOf<String>(
        "Der Herr der Ringe Trilogie",
        "Der Hobbit Trilogie",
        "Blow",
        "The Gentleman",
        "Transporter Trilogie",
        "Guardians of the Galaxy 1 & 2",
    )

    // Die Preise (Liste)

    var filmePreise = mutableListOf<Double>(
        10.99,
        14.99,
        7.99,
        12.99,
        9.99,
        18.99,
    )

    // Die Begrüßung

    println("Bitte geben Sie hier ihren Namen ein:")
    var kundenName = readln()

    println("Hallo $kundenName, willkommen in meiner Videothek: Galaxy\n")
    println("Aktuell kann ich dir folgende Filme anbieten:")

    println("${filmeAngebot[0]} für ${filmePreise[0]} €")
    println("${filmeAngebot[1]} für ${filmePreise[1]} €")
    println("${filmeAngebot[2]} für ${filmePreise[2]} €")
    println("${filmeAngebot[3]} für ${filmePreise[3]} €")
    println("${filmeAngebot[4]} für ${filmePreise[4]} €")
    println("${filmeAngebot[5]} für ${filmePreise[5]} €\n")

    // Den Kunden bedienen :: unser bestes Angebot

    var guenstigsterFilm = filmePreise.indexOf(filmePreise.min())
    var guenstigsterFilmName = filmeAngebot[guenstigsterFilm]
    var guenstigsterFilmPreis = filmePreise[guenstigsterFilm]

    println("Aktuell ist unser bestes Angebot der Film $guenstigsterFilmName für $guenstigsterFilmPreis €\n")

    // Den Kunden bedienen :: einen Film auswählen

    println("Welcher Film darf es denn sein?")
    println("Bitte gib den Namen des Films hier ein:")

    var warenkorb =  readln()
    var warenkorbName =  filmeAngebot.indexOf(warenkorb)
    var warenkorbPreis = filmePreise[warenkorbName]

    println("Also der Film: $warenkorb für $warenkorbPreis €\n")

    // Den Kunden bedienen :: den Film bezahlen

    println("Wie viel Geld hast du?")
    println("Bitte gib den Betrag hier ein:")

    val bargeld = readln().toDouble()
    var wechselgeld = bargeld - warenkorbPreis

    println("Vielen Dank, du hast den Film $warenkorb für $warenkorbPreis € gekauft")
    println("Du hast mir $bargeld € gegeben und bekommst $wechselgeld € zurück.\n")

    println("Danke für den Einkauf $kundenName ich freue mich schon auf deinen nächsten Besuch :wink:\n")

    // Den Film aus Angebot löschen

    filmeAngebot.remove(warenkorb)
    filmePreise.remove(warenkorbPreis)

    // Das Angebot aktualisieren

    filmeAngebot.add(0,"The Badman")
    filmePreise.add(0,19.99)

    // ----------------------------------------------------------------------------

    // Die Begrüßung neuer Kunde

    println("Bitte geben Sie hier ihren Namen ein:")
    var kundenName1 = readln()

    println("Hallo $kundenName1, willkommen in meiner Videothek: Galaxy\n")
    println("Aktuell kann ich dir folgende Filme anbieten:")

    println("${filmeAngebot[0]} für ${filmePreise[0]} €")
    println("${filmeAngebot[1]} für ${filmePreise[1]} €")
    println("${filmeAngebot[2]} für ${filmePreise[2]} €")
    println("${filmeAngebot[3]} für ${filmePreise[3]} €")
    println("${filmeAngebot[4]} für ${filmePreise[4]} €")
    println("${filmeAngebot[5]} für ${filmePreise[5]} €\n")

    // Den neuen Kunden bedienen :: unser bestes Angebot

    var guenstigsterFilm1 = filmePreise.indexOf(filmePreise.min())
    var guenstigsterFilmName1 = filmeAngebot[guenstigsterFilm1]
    var guenstigsterFilmPreis1 = filmePreise[guenstigsterFilm1]

    println("Aktuell ist unser bestes Angebot der Film $guenstigsterFilmName1 für $guenstigsterFilmPreis1 €\n")

    // Den neuen Kunden bedienen :: einen Film auswählen

    println("Welcher Film darf es denn sein?")
    println("Bitte gib den Namen des Films hier ein:")

    var warenkorb1 =  readln()
    var warenkorbName1 =  filmeAngebot.indexOf(warenkorb1)
    var warenkorbPreis1 = filmePreise[warenkorbName1]

    println("Also der Film: $warenkorb1 für $warenkorbPreis1 €\n")

    // Den Kunden bedienen :: den Film bezahlen

    println("Wie viel Geld hast du?")
    println("Bitte gib den Betrag hier ein:")

    val bargeld1 = readln().toDouble()
    var wechselgeld1 = bargeld1 - warenkorbPreis1

    println("Vielen Dank, du hast den Film $warenkorb1 für $warenkorbPreis1 € gekauft")
    println("Du hast mir $bargeld1 € gegeben und bekommst $wechselgeld1 € zurück.\n")

    println("Danke für den Einkauf $kundenName1 ich freue mich schon auf deinen nächsten Besuch :wink:\n")

    // Den Film aus Angebot löschen

    filmeAngebot.remove(warenkorb1)
    filmePreise.remove(warenkorbPreis1)

    // ----------------------------------------------------------------------------

    // Das Sortiment & Die Preise (Map)

    val derBestand: MutableMap<String, Double> = mutableMapOf(
        "Der Herr der Ringe Trilogie" to 10.99,
        "Der Hobbit Trilogie" to 14.99,
        "Blow" to 7.99,
        "The Gentleman" to 12.99,
        "Transporter Trilogie" to 9.99,
        "Guardians of the Galaxy 1 & 2" to 18.99,
    )

    // Neuer Artikel hinzufügen (Map)

    derBestand["The Badman"] = 19.99


}