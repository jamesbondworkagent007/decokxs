package o;

import com.okinc.business.invest_biz.data.bean.InvestCallDataResult;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iFJ {
    java.lang.Object OLrzqt(@NotNull InvestTxModel investTxModel, @NotNull Continuation<? super Result<InvestCallDataResult>> continuation);
}
