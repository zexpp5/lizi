package com.youwinedu.lizi.service.impl;

import com.youwinedu.lizi.dao.LiziRepository;
import com.youwinedu.lizi.entity.Lizi;
import com.youwinedu.lizi.service.ILiziService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author : Lance lance7in_gmail_com
 * Date   : 21/09/15 22:34
 * Since  :
 */
@Service
@Transactional
public class LiziService implements ILiziService {
    @Autowired
    private LiziRepository repository;

    @Override
    public Lizi create(Lizi lizi) {
        return repository.saveAndFlush(lizi);
    }

    @Override
    public Lizi get(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public List<Lizi> get(List<Integer> ids) {
        return repository.findAll(ids);
    }
}
