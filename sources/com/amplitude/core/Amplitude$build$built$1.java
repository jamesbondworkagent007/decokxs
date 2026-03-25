package com.amplitude.core;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC5243Kf;
import o.JZ;
import o.ME;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Amplitude$build$built$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ JZ $amplitude;
    int label;
    final /* synthetic */ JZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Amplitude$build$built$1(JZ jz, JZ jz2, Continuation<? super Amplitude$build$built$1> continuation) {
        super(2, continuation);
        this.this$0 = jz;
        this.$amplitude = jz2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new Amplitude$build$built$1(this.this$0, this.$amplitude, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((Amplitude$build$built$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            JZ jz = this.this$0;
            jz.fetchVPNInfo = InterfaceC5243Kf.getStorage$default(jz.djBIcL().wlaJM(), this.$amplitude, null, 2, null);
            JZ jz2 = this.this$0;
            jz2.gEmmrt = jz2.djBIcL().DbNXlk().KWHzl(this.$amplitude, "amplitude-identify-intercept");
            ME meOLrzqt = this.this$0.OLrzqt();
            JZ jz3 = this.this$0;
            jz3.valueOf = jz3.djBIcL().isConnected().copydefault(meOLrzqt);
            JZ jz4 = this.$amplitude;
            this.label = 1;
            if (jz4.KWHzl(meOLrzqt, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return C56443yFo.KWHzl(true);
    }
}
