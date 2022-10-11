package com.rohandev.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if("rohan".equals(username)) {
            return new User(username, "$2a$12$B6o3.6kj/5pK7D7WkGpHU.GlQWL/QEXIzC8jG6PX333ZSHgqp4E6O", new ArrayList<>());
            // pass - RANDOM_PASS
        }else {
            throw new UsernameNotFoundException("User with name "+ username + " not found!");
        }
    }
}
