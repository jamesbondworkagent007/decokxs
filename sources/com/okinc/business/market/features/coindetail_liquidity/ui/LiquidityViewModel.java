package com.okinc.business.market.features.coindetail_liquidity.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.data.constant.LiquidityChangeType;
import com.okinc.business.market.features.coindetail_liquidity.domain.LiquidityChange;
import com.okinc.business.market.features.coindetail_liquidity.ui.models.LiquidityFragmentParams;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C26069jQu;
import o.C26072jQx;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.jPQ;
import o.jPR;
import o.jPS;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LiquidityViewModel extends ViewModel {
    public MutableLiveData<TokenFilter> AEQbTJ;
    public final CoroutineDispatcher AYXKKw;
    public boolean AhwBna;
    public final ConcurrentHashMap<String, C26072jQx> AkhnZx;
    public final StateFlow<C26069jQu> DbNXlk;
    public final MutableStateFlow<C26069jQu> EZpvd;
    public final MutableStateFlow<List<C26072jQx>> KWHzl;
    public final List<PriceRangeFilter> OLrzqt;
    public final MutableStateFlow<List<C26072jQx>> copydefault;
    public final StateFlow<List<C26072jQx>> djBIcL;
    public final StateFlow<List<C26072jQx>> fARcdN;
    public final jPS fetchVPNInfo;
    public final TokenFilter gEmmrt;
    public final jPR isConnected;
    public final jPQ valueOf;
    public final LiquidityFragmentParams values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C26072jQx>> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C26069jQu> AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<String, C26072jQx> OLrzqt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<TokenFilter> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<List<C26072jQx>> djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C26072jQx>> gEmmrt() {
        return this.fARcdN;
    }

    @yCM
    public LiquidityViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull jPS jps, @NotNull jPQ jpq, @NotNull jPR jpr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(jps, "");
        Intrinsics.checkNotNullParameter(jpq, "");
        Intrinsics.checkNotNullParameter(jpr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.fetchVPNInfo = jps;
        this.valueOf = jpq;
        this.isConnected = jpr;
        this.AYXKKw = coroutineDispatcher;
        LiquidityFragmentParams liquidityFragmentParams = (LiquidityFragmentParams) savedStateHandle.get("key.liquidity_change_params");
        this.values = liquidityFragmentParams == null ? new LiquidityFragmentParams(null, null, null, null, null, 31, null) : liquidityFragmentParams;
        MutableStateFlow<C26069jQu> MutableStateFlow = StateFlowKt.MutableStateFlow(new C26069jQu(false, true, false, false, null, true, 29, null));
        this.EZpvd = MutableStateFlow;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<C26072jQx>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow2;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow2);
        this.AkhnZx = new ConcurrentHashMap<>();
        MutableStateFlow<List<C26072jQx>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.copydefault = MutableStateFlow3;
        this.fARcdN = FlowKt.asStateFlow(MutableStateFlow3);
        this.OLrzqt = new ArrayList();
        TokenFilter tokenFilter = new TokenFilter(null, null, LiquidityChangeType.All.getValue(), null, null, false, false, null, false, false, null, null, null, 8187, null);
        this.gEmmrt = tokenFilter;
        this.AEQbTJ = new MutableLiveData<>(tokenFilter);
        this.AhwBna = true;
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final List<PriceRangeFilter> valueOf() {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.OLrzqt);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LiquidityViewModel.this.new AnonymousClass1(continuation);
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
                StateFlow<List<LiquidityChange>> stateFlowAEQbTJ = LiquidityViewModel.this.fetchVPNInfo.AEQbTJ();
                final LiquidityViewModel liquidityViewModel = LiquidityViewModel.this;
                FlowCollector<? super List<LiquidityChange>> flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityViewModel.1.1
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public final Object emit(List<LiquidityChange> list, Continuation<? super Unit> continuation) {
                        ArrayList arrayList;
                        if (list != null) {
                            LiquidityViewModel liquidityViewModel2 = liquidityViewModel;
                            arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(liquidityViewModel2.isConnected.EZpvd((LiquidityChange) it.next()));
                            }
                        } else {
                            arrayList = null;
                        }
                        liquidityViewModel.djBIcL().setValue(arrayList);
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

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.fetchVPNInfo.EZpvd();
        super.onCleared();
    }

    public final void values() {
        onFilterChange$default(this, null, this.gEmmrt, 1, null);
    }

    public static /* synthetic */ void onFilterChange$default(LiquidityViewModel liquidityViewModel, String str, TokenFilter tokenFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            tokenFilter = null;
        }
        liquidityViewModel.AEQbTJ(str, tokenFilter);
    }

    public final void AEQbTJ(String str, TokenFilter tokenFilter) {
        TokenFilter tokenFilterKWHzl = KWHzl();
        if (str != null) {
            tokenFilterKWHzl = tokenFilterKWHzl.OLrzqt((6143 & 1) != 0 ? tokenFilterKWHzl.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterKWHzl.isConnected : null, (6143 & 4) != 0 ? tokenFilterKWHzl.AkhnZx : str, (6143 & 8) != 0 ? tokenFilterKWHzl.AhwBna : null, (6143 & 16) != 0 ? tokenFilterKWHzl.KWHzl : null, (6143 & 32) != 0 ? tokenFilterKWHzl.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterKWHzl.valueOf : false, (6143 & 128) != 0 ? tokenFilterKWHzl.EZpvd : null, (6143 & 256) != 0 ? tokenFilterKWHzl.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterKWHzl.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterKWHzl.copydefault : null, (6143 & 2048) != 0 ? tokenFilterKWHzl.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterKWHzl.fetchVPNInfo : null);
        }
        TokenFilter tokenFilterOLrzqt = tokenFilterKWHzl;
        if (tokenFilter != null) {
            tokenFilterOLrzqt = tokenFilterOLrzqt.OLrzqt((6143 & 1) != 0 ? tokenFilterOLrzqt.AEQbTJ : tokenFilter.KWHzl(), (6143 & 2) != 0 ? tokenFilterOLrzqt.isConnected : tokenFilter.isConnected(), (6143 & 4) != 0 ? tokenFilterOLrzqt.AkhnZx : null, (6143 & 8) != 0 ? tokenFilterOLrzqt.AhwBna : tokenFilter.AYXKKw(), (6143 & 16) != 0 ? tokenFilterOLrzqt.KWHzl : tokenFilter.OLrzqt(), (6143 & 32) != 0 ? tokenFilterOLrzqt.AYXKKw : tokenFilter.djBIcL(), (6143 & 64) != 0 ? tokenFilterOLrzqt.valueOf : tokenFilter.AhwBna(), (6143 & 128) != 0 ? tokenFilterOLrzqt.EZpvd : tokenFilter.EZpvd(), (6143 & 256) != 0 ? tokenFilterOLrzqt.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterOLrzqt.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterOLrzqt.copydefault : null, (6143 & 2048) != 0 ? tokenFilterOLrzqt.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterOLrzqt.fetchVPNInfo : null);
        }
        if (Intrinsics.EZpvd(copydefault().getValue(), tokenFilterOLrzqt)) {
            return;
        }
        this.AEQbTJ.setValue(tokenFilterOLrzqt);
        isConnected();
        reloadInternally$default(this, null, true, 1, null);
    }

    public final void copydefault(boolean z) {
        this.AhwBna = z;
        reloadInternally$default(this, null, false, 3, null);
    }

    public final void EZpvd(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() <= 0 || z) {
            reloadInternally$default(this, str, false, 2, null);
        }
    }

    public final void AhwBna() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new LiquidityViewModel$loadPriceRangeOptions$1(this, null), 3, null);
    }

    public final TokenFilter KWHzl() {
        TokenFilter value = copydefault().getValue();
        return value == null ? this.gEmmrt : value;
    }

    public static /* synthetic */ void subscribeWs$default(LiquidityViewModel liquidityViewModel, TokenFilter tokenFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            tokenFilter = null;
        }
        liquidityViewModel.EZpvd(tokenFilter);
    }

    public final void EZpvd(TokenFilter tokenFilter) {
        List<C26072jQx> value;
        if (!this.AhwBna || (value = this.djBIcL.getValue()) == null || value.isEmpty()) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new LiquidityViewModel$subscribeWs$1(this, tokenFilter, null), 2, null);
    }

    public final void isConnected() {
        this.fetchVPNInfo.EZpvd();
    }

    public static /* synthetic */ void reloadInternally$default(LiquidityViewModel liquidityViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            z = false;
        }
        liquidityViewModel.KWHzl(str, z);
    }

    public final void KWHzl(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean z2 = str.length() == 0;
        TokenFilter tokenFilterKWHzl = KWHzl();
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new LiquidityViewModel$reloadInternally$1(z, z2, this, str, tokenFilterKWHzl.OLrzqt((6143 & 1) != 0 ? tokenFilterKWHzl.AEQbTJ : this.values.KWHzl(), (6143 & 2) != 0 ? tokenFilterKWHzl.isConnected : this.values.copydefault(), (6143 & 4) != 0 ? tokenFilterKWHzl.AkhnZx : null, (6143 & 8) != 0 ? tokenFilterKWHzl.AhwBna : null, (6143 & 16) != 0 ? tokenFilterKWHzl.KWHzl : null, (6143 & 32) != 0 ? tokenFilterKWHzl.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterKWHzl.valueOf : false, (6143 & 128) != 0 ? tokenFilterKWHzl.EZpvd : null, (6143 & 256) != 0 ? tokenFilterKWHzl.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterKWHzl.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterKWHzl.copydefault : null, (6143 & 2048) != 0 ? tokenFilterKWHzl.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterKWHzl.fetchVPNInfo : null), null), 3, null);
    }

    public final void EZpvd(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.AkhnZx.remove((String) it.next());
        }
    }
}
