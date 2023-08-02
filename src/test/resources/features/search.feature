@smoke
Feature: Suche SWM Functionen
  User Story:
  Als ein nutzer, sollte ich die such functionen auf der web seite sehen können


  Scenario: Der nutzer sollte TrinkWasserAnalyse sehen und zurück zur hauptseite kehren

    Given nutzer auf der Hauptseite
    When nutzer klickt alle cookies akzeptieren
    Given nutzer klickt auf tarifeAngebote
    And nutzer klickt auf MWasser
    And nutzer klickt auf trinkWasserAnalyse
    Then nutzer scrollt runter und hoch
    And nutzer kehrt auf die Hauptseite zurück
    Then nutzer sollte die Bereiche "Stadtwerke München | Strom, Erdgas, Wasser, Bäder & mehr" sehen