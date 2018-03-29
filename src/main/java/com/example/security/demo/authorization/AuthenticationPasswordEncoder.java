package com.example.security.demo.authorization;

import org.springframework.security.crypto.password.PasswordEncoder;
/**
 *
 * @author Mao.Zeng@MG
 * @date 2018/3/23 14:05
 */
public class AuthenticationPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return charSequence.equals(s.toString());
    }
}
