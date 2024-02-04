package h2project.demopractice.serviceTest;


import h2project.demopractice.Model.CloudVendorModel;
import h2project.demopractice.repository.CloudVendorRepository;
import h2project.demopractice.service.CloudVendorService;
import h2project.demopractice.service.serviceImpl.CloudVendorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CloudVendorServiceImplTest {

    @Mock
    CloudVendorRepository cloudVendorRepository;

    @InjectMocks
    CloudVendorService cloudVendorService=new CloudVendorServiceImpl(cloudVendorRepository);

     CloudVendorModel cloudVendorModel;


    @BeforeEach
    void setUp() {

         cloudVendorModel=new CloudVendorModel(1,"Amazon", "USA", "Vendor1");
    }

    @Test
    public void verify_user_should_be_able_to_save_cloudvendor() {




    }

    @Test
    public void verify_user_should_be_able_to_get_cloudvendor() {



    }
    @Test
    public void verify_user_should_be_able_to_throw_exception_if_vendor_does_not_exist() {

    }
    @Test
    public void verify_user_should_be_able_to_get_list_of_cloud_vendors() {





    }


}



