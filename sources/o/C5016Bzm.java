package o;

/* JADX INFO: renamed from: o.Bzm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5016Bzm {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public boolean EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public boolean djBIcL;
    public boolean fetchVPNInfo;
    public boolean gEmmrt;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5016Bzm copydefault(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        return new C5016Bzm(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5016Bzm)) {
            return false;
        }
        C5016Bzm c5016Bzm = (C5016Bzm) obj;
        return this.OLrzqt == c5016Bzm.OLrzqt && this.EZpvd == c5016Bzm.EZpvd && this.fetchVPNInfo == c5016Bzm.fetchVPNInfo && this.AYXKKw == c5016Bzm.AYXKKw && this.valueOf == c5016Bzm.valueOf && this.KWHzl == c5016Bzm.KWHzl && this.djBIcL == c5016Bzm.djBIcL && this.AhwBna == c5016Bzm.AhwBna && this.gEmmrt == c5016Bzm.gEmmrt && this.copydefault == c5016Bzm.copydefault && this.AEQbTJ == c5016Bzm.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((java.lang.Boolean.hashCode(this.OLrzqt) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.fetchVPNInfo)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SubUserAuthModel(isAllowLogin=" + this.OLrzqt + ", isAllowDeposit=" + this.EZpvd + ", isAllowWithdraw=" + this.fetchVPNInfo + ", isAllowTransfer=" + this.AYXKKw + ", isAllowTrading=" + this.valueOf + ", isAllowCreateApi=" + this.KWHzl + ", isAllowOauth=" + this.djBIcL + ", isAllowUseFinancial=" + this.AhwBna + ", isAllowUseAsset=" + this.gEmmrt + ", isAllowInquireTrading=" + this.copydefault + ", isAllowInquireAsset=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.fetchVPNInfo;
    }

    public C5016Bzm(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.OLrzqt = z;
        this.EZpvd = z2;
        this.fetchVPNInfo = z3;
        this.AYXKKw = z4;
        this.valueOf = z5;
        this.KWHzl = z6;
        this.djBIcL = z7;
        this.AhwBna = z8;
        this.gEmmrt = z9;
        this.copydefault = z10;
        this.AEQbTJ = z11;
    }
}
