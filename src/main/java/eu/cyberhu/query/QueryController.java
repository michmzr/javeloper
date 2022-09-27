package eu.cyberhu.query;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("query")
public class QueryController {
    @Autowired
    private QueryService queryService;

    @GetMapping("/")
    public ResponseEntity<String> random() {
        return ResponseEntity.ok(queryService.query().funnyString());
    }
}
