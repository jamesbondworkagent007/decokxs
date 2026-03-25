package com.amplitude.core.platform.plugins;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C5242Ke;
import o.C5261Kx;
import o.C56391yDq;
import o.C56442yFn;
import o.KC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AmplitudeDestination$enqueue$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C5242Ke $event;
    int label;
    final /* synthetic */ KC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmplitudeDestination$enqueue$1$1(KC kc, C5242Ke c5242Ke, Continuation<? super AmplitudeDestination$enqueue$1$1> continuation) {
        super(2, continuation);
        this.this$0 = kc;
        this.$event = c5242Ke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new AmplitudeDestination$enqueue$1$1(this.this$0, this.$event, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AmplitudeDestination$enqueue$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5261Kx c5261Kx = this.this$0.AEQbTJ;
            if (c5261Kx == null) {
                Intrinsics.gEmmrt("");
                c5261Kx = null;
            }
            C5242Ke c5242Ke = this.$event;
            this.label = 1;
            obj = c5261Kx.EZpvd(c5242Ke, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5242Ke c5242Ke2 = (C5242Ke) obj;
        if (c5242Ke2 != null) {
            this.this$0.OLrzqt(c5242Ke2);
        }
        return Unit.INSTANCE;
    }
}
