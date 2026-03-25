package o;

import com.okinc.business.defi.biz.setting.SwitchType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dbW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C13910dbW {
    public java.lang.String AEQbTJ;
    public boolean EZpvd;
    public boolean KWHzl;
    public SwitchType OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C13910dbW copy$default(C13910dbW c13910dbW, SwitchType switchType, java.lang.String str, boolean z, boolean z2, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            switchType = c13910dbW.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c13910dbW.AEQbTJ;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            z = c13910dbW.EZpvd;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = c13910dbW.KWHzl;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            str2 = c13910dbW.copydefault;
        }
        return c13910dbW.KWHzl(switchType, str3, z3, z4, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwitchType AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13910dbW KWHzl(@NotNull SwitchType switchType, @NotNull java.lang.String str, boolean z, boolean z2, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(switchType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C13910dbW(switchType, str, z, z2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13910dbW)) {
            return false;
        }
        C13910dbW c13910dbW = (C13910dbW) obj;
        return this.OLrzqt == c13910dbW.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c13910dbW.AEQbTJ) && this.EZpvd == c13910dbW.EZpvd && this.KWHzl == c13910dbW.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c13910dbW.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SettingSwitchItem(itemType=" + this.OLrzqt + ", title=" + this.AEQbTJ + ", switchStatus=" + this.EZpvd + ", isShowTip=" + this.KWHzl + ", subTitle=" + this.copydefault + ")";
    }

    public C13910dbW(@NotNull SwitchType switchType, @NotNull java.lang.String str, boolean z, boolean z2, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(switchType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = switchType;
        this.AEQbTJ = str;
        this.EZpvd = z;
        this.KWHzl = z2;
        this.copydefault = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (r8v0 com.okinc.business.defi.biz.setting.SwitchType)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(com.okinc.business.defi.biz.setting.SwitchType, java.lang.String, boolean, boolean, java.lang.String):void (m)] (LINE:3) call: o.dbW.<init>(com.okinc.business.defi.biz.setting.SwitchType, java.lang.String, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ C13910dbW(SwitchType switchType, java.lang.String str, boolean z, boolean z2, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(switchType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? "" : str2);
    }
}
