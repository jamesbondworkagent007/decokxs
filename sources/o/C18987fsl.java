package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fsl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18987fsl {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final long KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18987fsl copy$default(C18987fsl c18987fsl, long j, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c18987fsl.KWHzl;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = c18987fsl.AEQbTJ;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            str2 = c18987fsl.EZpvd;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = c18987fsl.OLrzqt;
        }
        return c18987fsl.KWHzl(j2, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18987fsl KWHzl(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C18987fsl(j, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18987fsl)) {
            return false;
        }
        C18987fsl c18987fsl = (C18987fsl) obj;
        return this.KWHzl == c18987fsl.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c18987fsl.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c18987fsl.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c18987fsl.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.KWHzl) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchHotDAppUiModel(id=" + this.KWHzl + ", name=" + this.AEQbTJ + ", logo=" + this.EZpvd + ", url=" + this.OLrzqt + ")";
    }

    public C18987fsl(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl = j;
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.OLrzqt = str3;
    }
}
