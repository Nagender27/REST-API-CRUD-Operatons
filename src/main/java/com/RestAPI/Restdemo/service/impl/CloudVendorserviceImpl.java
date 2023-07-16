package com.RestAPI.Restdemo.service.impl;

import com.RestAPI.Restdemo.model.CloudVendor;
import com.RestAPI.Restdemo.repository.CloudVendorRepository;
import com.RestAPI.Restdemo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorserviceImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorserviceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudvendor) {
        cloudVendorRepository.save(cloudvendor);
        return "Successfully saved";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "updates Successfully";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Deleted from Database";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}
