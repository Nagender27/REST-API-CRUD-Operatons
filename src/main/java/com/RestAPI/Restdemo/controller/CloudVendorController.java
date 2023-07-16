package com.RestAPI.Restdemo.controller;

import com.RestAPI.Restdemo.model.CloudVendor;
import com.RestAPI.Restdemo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    CloudVendorService cloudVendorService;

        public CloudVendorController(CloudVendorService cloudVendorService) {
            this.cloudVendorService = cloudVendorService;
        }

        @GetMapping("{vendorId}")
        public CloudVendor getcloudservice(@PathVariable("vendorId") String vendorId){
            return cloudVendorService.getCloudVendor(vendorId);
            // new CloudVendor("id","Nagender", "hyd","123");
        }

        @GetMapping()
        public List<CloudVendor> getAllcloudservice(){
            return cloudVendorService.getAllCloudVendor();
        }

        @PostMapping
        public String createVendorObject(@RequestBody CloudVendor cd){
           cloudVendorService.createCloudVendor(cd);
            return "created Successfully";
        }
        @PutMapping
        public String updateVendorObject(@RequestBody CloudVendor cd){
            cloudVendorService.updateCloudVendor(cd);
            return "update Successfully";
        }
        @DeleteMapping("{vendorId}")
        public String deleteVendorObject(@PathVariable("vendorId") String vendorId){
            cloudVendorService.deleteCloudVendor(vendorId);
            return "Deleted Successfully";
        }
}
