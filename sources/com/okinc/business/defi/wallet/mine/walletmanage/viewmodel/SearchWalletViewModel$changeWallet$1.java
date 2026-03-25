package com.okinc.business.defi.wallet.mine.walletmanage.viewmodel;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.Point;
import o.fDV;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchWalletViewModel$changeWallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $walletId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SearchWalletViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchWalletViewModel$changeWallet$1(SearchWalletViewModel searchWalletViewModel, String str, Continuation<? super SearchWalletViewModel$changeWallet$1> continuation) {
        super(2, continuation);
        this.this$0 = searchWalletViewModel;
        this.$walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchWalletViewModel$changeWallet$1(this.this$0, this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchWalletViewModel$changeWallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object value;
        SearchWalletViewModel searchWalletViewModel;
        String str;
        Object value2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                searchWalletViewModel = this.this$0;
                String str2 = this.$walletId;
                Result.Application application = Result.Companion;
                fDV fdv = searchWalletViewModel.KWHzl;
                this.L$0 = searchWalletViewModel;
                this.L$1 = str2;
                this.label = 1;
                if (fdv.OLrzqt(str2, this) == objCopydefault) {
                    return objCopydefault;
                }
                str = str2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$1;
                searchWalletViewModel = (SearchWalletViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            MutableStateFlow mutableStateFlow = searchWalletViewModel.OLrzqt;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, new Point.Application(str)));
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        SearchWalletViewModel searchWalletViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow mutableStateFlow2 = searchWalletViewModel2.OLrzqt;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, new Point.TaskDescription(thM7380exceptionOrNullimpl.getMessage())));
        }
        return Unit.INSTANCE;
    }
}
