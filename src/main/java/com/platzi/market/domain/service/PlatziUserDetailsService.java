package com.platzi.market.domain.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PlatziUserDetailsService implements UserDetailsService {

    //Arraylist va a ser el perfil o tipo de roles que va a tener el usuario. Noop codifica la password.
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("daniel","{noop}daniel",new ArrayList<>());
    }
}
