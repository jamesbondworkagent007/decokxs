package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57481yjI {
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Integer OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C57481yjI copy$default(C57481yjI c57481yjI, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c57481yjI.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c57481yjI.KWHzl;
        }
        if ((i & 4) != 0) {
            num = c57481yjI.OLrzqt;
        }
        if ((i & 8) != 0) {
            str3 = c57481yjI.EZpvd;
        }
        return c57481yjI.KWHzl(str, str2, num, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57481yjI KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C57481yjI(str, str2, num, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57481yjI)) {
            return false;
        }
        C57481yjI c57481yjI = (C57481yjI) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c57481yjI.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c57481yjI.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c57481yjI.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c57481yjI.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.Integer num = this.OLrzqt;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        java.lang.String str2 = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InfoListItem(label=" + this.copydefault + ", value=" + this.KWHzl + ", valueColorRes=" + this.OLrzqt + ", tag=" + this.EZpvd + ")";
    }

    public C57481yjI(@NotNull java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.KWHzl = str2;
        this.OLrzqt = num;
        this.EZpvd = str3;
    }
}
