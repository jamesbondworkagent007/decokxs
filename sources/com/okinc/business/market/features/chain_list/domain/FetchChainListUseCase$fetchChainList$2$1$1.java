package com.okinc.business.market.features.chain_list.domain;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.ADO;
import o.InterfaceC4440Bed;
import uniffi.ok_future_utils.OkffiException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class FetchChainListUseCase$fetchChainList$2$1$1 extends FunctionReferenceImpl implements Function1<InterfaceC4440Bed, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FetchChainListUseCase$fetchChainList$2$1$1(Object obj) {
        super(1, obj, ADO.class, "startWithCallback", "startWithCallback(Luniffi/ok_future_utils/OkRustFutureCallback;)V", 0);
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
        ((ADO) this.receiver).AEQbTJ(interfaceC4440Bed);
    }
}
