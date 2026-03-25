package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.growth.ShareParamsKind;

/* JADX INFO: loaded from: classes13.dex */
public final class APM {
    public static final int $stable = 8;
    public C2561AQm AEQbTJ;
    public C2500AOd KWHzl;
    public ShareParamsKind OLrzqt;
    public ANY copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ APM copy$default(APM apm, ShareParamsKind shareParamsKind, C2561AQm c2561AQm, ANY any, C2500AOd c2500AOd, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            shareParamsKind = apm.OLrzqt;
        }
        if ((i & 2) != 0) {
            c2561AQm = apm.AEQbTJ;
        }
        if ((i & 4) != 0) {
            any = apm.copydefault;
        }
        if ((i & 8) != 0) {
            c2500AOd = apm.KWHzl;
        }
        return apm.KWHzl(shareParamsKind, c2561AQm, any, c2500AOd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ANY AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareParamsKind EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final APM KWHzl(@NotNull ShareParamsKind shareParamsKind, C2561AQm c2561AQm, ANY any, C2500AOd c2500AOd) {
        Intrinsics.checkNotNullParameter(shareParamsKind, "");
        return new APM(shareParamsKind, c2561AQm, any, c2500AOd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2561AQm KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2500AOd copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APM)) {
            return false;
        }
        APM apm = (APM) obj;
        return this.OLrzqt == apm.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, apm.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, apm.copydefault) && Intrinsics.EZpvd(this.KWHzl, apm.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        C2561AQm c2561AQm = this.AEQbTJ;
        int iHashCode2 = c2561AQm == null ? 0 : c2561AQm.hashCode();
        ANY any = this.copydefault;
        int iHashCode3 = any == null ? 0 : any.hashCode();
        C2500AOd c2500AOd = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c2500AOd != null ? c2500AOd.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ShareParams(kind=" + this.OLrzqt + ", text=" + this.AEQbTJ + ", image=" + this.copydefault + ", link=" + this.KWHzl + ")";
    }

    public APM(@NotNull ShareParamsKind shareParamsKind, C2561AQm c2561AQm, ANY any, C2500AOd c2500AOd) {
        Intrinsics.checkNotNullParameter(shareParamsKind, "");
        this.OLrzqt = shareParamsKind;
        this.AEQbTJ = c2561AQm;
        this.copydefault = any;
        this.KWHzl = c2500AOd;
    }
}
