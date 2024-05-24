//## Exercício 1: Soma de Array
//- **Descrição**: Escreva uma função que recebe um array de números e retorna a soma de todos os elementos.

//- **Regra**: Não utilize funções de bibliotecas que façam a soma diretamente

//- **Input**: [1, 2, 3, 4, 5]
//- **Output**: 15
//- **Input**: [-1, 1, 0, 5, -5]
//- **Output**: 0 *//

package matriz;

public class ExeSomaArray {
  public static void main(String[] args) {
  int[][] allNumbers = {
    {1, 2, 3, 4, 5,},
    {-1, 1, 0, 5, -5}
  };

  for(int[] numbers : allNumbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
      }
      System.out.println("Sum: " + sum);
    }
  }
}