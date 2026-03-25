package o;

import com.okinc.unify_trade.biz.ValuationCurrencyData;

/* JADX INFO: loaded from: classes12.dex */
public final class xMU extends xMS {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xMS
    public java.lang.String copydefault() {
        return "1";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xMU() {
        xOW newProxyInstance;
        super(false, 1, null);
        ValuationCurrencyData valuationCurrencyDataAEQbTJ = null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
            valuationCurrencyDataAEQbTJ = newProxyInstance.AEQbTJ("USD");
        }
        if (valuationCurrencyDataAEQbTJ != null) {
            KWHzl(valuationCurrencyDataAEQbTJ.getIsoCode(), valuationCurrencyDataAEQbTJ.getSymbol(), valuationCurrencyDataAEQbTJ.getPrecision(), valuationCurrencyDataAEQbTJ.getIsoCode(), valuationCurrencyDataAEQbTJ.getSymbol(), valuationCurrencyDataAEQbTJ.getPrecision(), true);
        }
    }
}
