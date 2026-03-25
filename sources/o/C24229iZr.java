package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iZr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24229iZr {
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C24229iZr copy$default(C24229iZr c24229iZr, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c24229iZr.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c24229iZr.KWHzl;
        }
        return c24229iZr.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24229iZr copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C24229iZr(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24229iZr)) {
            return false;
        }
        C24229iZr c24229iZr = (C24229iZr) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c24229iZr.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c24229iZr.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ClaimableReward(amount=" + this.EZpvd + ", label=" + this.KWHzl + ")";
    }

    public C24229iZr(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.KWHzl = str2;
    }
}
