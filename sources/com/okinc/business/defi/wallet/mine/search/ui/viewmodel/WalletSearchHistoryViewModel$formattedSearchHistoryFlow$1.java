package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C18989fsn;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchHistoryViewModel$formattedSearchHistoryFlow$1 extends SuspendLambda implements yHO<List<? extends C18989fsn>, HistoryFilterType, Continuation<? super List<? extends C18989fsn>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ WalletSearchHistoryViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSearchHistoryViewModel$formattedSearchHistoryFlow$1(WalletSearchHistoryViewModel walletSearchHistoryViewModel, Continuation<? super WalletSearchHistoryViewModel$formattedSearchHistoryFlow$1> continuation) {
        super(3, continuation);
        this.this$0 = walletSearchHistoryViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(List<? extends C18989fsn> list, HistoryFilterType historyFilterType, Continuation<? super List<? extends C18989fsn>> continuation) {
        return invoke2((List<C18989fsn>) list, historyFilterType, (Continuation<? super List<C18989fsn>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<C18989fsn> list, HistoryFilterType historyFilterType, Continuation<? super List<C18989fsn>> continuation) {
        WalletSearchHistoryViewModel$formattedSearchHistoryFlow$1 walletSearchHistoryViewModel$formattedSearchHistoryFlow$1 = new WalletSearchHistoryViewModel$formattedSearchHistoryFlow$1(this.this$0, continuation);
        walletSearchHistoryViewModel$formattedSearchHistoryFlow$1.L$0 = list;
        walletSearchHistoryViewModel$formattedSearchHistoryFlow$1.L$1 = historyFilterType;
        return walletSearchHistoryViewModel$formattedSearchHistoryFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            HistoryFilterType historyFilterType = (HistoryFilterType) this.L$1;
            if (list != null) {
                return this.this$0.AEQbTJ(list, historyFilterType);
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
