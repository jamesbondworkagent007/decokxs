package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.Page;

/* JADX INFO: renamed from: o.AiL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3244AiL {
    public static final int $stable = 8;
    public java.util.List<? extends Page> AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.AiL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3244AiL copy$default(C3244AiL c3244AiL, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3244AiL.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = c3244AiL.EZpvd;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            z = c3244AiL.OLrzqt;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = c3244AiL.copydefault;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            list = c3244AiL.AEQbTJ;
        }
        return c3244AiL.OLrzqt(str, str3, z3, z4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends uniffi.account.Page>, java.util.List<uniffi.account.Page> */
    public final java.util.List<Page> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3244AiL OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, @NotNull java.util.List<? extends Page> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C3244AiL(str, str2, z, z2, list);
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
        if (!(obj instanceof C3244AiL)) {
            return false;
        }
        C3244AiL c3244AiL = (C3244AiL) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c3244AiL.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c3244AiL.EZpvd) && this.OLrzqt == c3244AiL.OLrzqt && this.copydefault == c3244AiL.copydefault && Intrinsics.EZpvd(this.AEQbTJ, c3244AiL.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UserCenterState(avatarName=" + this.KWHzl + ", avatarDesc=" + this.EZpvd + ", isAvatarUploadable=" + this.OLrzqt + ", isAvatarRejected=" + this.copydefault + ", pageOrder=" + this.AEQbTJ + ")";
    }

    public C3244AiL(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, @NotNull java.util.List<? extends Page> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = str;
        this.EZpvd = str2;
        this.OLrzqt = z;
        this.copydefault = z2;
        this.AEQbTJ = list;
    }
}
