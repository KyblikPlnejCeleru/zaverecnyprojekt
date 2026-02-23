# Závěrečný projekt – Textová adventura

## Popis hry

Tato hra je textová adventura napsaná v jazyce Java.
Hráč se pohybuje mezi místnostmi, sbírá předměty, komunikuje s postavami
a snaží se splnit podmínku pro dokončení hry.

Hra probíhá v konzoli a reaguje na textové příkazy.

---

## Herní mechaniky

- Pohyb mezi místnostmi
- Inventář hráče
- Sbírání předmětů
- Interakce s postavami
- Předávání předmětů postavám
- Speciální podmínka pro ukončení hry
- Omezená pomoc (2 pokusy)

---

## Ovládání hry

Hráč zadává příkazy přes konzoli.

### Dostupné příkazy:

| Příkaz | Popis |
|----------|----------|
| inventory | vypíše předměty, které momentálně máš v inventáři |
| jdi {mistnost} | půjdeš do zadané místnosti, pokud tam můžeš |
| mluv {postava} | promluvíš si s postavou (beta verze – postava mluví pouze s tebou) |
| otevrit | ukončí hru, pokud máš kartukodchodu |
| pomoc | můžeš hádat dvakrát |
| pouzij {predmet} | dáš předmět postavě, pokud je ve stejné místnosti a vlastníš požadovaný předmět |
| seber {predmet} | sebereš předmět, pokud se nachází v místnosti |
| ukoncit | tajný příkaz – nezkusíš, nevíš |

---

## Podmínka vítězství

Hra je ukončena příkazem `otevrit`, pokud hráč vlastní předmět `kartukodchodu`.

---

### Spuštění přes .jar

Java 21

Funkční terminál

V terminálu přejděte do složky kde to máte uložené pomocí cd (lokace) a pak tam napište Java -jar untitled3.jar