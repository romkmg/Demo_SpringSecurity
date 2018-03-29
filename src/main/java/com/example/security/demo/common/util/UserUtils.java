package com.example.security.demo.common.util;

import com.example.security.demo.domain.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtils {
    /**
     * 获取当前用户
     * @param
     * @return
     */
    public static User getCurrentUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
