package com.okinc.business.trade.features.home.domain.usecase.getchainlist;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AFB;
import o.InterfaceC4440Bed;
import uniffi.ok_future_utils.OkffiException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class GetChainListUseCase$fetchSwapChains$2 extends FunctionReferenceImpl implements Function1<InterfaceC4440Bed, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetChainListUseCase$fetchSwapChains$2(Object obj) {
        super(1, obj, AFB.class, "startWithCallback", "startWithCallback(Luniffi/ok_future_utils/OkRustFutureCallback;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC4440Bed interfaceC4440Bed) throws OkffiException {
        invoke2(interfaceC4440Bed);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC4440Bed interfaceC4440Bed) throws OkffiException {
        Intrinsics.checkNotNullParameter(interfaceC4440Bed, "");
        ((AFB) this.receiver).AEQbTJ(interfaceC4440Bed);
    }
}
