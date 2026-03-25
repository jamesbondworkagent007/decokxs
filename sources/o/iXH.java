package o;

import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iXH {
    java.lang.Object EZpvd(@NotNull TransactionStage transactionStage, @NotNull java.util.List<TransactionStep> list, @NotNull C24177iXt c24177iXt, @NotNull Continuation<? super Result<? extends InterfaceC24173iXp>> continuation);

    /* JADX INFO: renamed from: invoke-BWLJW6A$default, reason: not valid java name */
    static /* synthetic */ java.lang.Object m8615invokeBWLJW6A$default(iXH ixh, TransactionStage transactionStage, java.util.List list, C24177iXt c24177iXt, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke-BWLJW6A");
        }
        if ((i & 4) != 0) {
            c24177iXt = iCP.KWHzl();
        }
        return ixh.EZpvd(transactionStage, list, c24177iXt, continuation);
    }
}
