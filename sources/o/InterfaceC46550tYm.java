package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.ChangeValCurrencyData;
import com.okinc.preference.data.model.EmptyResp;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;

/* JADX INFO: renamed from: o.tYm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC46550tYm extends InterfaceC43217rlC {
    AbstractC58185ywX<ResponseData<EmptyResp>> AEQbTJ(@Body @NotNull ChangeValCurrencyData changeValCurrencyData);

    AbstractC58185ywX<ResponseData<java.util.ArrayList<ValuationCurrencyBean>>> copydefault(boolean z);

    /* JADX INFO: renamed from: o.tYm$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ AbstractC58185ywX getCurrencyList$default(InterfaceC46550tYm interfaceC46550tYm, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrencyList");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return interfaceC46550tYm.copydefault(z);
        }
    }
}
