package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ntD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35322ntD {
    public final java.lang.String OLrzqt;
    public final android.content.Context copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35322ntD copy$default(C35322ntD c35322ntD, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = c35322ntD.copydefault;
        }
        if ((i & 2) != 0) {
            str = c35322ntD.OLrzqt;
        }
        return c35322ntD.AEQbTJ(context, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35322ntD AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C35322ntD(context, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.Context copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35322ntD)) {
            return false;
        }
        C35322ntD c35322ntD = (C35322ntD) obj;
        return Intrinsics.EZpvd(this.copydefault, c35322ntD.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c35322ntD.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "VipCrmEntryPoint(context=" + this.copydefault + ", uid=" + this.OLrzqt + ")";
    }

    public C35322ntD(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = context;
        this.OLrzqt = str;
    }
}
