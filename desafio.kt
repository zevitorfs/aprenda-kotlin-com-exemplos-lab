data class Usuario( val nome: MutableList<String>){
	
    
    fun user(nome: MutableList<String>): List<String>{
		
    	return nome
    }
}

data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: String){

    val conteudoBasico = mutableListOf<String>()
    val conteudoIntermediario = mutableListOf<String>()
    val conteudoAvancado = mutableListOf<String>()

    init{
        when (nivel) {
            "basico" -> conteudoBasico.add(nome)
            "intermediario" -> conteudoIntermediario.add(nome)
            "avancado" -> conteudoAvancado.add(nome)
        }
    }

    fun getSudoersB(): List<String> {
        return conteudoBasico
    }

    fun getSudoersI(): List<String> {
        return conteudoIntermediario
    }

    fun getSudoersA(): List<String> {
        return conteudoAvancado
    }
    
}

 data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
       for (i in inscritos){
			println("O aluno: $inscritos com a matricula $i")
       }
    }
}


fun main() {

    val conteudo = ConteudoEducacional("Lopp Control", 1, "basico")
     println("Conteúdo básico: ${conteudo.getSudoersB()}")

}
