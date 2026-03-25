package com.okinc.business.defi.wallet.mine.walletmanage.viewmodel;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C56391yDq;
import o.C56442yFn;
import o.fDO;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchWalletViewModel$getFilteredAccounts$2$getMatchedAddresses$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
    final /* synthetic */ fDO $account;
    final /* synthetic */ String $searchText;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchWalletViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchWalletViewModel$getFilteredAccounts$2$getMatchedAddresses$2(fDO fdo, String str, SearchWalletViewModel searchWalletViewModel, Continuation<? super SearchWalletViewModel$getFilteredAccounts$2$getMatchedAddresses$2> continuation) {
        super(2, continuation);
        this.$account = fdo;
        this.$searchText = str;
        this.this$0 = searchWalletViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchWalletViewModel$getFilteredAccounts$2$getMatchedAddresses$2 searchWalletViewModel$getFilteredAccounts$2$getMatchedAddresses$2 = new SearchWalletViewModel$getFilteredAccounts$2$getMatchedAddresses$2(this.$account, this.$searchText, this.this$0, continuation);
        searchWalletViewModel$getFilteredAccounts$2$getMatchedAddresses$2.L$0 = obj;
        return searchWalletViewModel$getFilteredAccounts$2$getMatchedAddresses$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<String>> continuation) {
        return ((SearchWalletViewModel$getFilteredAccounts$2$getMatchedAddresses$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List<String> listKWHzl = this.$account.KWHzl();
            String str = this.$searchText;
            SearchWalletViewModel searchWalletViewModel = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listKWHzl) {
                CoroutineScopeKt.ensureActive(coroutineScope);
                if (StringsKt__StringsKt.AhwBna((String) obj2, str, searchWalletViewModel.copydefault())) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
