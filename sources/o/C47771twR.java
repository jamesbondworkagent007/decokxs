package o;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.twR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47771twR {
    public final Unit copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47771twR() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C47771twR copy$default(C47771twR c47771twR, Unit unit, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            unit = c47771twR.copydefault;
        }
        return c47771twR.copydefault(unit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47771twR copydefault(@NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return new C47771twR(unit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C47771twR) && Intrinsics.EZpvd(this.copydefault, ((C47771twR) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HistoryHeaderData(placeholder=" + this.copydefault + ")";
    }

    public C47771twR(@NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        this.copydefault = unit;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:kotlin.Unit:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.Unit:0x0004: SGET  A[WRAPPED] (LINE:17) kotlin.Unit.INSTANCE kotlin.Unit) : (r1v0 kotlin.Unit))
 A[MD:(kotlin.Unit):void (m)] (LINE:16) call: o.twR.<init>(kotlin.Unit):void type: THIS */
    public /* synthetic */ C47771twR(Unit unit, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Unit.INSTANCE : unit);
    }
}
