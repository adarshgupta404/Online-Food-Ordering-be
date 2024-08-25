package com.ofo.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ofo.backend.repository.UserRepository;

@Service
public class CustomerUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // User user = userRepository.findByEmail(username);
        // if (user != null) {
        //     throw new UsernameNotFoundException("User not found with email: " + username);

        // }
        // USER_ROLE role = user.getRole();
        // if (role == null) {
        //     role = USER_ROLE.ROLE_CUSTOMER;
        // }
        // List<GrantedAuthority> authorities = new ArrayList<>();
        // authorities.add(new SimpleGrantedAuthority(role.toString()));
        return null;
        // return new org.springframework.security.core.userdetails.User(user.getEmail());
    }
}
