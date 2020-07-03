package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hive.metastore.MetaStoreEventListener;
import org.apache.hadoop.hive.metastore.api.MetaException;
import org.apache.hadoop.hive.metastore.events.DropTableEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DropTableListener extends MetaStoreEventListener  {
    private static final Logger log = LoggerFactory.getLogger(DropTableListener.class);


    public DropTableListener(Configuration config) {
        super(config);
        log.info("DropTableHook created ");
    }
    @Override
    public void onDropTable(DropTableEvent tableEvent) throws MetaException {
        //System.out.println(tableEvent.getTable()+" Table dropped succesfully");
        log.info(tableEvent.getTable()+ " Table dropped succesfully");

    }

}