package o;

import com.okinc.business.invest_biz.data.contants.ApyType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.juL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27390juL {
    public final float AEQbTJ;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final ApyType OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27390juL copy$default(C27390juL c27390juL, float f, java.lang.String str, int i, java.lang.String str2, ApyType apyType, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            f = c27390juL.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            str = c27390juL.copydefault;
        }
        java.lang.String str3 = str;
        if ((i2 & 4) != 0) {
            i = c27390juL.EZpvd;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = c27390juL.KWHzl;
        }
        java.lang.String str4 = str2;
        if ((i2 & 16) != 0) {
            apyType = c27390juL.OLrzqt;
        }
        return c27390juL.OLrzqt(f, str3, i3, str4, apyType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27390juL OLrzqt(float f, @NotNull java.lang.String str, @androidx.annotation.ColorRes int i, @NotNull java.lang.String str2, ApyType apyType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C27390juL(f, str, i, str2, apyType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApyType copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27390juL)) {
            return false;
        }
        C27390juL c27390juL = (C27390juL) obj;
        return java.lang.Float.compare(this.AEQbTJ, c27390juL.AEQbTJ) == 0 && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c27390juL.copydefault) && this.EZpvd == c27390juL.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c27390juL.KWHzl) && this.OLrzqt == c27390juL.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Float.hashCode(this.AEQbTJ);
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = java.lang.Integer.hashCode(this.EZpvd);
        int iHashCode4 = this.KWHzl.hashCode();
        ApyType apyType = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (apyType == null ? 0 : apyType.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PieChartUiData(rate=" + this.AEQbTJ + ", label=" + this.copydefault + ", sliceColor=" + this.EZpvd + ", info=" + this.KWHzl + ", type=" + this.OLrzqt + ")";
    }

    public C27390juL(float f, @NotNull java.lang.String str, @androidx.annotation.ColorRes int i, @NotNull java.lang.String str2, ApyType apyType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = f;
        this.copydefault = str;
        this.EZpvd = i;
        this.KWHzl = str2;
        this.OLrzqt = apyType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C27390juL(float f, java.lang.String str, int i, java.lang.String str2, ApyType apyType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            int i3 = C52761wXj.ActionBar.DNMMPQ;
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
            i = c27569jxf.EZpvd(i3, activityAEQbTJ);
        }
        this(f, str, i, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? null : apyType);
    }
}
