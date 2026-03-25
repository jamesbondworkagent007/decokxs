package com.okinc.im.imui.search.viewmodel;

import com.okinc.im.imui.search.viewmodel.GlobalSearchViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.sQU;

/* JADX INFO: loaded from: classes8.dex */
public final class GlobalSearchViewModel$chatsAndContactsLoadMore$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GlobalSearchViewModel.Activity $searchParams;
    Object L$0;
    int label;
    final /* synthetic */ GlobalSearchViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSearchViewModel$chatsAndContactsLoadMore$1$1(GlobalSearchViewModel globalSearchViewModel, GlobalSearchViewModel.Activity activity, Continuation<? super GlobalSearchViewModel$chatsAndContactsLoadMore$1$1> continuation) {
        super(2, continuation);
        this.this$0 = globalSearchViewModel;
        this.$searchParams = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GlobalSearchViewModel$chatsAndContactsLoadMore$1$1(this.this$0, this.$searchParams, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GlobalSearchViewModel$chatsAndContactsLoadMore$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableSharedFlow mutableSharedFlow;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.fetchVPNInfo.set("SAVED_STATE_KEY_CHATS_AND_CONTACTS_LOAD_MORE", C56443yFo.KWHzl(true));
            mutableSharedFlow = this.this$0.AEQbTJ;
            GlobalSearchViewModel globalSearchViewModel = this.this$0;
            GlobalSearchViewModel.Activity activity = this.$searchParams;
            this.L$0 = mutableSharedFlow;
            this.label = 1;
            obj = globalSearchViewModel.EZpvd(activity, (Continuation<? super List<sQU>>) this);
            if (obj == objCopydefault) {
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
            mutableSharedFlow = (MutableSharedFlow) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (mutableSharedFlow.emit(obj, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
