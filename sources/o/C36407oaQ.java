package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oaQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36407oaQ {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C36407oaQ copy$default(C36407oaQ c36407oaQ, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = c36407oaQ.KWHzl;
        }
        if ((i3 & 2) != 0) {
            str2 = c36407oaQ.EZpvd;
        }
        java.lang.String str4 = str2;
        if ((i3 & 4) != 0) {
            str3 = c36407oaQ.AEQbTJ;
        }
        java.lang.String str5 = str3;
        if ((i3 & 8) != 0) {
            i = c36407oaQ.copydefault;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = c36407oaQ.OLrzqt;
        }
        return c36407oaQ.OLrzqt(str, str4, str5, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36407oaQ OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C36407oaQ(str, str2, str3, i, i2);
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
        if (!(obj instanceof C36407oaQ)) {
            return false;
        }
        C36407oaQ c36407oaQ = (C36407oaQ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c36407oaQ.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c36407oaQ.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c36407oaQ.AEQbTJ) && this.copydefault == c36407oaQ.copydefault && this.OLrzqt == c36407oaQ.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MentionBlock(userId=" + this.KWHzl + ", displayName=" + this.EZpvd + ", sendName=" + this.AEQbTJ + ", start=" + this.copydefault + ", end=" + this.OLrzqt + ")";
    }

    public C36407oaQ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl = str;
        this.EZpvd = str2;
        this.AEQbTJ = str3;
        this.copydefault = i;
        this.OLrzqt = i2;
    }
}
