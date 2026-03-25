package com.okinc.business.defi.wallet.mine.search.data;

import android.content.SharedPreferences;
import com.okinc.business.defi.wallet.mine.search.data.SearchHistoryPrefsDataSource$getSearchHistoryFlow$1;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchType;
import com.okinc.core.util.SPUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.C18943fru;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchHistoryPrefsDataSource$getSearchHistoryFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super List<? extends SearchHistoryItem>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SearchType> $excludedTypes;
    final /* synthetic */ String $walletId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C18943fru this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.business.defi.wallet.mine.search.data.model.SearchType> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchHistoryPrefsDataSource$getSearchHistoryFlow$1(C18943fru c18943fru, String str, List<? extends SearchType> list, Continuation<? super SearchHistoryPrefsDataSource$getSearchHistoryFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c18943fru;
        this.$walletId = str;
        this.$excludedTypes = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchHistoryPrefsDataSource$getSearchHistoryFlow$1 searchHistoryPrefsDataSource$getSearchHistoryFlow$1 = new SearchHistoryPrefsDataSource$getSearchHistoryFlow$1(this.this$0, this.$walletId, this.$excludedTypes, continuation);
        searchHistoryPrefsDataSource$getSearchHistoryFlow$1.L$0 = obj;
        return searchHistoryPrefsDataSource$getSearchHistoryFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super List<? extends SearchHistoryItem>> producerScope, Continuation<? super Unit> continuation) {
        return ((SearchHistoryPrefsDataSource$getSearchHistoryFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final C18943fru c18943fru = this.this$0;
            final String str = this.$walletId;
            final List<SearchType> list = this.$excludedTypes;
            final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.frw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str2) {
                    SearchHistoryPrefsDataSource$getSearchHistoryFlow$1.invokeSuspend$lambda$0(c18943fru, str, list, producerScope, sharedPreferences, str2);
                }
            };
            SPUtils.registerOnSPChangeListener("WEB3_SEARCH_HISTORY", onSharedPreferenceChangeListener);
            final C18943fru c18943fru2 = this.this$0;
            Function0 function0 = new Function0() { // from class: o.frx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SearchHistoryPrefsDataSource$getSearchHistoryFlow$1.invokeSuspend$lambda$1(c18943fru2, onSharedPreferenceChangeListener);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(C18943fru c18943fru, String str, List list, ProducerScope producerScope, SharedPreferences sharedPreferences, String str2) {
        if (str2 != null && str2.hashCode() == -306074370 && str2.equals("search_history_v2")) {
            producerScope.mo5769trySendJP2dKIU(c18943fru.copydefault(str, list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(C18943fru c18943fru, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        c18943fru.AEQbTJ.getSharedPreferences("WEB3_SEARCH_HISTORY", 0).unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return Unit.INSTANCE;
    }
}
