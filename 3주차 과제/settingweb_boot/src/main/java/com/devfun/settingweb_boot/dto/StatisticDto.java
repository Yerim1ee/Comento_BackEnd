package com.devfun.settingweb_boot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class StatisticDto {
    private int totCnt;
    private String year;
    private boolean is_success;
}
