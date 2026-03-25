package o;

import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemReceiveReq;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iDF {
    java.lang.Object AEQbTJ(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Long l, @NotNull Continuation<? super Result<ResponseData<java.lang.Object>>> continuation);

    java.lang.Object AEQbTJ(@NotNull InvestRedeemReceiveReq investRedeemReceiveReq, @NotNull Continuation<? super Result<InvestRedeemReceiveInfo>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull InvestRedeemInitialReq investRedeemInitialReq, @NotNull Continuation<? super Result<InvestRedeemInitialInfo>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull InvestUniv3RedeemInitialReq investUniv3RedeemInitialReq, @NotNull Continuation<? super Result<InvestUniv3RedeemInitialInfo>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq, @NotNull Continuation<? super Result<InvestUniv3RedeemReceiveInfo>> continuation);
}
