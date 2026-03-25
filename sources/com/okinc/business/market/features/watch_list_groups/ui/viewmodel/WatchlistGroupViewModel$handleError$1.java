package com.okinc.business.market.features.watch_list_groups.ui.viewmodel;

import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27779kDa;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistGroupViewModel$handleError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Throwable $error;
    int label;
    final /* synthetic */ WatchlistGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistGroupViewModel$handleError$1(Throwable th, WatchlistGroupViewModel watchlistGroupViewModel, Continuation<? super WatchlistGroupViewModel$handleError$1> continuation) {
        super(2, continuation);
        this.$error = th;
        this.this$0 = watchlistGroupViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchlistGroupViewModel$handleError$1(this.$error, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchlistGroupViewModel$handleError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String message;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Throwable th = this.$error;
            OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
            if ((oKServerException == null || (message = oKServerException.getMessage()) == null) && (message = this.$error.getMessage()) == null) {
                message = "";
            }
            MutableSharedFlow mutableSharedFlow = this.this$0.KWHzl;
            InterfaceC27779kDa.Application application = new InterfaceC27779kDa.Application(message);
            this.label = 1;
            if (mutableSharedFlow.emit(application, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
