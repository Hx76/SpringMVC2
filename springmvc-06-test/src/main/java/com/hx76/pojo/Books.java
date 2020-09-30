package com.hx76.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    public Integer bookID;
    public String bookName;
    public Integer number;
    public String comment;
}
