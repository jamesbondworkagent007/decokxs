package com.okinc.business.trade.features.home.domain.usecase.getchainlist;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.AFB;
import o.AGK;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class GetChainListUseCase$fetchSwapChains$5 extends FunctionReferenceImpl implements Function0<List<? extends AGK>> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetChainListUseCase$fetchSwapChains$5(Object obj) {
        super(0, obj, AFB.class, "getSuccessResult", "getSuccessResult()Ljava/util/List;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX DEBUG: Return type fixed from 'java.util.List<o.AGK>' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends AGK> invoke() {
        return ((AFB) this.receiver).KWHzl();
    }
}
