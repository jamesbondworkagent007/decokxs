package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.C18910frN;
import o.C18989fsn;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchHistoryViewModel$deleteSearchHistoryItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C18989fsn $item;
    Object L$0;
    int label;
    final /* synthetic */ WalletSearchHistoryViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSearchHistoryViewModel$deleteSearchHistoryItem$1(WalletSearchHistoryViewModel walletSearchHistoryViewModel, C18989fsn c18989fsn, Continuation<? super WalletSearchHistoryViewModel$deleteSearchHistoryItem$1> continuation) {
        super(2, continuation);
        this.this$0 = walletSearchHistoryViewModel;
        this.$item = c18989fsn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSearchHistoryViewModel$deleteSearchHistoryItem$1(this.this$0, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSearchHistoryViewModel$deleteSearchHistoryItem$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        WalletSearchHistoryViewModel walletSearchHistoryViewModel;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                WalletSearchHistoryViewModel walletSearchHistoryViewModel2 = this.this$0;
                C18989fsn c18989fsn = this.$item;
                Result.Application application = Result.Companion;
                Job job = walletSearchHistoryViewModel2.fetchVPNInfo;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                walletSearchHistoryViewModel2.copydefault.setValue(C56443yFo.KWHzl(true));
                walletSearchHistoryViewModel2.fIwbmz = 0;
                walletSearchHistoryViewModel2.DbNXlk = false;
                C18910frN c18910frN = walletSearchHistoryViewModel2.AhwBna;
                this.L$0 = walletSearchHistoryViewModel2;
                this.label = 1;
                Object objAEQbTJ = c18910frN.AEQbTJ(c18989fsn, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                walletSearchHistoryViewModel = walletSearchHistoryViewModel2;
                objM7386unboximpl = objAEQbTJ;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                walletSearchHistoryViewModel = (WalletSearchHistoryViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objM7386unboximpl);
            walletSearchHistoryViewModel.copydefault(true);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        WalletSearchHistoryViewModel walletSearchHistoryViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletSearchHistoryViewModel", "Failed to delete search history item: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
            walletSearchHistoryViewModel3.copydefault.setValue(C56443yFo.KWHzl(false));
        }
        return Unit.INSTANCE;
    }
}
