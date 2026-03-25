package com.okinc.business.trade.features.home.meme.usecase.chainlist;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.AFB;
import uniffi.ok_future_utils.OkffiException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class MemeChainListUseCase$fetchCoreMemeChainList$2$result$3 extends FunctionReferenceImpl implements Function0<OkffiException> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeChainListUseCase$fetchCoreMemeChainList$2$result$3(Object obj) {
        super(0, obj, AFB.class, "getError", "getError()Luniffi/ok_future_utils/OkffiException;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final OkffiException invoke() {
        return ((AFB) this.receiver).OLrzqt();
    }
}
