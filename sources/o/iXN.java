package o;

import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iXN {
    InvestTradeManager.TransactionResultExtraData copydefault();

    java.lang.Object copydefault(@NotNull TransactionConfig transactionConfig, @NotNull InterfaceC24182iXy interfaceC24182iXy, @NotNull InvestTxModel investTxModel, @NotNull Continuation<? super Result<C24183iXz>> continuation);
}
