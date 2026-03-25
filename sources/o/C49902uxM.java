package o;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.uxM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49902uxM implements InterfaceC49903uxN {
    public static final int AEQbTJ = BizInstrument.$stable;
    public final BizInstrument KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C49902uxM copy$default(C49902uxM c49902uxM, BizInstrument bizInstrument, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bizInstrument = c49902uxM.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c49902uxM.OLrzqt;
        }
        return c49902uxM.AEQbTJ(bizInstrument, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C49902uxM AEQbTJ(BizInstrument bizInstrument, java.lang.String str) {
        return new C49902uxM(bizInstrument, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BizInstrument OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49902uxM)) {
            return false;
        }
        C49902uxM c49902uxM = (C49902uxM) obj;
        return Intrinsics.EZpvd(this.KWHzl, c49902uxM.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c49902uxM.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        BizInstrument bizInstrument = this.KWHzl;
        int iHashCode = bizInstrument == null ? 0 : bizInstrument.hashCode();
        java.lang.String str = this.OLrzqt;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarginSwitchUpdateParamsMultiPmAccount(bizInstrument=" + this.KWHzl + ", orderType=" + this.OLrzqt + ")";
    }

    public C49902uxM(BizInstrument bizInstrument, java.lang.String str) {
        this.KWHzl = bizInstrument;
        this.OLrzqt = str;
    }
}
