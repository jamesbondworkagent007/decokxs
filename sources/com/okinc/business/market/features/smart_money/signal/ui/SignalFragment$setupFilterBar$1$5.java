package com.okinc.business.market.features.smart_money.signal.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C29542kvc;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class SignalFragment$setupFilterBar$1$5 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalFragment$setupFilterBar$1$5(Object obj) {
        super(0, obj, C29542kvc.class, "filterButtonClick", "filterButtonClick()V", 0);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((C29542kvc) this.receiver).isConnected();
    }
}
