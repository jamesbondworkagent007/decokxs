package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.ChangeValCurrencyData;
import com.okinc.preference.data.model.EmptyResp;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.preference.data.remote.LocalConfigRemoteDataSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tXP extends AbstractC43215rlA implements InterfaceC46550tYm {
    @Override // o.InterfaceC46550tYm
    public AbstractC58185ywX<ResponseData<EmptyResp>> AEQbTJ(@NotNull ChangeValCurrencyData changeValCurrencyData) {
        Intrinsics.checkNotNullParameter(changeValCurrencyData, "");
        return C33024moe.KWHzl((AbstractC58185ywX) LocalConfigRemoteDataSource.Companion.KWHzl().setValuationCurrency(changeValCurrencyData));
    }

    @Override // o.InterfaceC46550tYm
    public AbstractC58185ywX<ResponseData<java.util.ArrayList<ValuationCurrencyBean>>> copydefault(boolean z) {
        return tXJ.copydefault.EZpvd(z);
    }
}
