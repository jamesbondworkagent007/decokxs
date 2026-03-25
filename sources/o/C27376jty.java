package o;

import com.okinc.business.invest_biz.data.bean.response.HealthRate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jty, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27376jty implements InterfaceC27436jvE {
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;
    public final HealthRate copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27376jty() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27376jty copy$default(C27376jty c27376jty, java.lang.String str, java.lang.String str2, HealthRate healthRate, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c27376jty.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c27376jty.KWHzl;
        }
        if ((i & 4) != 0) {
            healthRate = c27376jty.copydefault;
        }
        return c27376jty.OLrzqt(str, str2, healthRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27376jty OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, HealthRate healthRate) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C27376jty(str, str2, healthRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HealthRate copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27376jty)) {
            return false;
        }
        C27376jty c27376jty = (C27376jty) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c27376jty.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c27376jty.KWHzl) && Intrinsics.EZpvd(this.copydefault, c27376jty.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        HealthRate healthRate = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (healthRate == null ? 0 : healthRate.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiProtocolTitleItem(leftTitle=" + this.AEQbTJ + ", rightTitle=" + this.KWHzl + ", healthRate=" + this.copydefault + ")";
    }

    public C27376jty(@NotNull java.lang.String str, @NotNull java.lang.String str2, HealthRate healthRate) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.KWHzl = str2;
        this.copydefault = healthRate;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.response.HealthRate:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.response.HealthRate) : (r4v0 com.okinc.business.invest_biz.data.bean.response.HealthRate))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.response.HealthRate):void (m)] (LINE:9) call: o.jty.<init>(java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.response.HealthRate):void type: THIS */
    public /* synthetic */ C27376jty(java.lang.String str, java.lang.String str2, HealthRate healthRate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : healthRate);
    }

    @Override // o.InterfaceC27436jvE
    public boolean EZpvd(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27376jty c27376jty = interfaceC27436jvE instanceof C27376jty ? (C27376jty) interfaceC27436jvE : null;
        return c27376jty != null && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c27376jty.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c27376jty.KWHzl) && Intrinsics.EZpvd(this.copydefault, c27376jty.copydefault);
    }

    @Override // o.InterfaceC27436jvE
    public boolean KWHzl(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27376jty c27376jty = interfaceC27436jvE instanceof C27376jty ? (C27376jty) interfaceC27436jvE : null;
        return c27376jty != null && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c27376jty.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c27376jty.KWHzl) && Intrinsics.EZpvd(this.copydefault, c27376jty.copydefault);
    }
}
