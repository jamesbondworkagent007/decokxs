package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.mXy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32328mXy {
    public final java.lang.Integer KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C32328mXy copy$default(C32328mXy c32328mXy, int i, java.lang.Integer num, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c32328mXy.copydefault;
        }
        if ((i2 & 2) != 0) {
            num = c32328mXy.KWHzl;
        }
        return c32328mXy.EZpvd(i, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32328mXy EZpvd(@androidx.annotation.DrawableRes int i, java.lang.Integer num) {
        return new C32328mXy(i, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.KWHzl;
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
        if (!(obj instanceof C32328mXy)) {
            return false;
        }
        C32328mXy c32328mXy = (C32328mXy) obj;
        return this.copydefault == c32328mXy.copydefault && Intrinsics.EZpvd(this.KWHzl, c32328mXy.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.copydefault);
        java.lang.Integer num = this.KWHzl;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SniperIcon(icon=" + this.copydefault + ", color=" + this.KWHzl + ")";
    }

    public C32328mXy(@androidx.annotation.DrawableRes int i, java.lang.Integer num) {
        this.copydefault = i;
        this.KWHzl = num;
    }
}
