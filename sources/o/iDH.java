package o;

import com.okinc.business.invest_biz.data.bean.InvestCallDataReq;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestTxData;
import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.data.bean.request.InvestTokenBalanceReq;
import com.okinc.business.invest_biz.data.bean.request.ValidatorRequestParam;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.JsonObject;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iDH {
    java.lang.Object AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, RequestBody requestBody, @NotNull Continuation<? super Result<InvestTxData>> continuation);

    java.lang.Object EZpvd(@NotNull InvestTokenBalanceReq investTokenBalanceReq, @NotNull Continuation<? super Result<? extends java.util.List<InvestTokenWithAmount>>> continuation);

    java.lang.Object EZpvd(@NotNull ValidatorRequestParam validatorRequestParam, @NotNull Continuation<? super Result<? extends java.util.List<InvestValidatorListItems>>> continuation);

    java.lang.Object KWHzl(@NotNull InvestCallDataReq investCallDataReq, @NotNull Continuation<? super Result<JsonObject>> continuation);

    java.lang.Object KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.String> map, RequestBody requestBody, @NotNull Continuation<? super Result<InvestTxData>> continuation);

    java.lang.Object OLrzqt(@NotNull InvestCallDataReq investCallDataReq, @NotNull Continuation<? super Result<JsonObject>> continuation);

    java.lang.Object copydefault(long j, int i, @NotNull java.lang.String str, java.lang.Long l, @NotNull Continuation<? super Result<InvestGasPriceConfig>> continuation);

    java.lang.Object copydefault(@NotNull InvestCallDataReq investCallDataReq, @NotNull Continuation<? super Result<JsonObject>> continuation);
}
