package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zzw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C60292zzw {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C60292zzw copy$default(C60292zzw c60292zzw, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c60292zzw.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c60292zzw.copydefault;
        }
        return c60292zzw.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60292zzw copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C60292zzw(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60292zzw)) {
            return false;
        }
        C60292zzw c60292zzw = (C60292zzw) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c60292zzw.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c60292zzw.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BleSyncError(errorType=" + this.AEQbTJ + ", message=" + this.copydefault + ")";
    }

    public C60292zzw(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.copydefault = str2;
    }
}
