package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if ((outsourcedPartRepository.count() == 0)) {
            OutsourcedPart intelI7 = new OutsourcedPart();
            intelI7.setCompanyName("Intel");
            intelI7.setName("Intel Core i7-14700K Processor");

            intelI7.setPrice(429.99);
            intelI7.setId(100L);
            intelI7.setMax(10);
            intelI7.setMin(2);
            intelI7.setInv(4);
            outsourcedPartRepository.save(intelI7);

            OutsourcedPart intelI3 = new OutsourcedPart();
            intelI3.setCompanyName("Intel");
            intelI3.setName("Intel Core i3-14100 Processor");
;
            intelI3.setPrice(149.99);
            intelI3.setId(2);
            intelI3.setMax(10);
            intelI3.setMin(2);
            intelI3.setInv(9);

            outsourcedPartRepository.save(intelI3);

            OutsourcedPart samsungSSD = new OutsourcedPart();
            samsungSSD.setCompanyName("Samsung");
            samsungSSD.setName("Samsung SSD 990 PRO 2TB");
            samsungSSD.setPrice(149.99);
            samsungSSD.setId(3);
            samsungSSD.setMax(15);
            samsungSSD.setMin(1);
            samsungSSD.setInv(8);

            outsourcedPartRepository.save(samsungSSD);

            OutsourcedPart ASRockGPU = new OutsourcedPart();
            ASRockGPU.setCompanyName("ASRock");
            ASRockGPU.setName("ASRock Radeon RX 6600 8GB");

            ASRockGPU.setPrice(219.99);
            ASRockGPU.setId(4);
            ASRockGPU.setMax(20);
            ASRockGPU.setMin(2);
            ASRockGPU.setInv(8);
            outsourcedPartRepository.save(ASRockGPU);

            OutsourcedPart VentusGPU = new OutsourcedPart();
            VentusGPU.setCompanyName("MSI");
            VentusGPU.setName("MSI Ventus GeForce RTX 4070 12GB Video Card");

            VentusGPU.setPrice(549.99);
            VentusGPU.setId(5);
            VentusGPU.setMax(10);
            VentusGPU.setMin(1);
            VentusGPU.setInv(2);
            outsourcedPartRepository.save(VentusGPU);
        }
        if (productRepository.count() == 0) {
            Product workstation = new Product();
            workstation.setName("Martianware Workstation");
            workstation.setInv(2);
            workstation.setPrice(1299.99);
            workstation.setId(6);
            productRepository.save(workstation);

            Product desktop = new Product();
            desktop.setName("Martianware Desktop");
            desktop.setInv(3);
            desktop.setPrice(799.99);
            desktop.setId(7);
            productRepository.save(desktop);

            Product budgetPC = new Product();
            budgetPC.setName("Martianware Budget PC");
            budgetPC.setInv(4);
            budgetPC.setPrice(599.99);
            budgetPC.setId(8);
            productRepository.save(budgetPC);

            Product buildKit = new Product();
            buildKit.setName("Martianware PC Build Starter Kit");
            buildKit.setInv(4);
            buildKit.setPrice(399.99);
            buildKit.setId(9);
            productRepository.save(buildKit);

            Product upgradeKit = new Product();
            upgradeKit.setName("Martianware Upgrade Kit");
            upgradeKit.setInv(4);
            upgradeKit.setPrice(749.99);
            upgradeKit.setId(10);
            productRepository.save(upgradeKit);
        }
       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
