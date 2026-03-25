package com.okinc.business.defi.wallet.home.viewmodel;

import com.okinc.business.defi.biz.net.bean.CheckCreateAvailableResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C14728dqt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC13426dKx;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeContainerViewModel$checkCreateAvailable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefiHomeContainerViewModel$checkCreateAvailable$1(Continuation<? super DefiHomeContainerViewModel$checkCreateAvailable$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeContainerViewModel$checkCreateAvailable$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeContainerViewModel$checkCreateAvailable$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13934dbu c13934dbuDTwDnp = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).DTwDnp();
            this.label = 1;
            obj = c13934dbuDTwDnp.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        CheckCreateAvailableResp checkCreateAvailableResp = (CheckCreateAvailableResp) ((AbstractC43419rot) obj).copydefault();
        if (checkCreateAvailableResp == null) {
            return Unit.INSTANCE;
        }
        C14728dqt.KWHzl.KWHzl(checkCreateAvailableResp.getCreateAvailable() == 1);
        return Unit.INSTANCE;
    }
}
