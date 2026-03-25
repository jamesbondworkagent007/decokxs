package o;

import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lJY {
    public static final java.util.List<CurrencyModel> OLrzqt(@NotNull java.util.List<BuySellCurrency> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (BuySellCurrency buySellCurrency : list) {
            arrayList.add(new CurrencyModel(buySellCurrency.getCurrency(), buySellCurrency.getDisplayName(), C33492mxV.OLrzqt() ? buySellCurrency.getNightIcon() : buySellCurrency.getIcon()));
        }
        return arrayList;
    }
}
