import javax.swing.JOptionPane


var numToFind = JOptionPane.showInputDialog("Introduce el numero que quieres encontrar").toInt()

var listaDeNumeros = IntArray(7)
for(i in (0 until 7)){
    listaDeNumeros[i] = JOptionPane.showInputDialog("Ingresa el numero de ${i+1}").toInt()
}

var pos = 0
var bandera = false
while (pos<7 && bandera==false){
    if (numToFind==listaDeNumeros[pos]){
        bandera= true
        break
    }
    pos++
}
if (bandera==true){
    println("El numero $numToFind se encontró en la posición ${listaDeNumeros[pos+1]}")
}

else{
    println("En numero que elegiste no se encuentra dentro de la lista")
}
