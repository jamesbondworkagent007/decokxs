package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bhs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C4536Bhs {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4536Bhs copy$default(C4536Bhs c4536Bhs, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c4536Bhs.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c4536Bhs.AEQbTJ;
        }
        return c4536Bhs.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4536Bhs AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C4536Bhs(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4536Bhs)) {
            return false;
        }
        C4536Bhs c4536Bhs = (C4536Bhs) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c4536Bhs.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c4536Bhs.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketCapPoint(timestamp=" + this.OLrzqt + ", marketCapValue=" + this.AEQbTJ + ")";
    }

    public C4536Bhs(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.AEQbTJ = str2;
    }
}
