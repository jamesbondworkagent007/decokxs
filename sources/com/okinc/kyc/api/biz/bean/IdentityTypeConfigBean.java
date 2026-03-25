package com.okinc.kyc.api.biz.bean;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes23.dex */
public final class IdentityTypeConfigBean {
    public static final int $stable = 8;
    private ArrayList<IdentityTypeConfig> certificateTypes;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<IdentityTypeConfig> getCertificateTypes() {
        return this.certificateTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCertificateTypes(ArrayList<IdentityTypeConfig> arrayList) {
        this.certificateTypes = arrayList;
    }
}
