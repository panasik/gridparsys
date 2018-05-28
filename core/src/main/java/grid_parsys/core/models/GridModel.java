package grid_parsys.core.models;


import grid_parsys.core.Columns;
import org.apache.felix.scr.annotations.Component;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Model(adaptables = Resource.class)

public class GridModel {
    @Inject
    private String columns;



    private List<Columns> col;


    @PostConstruct

    public void init() {

        col = new ArrayList<Columns>();


        if (columns != null) {
            Integer columnsNumber = Integer.parseInt(columns);
            int sizeCol = 12 / columnsNumber;
            Map<String, String> map = new HashMap<String, String>();
            map.put("class", "col s" + sizeCol);

            for (int i = 0; i < columnsNumber; i++) {
                Columns columns = new Columns();
                columns.setNumberColumns(i + 1);
                columns.setAttribut(map);
                col.add(columns);
            }

        } else {
            Integer columnNumber = 1;
            Map<String, String> map = new HashMap<String, String>();
            map.put("class", "col s12");
            Columns columns = new Columns();
            columns.setNumberColumns(columnNumber);
            columns.setAttribut(map);
        }
        setCol(col);




    }

    public String getColumns() {
        return columns;
    }

    public void setColumns(String columns) {
        this.columns = columns;
    }

    public List<Columns> getCol() {
        return col;
    }

    public void setCol(List<Columns> col) {
        this.col = col;
    }


}
