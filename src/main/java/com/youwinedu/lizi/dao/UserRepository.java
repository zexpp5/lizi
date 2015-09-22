package com.youwinedu.lizi.dao;

import com.youwinedu.lizi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author : Lance lance7in_gmail_com
 * Date   : 21/09/15 22:31
 * Since  :
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
