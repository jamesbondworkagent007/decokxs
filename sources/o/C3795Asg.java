package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.InputAmountType;

/* JADX INFO: renamed from: o.Asg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3795Asg {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public int EZpvd;
    public InputAmountType KWHzl;
    public java.lang.String OLrzqt;
    public int copydefault;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 uniffi.buy_sell.InputAmountType)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 int)
  (r6v0 int)
  (r7v0 boolean)
 A[MD:(uniffi.buy_sell.InputAmountType, java.lang.String, java.lang.String, java.lang.String, int, int, boolean):void (m)] call: o.Asg.<init>(uniffi.buy_sell.InputAmountType, java.lang.String, java.lang.String, java.lang.String, int, int, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C3795Asg(InputAmountType inputAmountType, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputAmountType, str, str2, str3, i, i2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-uKsD3VY$default, reason: not valid java name */
    public static /* synthetic */ C3795Asg m8111copyuKsD3VY$default(C3795Asg c3795Asg, InputAmountType inputAmountType, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            inputAmountType = c3795Asg.KWHzl;
        }
        if ((i3 & 2) != 0) {
            str = c3795Asg.valueOf;
        }
        java.lang.String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = c3795Asg.gEmmrt;
        }
        java.lang.String str5 = str2;
        if ((i3 & 8) != 0) {
            str3 = c3795Asg.OLrzqt;
        }
        java.lang.String str6 = str3;
        if ((i3 & 16) != 0) {
            i = c3795Asg.copydefault;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = c3795Asg.EZpvd;
        }
        int i5 = i2;
        if ((i3 & 64) != 0) {
            z = c3795Asg.AEQbTJ;
        }
        return c3795Asg.KWHzl(inputAmountType, str4, str5, str6, i4, i5, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3795Asg KWHzl(@NotNull InputAmountType inputAmountType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(inputAmountType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C3795Asg(inputAmountType, str, str2, str3, i, i2, z, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputAmountType KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3795Asg)) {
            return false;
        }
        C3795Asg c3795Asg = (C3795Asg) obj;
        return this.KWHzl == c3795Asg.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c3795Asg.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c3795Asg.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c3795Asg.OLrzqt) && this.copydefault == c3795Asg.copydefault && this.EZpvd == c3795Asg.EZpvd && this.AEQbTJ == c3795Asg.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.KWHzl.hashCode() * 31) + this.valueOf.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + C56395yDu.KWHzl(this.copydefault)) * 31) + C56395yDu.KWHzl(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InputFormatter(currentInputType=" + this.KWHzl + ", selectedFiatCurrency=" + this.valueOf + ", selectedCryptoCurrency=" + this.gEmmrt + ", peggedCurrency=" + this.OLrzqt + ", fiatPrecision=" + C56395yDu.OLrzqt(this.copydefault) + ", cryptoPrecision=" + C56395yDu.OLrzqt(this.EZpvd) + ", isCryptoChannel=" + this.AEQbTJ + ")";
    }

    public C3795Asg(InputAmountType inputAmountType, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(inputAmountType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl = inputAmountType;
        this.valueOf = str;
        this.gEmmrt = str2;
        this.OLrzqt = str3;
        this.copydefault = i;
        this.EZpvd = i2;
        this.AEQbTJ = z;
    }
}
