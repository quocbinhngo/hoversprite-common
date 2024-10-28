package com.hoversprite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class User {
    public static interface IUserDto {

        String getEmail();

        String getPhone();

        RoleType getRole();

        Long getProfileId();
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserDto {
        private String email;

        private String phone;

        private RoleType role;

        private Long profileId;

        public UserDto(IUserDto userDto) {
            this.email = userDto.getEmail();
            this.phone = userDto.getPhone();
            this.role = userDto.getRole();
            this.profileId = userDto.getProfileId();
        }
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreateUserDto {

        private String email;

        private String phone;

        private String hashedPassword;

        private RoleType role;

        private Long profileId;

    }

    public static enum RoleType {
        FARMER, RECEPTIONIST, SPRAYER
    }

    public static enum ExpertiseType {
        APPRENTICE, ADEPT, EXPERT
    }

}
