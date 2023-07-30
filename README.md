# Roman Number Service
### - convert in both ways Roman - Arabic
### - evaluate Roman numbers in multiple ways (watch [Main](https://github.com/noVibe/RomeNumberService/blob/main/src/Main.java))
### - check if Roman number is possible

How it works:

Roman numbers and their Arabic values are stored in the map. Since values are unique, the opposite map is present as well.

Arabic to Roman convertation is based on the sequence of extending values for Roman numbers.
Understanding the sequence, we can split the Arabic number by divisions to extract needed Roman digits by their value from the map.

Roman to Arabic convertation works in a different way. Roman number is splitted in a stream of values of Roman digits. The reduce operator summarize or subtract each value depending on previous one.

Verification of Roman number is a tricky part. After being converted to Arabic value, this Arabic value is being converted back to a Roman. Primordinal Roman number is invalid if comparsion with the new one was failed.
