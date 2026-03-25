package com.okinc.components.track.provider;

import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.components.track.provider.ByteDanceABTestProvider$refreshCefiFlagsWithLoginChange$1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.AbstractC58253yxm;
import o.C32902mmO;
import o.C56391yDq;
import o.C56442yFn;
import o.C58266yxz;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class ByteDanceABTestProvider$refreshCefiFlagsWithLoginChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C32902mmO.StateListAnimator $dataObserverCallback;
    final /* synthetic */ AtomicBoolean $isCallbackInvoked;
    final /* synthetic */ Function1<Boolean, Unit> $refreshResultCallback;
    final /* synthetic */ long $timeoutMs;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ByteDanceABTestProvider$refreshCefiFlagsWithLoginChange$1(long j, AtomicBoolean atomicBoolean, C32902mmO.StateListAnimator stateListAnimator, Function1<? super Boolean, Unit> function1, Continuation<? super ByteDanceABTestProvider$refreshCefiFlagsWithLoginChange$1> continuation) {
        super(2, continuation);
        this.$timeoutMs = j;
        this.$isCallbackInvoked = atomicBoolean;
        this.$dataObserverCallback = stateListAnimator;
        this.$refreshResultCallback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ByteDanceABTestProvider$refreshCefiFlagsWithLoginChange$1(this.$timeoutMs, this.$isCallbackInvoked, this.$dataObserverCallback, this.$refreshResultCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ByteDanceABTestProvider$refreshCefiFlagsWithLoginChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            long j = this.$timeoutMs;
            this.label = 1;
            if (DelayKt.delay(j, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (this.$isCallbackInvoked.compareAndSet(false, true)) {
            C32902mmO.KWHzl.EZpvd(this.$dataObserverCallback, AmplitudeName.CEFI);
            pUU.valueOf("ByteDanceABTestProvider", "refreshCefiFlagsWithLoginChange timeout");
            AbstractC58253yxm abstractC58253yxmOLrzqt = C58266yxz.OLrzqt();
            final Function1<Boolean, Unit> function1 = this.$refreshResultCallback;
            abstractC58253yxmOLrzqt.scheduleDirect(new Runnable() { // from class: o.mmS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ByteDanceABTestProvider$refreshCefiFlagsWithLoginChange$1.invokeSuspend$lambda$0(function1);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(Function1 function1) {
        function1.invoke(Boolean.FALSE);
    }
}
