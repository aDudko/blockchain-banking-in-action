package com.dudko.example.domain.mapper;

import com.dudko.example.core.Block;

public class BlockMapper {

    public static com.dudko.example.domain.entity.blockchain.Block mapToBlock(Block blockDto) {
        return com.dudko.example.domain.entity.blockchain.Block.builder()
                .id(blockDto.getId())
                .hash(blockDto.getHash())
                .prevHash(blockDto.getPrevHash())
                .data(blockDto.getData())
                .timeCreate(blockDto.getTimeCreate())
                .nonce(blockDto.getNonce())
                .build();
    }

    public static Block mapToBlockDto(com.dudko.example.domain.entity.blockchain.Block block) {
        return Block.builder()
                .id(block.getId())
                .hash(block.getHash())
                .prevHash(block.getPrevHash())
                .data(block.getData())
                .timeCreate(block.getTimeCreate())
                .nonce(block.getNonce())
                .build();
    }

}
