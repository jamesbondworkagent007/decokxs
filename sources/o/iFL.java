package o;

import com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iFL {
    java.lang.Object KWHzl(@NotNull InvestRedeemReceiveReq investRedeemReceiveReq, @NotNull Continuation<? super Result<RedeemDetailsAndGasFee>> continuation);
}
