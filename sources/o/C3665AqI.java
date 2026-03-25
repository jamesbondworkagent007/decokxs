package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AqI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C3665AqI {
    public static final int $stable = 8;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3665AqI copy$default(C3665AqI c3665AqI, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3665AqI.copydefault;
        }
        return c3665AqI.EZpvd(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3665AqI EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C3665AqI(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3665AqI) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((C3665AqI) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BuySellFxRateConversion(formattedFxRate=" + this.copydefault + ")";
    }

    public C3665AqI(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }
}
