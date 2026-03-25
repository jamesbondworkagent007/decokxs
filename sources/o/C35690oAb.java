package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oAb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C35690oAb extends C35694oAf {
    public final boolean AYXKKw;
    public java.lang.CharSequence EZpvd;
    public final java.lang.CharSequence copydefault;
    public final java.lang.CharSequence djBIcL;
    public final boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C35694oAf
    public boolean AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C35694oAf
    public java.lang.CharSequence KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C35694oAf
    public java.lang.CharSequence OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r7v0 java.lang.CharSequence)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r8v0 boolean))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.CharSequence) : (r9v0 java.lang.CharSequence))
  (r10v0 boolean)
  (r11v0 java.lang.CharSequence)
 A[MD:(java.lang.CharSequence, boolean, java.lang.CharSequence, boolean, java.lang.CharSequence):void (m)] (LINE:87) call: o.oAb.<init>(java.lang.CharSequence, boolean, java.lang.CharSequence, boolean, java.lang.CharSequence):void type: THIS */
    public /* synthetic */ C35690oAb(java.lang.CharSequence charSequence, boolean z, java.lang.CharSequence charSequence2, boolean z2, java.lang.CharSequence charSequence3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : charSequence2, z2, charSequence3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35690oAb(@NotNull java.lang.CharSequence charSequence, boolean z, java.lang.CharSequence charSequence2, boolean z2, @NotNull java.lang.CharSequence charSequence3) {
        super(charSequence, false, charSequence3, 2, null);
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        this.djBIcL = charSequence;
        this.gEmmrt = z;
        this.EZpvd = charSequence2;
        this.AYXKKw = z2;
        this.copydefault = charSequence3;
    }
}
