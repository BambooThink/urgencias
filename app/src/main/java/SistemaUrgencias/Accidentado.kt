package SistemaUrgencias

data class Accidentado (var nombre: String, var accidente: String) : Comparable<Accidentado> {

    override fun compareTo(other: Accidentado): Int {
        if (this.nombre > other.nombre)
            return 1
        else if (other.nombre > this.nombre)
            return -1
        else return 0
    }

}
