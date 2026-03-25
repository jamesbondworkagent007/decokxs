package com.okinc.im.imui.search.viewmodel;

import com.okinc.im.imui.search.viewmodel.GlobalSearchViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class GlobalSearchViewModel$messagesLoadMore$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GlobalSearchViewModel.Application $searchParams;
    int label;
    final /* synthetic */ GlobalSearchViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSearchViewModel$messagesLoadMore$1$1(GlobalSearchViewModel globalSearchViewModel, GlobalSearchViewModel.Application application, Continuation<? super GlobalSearchViewModel$messagesLoadMore$1$1> continuation) {
        super(2, continuation);
        this.this$0 = globalSearchViewModel;
        this.$searchParams = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GlobalSearchViewModel$messagesLoadMore$1$1(this.this$0, this.$searchParams, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GlobalSearchViewModel$messagesLoadMore$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.fetchVPNInfo.set("SAVED_STATE_KEY_MESSAGES_LOAD_MORE", C56443yFo.KWHzl(true));
            MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
            Boolean boolKWHzl = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableStateFlow.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        GlobalSearchViewModel globalSearchViewModel = this.this$0;
        GlobalSearchViewModel.Application application = this.$searchParams;
        this.label = 2;
        if (globalSearchViewModel.AEQbTJ(application, (Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
