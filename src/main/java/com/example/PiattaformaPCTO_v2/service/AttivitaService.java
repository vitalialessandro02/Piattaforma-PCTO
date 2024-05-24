package com.example.PiattaformaPCTO_v2.service;

import com.example.PiattaformaPCTO_v2.collection.Attivita;
import com.example.PiattaformaPCTO_v2.dto.ActivityViewDTOPair;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface AttivitaService {

    String save(Attivita attivita);
/*
    void upload();
*/
    /**
     * metodo che aggiunge l'attività con nome e anno
     * @param file su cui inserire gli studenti partecipanti
     * @param anno in cui si svolge l'attività
     * @param nome nome dell'attività
     */
    void uploadConAnno(MultipartFile file,int anno,String nome);
/*
    void uploadSummer();

    void uploadCartel();

    void uploadMontani(MultipartFile file);




    void uploadOpen(MultipartFile file);


    void uploadGioco(MultipartFile file);


    void uploadG(MultipartFile file);

    void uploadNerd(MultipartFile file);

    void uploadOpen23(MultipartFile file);

    void uploadLab(MultipartFile file);

    void uploadStem(MultipartFile file);

    void uploadScuoleA(MultipartFile file);

    void uploadLabOpen(MultipartFile file);


    void uploadGenerico (MultipartFile file, String nome);

    void uploadPau23(MultipartFile file);


    void uploaedContest23(MultipartFile file);

    void uploadRecanati23(MultipartFile file);
*/
Sheet fileOpenerHelper(MultipartFile file);

    /**
     * Find information about students that chose UNICAM and their high school, given an activity.
     *
     * @return list of activity view pairs
     */
    List<ActivityViewDTOPair> findStudentsFromActivity(String activityName);


    List<Attivita> getAttivita(int anno);


    void prova();


}
