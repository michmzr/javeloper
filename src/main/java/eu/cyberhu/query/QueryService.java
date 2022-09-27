package eu.cyberhu.query;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class QueryService {

    @Cacheable("query")
    public List<Integer> query() {
        IntStream ints = new Random().ints(1000);
        return  ints
                .boxed()
                .sorted()
                .collect(Collectors.toList());
    }
}
