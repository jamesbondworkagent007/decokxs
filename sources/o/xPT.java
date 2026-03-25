package o;

import androidx.lifecycle.MutableLiveData;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.market.watch.database.MarketFavDataBase;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BizResp;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import com.okinc.unify_trade.trade.source.DataBaseWatchImpl$1;
import com.okinc.unify_trade.trade.source.DataBaseWatchImpl$loadWatchList$1;
import com.okinc.unify_trade.trade.source.DataBaseWatchImpl$loadWatchList$2;
import com.okinc.unify_trade.trade.source.DataBaseWatchImpl$queryLocalWatch$1;
import com.okinc.unify_trade.trade.source.DataBaseWatchImpl$replaceWatchListData$1;
import com.okinc.unify_trade.trade.source.DataBaseWatchImpl$setWatchList$1;
import com.okinc.unify_trade.trade.source.DataBaseWatchImpl$setWatchList$2;
import com.okinc.unify_trade.trade.source.DataBaseWatchImpl$syncWatchToLocal$1;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xPT implements xPY {
    public boolean AEQbTJ;
    public Function0<Unit> EZpvd;
    public final CoroutineScope KWHzl;
    public final MarketFavDataBase OLrzqt;
    public final ConcurrentHashMap<java.lang.String, WatchListData> copydefault = new ConcurrentHashMap<>();
    public java.util.ArrayList<WatchListData> djBIcL;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<WatchListData> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.util.ArrayList<WatchListData> arrayList) {
        this.djBIcL = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public void OLrzqt(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public void OLrzqt(boolean z) {
        this.AEQbTJ = z;
    }

    public xPT() {
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)));
        this.KWHzl = CoroutineScope;
        this.OLrzqt = MarketFavDataBase.TaskDescription.instance$default(MarketFavDataBase.Companion, null, 1, null);
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.xPV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xPT.valueOf(this.KWHzl);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new DataBaseWatchImpl$1(this, null), 3, null);
        this.AEQbTJ = true;
    }

    public final qWN copydefault() {
        return (qWN) this.valueOf.getValue();
    }

    public static final qWN valueOf(xPT xpt) {
        return new qWN(qWO.Companion.copydefault(xpt.OLrzqt));
    }

    @Override // o.InterfaceC54647xQc
    public void AEQbTJ(@NotNull BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        pUU.KWHzl("MarketWatchHelper", "addWatchList() called with: info = " + bizInstrument.getInstId());
        if (OLrzqt(bizInstrument)) {
            pUU.KWHzl("MarketWatchHelper", "check fail");
            if (mutableLiveData != null) {
                mutableLiveData.postValue(new BizResp(false, ""));
                return;
            }
            return;
        }
        KWHzl("0", bizInstrument, mutableLiveData);
    }

    @Override // o.InterfaceC54647xQc
    public void OLrzqt(@NotNull WatchListData watchListData, MutableLiveData<BizResp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        pUU.KWHzl("MarketWatchHelper", "addWatchList() called with: info = " + watchListData.getInstId());
        if (EZpvd(watchListData)) {
            pUU.KWHzl("MarketWatchHelper", "check fail");
            if (mutableLiveData != null) {
                mutableLiveData.postValue(new BizResp(false, ""));
                return;
            }
            return;
        }
        copydefault("0", watchListData, mutableLiveData);
    }

    @Override // o.InterfaceC54647xQc
    public void AEQbTJ(@NotNull BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData, boolean z) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        pUU.KWHzl("MarketWatchHelper", "removeWatchList() called with: info = " + bizInstrument.getInstId());
        if (z && !OLrzqt(bizInstrument)) {
            pUU.KWHzl("MarketWatchHelper", "check fail");
            if (mutableLiveData != null) {
                mutableLiveData.postValue(new BizResp(false, ""));
                return;
            }
            return;
        }
        KWHzl("1", bizInstrument, mutableLiveData);
    }

    @Override // o.InterfaceC54647xQc
    public void OLrzqt(@NotNull WatchListData watchListData, MutableLiveData<BizResp> mutableLiveData, boolean z) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        pUU.KWHzl("MarketWatchHelper", "removeWatchList() called with: info = " + watchListData.getInstId());
        if (z && !EZpvd(watchListData)) {
            pUU.KWHzl("MarketWatchHelper", "check fail");
            if (mutableLiveData != null) {
                mutableLiveData.postValue(new BizResp(false, ""));
                return;
            }
            return;
        }
        copydefault("1", watchListData, mutableLiveData);
    }

    @Override // o.InterfaceC54647xQc
    public void copydefault(@NotNull BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        KWHzl("2", bizInstrument, mutableLiveData);
    }

    public void KWHzl(@NotNull java.lang.String str, @NotNull BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        BuildersKt__Builders_commonKt.launch$default(this.KWHzl, null, null, new DataBaseWatchImpl$setWatchList$1(str, this, bizInstrument, mutableLiveData, null), 3, null);
    }

    public void copydefault(@NotNull java.lang.String str, @NotNull WatchListData watchListData, MutableLiveData<BizResp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(watchListData, "");
        BuildersKt__Builders_commonKt.launch$default(this.KWHzl, null, null, new DataBaseWatchImpl$setWatchList$2(str, this, watchListData, mutableLiveData, null), 3, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pVZ.safeLaunch$default(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart, kotlin.jvm.functions.Function2, int, java.lang.Object):kotlinx.coroutines.Job */
    @Override // o.InterfaceC54647xQc
    public void AEQbTJ(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(this.KWHzl, null, null, new DataBaseWatchImpl$loadWatchList$1(this, function1, null), 3, null);
        pVZ.safeLaunch$default(this.KWHzl, Dispatchers.getDefault(), null, new DataBaseWatchImpl$loadWatchList$2(null), 2, null);
        if (C55608xnE.isLogin$default(null, 1, null)) {
            new C54452xIy().OLrzqt(new Application());
        }
    }

    public static final class Application implements InterfaceC55701xos<java.util.List<? extends ChargeGroupData>> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* bridge */ /* synthetic */ void EZpvd(boolean z, java.util.List<? extends ChargeGroupData> list, java.lang.Exception exc) {
            EZpvd2(z, (java.util.List<ChargeGroupData>) list, exc);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(boolean z, java.util.List<ChargeGroupData> list, java.lang.Exception exc) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            if (!z || list == null || (interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt()) == null) {
                return;
            }
            interfaceC54581xNrOLrzqt.KWHzl(list);
        }
    }

    @Override // o.InterfaceC54647xQc
    public boolean OLrzqt(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        java.lang.String instType = bizInstrument.getInstType();
        xUV xuv = xUV.EZpvd;
        java.lang.String strKWHzl = xuv.KWHzl(bizInstrument);
        java.lang.String strCopydefault = xuv.copydefault(bizInstrument);
        return AEQbTJ(instType, strKWHzl, strCopydefault != null ? strCopydefault : "") != null;
    }

    @Override // o.InterfaceC54647xQc
    public boolean EZpvd(@NotNull WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        return AEQbTJ(watchListData.getInstType(), watchListData.getInstId(), watchListData.getAlias()) != null;
    }

    @Override // o.InterfaceC54647xQc
    public boolean OLrzqt(@NotNull java.lang.String str, @NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        xUV xuv = xUV.EZpvd;
        java.lang.String strKWHzl = xuv.KWHzl(bizInstrument);
        java.lang.String strCopydefault = xuv.copydefault(bizInstrument);
        return AEQbTJ(str, strKWHzl, strCopydefault != null ? strCopydefault : "") != null;
    }

    @Override // o.InterfaceC54647xQc
    public java.util.ArrayList<WatchListData> AEQbTJ(@NotNull java.util.List<WatchListData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        pUU.KWHzl("MarketWatchHelper", "convertWatchListData() called with: list = " + list.size());
        this.copydefault.clear();
        java.util.ArrayList<WatchListData> arrayList = new java.util.ArrayList<>();
        for (WatchListData watchListData : list) {
            WatchListData watchListData2 = new WatchListData(watchListData.getAlias(), watchListData.getExpTime(), watchListData.getInstId(), watchListData.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null);
            arrayList.add(watchListData2);
            AEQbTJ(watchListData2);
        }
        return arrayList;
    }

    public WatchListData AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return this.copydefault.get(str + "-" + str2 + "-" + str3);
    }

    @Override // o.InterfaceC54647xQc
    public void AEQbTJ(@NotNull WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        this.copydefault.put(watchListData.getInstType() + "-" + watchListData.getInstId() + "-" + watchListData.getAlias(), watchListData);
    }

    @Override // o.InterfaceC54647xQc
    public void bH_() {
        this.EZpvd = null;
        CoroutineScopeKt.cancel$default(this.KWHzl, null, 1, null);
    }

    @Override // o.InterfaceC54647xQc
    public boolean bI_() {
        return CoroutineScopeKt.isActive(this.KWHzl);
    }

    @Override // o.xPY
    public void EZpvd(@NotNull java.util.List<C40453qWk> list) {
        Intrinsics.checkNotNullParameter(list, "");
        pVZ.safeLaunch$default(this.KWHzl, null, null, new DataBaseWatchImpl$syncWatchToLocal$1(this, list, null), 3, null);
    }

    @Override // o.xPY
    public void KWHzl(@NotNull Function1<? super java.util.List<WatchListData>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.ArrayList<WatchListData> arrayList = this.djBIcL;
        java.util.ArrayList arrayList2 = arrayList != null ? new java.util.ArrayList(arrayList) : null;
        if (arrayList2 == null) {
            BuildersKt__Builders_commonKt.launch$default(this.KWHzl, null, null, new DataBaseWatchImpl$queryLocalWatch$1(function1, this, null), 3, null);
        } else {
            function1.invoke(arrayList2);
        }
    }

    @Override // o.xPY
    public void copydefault(@NotNull java.util.List<WatchListData> list, @NotNull Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pVZ.safeLaunch$default(this.KWHzl, null, null, new DataBaseWatchImpl$replaceWatchListData$1(this, list, function1, null), 3, null);
    }
}
