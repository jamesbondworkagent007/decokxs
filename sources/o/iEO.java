package o;

import com.okinc.business.invest_biz.data.bean.InvestProductDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestmentBonusInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iEO {
    java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super C23673iFb> continuation);

    java.lang.Object EZpvd(long j, @NotNull java.util.List<InvestUserAssetDetailByInvestment> list, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object EZpvd(long j, @NotNull Continuation<? super InvestmentBonusInfo> continuation);

    java.lang.Object EZpvd(long j, @NotNull C23673iFb c23673iFb, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(long j, @NotNull InvestmentBonusInfo investmentBonusInfo, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(long j, @NotNull Continuation<? super java.util.List<InvestUserAssetDetailByInvestment>> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(long j, @NotNull Continuation<? super InvestProductDetailResponse> continuation);

    java.lang.Object copydefault(long j, @NotNull InvestProductDetailResponse investProductDetailResponse, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(long j, @NotNull Continuation<? super Unit> continuation);
}
