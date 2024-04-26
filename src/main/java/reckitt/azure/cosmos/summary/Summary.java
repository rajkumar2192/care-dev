package reckitt.azure.cosmos.summary;

public class Summary {

    private String incidentNumber;
    private String lastModifiedDate;
    private ModifiedBy modifiedBy;
    private EnteredBy enteredBy;
    private String dateEntered;
    private String timeEntered;
    private String dateReceived;
    private boolean legalHold;
    private Origin origin;
    private AssignedTo assignedTo;
    private ContactType contactType;
    private String dateClosed;
    private String timeClosed;
    private ClosedBy closedBy;
    private Status status;
    private String dateExpiry;
    private Country country;
    private Store store;
    private String storeLocation;
    private String storeState;
    private String incidentNotes;

    public String getIncidentNumber() {
        return incidentNumber;
    }

    public void setIncidentNumber(String incidentNumber) {
        this.incidentNumber = incidentNumber;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public ModifiedBy getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(ModifiedBy modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public EnteredBy getEnteredBy() {
        return enteredBy;
    }

    public void setEnteredBy(EnteredBy enteredBy) {
        this.enteredBy = enteredBy;
    }

    public String getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(String dateEntered) {
        this.dateEntered = dateEntered;
    }

    public String getTimeEntered() {
        return timeEntered;
    }

    public void setTimeEntered(String timeEntered) {
        this.timeEntered = timeEntered;
    }

    public String getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(String dateReceived) {
        this.dateReceived = dateReceived;
    }

    public boolean isLegalHold() {
        return legalHold;
    }

    public void setLegalHold(boolean legalHold) {
        this.legalHold = legalHold;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public AssignedTo getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(AssignedTo assignedTo) {
        this.assignedTo = assignedTo;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public String getDateClosed() {
        return dateClosed;
    }

    public void setDateClosed(String dateClosed) {
        this.dateClosed = dateClosed;
    }

    public String getTimeClosed() {
        return timeClosed;
    }

    public void setTimeClosed(String timeClosed) {
        this.timeClosed = timeClosed;
    }

    public ClosedBy getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(ClosedBy closedBy) {
        this.closedBy = closedBy;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDateExpiry() {
        return dateExpiry;
    }

    public void setDateExpiry(String dateExpiry) {
        this.dateExpiry = dateExpiry;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public String getStoreState() {
        return storeState;
    }

    public void setStoreState(String storeState) {
        this.storeState = storeState;
    }

    public String getIncidentNotes() {
        return incidentNotes;
    }

    public void setIncidentNotes(String incidentNotes) {
        this.incidentNotes = incidentNotes;
    }
}
