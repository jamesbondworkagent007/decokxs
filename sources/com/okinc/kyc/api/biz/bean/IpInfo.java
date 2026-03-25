package com.okinc.kyc.api.biz.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class IpInfo implements Serializable {
    public static final int $stable = 8;
    private IpInfoCountry country;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IpInfoCountry getCountry() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountry(IpInfoCountry ipInfoCountry) {
        this.country = ipInfoCountry;
    }
}
