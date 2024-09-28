package dk.rn.modalitylist;

import com.atlassian.confluence.plugins.createcontent.api.contextproviders.AbstractBlueprintContextProvider;
import com.atlassian.confluence.plugins.createcontent.api.contextproviders.BlueprintContext;

public class ModalitylistContextProvider extends AbstractBlueprintContextProvider {
    @Override
    protected BlueprintContext updateBlueprintContext(BlueprintContext blueprintContext) {
        blueprintContext.put("vName", "Sherlock");
        return blueprintContext;
    }
}
