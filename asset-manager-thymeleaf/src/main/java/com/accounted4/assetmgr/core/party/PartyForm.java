package com.accounted4.assetmgr.core.party;

import com.accounted4.assetmgr.core.RecordMetaData;
import com.accounted4.assetmgr.core.RecordMetaDataHolder;
import com.accounted4.assetmgr.core.address.AddressForm;
import java.util.List;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Backing bean for the Party form.
 * TODO:  should there be two beans:
 *   1) a true "Party" bean with the id, version, etc
 *   2) this backing form bean with only the fields of interest and whatever utility methods the form may require
 * Or is this overkill at this stage?  For now treating as one bean until there is a need to separate.
 * 
 */
public class PartyForm implements RecordMetaDataHolder {
    
    private static final String NOT_BLANK_MESSAGE = "{notBlank.message}";

    
    @Getter @Setter
    @NotBlank(message = PartyForm.NOT_BLANK_MESSAGE)
    @Size(min = 2)
    private String partyName;

    @Getter @Setter
    private String notes;    
    
    @Getter @Setter
    private RecordMetaData recordMetaData = new RecordMetaData();
    
    @Getter @Setter
    private List<AddressForm> addresses;
    
}
