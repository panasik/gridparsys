package grid_parsys.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

import javax.inject.Inject;


@Model(adaptables = Resource.class)
public class HeroComponent {
    @Inject
    @Optional
    private String textTitle;
    @Inject
    @Optional
    private String texD;
    @Inject
    @Optional
    private String link;

    @Inject
    private String fileReference;


    public String getTextTitle() {
        return textTitle;
    }

    public String getTexD() {
        return texD;
    }

    public String getLink() {
        return link;
    }

    public String getFileReference() {
        return fileReference;
    }
}
