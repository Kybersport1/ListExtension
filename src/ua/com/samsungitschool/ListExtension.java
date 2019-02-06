package ua.com.samsungitschool;

import sun.rmi.log.LogInputStream;

import java.util.List;

public class ListExtension implements IListDeleteByFilter<Integer>{

    @Override
    public List<Integer> deleteFromList(List<Integer> list, Integer deleteFilterKey) {

        /*for(int i = 0;i <list.size() ; i++){
            if(list.contains(deleteFilterKey)){
                list.remove(deleteFilterKey);
            }
        }*/
        int i = 0;
        while(list.contains(deleteFilterKey)){
            list.remove(deleteFilterKey);
            i++;
        }
        return list;
    }

}
