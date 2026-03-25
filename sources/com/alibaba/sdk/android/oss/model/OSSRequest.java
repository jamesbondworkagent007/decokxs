package com.alibaba.sdk.android.oss.model;

/* JADX INFO: loaded from: classes2.dex */
public class OSSRequest {
    private boolean isAuthorizationRequired = true;
    private Enum CRC64 = CRC64Config.NULL;

    public enum CRC64Config {
        NULL,
        YES,
        NO
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Enum getCRC64() {
        return this.CRC64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isAuthorizationRequired() {
        return this.isAuthorizationRequired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCRC64(Enum r1) {
        this.CRC64 = r1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setIsAuthorizationRequired(boolean z) {
        this.isAuthorizationRequired = z;
    }
}
