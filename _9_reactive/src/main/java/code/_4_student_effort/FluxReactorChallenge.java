package code._4_student_effort;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;

public class FluxReactorChallenge {
    public static void main(String[] args) {
        emptyFlux().subscribe(System.out::println);
        System.out.println();

        fooBarFluxFromValues().subscribe(System.out::println);
        System.out.println();

        fooBarFluxFromList().subscribe(System.out::println);
        System.out.println();

        counter().subscribe(System.out::println);
        System.out.println();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        errorFlux().subscribe(System.out::println,System.err::println);
        System.out.println();
    }

    public static Flux<String> emptyFlux(){
        return Flux.empty();
    }

    public static Flux<String> fooBarFluxFromValues(){
        return Flux.just("foo","bar");
    }

    public static Flux<String> fooBarFluxFromList(){
        return Flux.fromIterable(Arrays.asList("foo","bar"));
    }

    public static Flux<String> errorFlux(){
        return Flux.error(new IllegalStateException());
    }

    public static Flux<Long> counter(){
        return Flux.interval(Duration.ofMillis(100)).take(10);
    }
}
