package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.ValuationCurrencyBean;

/* JADX INFO: loaded from: classes12.dex */
public final class xDI extends xKE<java.util.ArrayList<ValuationCurrencyBean>> {
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.copydefault = z;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.ArrayList<ValuationCurrencyBean>>> EZpvd() {
        InterfaceC46550tYm interfaceC46550tYm = (InterfaceC46550tYm) C43251rlk.OLrzqt(InterfaceC46550tYm.class);
        if (interfaceC46550tYm != null) {
            return interfaceC46550tYm.copydefault(this.copydefault);
        }
        return null;
    }
}
