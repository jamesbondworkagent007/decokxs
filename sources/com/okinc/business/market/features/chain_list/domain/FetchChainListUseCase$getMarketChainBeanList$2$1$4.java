package com.okinc.business.market.features.chain_list.domain;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.ABP;
import o.ADO;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class FetchChainListUseCase$getMarketChainBeanList$2$1$4 extends FunctionReferenceImpl implements Function0<List<? extends ABP>> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FetchChainListUseCase$getMarketChainBeanList$2$1$4(Object obj) {
        super(0, obj, ADO.class, "getSuccessResult", "getSuccessResult()Ljava/util/List;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX DEBUG: Return type fixed from 'java.util.List<o.ABP>' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends ABP> invoke() {
        return ((ADO) this.receiver).copydefault();
    }
}
