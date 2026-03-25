package com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.single;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.AFR;
import o.C4150AzS;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class RustSingleTokenListUseCaseImpl$invoke$result$4 extends FunctionReferenceImpl implements Function0<List<? extends C4150AzS>> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RustSingleTokenListUseCaseImpl$invoke$result$4(Object obj) {
        super(0, obj, AFR.class, "getSuccessResult", "getSuccessResult()Ljava/util/List;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX DEBUG: Return type fixed from 'java.util.List<o.AzS>' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C4150AzS> invoke() {
        return ((AFR) this.receiver).copydefault();
    }
}
