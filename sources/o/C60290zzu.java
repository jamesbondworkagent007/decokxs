package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zzu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C60290zzu {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C60290zzu copy$default(C60290zzu c60290zzu, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c60290zzu.AEQbTJ;
        }
        return c60290zzu.OLrzqt(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60290zzu OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C60290zzu(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C60290zzu) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((C60290zzu) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BleSyncProtectionKey(protectionPublicKey=" + this.AEQbTJ + ")";
    }

    public C60290zzu(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }
}
