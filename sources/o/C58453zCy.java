package o;

import kotlin.jvm.internal.Intrinsics;
import uniffi.account.LinkTextStyleType;

/* JADX INFO: renamed from: o.zCy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58453zCy {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public LinkTextStyleType copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C58453zCy copy$default(C58453zCy c58453zCy, java.lang.String str, java.lang.String str2, java.lang.String str3, LinkTextStyleType linkTextStyleType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c58453zCy.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c58453zCy.OLrzqt;
        }
        if ((i & 4) != 0) {
            str3 = c58453zCy.KWHzl;
        }
        if ((i & 8) != 0) {
            linkTextStyleType = c58453zCy.copydefault;
        }
        return c58453zCy.copydefault(str, str2, str3, linkTextStyleType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkTextStyleType AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58453zCy copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, LinkTextStyleType linkTextStyleType) {
        return new C58453zCy(str, str2, str3, linkTextStyleType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58453zCy)) {
            return false;
        }
        C58453zCy c58453zCy = (C58453zCy) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c58453zCy.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c58453zCy.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c58453zCy.KWHzl) && this.copydefault == c58453zCy.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.KWHzl;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        LinkTextStyleType linkTextStyleType = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (linkTextStyleType != null ? linkTextStyleType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LinkTextParam(placeholder=" + this.AEQbTJ + ", text=" + this.OLrzqt + ", value=" + this.KWHzl + ", paramType=" + this.copydefault + ")";
    }

    public C58453zCy(java.lang.String str, java.lang.String str2, java.lang.String str3, LinkTextStyleType linkTextStyleType) {
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.KWHzl = str3;
        this.copydefault = linkTextStyleType;
    }
}
