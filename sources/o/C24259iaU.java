package o;

import com.okinc.business.defi.api.bean.PlatformItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iaU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C24259iaU {
    public static final int AEQbTJ = PlatformItem.$stable;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final PlatformItem OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C24259iaU() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C24259iaU copy$default(C24259iaU c24259iaU, java.lang.String str, PlatformItem platformItem, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c24259iaU.AhwBna;
        }
        if ((i & 2) != 0) {
            platformItem = c24259iaU.OLrzqt;
        }
        PlatformItem platformItem2 = platformItem;
        if ((i & 4) != 0) {
            str2 = c24259iaU.KWHzl;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = c24259iaU.EZpvd;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            str4 = c24259iaU.copydefault;
        }
        return c24259iaU.EZpvd(str, platformItem2, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24259iaU EZpvd(@NotNull java.lang.String str, PlatformItem platformItem, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C24259iaU(str, platformItem, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformItem copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24259iaU)) {
            return false;
        }
        C24259iaU c24259iaU = (C24259iaU) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c24259iaU.AhwBna) && Intrinsics.EZpvd(this.OLrzqt, c24259iaU.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c24259iaU.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c24259iaU.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c24259iaU.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        PlatformItem platformItem = this.OLrzqt;
        return (((((((iHashCode * 31) + (platformItem == null ? 0 : platformItem.hashCode())) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OpenContractBean(walletId=" + this.AhwBna + ", platformItem=" + this.OLrzqt + ", unsignedTx=" + this.KWHzl + ", orderId=" + this.EZpvd + ", chainId=" + this.copydefault + ")";
    }

    public C24259iaU(@NotNull java.lang.String str, PlatformItem platformItem, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.AhwBna = str;
        this.OLrzqt = platformItem;
        this.KWHzl = str2;
        this.EZpvd = str3;
        this.copydefault = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.PlatformItem:0x000e: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.PlatformItem) : (r6v0 com.okinc.business.defi.api.bean.PlatformItem))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.defi.api.bean.PlatformItem, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:207) call: o.iaU.<init>(java.lang.String, com.okinc.business.defi.api.bean.PlatformItem, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C24259iaU(java.lang.String str, PlatformItem platformItem, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : platformItem, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }
}
