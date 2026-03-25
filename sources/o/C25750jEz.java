package o;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityWsParam;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressSourceResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendDetailRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendWsParam;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTrader;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerUseCase$getActivityData$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerUseCase$getActivityDatagIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerUseCase$getAddressSourceList$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerUseCase$getAddressSourceListgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerUseCase$getMarketChainList$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerUseCase$getTrendData$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerUseCase$getTrendDatagIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerUseCase$getTrendDetail$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerUseCase$getTrendDetailgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerUseCase$subscribeActivity$2;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerUseCase$subscribeSMActivity$2;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerUseCase$subscribeTrend$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jEz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25750jEz {
    public final CoroutineDispatcher AEQbTJ;
    public final C25983jNp EZpvd;
    public final jEA KWHzl;

    @yCM
    public C25750jEz(@NotNull jEA jea, @NotNull C25983jNp c25983jNp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(jea, "");
        Intrinsics.checkNotNullParameter(c25983jNp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = jea;
        this.EZpvd = c25983jNp;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull TrackerActivityRequest trackerActivityRequest, @NotNull Continuation<? super Result<? extends java.util.List<TrackerActivityResponse>>> continuation) {
        TrackerUseCase$getActivityData$1 trackerUseCase$getActivityData$1;
        if (continuation instanceof TrackerUseCase$getActivityData$1) {
            trackerUseCase$getActivityData$1 = (TrackerUseCase$getActivityData$1) continuation;
            int i = trackerUseCase$getActivityData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerUseCase$getActivityData$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerUseCase$getActivityData$1 = new TrackerUseCase$getActivityData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trackerUseCase$getActivityData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerUseCase$getActivityData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            TrackerUseCase$getActivityDatagIAlus$$inlined$dexRunCatching$1 trackerUseCase$getActivityDatagIAlus$$inlined$dexRunCatching$1 = new TrackerUseCase$getActivityDatagIAlus$$inlined$dexRunCatching$1(null, this, trackerActivityRequest);
            trackerUseCase$getActivityData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackerUseCase$getActivityDatagIAlus$$inlined$dexRunCatching$1, trackerUseCase$getActivityData$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Result<TrackerAddressSourceResponse>> continuation) {
        TrackerUseCase$getAddressSourceList$1 trackerUseCase$getAddressSourceList$1;
        if (continuation instanceof TrackerUseCase$getAddressSourceList$1) {
            trackerUseCase$getAddressSourceList$1 = (TrackerUseCase$getAddressSourceList$1) continuation;
            int i = trackerUseCase$getAddressSourceList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerUseCase$getAddressSourceList$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerUseCase$getAddressSourceList$1 = new TrackerUseCase$getAddressSourceList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trackerUseCase$getAddressSourceList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerUseCase$getAddressSourceList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            TrackerUseCase$getAddressSourceListgIAlus$$inlined$dexRunCatching$1 trackerUseCase$getAddressSourceListgIAlus$$inlined$dexRunCatching$1 = new TrackerUseCase$getAddressSourceListgIAlus$$inlined$dexRunCatching$1(null, this, str);
            trackerUseCase$getAddressSourceList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackerUseCase$getAddressSourceListgIAlus$$inlined$dexRunCatching$1, trackerUseCase$getAddressSourceList$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.util.List<MarketChainBean>> continuation) throws java.lang.Throwable {
        TrackerUseCase$getMarketChainList$1 trackerUseCase$getMarketChainList$1;
        C25750jEz c25750jEz;
        if (continuation instanceof TrackerUseCase$getMarketChainList$1) {
            trackerUseCase$getMarketChainList$1 = (TrackerUseCase$getMarketChainList$1) continuation;
            int i = trackerUseCase$getMarketChainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerUseCase$getMarketChainList$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerUseCase$getMarketChainList$1 = new TrackerUseCase$getMarketChainList$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = trackerUseCase$getMarketChainList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerUseCase$getMarketChainList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C25983jNp c25983jNp = this.EZpvd;
            trackerUseCase$getMarketChainList$1.L$0 = this;
            trackerUseCase$getMarketChainList$1.label = 1;
            if (c25983jNp.OLrzqt(trackerUseCase$getMarketChainList$1) == objCopydefault) {
                return objCopydefault;
            }
            c25750jEz = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objKWHzl);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c25750jEz = (C25750jEz) trackerUseCase$getMarketChainList$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            ((Result) objKWHzl).m7386unboximpl();
        }
        C25983jNp c25983jNp2 = c25750jEz.EZpvd;
        trackerUseCase$getMarketChainList$1.L$0 = null;
        trackerUseCase$getMarketChainList$1.label = 2;
        objKWHzl = c25983jNp2.KWHzl(trackerUseCase$getMarketChainList$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull TrackerTrendRequest trackerTrendRequest, @NotNull Continuation<? super Result<TrackerTrendResponse>> continuation) {
        TrackerUseCase$getTrendData$1 trackerUseCase$getTrendData$1;
        if (continuation instanceof TrackerUseCase$getTrendData$1) {
            trackerUseCase$getTrendData$1 = (TrackerUseCase$getTrendData$1) continuation;
            int i = trackerUseCase$getTrendData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerUseCase$getTrendData$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerUseCase$getTrendData$1 = new TrackerUseCase$getTrendData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trackerUseCase$getTrendData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerUseCase$getTrendData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            TrackerUseCase$getTrendDatagIAlus$$inlined$dexRunCatching$1 trackerUseCase$getTrendDatagIAlus$$inlined$dexRunCatching$1 = new TrackerUseCase$getTrendDatagIAlus$$inlined$dexRunCatching$1(null, this, trackerTrendRequest);
            trackerUseCase$getTrendData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackerUseCase$getTrendDatagIAlus$$inlined$dexRunCatching$1, trackerUseCase$getTrendData$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull TrackerTrendDetailRequest trackerTrendDetailRequest, @NotNull Continuation<? super Result<? extends java.util.List<TrendTrader>>> continuation) {
        TrackerUseCase$getTrendDetail$1 trackerUseCase$getTrendDetail$1;
        if (continuation instanceof TrackerUseCase$getTrendDetail$1) {
            trackerUseCase$getTrendDetail$1 = (TrackerUseCase$getTrendDetail$1) continuation;
            int i = trackerUseCase$getTrendDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerUseCase$getTrendDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerUseCase$getTrendDetail$1 = new TrackerUseCase$getTrendDetail$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = trackerUseCase$getTrendDetail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerUseCase$getTrendDetail$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            TrackerUseCase$getTrendDetailgIAlus$$inlined$dexRunCatching$1 trackerUseCase$getTrendDetailgIAlus$$inlined$dexRunCatching$1 = new TrackerUseCase$getTrendDetailgIAlus$$inlined$dexRunCatching$1(null, this, trackerTrendDetailRequest);
            trackerUseCase$getTrendDetail$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, trackerUseCase$getTrendDetailgIAlus$$inlined$dexRunCatching$1, trackerUseCase$getTrendDetail$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final java.lang.Object AEQbTJ(@NotNull TrackerTrendWsParam trackerTrendWsParam, @NotNull Continuation<? super Flow<TrackerTrendResponse>> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new TrackerUseCase$subscribeTrend$2(this, trackerTrendWsParam, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull TrackerActivityWsParam trackerActivityWsParam, @NotNull Continuation<? super Flow<? extends java.util.List<TrackerActivityResponse>>> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new TrackerUseCase$subscribeActivity$2(this, trackerActivityWsParam, null), continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Flow<? extends java.util.List<TrackerActivityResponse>>> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new TrackerUseCase$subscribeSMActivity$2(this, null), continuation);
    }

    public final void KWHzl() {
        this.KWHzl.copydefault();
    }

    public final void AEQbTJ() {
        this.KWHzl.OLrzqt();
    }

    public final void copydefault() {
        this.KWHzl.EZpvd();
    }
}
