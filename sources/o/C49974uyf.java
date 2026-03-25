package o;

import com.okinc.biz.TradeType;
import com.okinc.tradeuilib.order.trade.view.AccountMode;
import com.okinc.unify_trade.biz.BizInstrument;

/* JADX INFO: renamed from: o.uyf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49974uyf {
    public static final C49974uyf EZpvd = new C49974uyf();

    private C49974uyf() {
    }

    public final AccountMode copydefault() {
        xOW newProxyInstance;
        AccountMode.StateListAnimator stateListAnimator = AccountMode.Companion;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return stateListAnimator.copydefault((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
    }

    public static /* synthetic */ boolean isSideSupportLoan$default(C49974uyf c49974uyf, AccountMode accountMode, BizInstrument bizInstrument, TradeType tradeType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        return c49974uyf.KWHzl(accountMode, bizInstrument, tradeType, str);
    }

    public final boolean KWHzl(AccountMode accountMode, BizInstrument bizInstrument, TradeType tradeType, java.lang.String str) {
        boolean zKWHzl;
        C54794xVo c54794xVo;
        xOV xovCopydefault;
        if (accountMode == null) {
            return false;
        }
        if (accountMode == AccountMode.FUTURES) {
            return true;
        }
        if (tradeType == TradeType.BUY_OPEN) {
            zKWHzl = C54794xVo.copydefault.AEQbTJ(bizInstrument, str);
        } else {
            C54794xVo c54794xVo2 = C54794xVo.copydefault;
            if (accountMode != AccountMode.TRADING) {
                str = null;
            }
            zKWHzl = c54794xVo2.KWHzl(bizInstrument, str);
        }
        if (accountMode == AccountMode.TRADING) {
            return zKWHzl;
        }
        if (zKWHzl && (xovCopydefault = (c54794xVo = C54794xVo.copydefault).copydefault()) != null && xovCopydefault.copydefault() && c54794xVo.KWHzl(bizInstrument) && c54794xVo.OLrzqt()) {
            return !c54794xVo.copydefault(bizInstrument != null ? bizInstrument.getInstId() : null);
        }
        return false;
    }

    public static /* synthetic */ boolean isAnySideSupportLoan$default(C49974uyf c49974uyf, AccountMode accountMode, BizInstrument bizInstrument, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return c49974uyf.AEQbTJ(accountMode, bizInstrument, str);
    }

    public final boolean AEQbTJ(AccountMode accountMode, BizInstrument bizInstrument, java.lang.String str) {
        if (KWHzl(accountMode, bizInstrument, TradeType.BUY_OPEN, str)) {
            return true;
        }
        return KWHzl(accountMode, bizInstrument, TradeType.SELL_CLOSE, str);
    }
}
