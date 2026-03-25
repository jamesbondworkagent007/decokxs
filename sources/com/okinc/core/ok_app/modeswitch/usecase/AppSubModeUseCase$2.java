package com.okinc.core.ok_app.modeswitch.usecase;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C33453mwj;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class AppSubModeUseCase$2 extends FunctionReferenceImpl implements Function1<Continuation<? super Unit>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AppSubModeUseCase$2(Object obj) {
        super(1, obj, C33453mwj.class, "onComplianceChange", "onComplianceChange(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((C33453mwj) this.receiver).KWHzl(continuation);
    }
}
