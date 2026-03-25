package o;

import com.okinc.okimcore.model.im.OKConversation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sNb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44364sNb {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final int OLrzqt;
    public final OKConversation copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44364sNb copy$default(C44364sNb c44364sNb, int i, java.lang.String str, java.lang.String str2, OKConversation oKConversation, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c44364sNb.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            str = c44364sNb.EZpvd;
        }
        java.lang.String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = c44364sNb.AEQbTJ;
        }
        java.lang.String str4 = str2;
        if ((i2 & 8) != 0) {
            oKConversation = c44364sNb.copydefault;
        }
        OKConversation oKConversation2 = oKConversation;
        if ((i2 & 16) != 0) {
            z = c44364sNb.KWHzl;
        }
        return c44364sNb.KWHzl(i, str3, str4, oKConversation2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44364sNb KWHzl(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, OKConversation oKConversation, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C44364sNb(i, str, str2, oKConversation, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKConversation copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44364sNb)) {
            return false;
        }
        C44364sNb c44364sNb = (C44364sNb) obj;
        return this.OLrzqt == c44364sNb.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c44364sNb.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c44364sNb.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c44364sNb.copydefault) && this.KWHzl == c44364sNb.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.OLrzqt);
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        OKConversation oKConversation = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (oKConversation == null ? 0 : oKConversation.hashCode())) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WSPushNotification(id=" + this.OLrzqt + ", title=" + this.EZpvd + ", content=" + this.AEQbTJ + ", conversation=" + this.copydefault + ", isNoDisturb=" + this.KWHzl + ")";
    }

    public C44364sNb(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, OKConversation oKConversation, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = i;
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.copydefault = oKConversation;
        this.KWHzl = z;
    }
}
