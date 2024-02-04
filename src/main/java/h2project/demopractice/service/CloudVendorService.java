package h2project.demopractice.service;

import java.util.List;


import h2project.demopractice.Model.CloudVendorModel;

public interface CloudVendorService {
	
	 String createCloudVendor(CloudVendorModel cloudVendorModel);

	 String updateCloudVendor(CloudVendorModel cloudVendorModel, Long vendorId);

	 List<CloudVendorModel> getAllCloudVendor();

	 CloudVendorModel getCloudVendor(long vendorId);


	 String deleteCloudVendor(long vendorId);




}
