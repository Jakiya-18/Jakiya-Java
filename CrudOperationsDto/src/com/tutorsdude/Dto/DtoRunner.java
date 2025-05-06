package com.tutorsdude.Dto;

import com.tutorsdude.Dto.Example.PlayerDto;
import com.tutorsdude.Dto.Example.PlayerStorageDto;

public class DtoRunner {

    public static void main(String[] args) {

        PlayerDto playerDto = new PlayerDto(300,"jakiya",3, "jakiyabanu@gmail.com", 1);

        //System.out.println(playerDto.getScore());
        //System.out.println(playerDto.getUserName());
        //System.out.println(playerDto.getLevel());
        //System.out.println(playerDto.getEmail());
        //System.out.println(playerDto.getMatchWon());

        PlayerStorageDto playerStorageDto = new PlayerStorageDto();
        boolean b = playerStorageDto.savePlayers(playerDto);
        System.out.println("player saved : " +b);

    }
}
