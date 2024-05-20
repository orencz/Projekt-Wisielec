# 2. Gra w wisielca

# Instrukcja uruchomiania gry
1. Utwórz folder w którym będą się znajdować pliki `GameUI.java`, `HangmanGame.java`, `WordManager.java`.
2. Stwórz plik `words.txt` z przynajmniej dziesięcioma słowami w folderze gdzie znajdują się powyższe pliki. - jest to zbędne jeżeli już posiadasz taki plik.
3. Utwórz folder w visual studio code lub w innym tego typu programie.
4. Potrzebne jest rozszerzenie `Extension pack for java` (podczas pierwszego uruchamiania powinno w visual studio code pokazać się w prawym dolnym rogu komunikat z możliwością zainstalowania rozszerzenia).
5. Kompiluj program będąc w pliku `GameUI.java`.

# Instrukcja gry
1. Wpisuj pojedyńcze litery (maksymalnie można popełnić 6 błędów).
2. Żeby sprawdzić pojedyńczą literę trzeba kliknać na klawiaturze klawiasz "Enter".
3. Postępuj zgodnie z instrukcjami na ekranie.

# Lista i krótki opis zaimplementowanych funkcjonalności 
1. Wprowadzanie Słowa - Użytkownik może zdecydować, czy chce wprowadzić własne słowo do odgadnięcia, czy wylosować je z listy `words.txt`.
2. Losowanie Słowa - Jeśli użytkownik zdecyduje się na losowanie słowa, gra korzysta z klasy WordManager do pobrania losowego słowa z tablicy dostępnych słów.
3. Zgadywanie Liter - Użytkownik wprowadza litery, które są sprawdzane pod kątem występowania w słowie do odgadnięcia. Odgadnięte litery są uzupełniane w odpowiednich miejscach w słowie.
4. Śledzenie Odgadniętych Liter - Program śledzi litery, które zostały już odgadnięte, aby uniknąć wielokrotnego zgadywania tej samej litery.
5. Ograniczona Liczba Prób - Użytkownik ma 6 prób, aby odgadnąć całe słowo. Za każdą niepoprawną literę liczba prób zmniejsza się.
6. Sprawdzanie Wygranej - Gra sprawdza, czy użytkownik odgadł całe słowo. Jeśli wszystkie litery zostaną poprawnie odgadnięte, gra zostaje wygrana.
7. Sprawdzanie Przegranej - Gra sprawdza, czy użytkownik wykorzystał wszystkie dostępne próby. Jeśli liczba prób spadnie do zera, gra zostaje przegrana.

# Spis treści:

# HangmanGame.java
Klasa zawierająca "Kręgosłup" całej gry.

# WordManager.java
Klasa zarządzająca słowami do gry.

# GameUI.java
Klasa odpowiedzialna za interfejs graficzyny.

# words.txt
Wyrazy do odgadnięcia.
