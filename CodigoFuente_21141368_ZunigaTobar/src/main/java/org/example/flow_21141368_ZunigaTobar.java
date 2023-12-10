// PARADIGMAS DE PROGRAMACIÓN LABORATORIO 3
// Nombre: Elías Zúñiga Tobar
// RUT: 21.141.368-9
// Profesor Gonzalo Matrinez
// TDA FLOW

package org.example;

import java.util.ArrayList;
import java.util.List;

public class flow_21141368_ZunigaTobar implements i_flow_21141368_ZunigaTobar{
    int flowId;
    String nameMsg;
    List<option_21141368_ZunigaTobar> options;

    /**
     * Consturctor flow_21141368_ZunigaTobar
     * @param ID;
     * @param Name;
     * @param options;
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
     * Modificador flowAddOption
     * @param option;
     */
    @Override
    public void flowAddOption(option_21141368_ZunigaTobar option){
        List<Integer> IDs = getOptionsIds(options);
        int optionId = option.getOptionId();
        if (!IDs.contains(optionId)) {
            this.options.add(option);
        }
    }

    /**
     * Selector getFlowId
     * @return int
     */
    @Override
    public int getFlowId() {
        return flowId;
    }

    /**
     * Selector getNameMsg
     * @return String
     */
    @Override
    public String getNameMsg() {
        return nameMsg;
    }

    /**
     * Selector getOptions
     * @return List;
     */
    @Override
    public List<option_21141368_ZunigaTobar> getOptions() {
        return options;
    }

    /**
     * Modificador setOptions
     * @param options;
     */
    @Override
    public void setOptions(List<option_21141368_ZunigaTobar> options) {
        this.options = options;
    }

    /**
     * Selector getOptionsIds
     * @param options;
     * @return List
     */
    @Override
    public List<Integer> getOptionsIds(List<option_21141368_ZunigaTobar> options){
        List<Integer> optionsIds = new ArrayList<>();
        for (option_21141368_ZunigaTobar op : options){
            optionsIds.add(op.getOptionId());
        }
        return optionsIds;
    }
}
