package com.sist.jobgem.service;

import com.sist.jobgem.dto.ChatroomResponseDto;
import com.sist.jobgem.repository.ChatroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatroomService {
    @Autowired
    private ChatroomRepository chatroomRepository;

    public List<ChatroomResponseDto> getChatroomList(int id) {
        System.out.println(chatroomRepository.findChatList(id).get(0).getChatList().get(0).getChDate());
        return chatroomRepository.findChatList(id);
    }
}
