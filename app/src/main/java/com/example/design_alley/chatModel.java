package com.example.design_alley;

import java.util.Optional;

public class chatModel {
    private String Inmessages;
    private String OutMesages;
    public chatModel(String inmessages,String outMesages){
        this.Inmessages = inmessages;
        this.OutMesages = outMesages;
    }

    public String getInmessages() {
        return Inmessages;
    }

    public String getOutMesages() {
        return OutMesages;
    }
}

