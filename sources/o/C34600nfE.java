package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC34635nfn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nfE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34600nfE implements InterfaceC34635nfn {
    public final boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final android.text.SpannedString KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C34600nfE copy$default(C34600nfE c34600nfE, java.lang.String str, java.lang.String str2, android.text.SpannedString spannedString, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c34600nfE.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c34600nfE.EZpvd;
        }
        if ((i & 4) != 0) {
            spannedString = c34600nfE.KWHzl;
        }
        if ((i & 8) != 0) {
            z = c34600nfE.AEQbTJ;
        }
        return c34600nfE.OLrzqt(str, str2, spannedString, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.text.SpannedString EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34600nfE OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, android.text.SpannedString spannedString, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C34600nfE(str, str2, spannedString, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34600nfE)) {
            return false;
        }
        C34600nfE c34600nfE = (C34600nfE) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c34600nfE.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c34600nfE.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c34600nfE.KWHzl) && this.AEQbTJ == c34600nfE.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        android.text.SpannedString spannedString = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (spannedString == null ? 0 : spannedString.hashCode())) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.String str = this.copydefault;
        java.lang.String str2 = this.EZpvd;
        android.text.SpannedString spannedString = this.KWHzl;
        return "UiGridSelectionItem(key=" + str + ", displayText=" + str2 + ", displaySpan=" + ((java.lang.Object) spannedString) + ", isSelected=" + this.AEQbTJ + ")";
    }

    public C34600nfE(@NotNull java.lang.String str, @NotNull java.lang.String str2, android.text.SpannedString spannedString, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.EZpvd = str2;
        this.KWHzl = spannedString;
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:android.text.SpannedString:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null android.text.SpannedString) : (r3v0 android.text.SpannedString))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, android.text.SpannedString, boolean):void (m)] (LINE:11) call: o.nfE.<init>(java.lang.String, java.lang.String, android.text.SpannedString, boolean):void type: THIS */
    public /* synthetic */ C34600nfE(java.lang.String str, java.lang.String str2, android.text.SpannedString spannedString, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : spannedString, (i & 8) != 0 ? false : z);
    }

    @Override // o.InterfaceC34635nfn
    public boolean KWHzl(@NotNull InterfaceC34635nfn interfaceC34635nfn) {
        return InterfaceC34635nfn.Activity.KWHzl(this, interfaceC34635nfn);
    }

    @Override // o.InterfaceC34635nfn
    public java.lang.Object copydefault(@NotNull InterfaceC34635nfn interfaceC34635nfn) {
        return InterfaceC34635nfn.Activity.AEQbTJ(this, interfaceC34635nfn);
    }

    @Override // o.InterfaceC34635nfn
    public boolean AEQbTJ(@NotNull InterfaceC34635nfn interfaceC34635nfn) {
        Intrinsics.checkNotNullParameter(interfaceC34635nfn, "");
        C34600nfE c34600nfE = interfaceC34635nfn instanceof C34600nfE ? (C34600nfE) interfaceC34635nfn : null;
        if (c34600nfE == null) {
            return false;
        }
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c34600nfE.copydefault);
    }
}
