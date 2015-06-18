# Pflichtübung 5: Im Dienste der Minions [100 Punkte]

  * Live-Testat vom 18.06.2015 (11:45 - 13:45 Uhr)


## Problembeschreibung

Nach Ihrem Ausflug zum Bundesnachrichtendienst, sind Sie wieder zurück in Mannheim. Zu Entspannung gehen Sie ins Kino und sehen sich einen 3D-Animationsfilm an...

Als Experte für unkonventionelle Lösungen haben Sie sich bereits einen soliden Ruf erarbeitet, als eines Tages Edith, Adoptivtochter des Superschurken Gru an Ihre Tür klingelt. Da Gru und sein Wissenschaftler Dr. Nefario es nicht so mit Ordnung haben, quillt die Villa von Gru inzwischen über vor kleinen gelben Minions. Edith möchte Sie engagieren, **um die Minions zu zählen** und zu ermitteln, wie viele frische Bananen pro Tag gebraucht werden, damit sie sich nicht weiter vermehren. Da die Minions sich bei spektakulären Industrieunfällen immer mal selbst reduzieren, sollte sich so das Platzproblem auf Dauer lösen lassen.

> So vermehrt sich das gemeine Minion: Sie werden als beschworene Wesen immer dann geschaffen wenn sich ein Minion über eine faulige Banane ärgert und sich jemanden wünscht, an dem es das auslassen kann. Dann teilt sich das wütende Original und erschafft so eine Kopie von sich selbst. Das erklärt auch, warum sie kein Problem damit haben, sich gegenseitig zu hauen - sie tun ja niemand anderem weh." (Prof. J.R.R. Pfitzelhuber, 1985 vor Kirk, „Der Boogeyman und andere Ungeheuer“)

Minions zeichnen sich durch eine Farbe und einen Vor- und Nachnamen aus. Weiterhin hat jedes Minion eine eindeutige Seriennummer (wobei man nicht genau weiß, woher diese stammt).

Das Problem ist nun, dass die Minions nicht einfach geordnet bei Ihnen vorbeikommen, sondern Sie nur versuchen können, durch die Räume der Villa zu gehen, und die Minions zu zählen. Wegen des großen Durcheinanders, werden Ihnen dabei unweigerlich einige Minions mehrfach unterkommen. Zum Glück sind die Minions eindeutig identifizierbar, sodass `equals()` und `hashCode()` gut funktionieren.

Netterweise hat Gru eine Klasse `MinionIterable` geschrieben, die in der Lage ist, Ihnen über einen Iterator die Minions einzeln vorzulegen, aber mit dem Risiko einige Minions mehrfach zu liefern. (Die kleinen Dinger sind einfach zu wuselig...)

**Achtung**: Sie dürfen die vorhandenen Klassen nicht verändern.


## Wirklich Anzahl der Minions bestimmen (100 Punkte)

Gru hat den Verdacht, dass es nicht gleich viele Minions der beiden Farben gibt und möchte, dass Sie dies überprüfen.

Schreiben Sie ein Programm, dass folgende Informationen bestimmt:

  * Anzahl der gezählten Minions
  * Anzahl der einmaligen Minions (also ohne doppelt gezählte)
  * Anzahl und % der gelben Minions (mit und ohne Dubletten)
  * Anzahl und % der violetten Minons (mit und ohne Dubletten)
  * Verhältnis zwischen gelben und violetten Minions (mit und ohne Dubletten)
  * Fehler bei der Zählung, d.h. das Verhältnis zwischen gezählten und einmaligen Minions

Eine beispielhafte Ausgabe sähe dann wie folgt aus:

    Ohne Dubletten: 1128 Minions
    717 gelbe (64%) und 411 violett (36%), gelb/violett 1,74
    -------------------------------------------------
    Mit Dubletten: 1184 Minions
    758 gelbe (64%) und 426 violett (36%), gelb/violett 1,78
    -------------------------------------------------
    Fehler bei der Zählung: 4,7%


## Zusatzaufgabe: Bestimmen der frechen Minions (30 Punkte)

Schreiben Sie ein Programm, das herausfindet, welche Minions mehrfach gezählt und wie oft diese gezählt wurden. Geben Sie alle Minions aus, die sich mehr als zwei Mal haben zählen lassen, damit Gru diese entsprechend bestrafen kann. Die Ausgabe ist nach der Anzahl sortiert. 

Gru hat die Vermutung, dass es einen besonders frechen Minion gibt, das sich extra mehrfach zählen lässt und möchte wissen, welches dies ist. Wie heißt dieser Minion?

Eine beispielhafte Ausgabe sähe dann wie folgt aus:

    3 Mal gezählt
        Cliff Irwin
        Arron Sargent
        Freddie Lindsey
    
    4 Mal gezählt
        Hugo Gamble
        Donn Wilder
        Rayford York
    
    5 Mal gezählt
        Sang Clarke
        Curtis Kelley




