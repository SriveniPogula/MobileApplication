package com.MobileApplication.demo.service;

import com.MobileApplication.demo.entity.MobileEntity;
import com.MobileApplication.demo.exceptions.MobileNotFoundException;
import com.MobileApplication.demo.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MobileServiceImp implements MobileService{
    @Autowired
    private MobileRepository mobileRepository;

    public MobileEntity saveMobileData(MobileEntity mobileEntity) {
       return mobileRepository.save(mobileEntity);
    }

    public Optional<MobileEntity> getMobileData(long modelId) {
         Optional<MobileEntity> existingMobile=mobileRepository.findById(modelId);
         if(existingMobile.isPresent()){
             return existingMobile;
         }
         else{
             throw new MobileNotFoundException("Mobile Is Not Found Of Id " +modelId);
         }
    }

    public Optional<MobileEntity> deleteMobileData(long modelId) {
       Optional<MobileEntity> particularMobile = mobileRepository.findById(modelId);
        if(particularMobile.isPresent()){
            particularMobile.get();
            mobileRepository.deleteById(modelId);
       }
       else{
           throw new MobileNotFoundException("Mobile Is Not Found Of Id " +modelId);
       }
        return particularMobile;
    }

    public List<MobileEntity> getAll() {
         return mobileRepository.findAll();
    }

    public Optional<MobileEntity> updateMobileData(long modelId,MobileEntity mobileEntity) {
   Optional<MobileEntity> availableMobile=mobileRepository.findById(modelId);
   if(availableMobile.isPresent()){
       availableMobile.get();
      mobileEntity.setMblPrice(mobileEntity.getMblPrice());
      mobileRepository.save(mobileEntity);
      return availableMobile;
   }
   else{
       throw new MobileNotFoundException("Mobile Is Not Found Of Id " +modelId);
   }
    }
}
