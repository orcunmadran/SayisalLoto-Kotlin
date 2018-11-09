import kotlin.random.Random

fun main() {
    var sec: Int = 0
	var secilenler: IntArray = intArrayOf(0, 0, 0, 0, 0, 0)
    while(sec < 6){
        var secilen: Int = Random.nextInt(1, 49)
        if(secilen !in secilenler){
           secilenler[sec] = secilen
        	sec++
        }
    }
    secilenler.sort()
    for(sayilar in secilenler){
        print(sayilar.toString()+" ")
    }
}
