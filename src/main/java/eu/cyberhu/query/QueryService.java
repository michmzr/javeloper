package eu.cyberhu.query;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Slf4j
@Service
public class QueryService {

    @Cacheable("query")
    public BigObject query() {
        log.info("Generating big object...");
        return new BigObject();
    }
}
