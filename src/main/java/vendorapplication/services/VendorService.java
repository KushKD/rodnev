package vendorapplication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vendorapplication.repositories.VendorRepository;

@Service
public class VendorService {

    @Autowired
    private VendorRepository vendorRepository;
}