package com.okinc.wallet.core.sign;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class MPCeCDSAToHEX {
    public static final int $stable = 8;
    private String ecdsaShare;
    private String path;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MPCeCDSAToHEX copy$default(MPCeCDSAToHEX mPCeCDSAToHEX, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mPCeCDSAToHEX.ecdsaShare;
        }
        if ((i & 2) != 0) {
            str2 = mPCeCDSAToHEX.path;
        }
        return mPCeCDSAToHEX.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ecdsaShare;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MPCeCDSAToHEX copy(String str, String str2) {
        return new MPCeCDSAToHEX(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MPCeCDSAToHEX)) {
            return false;
        }
        MPCeCDSAToHEX mPCeCDSAToHEX = (MPCeCDSAToHEX) obj;
        return Intrinsics.EZpvd((Object) this.ecdsaShare, (Object) mPCeCDSAToHEX.ecdsaShare) && Intrinsics.EZpvd((Object) this.path, (Object) mPCeCDSAToHEX.path);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEcdsaShare() {
        return this.ecdsaShare;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.ecdsaShare;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.path;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEcdsaShare(String str) {
        this.ecdsaShare = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPath(String str) {
        this.path = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MPCeCDSAToHEX(ecdsaShare=" + this.ecdsaShare + ", path=" + this.path + ")";
    }

    public MPCeCDSAToHEX(String str, String str2) {
        this.ecdsaShare = str;
        this.path = str2;
    }
}
