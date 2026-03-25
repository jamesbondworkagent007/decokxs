package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.AzW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C4154AzW {
    public static final int $stable = 8;
    public ABI AEQbTJ;
    public ABI EZpvd;
    public ABI KWHzl;
    public ABI OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4154AzW copy$default(C4154AzW c4154AzW, ABI abi, ABI abi2, ABI abi3, ABI abi4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abi = c4154AzW.KWHzl;
        }
        if ((i & 2) != 0) {
            abi2 = c4154AzW.OLrzqt;
        }
        if ((i & 4) != 0) {
            abi3 = c4154AzW.EZpvd;
        }
        if ((i & 8) != 0) {
            abi4 = c4154AzW.AEQbTJ;
        }
        return c4154AzW.AEQbTJ(abi, abi2, abi3, abi4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4154AzW AEQbTJ(ABI abi, ABI abi2, ABI abi3, ABI abi4) {
        return new C4154AzW(abi, abi2, abi3, abi4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ABI EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ABI KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ABI OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ABI copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4154AzW)) {
            return false;
        }
        C4154AzW c4154AzW = (C4154AzW) obj;
        return Intrinsics.EZpvd(this.KWHzl, c4154AzW.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c4154AzW.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c4154AzW.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c4154AzW.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ABI abi = this.KWHzl;
        int iHashCode = abi == null ? 0 : abi.hashCode();
        ABI abi2 = this.OLrzqt;
        int iHashCode2 = abi2 == null ? 0 : abi2.hashCode();
        ABI abi3 = this.EZpvd;
        int iHashCode3 = abi3 == null ? 0 : abi3.hashCode();
        ABI abi4 = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (abi4 != null ? abi4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DefaultFromToTokenShowVo(fromDexMultiTokenInfoVo=" + this.KWHzl + ", toDexMultiTokenInfoVo=" + this.OLrzqt + ", toCrossDexMultiTokenInfoVo=" + this.EZpvd + ", nativeTokenVo=" + this.AEQbTJ + ")";
    }

    public C4154AzW(ABI abi, ABI abi2, ABI abi3, ABI abi4) {
        this.KWHzl = abi;
        this.OLrzqt = abi2;
        this.EZpvd = abi3;
        this.AEQbTJ = abi4;
    }
}
