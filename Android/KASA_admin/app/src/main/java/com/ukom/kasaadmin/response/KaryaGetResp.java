package com.ukom.kasaadmin.response;

import com.ukom.kasaadmin.model.KaryaModel;

import java.util.List;

public class KaryaGetResp {
    private List<KaryaModel> data;

    public KaryaGetResp(List<KaryaModel> data) {
        this.data = data;
    }

    public List<KaryaModel> getData() {
        return data;
    }

    public void setData(List<KaryaModel> data) {
        this.data = data;
    }
}
