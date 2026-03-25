package com.okinc.dexkline.market.features.history.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.dexkline.dexlogic.txs.TxType;
import com.okinc.dexkline.market.common.constants.TokenAgeType;
import com.okinc.dexkline.market.features.coindetail.ui.label.LabelFilter;
import com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.history.ui.models.HistoryChangeFragmentParams;
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
import o.C32380mZw;
import o.C34371nan;
import o.C34374naq;
import o.C56391yDq;
import o.C56442yFn;
import o.mUR;
import o.mVP;
import o.mWC;
import o.mWE;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class HistoryChangeViewModel extends ViewModel {
    public final MutableLiveData<mWC> AEQbTJ;
    public final MutableSharedFlow<List<C34371nan>> AYXKKw;
    public final MutableStateFlow<C34374naq> AhwBna;
    public final StateFlow<List<C34371nan>> AkhnZx;
    public final HistoryChangeFragmentParams AuCTel;
    public final mVP DbNXlk;
    public final MutableLiveData<TokenFilter> EZpvd;
    public final MutableStateFlow<List<C34371nan>> KWHzl;
    public final List<PriceRangeFilter> OLrzqt;
    public final MutableLiveData<Boolean> copydefault;
    public Job djBIcL;
    public mWC ejfBZ;
    public final ConcurrentHashMap<String, C34371nan> fARcdN;
    public final C32380mZw fIwbmz;
    public TxType fJNWhG;
    public LabelFilter fetchVPNInfo;
    public final mWE gEmmrt;
    public final TokenFilter isConnected;
    public final SharedFlow<List<C34371nan>> iwGUEr;
    public final StateFlow<C34374naq> uzCIH;
    public final MutableLiveData<Boolean> valueOf;
    public final CoroutineDispatcher values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C34371nan>> AEQbTJ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mWC AYXKKw() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<mWC> AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxType AkhnZx() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<List<C34371nan>> AuCTel() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> DbNXlk() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<TokenFilter> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LabelFilter djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<List<C34371nan>> fIwbmz() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<String, C34371nan> valueOf() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C34374naq> values() {
        return this.uzCIH;
    }

    @yCM
    public HistoryChangeViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C32380mZw c32380mZw, @NotNull mVP mvp, @NotNull mWE mwe, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c32380mZw, "");
        Intrinsics.checkNotNullParameter(mvp, "");
        Intrinsics.checkNotNullParameter(mwe, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.fIwbmz = c32380mZw;
        this.DbNXlk = mvp;
        this.gEmmrt = mwe;
        this.values = coroutineDispatcher;
        HistoryChangeFragmentParams historyChangeFragmentParams = (HistoryChangeFragmentParams) savedStateHandle.get("key.history_change_params");
        historyChangeFragmentParams = historyChangeFragmentParams == null ? new HistoryChangeFragmentParams(null, null, null, null, null, null, 63, null) : historyChangeFragmentParams;
        this.AuCTel = historyChangeFragmentParams;
        MutableStateFlow<C34374naq> MutableStateFlow = StateFlowKt.MutableStateFlow(new C34374naq(false, true, false, false, null, true, 29, null));
        this.AhwBna = MutableStateFlow;
        this.uzCIH = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<C34371nan>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow2;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow2);
        this.OLrzqt = new ArrayList();
        this.fARcdN = new ConcurrentHashMap<>();
        MutableSharedFlow<List<C34371nan>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default;
        this.iwGUEr = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        Boolean bool = Boolean.FALSE;
        this.valueOf = new MutableLiveData<>(bool);
        this.copydefault = new MutableLiveData<>(bool);
        TokenFilter tokenFilter = new TokenFilter(historyChangeFragmentParams.EZpvd(), historyChangeFragmentParams.KWHzl(), null, null, null, false, false, null, true, false, null, null, historyChangeFragmentParams.OLrzqt(), historyChangeFragmentParams.copydefault(), 3836, null);
        this.isConnected = tokenFilter;
        this.EZpvd = new MutableLiveData<>(tokenFilter);
        this.AEQbTJ = new MutableLiveData<>();
        this.fJNWhG = TxType.ALL;
        this.fetchVPNInfo = LabelFilter.ALL;
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final List<PriceRangeFilter> isConnected() {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.OLrzqt);
    }

    /* JADX INFO: renamed from: com.okinc.dexkline.market.features.history.ui.HistoryChangeViewModel$1, reason: invalid class name */
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
                StateFlow<List<C34371nan>> stateFlowAEQbTJ = HistoryChangeViewModel.this.fIwbmz.AEQbTJ();
                final HistoryChangeViewModel historyChangeViewModel = HistoryChangeViewModel.this;
                FlowCollector<? super List<C34371nan>> flowCollector = new FlowCollector() { // from class: com.okinc.dexkline.market.features.history.ui.HistoryChangeViewModel.1.2
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public final Object emit(List<C34371nan> list, Continuation<? super Unit> continuation) {
                        historyChangeViewModel.fIwbmz().setValue(list);
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

    public static /* synthetic */ void updateFilter$default(HistoryChangeViewModel historyChangeViewModel, TxType txType, LabelFilter labelFilter, TokenFilter tokenFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            txType = historyChangeViewModel.fJNWhG;
        }
        if ((i & 2) != 0) {
            labelFilter = historyChangeViewModel.fetchVPNInfo;
        }
        if ((i & 4) != 0) {
            tokenFilter = historyChangeViewModel.EZpvd();
        }
        historyChangeViewModel.copydefault(txType, labelFilter, tokenFilter);
    }

    public final void copydefault(@NotNull TxType txType, @NotNull LabelFilter labelFilter, @NotNull TokenFilter tokenFilter) {
        TokenFilter tokenFilterAEQbTJ;
        Intrinsics.checkNotNullParameter(txType, "");
        Intrinsics.checkNotNullParameter(labelFilter, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        fJNWhG();
        this.fJNWhG = txType;
        this.fetchVPNInfo = labelFilter;
        if (tokenFilter.OLrzqt()) {
            tokenFilterAEQbTJ = tokenFilter.AEQbTJ((15359 & 1) != 0 ? tokenFilter.copydefault : this.AuCTel.EZpvd(), (15359 & 2) != 0 ? tokenFilter.isConnected : this.AuCTel.KWHzl(), (15359 & 4) != 0 ? tokenFilter.DbNXlk : this.fJNWhG.getValue(), (15359 & 8) != 0 ? tokenFilter.AhwBna : new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null), (15359 & 16) != 0 ? tokenFilter.AEQbTJ : null, (15359 & 32) != 0 ? tokenFilter.valueOf : false, (15359 & 64) != 0 ? tokenFilter.djBIcL : false, (15359 & 128) != 0 ? tokenFilter.EZpvd : this.fetchVPNInfo.getValue(), (15359 & 256) != 0 ? tokenFilter.AYXKKw : false, (15359 & 512) != 0 ? tokenFilter.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilter.gEmmrt : null, (15359 & 2048) != 0 ? tokenFilter.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilter.KWHzl : null, (15359 & 8192) != 0 ? tokenFilter.AkhnZx : null);
        } else {
            tokenFilterAEQbTJ = tokenFilter.AEQbTJ((15359 & 1) != 0 ? tokenFilter.copydefault : this.AuCTel.EZpvd(), (15359 & 2) != 0 ? tokenFilter.isConnected : this.AuCTel.KWHzl(), (15359 & 4) != 0 ? tokenFilter.DbNXlk : this.fJNWhG.getValue(), (15359 & 8) != 0 ? tokenFilter.AhwBna : null, (15359 & 16) != 0 ? tokenFilter.AEQbTJ : null, (15359 & 32) != 0 ? tokenFilter.valueOf : false, (15359 & 64) != 0 ? tokenFilter.djBIcL : false, (15359 & 128) != 0 ? tokenFilter.EZpvd : this.fetchVPNInfo.getValue(), (15359 & 256) != 0 ? tokenFilter.AYXKKw : false, (15359 & 512) != 0 ? tokenFilter.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilter.gEmmrt : new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null), (15359 & 2048) != 0 ? tokenFilter.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilter.KWHzl : null, (15359 & 8192) != 0 ? tokenFilter.AkhnZx : null);
        }
        this.EZpvd.setValue(tokenFilterAEQbTJ);
        copydefault("");
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() <= 0 || this.AhwBna.getValue().EZpvd()) {
            copydefault(str);
        }
    }

    public final void fARcdN() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HistoryChangeViewModel$loadPriceRangeOptions$1(this, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HistoryChangeViewModel$getNativeTokenPrice$1(this, str, null), 3, null);
    }

    public static /* synthetic */ void reloadInternally$default(HistoryChangeViewModel historyChangeViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        historyChangeViewModel.copydefault(str);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean z = str.length() == 0;
        if (z) {
            fJNWhG();
            AEQbTJ(this.AuCTel.EZpvd());
        }
        Job job = this.djBIcL;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.djBIcL = mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new HistoryChangeViewModel$reloadInternally$1(z, this, str, null), 3, null);
    }

    public final TokenFilter EZpvd() {
        TokenFilter value = OLrzqt().getValue();
        return value == null ? this.isConnected : value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hDKMBd() {
        TokenFilter tokenFilterEZpvd = EZpvd();
        TokenFilter tokenFilter = this.isConnected;
        return Intrinsics.EZpvd(tokenFilterEZpvd, tokenFilter.AEQbTJ((15359 & 1) != 0 ? tokenFilter.copydefault : null, (15359 & 2) != 0 ? tokenFilter.isConnected : null, (15359 & 4) != 0 ? tokenFilter.DbNXlk : TxType.ALL.getValue(), (15359 & 8) != 0 ? tokenFilter.AhwBna : null, (15359 & 16) != 0 ? tokenFilter.AEQbTJ : null, (15359 & 32) != 0 ? tokenFilter.valueOf : false, (15359 & 64) != 0 ? tokenFilter.djBIcL : false, (15359 & 128) != 0 ? tokenFilter.EZpvd : LabelFilter.ALL.getValue(), (15359 & 256) != 0 ? tokenFilter.AYXKKw : false, (15359 & 512) != 0 ? tokenFilter.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilter.gEmmrt : null, (15359 & 2048) != 0 ? tokenFilter.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilter.KWHzl : null, (15359 & 8192) != 0 ? tokenFilter.AkhnZx : null));
    }

    public static /* synthetic */ void subscribeWs$default(HistoryChangeViewModel historyChangeViewModel, TokenFilter tokenFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            tokenFilter = historyChangeViewModel.EZpvd();
        }
        historyChangeViewModel.KWHzl(tokenFilter);
    }

    public final void KWHzl(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        List<C34371nan> value = this.KWHzl.getValue();
        if (value == null || value.isEmpty()) {
            return;
        }
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.values, null, new HistoryChangeViewModel$subscribeWs$1(this, tokenFilter, null), 2, null);
    }

    public final void fJNWhG() {
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.values, null, new HistoryChangeViewModel$unsubscribeWs$1(this, null), 2, null);
    }

    public final void KWHzl(boolean z) {
        this.valueOf.setValue(Boolean.valueOf(z));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HistoryChangeViewModel$updateTimeDisplay$1(this, z, null), 3, null);
    }

    public final void OLrzqt(boolean z) {
        this.copydefault.setValue(Boolean.valueOf(z));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.values, null, new HistoryChangeViewModel$updateAmountDisplay$1(this, z, null), 2, null);
    }

    public final void fetchVPNInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.values, null, new HistoryChangeViewModel$getTimeDisplay$1(this, null), 2, null);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.values, null, new HistoryChangeViewModel$getAmountDisplay$1(this, null), 2, null);
    }

    public final void ejfBZ() {
        fJNWhG();
        this.fARcdN.clear();
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
            this.fARcdN.remove((String) it.next());
        }
    }
}
