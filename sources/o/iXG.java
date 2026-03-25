package o;

import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iXG {
    java.lang.Object AEQbTJ(@NotNull TransactionConfig transactionConfig, @NotNull Continuation<? super Result<? extends InitialInfoModel>> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation);
}
