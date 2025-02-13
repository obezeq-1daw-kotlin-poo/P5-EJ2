class EmpleadoFijo(nombre: String, id: Int, private val salarioFijo: Double, private val numPagas: Int) : Empleado(nombre, id) {
    override fun calculaSalario(): Double {
        return salarioFijo / numPagas
    }
}