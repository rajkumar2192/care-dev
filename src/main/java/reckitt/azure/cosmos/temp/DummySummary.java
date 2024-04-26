package reckitt.azure.cosmos.temp;

import reckitt.azure.cosmos.summary.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DummySummary {

    public Summary getSummary() {

        Level level1 = new Level();
        level1.setLevelCode("ENA");
        level1.setLevelDescription("ENA");
        Level level2 = new Level();
        level2.setLevelCode("USA");
        level2.setLevelDescription("United States of America");
        List<Level> levelList = new ArrayList<>();
        levelList.add(level1);
        levelList.add(level2);

        ModifiedBy modifiedBy = new ModifiedBy();
        modifiedBy.setCode("abd");
        modifiedBy.setCodeDescription("desc");
        modifiedBy.setLevels(levelList);

        EnteredBy enteredBy = new EnteredBy();
        enteredBy.setCode("abd");
        enteredBy.setCodeDescription("desc");
        enteredBy.setLevels(levelList);

        Origin origin = new Origin();
        origin.setCode("abd");
        origin.setCodeDescription("desc");
        origin.setLevels(levelList);

        AssignedTo assignedTo = new AssignedTo();
        assignedTo.setCode("abd");
        assignedTo.setCodeDescription("desc");
        assignedTo.setLevels(levelList);

        ContactType contactType = new ContactType();
        contactType.setCode("abd");
        contactType.setCodeDescription("desc");
        contactType.setLevels(levelList);

        ClosedBy closedBy = new ClosedBy();
        closedBy.setCode("abd");
        closedBy.setCodeDescription("desc");
        closedBy.setLevels(levelList);

        Status status = new Status();
        status.setCode("abd");
        status.setCodeDescription("desc");
        status.setLevels(levelList);

        Country country = new Country();
        country.setCode("abd");
        closedBy.setCodeDescription("desc");
        closedBy.setLevels(levelList);

        Store store = new Store();
        store.setCode("abd");
        status.setCodeDescription("desc");
        status.setLevels(levelList);

        Summary summary = new Summary();
        summary.setIncidentNumber("R071188980");
        summary.setLastModifiedDate("2023-07-25 13:31:06");
        summary.setModifiedBy(modifiedBy);
        summary.setEnteredBy(enteredBy);
        summary.setDateEntered("2023-05-29");
        summary.setTimeEntered("16:59");
        summary.setDateReceived("2023-05-26");
        summary.setLegalHold(true);
        summary.setOrigin(origin);
        summary.setAssignedTo(assignedTo);
        summary.setContactType(contactType);
        summary.setDateClosed("2023-05-29");
        summary.setTimeClosed("16:59");
        summary.setClosedBy(closedBy);
        summary.setStatus(status);
        summary.setDateExpiry("3003-10-04");
        summary.setCountry(country);
        summary.setStore(store);
        summary.setStoreLocation("Pago Pago");
        summary.setStoreState("AS");
        summary.setIncidentNotes("---> SFI International - May 29, 2023 at 16:38:24 \rThis is a test notes for RB\rThis is line 2 \rThis is line 3\rThis is line 4 \r---> SFI International - May 29, 2023 at 17:09:09 \rLEGAL HOLD: YES 05/29/2023");

        return summary;
    }
}
