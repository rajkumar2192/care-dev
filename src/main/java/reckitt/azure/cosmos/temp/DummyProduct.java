package reckitt.azure.cosmos.temp;

import reckitt.azure.cosmos.product.*;

import java.util.ArrayList;
import java.util.List;

public class DummyProduct {

    public List<Product> getProducts() {

        Level level1 = new Level();
        level1.setLevelCode("ENA");
        level1.setLevelDescription("ENA");
        Level level2 = new Level();
        level2.setLevelCode("USA");
        level2.setLevelDescription("United States of America");
        List<Level> levelList = new ArrayList<>();
        levelList.add(level1);
        levelList.add(level2);

        ProductName productName = new ProductName();
        productName.setCode("abd");
        productName.setCodeDescription("desc");
        productName.setLevels(levelList);

        MainReason mainReason = new MainReason();
        mainReason.setCode("abd");
        mainReason.setCodeDescription("desc");
        mainReason.setLevels(levelList);

        AltReason altReason = new AltReason();
        altReason.setCode("abd");
        altReason.setCodeDescription("desc");
        altReason.setLevels(levelList);

        Factory factory = new Factory();
        factory.setCode("abd");
        factory.setCodeDescription("desc");
        factory.setLevels(levelList);

        Priority priority = new Priority();
        priority.setCode("abd");
        priority.setCodeDescription("desc");
        priority.setLevels(levelList);

        RegularUser regularUser = new RegularUser();
        regularUser.setCode("abd");
        regularUser.setCodeDescription("desc");
        regularUser.setLevels(levelList);

        ProductSample productSample = new ProductSample();
        productSample.setCode("abd");
        productSample.setCodeDescription("desc");
        productSample.setLevels(levelList);

        Investigation investigation = new Investigation();
        investigation.setCode("abd");
        investigation.setCodeDescription("desc");
        investigation.setLevels(levelList);

        Product product1 = new Product();
        product1.setProductName(productName);
        product1.setProductPrice("2.50");
        product1.setNoInvolved("1");
        product1.setBatchNo("BATCHNO1234");
        product1.setEanBarCode("EANBARCODE12");
        product1.setMainReason(mainReason);
        product1.setAltReason(altReason);
        product1.setFactory(factory);
        product1.setPriority(priority);
        product1.setRegularUser(regularUser);
        product1.setProductSample(productSample);
        product1.setInvestigation(investigation);
        product1.setExpiryDate("2023-06-29");
        product1.setSampleSentDate("2023-05-29");
        product1.setSampleReceivedDate("2023-05-26");
        product1.setProductSummaryNotes("roll 1 product comments");

        Product product2 = new Product();
        product2.setProductName(productName);
        product2.setProductPrice("3.13");
        product2.setNoInvolved("1");
        product2.setBatchNo("BATCHROLL2");
        product2.setEanBarCode("EANBARCODE12");
        product2.setMainReason(mainReason);
        product2.setAltReason(altReason);
        product2.setFactory(factory);
        product2.setPriority(priority);
        product2.setRegularUser(regularUser);
        product2.setProductSample(productSample);
        product2.setInvestigation(investigation);
        product2.setExpiryDate("2023-06-23");
        product2.setSampleSentDate("2023-05-28");
        product2.setSampleReceivedDate("2023-05-27");
        product2.setAltReasonNotes("testing alt reason comments");
        product2.setProductSummaryNotes("product roll 2 comments");

        List<Product> productList= new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        return productList;
    }
}
