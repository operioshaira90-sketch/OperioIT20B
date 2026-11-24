README Documentation

About the Program:
Kani nga Java program (SortingAlgorithms.java) nagpakita kung unsaon pag-arrange sa pulo (10) ka wala nagsunod nga mga number (44, 38, 5, 47, 15, 36, 26, 27, 2, 46) gikan sa pinakagamay padulong sa pinakadako (ascending order) gamit ang tulo ka sorting algorithms: Bubble Sort, Selection Sort, ug Insertion Sort. Sa main() method, naghimo ko og managlahi nga kopya sa original array gamit ang .clone() aron ang matag algorithm mo-sort sa parehas nga original numbers ug ipakita ang ilang output.

How Bubble Sort Works:
Ang Bubble Sort magkumpara sa duha ka magtapad nga numbers sa array. Kung ang nauna nga number mas dako kaysa sa sunod (arr[j] > arr[j + 1]), magbaylo sila og position. Balik-balikon kini hangtod nga ang mga dagkong numbers mapadulong sa tumoy ug ma-arrange ang tanan gikan sa pinakagamay padulong sa pinakadako.

How Selection Sort Works:
Ang Selection Sort mangita sa pinakagamay nga number sa wala pa ma-sort nga bahin sa array. Kung makit-an na ang pinakagamay, ibaylo ni sa pinakaunang position sa wala pa ma-sort nga part. Balik-balikon ni kada round hangtod ma-arrange ang tanan gikan sa pinakagamay padulong sa pinakadako.

How Insertion Sort Works:
Ang Insertion Sort murag nag-arrange og playing cards sa kamot. Mokuha ni og isa ka number gikan sa wala pa ma-sort nga bahin, dayon i-check ug isuksok (insert) ni sa saktong position sulod sa mga numbers nga nauna nang na-arrange pinaagi sa pag swap sa mga mas dagko nga numbers paingon sa tuo.

Differences Between the Three Sorting Algorithms:
- Bubble Sort: Magkumpara ug mag-swap sa duha ka magtapad nga numbers balik-balik kada agi hangtod ma-arrange tanan.
- Selection Sort: Mangita sa pinakagamay nga number sa tibuok wala pa ma-sort nga listahan usa pa mag-swap kaisa kada round.
- Insertion Sort: Dili magsigeg swap og pares; mokuha lang og tag-usa ka number ug isuksok ni diretso  sa saktong position sa na-sort na nga part.


Reflection Questions

1. How does each sorting algorithm arrange numbers? What makes their processes different?
Ang tulo ka sorting algorithm naay own way para na mag arrange sa number. Ang Bubble Sort algorithm kay magkumpara siya sa duha ka magtapad nga numbers. Kung ang left mas dako kaysa right, ilang ilisan og position. Balik-balikon ni hangtod ma-sorted tanan. Ang selection Algorithm pud kay mangita siya sa pinakagamay nga number sa wala pa ma-sort nga part, unya ibutang kini sa unahan. Kada round, pilion niya ang smallest number. And lastly, ang Insertion algorithm kay murag nag-arrange ka og playing cards. Kuhaon niya ang usa ka number, unya ibutang sa sakto nga position sa mga numbers nga nauna nang na-arrange.

2. Among the three sorting algorithms, which one do you think is the easiest to understand and implement? Why?
Para nako, Insertion Sort ang pinakasayon sabton ug i-implement kay simple ra ang iyang proseso. Murag nag-arrange lang og playing cards, diin kuhaon ang usa ka number ug ibutang sa saktong position base sa mga numbers nga nauna nang na-arrange. Dili kaayo komplikado ang iyang logic, mao nga mas dali nako masabtan ug ma-code.

3. If the numbers are already sorted, which algorithm do you think would perform better? Explain your answer based on how the algorithms work.
Para nako, Insertion Sort ang mas maayo kung daan nang sorted ang mga numbers kay dili na kaayo siya mag-usab sa ilang position. I-check ra niya ang mga numbers ug ibutang sa sakto nga lugar kung naay kinahanglan i-adjust. Tungod kay sorted na daan, gamay ra iyang trabaho ug mas paspas siya sa maong situation kumpara sa Bubble Sort ug Selection Sort.

4. What will happen if you add more numbers to your array? How might this affect the performance of each sorting algorithm?
Kung magdugang ta og numbers sa array, mas mudaghan ang trabaho sa sorting algorithms, kay mas daghan na silang numbers nga i-compare ug i-arrange.
- Bubble Sort: Mas daghan og comparisons ug swaps kay kinahanglan niya i-compare ang mga magtapad nga numbers balik-balik hangtod ma-sorted.
- Selection Sort: Mas dugay siya kay kinahanglan niya pangitaon ang smallest number sa mas daghan nga elements kada round.
- Insertion Sort: Mas mudaghan ang numbers nga iyang i-check ug ibalhin sa sakto nga position, labi na kung dili sorted ang array.
Sa akong pagsabot, kung mas daghan ang numbers, mas mohinay silang tulo. Pero kung daan nang sorted ang numbers, mas efficient ang Insertion Sort kay dili na kaayo niya kinahanglan ibalhin ang mga elements.

5. As a future programmer, why is it important to understand different sorting algorithms instead of using just one?
Para nako, importante nga masabtan ang lain-laing sorting algorithms kay dili tanan algorithm parehas ka-efficient sa tanang situation. Kung future programmer ko, makatabang ni nako sa pagpili sa pinakaangay nga algorithm depende sa kadaghan sa data ug sa situation. Pinaagi ani, makahimo ko og program nga mas efficient, mas paspas, ug mas maayo ang performance kaysa magsalig lang sa usa ka sorting algorithm.
