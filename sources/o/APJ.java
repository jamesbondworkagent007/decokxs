package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class APJ {
    public static final int $stable = 8;
    public APM AEQbTJ;
    public C2563AQo KWHzl;
    public AbstractC2565AQq OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ APJ copy$default(APJ apj, APM apm, AbstractC2565AQq abstractC2565AQq, C2563AQo c2563AQo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            apm = apj.AEQbTJ;
        }
        if ((i & 2) != 0) {
            abstractC2565AQq = apj.OLrzqt;
        }
        if ((i & 4) != 0) {
            c2563AQo = apj.KWHzl;
        }
        return apj.EZpvd(apm, abstractC2565AQq, c2563AQo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final APJ EZpvd(@NotNull APM apm, @NotNull AbstractC2565AQq abstractC2565AQq, C2563AQo c2563AQo) {
        Intrinsics.checkNotNullParameter(apm, "");
        Intrinsics.checkNotNullParameter(abstractC2565AQq, "");
        return new APJ(apm, abstractC2565AQq, c2563AQo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final APM EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2563AQo OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC2565AQq copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APJ)) {
            return false;
        }
        APJ apj = (APJ) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, apj.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, apj.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, apj.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        C2563AQo c2563AQo = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (c2563AQo == null ? 0 : c2563AQo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ShareConfig(shareParams=" + this.AEQbTJ + ", previewConfig=" + this.OLrzqt + ", sharePlatformConfig=" + this.KWHzl + ")";
    }

    public APJ(@NotNull APM apm, @NotNull AbstractC2565AQq abstractC2565AQq, C2563AQo c2563AQo) {
        Intrinsics.checkNotNullParameter(apm, "");
        Intrinsics.checkNotNullParameter(abstractC2565AQq, "");
        this.AEQbTJ = apm;
        this.OLrzqt = abstractC2565AQq;
        this.KWHzl = c2563AQo;
    }
}
