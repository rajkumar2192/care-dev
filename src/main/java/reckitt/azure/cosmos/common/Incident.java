package reckitt.azure.cosmos.common;

import reckitt.azure.cosmos.product.Product;
import reckitt.azure.cosmos.summary.Summary;

import java.util.List;

public class Incident {

    private String id;
    private Summary summary;
    private List<Product> productList;
    private String incidentNumber;
    private String partitionKey;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getPartitionKey() {
        return partitionKey;
    }

    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public List<Product> getProduct() {
        return productList;
    }

    public void setProduct(List<Product> product) {
        this.productList = product;
    }

    public String getIncidentNumber() {
        return incidentNumber;
    }

    public void setIncidentNumber(String incidentNumber) {
        this.incidentNumber = incidentNumber;
    }
}
