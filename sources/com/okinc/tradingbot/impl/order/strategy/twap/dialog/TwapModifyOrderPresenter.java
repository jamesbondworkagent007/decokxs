package com.okinc.tradingbot.impl.order.strategy.twap.dialog;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TwapModifyReq;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TwapModifyBean;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54531xLw;
import o.C33129mqd;
import o.C54566xNc;
import o.C54571xNh;
import o.C54589xNz;
import o.C54797xVr;
import o.C54799xVt;
import o.C56033xvF;
import o.C56176xxq;
import o.C56402yEa;
import o.InterfaceC54581xNr;
import o.xKK;
import o.xMR;
import o.xMS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class TwapModifyOrderPresenter extends AbsPresenter {
    public final TradeLiveData<List<StrategyResponse>> AEQbTJ;
    public TwapModifyBean EZpvd;
    public boolean KWHzl;
    public final C56176xxq OLrzqt;
    public TacticsData copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(TacticsData tacticsData) {
        this.copydefault = tacticsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(TwapModifyBean twapModifyBean) {
        this.EZpvd = twapModifyBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56176xxq AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<StrategyResponse>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData valueOf() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwapModifyOrderPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = new C56176xxq();
        this.AEQbTJ = new TradeLiveData<>();
    }

    public final String AEQbTJ() {
        C54799xVt c54799xVt = C54799xVt.AEQbTJ;
        TacticsData tacticsData = this.copydefault;
        String instId = tacticsData != null ? tacticsData.getInstId() : null;
        TacticsData tacticsData2 = this.copydefault;
        return C54799xVt.getTitleByIdAndType$default(c54799xVt, instId, tacticsData2 != null ? tacticsData2.getInstType() : null, false, false, 12, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.OLrzqt);
    }

    public final String copydefault() {
        String pxSpread;
        TacticsData tacticsData = this.copydefault;
        return (tacticsData == null || (pxSpread = tacticsData.getPxSpread()) == null || !C33129mqd.OLrzqt((CharSequence) pxSpread)) ? "ratio" : "price_from";
    }

    public final String AhwBna() {
        String strCopydefault;
        TacticsData tacticsData = this.copydefault;
        if (tacticsData != null) {
            if (C33129mqd.OLrzqt((CharSequence) tacticsData.getPxSpread())) {
                String instType = tacticsData.getInstType();
                String instId = tacticsData.getInstId();
                String pxSpread = tacticsData.getPxSpread();
                Intrinsics.copydefault((Object) pxSpread);
                strCopydefault = C56033xvF.getBotPrice$default(instType, instId, pxSpread, false, false, null, null, 120, null);
            } else {
                strCopydefault = xMR.copydefault.copydefault(C33129mqd.mulS$default(tacticsData.getPxVar(), 100, null, null, null, 14, null));
            }
            if (strCopydefault != null) {
                return strCopydefault;
            }
        }
        return "";
    }

    public final String OLrzqt() {
        TacticsData tacticsData = this.copydefault;
        if (tacticsData != null) {
            String pxLimit = tacticsData.getPxLimit();
            String botPrice$default = pxLimit != null ? C56033xvF.getBotPrice$default(tacticsData.getInstType(), tacticsData.getInstId(), pxLimit, false, false, null, null, 120, null) : null;
            if (botPrice$default != null) {
                return botPrice$default;
            }
        }
        return "";
    }

    public final String isConnected() {
        TacticsData tacticsData = this.copydefault;
        if (tacticsData != null) {
            String timeInterval = tacticsData.getTimeInterval();
            String strCopydefault = timeInterval != null ? xMR.copydefault.copydefault(timeInterval) : null;
            if (strCopydefault != null) {
                return strCopydefault;
            }
        }
        return "";
    }

    public final String djBIcL() {
        String botAmount$default;
        TacticsData tacticsData = this.copydefault;
        if (tacticsData != null) {
            if (tacticsData.getSzLimit() != null) {
                String instType = tacticsData.getInstType();
                String instId = tacticsData.getInstId();
                String szLimit = tacticsData.getSzLimit();
                Intrinsics.copydefault((Object) szLimit);
                botAmount$default = C56033xvF.getBotAmount$default(instType, instId, szLimit, null, false, null, 56, null);
            } else {
                botAmount$default = null;
            }
            if (botAmount$default != null) {
                return botAmount$default;
            }
        }
        return "";
    }

    public final String gEmmrt() {
        String botAmount$default;
        TacticsData tacticsData = this.copydefault;
        if (tacticsData != null) {
            if (tacticsData.getSz() != null) {
                String instType = tacticsData.getInstType();
                String instId = tacticsData.getInstId();
                String sz = tacticsData.getSz();
                Intrinsics.copydefault((Object) sz);
                botAmount$default = C56033xvF.getBotAmount$default(instType, instId, sz, null, false, null, 56, null);
            } else {
                botAmount$default = null;
            }
            if (botAmount$default != null) {
                return botAmount$default;
            }
        }
        return "";
    }

    public final boolean EZpvd(@NotNull TwapModifyBean twapModifyBean) {
        Intrinsics.checkNotNullParameter(twapModifyBean, "");
        TwapModifyBean twapModifyBean2 = this.EZpvd;
        if (Intrinsics.EZpvd((Object) (twapModifyBean2 != null ? twapModifyBean2.getSpread() : null), (Object) twapModifyBean.getSpread())) {
            TwapModifyBean twapModifyBean3 = this.EZpvd;
            if (Intrinsics.EZpvd((Object) (twapModifyBean3 != null ? twapModifyBean3.getLimitPrice() : null), (Object) twapModifyBean.getLimitPrice())) {
                TwapModifyBean twapModifyBean4 = this.EZpvd;
                if (Intrinsics.EZpvd((Object) (twapModifyBean4 != null ? twapModifyBean4.getTimeInterval() : null), (Object) twapModifyBean.getTimeInterval())) {
                    TwapModifyBean twapModifyBean5 = this.EZpvd;
                    if (Intrinsics.EZpvd((Object) (twapModifyBean5 != null ? twapModifyBean5.getOrderCtVal() : null), (Object) twapModifyBean.getOrderCtVal())) {
                        TwapModifyBean twapModifyBean6 = this.EZpvd;
                        if (Intrinsics.EZpvd((Object) (twapModifyBean6 != null ? twapModifyBean6.getOrderSz() : null), (Object) twapModifyBean.getOrderSz())) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull TwapReq twapReq) {
        String pxSpread;
        String str;
        String strKWHzl;
        String strKWHzl2;
        String strValueOf;
        String algoId;
        Intrinsics.checkNotNullParameter(twapReq, "");
        TacticsData tacticsData = this.copydefault;
        xMS xmsAEQbTJ = tacticsData != null ? C54797xVr.copydefault.AEQbTJ(tacticsData.getInstId(), tacticsData.getInstType()) : null;
        C54571xNh c54571xNhKWHzl = KWHzl();
        TacticsData tacticsData2 = this.copydefault;
        String str2 = (tacticsData2 == null || (algoId = tacticsData2.getAlgoId()) == null) ? "" : algoId;
        String pxSpread2 = twapReq.getPxSpread();
        if (pxSpread2 == null || pxSpread2.length() == 0) {
            pxSpread = twapReq.getPxSpread();
        } else if (xmsAEQbTJ != null) {
            String pxSpread3 = twapReq.getPxSpread();
            Intrinsics.copydefault((Object) pxSpread3);
            pxSpread = xmsAEQbTJ.valueOf(pxSpread3);
        } else {
            str = null;
            TwapModifyReq twapModifyReq = new TwapModifyReq(str2, (xmsAEQbTJ != null || (strValueOf = xmsAEQbTJ.valueOf(twapReq.getPxLimit())) == null) ? "" : strValueOf, str, twapReq.getPxVar(), (c54571xNhKWHzl != null || (strKWHzl2 = c54571xNhKWHzl.KWHzl(twapReq.getSzLimit())) == null) ? "" : strKWHzl2, twapReq.getTimeInterval(), (c54571xNhKWHzl != null || (strKWHzl = c54571xNhKWHzl.KWHzl(twapReq.getSz())) == null) ? "" : strKWHzl);
            C56176xxq c56176xxq = this.OLrzqt;
            c56176xxq.EZpvd(twapModifyReq);
            c56176xxq.AEQbTJ(this.AEQbTJ);
            xKK.Activity.execute$default(c56176xxq, 0L, 1, null);
        }
        str = pxSpread;
        if (xmsAEQbTJ != null) {
        }
        TwapModifyReq twapModifyReq2 = new TwapModifyReq(str2, (xmsAEQbTJ != null || (strValueOf = xmsAEQbTJ.valueOf(twapReq.getPxLimit())) == null) ? "" : strValueOf, str, twapReq.getPxVar(), (c54571xNhKWHzl != null || (strKWHzl2 = c54571xNhKWHzl.KWHzl(twapReq.getSzLimit())) == null) ? "" : strKWHzl2, twapReq.getTimeInterval(), (c54571xNhKWHzl != null || (strKWHzl = c54571xNhKWHzl.KWHzl(twapReq.getSz())) == null) ? "" : strKWHzl);
        C56176xxq c56176xxq2 = this.OLrzqt;
        c56176xxq2.EZpvd(twapModifyReq2);
        c56176xxq2.AEQbTJ(this.AEQbTJ);
        xKK.Activity.execute$default(c56176xxq2, 0L, 1, null);
    }

    public final C54571xNh KWHzl() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        TacticsData tacticsData = this.copydefault;
        if (tacticsData != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            BizInstrument bizInstrumentValueOf = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(tacticsData.getInstType())) == null) ? null : abstractC54531xLwOLrzqt.valueOf(tacticsData.getInstId());
            if (bizInstrumentValueOf != null) {
                return C54566xNc.OLrzqt(bizInstrumentValueOf.getInstType(), bizInstrumentValueOf.getInstFamily(), null);
            }
        }
        return null;
    }
}
