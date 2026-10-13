package com.carlospinales.ordersystem.domain;

import lombok.Builder;

public class CustommerProfile {
    /*Constructor private: nadie puede crear un CustomerProfile con new. La única forma es usar el Builder.*/
    private final String name;
    private final String email;
    private final String phone;
    private final String address;
    private final boolean premium;

    private CustommerProfile(Builder builder) { //
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
        this.premium = builder.premium;
    }

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "CustommerProfile[name=" + name + " , email=" + email + " ,phone=" + phone + " , address=" + address + " , premium=" + premium + "]";
    }

    public static class Builder {
        private String name;
        private String email;
        private String phone;
        private String address;
        private boolean premium;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder premium(boolean premium) {
            this.premium = premium;
            return this;
        }

        public CustommerProfile build() {
            if(name == null || email == null ){
                throw new IllegalStateException("name and email are required");
            }
            return new CustommerProfile(this);
        }
    }
}
