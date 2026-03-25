package com.okinc.business.market.features.watch_list_groups.ui.viewmodel;

import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C27765kCn;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27779kDa;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistGroupViewModel$deleteGroup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CommonGroupUiModel $group;
    Object L$0;
    int label;
    final /* synthetic */ WatchlistGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistGroupViewModel$deleteGroup$1(WatchlistGroupViewModel watchlistGroupViewModel, CommonGroupUiModel commonGroupUiModel, Continuation<? super WatchlistGroupViewModel$deleteGroup$1> continuation) {
        super(2, continuation);
        this.this$0 = watchlistGroupViewModel;
        this.$group = commonGroupUiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchlistGroupViewModel$deleteGroup$1(this.this$0, this.$group, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchlistGroupViewModel$deleteGroup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C27765kCn c27765kCn = this.this$0.valueOf;
            int iKWHzl = this.$group.KWHzl();
            this.label = 1;
            objEZpvd = c27765kCn.EZpvd(iKWHzl, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = obj2;
                WatchlistGroupViewModel watchlistGroupViewModel = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
                if (thM7380exceptionOrNullimpl != null) {
                    watchlistGroupViewModel.KWHzl(thM7380exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        WatchlistGroupViewModel watchlistGroupViewModel2 = this.this$0;
        CommonGroupUiModel commonGroupUiModel = this.$group;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            ((Number) objEZpvd).intValue();
            MutableSharedFlow mutableSharedFlow = watchlistGroupViewModel2.KWHzl;
            InterfaceC27779kDa.ActionBar actionBar = new InterfaceC27779kDa.ActionBar(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + commonGroupUiModel.EZpvd() + "\" deleted");
            this.L$0 = objEZpvd;
            this.label = 2;
            if (mutableSharedFlow.emit(actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
            obj2 = objEZpvd;
            objEZpvd = obj2;
        }
        WatchlistGroupViewModel watchlistGroupViewModel3 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
