package com.wework.project.service;

import java.util.List;

public interface PartitionService {

    /**
     * Fonction qui permet de partionner une liste à des sous listes avec une taille précise {@param size}
     *
     * @param originalList la liste original
     * @param size         la nouvelle taille des sous listes
     * @return une list des sous listes
     * @throws IllegalArgumentException Si la liste est null ou la taille est inférieur ou egale à zéro
     */
    List<List<Integer>> partition(List<Integer> originalList, int size);

}
