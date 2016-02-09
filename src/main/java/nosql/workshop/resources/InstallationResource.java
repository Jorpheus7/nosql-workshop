package nosql.workshop.resources;

import com.google.inject.Inject;
import net.codestory.http.Context;
import net.codestory.http.annotations.Get;
import nosql.workshop.model.Installation;
import nosql.workshop.model.stats.InstallationsStats;
import nosql.workshop.services.InstallationService;

import java.util.List;

/**
 * Resource permettant de gérer l'accès à l'API pour les Installations.
 */
public class InstallationResource {

    private final InstallationService service;

    @Inject
    public InstallationResource(InstallationService service) {
        this.service = service;
    }


    @Get("/")
    @Get("")
    public List<Installation> list(Context context) {
        return null;
    }

    @Get("/:numero")
    public Installation get(String numero) {
        return service.getInstallation(numero);
    }


    @Get("/random")
    public Installation random() {

        return service.getRandomInstallation();
    }

    @Get("/search")
    public List<Installation> search(Context context) {
        return null;

    }

    @Get("/geosearch")
    public List<Installation> geosearch(Context context) {
        //context.query().get("param")
        return null;

    }

    @Get("/stats")
    public InstallationsStats stats() {
        return service.getStats();

    }
}
