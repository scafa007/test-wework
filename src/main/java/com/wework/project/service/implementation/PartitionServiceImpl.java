package com.wework.project.service.implementation;

import com.wework.project.service.PartitionService;

import java.util.ArrayList;
import java.util.List;


public class PartitionServiceImpl implements PartitionService {

    /**
     * Fonction qui permet de partionner une liste à des sous listes avec une taille précise {@param size}
     *
     * @param originalList la liste original
     * @param size         la nouvelle taille des sous listes
     * @return une list des sous listes
     * @throws IllegalArgumentException Si la liste est null ou la taille est inférieur ou egale à zéro
     */
    public List<List<Integer>> partition(List<Integer> originalList, int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("la taille des sous listes doit être supérieur à zero");
        }
        if (originalList == null) {
            throw new IllegalArgumentException("La liste ne doit pas être null");
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tmpResult = new ArrayList<>();
        int originalSize = originalList.size();
        for (int i = 0; i < originalSize; i++) {
            if (0 == i % size) {
                tmpResult = new ArrayList<>();
                result.add(tmpResult);
            }
            tmpResult.add(originalList.get(i));
        }
        return result;
    }



}
