package com.okinc.find_ui.widgetprovider.p2p.data;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class P2PPairsInfo {
    public static final int $stable = 0;
    private final String crypto;
    private final String fiat;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ P2PPairsInfo copy$default(P2PPairsInfo p2PPairsInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = p2PPairsInfo.crypto;
        }
        if ((i & 2) != 0) {
            str2 = p2PPairsInfo.fiat;
        }
        return p2PPairsInfo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.crypto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final P2PPairsInfo copy(String str, String str2) {
        return new P2PPairsInfo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PPairsInfo)) {
            return false;
        }
        P2PPairsInfo p2PPairsInfo = (P2PPairsInfo) obj;
        return Intrinsics.EZpvd((Object) this.crypto, (Object) p2PPairsInfo.crypto) && Intrinsics.EZpvd((Object) this.fiat, (Object) p2PPairsInfo.fiat);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCrypto() {
        return this.crypto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFiat() {
        return this.fiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.crypto;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fiat;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "P2PPairsInfo(crypto=" + this.crypto + ", fiat=" + this.fiat + ")";
    }

    public P2PPairsInfo(String str, String str2) {
        this.crypto = str;
        this.fiat = str2;
    }
}
