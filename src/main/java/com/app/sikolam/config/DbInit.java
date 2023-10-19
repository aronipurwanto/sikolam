package com.app.sikolam.config;

import com.app.sikolam.constant.CommonConstant;
import com.app.sikolam.entity.LookupEntity;
import com.app.sikolam.entity.NilaiEntity;
import com.app.sikolam.respository.LookupRepo;
import com.app.sikolam.respository.NilaiRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class DbInit implements CommandLineRunner {
    private final LookupRepo lookupRepo;
    private final NilaiRepo nilaiRepo;

    private void lookupInit(){
        if(lookupRepo.findByGroup(CommonConstant.GROUP_NILAI).size() == 0) {
            lookupRepo.saveAll(
                    Arrays.asList(
                            new LookupEntity(UUID.randomUUID().toString(),CommonConstant.GROUP_NILAI, "NILAI_IBADAH","Ibadah", 1),
                            new LookupEntity(UUID.randomUUID().toString(),CommonConstant.GROUP_NILAI, "NILAI_KHALIFAH","Khalifah", 2),
                            new LookupEntity(UUID.randomUUID().toString(),CommonConstant.GROUP_NILAI, "NILAI_DAKWAH","Dakwah", 3)
                    )
            );
        }

        if(lookupRepo.findByGroup(CommonConstant.GROUP_IBADAH).size() == 0){
            lookupRepo.saveAll(
                    Arrays.asList(
                            new LookupEntity(UUID.randomUUID().toString(),CommonConstant.GROUP_IBADAH, "IBADAH_IMAN","Iman", 0),
                            new LookupEntity(UUID.randomUUID().toString(),CommonConstant.GROUP_IBADAH, "IBADAH_ISLAM","Islam", 1)
                    )
            );
        }

        if(lookupRepo.findByGroup(CommonConstant.GROUP_KHALIFAH).size() == 0) {
            lookupRepo.saveAll(
                    Arrays.asList(
                            new LookupEntity(UUID.randomUUID().toString(),CommonConstant.GROUP_KHALIFAH, "KHALIFAH_LOGIKA","Logika", 1),
                            new LookupEntity(UUID.randomUUID().toString(),CommonConstant.GROUP_KHALIFAH, "KHALIFAH_LITERASI","Literasi", 2),
                            new LookupEntity(UUID.randomUUID().toString(),CommonConstant.GROUP_KHALIFAH, "KHALIFAH_BAKAT","Bakat", 3),
                            new LookupEntity(UUID.randomUUID().toString(),CommonConstant.GROUP_KHALIFAH, "KHALIFAH_FISIK","Fisik", 4),
                            new LookupEntity(UUID.randomUUID().toString(),CommonConstant.GROUP_KHALIFAH, "KHALIFAH_SKILLSET","Skillset", 5),
                            new LookupEntity(UUID.randomUUID().toString(),CommonConstant.GROUP_KHALIFAH, "KHALIFAH_KONSERVASI_ALAM","Konservasi Alam", 6),
                            new LookupEntity(UUID.randomUUID().toString(),CommonConstant.GROUP_KHALIFAH, "KHALIFAH_LEADERSHIP","Leadership", 7),
                            new LookupEntity(UUID.randomUUID().toString(),CommonConstant.GROUP_KHALIFAH, "KHALIFAH_ENTERPRENEURSHIP","Enterpreneurship", 8),
                            new LookupEntity(UUID.randomUUID().toString(),CommonConstant.GROUP_KHALIFAH, "KHALIFAH_TECHNOLOGY","Technology", 9)
                    )
            );
        }

        if(lookupRepo.findByGroup(CommonConstant.GROUP_DAKWAH).size() == 0) {
            lookupRepo.saveAll(
                    Arrays.asList(
                            new LookupEntity(UUID.randomUUID().toString(),CommonConstant.GROUP_DAKWAH, "DAKWAH_KEBAIKAN","Kebaikan", 1),
                            new LookupEntity(UUID.randomUUID().toString(),CommonConstant.GROUP_DAKWAH, "DAKWAH_KEBENARAN","Kebenaran", 2)
                    )
            );
        }
    }

    private void nilaiInit(){
        if(nilaiRepo.findByCategory("IBADAH_IMAN").size() == 0){
            nilaiRepo.saveAll( Arrays.asList(
                    new NilaiEntity(UUID.randomUUID().toString(), "IMAN_KHAUF","Khauf", "IBADAH_IMAN",1),
                    new NilaiEntity(UUID.randomUUID().toString(), "IMAN_ROJA","Roja", "IBADAH_IMAN",2),
                    new NilaiEntity(UUID.randomUUID().toString(), "IMAN_TAWAKKAL","Tawakkal", "IBADAH_IMAN",3),
                    new NilaiEntity(UUID.randomUUID().toString(), "IMAN_MUROQOBATULLAH","Muroqobatullah", "IBADAH_IMAN",4),
                    new NilaiEntity(UUID.randomUUID().toString(), "IMAN_YAKIN","Yakin", "IBADAH_IMAN",5),
                    new NilaiEntity(UUID.randomUUID().toString(), "IMAN_THOAT","Thoat", "IBADAH_IMAN",6),
                    new NilaiEntity(UUID.randomUUID().toString(), "IMAN_TAUBAT","Taubat", "IBADAH_IMAN",7),
                    new NilaiEntity(UUID.randomUUID().toString(), "IMAN_MUJAHADAH","Mujahadah", "IBADAH_IMAN",8),
                    new NilaiEntity(UUID.randomUUID().toString(), "IMAN_RIDHO","Ridho", "IBADAH_IMAN",9),
                    new NilaiEntity(UUID.randomUUID().toString(), "IMAN_TADZIM","Tadzim", "IBADAH_IMAN",10)
                    )
            );
        }
    }

    @Override
    public void run(String... args) throws Exception {
        lookupInit();
        nilaiInit();
    }
}
