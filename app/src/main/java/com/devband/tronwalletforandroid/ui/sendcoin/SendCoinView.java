package com.devband.tronwalletforandroid.ui.sendcoin;

import com.devband.tronwalletforandroid.ui.mvp.IView;

public interface SendCoinView extends IView {

    void sendCoinResult(boolean result);

    void invalidPassword();
}
