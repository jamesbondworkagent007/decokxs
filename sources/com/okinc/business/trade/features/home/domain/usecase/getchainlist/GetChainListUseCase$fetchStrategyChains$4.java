package com.okinc.business.trade.features.home.domain.usecase.getchainlist;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.AEX;
import uniffi.ok_future_utils.OkffiException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class GetChainListUseCase$fetchStrategyChains$4 extends FunctionReferenceImpl implements Function0<OkffiException> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetChainListUseCase$fetchStrategyChains$4(Object obj) {
        super(0, obj, AEX.class, "getError", "getError()Luniffi/ok_future_utils/OkffiException;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final OkffiException invoke() {
        return ((AEX) this.receiver).OLrzqt();
    }
}
