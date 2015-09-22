package com.youwinedu.lizi.service.impl;

import com.youwinedu.lizi.dao.UserRepository;
import com.youwinedu.lizi.entity.User;
import com.youwinedu.lizi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Author : Lance lance7in_gmail_com
 * Date   : 21/09/15 22:34
 * Since  :
 */
@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User get(Integer id) {
        return repository.findOne(id);
    }
}
