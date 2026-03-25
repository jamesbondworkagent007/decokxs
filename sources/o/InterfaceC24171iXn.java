package o;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iXn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC24171iXn {
    android.os.Bundle AEQbTJ();

    void EZpvd(android.os.Bundle bundle);

    void EZpvd(@NotNull InvestTradeManager.TransactionResultExtraData transactionResultExtraData);

    void EZpvd(@NotNull java.lang.String str, boolean z);

    void OLrzqt(@NotNull java.lang.String str, java.lang.Integer num);

    kotlin.Pair<java.lang.String, java.lang.Boolean> copydefault(@NotNull java.lang.String str, @NotNull InvestGasPriceConfig investGasPriceConfig);

    void copydefault();
}
