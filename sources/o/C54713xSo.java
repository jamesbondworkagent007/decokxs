package o;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xSo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54713xSo {
    public static final int OLrzqt = BizInstrument.$stable;
    public final float EZpvd;
    public final BizInstrument copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C54713xSo copy$default(C54713xSo c54713xSo, BizInstrument bizInstrument, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bizInstrument = c54713xSo.copydefault;
        }
        if ((i & 2) != 0) {
            f = c54713xSo.EZpvd;
        }
        return c54713xSo.KWHzl(bizInstrument, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54713xSo KWHzl(@NotNull BizInstrument bizInstrument, float f) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        return new C54713xSo(bizInstrument, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizInstrument copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54713xSo)) {
            return false;
        }
        C54713xSo c54713xSo = (C54713xSo) obj;
        return Intrinsics.EZpvd(this.copydefault, c54713xSo.copydefault) && java.lang.Float.compare(this.EZpvd, c54713xSo.EZpvd) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + java.lang.Float.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchWrapBizInstrument(instrument=" + this.copydefault + ", score=" + this.EZpvd + ")";
    }

    public C54713xSo(@NotNull BizInstrument bizInstrument, float f) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        this.copydefault = bizInstrument;
        this.EZpvd = f;
    }
}
