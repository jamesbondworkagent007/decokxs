package o;

import com.okinc.biz.TradeType;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;

/* JADX INFO: loaded from: classes11.dex */
public final class wPL {
    public static final wPL KWHzl = new wPL();

    private wPL() {
    }

    public static /* synthetic */ MaxAvailableResp handleSimpleBorrow$default(wPL wpl, MaxAvailableResp maxAvailableResp, java.lang.String str, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        return wpl.OLrzqt(maxAvailableResp, str, bool);
    }

    public final MaxAvailableResp OLrzqt(MaxAvailableResp maxAvailableResp, java.lang.String str, java.lang.Boolean bool) {
        if (maxAvailableResp == null) {
            return null;
        }
        if (bool != null ? bool.booleanValue() : KWHzl.copydefault(str)) {
            return maxAvailableResp;
        }
        maxAvailableResp.setMaxSize(C33129mqd.subS$default(maxAvailableResp.getMaxSize(), maxAvailableResp.getLoanMaxSize(), null, null, null, 14, null));
        maxAvailableResp.setAvailable(C33129mqd.subS$default(maxAvailableResp.getAvailable(), maxAvailableResp.getLoanAvailable(), null, null, null, 14, null));
        return maxAvailableResp;
    }

    public final boolean copydefault(java.lang.String str) {
        if (C54794xVo.copydefault.AhwBna() && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT")) {
            return C49908uxS.Companion.copydefault(C49974uyf.EZpvd.copydefault());
        }
        return true;
    }

    public static /* synthetic */ void avaViewAdapterBorrow$default(wPL wpl, C53539wnR c53539wnR, BizInstrument bizInstrument, MaxAvailableResp maxAvailableResp, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            bool = null;
        }
        wpl.EZpvd(c53539wnR, bizInstrument, maxAvailableResp, fragmentManager, bool);
    }

    public final void EZpvd(C53539wnR c53539wnR, final BizInstrument bizInstrument, final MaxAvailableResp maxAvailableResp, final androidx.fragment.app.FragmentManager fragmentManager, java.lang.Boolean bool) {
        if (c53539wnR != null) {
            java.lang.String instType = bizInstrument != null ? bizInstrument.getInstType() : null;
            if (instType == null) {
                instType = "";
            }
            if (KWHzl.OLrzqt(bool != null ? bool.booleanValue() : KWHzl.copydefault(instType), maxAvailableResp)) {
                c53539wnR.setFooterAvaTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.OVMstZ), true, new Function0() { // from class: o.wPI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return wPL.copydefault(bizInstrument, maxAvailableResp, fragmentManager);
                    }
                });
            } else {
                C53539wnR.setFooterAvaTitle$default(c53539wnR, C33070mpX.AYXKKw(C55688xof.Application.ActionBarTabListener), false, null, 4, null);
            }
        }
    }

    public static final Unit copydefault(BizInstrument bizInstrument, MaxAvailableResp maxAvailableResp, androidx.fragment.app.FragmentManager fragmentManager) {
        wPL wpl = KWHzl;
        Intrinsics.copydefault(maxAvailableResp);
        wpl.AEQbTJ(bizInstrument, maxAvailableResp, fragmentManager);
        return Unit.INSTANCE;
    }

    public final boolean OLrzqt(boolean z, MaxAvailableResp maxAvailableResp) {
        return z && maxAvailableResp != null && C54794xVo.copydefault.AhwBna();
    }

    public final void AEQbTJ(BizInstrument bizInstrument, MaxAvailableResp maxAvailableResp, androidx.fragment.app.FragmentManager fragmentManager) {
        if (fragmentManager != null) {
            java.lang.String tradeSymbol = null;
            java.lang.String instId = bizInstrument != null ? bizInstrument.getInstId() : null;
            java.lang.String str = instId == null ? "" : instId;
            java.lang.String instType = bizInstrument != null ? bizInstrument.getInstType() : null;
            java.lang.String str2 = instType == null ? "" : instType;
            boolean z = C49861uwY.Companion.copydefault().get() == TradeType.BUY_OPEN;
            if (z) {
                if (bizInstrument != null) {
                    tradeSymbol = bizInstrument.getDisplayQuoteSymbol();
                }
            } else if (bizInstrument != null) {
                tradeSymbol = bizInstrument.getTradeSymbol();
            }
            StateListAnimator stateListAnimatorOLrzqt = KWHzl.OLrzqt(C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str, str2, null, z, null, 20, null), maxAvailableResp);
            C52121vzs.Companion.AEQbTJ(tradeSymbol, stateListAnimatorOLrzqt.OLrzqt(), stateListAnimatorOLrzqt.copydefault(), stateListAnimatorOLrzqt.KWHzl()).show(fragmentManager);
        }
    }

    public static final class StateListAnimator {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.OLrzqt;
            }
            if ((i & 4) != 0) {
                str3 = stateListAnimator.EZpvd;
            }
            return stateListAnimator.EZpvd(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            return new StateListAnimator(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
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
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.AEQbTJ;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.OLrzqt;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.EZpvd;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FormattedBorrowAmounts(maxAvailable=" + this.AEQbTJ + ", assetsAvailable=" + this.OLrzqt + ", loanAvailable=" + this.EZpvd + ")";
        }

        public StateListAnimator(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.AEQbTJ = str;
            this.OLrzqt = str2;
            this.EZpvd = str3;
        }
    }

    public final StateListAnimator OLrzqt(C54571xNh c54571xNh, MaxAvailableResp maxAvailableResp) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLAYXKKw2;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo2;
        C54536xML c54536xMLAYXKKw3;
        C54536xML c54536xMLDjBIcL3;
        C54536xML c54536xMLFetchVPNInfo3;
        java.lang.String safeString$default = null;
        java.lang.String safeString$default2 = (c54571xNh == null || (c54536xMLAYXKKw3 = c54571xNh.AYXKKw(maxAvailableResp.getAvailable())) == null || (c54536xMLDjBIcL3 = c54536xMLAYXKKw3.djBIcL()) == null || (c54536xMLFetchVPNInfo3 = c54536xMLDjBIcL3.fetchVPNInfo()) == null) ? null : C54536xML.toSafeString$default(c54536xMLFetchVPNInfo3, false, 1, null);
        java.lang.String safeString$default3 = (c54571xNh == null || (c54536xMLAYXKKw2 = c54571xNh.AYXKKw(maxAvailableResp.getLoanAvailable())) == null || (c54536xMLDjBIcL2 = c54536xMLAYXKKw2.djBIcL()) == null || (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL2.fetchVPNInfo()) == null) ? null : C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null);
        if (c54571xNh != null && (c54536xMLAYXKKw = c54571xNh.AYXKKw(C33129mqd.subS$default(maxAvailableResp.getAvailable(), maxAvailableResp.getLoanAvailable(), null, null, null, 14, null))) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
        }
        return new StateListAnimator(safeString$default2, safeString$default, safeString$default3);
    }
}
