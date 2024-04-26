package reckitt.azure.cosmos.product;

public class Product {

    private String id;
    private String incidentNumber;
    private ProductName productName;
    private String productPrice;
    private String noInvolved;
    private String batchNo;
    private String eanBarCode;
    private MainReason mainReason;
    private AltReason altReason;
    private Factory factory;
    private Priority priority;
    private RegularUser regularUser;
    private ProductSample productSample;
    private Investigation investigation;
    private String expiryDate;
    private String sampleSentDate;
    private String sampleReceivedDate;
    private String productNotes;
    private String mainReasonNotes;
    private String altReasonNotes;
    private String productSummaryNotes;

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIncidentNumber() {
        return incidentNumber;
    }

    public void setIncidentNumber(String incidentNumber) {
        this.incidentNumber = incidentNumber;
    }

    public ProductName getProductName() {
        return productName;
    }

    public void setProductName(ProductName productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getNoInvolved() {
        return noInvolved;
    }

    public void setNoInvolved(String noInvolved) {
        this.noInvolved = noInvolved;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getEanBarCode() {
        return eanBarCode;
    }

    public void setEanBarCode(String eanBarCode) {
        this.eanBarCode = eanBarCode;
    }

    public MainReason getMainReason() {
        return mainReason;
    }

    public void setMainReason(MainReason mainReason) {
        this.mainReason = mainReason;
    }

    public AltReason getAltReason() {
        return altReason;
    }

    public void setAltReason(AltReason altReason) {
        this.altReason = altReason;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public RegularUser getRegularUser() {
        return regularUser;
    }

    public void setRegularUser(RegularUser regularUser) {
        this.regularUser = regularUser;
    }

    public ProductSample getProductSample() {
        return productSample;
    }

    public void setProductSample(ProductSample productSample) {
        this.productSample = productSample;
    }

    public Investigation getInvestigation() {
        return investigation;
    }

    public void setInvestigation(Investigation investigation) {
        this.investigation = investigation;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getSampleSentDate() {
        return sampleSentDate;
    }

    public void setSampleSentDate(String sampleSentDate) {
        this.sampleSentDate = sampleSentDate;
    }

    public String getSampleReceivedDate() {
        return sampleReceivedDate;
    }

    public void setSampleReceivedDate(String sampleReceivedDate) {
        this.sampleReceivedDate = sampleReceivedDate;
    }

    public String getProductNotes() {
        return productNotes;
    }

    public void setProductNotes(String productNotes) {
        this.productNotes = productNotes;
    }

    public String getMainReasonNotes() {
        return mainReasonNotes;
    }

    public void setMainReasonNotes(String mainReasonNotes) {
        this.mainReasonNotes = mainReasonNotes;
    }

    public String getAltReasonNotes() {
        return altReasonNotes;
    }

    public void setAltReasonNotes(String altReasonNotes) {
        this.altReasonNotes = altReasonNotes;
    }

    public String getProductSummaryNotes() {
        return productSummaryNotes;
    }

    public void setProductSummaryNotes(String productSummaryNotes) {
        this.productSummaryNotes = productSummaryNotes;
    }
}
