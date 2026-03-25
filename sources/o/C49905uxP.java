package o;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.uxP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49905uxP implements InterfaceC49904uxO {
    public static final int EZpvd = BizInstrument.$stable;
    public final java.lang.Boolean KWHzl;
    public final BizInstrument OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C49905uxP copy$default(C49905uxP c49905uxP, BizInstrument bizInstrument, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bizInstrument = c49905uxP.OLrzqt;
        }
        if ((i & 2) != 0) {
            bool = c49905uxP.KWHzl;
        }
        return c49905uxP.OLrzqt(bizInstrument, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BizInstrument AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C49905uxP OLrzqt(BizInstrument bizInstrument, java.lang.Boolean bool) {
        return new C49905uxP(bizInstrument, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49905uxP)) {
            return false;
        }
        C49905uxP c49905uxP = (C49905uxP) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c49905uxP.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c49905uxP.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        BizInstrument bizInstrument = this.OLrzqt;
        int iHashCode = bizInstrument == null ? 0 : bizInstrument.hashCode();
        java.lang.Boolean bool = this.KWHzl;
        return (iHashCode * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarginSwitchUpdateParamsTradingAccount(bizInstrument=" + this.OLrzqt + ", isMarginSupported=" + this.KWHzl + ")";
    }

    public C49905uxP(BizInstrument bizInstrument, java.lang.Boolean bool) {
        this.OLrzqt = bizInstrument;
        this.KWHzl = bool;
    }
}
