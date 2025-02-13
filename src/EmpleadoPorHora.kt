class EmpleadoPorHora(nombre: String, id: Int, private val horasTrabajadas: Int, private val tarifaPorHora: Double) : Empleado(nombre, id) {
    override fun calculaSalario(): Double {
        return horasTrabajadas * tarifaPorHora
    }
}