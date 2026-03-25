package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C18903frG;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchHistoryViewModel$addSearchHistory$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SearchHistoryItem $item;
    int label;
    final /* synthetic */ WalletSearchHistoryViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSearchHistoryViewModel$addSearchHistory$1(WalletSearchHistoryViewModel walletSearchHistoryViewModel, SearchHistoryItem searchHistoryItem, Continuation<? super WalletSearchHistoryViewModel$addSearchHistory$1> continuation) {
        super(2, continuation);
        this.this$0 = walletSearchHistoryViewModel;
        this.$item = searchHistoryItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSearchHistoryViewModel$addSearchHistory$1(this.this$0, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSearchHistoryViewModel$addSearchHistory$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                WalletSearchHistoryViewModel walletSearchHistoryViewModel = this.this$0;
                SearchHistoryItem searchHistoryItem = this.$item;
                Result.Application application = Result.Companion;
                C18903frG c18903frG = walletSearchHistoryViewModel.djBIcL;
                this.label = 1;
                objCopydefault = c18903frG.copydefault(searchHistoryItem, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objCopydefault);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletSearchHistoryViewModel", "Failed to add search history: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
