package com.okinc.fiat.api.bean;

/* JADX INFO: loaded from: classes15.dex */
public interface IFiatCryptoCoin {
    Boolean getCurrencyChannelAvailable();

    int getCurrencyDecimal();

    String getCurrencyIcon();

    String getCurrencySimple();

    String getDigitalCurrencyId();

    int getPriceDecimal();

    FiatCryptoRange getRange();
}
