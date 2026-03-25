package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vnr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51484vnr {
    public final java.lang.String AEQbTJ;
    public final int KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C51484vnr copy$default(C51484vnr c51484vnr, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c51484vnr.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            str2 = c51484vnr.OLrzqt;
        }
        if ((i2 & 4) != 0) {
            i = c51484vnr.KWHzl;
        }
        if ((i2 & 8) != 0) {
            str3 = c51484vnr.copydefault;
        }
        return c51484vnr.EZpvd(str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C51484vnr EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C51484vnr(str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51484vnr)) {
            return false;
        }
        C51484vnr c51484vnr = (C51484vnr) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c51484vnr.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c51484vnr.OLrzqt) && this.KWHzl == c51484vnr.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c51484vnr.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CategoryChildCard(category=" + this.AEQbTJ + ", botType=" + this.OLrzqt + ", iconRes=" + this.KWHzl + ", name=" + this.copydefault + ")";
    }

    public C51484vnr(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.KWHzl = i;
        this.copydefault = str3;
    }
}
