package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mKC {
    public final int EZpvd;
    public final java.lang.CharSequence copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ mKC copy$default(mKC mkc, java.lang.CharSequence charSequence, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = mkc.copydefault;
        }
        if ((i2 & 2) != 0) {
            i = mkc.EZpvd;
        }
        return mkc.copydefault(charSequence, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mKC copydefault(@NotNull java.lang.CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return new mKC(charSequence, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mKC)) {
            return false;
        }
        mKC mkc = (mKC) obj;
        return Intrinsics.EZpvd(this.copydefault, mkc.copydefault) && this.EZpvd == mkc.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + java.lang.Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.CharSequence charSequence = this.copydefault;
        return "TextItem(value=" + ((java.lang.Object) charSequence) + ", id=" + this.EZpvd + ")";
    }

    public mKC(@NotNull java.lang.CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.copydefault = charSequence;
        this.EZpvd = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.CharSequence)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(java.lang.CharSequence, int):void (m)] (LINE:14) call: o.mKC.<init>(java.lang.CharSequence, int):void type: THIS */
    public /* synthetic */ mKC(java.lang.CharSequence charSequence, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, (i2 & 2) != 0 ? 0 : i);
    }
}
