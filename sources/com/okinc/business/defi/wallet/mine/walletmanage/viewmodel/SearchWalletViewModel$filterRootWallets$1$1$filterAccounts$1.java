package com.okinc.business.defi.wallet.mine.walletmanage.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.fDO;
import o.fDU;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchWalletViewModel$filterRootWallets$1$1$filterAccounts$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends fDO>>, Object> {
    final /* synthetic */ fDU $rootWallet;
    final /* synthetic */ String $searchText;
    int label;
    final /* synthetic */ SearchWalletViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchWalletViewModel$filterRootWallets$1$1$filterAccounts$1(SearchWalletViewModel searchWalletViewModel, fDU fdu, String str, Continuation<? super SearchWalletViewModel$filterRootWallets$1$1$filterAccounts$1> continuation) {
        super(2, continuation);
        this.this$0 = searchWalletViewModel;
        this.$rootWallet = fdu;
        this.$searchText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchWalletViewModel$filterRootWallets$1$1$filterAccounts$1(this.this$0, this.$rootWallet, this.$searchText, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends fDO>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<fDO>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<fDO>> continuation) {
        return ((SearchWalletViewModel$filterRootWallets$1$1$filterAccounts$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SearchWalletViewModel searchWalletViewModel = this.this$0;
            fDU fdu = this.$rootWallet;
            String str = this.$searchText;
            this.label = 1;
            obj = searchWalletViewModel.AEQbTJ(fdu, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
