package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class tda_flow_21141368_ZunigaTobar {
    int id;
    String nameMsg;
    List<tda_option_21141368_ZunigaTobar> options;

    public tda_flow_21141368_ZunigaTobar(int ID, String Name, List<tda_option_21141368_ZunigaTobar> options){
        this.id = ID;
        this.nameMsg = Name;
        List<tda_option_21141368_ZunigaTobar> optionsFiltrados = new ArrayList<>();
        while (!options.isEmpty()){
            List<Integer> optionsFiltradosIds = getOptionsIds(optionsFiltrados);
            int optionHeadId = options.get(0).getOptionId();
            if (!optionsFiltradosIds.contains(optionHeadId)){
                optionsFiltrados.add(options.get(0));
            }
            options.remove(0);
        }
        this.options = optionsFiltrados;
    }

    public void flowAddOption(tda_option_21141368_ZunigaTobar option){
        List<Integer> IDs = getOptionsIds(options);
        int optionId = option.getOptionId();
        if (!IDs.contains(optionId)) {
            this.options.add(option);
        }
    }

    public int getFlowId() {
        return id;
    }

    public void setFlowId(int id) {
        this.id = id;
    }

    public String getNameMsg() {
        return nameMsg;
    }

    public void setNameMsg(String nameMsg) {
        this.nameMsg = nameMsg;
    }

    public List<tda_option_21141368_ZunigaTobar> getOptions() {
        return options;
    }

    public void setOptions(List<tda_option_21141368_ZunigaTobar> options) {
        this.options = options;
    }

    public List<Integer> getOptionsIds(List<tda_option_21141368_ZunigaTobar> options){
        List<Integer> Ids = new ArrayList<>();
        while (!options.isEmpty()) {
            Ids.add(options.get(0).getOptionId());
            options.remove(0);
        }
        return Ids;
    }
}
