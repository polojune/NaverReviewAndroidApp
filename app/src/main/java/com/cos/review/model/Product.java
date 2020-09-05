package com.cos.review.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
        private int id;
        private String blogUrl;
        private String title;
        private String thumnail;
        private String day;
        private SearchKeyword keywords;
        private Timestamp createDate;



}
