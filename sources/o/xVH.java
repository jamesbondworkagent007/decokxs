package o;

import com.google.gson.Gson;
import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.StableCoin;

/* JADX INFO: loaded from: classes12.dex */
public final class xVH {
    public static final xVH AEQbTJ = new xVH();

    private xVH() {
    }

    public final void OLrzqt() {
        java.util.List<StableCoin> listAhwBna;
        xOW newProxyInstance;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (listAhwBna = newProxyInstance.QVAiDq()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        SPUtils.put("trade_impl_stable_list_save_key_new-" + c54589xNz.DbNXlk() + "-" + c54589xNz.EZpvd(), new Gson().toJson(listAhwBna), "trade_impl_stable_save_file_name");
    }

    public final void copydefault() {
        xOW newProxyInstance;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String strZsXlph = (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.zsXlph();
        SPUtils.put("trade_impl_stable_coin_save_key-" + c54589xNz.DbNXlk() + "-" + c54589xNz.EZpvd(), strZsXlph, "trade_impl_stable_save_file_name");
    }

    public final java.lang.String AEQbTJ() {
        if (!C55697xoo.OLrzqt.isConnected()) {
            return null;
        }
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        return SPUtils.getString("trade_impl_stable_coin_save_key-" + c54589xNz.DbNXlk() + "-" + c54589xNz.EZpvd(), null, "trade_impl_stable_save_file_name");
    }
}
