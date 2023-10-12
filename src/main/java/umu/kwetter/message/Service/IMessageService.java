package umu.kwetter.message.Service;

import umu.kwetter.message.Model.Message;
import java.util.List;

public interface IMessageService {
    List<Message> get(Long userId);
    void post(Message message);
    void delete(Long userId);
}
