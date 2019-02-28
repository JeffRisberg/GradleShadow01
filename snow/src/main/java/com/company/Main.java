package com.company;

import com.company.models.Item;
import com.company.stores.ItemStore;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Main {

  public static void main(String[] args) {

    ItemStore itemStore = new ItemStore();

    List<Item> list = itemStore.readAllItems();
    for (Item listItem : list) {
      System.out.println(listItem);
    }

    log.debug("Welcome to Example 1");
  }
}
