package grid_parsys.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;


@Model(adaptables = Resource.class)

public class GridModel {
    @Inject
    private Integer columns;

    @Inject
    private Integer rows;


    public Integer getColumns() {
        return columns;
    }

    public Integer getRows() {
        return rows;
    }
}
