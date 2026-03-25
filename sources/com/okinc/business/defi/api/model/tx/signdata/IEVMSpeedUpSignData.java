package com.okinc.business.defi.api.model.tx.signdata;

/* JADX INFO: loaded from: classes3.dex */
public interface IEVMSpeedUpSignData {
    String getGasLimit();

    String getGasPrice();

    String getInputData();

    String getNonce();

    String getPriorityFee();
}
