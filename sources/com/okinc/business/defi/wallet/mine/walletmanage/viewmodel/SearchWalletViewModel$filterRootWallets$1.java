package com.okinc.business.defi.wallet.mine.walletmanage.viewmodel;

import com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.SearchWalletViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.Point;
import o.fDU;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchWalletViewModel$filterRootWallets$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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
    public SearchWalletViewModel$filterRootWallets$1(SearchWalletViewModel searchWalletViewModel, String str, Continuation<? super SearchWalletViewModel$filterRootWallets$1> continuation) {
        super(2, continuation);
        this.this$0 = searchWalletViewModel;
        this.$searchText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchWalletViewModel$filterRootWallets$1 searchWalletViewModel$filterRootWallets$1 = new SearchWalletViewModel$filterRootWallets$1(this.this$0, this.$searchText, continuation);
        searchWalletViewModel$filterRootWallets$1.L$0 = obj;
        return searchWalletViewModel$filterRootWallets$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchWalletViewModel$filterRootWallets$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0099 -> B:24:0x009c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        CoroutineScope coroutineScope;
        List list;
        String str;
        SearchWalletViewModel searchWalletViewModel;
        MutableStateFlow mutableStateFlow;
        Object value;
        Object value2;
        Object value3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ArrayList arrayList = new ArrayList();
            List list2 = this.this$0.AEQbTJ;
            String str2 = this.$searchText;
            SearchWalletViewModel searchWalletViewModel2 = this.this$0;
            it = list2.iterator();
            coroutineScope = coroutineScope2;
            list = arrayList;
            str = str2;
            searchWalletViewModel = searchWalletViewModel2;
            while (it.hasNext()) {
            }
            mutableStateFlow = this.this$0.values;
            do {
                value = mutableStateFlow.getValue();
                ((Boolean) value).booleanValue();
            } while (!mutableStateFlow.compareAndSet(value, C56443yFo.KWHzl(false)));
            if (list.size() <= 0) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fDU fdu = (fDU) this.L$5;
        it = (Iterator) this.L$4;
        searchWalletViewModel = (SearchWalletViewModel) this.L$3;
        str = (String) this.L$2;
        list = (List) this.L$1;
        coroutineScope = (CoroutineScope) this.L$0;
        C56391yDq.AEQbTJ(obj);
        List list3 = (List) obj;
        if (!list3.isEmpty()) {
            list.add(fDU.copy$default(fdu, null, list3, 1, null));
        }
        while (it.hasNext()) {
            fdu = (fDU) it.next();
            CoroutineScopeKt.ensureActive(coroutineScope);
            if (str == null || str.length() == 0 || StringsKt__StringsKt.AhwBna(fdu.KWHzl(), str, searchWalletViewModel.copydefault())) {
                list.add(fdu);
            } else if (C33129mqd.OLrzqt((CharSequence) str)) {
                CoroutineDispatcher coroutineDispatcher = searchWalletViewModel.gEmmrt;
                SearchWalletViewModel$filterRootWallets$1$1$filterAccounts$1 searchWalletViewModel$filterRootWallets$1$1$filterAccounts$1 = new SearchWalletViewModel$filterRootWallets$1$1$filterAccounts$1(searchWalletViewModel, fdu, str, null);
                this.L$0 = coroutineScope;
                this.L$1 = list;
                this.L$2 = str;
                this.L$3 = searchWalletViewModel;
                this.L$4 = it;
                this.L$5 = fdu;
                this.label = 1;
                obj = BuildersKt.withContext(coroutineDispatcher, searchWalletViewModel$filterRootWallets$1$1$filterAccounts$1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                List list32 = (List) obj;
                if (!list32.isEmpty()) {
                }
                while (it.hasNext()) {
                }
            }
        }
        mutableStateFlow = this.this$0.values;
        do {
            value = mutableStateFlow.getValue();
            ((Boolean) value).booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, C56443yFo.KWHzl(false)));
        if (list.size() <= 0) {
            MutableStateFlow mutableStateFlow2 = this.this$0.copydefault;
            String str3 = this.$searchText;
            do {
                value3 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value3, new Point.Application(new SearchWalletViewModel.Application(str3, list))));
        } else {
            MutableStateFlow mutableStateFlow3 = this.this$0.copydefault;
            String str4 = this.$searchText;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value2, new Point.Application(new SearchWalletViewModel.Application(str4, yDY.AhwBna()))));
        }
        return Unit.INSTANCE;
    }
}
