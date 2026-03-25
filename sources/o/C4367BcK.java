package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.network.WsDoh;

/* JADX INFO: renamed from: o.BcK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C4367BcK {
    public static final int $stable = 8;
    public WsDoh AEQbTJ;
    public java.lang.String AYXKKw;
    public C56396yDv EZpvd;
    public boolean KWHzl;
    public java.lang.String OLrzqt;
    public java.util.Map<java.lang.String, java.lang.String> copydefault;
    public boolean djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 uniffi.network.WsDoh)
  (r3v0 boolean)
  (r4v0 java.lang.String)
  (r5v0 o.yDv)
  (r6v0 boolean)
  (r7v0 java.util.Map)
 A[MD:(java.lang.String, uniffi.network.WsDoh, boolean, java.lang.String, o.yDv, boolean, java.util.Map<java.lang.String, java.lang.String>):void (m)] call: o.BcK.<init>(java.lang.String, uniffi.network.WsDoh, boolean, java.lang.String, o.yDv, boolean, java.util.Map):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C4367BcK(java.lang.String str, WsDoh wsDoh, boolean z, java.lang.String str2, C56396yDv c56396yDv, boolean z2, java.util.Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, wsDoh, z, str2, c56396yDv, z2, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.BcK */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-HNfBzwE$default, reason: not valid java name */
    public static /* synthetic */ C4367BcK m8241copyHNfBzwE$default(C4367BcK c4367BcK, java.lang.String str, WsDoh wsDoh, boolean z, java.lang.String str2, C56396yDv c56396yDv, boolean z2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c4367BcK.OLrzqt;
        }
        if ((i & 2) != 0) {
            wsDoh = c4367BcK.AEQbTJ;
        }
        WsDoh wsDoh2 = wsDoh;
        if ((i & 4) != 0) {
            z = c4367BcK.djBIcL;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str2 = c4367BcK.AYXKKw;
        }
        java.lang.String str3 = str2;
        if ((i & 16) != 0) {
            c56396yDv = c4367BcK.EZpvd;
        }
        C56396yDv c56396yDv2 = c56396yDv;
        if ((i & 32) != 0) {
            z2 = c4367BcK.KWHzl;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            map = c4367BcK.copydefault;
        }
        return c4367BcK.AEQbTJ(str, wsDoh2, z3, str3, c56396yDv2, z4, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4367BcK AEQbTJ(@NotNull java.lang.String str, @NotNull WsDoh wsDoh, boolean z, java.lang.String str2, C56396yDv c56396yDv, boolean z2, java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(wsDoh, "");
        return new C4367BcK(str, wsDoh, z, str2, c56396yDv, z2, map, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56396yDv AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WsDoh OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4367BcK)) {
            return false;
        }
        C4367BcK c4367BcK = (C4367BcK) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c4367BcK.OLrzqt) && this.AEQbTJ == c4367BcK.AEQbTJ && this.djBIcL == c4367BcK.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c4367BcK.AYXKKw) && Intrinsics.EZpvd(this.EZpvd, c4367BcK.EZpvd) && this.KWHzl == c4367BcK.KWHzl && Intrinsics.EZpvd(this.copydefault, c4367BcK.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.djBIcL);
        java.lang.String str = this.AYXKKw;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        C56396yDv c56396yDv = this.EZpvd;
        int iAEQbTJ = c56396yDv == null ? 0 : C56396yDv.AEQbTJ(c56396yDv.OLrzqt());
        int iHashCode5 = java.lang.Boolean.hashCode(this.KWHzl);
        java.util.Map<java.lang.String, java.lang.String> map = this.copydefault;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iAEQbTJ) * 31) + iHashCode5) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WsStaticConnectionConfig(domain=" + this.OLrzqt + ", doh=" + this.AEQbTJ + ", needLogin=" + this.djBIcL + ", loginOp=" + this.AYXKKw + ", connectTimeoutMs=" + this.EZpvd + ", disconnectWhenBackground=" + this.KWHzl + ", customHeaders=" + this.copydefault + ")";
    }

    public C4367BcK(java.lang.String str, WsDoh wsDoh, boolean z, java.lang.String str2, C56396yDv c56396yDv, boolean z2, java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(wsDoh, "");
        this.OLrzqt = str;
        this.AEQbTJ = wsDoh;
        this.djBIcL = z;
        this.AYXKKw = str2;
        this.EZpvd = c56396yDv;
        this.KWHzl = z2;
        this.copydefault = map;
    }
}
