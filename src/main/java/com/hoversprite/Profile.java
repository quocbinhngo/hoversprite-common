package com.hoversprite;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Profile {

    @Getter
    @Setter
    @NoArgsConstructor
    public static class ProfileDto {
        private String fullName;
    }

}
