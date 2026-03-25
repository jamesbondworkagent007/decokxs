package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.djF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14317djF {
    public final Function0<Unit> AEQbTJ;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public C14317djF(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, int i, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.KWHzl = str2;
        this.OLrzqt = str3;
        this.EZpvd = i;
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (wrap:int:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (8 int) : (r10v0 int))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r11v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:5) call: o.djF.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C14317djF(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 8 : i, (i2 & 16) != 0 ? null : function0);
    }
}
