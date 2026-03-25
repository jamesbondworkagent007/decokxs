package com.okinc.business.market.features.home_favorite_list.ui.edit;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC28538kcf;
import o.C28410kaJ;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistEditViewModel$getWatchlist$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $groupId;
    final /* synthetic */ String $realChainId;
    int label;
    final /* synthetic */ WatchlistEditViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistEditViewModel$getWatchlist$1(WatchlistEditViewModel watchlistEditViewModel, int i, String str, Continuation<? super WatchlistEditViewModel$getWatchlist$1> continuation) {
        super(2, continuation);
        this.this$0 = watchlistEditViewModel;
        this.$groupId = i;
        this.$realChainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchlistEditViewModel$getWatchlist$1(this.this$0, this.$groupId, this.$realChainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchlistEditViewModel$getWatchlist$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!(this.this$0.OLrzqt.getValue() instanceof AbstractC28538kcf.Activity)) {
                this.this$0.OLrzqt.setValue(AbstractC28538kcf.ActionBar.OLrzqt);
            }
            C28410kaJ c28410kaJ = this.this$0.AEQbTJ;
            int i2 = this.$groupId;
            String str = this.$realChainId;
            this.label = 1;
            objEZpvd = c28410kaJ.EZpvd(i2, str, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        WatchlistEditViewModel watchlistEditViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            List list = (List) objEZpvd;
            watchlistEditViewModel.valueOf.clear();
            watchlistEditViewModel.valueOf.addAll(list);
            watchlistEditViewModel.OLrzqt.setValue(new AbstractC28538kcf.Activity(list));
        }
        WatchlistEditViewModel watchlistEditViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            watchlistEditViewModel2.OLrzqt.setValue(AbstractC28538kcf.Application.EZpvd);
        }
        return Unit.INSTANCE;
    }
}
