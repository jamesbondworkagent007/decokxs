package o;

/* JADX INFO: renamed from: o.Asz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3814Asz {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public boolean KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3814Asz copy$default(C3814Asz c3814Asz, boolean z, boolean z2, boolean z3, boolean z4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c3814Asz.KWHzl;
        }
        if ((i & 2) != 0) {
            z2 = c3814Asz.OLrzqt;
        }
        if ((i & 4) != 0) {
            z3 = c3814Asz.AEQbTJ;
        }
        if ((i & 8) != 0) {
            z4 = c3814Asz.copydefault;
        }
        return c3814Asz.AEQbTJ(z, z2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3814Asz AEQbTJ(boolean z, boolean z2, boolean z3, boolean z4) {
        return new C3814Asz(z, z2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3814Asz)) {
            return false;
        }
        C3814Asz c3814Asz = (C3814Asz) obj;
        return this.KWHzl == c3814Asz.KWHzl && this.OLrzqt == c3814Asz.OLrzqt && this.AEQbTJ == c3814Asz.AEQbTJ && this.copydefault == c3814Asz.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.KWHzl) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailActions(isActionBlockEnabled=" + this.KWHzl + ", isCancelActionEnabled=" + this.OLrzqt + ", isPauseActionEnabled=" + this.AEQbTJ + ", isResumeActionEnabled=" + this.copydefault + ")";
    }

    public C3814Asz(boolean z, boolean z2, boolean z3, boolean z4) {
        this.KWHzl = z;
        this.OLrzqt = z2;
        this.AEQbTJ = z3;
        this.copydefault = z4;
    }
}
