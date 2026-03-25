package com.okinc.business.market.features.history.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.common.constants.TokenAgeType;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.history.ui.models.HistoryChangeFragmentParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C25624jAh;
import o.C26211jWa;
import o.C26249jXl;
import o.C26274jYj;
import o.C26277jYm;
import o.C28586kda;
import o.C56391yDq;
import o.C56442yFn;
import o.jNN;
import o.jNY;
import o.jVY;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HistoryChangeViewModel extends ViewModel {
    public final MutableStateFlow<List<C26277jYm>> AEQbTJ;
    public final MutableSharedFlow<List<C26277jYm>> AYXKKw;
    public final MutableLiveData<Boolean> AhwBna;
    public final jVY AkhnZx;
    public final C25624jAh AuCTel;
    public final SharedFlow<List<C26277jYm>> AuCTelauCTel;
    public final TokenFilter DbNXlk;
    public final MutableStateFlow<List<C26211jWa>> EZpvd;
    public final List<PriceRangeFilter> KWHzl;
    public final MutableLiveData<TokenFilter> OLrzqt;
    public final MutableLiveData<Boolean> copydefault;
    public final MutableStateFlow<C26274jYj> djBIcL;
    public C26211jWa ejfBZ;
    public final C28586kda fARcdN;
    public jNY fIwbmz;
    public final CoroutineDispatcher fJNWhG;
    public final StateFlow<List<C26277jYm>> fetchVPNInfo;
    public String gEmmrt;
    public final HistoryChangeFragmentParams getFieldNames;
    public final StateFlow<C26274jYj> getNewProxyInstance;
    public TxType hDKMBd;
    public final StateFlow<List<C26211jWa>> isConnected;
    public final C26249jXl iwGUEr;
    public final ConcurrentHashMap<String, C26277jYm> uzCIH;
    public Job valueOf;
    public final jNN values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jNY AYXKKw() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C26211jWa>> AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<List<C26277jYm>> AuCTel() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxType DbNXlk() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<TokenFilter> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C26277jYm>> copydefault() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26211jWa djBIcL() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<List<C26277jYm>> fJNWhG() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C26274jYj> fetchVPNInfo() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<String, C26277jYm> valueOf() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> values() {
        return this.AhwBna;
    }

    @yCM
    public HistoryChangeViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C26249jXl c26249jXl, @NotNull C25624jAh c25624jAh, @NotNull jNN jnn, @NotNull C28586kda c28586kda, @NotNull jVY jvy, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c26249jXl, "");
        Intrinsics.checkNotNullParameter(c25624jAh, "");
        Intrinsics.checkNotNullParameter(jnn, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(jvy, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.iwGUEr = c26249jXl;
        this.AuCTel = c25624jAh;
        this.values = jnn;
        this.fARcdN = c28586kda;
        this.AkhnZx = jvy;
        this.fJNWhG = coroutineDispatcher;
        HistoryChangeFragmentParams historyChangeFragmentParams = (HistoryChangeFragmentParams) savedStateHandle.get("key.history_change_params");
        historyChangeFragmentParams = historyChangeFragmentParams == null ? new HistoryChangeFragmentParams(null, null, null, null, null, null, null, 127, null) : historyChangeFragmentParams;
        this.getFieldNames = historyChangeFragmentParams;
        MutableStateFlow<C26274jYj> MutableStateFlow = StateFlowKt.MutableStateFlow(new C26274jYj(false, true, false, false, null, true, 29, null));
        this.djBIcL = MutableStateFlow;
        this.getNewProxyInstance = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<C26277jYm>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow2;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow2);
        this.KWHzl = new ArrayList();
        MutableStateFlow<List<C26211jWa>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.EZpvd = MutableStateFlow3;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow3);
        this.uzCIH = new ConcurrentHashMap<>();
        MutableSharedFlow<List<C26277jYm>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default;
        this.AuCTelauCTel = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        Boolean bool = Boolean.FALSE;
        this.AhwBna = new MutableLiveData<>(bool);
        this.copydefault = new MutableLiveData<>(bool);
        TokenFilter tokenFilter = new TokenFilter(historyChangeFragmentParams.EZpvd(), historyChangeFragmentParams.AEQbTJ(), null, null, null, false, false, null, true, false, null, null, null, 7932, null);
        this.DbNXlk = tokenFilter;
        this.OLrzqt = new MutableLiveData<>(tokenFilter);
        this.hDKMBd = TxType.ALL;
        this.ejfBZ = new C26211jWa(0, null, null, 7, null);
        this.gEmmrt = "";
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final List<PriceRangeFilter> AkhnZx() {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.KWHzl);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.history.ui.HistoryChangeViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HistoryChangeViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<List<C26277jYm>> stateFlowAEQbTJ = HistoryChangeViewModel.this.iwGUEr.AEQbTJ();
                final HistoryChangeViewModel historyChangeViewModel = HistoryChangeViewModel.this;
                FlowCollector<? super List<C26277jYm>> flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.history.ui.HistoryChangeViewModel.1.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public final Object emit(List<C26277jYm> list, Continuation<? super Unit> continuation) {
                        historyChangeViewModel.fJNWhG().setValue(list);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public static /* synthetic */ void updateFilter$default(HistoryChangeViewModel historyChangeViewModel, TxType txType, C26211jWa c26211jWa, TokenFilter tokenFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            txType = historyChangeViewModel.hDKMBd;
        }
        if ((i & 2) != 0) {
            c26211jWa = historyChangeViewModel.ejfBZ;
        }
        if ((i & 4) != 0) {
            tokenFilter = historyChangeViewModel.EZpvd();
        }
        historyChangeViewModel.EZpvd(txType, c26211jWa, tokenFilter);
    }

    public final void EZpvd(@NotNull TxType txType, @NotNull C26211jWa c26211jWa, @NotNull TokenFilter tokenFilter) {
        TokenFilter tokenFilterOLrzqt;
        Intrinsics.checkNotNullParameter(txType, "");
        Intrinsics.checkNotNullParameter(c26211jWa, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        fARcdN();
        this.hDKMBd = txType;
        this.ejfBZ = c26211jWa;
        String str = Intrinsics.EZpvd((Object) c26211jWa.copydefault(), (Object) "following") ? this.gEmmrt : "";
        if (tokenFilter.AEQbTJ()) {
            tokenFilterOLrzqt = tokenFilter.OLrzqt((6143 & 1) != 0 ? tokenFilter.AEQbTJ : this.getFieldNames.EZpvd(), (6143 & 2) != 0 ? tokenFilter.isConnected : this.getFieldNames.AEQbTJ(), (6143 & 4) != 0 ? tokenFilter.AkhnZx : this.hDKMBd.getValue(), (6143 & 8) != 0 ? tokenFilter.AhwBna : new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null), (6143 & 16) != 0 ? tokenFilter.KWHzl : null, (6143 & 32) != 0 ? tokenFilter.AYXKKw : false, (6143 & 64) != 0 ? tokenFilter.valueOf : false, (6143 & 128) != 0 ? tokenFilter.EZpvd : this.ejfBZ.copydefault(), (6143 & 256) != 0 ? tokenFilter.gEmmrt : false, (6143 & 512) != 0 ? tokenFilter.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilter.copydefault : null, (6143 & 2048) != 0 ? tokenFilter.djBIcL : null, (6143 & 4096) != 0 ? tokenFilter.fetchVPNInfo : str);
        } else {
            tokenFilterOLrzqt = tokenFilter.OLrzqt((6143 & 1) != 0 ? tokenFilter.AEQbTJ : this.getFieldNames.EZpvd(), (6143 & 2) != 0 ? tokenFilter.isConnected : this.getFieldNames.AEQbTJ(), (6143 & 4) != 0 ? tokenFilter.AkhnZx : this.hDKMBd.getValue(), (6143 & 8) != 0 ? tokenFilter.AhwBna : null, (6143 & 16) != 0 ? tokenFilter.KWHzl : null, (6143 & 32) != 0 ? tokenFilter.AYXKKw : false, (6143 & 64) != 0 ? tokenFilter.valueOf : false, (6143 & 128) != 0 ? tokenFilter.EZpvd : this.ejfBZ.copydefault(), (6143 & 256) != 0 ? tokenFilter.gEmmrt : false, (6143 & 512) != 0 ? tokenFilter.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilter.copydefault : new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null), (6143 & 2048) != 0 ? tokenFilter.djBIcL : null, (6143 & 4096) != 0 ? tokenFilter.fetchVPNInfo : str);
        }
        this.OLrzqt.setValue(tokenFilterOLrzqt);
        EZpvd("");
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() <= 0 || this.djBIcL.getValue().copydefault()) {
            EZpvd(str);
        }
    }

    public final void fIwbmz() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HistoryChangeViewModel$loadPriceRangeOptions$1(this, null), 3, null);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.fJNWhG, null, new HistoryChangeViewModel$loadTagFilters$1(this, str2, str, null), 2, null);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HistoryChangeViewModel$getNativeTokenPrice$1(this, str, null), 3, null);
    }

    public static /* synthetic */ void reloadInternally$default(HistoryChangeViewModel historyChangeViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        historyChangeViewModel.EZpvd(str);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean z = str.length() == 0;
        if (z) {
            fARcdN();
            KWHzl(this.getFieldNames.EZpvd());
        }
        Job job = this.valueOf;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.valueOf = C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new HistoryChangeViewModel$reloadInternally$1(z, this, str, null), 3, null);
    }

    public final TokenFilter EZpvd() {
        TokenFilter value = KWHzl().getValue();
        return value == null ? this.DbNXlk : value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hDKMBd() {
        TokenFilter tokenFilterEZpvd = EZpvd();
        TokenFilter tokenFilter = this.DbNXlk;
        return Intrinsics.EZpvd(tokenFilterEZpvd, tokenFilter.OLrzqt((6143 & 1) != 0 ? tokenFilter.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilter.isConnected : null, (6143 & 4) != 0 ? tokenFilter.AkhnZx : TxType.ALL.getValue(), (6143 & 8) != 0 ? tokenFilter.AhwBna : null, (6143 & 16) != 0 ? tokenFilter.KWHzl : null, (6143 & 32) != 0 ? tokenFilter.AYXKKw : false, (6143 & 64) != 0 ? tokenFilter.valueOf : false, (6143 & 128) != 0 ? tokenFilter.EZpvd : "", (6143 & 256) != 0 ? tokenFilter.gEmmrt : false, (6143 & 512) != 0 ? tokenFilter.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilter.copydefault : null, (6143 & 2048) != 0 ? tokenFilter.djBIcL : null, (6143 & 4096) != 0 ? tokenFilter.fetchVPNInfo : null));
    }

    public static /* synthetic */ void subscribeWs$default(HistoryChangeViewModel historyChangeViewModel, TokenFilter tokenFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            tokenFilter = historyChangeViewModel.EZpvd();
        }
        historyChangeViewModel.copydefault(tokenFilter);
    }

    public final void copydefault(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        List<C26277jYm> value = this.AEQbTJ.getValue();
        if (value == null || value.isEmpty()) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.fJNWhG, null, new HistoryChangeViewModel$subscribeWs$1(this, tokenFilter, null), 2, null);
    }

    public final void fARcdN() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.fJNWhG, null, new HistoryChangeViewModel$unsubscribeWs$1(this, null), 2, null);
    }

    public final void AEQbTJ(boolean z) {
        this.AhwBna.setValue(Boolean.valueOf(z));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HistoryChangeViewModel$updateTimeDisplay$1(this, z, null), 3, null);
    }

    public final void OLrzqt(boolean z) {
        this.copydefault.setValue(Boolean.valueOf(z));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.fJNWhG, null, new HistoryChangeViewModel$updateAmountDisplay$1(this, z, null), 2, null);
    }

    public final void isConnected() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.fJNWhG, null, new HistoryChangeViewModel$getTimeDisplay$1(this, null), 2, null);
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.fJNWhG, null, new HistoryChangeViewModel$getAmountDisplay$1(this, null), 2, null);
    }

    public final void ejfBZ() {
        fARcdN();
        this.uzCIH.clear();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        ejfBZ();
    }

    public final void AEQbTJ(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.uzCIH.remove((String) it.next());
        }
    }
}
