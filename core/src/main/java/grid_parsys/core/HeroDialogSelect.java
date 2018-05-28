package grid_parsys.core;


import com.adobe.cq.sightly.WCMUse;
import com.adobe.granite.ui.components.ds.DataSource;
import com.adobe.granite.ui.components.ds.EmptyDataSource;
import com.adobe.granite.ui.components.ds.SimpleDataSource;
import com.adobe.granite.ui.components.ds.ValueMapResource;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceMetadata;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.wrappers.ValueMapDecorator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class HeroDialogSelect extends WCMUse {


    @Override
    public void activate() throws Exception {
        getRequest().setAttribute(DataSource.class.getName(),EmptyDataSource.instance());
        ResourceResolver resolver = getResource().getResourceResolver();
        List<Resource> listResources = new ArrayList<Resource>();
        ValueMap valueMap = null;
        for (Integer i = 1; i<7;i++){
            if(i==5){
                continue;
            }else{
            valueMap=new ValueMapDecorator(new HashMap<String, Object>());

            String text = i+" column";
            String value = i.toString();
            valueMap.put("text", text);
            valueMap.put("value", value);
            listResources.add(new ValueMapResource(resolver, new ResourceMetadata(), "nt:unstructured", valueMap));
            DataSource ds = new SimpleDataSource(listResources.iterator());
            getRequest().setAttribute(DataSource.class.getName(), ds);
            }
        }
    }
}
