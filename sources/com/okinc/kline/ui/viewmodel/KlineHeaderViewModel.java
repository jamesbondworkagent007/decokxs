package com.okinc.kline.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC49411unz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC40387qTz;
import o.pCV;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class KlineHeaderViewModel extends AbstractC49411unz<pCV> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public MutableSharedFlow<Boolean> AEQbTJ;
    public MarketCoinInfo AYXKKw;
    public boolean AhwBna;
    public final MutableLiveData<Boolean> AkhnZx;
    public final InterfaceC40387qTz DbNXlk;
    public final SharedFlow<Boolean> EZpvd;
    public MutableSharedFlow<Boolean> KWHzl;
    public MutableSharedFlow<Boolean> OLrzqt;
    public boolean djBIcL;
    public final SavedStateHandle fetchVPNInfo;
    public final SharedFlow<Boolean> gEmmrt;
    public final MutableLiveData<Boolean> isConnected;
    public final SharedFlow<Boolean> valueOf;
    public final MutableLiveData<Boolean> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC40387qTz AEQbTJ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull MarketCoinInfo marketCoinInfo) {
        Intrinsics.checkNotNullParameter(marketCoinInfo, "");
        this.AYXKKw = marketCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> KWHzl() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> OLrzqt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketCoinInfo copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> valueOf() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> values() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public KlineHeaderViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC40387qTz interfaceC40387qTz) {
        super(new pCV(null, 1, null));
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(interfaceC40387qTz, "");
        this.fetchVPNInfo = savedStateHandle;
        this.DbNXlk = interfaceC40387qTz;
        this.AYXKKw = new MarketCoinInfo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        this.AhwBna = true;
        this.djBIcL = !SPUtils.getBoolean("kline_layout_style_default", true);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.EZpvd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default2;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default3;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        this.values = new MutableLiveData<>();
        this.AkhnZx = new MutableLiveData<>();
        this.isConnected = new MutableLiveData<>();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.ui.viewmodel.KlineHeaderViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final boolean AhwBna() {
        Boolean bool = (Boolean) this.fetchVPNInfo.get("is_all");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        KlineHeaderViewModel$initWatchList$1 klineHeaderViewModel$initWatchList$1;
        Object objM7377constructorimpl;
        if (continuation instanceof KlineHeaderViewModel$initWatchList$1) {
            klineHeaderViewModel$initWatchList$1 = (KlineHeaderViewModel$initWatchList$1) continuation;
            int i = klineHeaderViewModel$initWatchList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                klineHeaderViewModel$initWatchList$1.label = i - Integer.MIN_VALUE;
            } else {
                klineHeaderViewModel$initWatchList$1 = new KlineHeaderViewModel$initWatchList$1(this, continuation);
            }
        }
        Object obj = klineHeaderViewModel$initWatchList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = klineHeaderViewModel$initWatchList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                InterfaceC40387qTz interfaceC40387qTz = this.DbNXlk;
                klineHeaderViewModel$initWatchList$1.label = 1;
                if (InterfaceC40387qTz.Activity.initWatchList$default(interfaceC40387qTz, false, klineHeaderViewModel$initWatchList$1, 1, null) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("KlineHeaderViewModel", "initWatchList failed: " + thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KlineHeaderViewModel$queryIsWatching$1(this, watchListData, null), 3, null);
    }

    public final void EZpvd(@NotNull WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KlineHeaderViewModel$addToWatchingList$1(this, watchListData, null), 3, null);
    }

    public final void copydefault(@NotNull WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KlineHeaderViewModel$deleteFromWatchingList$1(this, watchListData, null), 3, null);
    }

    public final void copydefault(@NotNull WatchListData watchListData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KlineHeaderViewModel$addToWatchListInMoreTrade$1(this, watchListData, str, null), 3, null);
    }

    public final void AEQbTJ(@NotNull WatchListData watchListData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KlineHeaderViewModel$deleteFromWatchingListInMoreTrade$1(this, watchListData, str, null), 3, null);
    }
}
