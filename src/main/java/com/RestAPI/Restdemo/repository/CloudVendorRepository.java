package com.RestAPI.Restdemo.repository;

import com.RestAPI.Restdemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
