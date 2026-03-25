package o;

import com.okinc.business.dex.trade.copytrading.home.ui.StrategyCellType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gWm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19981gWm {
    public final StrategyCellType AEQbTJ;
    public final InterfaceC19970gWb EZpvd;
    public final java.lang.String KWHzl;
    public final InterfaceC19982gWn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C19981gWm copy$default(C19981gWm c19981gWm, java.lang.String str, InterfaceC19982gWn interfaceC19982gWn, StrategyCellType strategyCellType, InterfaceC19970gWb interfaceC19970gWb, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c19981gWm.KWHzl;
        }
        if ((i & 2) != 0) {
            interfaceC19982gWn = c19981gWm.copydefault;
        }
        if ((i & 4) != 0) {
            strategyCellType = c19981gWm.AEQbTJ;
        }
        if ((i & 8) != 0) {
            interfaceC19970gWb = c19981gWm.EZpvd;
        }
        return c19981gWm.copydefault(str, interfaceC19982gWn, strategyCellType, interfaceC19970gWb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC19970gWb AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyCellType EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19981gWm copydefault(@NotNull java.lang.String str, @NotNull InterfaceC19982gWn interfaceC19982gWn, @NotNull StrategyCellType strategyCellType, InterfaceC19970gWb interfaceC19970gWb) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC19982gWn, "");
        Intrinsics.checkNotNullParameter(strategyCellType, "");
        return new C19981gWm(str, interfaceC19982gWn, strategyCellType, interfaceC19970gWb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC19982gWn copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19981gWm)) {
            return false;
        }
        C19981gWm c19981gWm = (C19981gWm) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c19981gWm.KWHzl) && Intrinsics.EZpvd(this.copydefault, c19981gWm.copydefault) && this.AEQbTJ == c19981gWm.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, c19981gWm.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        InterfaceC19970gWb interfaceC19970gWb = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (interfaceC19970gWb == null ? 0 : interfaceC19970gWb.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UIStrategyCell(label=" + this.KWHzl + ", content=" + this.copydefault + ", type=" + this.AEQbTJ + ", labelClickAction=" + this.EZpvd + ")";
    }

    public C19981gWm(@NotNull java.lang.String str, @NotNull InterfaceC19982gWn interfaceC19982gWn, @NotNull StrategyCellType strategyCellType, InterfaceC19970gWb interfaceC19970gWb) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC19982gWn, "");
        Intrinsics.checkNotNullParameter(strategyCellType, "");
        this.KWHzl = str;
        this.copydefault = interfaceC19982gWn;
        this.AEQbTJ = strategyCellType;
        this.EZpvd = interfaceC19970gWb;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 o.gWn)
  (r3v0 com.okinc.business.dex.trade.copytrading.home.ui.StrategyCellType)
  (wrap:o.gWb:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.gWb) : (r4v0 o.gWb))
 A[MD:(java.lang.String, o.gWn, com.okinc.business.dex.trade.copytrading.home.ui.StrategyCellType, o.gWb):void (m)] (LINE:22) call: o.gWm.<init>(java.lang.String, o.gWn, com.okinc.business.dex.trade.copytrading.home.ui.StrategyCellType, o.gWb):void type: THIS */
    public /* synthetic */ C19981gWm(java.lang.String str, InterfaceC19982gWn interfaceC19982gWn, StrategyCellType strategyCellType, InterfaceC19970gWb interfaceC19970gWb, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, interfaceC19982gWn, strategyCellType, (i & 8) != 0 ? null : interfaceC19970gWb);
    }
}
