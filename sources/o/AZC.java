package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.network.HostMode;

/* JADX INFO: loaded from: classes17.dex */
public final class AZC {
    public static final int $stable = 8;
    public java.lang.String EZpvd;
    public HostMode KWHzl;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AZC copy$default(AZC azc, java.lang.String str, java.lang.String str2, HostMode hostMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = azc.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = azc.OLrzqt;
        }
        if ((i & 4) != 0) {
            hostMode = azc.KWHzl;
        }
        return azc.OLrzqt(str, str2, hostMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AZC OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, HostMode hostMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AZC(str, str2, hostMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HostMode copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AZC)) {
            return false;
        }
        AZC azc = (AZC) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) azc.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) azc.OLrzqt) && this.KWHzl == azc.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        HostMode hostMode = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (hostMode == null ? 0 : hostMode.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LegacyDownloadOptions(url=" + this.EZpvd + ", savePath=" + this.OLrzqt + ", hostMode=" + this.KWHzl + ")";
    }

    public AZC(@NotNull java.lang.String str, @NotNull java.lang.String str2, HostMode hostMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.KWHzl = hostMode;
    }
}
