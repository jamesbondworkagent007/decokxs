package com.okinc.unify_trade.core.event;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC56105xwY;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class EventFlow$observe$1<T> extends FunctionReferenceImpl implements Function2<T, Continuation<? super Unit>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EventFlow$observe$1(Object obj) {
        super(2, obj, Intrinsics.StateListAnimator.class, "suspendConversion0", "observe$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(T t, Continuation<? super Unit> continuation) {
        return AbstractC56105xwY.EZpvd((Function1) this.receiver, t, continuation);
    }
}
