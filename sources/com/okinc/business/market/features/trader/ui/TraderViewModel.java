package com.okinc.business.market.features.trader.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import com.okinc.business.market.features.trader.domain.model.Traders;
import com.okinc.business.market.features.trader.ui.model.TraderFragmentParams;
import com.okinc.business.market.features.trader.ui.model.TraderPnLFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C25624jAh;
import o.C26211jWa;
import o.C27721kAx;
import o.C28586kda;
import o.C29777kzz;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56548yJl;
import o.InterfaceC27701kAd;
import o.jNN;
import o.jNY;
import o.jVY;
import o.kKG;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TraderViewModel extends ViewModel {
    public final jNN AEQbTJ;
    public final CoroutineDispatcher AYXKKw;
    public final C28586kda AhwBna;
    public final TraderFragmentParams AkhnZx;
    public final C29777kzz DbNXlk;
    public final MutableStateFlow<List<C26211jWa>> EZpvd;
    public final MutableStateFlow<C27721kAx> KWHzl;
    public final MutableLiveData<Boolean> OLrzqt;
    public final MutableStateFlow<InterfaceC27701kAd> copydefault;
    public final C25624jAh djBIcL;
    public final kKG ejfBZ;
    public String fARcdN;
    public List<Traders> fetchVPNInfo;
    public jNY gEmmrt;
    public Map<String, Integer> isConnected;
    public final jVY valueOf;
    public final StateFlow<InterfaceC27701kAd> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jNY OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC27701kAd> valueOf() {
        return this.values;
    }

    @yCM
    public TraderViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C25624jAh c25624jAh, @NotNull C29777kzz c29777kzz, @NotNull C28586kda c28586kda, @NotNull jVY jvy, @NotNull jNN jnn, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c25624jAh, "");
        Intrinsics.checkNotNullParameter(c29777kzz, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(jvy, "");
        Intrinsics.checkNotNullParameter(jnn, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.djBIcL = c25624jAh;
        this.DbNXlk = c29777kzz;
        this.AhwBna = c28586kda;
        this.valueOf = jvy;
        this.AEQbTJ = jnn;
        this.ejfBZ = kkg;
        this.AYXKKw = coroutineDispatcher;
        TraderFragmentParams traderFragmentParams = (TraderFragmentParams) savedStateHandle.get("key.trader_params");
        this.AkhnZx = traderFragmentParams == null ? new TraderFragmentParams(null, null, null, null, null, false, null, null, 255, null) : traderFragmentParams;
        this.KWHzl = StateFlowKt.MutableStateFlow(new C27721kAx(null, null, null, false, 15, null));
        this.OLrzqt = new MutableLiveData<>(Boolean.FALSE);
        MutableStateFlow<InterfaceC27701kAd> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC27701kAd.Activity.OLrzqt);
        this.copydefault = MutableStateFlow;
        this.values = FlowKt.asStateFlow(MutableStateFlow);
        this.EZpvd = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.fARcdN = "";
        this.isConnected = C56424yEw.KWHzl();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(null), 3, null);
    }

    public final StateFlow<C27721kAx> gEmmrt() {
        return FlowKt.asStateFlow(this.KWHzl);
    }

    public final StateFlow<List<C26211jWa>> KWHzl() {
        return FlowKt.asStateFlow(this.EZpvd);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.trader.ui.TraderViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            TraderViewModel traderViewModel;
            Object objM7386unboximpl;
            String strEZpvd;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                TraderViewModel traderViewModel2 = TraderViewModel.this;
                C28586kda c28586kda = traderViewModel2.AhwBna;
                this.L$0 = traderViewModel2;
                this.label = 1;
                Object objOLrzqt = c28586kda.OLrzqt(this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                traderViewModel = traderViewModel2;
                objM7386unboximpl = objOLrzqt;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                traderViewModel = (TraderViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            DexUserIdentity dexUserIdentity = (DexUserIdentity) objM7386unboximpl;
            if (dexUserIdentity == null || (strEZpvd = dexUserIdentity.EZpvd()) == null) {
                strEZpvd = "";
            }
            traderViewModel.fARcdN = strEZpvd;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.trader.ui.TraderViewModel$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderViewModel.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                TraderViewModel traderViewModel = TraderViewModel.this;
                traderViewModel.AEQbTJ(traderViewModel.AkhnZx.OLrzqt());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ void updateFilter$default(TraderViewModel traderViewModel, C26211jWa c26211jWa, TraderPnLFilter traderPnLFilter, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            c26211jWa = traderViewModel.gEmmrt().getValue().KWHzl();
        }
        if ((i & 2) != 0) {
            traderPnLFilter = traderViewModel.gEmmrt().getValue().AEQbTJ();
        }
        if ((i & 4) != 0) {
            str = traderViewModel.gEmmrt().getValue().EZpvd();
        }
        if ((i & 8) != 0) {
            z = traderViewModel.gEmmrt().getValue().OLrzqt();
        }
        traderViewModel.AEQbTJ(c26211jWa, traderPnLFilter, str, z);
    }

    public final void AEQbTJ(@NotNull C26211jWa c26211jWa, @NotNull TraderPnLFilter traderPnLFilter, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(c26211jWa, "");
        Intrinsics.checkNotNullParameter(traderPnLFilter, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd(c26211jWa, gEmmrt().getValue().KWHzl()) && Intrinsics.EZpvd((Object) str, (Object) gEmmrt().getValue().EZpvd()) && C33129mqd.KWHzl((Collection) this.fetchVPNInfo)) {
            this.KWHzl.setValue(C27721kAx.copy$default(gEmmrt().getValue(), null, traderPnLFilter, null, z, 5, null));
            copydefault();
        } else {
            this.KWHzl.setValue(new C27721kAx(c26211jWa, traderPnLFilter, str, z));
            djBIcL();
        }
    }

    public final void copydefault() {
        C29777kzz c29777kzz = this.DbNXlk;
        List<Traders> listAhwBna = this.fetchVPNInfo;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        List<Traders> listCopydefault = c29777kzz.copydefault(listAhwBna, gEmmrt().getValue());
        if (this.isConnected.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listCopydefault, 10)), 16));
            for (Traders traders : listCopydefault) {
                linkedHashMap.put(traders.isConnected(), Integer.valueOf(traders.EZpvd()));
            }
            this.isConnected = linkedHashMap;
        }
        MutableStateFlow<InterfaceC27701kAd> mutableStateFlow = this.copydefault;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        for (Traders tradersCopydefault : listCopydefault) {
            if (listCopydefault.size() != this.isConnected.size()) {
                Integer num = this.isConnected.get(tradersCopydefault.isConnected());
                tradersCopydefault = tradersCopydefault.copydefault((16382 & 1) != 0 ? tradersCopydefault.OLrzqt : num != null ? num.intValue() : 101, (16382 & 2) != 0 ? tradersCopydefault.EZpvd : null, (16382 & 4) != 0 ? tradersCopydefault.AhwBna : null, (16382 & 8) != 0 ? tradersCopydefault.DbNXlk : null, (16382 & 16) != 0 ? tradersCopydefault.AYXKKw : null, (16382 & 32) != 0 ? tradersCopydefault.copydefault : null, (16382 & 64) != 0 ? tradersCopydefault.valueOf : null, (16382 & 128) != 0 ? tradersCopydefault.isConnected : null, (16382 & 256) != 0 ? tradersCopydefault.gEmmrt : null, (16382 & 512) != 0 ? tradersCopydefault.djBIcL : null, (16382 & 1024) != 0 ? tradersCopydefault.fetchVPNInfo : null, (16382 & 2048) != 0 ? tradersCopydefault.values : null, (16382 & 4096) != 0 ? tradersCopydefault.AEQbTJ : null, (16382 & 8192) != 0 ? tradersCopydefault.KWHzl : null);
            }
            arrayList.add(tradersCopydefault);
        }
        mutableStateFlow.setValue(new InterfaceC27701kAd.Application(arrayList));
    }

    public final void AkhnZx() {
        updateFilter$default(this, new C26211jWa(0, null, null, 7, null), TraderPnLFilter.TOTAL, "", false, 8, null);
        this.copydefault.setValue(InterfaceC27701kAd.TaskDescription.KWHzl);
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TraderViewModel$getTagFilter$1(this, null), 3, null);
    }

    public final void KWHzl(boolean z) {
        this.OLrzqt.setValue(Boolean.valueOf(z));
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new TraderViewModel$updateTokenDisplay$1(this, z, null), 2, null);
    }

    public final void AEQbTJ() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new TraderViewModel$getTokenDisplay$1(this, null), 2, null);
    }

    public final void djBIcL() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TraderViewModel$getTraders$1(this, null), 3, null);
    }

    public final String AYXKKw() {
        return this.ejfBZ.OLrzqt();
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TraderViewModel$getNativeTokenPrice$1(this, str, null), 3, null);
    }

    public final void DbNXlk() {
        if (this.fetchVPNInfo == null) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TraderViewModel$subscribe$1(this, null), 3, null);
    }

    public final void fetchVPNInfo() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TraderViewModel$unsubscribe$1(this, null), 3, null);
    }
}
