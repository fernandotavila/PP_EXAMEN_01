import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main { //https://github.com/fernandotavila/PP_EXAMEN_01.git
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(
                5, 12, 8, 3, 20, 15, 7, 10, 25, 4,
                18, 6, 30, 9, 2
        );

        // Ejercicio 13. Números pares
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("13. Pares: " + pares);

        // Ejercicio 14. Números mayores que 10
        List<Integer> mayores10 = numeros.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());
        System.out.println("14. Mayores que 10: "+mayores10);

        // Ejercicio 15. Elevar los números al cuadrado
        List<Integer> cuadrados = numeros.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());
        System.out.println("15. Cuadrados: "+cuadrados);

        // Ejercicio 16. Obtener el número máximo
        Optional<Integer> max = numeros.stream()
                .max(Integer::compare);
        System.out.println("16. Máximo: "+max.orElse(null));

        // Ejercicio 17. Obtener el número mínimo
        Optional<Integer> min = numeros.stream()
                .min(Integer::compare);
        System.out.println("17. Mínimo: "+min.orElse(null));

        // Ejercicio 18. Contar números mayores que 10
        long numMayores10 = numeros.stream()
                .filter(n->n > 10)
                .count();
        System.out.println("18. Cantidad mayor a 10: "+numMayores10);

        // Ejercicio 19. Calcular el promedio
        OptionalDouble promedio = numeros.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println("19. Promedio: "+(promedio.isPresent() ? promedio.getAsDouble() : 0.0));
    }
}