package com.keystone.module;

/* JADX INFO: loaded from: classes3.dex */
public final class OkxExtra {
    private int chainId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OkxExtra copy$default(OkxExtra okxExtra, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = okxExtra.chainId;
        }
        return okxExtra.copy(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkxExtra copy(int i) {
        return new OkxExtra(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OkxExtra) && this.chainId == ((OkxExtra) obj).chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.chainId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(int i) {
        this.chainId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OkxExtra(chainId=" + this.chainId + ')';
    }

    public OkxExtra(int i) {
        this.chainId = i;
    }
}
