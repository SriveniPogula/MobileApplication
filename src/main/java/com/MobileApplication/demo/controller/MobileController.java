package com.MobileApplication.demo.controller;

import com.MobileApplication.demo.entity.MobileEntity;
import com.MobileApplication.demo.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/mobile")
public class MobileController {
    @Autowired
    private MobileService mobileService;

    @PostMapping("/save")
    public MobileEntity insertData(@RequestBody  MobileEntity mobileEntity){
        return mobileService.saveMobileData(mobileEntity);
    }

    @GetMapping("/get/{modelId}")
    public Optional<MobileEntity> mobileDataById(@PathVariable  long modelId){
        return mobileService.getMobileData(modelId);
    }

    @DeleteMapping("/{modelId}")
    public Optional<MobileEntity> deleteMobileDetails(@PathVariable long modelId){
        return mobileService.deleteMobileData(modelId);
    }

    @GetMapping("/getAllData")
    public List<MobileEntity> getAllMobileData(){
        return mobileService.getAll();
    }

    @PutMapping("/update/{modelId}")
    public Optional<MobileEntity> updatedMobileData(@PathVariable long modelId,@RequestBody MobileEntity mobileEntity){
        return mobileService.updateMobileData(modelId,mobileEntity);
    }

}
