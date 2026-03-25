package com.okinc.business.defi.wallet.tee.status;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC13426dKx;
import o.fVE;
import o.fVJ;
import o.fWX;

/* JADX INFO: loaded from: classes5.dex */
public final class TeeExtensionKt$dealWithTeeServiceNotification$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $state;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeExtensionKt$dealWithTeeServiceNotification$1(int i, Continuation<? super TeeExtensionKt$dealWithTeeServiceNotification$1> continuation) {
        super(2, continuation);
        this.$state = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TeeExtensionKt$dealWithTeeServiceNotification$1(this.$state, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TeeExtensionKt$dealWithTeeServiceNotification$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            fVJ fieldNames = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).getFieldNames();
            this.label = 1;
            obj = fieldNames.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Number) obj).longValue() < System.currentTimeMillis()) {
            return Unit.INSTANCE;
        }
        int i2 = this.$state;
        if (i2 == 1) {
            fVE.Companion.EZpvd().EZpvd(new fWX.TaskDescription());
        } else if (i2 == 2) {
            fVE.Companion.EZpvd().EZpvd(new fWX.Activity());
        }
        return Unit.INSTANCE;
    }
}
