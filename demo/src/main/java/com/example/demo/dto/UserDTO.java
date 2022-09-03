package com.example.demo.dto;

import com.example.demo.model.UserEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "유저 정보")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private String token;
    @ApiModelProperty(value = "이메일", example = "a@a.com", required = true)
    private String email;
    private String username;
    private String password;
    private String id;

    public static UserDTO fromEntity(UserEntity userEntity) {
        return UserDTO.builder()
                .email(userEntity.getEmail())
                .id(userEntity.getId())
                .username(userEntity.getUsername())
                .build();
    }
}
