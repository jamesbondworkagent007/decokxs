package com.okinc.web3.security.service;

/* JADX INFO: loaded from: classes12.dex */
public final class Web3SecurityServiceProvider {
    public static final int $stable = 0;
    public static final Web3SecurityServiceProvider INSTANCE = new Web3SecurityServiceProvider();

    private Web3SecurityServiceProvider() {
    }

    public static final Web3SecurityService getService() {
        return new Web3SecurityServiceImpl();
    }
}
