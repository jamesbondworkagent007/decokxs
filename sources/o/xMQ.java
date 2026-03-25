package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.unify_trade.biz.ValuationCurrencyData;

/* JADX INFO: loaded from: classes12.dex */
public final class xMQ extends xMS {
    public xMQ() {
        super(false, 1, null);
    }

    @Override // o.xMS
    public java.lang.String copydefault() {
        return djBIcL();
    }

    public final java.lang.String djBIcL() {
        xOW newProxyInstance;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String usdToThisRate = (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null) ? null : value.getUsdToThisRate();
        java.lang.String strEZpvd = EZpvd();
        if (usdToThisRate == null) {
            usdToThisRate = "0";
        }
        return C33129mqd.mulS$default(strEZpvd, usdToThisRate, null, null, null, 14, null);
    }
}
