package com.youwinedu.lizi.service;

import com.youwinedu.lizi.entity.Lizi;

import java.util.List;

/**
 * Author : Lance lance7in_gmail_com
 * Date   : 21/09/15 22:32
 * Since  :
 */
public interface ILiziService {

    Lizi create(Lizi lizi);

    Lizi get(Integer id);

    List<Lizi> get(List<Integer> ids);


}
