package com.okinc.business.defi.wallet.mine.search.data;

import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchType;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C18943fru;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchHistoryPrefsDataSource$getSearchHistoryFlow$2 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends SearchHistoryItem>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SearchType> $excludedTypes;
    final /* synthetic */ String $walletId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C18943fru this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.business.defi.wallet.mine.search.data.model.SearchType> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchHistoryPrefsDataSource$getSearchHistoryFlow$2(C18943fru c18943fru, String str, List<? extends SearchType> list, Continuation<? super SearchHistoryPrefsDataSource$getSearchHistoryFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = c18943fru;
        this.$walletId = str;
        this.$excludedTypes = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchHistoryPrefsDataSource$getSearchHistoryFlow$2 searchHistoryPrefsDataSource$getSearchHistoryFlow$2 = new SearchHistoryPrefsDataSource$getSearchHistoryFlow$2(this.this$0, this.$walletId, this.$excludedTypes, continuation);
        searchHistoryPrefsDataSource$getSearchHistoryFlow$2.L$0 = obj;
        return searchHistoryPrefsDataSource$getSearchHistoryFlow$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super List<? extends SearchHistoryItem>> flowCollector, Continuation<? super Unit> continuation) {
        return ((SearchHistoryPrefsDataSource$getSearchHistoryFlow$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            List<SearchHistoryItem> listCopydefault = this.this$0.copydefault(this.$walletId, this.$excludedTypes);
            this.label = 1;
            if (flowCollector.emit(listCopydefault, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
