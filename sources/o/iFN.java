package o;

import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq;
import com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iFN {
    java.lang.Object EZpvd(@NotNull InvestSubscriptionReceiveReq investSubscriptionReceiveReq, @NotNull java.lang.String str, @NotNull TransactionConfig transactionConfig, @NotNull Continuation<? super Result<InvestDetailsAndGasFee>> continuation);
}
