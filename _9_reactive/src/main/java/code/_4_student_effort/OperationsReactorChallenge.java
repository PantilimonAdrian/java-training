package code._4_student_effort;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;

public class OperationsReactorChallenge {
    private static List<String> words = Arrays.asList(
            "the",
            "quick",
            "brown",
            "fox",
            "jumped",
            "over",
            "the",
            "lazy",
            "dog"
    );

    public static void displayLetters(){
        Flux<String> letters = Flux.fromIterable(words)
                .flatMap(word -> Flux.fromArray(word.split("")))
                .zipWith(Flux.range(1,Integer.MAX_VALUE),
                        (string, count) -> String.format("%2d. %s)",count,string));
        letters.subscribe(System.out::println);
    }

    public static void findingMissingLetter() {
        Flux<String> missingLetters = Flux.fromIterable(words)
                .flatMap(word -> Flux.fromArray(word.split("")))
                .distinct()
                .sort()
                .zipWith(Flux.range(1,Integer.MAX_VALUE),
                        (string,count) -> String.format("%2d. %s",count,string));
        missingLetters.subscribe(System.out::println);
    }

    public static void restoringMissingLetter(){
        Flux<String> missingLetter = Flux.just("s");
        Flux<String> allLetters = Flux.fromIterable(words)
                .flatMap(word -> Flux.fromArray(word.split("")))
                .concatWith(missingLetter)
                .distinct()
                .sort()
                .zipWith(Flux.range(1,Integer.MAX_VALUE),
                        (string,count) -> String.format("%2d. %s",count,string));
        allLetters.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("Display Letters: ");
        displayLetters();
        System.out.println("Missing letters founded: ");
        findingMissingLetter();
        System.out.println("Restored missing letters: ");
        restoringMissingLetter();
    }
}
