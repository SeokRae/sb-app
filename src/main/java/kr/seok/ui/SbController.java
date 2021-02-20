package kr.seok.ui;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SbController {

    @GetMapping("/hello")
    public ResponseEntity<?> helloPage() {
        return ResponseEntity.ok().body("hello");
    }

    @GetMapping("/")
    public ResponseEntity<?> rootPage() {
        return ResponseEntity.ok().body("<a href='https://github.com/SeokRae'>SeokRae</a>");
    }

}
