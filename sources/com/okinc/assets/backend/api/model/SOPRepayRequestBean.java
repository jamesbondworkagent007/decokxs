package com.okinc.assets.backend.api.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class SOPRepayRequestBean implements Serializable {
    public static final int $stable = 8;
    private int id;
    private boolean rpCoin;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SOPRepayRequestBean copy$default(SOPRepayRequestBean sOPRepayRequestBean, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = sOPRepayRequestBean.rpCoin;
        }
        if ((i2 & 2) != 0) {
            i = sOPRepayRequestBean.id;
        }
        return sOPRepayRequestBean.copy(z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.rpCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SOPRepayRequestBean copy(boolean z, int i) {
        return new SOPRepayRequestBean(z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SOPRepayRequestBean)) {
            return false;
        }
        SOPRepayRequestBean sOPRepayRequestBean = (SOPRepayRequestBean) obj;
        return this.rpCoin == sOPRepayRequestBean.rpCoin && this.id == sOPRepayRequestBean.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRpCoin() {
        return this.rpCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.rpCoin) * 31) + Integer.hashCode(this.id);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(int i) {
        this.id = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRpCoin(boolean z) {
        this.rpCoin = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SOPRepayRequestBean(rpCoin=" + this.rpCoin + ", id=" + this.id + ")";
    }

    public SOPRepayRequestBean(boolean z, int i) {
        this.rpCoin = z;
        this.id = i;
    }
}
