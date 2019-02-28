package com.company;

import com.company.models.Item;
import com.company.stores.ItemStore;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;

@Slf4j
public class Main {

  public static void main(String[] args) {

    try {
      ItemStore itemStore = new ItemStore();

      List<Item> list = itemStore.readAllItems();
      for (Item listItem : list) {
        System.out.println(listItem);
      }

      Reader in = new FileReader("people.csv");
      Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
      for (CSVRecord record : records) {
        String lastName = record.get("Last Name");
        String firstName = record.get("First Name");

        System.out.println(firstName + " " + lastName);
      }

      log.debug("Welcome to Example 1");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
