package com.okinc.ok_kyc_core.data.lca;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LcaObfuscateData {
    public static final int $stable = 0;
    private final String c;
    private final Integer chunkSize;
    private final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f1042o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaObfuscateData copy$default(LcaObfuscateData lcaObfuscateData, String str, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lcaObfuscateData.c;
        }
        if ((i & 2) != 0) {
            num = lcaObfuscateData.chunkSize;
        }
        if ((i & 4) != 0) {
            str2 = lcaObfuscateData.n;
        }
        if ((i & 8) != 0) {
            str3 = lcaObfuscateData.f1042o;
        }
        return lcaObfuscateData.copy(str, num, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.chunkSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.f1042o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaObfuscateData copy(String str, Integer num, String str2, String str3) {
        return new LcaObfuscateData(str, num, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaObfuscateData)) {
            return false;
        }
        LcaObfuscateData lcaObfuscateData = (LcaObfuscateData) obj;
        return Intrinsics.EZpvd((Object) this.c, (Object) lcaObfuscateData.c) && Intrinsics.EZpvd(this.chunkSize, lcaObfuscateData.chunkSize) && Intrinsics.EZpvd((Object) this.n, (Object) lcaObfuscateData.n) && Intrinsics.EZpvd((Object) this.f1042o, (Object) lcaObfuscateData.f1042o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getC() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChunkSize() {
        return this.chunkSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getN() {
        return this.n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getO() {
        return this.f1042o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.c;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.chunkSize;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.n;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f1042o;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaObfuscateData(c=" + this.c + ", chunkSize=" + this.chunkSize + ", n=" + this.n + ", o=" + this.f1042o + ")";
    }

    public LcaObfuscateData(String str, Integer num, String str2, String str3) {
        this.c = str;
        this.chunkSize = num;
        this.n = str2;
        this.f1042o = str3;
    }
}
