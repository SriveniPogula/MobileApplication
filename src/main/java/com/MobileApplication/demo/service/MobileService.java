package com.MobileApplication.demo.service;

import com.MobileApplication.demo.entity.MobileEntity;

import java.util.List;
import java.util.Optional;

public interface MobileService {

    MobileEntity saveMobileData(MobileEntity mobileEntity);

    Optional<MobileEntity> getMobileData(long modelId);

    Optional<MobileEntity> deleteMobileData(long modelId);

    List<MobileEntity> getAll();

    Optional<MobileEntity> updateMobileData(long modelId,MobileEntity mobileEntity);




}
