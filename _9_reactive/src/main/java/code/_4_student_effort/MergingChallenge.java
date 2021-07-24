package code._4_student_effort;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class MergingChallenge {
    private static List<String> words1 = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
    private static List<String> words2 = Arrays.asList(
            "the",
            "quick",
            "brown",
            "fox",
            "jumped",
            "over",
            "the",
            "lazy",
            "dog");

    public static Flux<String> mergeFluxWithInterleave(Flux<String> flux1, Flux<String> flux2) {
        return flux1.mergeWith(flux2);
    }

    public static Flux<String> mergeFluxWithNoInterleave(Flux<String> flux1, Flux<String> flux2) {
        return flux1.concatWith(flux2);
    }

    public static Flux<String> createFluxFromMultipleMono(Mono<String> mono1, Mono<String> mono2) {
        return Flux.concat(mono1, mono2);
    }

    public static void main(String[] args) throws InterruptedException {
        Flux<String> flux1 = Flux.fromIterable(words1).delayElements(Duration.ofMillis(100));
        Flux<String> flux2 = Flux.fromIterable(words2).delayElements(Duration.ofMillis(230));
        System.out.println("Interleave: ");
        mergeFluxWithInterleave(flux1, flux2).subscribe(System.out::println);
        Thread.sleep(3500);
        System.out.println("No interleave: ");
        mergeFluxWithNoInterleave(Flux.fromIterable(words1), Flux.fromIterable(words2)).subscribe(System.out::println);
        System.out.println("Multiple Mono: ");
        createFluxFromMultipleMono(Mono.just(words1.get(3)), Mono.just(words2.get(4))).subscribe(System.out::println);

    }
}
