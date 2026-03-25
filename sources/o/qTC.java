package o;

import com.okinc.tradeapi.framework.constant.TradeKey;

/* JADX INFO: loaded from: classes9.dex */
public final class qTC {
    public static final qTC copydefault = new qTC();

    private qTC() {
    }

    public final java.lang.String AEQbTJ() {
        xOW newProxyInstance;
        java.lang.String strZsXlph = null;
        if (!C55608xnE.isLogin$default(null, 1, null)) {
            return "USDT";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
            strZsXlph = newProxyInstance.zsXlph();
        }
        if (strZsXlph == null || strZsXlph.length() == 0) {
            java.lang.String strOLrzqt = OLrzqt();
            return strOLrzqt == null ? "USDT" : strOLrzqt;
        }
        pUU.EZpvd("MarketStableCoinExt", "getStableCoinText() called return tradeStableCoin " + strZsXlph);
        return strZsXlph;
    }

    public final java.lang.String OLrzqt() {
        if (!C55608xnE.isLogin$default(null, 1, null)) {
            return "USDT";
        }
        java.lang.String strCopydefault = ((InterfaceC49422uoJ) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.COMMON)).copydefault();
        pUU.EZpvd("MarketStableCoinExt", "getStableCoinCache() called return cacheStableCoin " + strCopydefault);
        return strCopydefault;
    }

    public final java.lang.String copydefault() {
        xOW newProxyInstance;
        java.lang.String strZLjUOn = null;
        if (!C55608xnE.isLogin$default(null, 1, null)) {
            return "USDT";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
            strZLjUOn = newProxyInstance.zLjUOn();
        }
        pUU.EZpvd("MarketStableCoinExt", "getDisplayStableCoinText() called return tradeStableCoin " + strZLjUOn);
        return strZLjUOn == null ? "USDT" : strZLjUOn;
    }
}
