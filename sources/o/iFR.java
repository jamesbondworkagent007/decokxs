package o;

import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemReceiveReq;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iFR {
    java.lang.Object KWHzl(@NotNull InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq, @NotNull Continuation<? super Result<RedeemDetailsAndGasFee>> continuation);
}
