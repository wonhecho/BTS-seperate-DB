package net.api.cho.stockdata.stock.Wallet.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class KlayDto {

    private String from;
    private String to;
    private double value;

    public KlayDto(String from,String to,Integer value){
        this.from = from;
        this.to = to;
        this.value = value;
    }
}
