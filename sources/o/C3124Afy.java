package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.Afy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3124Afy {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public boolean EZpvd;
    public boolean KWHzl;
    public int OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3124Afy copy$default(C3124Afy c3124Afy, java.lang.String str, int i, boolean z, boolean z2, boolean z3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c3124Afy.copydefault;
        }
        if ((i2 & 2) != 0) {
            i = c3124Afy.OLrzqt;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z = c3124Afy.AEQbTJ;
        }
        boolean z4 = z;
        if ((i2 & 8) != 0) {
            z2 = c3124Afy.EZpvd;
        }
        boolean z5 = z2;
        if ((i2 & 16) != 0) {
            z3 = c3124Afy.KWHzl;
        }
        return c3124Afy.OLrzqt(str, i3, z4, z5, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3124Afy OLrzqt(java.lang.String str, int i, boolean z, boolean z2, boolean z3) {
        return new C3124Afy(str, i, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3124Afy)) {
            return false;
        }
        C3124Afy c3124Afy = (C3124Afy) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c3124Afy.copydefault) && this.OLrzqt == c3124Afy.OLrzqt && this.AEQbTJ == c3124Afy.AEQbTJ && this.EZpvd == c3124Afy.EZpvd && this.KWHzl == c3124Afy.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.copydefault;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SubAccountState(subAccountName=" + this.copydefault + ", accountType=" + this.OLrzqt + ", enableDeposits=" + this.AEQbTJ + ", isNameAvailable=" + this.EZpvd + ", isNextButtonEnabled=" + this.KWHzl + ")";
    }

    public C3124Afy(java.lang.String str, int i, boolean z, boolean z2, boolean z3) {
        this.copydefault = str;
        this.OLrzqt = i;
        this.AEQbTJ = z;
        this.EZpvd = z2;
        this.KWHzl = z3;
    }
}
