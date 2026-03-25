package com.okinc.business.trade.features.home.domain.usecase.getchainlist;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC43419rot;
import o.kUH;
import org.jetbrains.annotations.NotNull;
import uniffi.dex.DexStrategyBizMode;

/* JADX INFO: loaded from: classes7.dex */
public final class GetChainListUseCase$fetchStrategyChains$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ kUH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChainListUseCase$fetchStrategyChains$1(kUH kuh, Continuation<? super GetChainListUseCase$fetchStrategyChains$1> continuation) {
        super(continuation);
        this.this$0 = kuh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((DexStrategyBizMode) null, (Continuation<? super AbstractC43419rot<? extends List<DefiChainInfo>, OKServerException>>) this);
    }
}
