package com.okinc.business.trade.features.home.advanced.usecase;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.AEX;
import o.AGE;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class AdvancedMainConfigUseCase$fetchCoreLimitChainList$2$result$4 extends FunctionReferenceImpl implements Function0<List<? extends AGE>> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedMainConfigUseCase$fetchCoreLimitChainList$2$result$4(Object obj) {
        super(0, obj, AEX.class, "getSuccessResult", "getSuccessResult()Ljava/util/List;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX DEBUG: Return type fixed from 'java.util.List<o.AGE>' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends AGE> invoke() {
        return ((AEX) this.receiver).AEQbTJ();
    }
}
