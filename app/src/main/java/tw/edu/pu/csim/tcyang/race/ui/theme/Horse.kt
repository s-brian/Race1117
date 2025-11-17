package tw.edu.pu.csim.tcyang.race.ui.theme

class Horse(n: Int) {
    var horseX = 0
    var horseY = 100 + 320 * n

    var number = 0

    fun Run(){
        number ++
        if (number>3) {number = 0}
        horseX += (10..30).random()
    }
}