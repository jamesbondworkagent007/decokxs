package com.okinc.business.invest_biz.data.repository;

import com.okinc.business.invest_api.bean.EarnRecommendApyBean;
import com.okinc.business.invest_api.bean.TokenInfo;
import com.okinc.business.invest_biz.data.bean.request.DexRecommendApyListRequest;
import com.okinc.business.invest_biz.data.bean.request.DexRecommendRequestWrapper;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23634iDq;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.InterfaceC25472ixP;
import o.iBL;

/* JADX INFO: loaded from: classes6.dex */
public final class DexEntranceUseRepositoryImpl$getDexRecommendApyList$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends EarnRecommendApyBean>>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ String $tokenAddress;
    final /* synthetic */ String $tokenTicker;
    int label;
    final /* synthetic */ C23634iDq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexEntranceUseRepositoryImpl$getDexRecommendApyList$2(C23634iDq c23634iDq, long j, String str, String str2, Continuation<? super DexEntranceUseRepositoryImpl$getDexRecommendApyList$2> continuation) {
        super(1, continuation);
        this.this$0 = c23634iDq;
        this.$chainId = j;
        this.$tokenAddress = str;
        this.$tokenTicker = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DexEntranceUseRepositoryImpl$getDexRecommendApyList$2(this.this$0, this.$chainId, this.$tokenAddress, this.$tokenTicker, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends EarnRecommendApyBean>> continuation) {
        return invoke2((Continuation<? super List<EarnRecommendApyBean>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<EarnRecommendApyBean>> continuation) {
        return ((DexEntranceUseRepositoryImpl$getDexRecommendApyList$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.this$0.OLrzqt.OLrzqt();
            DexRecommendRequestWrapper dexRecommendRequestWrapper = new DexRecommendRequestWrapper(C56402yEa.EZpvd(new DexRecommendApyListRequest(C56402yEa.EZpvd(new TokenInfo(this.$chainId, this.$tokenAddress)), this.$tokenTicker)));
            this.label = 1;
            obj = interfaceC25472ixPOLrzqt.KWHzl(dexRecommendRequestWrapper, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
        Intrinsics.copydefault(objUnwrapResponseData$default);
        return objUnwrapResponseData$default;
    }
}
