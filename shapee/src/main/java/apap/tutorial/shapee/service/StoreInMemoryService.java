package apap.tutorial.shapee.service;


import apap.tutorial.shapee.model.StoreModel;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import javax.xml.ws.ServiceMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class StoreInMemoryService implements StoreService {

    private List<StoreModel> listStore;

    public StoreInMemoryService() {
        listStore = new ArrayList<>();
    }

    @Override
    public void addStore(StoreModel store) {

        listStore.add(store);

    }

    @Override
    public List<StoreModel> getStoreList() {

        return listStore;
    }

    @Override
    public StoreModel getStoreById(String idStore) {

        Optional<StoreModel> returnedStore = Optional.empty();

        for(StoreModel store: listStore){

            if (store.getId().equals(idStore)){

                returnedStore = Optional.of(store);
            }
        }

        return returnedStore.orElse(null);
    }
}
