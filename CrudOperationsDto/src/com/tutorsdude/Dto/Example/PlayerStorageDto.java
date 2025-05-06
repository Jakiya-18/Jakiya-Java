package com.tutorsdude.Dto.Example;

public class PlayerStorageDto {

    PlayerDto[] playerDto = new PlayerDto[5];


    public boolean savePlayers(PlayerDto player){
        if (player!= null){
            if (player.getScore() > 200){
                if (player.getLevel() > 2){
                    for (int i = 0; i < playerDto.length; i++) {
                        if (playerDto[i] == null) {
                            playerDto[i] = player;
                            System.out.println("Player saved");
                            return true;
                        }
                        System.out.println("Enter a valid name");
                        return false;
                    }

                }
                System.out.println("Player should pass more than 2 levels");
                return false;
            }
            System.out.println("Player not eligible...");
            return false;
        }
        System.out.println("players are null....");
        return false;
    }

}
