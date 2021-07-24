package code._4_student_effort;

import reactor.core.publisher.Mono;

public class MonoReactorChallenge {
    public static void main(String[] args) {
        emptyMono().subscribe(System.out::println);
        System.out.println();
        monoWithNoSignal().subscribe(System.out::println);
        System.out.println();
        fooMono().subscribe(System.out::println);
        System.out.println();
        errorMono().subscribe(System.out::println,System.err::println);
    }

    public static Mono<String> emptyMono(){
        return Mono.empty();
    }

    public static Mono<String> monoWithNoSignal(){
        return Mono.never();
    }

    public static Mono<String> fooMono(){
        return Mono.just("foo");
    }

    public static Mono<String> errorMono(){
        return Mono.error(new IllegalStateException());
    }
}
