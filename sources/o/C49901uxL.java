package o;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.uxL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49901uxL implements InterfaceC49903uxN {
    public static final int OLrzqt = BizInstrument.$stable;
    public final java.lang.String AEQbTJ;
    public final BizInstrument EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C49901uxL copy$default(C49901uxL c49901uxL, BizInstrument bizInstrument, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bizInstrument = c49901uxL.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c49901uxL.AEQbTJ;
        }
        return c49901uxL.EZpvd(bizInstrument, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C49901uxL EZpvd(BizInstrument bizInstrument, java.lang.String str) {
        return new C49901uxL(bizInstrument, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BizInstrument KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49901uxL)) {
            return false;
        }
        C49901uxL c49901uxL = (C49901uxL) obj;
        return Intrinsics.EZpvd(this.EZpvd, c49901uxL.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c49901uxL.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        BizInstrument bizInstrument = this.EZpvd;
        int iHashCode = bizInstrument == null ? 0 : bizInstrument.hashCode();
        java.lang.String str = this.AEQbTJ;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarginSwitchUpdateParamsFuturesAccount(bizInstrument=" + this.EZpvd + ", orderType=" + this.AEQbTJ + ")";
    }

    public C49901uxL(BizInstrument bizInstrument, java.lang.String str) {
        this.EZpvd = bizInstrument;
        this.AEQbTJ = str;
    }
}
