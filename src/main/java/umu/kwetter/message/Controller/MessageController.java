package umu.kwetter.message.Controller;

import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import umu.kwetter.message.Model.Message;
import umu.kwetter.message.Service.MessageService;

import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("/api/message")
public class MessageController {
    @Resource
    MessageService service;

    @GetMapping("/{id}")
    public ResponseEntity<List<Message>> get(@PathVariable(value = "id") Long id){
        List<Message> messages = service.get(id);
        return ResponseEntity.ok().body(messages);
    }

    @PostMapping
    public ResponseEntity post(@RequestBody Message message){
        service.post(message);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
