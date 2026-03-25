package o;

/* JADX INFO: renamed from: o.Aso, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3803Aso {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public boolean AYXKKw;
    public boolean EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3803Aso copy$default(C3803Aso c3803Aso, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c3803Aso.EZpvd;
        }
        if ((i & 2) != 0) {
            z2 = c3803Aso.copydefault;
        }
        boolean z8 = z2;
        if ((i & 4) != 0) {
            z3 = c3803Aso.KWHzl;
        }
        boolean z9 = z3;
        if ((i & 8) != 0) {
            z4 = c3803Aso.AEQbTJ;
        }
        boolean z10 = z4;
        if ((i & 16) != 0) {
            z5 = c3803Aso.gEmmrt;
        }
        boolean z11 = z5;
        if ((i & 32) != 0) {
            z6 = c3803Aso.OLrzqt;
        }
        boolean z12 = z6;
        if ((i & 64) != 0) {
            z7 = c3803Aso.AYXKKw;
        }
        return c3803Aso.KWHzl(z, z8, z9, z10, z11, z12, z7);
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
    public final C3803Aso KWHzl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return new C3803Aso(z, z2, z3, z4, z5, z6, z7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3803Aso)) {
            return false;
        }
        C3803Aso c3803Aso = (C3803Aso) obj;
        return this.EZpvd == c3803Aso.EZpvd && this.copydefault == c3803Aso.copydefault && this.KWHzl == c3803Aso.KWHzl && this.AEQbTJ == c3803Aso.AEQbTJ && this.gEmmrt == c3803Aso.gEmmrt && this.OLrzqt == c3803Aso.OLrzqt && this.AYXKKw == c3803Aso.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((java.lang.Boolean.hashCode(this.EZpvd) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InputValidationUiState(isStablecoin=" + this.EZpvd + ", isSegregatedAccount=" + this.copydefault + ", hasAlternativeChannels=" + this.KWHzl + ", isBalanceOnly=" + this.AEQbTJ + ", shouldShowPeggedCurrency=" + this.gEmmrt + ", shouldShowDepositStablecoinCta=" + this.OLrzqt + ", shouldShowDexQuoteError=" + this.AYXKKw + ")";
    }

    public C3803Aso(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.EZpvd = z;
        this.copydefault = z2;
        this.KWHzl = z3;
        this.AEQbTJ = z4;
        this.gEmmrt = z5;
        this.OLrzqt = z6;
        this.AYXKKw = z7;
    }
}
