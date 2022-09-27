package eu.cyberhu.query;


import eu.cyberhu.query.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("query")
public class QueryController {
    @Autowired
    private QueryService queryService;

    @GetMapping("/")
    public ResponseEntity<List<Integer>> random() {
        return ResponseEntity.ok(queryService.query());
    }
}
