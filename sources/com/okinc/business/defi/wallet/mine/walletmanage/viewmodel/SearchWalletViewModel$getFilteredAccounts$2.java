package com.okinc.business.defi.wallet.mine.walletmanage.viewmodel;

import java.util.ArrayList;
import java.util.Iterator;
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
import o.fDU;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchWalletViewModel$getFilteredAccounts$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<fDO>>, Object> {
    final /* synthetic */ fDU $rootWallet;
    final /* synthetic */ String $searchText;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ SearchWalletViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchWalletViewModel$getFilteredAccounts$2(fDU fdu, String str, SearchWalletViewModel searchWalletViewModel, Continuation<? super SearchWalletViewModel$getFilteredAccounts$2> continuation) {
        super(2, continuation);
        this.$rootWallet = fdu;
        this.$searchText = str;
        this.this$0 = searchWalletViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchWalletViewModel$getFilteredAccounts$2 searchWalletViewModel$getFilteredAccounts$2 = new SearchWalletViewModel$getFilteredAccounts$2(this.$rootWallet, this.$searchText, this.this$0, continuation);
        searchWalletViewModel$getFilteredAccounts$2.L$0 = obj;
        return searchWalletViewModel$getFilteredAccounts$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<fDO>> continuation) {
        return ((SearchWalletViewModel$getFilteredAccounts$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0076 -> B:6:0x002a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        CoroutineScope coroutineScope;
        List list;
        Iterator it;
        SearchWalletViewModel searchWalletViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ArrayList arrayList = new ArrayList();
            List<fDO> listAEQbTJ = this.$rootWallet.AEQbTJ();
            str = this.$searchText;
            SearchWalletViewModel searchWalletViewModel2 = this.this$0;
            coroutineScope = coroutineScope2;
            list = arrayList;
            it = listAEQbTJ.iterator();
            searchWalletViewModel = searchWalletViewModel2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fDO fdo = (fDO) this.L$5;
            it = (Iterator) this.L$4;
            searchWalletViewModel = (SearchWalletViewModel) this.L$3;
            str = (String) this.L$2;
            list = (List) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objInvokeSuspend$getMatchedAddresses = obj;
            fDO fdo2 = fdo;
            List list2 = (List) objInvokeSuspend$getMatchedAddresses;
            if (StringsKt__StringsKt.AhwBna(fdo2.OLrzqt(), str, searchWalletViewModel.copydefault()) | (!list2.isEmpty())) {
                list.add(fDO.copy$default(fdo2, null, null, null, list2, null, false, 55, null));
            }
            if (it.hasNext()) {
                fdo = (fDO) it.next();
                CoroutineScopeKt.ensureActive(coroutineScope);
                this.L$0 = coroutineScope;
                this.L$1 = list;
                this.L$2 = str;
                this.L$3 = searchWalletViewModel;
                this.L$4 = it;
                this.L$5 = fdo;
                this.label = 1;
                objInvokeSuspend$getMatchedAddresses = invokeSuspend$getMatchedAddresses(searchWalletViewModel, str, fdo, this);
                if (objInvokeSuspend$getMatchedAddresses == objCopydefault) {
                    return objCopydefault;
                }
                fDO fdo22 = fdo;
                List list22 = (List) objInvokeSuspend$getMatchedAddresses;
                if (StringsKt__StringsKt.AhwBna(fdo22.OLrzqt(), str, searchWalletViewModel.copydefault()) | (!list22.isEmpty())) {
                }
                if (it.hasNext()) {
                    return list;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$getMatchedAddresses(SearchWalletViewModel searchWalletViewModel, String str, fDO fdo, Continuation<? super List<String>> continuation) {
        return CoroutineScopeKt.coroutineScope(new SearchWalletViewModel$getFilteredAccounts$2$getMatchedAddresses$2(fdo, str, searchWalletViewModel, null), continuation);
    }
}
