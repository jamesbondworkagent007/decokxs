package com.okinc.business.market.features.floatwindow;

import com.okinc.business.market.features.floatwindow.DexFloatWindowManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C26235jWy;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class DexFloatWindowTrigger$toggleFloatWindow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexFloatWindowTrigger$toggleFloatWindow$1(Continuation<? super DexFloatWindowTrigger$toggleFloatWindow$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexFloatWindowTrigger$toggleFloatWindow$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexFloatWindowTrigger$toggleFloatWindow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            DexFloatWindowManager dexFloatWindowManager = DexFloatWindowManager.copydefault;
            DexFloatWindowManager.DexFloatWindowMode dexFloatWindowModeIsConnected = dexFloatWindowManager.isConnected();
            C26235jWy c26235jWyFIwbmz = dexFloatWindowManager.fIwbmz();
            if (c26235jWyFIwbmz != null) {
                this.label = 1;
                obj = C26235jWy.saveWindowState$default(c26235jWyFIwbmz, true, dexFloatWindowModeIsConnected, 0, 0, this, 12, null);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return Unit.INSTANCE;
    }
}
