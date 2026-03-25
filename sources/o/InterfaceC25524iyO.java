package o;

import com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iyO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25524iyO {
    java.lang.Object EZpvd(long j, @NotNull InvestmentKind investmentKind, @NotNull Continuation<? super java.lang.Long> continuation);

    java.lang.Object KWHzl(long j, long j2, @NotNull Continuation<? super Result<InvestUserClaimInfoResponse>> continuation);

    java.lang.Object KWHzl(long j, @NotNull InvestmentKind investmentKind, @NotNull Continuation<? super java.lang.Long> continuation);

    java.lang.Object KWHzl(@NotNull ProductDetailsByChain productDetailsByChain, boolean z, @NotNull Continuation<? super Result<? extends InterfaceC26557jea>> continuation);

    java.lang.Object OLrzqt(long j, @NotNull Continuation<? super Result<InvestStOktDrawDetailResponse>> continuation);

    /* JADX INFO: renamed from: checkEligibility-0E7RQCE$default, reason: not valid java name */
    static /* synthetic */ java.lang.Object m8629checkEligibility0E7RQCE$default(InterfaceC25524iyO interfaceC25524iyO, ProductDetailsByChain productDetailsByChain, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkEligibility-0E7RQCE");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return interfaceC25524iyO.KWHzl(productDetailsByChain, z, (Continuation<? super Result<? extends InterfaceC26557jea>>) continuation);
    }
}
