package com.devband.tronlib.tronscan;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FrozenTrx {

    private long expires;
    private long amount;
}