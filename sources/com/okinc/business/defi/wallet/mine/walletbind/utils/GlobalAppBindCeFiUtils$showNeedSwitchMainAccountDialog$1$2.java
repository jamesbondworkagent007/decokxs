package com.okinc.business.defi.wallet.mine.walletbind.utils;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C43251rlk;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC8107awW;

/* JADX INFO: loaded from: classes15.dex */
public final class GlobalAppBindCeFiUtils$showNeedSwitchMainAccountDialog$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $context;
    final /* synthetic */ Function0<Unit> $retryListener;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalAppBindCeFiUtils$showNeedSwitchMainAccountDialog$1$2(AbstractActivityC33041mov abstractActivityC33041mov, Function0<Unit> function0, Continuation<? super GlobalAppBindCeFiUtils$showNeedSwitchMainAccountDialog$1$2> continuation) {
        super(2, continuation);
        this.$context = abstractActivityC33041mov;
        this.$retryListener = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GlobalAppBindCeFiUtils$showNeedSwitchMainAccountDialog$1$2(this.$context, this.$retryListener, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GlobalAppBindCeFiUtils$showNeedSwitchMainAccountDialog$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        String message;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.$context.showLoadingAtOnce();
            InterfaceC8107awW interfaceC8107awW = (InterfaceC8107awW) C43251rlk.OLrzqt(InterfaceC8107awW.class);
            if (interfaceC8107awW != null) {
                this.label = 1;
                objEZpvd = interfaceC8107awW.EZpvd(this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            }
            this.$context.dismissLoading();
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        objEZpvd = ((Result) obj).m7386unboximpl();
        Function0<Unit> function0 = this.$retryListener;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            if (function0 != null) {
                function0.invoke();
            }
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null && (message = thM7380exceptionOrNullimpl.getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
        }
        Result.m7376boximpl(objEZpvd);
        this.$context.dismissLoading();
        return Unit.INSTANCE;
    }
}
