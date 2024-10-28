package com.hoversprite;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Auth {
        @Getter
    @Setter
    @NoArgsConstructor
    public static class SignUpFarmerDto {

        private String fullName;

        private String phone;

        private String email;

        private String homeAddress;

    }
    
}
