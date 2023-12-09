// PARADIGMAS DE PROGRAMACIÓN LABORATORIO 3
// Nombre: Elías Zúñiga Tobar
// RUT: 21.141.368-9
// Profesor Gonzalo Matrinez
// TDA FLOW

package org.example;

import java.util.ArrayList;
import java.util.List;

public class flow_21141368_ZunigaTobar {
    int flowId;
    String nameMsg;
    List<option_21141368_ZunigaTobar> options;

    /**
     *
     * @param ID
     * @param Name
     * @param options
     */
    public flow_21141368_ZunigaTobar(int ID, String Name, List<option_21141368_ZunigaTobar> options){
        this.flowId = ID;
        this.nameMsg = Name;
        List<option_21141368_ZunigaTobar> optionsFiltrados = new ArrayList<>();
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

    /**
     *
     * @param option
     */
    public void flowAddOption(option_21141368_ZunigaTobar option){
        List<Integer> IDs = getOptionsIds(options);
        int optionId = option.getOptionId();
        if (!IDs.contains(optionId)) {
            this.options.add(option);
        }
    }

    /**
     *
     * @return
     */
    public int getFlowId() {
        return flowId;
    }

    /**
     *
     * @param id
     */
    public void setFlowId(int id) {
        this.flowId = id;
    }

    /**
     *
     * @return
     */
    public String getNameMsg() {
        return nameMsg;
    }

    /**
     *
     * @param nameMsg
     */
    public void setNameMsg(String nameMsg) {
        this.nameMsg = nameMsg;
    }

    /**
     *
     * @return
     */
    public List<option_21141368_ZunigaTobar> getOptions() {
        return options;
    }

    /**
     *
     * @param options
     */
    public void setOptions(List<option_21141368_ZunigaTobar> options) {
        this.options = options;
    }

    /**
     *
     * @param options
     * @return
     */
    public List<Integer> getOptionsIds(List<option_21141368_ZunigaTobar> options){
        List<Integer> optionsIds = new ArrayList<>();
        for (option_21141368_ZunigaTobar op : options){
            optionsIds.add(op.getOptionId());
        }
        return optionsIds;
    }
}
