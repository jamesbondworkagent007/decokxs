package o;

/* JADX INFO: renamed from: o.Bmi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C4661Bmi {
    public static final int $stable = 8;
    public int EZpvd;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4661Bmi copy$default(C4661Bmi c4661Bmi, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = c4661Bmi.EZpvd;
        }
        if ((i3 & 2) != 0) {
            i2 = c4661Bmi.OLrzqt;
        }
        return c4661Bmi.EZpvd(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4661Bmi EZpvd(int i, int i2) {
        return new C4661Bmi(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4661Bmi)) {
            return false;
        }
        C4661Bmi c4661Bmi = (C4661Bmi) obj;
        return this.EZpvd == c4661Bmi.EZpvd && this.OLrzqt == c4661Bmi.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.EZpvd) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ColorPreferenceState(themeSelect=" + this.EZpvd + ", colorSelect=" + this.OLrzqt + ")";
    }

    public C4661Bmi(int i, int i2) {
        this.EZpvd = i;
        this.OLrzqt = i2;
    }
}
