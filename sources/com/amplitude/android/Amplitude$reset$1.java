package com.amplitude.android;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C5214Jc;
import o.C5216Je;
import o.C5244Kg;
import o.C56391yDq;
import o.C56442yFn;
import o.JE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Amplitude$reset$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C5214Jc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Amplitude$reset$1(C5214Jc c5214Jc, Continuation<? super Amplitude$reset$1> continuation) {
        super(2, continuation);
        this.this$0 = c5214Jc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new Amplitude$reset$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Amplitude$reset$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Deferred<Boolean> newProxyInstance = this.this$0.getNewProxyInstance();
            this.label = 1;
            if (newProxyInstance.await(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        JE je = null;
        this.this$0.AkhnZx().KWHzl().EZpvd().AEQbTJ(null).AEQbTJ();
        JE je2 = this.this$0.AEQbTJ;
        if (je2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            je = je2;
        }
        C5244Kg c5244KgDjBIcL = this.this$0.djBIcL();
        Intrinsics.copydefault(c5244KgDjBIcL, "");
        je.EZpvd((C5216Je) c5244KgDjBIcL);
        return Unit.INSTANCE;
    }
}
