package code._4_student_effort;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

public class TransformingReactorChallenge {
    private static List<User> testUsers = Arrays.asList(
            new User("Anil","Jessica","anil.jessica"),
            new User("Emiliano","Lopez","lopez.emiliano"),
            new User("Matt","Cole","matt.cole"),
            new User("Sandra","Thompson","thompson.sandra"),
            new User("Leona","Graham","graham.leona"),
            new User("Christine","Duncan","duncan.christine")
    );

    public static void main(String[] args) {
        capitalizeOne(Mono.just(testUsers.get(3))).subscribe(System.out::println);
        System.out.println();
        capitalizeMany(Flux.fromIterable(testUsers)).subscribe(System.out::println);
        System.out.println();
        asyncCapitalizeMany(Flux.fromIterable(testUsers)).subscribe(System.out::println);
    }

    public static Mono<User> capitalizeOne(Mono<User> mono){
        return mono.map(user -> new User(user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getUsername().toUpperCase() ));
    }

    public static Flux<User> capitalizeMany(Flux<User> flux){
        return flux.map(user -> new User(user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getUsername().toUpperCase() ));
    }

    public static Flux<User> asyncCapitalizeMany(Flux<User> flux){
        return flux.flatMap(TransformingReactorChallenge::asyncCapitalizeUser);
    }

    public static Mono<User> asyncCapitalizeUser(User u){
        return Mono.just(new User(u.getFirstName().toUpperCase(),u.getLastName().toUpperCase(),u.getUsername().toUpperCase()));
    }
}
