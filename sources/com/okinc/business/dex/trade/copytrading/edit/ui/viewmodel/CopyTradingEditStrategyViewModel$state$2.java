package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingDefaultConfig;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;
import o.C19877gSq;
import o.gTC;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class CopyTradingEditStrategyViewModel$state$2 extends AdaptedFunctionReference implements yHO<Result<? extends CopyTradingDefaultConfig>, Result<? extends List<? extends DefiChainInfo>>, Continuation<? super Result<? extends gTC>>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CopyTradingEditStrategyViewModel$state$2(Object obj) {
        super(3, obj, C19877gSq.class, "getState", "getState-ICJM3TQ(Lkotlin/Result;Lkotlin/Result;)Lkotlin/Result;", 4);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    /* JADX INFO: renamed from: invoke-dB25qPc, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Object invoke(Result<CopyTradingDefaultConfig> result, Result<? extends List<DefiChainInfo>> result2, Continuation<? super Result<gTC>> continuation) {
        return CopyTradingEditStrategyViewModel.copydefault((C19877gSq) this.receiver, result, result2, continuation);
    }
}
