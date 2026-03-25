package com.okinc.business.defi.wallet.mine.walletmanage.viewmodel;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.Point;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchWalletViewModel$startSearchTextJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $delayMillis;
    final /* synthetic */ String $searchText;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchWalletViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchWalletViewModel$startSearchTextJob$1(long j, SearchWalletViewModel searchWalletViewModel, String str, Continuation<? super SearchWalletViewModel$startSearchTextJob$1> continuation) {
        super(2, continuation);
        this.$delayMillis = j;
        this.this$0 = searchWalletViewModel;
        this.$searchText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchWalletViewModel$startSearchTextJob$1 searchWalletViewModel$startSearchTextJob$1 = new SearchWalletViewModel$startSearchTextJob$1(this.$delayMillis, this.this$0, this.$searchText, continuation);
        searchWalletViewModel$startSearchTextJob$1.L$0 = obj;
        return searchWalletViewModel$startSearchTextJob$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchWalletViewModel$startSearchTextJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objM7377constructorimpl;
        Object value;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            long j = this.$delayMillis;
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (DelayKt.delay(j, this) == objCopydefault) {
                return objCopydefault;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        SearchWalletViewModel searchWalletViewModel = this.this$0;
        String str = this.$searchText;
        try {
            Result.Application application = Result.Companion;
            searchWalletViewModel.AEQbTJ(coroutineScope);
            objM7377constructorimpl = Result.m7377constructorimpl(searchWalletViewModel.copydefault(coroutineScope, str));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        SearchWalletViewModel searchWalletViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow mutableStateFlow = searchWalletViewModel2.copydefault;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, new Point.TaskDescription(thM7380exceptionOrNullimpl.getMessage())));
        }
        return Unit.INSTANCE;
    }
}
