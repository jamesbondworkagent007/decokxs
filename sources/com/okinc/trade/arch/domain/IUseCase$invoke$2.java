package com.okinc.trade.arch.domain;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.InterfaceC49403unr;

/* JADX INFO: Add missing generic type declarations: [Input, Output] */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class IUseCase$invoke$2<Input, Output> extends FunctionReferenceImpl implements Function2<Input, Continuation<? super Output>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IUseCase$invoke$2(Object obj) {
        super(2, obj, InterfaceC49403unr.class, "onExecute", "onExecute(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Input input, Continuation<? super Output> continuation) {
        return ((InterfaceC49403unr) this.receiver).KWHzl(input, continuation);
    }
}
