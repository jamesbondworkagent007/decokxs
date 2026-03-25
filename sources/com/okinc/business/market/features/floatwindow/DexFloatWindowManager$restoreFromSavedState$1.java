package com.okinc.business.market.features.floatwindow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jWQ;

/* JADX INFO: loaded from: classes7.dex */
public final class DexFloatWindowManager$restoreFromSavedState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexFloatWindowManager$restoreFromSavedState$1(Continuation<? super DexFloatWindowManager$restoreFromSavedState$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexFloatWindowManager$restoreFromSavedState$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexFloatWindowManager$restoreFromSavedState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        jWQ.StateListAnimator stateListAnimator;
        DexFloatWindowManager dexFloatWindowManager;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jWQ jwq = DexFloatWindowManager.getNewProxyInstance;
            if (jwq == null) {
                stateListAnimator = null;
                if (stateListAnimator != null && stateListAnimator.EZpvd()) {
                    dexFloatWindowManager = DexFloatWindowManager.copydefault;
                    if (!dexFloatWindowManager.getNewProxyInstance()) {
                        DexFloatWindowManager.gEmmrt = stateListAnimator.OLrzqt();
                        DexFloatWindowManager.AkhnZx = stateListAnimator.copydefault();
                        dexFloatWindowManager.KWHzl(stateListAnimator.KWHzl());
                    }
                }
                return Unit.INSTANCE;
            }
            this.label = 1;
            obj = jwq.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        stateListAnimator = (jWQ.StateListAnimator) obj;
        if (stateListAnimator != null) {
            dexFloatWindowManager = DexFloatWindowManager.copydefault;
            if (!dexFloatWindowManager.getNewProxyInstance()) {
            }
        }
        return Unit.INSTANCE;
    }
}
