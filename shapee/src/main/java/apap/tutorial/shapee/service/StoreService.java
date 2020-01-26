package apap.tutorial.shapee.service;


import java.util.List;
import apap.tutorial.shapee.model.StoreModel;



public interface StoreService {

    // Method menambahkan store
    void addStore(StoreModel store);

    // Method mendapatkan semua list store yang tersimpan
    List<StoreModel> getStoreList();

    // Method mendapatkan store berdasarkan id
    StoreModel getStoreById(String idStore);
}
