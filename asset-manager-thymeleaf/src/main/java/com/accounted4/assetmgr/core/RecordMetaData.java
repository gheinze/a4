package com.accounted4.assetmgr.core;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gheinze
 */
public class RecordMetaData {

    @Getter @Setter
    private long id;
    
    @Getter @Setter
    private int version;

    @Getter @Setter
    private boolean inactive;
    
    @Getter @Setter
    private boolean editMode = false;

    public boolean isInsertMode() {
        return !editMode;
    }
    
}
