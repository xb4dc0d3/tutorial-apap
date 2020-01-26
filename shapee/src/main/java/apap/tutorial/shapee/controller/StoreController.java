package apap.tutorial.shapee.controller;

import apap.tutorial.shapee.model.StoreModel;
import apap.tutorial.shapee.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StoreController {

    @Autowired
    private StoreService storeService;

    // URL Mapping
    @RequestMapping("/store/add")
    public String add(
            @RequestParam(value = "idStore", required = true) String idStore,
            @RequestParam(value = "nama", required = true) String nama,
            @RequestParam(value = "keterangan", required = true) String keterangan,
            @RequestParam(value = "followers", required = true) int followers,
            Model model
    ) {

        // Membuat objek store model
        StoreModel store = new StoreModel(idStore, nama, keterangan, followers);

        // Memanggil service add Store
        storeService.addStore(store);

        // Memasukkan attribute nama pada view template dengan variable nama
        model.addAttribute("nama", nama);

        return "add-store";

    }

    @RequestMapping("/store/view")
    public String view(
            @RequestParam(value = "idStore") String idStore, Model model) {

        // Mengambil objek store berdasarkan id
        StoreModel store = storeService.getStoreById(idStore);

        // Add object store ke "store" untuk di render
        model.addAttribute("store", store);

        // Return view template
        return "view-store";

    }

    @RequestMapping("/store/view-all")
    public String viewAll(Model model){

        // Mengambil semua store list dari service
        List<StoreModel> storeList = storeService.getStoreList();


        // Add object storeList untuk di render
        model.addAttribute("storeList", storeList);

        return "view-all-store";
    }
}
