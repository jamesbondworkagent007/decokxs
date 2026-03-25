package com.okinc.core.ok_app.modeswitch.usecase;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C33458mwo;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class LiteSubModeUseCase$1 extends FunctionReferenceImpl implements Function1<Continuation<? super Unit>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiteSubModeUseCase$1(Object obj) {
        super(1, obj, C33458mwo.class, "resetTradeModePolicy", "resetTradeModePolicy(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((C33458mwo) this.receiver).KWHzl(continuation);
    }
}
