package com.okinc.business.market.features.address_tracker_sa.ui.tracker;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.data.constant.AddressTrackerUserAction;
import com.okinc.business.market.data.model.common.ProtocolInfoData;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressGroup;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressLabel;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressSourceResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendDetailRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendRequest;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTrader;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import com.okinc.business.market.features.meme.ui.MemePumpUseCase;
import com.okinc.core.util.SPUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C23274hvD;
import o.C25389ivm;
import o.C25746jEv;
import o.C25750jEz;
import o.C27634jyr;
import o.C28586kda;
import o.C31200lpY;
import o.C33070mpX;
import o.C33129mqd;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.jAH;
import o.jDG;
import o.jDZ;
import o.jEB;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerViewModel extends ViewModel {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public MutableStateFlow<TrackerAddressSourceResponse> AEQbTJ;
    public MutableStateFlow<List<String>> AYXKKw;
    public TrackerTxnListFilter AhwBna;
    public final MutableStateFlow<jDZ> AkhnZx;
    public final C28586kda AuCTel;
    public Job AuCTelauCTel;
    public List<ProtocolInfoData> AubY;
    public Job AwvSrB;
    public final StateFlow<TrackerTrendUIModel> AxsJAY;
    public Job DbNXlk;
    public MutableStateFlow<TrackerTxnListFilter> KWHzl;
    public TrackerTxnListFilter OLrzqt;
    public final StateFlow<jDZ> ORxRYg;
    public MutableSharedFlow<Boolean> copydefault;
    public final MutableStateFlow<Integer> djBIcL;
    public final jAH ejfBZ;
    public final C27634jyr fARcdN;
    public final CoroutineDispatcher fIwbmz;
    public final StateFlow<TrackerTxnListFilter> fJNWhG;
    public List<MarketChainBean> fetchVPNInfo;
    public final MutableStateFlow<TrackerTrendUIModel> gEmmrt;
    public List<String> gHZMYf;
    public final SharedFlow<Boolean> getFieldNames;
    public boolean getNewProxyInstance;
    public boolean hDKMBd;
    public final StateFlow<TrackerAddressSourceResponse> isConnected;
    public List<String> iwGUEr;
    public final C25750jEz sSMYrx;
    public final MemePumpUseCase uzCIH;
    public MutableStateFlow<String> valueOf;
    public final Map<String, TrackingAddressAlias> values;
    public final StateFlow<Integer> wlaJM;
    public final String zLjUOn;
    public StateFlow<? extends List<String>> zsXlph;
    public StateFlow<String> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.getNewProxyInstance = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Integer> AYXKKw() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> AkhnZx() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<jDZ> AuCTel() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.iwGUEr = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> KWHzl() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TrackerTxnListFilter> OLrzqt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TrackerAddressSourceResponse> copydefault() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.gHZMYf = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fIwbmz() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TrackerTrendUIModel> fJNWhG() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlinx.coroutines.flow.StateFlow<? extends java.util.List<java.lang.String>>, kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> */
    public final StateFlow<List<String>> gEmmrt() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> valueOf() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> values() {
        return this.gHZMYf;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @yCM
    public TrackerViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C25750jEz c25750jEz, @NotNull jAH jah, @NotNull C28586kda c28586kda, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C27634jyr c27634jyr, @NotNull MemePumpUseCase memePumpUseCase) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c25750jEz, "");
        Intrinsics.checkNotNullParameter(jah, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c27634jyr, "");
        Intrinsics.checkNotNullParameter(memePumpUseCase, "");
        this.sSMYrx = c25750jEz;
        this.ejfBZ = jah;
        this.AuCTel = c28586kda;
        this.fIwbmz = coroutineDispatcher;
        this.fARcdN = c27634jyr;
        this.uzCIH = memePumpUseCase;
        this.zLjUOn = C31200lpY.getSourceType$default(savedStateHandle, (String) null, 1, (Object) null);
        MutableStateFlow<jDZ> MutableStateFlow = StateFlowKt.MutableStateFlow(jDZ.ActionBar.KWHzl);
        this.AkhnZx = MutableStateFlow;
        this.ORxRYg = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Integer.valueOf(iwGUEr()));
        this.djBIcL = MutableStateFlow2;
        this.wlaJM = FlowKt.asStateFlow(MutableStateFlow2);
        this.values = new LinkedHashMap();
        this.OLrzqt = new TrackerTxnListFilter(true, null, null, null, null, null, null, null, null, null, 1022, null);
        this.AhwBna = new TrackerTxnListFilter(false, null, null, null, null, null, null, null, null, null, 1022, null);
        MutableStateFlow<TrackerTxnListFilter> MutableStateFlow3 = StateFlowKt.MutableStateFlow(this.OLrzqt);
        this.KWHzl = MutableStateFlow3;
        this.fJNWhG = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<TrackerAddressSourceResponse> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow4;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow4);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.getFieldNames = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.fetchVPNInfo = yDY.AhwBna();
        this.gHZMYf = yDY.AhwBna();
        this.iwGUEr = yDY.AhwBna();
        MutableStateFlow<List<String>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AYXKKw = MutableStateFlow5;
        this.zsXlph = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<String> MutableStateFlow6 = StateFlowKt.MutableStateFlow(hDKMBd());
        this.valueOf = MutableStateFlow6;
        this.zuBGHE = FlowKt.asStateFlow(MutableStateFlow6);
        this.hDKMBd = uzCIH();
        this.AubY = yDY.AhwBna();
        MutableStateFlow<TrackerTrendUIModel> MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this.gEmmrt = MutableStateFlow7;
        this.AxsJAY = FlowKt.asStateFlow(MutableStateFlow7);
    }

    public static /* synthetic */ void loadTrends$default(TrackerViewModel trackerViewModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        trackerViewModel.KWHzl(z, z2);
    }

    public final void KWHzl(boolean z, boolean z2) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.fIwbmz, null, new TrackerViewModel$loadTrends$1(this, z, z2, null), 2, null);
    }

    /* JADX DEBUG: Type inference failed for r1v5. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerViewModel] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerViewModel] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull TrackerTrendUIModel trackerTrendUIModel, @NotNull Continuation<? super TrackerTrendUIModel> continuation) throws Throwable {
        TrackerViewModel$loadTrendDetail$1 trackerViewModel$loadTrendDetail$1;
        Ref.ObjectRef objectRef;
        C25750jEz c25750jEz;
        Object objKWHzl;
        ?? r11;
        ?? r1;
        Object objCopydefault;
        ?? r8;
        ?? r12;
        ?? r6;
        Object obj;
        ?? r3;
        List<TrendTrader> list;
        ?? r82;
        Throwable thM7380exceptionOrNullimpl;
        ?? r13 = trackerTrendUIModel;
        if (continuation instanceof TrackerViewModel$loadTrendDetail$1) {
            trackerViewModel$loadTrendDetail$1 = (TrackerViewModel$loadTrendDetail$1) continuation;
            int i = trackerViewModel$loadTrendDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerViewModel$loadTrendDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerViewModel$loadTrendDetail$1 = new TrackerViewModel$loadTrendDetail$1(this, continuation);
            }
        }
        Object obj2 = trackerViewModel$loadTrendDetail$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = trackerViewModel$loadTrendDetail$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            objectRef = new Ref.ObjectRef();
            objectRef.element = r13;
            c25750jEz = this.sSMYrx;
            trackerViewModel$loadTrendDetail$1.L$0 = this;
            trackerViewModel$loadTrendDetail$1.L$1 = r13;
            trackerViewModel$loadTrendDetail$1.L$2 = objectRef;
            trackerViewModel$loadTrendDetail$1.L$3 = c25750jEz;
            trackerViewModel$loadTrendDetail$1.label = 1;
            objKWHzl = KWHzl(r13, trackerViewModel$loadTrendDetail$1);
            if (objKWHzl == objCopydefault2) {
                return objCopydefault2;
            }
            r11 = this;
            r1 = r13;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) trackerViewModel$loadTrendDetail$1.L$4;
                    obj = trackerViewModel$loadTrendDetail$1.L$3;
                    objectRef = (Ref.ObjectRef) trackerViewModel$loadTrendDetail$1.L$2;
                    TrackerTrendUIModel trackerTrendUIModel2 = (TrackerTrendUIModel) trackerViewModel$loadTrendDetail$1.L$1;
                    TrackerViewModel trackerViewModel = (TrackerViewModel) trackerViewModel$loadTrendDetail$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    r3 = trackerViewModel;
                    r6 = trackerTrendUIModel2;
                    objectRef.element = r6.copydefault((261119 & 1) != 0 ? r6.AkhnZx : null, (261119 & 2) != 0 ? r6.DbNXlk : null, (261119 & 4) != 0 ? r6.fetchVPNInfo : null, (261119 & 8) != 0 ? r6.values : 0L, (261119 & 16) != 0 ? r6.valueOf : null, (261119 & 32) != 0 ? r6.AhwBna : null, (261119 & 64) != 0 ? r6.djBIcL : 0, (261119 & 128) != 0 ? r6.EZpvd : 0, (261119 & 256) != 0 ? r6.KWHzl : 0, (261119 & 512) != 0 ? r6.fARcdN : null, (261119 & 1024) != 0 ? r6.fJNWhG : C25746jEv.AEQbTJ.OLrzqt(list, (Map) obj2, r3.values), (261119 & 2048) != 0 ? r6.gEmmrt : false, (261119 & 4096) != 0 ? r6.AYXKKw : null, (261119 & 8192) != 0 ? r6.OLrzqt : null, (261119 & 16384) != 0 ? r6.AEQbTJ : null, (261119 & 32768) != 0 ? r6.isConnected : null, (261119 & 65536) != 0 ? r6.copydefault : false, (261119 & 131072) != 0 ? r6.AuCTel : null);
                    r82 = r3;
                    objCopydefault = obj;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                    if (thM7380exceptionOrNullimpl != null) {
                        MutableStateFlow<jDZ> mutableStateFlow = r82.AkhnZx;
                        String message = thM7380exceptionOrNullimpl.getMessage();
                        if (message == null) {
                            message = "Unknown error";
                        }
                        mutableStateFlow.setValue(new jDZ.Application(message));
                    }
                    return objectRef.element;
                }
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) trackerViewModel$loadTrendDetail$1.L$2;
                TrackerTrendUIModel trackerTrendUIModel3 = (TrackerTrendUIModel) trackerViewModel$loadTrendDetail$1.L$1;
                TrackerViewModel trackerViewModel2 = (TrackerViewModel) trackerViewModel$loadTrendDetail$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                objCopydefault = ((Result) obj2).m7386unboximpl();
                objectRef = objectRef2;
                r12 = trackerTrendUIModel3;
                r8 = trackerViewModel2;
                r82 = r8;
                if (Result.m7384isSuccessimpl(objCopydefault)) {
                    List<TrendTrader> list2 = (List) objCopydefault;
                    C27634jyr c27634jyr = r8.fARcdN;
                    trackerViewModel$loadTrendDetail$1.L$0 = r8;
                    trackerViewModel$loadTrendDetail$1.L$1 = r12;
                    trackerViewModel$loadTrendDetail$1.L$2 = objectRef;
                    trackerViewModel$loadTrendDetail$1.L$3 = objCopydefault;
                    trackerViewModel$loadTrendDetail$1.L$4 = list2;
                    trackerViewModel$loadTrendDetail$1.label = 3;
                    Object emojiAddressMapping$default = C27634jyr.getEmojiAddressMapping$default(c27634jyr, false, trackerViewModel$loadTrendDetail$1, 1, null);
                    if (emojiAddressMapping$default == objCopydefault2) {
                        return objCopydefault2;
                    }
                    r6 = r12;
                    obj = objCopydefault;
                    obj2 = emojiAddressMapping$default;
                    r3 = r8;
                    list = list2;
                    objectRef.element = r6.copydefault((261119 & 1) != 0 ? r6.AkhnZx : null, (261119 & 2) != 0 ? r6.DbNXlk : null, (261119 & 4) != 0 ? r6.fetchVPNInfo : null, (261119 & 8) != 0 ? r6.values : 0L, (261119 & 16) != 0 ? r6.valueOf : null, (261119 & 32) != 0 ? r6.AhwBna : null, (261119 & 64) != 0 ? r6.djBIcL : 0, (261119 & 128) != 0 ? r6.EZpvd : 0, (261119 & 256) != 0 ? r6.KWHzl : 0, (261119 & 512) != 0 ? r6.fARcdN : null, (261119 & 1024) != 0 ? r6.fJNWhG : C25746jEv.AEQbTJ.OLrzqt(list, (Map) obj2, r3.values), (261119 & 2048) != 0 ? r6.gEmmrt : false, (261119 & 4096) != 0 ? r6.AYXKKw : null, (261119 & 8192) != 0 ? r6.OLrzqt : null, (261119 & 16384) != 0 ? r6.AEQbTJ : null, (261119 & 32768) != 0 ? r6.isConnected : null, (261119 & 65536) != 0 ? r6.copydefault : false, (261119 & 131072) != 0 ? r6.AuCTel : null);
                    r82 = r3;
                    objCopydefault = obj;
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return objectRef.element;
            }
            C25750jEz c25750jEz2 = (C25750jEz) trackerViewModel$loadTrendDetail$1.L$3;
            objectRef = (Ref.ObjectRef) trackerViewModel$loadTrendDetail$1.L$2;
            TrackerTrendUIModel trackerTrendUIModel4 = (TrackerTrendUIModel) trackerViewModel$loadTrendDetail$1.L$1;
            TrackerViewModel trackerViewModel3 = (TrackerViewModel) trackerViewModel$loadTrendDetail$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            c25750jEz = c25750jEz2;
            r1 = trackerTrendUIModel4;
            objKWHzl = obj2;
            r11 = trackerViewModel3;
        }
        trackerViewModel$loadTrendDetail$1.L$0 = r11;
        trackerViewModel$loadTrendDetail$1.L$1 = r1;
        trackerViewModel$loadTrendDetail$1.L$2 = objectRef;
        trackerViewModel$loadTrendDetail$1.L$3 = null;
        trackerViewModel$loadTrendDetail$1.label = 2;
        objCopydefault = c25750jEz.copydefault((TrackerTrendDetailRequest) objKWHzl, trackerViewModel$loadTrendDetail$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        r8 = r11;
        r12 = r1;
        r82 = r8;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super TrackerTrendRequest> continuation) throws Throwable {
        TrackerViewModel$getTrendRequest$1 trackerViewModel$getTrendRequest$1;
        Object objOLrzqt;
        TrackerViewModel trackerViewModel;
        int i;
        String strMulS$default;
        String strValueOf;
        int i2;
        String str;
        String strValueOf2;
        String str2;
        String str3;
        String strEZpvd;
        if (continuation instanceof TrackerViewModel$getTrendRequest$1) {
            trackerViewModel$getTrendRequest$1 = (TrackerViewModel$getTrendRequest$1) continuation;
            int i3 = trackerViewModel$getTrendRequest$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                trackerViewModel$getTrendRequest$1.label = i3 - Integer.MIN_VALUE;
            } else {
                trackerViewModel$getTrendRequest$1 = new TrackerViewModel$getTrendRequest$1(this, continuation);
            }
        }
        Object obj = trackerViewModel$getTrendRequest$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = trackerViewModel$getTrendRequest$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.AuCTel;
            trackerViewModel$getTrendRequest$1.L$0 = this;
            trackerViewModel$getTrendRequest$1.label = 1;
            objOLrzqt = c28586kda.OLrzqt(trackerViewModel$getTrendRequest$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            trackerViewModel = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            trackerViewModel = (TrackerViewModel) trackerViewModel$getTrendRequest$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        String str4 = (dexUserIdentity == null || (strEZpvd = dexUserIdentity.EZpvd()) == null) ? "" : strEZpvd;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strValueOf3 = trackerViewModel.fJNWhG.getValue().valueOf();
        String value = trackerViewModel.zuBGHE.getValue();
        List<String> list = trackerViewModel.gHZMYf;
        List<String> list2 = trackerViewModel.iwGUEr;
        String strAhwBna = trackerViewModel.fJNWhG.getValue().KWHzl().AhwBna();
        String strKWHzl = trackerViewModel.fJNWhG.getValue().copydefault().KWHzl();
        if (C33129mqd.OLrzqt((CharSequence) strKWHzl)) {
            i = 1000;
            strMulS$default = C33129mqd.mulS$default(strKWHzl, C56443yFo.AEQbTJ(1000), null, null, null, 14, null);
        } else {
            i = 1000;
            strMulS$default = "";
        }
        String strAhwBna2 = trackerViewModel.fJNWhG.getValue().copydefault().AhwBna();
        String strMulS$default2 = C33129mqd.OLrzqt((CharSequence) strAhwBna2) ? C33129mqd.mulS$default(strAhwBna2, C56443yFo.AEQbTJ(i), null, null, null, 14, null) : "";
        String strKWHzl2 = trackerViewModel.fJNWhG.getValue().EZpvd().KWHzl();
        String strMulS$default3 = C33129mqd.OLrzqt((CharSequence) strKWHzl2) ? C33129mqd.mulS$default(strKWHzl2, C56443yFo.AEQbTJ(i), null, null, null, 14, null) : "";
        String strAhwBna3 = trackerViewModel.fJNWhG.getValue().EZpvd().AhwBna();
        String strMulS$default4 = C33129mqd.OLrzqt((CharSequence) strAhwBna3) ? C33129mqd.mulS$default(strAhwBna3, C56443yFo.AEQbTJ(i), null, null, null, 14, null) : "";
        String strKWHzl3 = trackerViewModel.fJNWhG.getValue().djBIcL().KWHzl();
        if (C33129mqd.OLrzqt((CharSequence) strKWHzl3)) {
            strValueOf = "";
            i2 = i;
            str = strValueOf3;
            strValueOf2 = String.valueOf(jCurrentTimeMillis - ((C33129mqd.valueOf(strKWHzl3) * ((long) 60)) * ((long) i2)));
        } else {
            strValueOf = "";
            i2 = i;
            str = strValueOf3;
            strValueOf2 = strValueOf;
        }
        String strAhwBna4 = trackerViewModel.fJNWhG.getValue().djBIcL().AhwBna();
        if (C33129mqd.OLrzqt((CharSequence) strAhwBna4)) {
            str2 = strMulS$default3;
            str3 = strMulS$default4;
            strValueOf = String.valueOf(jCurrentTimeMillis - ((C33129mqd.valueOf(strAhwBna4) * ((long) 60)) * ((long) i2)));
        } else {
            str2 = strMulS$default3;
            str3 = strMulS$default4;
        }
        return new TrackerTrendRequest(str4, str, value, list, list2, strAhwBna, strMulS$default, strMulS$default2, str2, str3, strValueOf2, strValueOf, 1, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull TrackerTrendUIModel trackerTrendUIModel, @NotNull Continuation<? super TrackerTrendDetailRequest> continuation) throws Throwable {
        TrackerViewModel$getTrendDetailRequest$1 trackerViewModel$getTrendDetailRequest$1;
        Object objOLrzqt;
        TrackerViewModel trackerViewModel;
        String strEZpvd;
        if (continuation instanceof TrackerViewModel$getTrendDetailRequest$1) {
            trackerViewModel$getTrendDetailRequest$1 = (TrackerViewModel$getTrendDetailRequest$1) continuation;
            int i = trackerViewModel$getTrendDetailRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerViewModel$getTrendDetailRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerViewModel$getTrendDetailRequest$1 = new TrackerViewModel$getTrendDetailRequest$1(this, continuation);
            }
        }
        Object obj = trackerViewModel$getTrendDetailRequest$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerViewModel$getTrendDetailRequest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.AuCTel;
            trackerViewModel$getTrendDetailRequest$1.L$0 = this;
            trackerViewModel$getTrendDetailRequest$1.L$1 = trackerTrendUIModel;
            trackerViewModel$getTrendDetailRequest$1.label = 1;
            objOLrzqt = c28586kda.OLrzqt(trackerViewModel$getTrendDetailRequest$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            trackerViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            trackerTrendUIModel = (TrackerTrendUIModel) trackerViewModel$getTrendDetailRequest$1.L$1;
            trackerViewModel = (TrackerViewModel) trackerViewModel$getTrendDetailRequest$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        if (dexUserIdentity == null || (strEZpvd = dexUserIdentity.EZpvd()) == null) {
            strEZpvd = "";
        }
        return new TrackerTrendDetailRequest(strEZpvd, trackerTrendUIModel.djBIcL(), trackerTrendUIModel.AEQbTJ(), trackerViewModel.zuBGHE.getValue(), trackerViewModel.gHZMYf, trackerViewModel.iwGUEr, 1, trackerTrendUIModel.copydefault());
    }

    public final void AEQbTJ(int i) {
        this.djBIcL.setValue(Integer.valueOf(i));
        this.KWHzl.setValue(i == 0 ? this.OLrzqt : this.AhwBna);
        OLrzqt(i);
        if (!this.getNewProxyInstance) {
            this.getNewProxyInstance = true;
        } else if (i == 0) {
            loadActivity$default(this, false, 1, null);
        } else {
            if (i != 1) {
                return;
            }
            loadTrends$default(this, false, true, 1, null);
        }
    }

    public static /* synthetic */ void loadActivity$default(TrackerViewModel trackerViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        trackerViewModel.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.fIwbmz, null, new TrackerViewModel$loadActivity$1(this, z, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull Continuation<? super TrackerActivityRequest> continuation) throws Throwable {
        TrackerViewModel$getRequest$1 trackerViewModel$getRequest$1;
        Object objOLrzqt;
        TrackerViewModel trackerViewModel;
        List listAhwBna;
        int i;
        String strMulS$default;
        String str;
        int i2;
        String str2;
        String strValueOf;
        String str3;
        String str4;
        String strValueOf2;
        String strEZpvd;
        if (continuation instanceof TrackerViewModel$getRequest$1) {
            trackerViewModel$getRequest$1 = (TrackerViewModel$getRequest$1) continuation;
            int i3 = trackerViewModel$getRequest$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                trackerViewModel$getRequest$1.label = i3 - Integer.MIN_VALUE;
            } else {
                trackerViewModel$getRequest$1 = new TrackerViewModel$getRequest$1(this, continuation);
            }
        }
        Object obj = trackerViewModel$getRequest$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = trackerViewModel$getRequest$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.AuCTel;
            trackerViewModel$getRequest$1.L$0 = this;
            trackerViewModel$getRequest$1.label = 1;
            objOLrzqt = c28586kda.OLrzqt(trackerViewModel$getRequest$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            trackerViewModel = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            trackerViewModel = (TrackerViewModel) trackerViewModel$getRequest$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        String str5 = (dexUserIdentity == null || (strEZpvd = dexUserIdentity.EZpvd()) == null) ? "" : strEZpvd;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strValueOf3 = trackerViewModel.fJNWhG.getValue().valueOf();
        String value = trackerViewModel.zuBGHE.getValue();
        String strAYXKKw = trackerViewModel.fJNWhG.getValue().AYXKKw();
        if (Intrinsics.EZpvd((Object) strAYXKKw, (Object) "buy")) {
            listAhwBna = yDY.gEmmrt(String.valueOf(AddressTrackerUserAction.BUY.getValue()), String.valueOf(AddressTrackerUserAction.BUY_MORE.getValue()), String.valueOf(AddressTrackerUserAction.NEWLY_HOLD.getValue()));
        } else if (Intrinsics.EZpvd((Object) strAYXKKw, (Object) "sell")) {
            listAhwBna = yDY.gEmmrt(String.valueOf(AddressTrackerUserAction.SELL.getValue()), String.valueOf(AddressTrackerUserAction.SELL_ALL.getValue()), String.valueOf(AddressTrackerUserAction.SELL_PARTIALLY.getValue()));
        } else {
            listAhwBna = yDY.AhwBna();
        }
        List list = listAhwBna;
        List<String> list2 = trackerViewModel.gHZMYf;
        List<String> list3 = trackerViewModel.iwGUEr;
        String strAhwBna = trackerViewModel.fJNWhG.getValue().KWHzl().AhwBna();
        String strKWHzl = trackerViewModel.fJNWhG.getValue().copydefault().KWHzl();
        if (C33129mqd.OLrzqt((CharSequence) strKWHzl)) {
            i = 1000;
            strMulS$default = C33129mqd.mulS$default(strKWHzl, C56443yFo.AEQbTJ(1000), null, null, null, 14, null);
        } else {
            i = 1000;
            strMulS$default = "";
        }
        String strAhwBna2 = trackerViewModel.fJNWhG.getValue().copydefault().AhwBna();
        String strMulS$default2 = C33129mqd.OLrzqt((CharSequence) strAhwBna2) ? C33129mqd.mulS$default(strAhwBna2, C56443yFo.AEQbTJ(i), null, null, null, 14, null) : "";
        String strKWHzl2 = trackerViewModel.fJNWhG.getValue().EZpvd().KWHzl();
        String strMulS$default3 = C33129mqd.OLrzqt((CharSequence) strKWHzl2) ? C33129mqd.mulS$default(strKWHzl2, C56443yFo.AEQbTJ(i), null, null, null, 14, null) : "";
        String strAhwBna3 = trackerViewModel.fJNWhG.getValue().EZpvd().AhwBna();
        String strMulS$default4 = C33129mqd.OLrzqt((CharSequence) strAhwBna3) ? C33129mqd.mulS$default(strAhwBna3, C56443yFo.AEQbTJ(i), null, null, null, 14, null) : "";
        String strKWHzl3 = trackerViewModel.fJNWhG.getValue().AhwBna().KWHzl();
        String strAhwBna4 = trackerViewModel.fJNWhG.getValue().AhwBna().AhwBna();
        String strKWHzl4 = trackerViewModel.fJNWhG.getValue().djBIcL().KWHzl();
        if (C33129mqd.OLrzqt((CharSequence) strKWHzl4)) {
            str = "";
            i2 = i;
            str2 = strValueOf3;
            strValueOf = String.valueOf(jCurrentTimeMillis - ((C33129mqd.valueOf(strKWHzl4) * ((long) 60)) * ((long) i2)));
        } else {
            str = "";
            i2 = i;
            str2 = strValueOf3;
            strValueOf = str;
        }
        String strAhwBna5 = trackerViewModel.fJNWhG.getValue().djBIcL().AhwBna();
        if (C33129mqd.OLrzqt((CharSequence) strAhwBna5)) {
            str3 = strMulS$default2;
            str4 = strMulS$default3;
            strValueOf2 = String.valueOf(jCurrentTimeMillis - ((C33129mqd.valueOf(strAhwBna5) * ((long) 60)) * ((long) i2)));
        } else {
            str3 = strMulS$default2;
            str4 = strMulS$default3;
            strValueOf2 = str;
        }
        return new TrackerActivityRequest(str5, str2, value, list, list2, list3, strAhwBna, strMulS$default, str3, str4, strMulS$default4, strKWHzl3, strAhwBna4, strValueOf, strValueOf2);
    }

    public final void zsXlph() {
        boolean z = !this.hDKMBd;
        this.hDKMBd = z;
        copydefault(z);
        jDZ value = this.ORxRYg.getValue();
        jDZ.StateListAnimator stateListAnimator = value instanceof jDZ.StateListAnimator ? (jDZ.StateListAnimator) value : null;
        if (stateListAnimator != null) {
            ArrayList arrayList = new ArrayList();
            for (jEB jeb : stateListAnimator.AEQbTJ()) {
                arrayList.add(jeb.EZpvd((2145386495 & 1) != 0 ? jeb.AYXKKw : null, (2145386495 & 2) != 0 ? jeb.djBIcL : null, (2145386495 & 4) != 0 ? jeb.isConnected : null, (2145386495 & 8) != 0 ? jeb.AubY : 0L, (2145386495 & 16) != 0 ? jeb.AhwBna : null, (2145386495 & 32) != 0 ? jeb.gEmmrt : null, (2145386495 & 64) != 0 ? jeb.sSMYrx : 0, (2145386495 & 128) != 0 ? jeb.copydefault : null, (2145386495 & 256) != 0 ? jeb.AEQbTJ : null, (2145386495 & 512) != 0 ? jeb.KWHzl : null, (2145386495 & 1024) != 0 ? jeb.valueOf : null, (2145386495 & 2048) != 0 ? jeb.zLjUOn : null, (2145386495 & 4096) != 0 ? jeb.values : null, (2145386495 & 8192) != 0 ? jeb.ejfBZ : null, (2145386495 & 16384) != 0 ? jeb.iwGUEr : 0, (2145386495 & 32768) != 0 ? jeb.fIwbmz : 0, (2145386495 & 65536) != 0 ? jeb.OLrzqt : null, (2145386495 & 131072) != 0 ? jeb.EZpvd : null, (2145386495 & 262144) != 0 ? jeb.getNewProxyInstance : null, (2145386495 & 524288) != 0 ? jeb.uzCIH : 0, (2145386495 & 1048576) != 0 ? jeb.AkhnZx : false, (2145386495 & 2097152) != 0 ? jeb.AuCTel : this.hDKMBd, (2145386495 & 4194304) != 0 ? jeb.zsXlph : null, (2145386495 & 8388608) != 0 ? jeb.getFieldNames : null, (2145386495 & 16777216) != 0 ? jeb.DbNXlk : null, (2145386495 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? jeb.fetchVPNInfo : null, (2145386495 & 67108864) != 0 ? jeb.AuCTelauCTel : null, (2145386495 & 134217728) != 0 ? jeb.hDKMBd : null, (2145386495 & 268435456) != 0 ? jeb.wlaJM : null, (2145386495 & 536870912) != 0 ? jeb.fJNWhG : null, (2145386495 & 1073741824) != 0 ? jeb.fARcdN : null));
            }
            this.AkhnZx.setValue(new jDZ.StateListAnimator(arrayList));
        }
    }

    public final void ejfBZ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerViewModel$loadTag$1(this, null), 3, null);
    }

    public static /* synthetic */ void loadAddressSourceList$default(TrackerViewModel trackerViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        trackerViewModel.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerViewModel$loadAddressSourceList$1(this, z, null), 3, null);
    }

    public final void fARcdN() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerViewModel$loadChainList$1(this, null), 3, null);
    }

    public final String EZpvd() {
        Object next;
        String nativeTokenSymbol;
        if (Intrinsics.EZpvd((Object) this.fJNWhG.getValue().valueOf(), (Object) "all")) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.getSessionID);
        }
        Iterator<T> it = this.fetchVPNInfo.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((MarketChainBean) next).getChainId(), (Object) this.fJNWhG.getValue().valueOf())) {
                break;
            }
        }
        MarketChainBean marketChainBean = (MarketChainBean) next;
        return (marketChainBean == null || (nativeTokenSymbol = marketChainBean.getNativeTokenSymbol()) == null) ? C33070mpX.AYXKKw(C23274hvD.Fragment.getSessionID) : nativeTokenSymbol;
    }

    public final List<jDG> djBIcL() {
        Map mapKWHzl;
        Map<String, List<TrackerAddressLabel>> mapCopydefault;
        TrackerAddressSourceResponse value = this.AEQbTJ.getValue();
        if (value == null || (mapCopydefault = value.copydefault()) == null) {
            mapKWHzl = null;
        } else {
            mapKWHzl = new LinkedHashMap();
            for (Map.Entry<String, List<TrackerAddressLabel>> entry : mapCopydefault.entrySet()) {
                if (Intrinsics.EZpvd((Object) this.fJNWhG.getValue().valueOf(), (Object) "all") || Intrinsics.EZpvd((Object) entry.getKey(), (Object) this.fJNWhG.getValue().valueOf())) {
                    mapKWHzl.put(entry.getKey(), entry.getValue());
                }
            }
        }
        if (mapKWHzl == null) {
            mapKWHzl = C56424yEw.KWHzl();
        }
        List listQOLQEE = C56403yEb.QOLQEE(mapKWHzl.values());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listQOLQEE) {
            TrackerAddressLabel trackerAddressLabel = (TrackerAddressLabel) obj;
            Pair pair = new Pair(trackerAddressLabel.EZpvd(), trackerAddressLabel.AEQbTJ());
            Object arrayList = linkedHashMap.get(pair);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(pair, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Pair pair2 = (Pair) entry2.getKey();
            List list = (List) entry2.getValue();
            String str = (String) pair2.getSecond();
            String str2 = (String) pair2.getFirst();
            Iterator it = list.iterator();
            int iOLrzqt = 0;
            while (it.hasNext()) {
                iOLrzqt += ((TrackerAddressLabel) it.next()).OLrzqt();
            }
            arrayList2.add(new jDG(str, str2, iOLrzqt));
        }
        return arrayList2;
    }

    public static /* synthetic */ void loadCurrentPage$default(TrackerViewModel trackerViewModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        trackerViewModel.EZpvd(z, z2);
    }

    public final void EZpvd(boolean z, boolean z2) {
        if (z) {
            if (this.wlaJM.getValue().intValue() == 0) {
                TrackerTxnListFilter trackerTxnListFilter = new TrackerTxnListFilter(true, null, null, null, null, null, null, null, null, null, 1022, null);
                this.OLrzqt = trackerTxnListFilter;
                this.KWHzl.setValue(trackerTxnListFilter);
            } else {
                TrackerTxnListFilter trackerTxnListFilter2 = new TrackerTxnListFilter(false, null, null, null, null, null, null, null, null, null, 1022, null);
                this.AhwBna = trackerTxnListFilter2;
                this.KWHzl.setValue(trackerTxnListFilter2);
            }
        }
        if (this.wlaJM.getValue().intValue() == 0) {
            OLrzqt(z2);
        } else {
            loadTrends$default(this, z2, false, 2, null);
        }
    }

    public final List<jDG> AhwBna() {
        List<TrackerAddressGroup> listAEQbTJ;
        TrackerAddressSourceResponse value = this.AEQbTJ.getValue();
        if (value == null || (listAEQbTJ = value.AEQbTJ()) == null) {
            return yDY.AhwBna();
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        for (TrackerAddressGroup trackerAddressGroup : listAEQbTJ) {
            arrayList.add(new jDG(String.valueOf(trackerAddressGroup.AEQbTJ()), trackerAddressGroup.copydefault(), trackerAddressGroup.OLrzqt()));
        }
        return arrayList;
    }

    public final void EZpvd(@NotNull TrackerTxnListFilter trackerTxnListFilter) {
        Intrinsics.checkNotNullParameter(trackerTxnListFilter, "");
        if (trackerTxnListFilter.gEmmrt()) {
            this.OLrzqt = trackerTxnListFilter;
            TrackerTxnListFilter trackerTxnListFilter2 = this.AhwBna;
            this.AhwBna = trackerTxnListFilter2.copydefault((1007 & 1) != 0 ? trackerTxnListFilter2.KWHzl : false, (1007 & 2) != 0 ? trackerTxnListFilter2.AYXKKw : null, (1007 & 4) != 0 ? trackerTxnListFilter2.gEmmrt : trackerTxnListFilter.valueOf(), (1007 & 8) != 0 ? trackerTxnListFilter2.EZpvd : null, (1007 & 16) != 0 ? trackerTxnListFilter2.copydefault : null, (1007 & 32) != 0 ? trackerTxnListFilter2.values : null, (1007 & 64) != 0 ? trackerTxnListFilter2.fetchVPNInfo : null, (1007 & 128) != 0 ? trackerTxnListFilter2.AhwBna : null, (1007 & 256) != 0 ? trackerTxnListFilter2.valueOf : null, (1007 & 512) != 0 ? trackerTxnListFilter2.djBIcL : null);
        } else {
            this.AhwBna = trackerTxnListFilter;
            TrackerTxnListFilter trackerTxnListFilter3 = this.OLrzqt;
            this.OLrzqt = trackerTxnListFilter3.copydefault((1007 & 1) != 0 ? trackerTxnListFilter3.KWHzl : false, (1007 & 2) != 0 ? trackerTxnListFilter3.AYXKKw : null, (1007 & 4) != 0 ? trackerTxnListFilter3.gEmmrt : trackerTxnListFilter.valueOf(), (1007 & 8) != 0 ? trackerTxnListFilter3.EZpvd : null, (1007 & 16) != 0 ? trackerTxnListFilter3.copydefault : null, (1007 & 32) != 0 ? trackerTxnListFilter3.values : null, (1007 & 64) != 0 ? trackerTxnListFilter3.fetchVPNInfo : null, (1007 & 128) != 0 ? trackerTxnListFilter3.AhwBna : null, (1007 & 256) != 0 ? trackerTxnListFilter3.valueOf : null, (1007 & 512) != 0 ? trackerTxnListFilter3.djBIcL : null);
        }
        if (Intrinsics.EZpvd(this.KWHzl.getValue(), trackerTxnListFilter)) {
            return;
        }
        this.KWHzl.setValue(trackerTxnListFilter);
        zuBGHE();
        loadCurrentPage$default(this, false, false, 3, null);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.setValue(str);
        KWHzl(str);
        loadCurrentPage$default(this, false, false, 3, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int fetchVPNInfo() {
        String value = this.zuBGHE.getValue();
        switch (value.hashCode()) {
            case 49:
                if (value.equals("1")) {
                    return C23274hvD.Fragment.HrMTQN;
                }
                break;
            case 50:
                if (value.equals("2")) {
                    return C23274hvD.Fragment.HJWChPhFGucI;
                }
                break;
            case 51:
                if (value.equals("3")) {
                    return C23274hvD.Fragment.fzHEvu;
                }
                break;
            case 52:
                if (value.equals("4")) {
                    return C23274hvD.Fragment.xxhdY;
                }
                break;
            case 53:
                value.equals("5");
                break;
        }
        return C23274hvD.Fragment.HJWChPzRXNTw;
    }

    public final void KWHzl(@NotNull List<String> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.iwGUEr = list;
        this.gHZMYf = list2;
        AuCTelauCTel();
        AEQbTJ(this.iwGUEr);
        OLrzqt(this.gHZMYf);
        loadCurrentPage$default(this, false, false, 3, null);
    }

    public final void AuCTelauCTel() {
        List listAhwBna;
        Map<String, List<TrackerAddressLabel>> mapCopydefault;
        Collection<List<TrackerAddressLabel>> collectionValues;
        List listQOLQEE;
        List<TrackerAddressGroup> listAEQbTJ;
        TrackerAddressSourceResponse value = this.isConnected.getValue();
        List listAhwBna2 = null;
        if (value == null || (listAEQbTJ = value.AEQbTJ()) == null) {
            listAhwBna = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listAEQbTJ) {
                if (this.iwGUEr.contains(String.valueOf(((TrackerAddressGroup) obj).AEQbTJ()))) {
                    arrayList.add(obj);
                }
            }
            listAhwBna = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                listAhwBna.add(((TrackerAddressGroup) it.next()).copydefault());
            }
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        TrackerAddressSourceResponse value2 = this.isConnected.getValue();
        if (value2 != null && (mapCopydefault = value2.copydefault()) != null && (collectionValues = mapCopydefault.values()) != null && (listQOLQEE = C56403yEb.QOLQEE(collectionValues)) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listQOLQEE) {
                if (this.gHZMYf.contains(((TrackerAddressLabel) obj2).AEQbTJ())) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((TrackerAddressLabel) it2.next()).EZpvd());
            }
            listAhwBna2 = CollectionsKt___CollectionsKt.QbewEr(arrayList3);
        }
        if (listAhwBna2 == null) {
            listAhwBna2 = yDY.AhwBna();
        }
        this.AYXKKw.setValue(CollectionsKt___CollectionsKt.djBIcL((Collection) listAhwBna, (Iterable) listAhwBna2));
    }

    public final void zLjUOn() {
        this.DbNXlk = C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerViewModel$subscribeActivity$1(this, null), 3, null);
    }

    public final void wlaJM() {
        this.AuCTelauCTel = C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerViewModel$subscribeSMActivity$1(this, null), 3, null);
    }

    public final void AubY() {
        this.AwvSrB = C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerViewModel$subscribeTrend$1(this, null), 3, null);
    }

    public final void AEQbTJ() {
        this.sSMYrx.AEQbTJ();
        this.sSMYrx.copydefault();
        this.sSMYrx.KWHzl();
        Job job = this.AwvSrB;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.AwvSrB = null;
        Job job2 = this.DbNXlk;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.DbNXlk = null;
        Job job3 = this.AuCTelauCTel;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
        }
        this.AuCTelauCTel = null;
    }

    public final Object EZpvd(List<TrackerTrendUIModel> list, Continuation<? super Unit> continuation) {
        this.AkhnZx.setValue(new jDZ.PendingIntent(list, false, 2, null));
        Object objEmit = this.copydefault.emit(C56443yFo.KWHzl(true), continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    public static /* synthetic */ Object updateActivityWSData$default(TrackerViewModel trackerViewModel, List list, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return trackerViewModel.copydefault(list, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(List<jEB> list, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        TrackerViewModel$updateActivityWSData$1 trackerViewModel$updateActivityWSData$1;
        if (continuation instanceof TrackerViewModel$updateActivityWSData$1) {
            trackerViewModel$updateActivityWSData$1 = (TrackerViewModel$updateActivityWSData$1) continuation;
            int i = trackerViewModel$updateActivityWSData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerViewModel$updateActivityWSData$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerViewModel$updateActivityWSData$1 = new TrackerViewModel$updateActivityWSData$1(this, continuation);
            }
        }
        Object obj = trackerViewModel$updateActivityWSData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerViewModel$updateActivityWSData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            jDZ value = this.ORxRYg.getValue();
            jDZ.StateListAnimator stateListAnimator = value instanceof jDZ.StateListAnimator ? (jDZ.StateListAnimator) value : null;
            if (stateListAnimator != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    jEB jeb = (jEB) obj2;
                    if (!z || copydefault(jeb)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    jEB jeb2 = (jEB) obj3;
                    List<jEB> listAEQbTJ = stateListAnimator.AEQbTJ();
                    ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                    Iterator<T> it = listAEQbTJ.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((jEB) it.next()).zsXlph());
                    }
                    if (!arrayList3.contains(jeb2.zsXlph())) {
                        arrayList2.add(obj3);
                    }
                }
                this.AkhnZx.setValue(new jDZ.StateListAnimator(CollectionsKt___CollectionsKt.djBIcL((Collection) arrayList2, (Iterable) stateListAnimator.AEQbTJ())));
                MutableSharedFlow<Boolean> mutableSharedFlow = this.copydefault;
                Boolean boolKWHzl = C56443yFo.KWHzl(!arrayList2.isEmpty());
                trackerViewModel$updateActivityWSData$1.L$0 = stateListAnimator;
                trackerViewModel$updateActivityWSData$1.label = 1;
                if (mutableSharedFlow.emit(boolKWHzl, trackerViewModel$updateActivityWSData$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    public final boolean copydefault(jEB jeb) {
        List listAhwBna;
        TrackerTxnListFilter value = this.fJNWhG.getValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!Intrinsics.EZpvd((Object) value.valueOf(), (Object) "all") && !Intrinsics.EZpvd((Object) jeb.djBIcL(), (Object) value.valueOf())) {
            return false;
        }
        if (!Intrinsics.EZpvd((Object) value.AYXKKw(), (Object) "all")) {
            String strAYXKKw = this.fJNWhG.getValue().AYXKKw();
            if (Intrinsics.EZpvd((Object) strAYXKKw, (Object) "buy")) {
                listAhwBna = yDY.gEmmrt(Integer.valueOf(AddressTrackerUserAction.BUY.getValue()), Integer.valueOf(AddressTrackerUserAction.BUY_MORE.getValue()), Integer.valueOf(AddressTrackerUserAction.NEWLY_HOLD.getValue()));
            } else if (Intrinsics.EZpvd((Object) strAYXKKw, (Object) "sell")) {
                listAhwBna = yDY.gEmmrt(Integer.valueOf(AddressTrackerUserAction.SELL.getValue()), Integer.valueOf(AddressTrackerUserAction.SELL_ALL.getValue()), Integer.valueOf(AddressTrackerUserAction.SELL_PARTIALLY.getValue()));
            } else {
                listAhwBna = yDY.AhwBna();
            }
            if (!listAhwBna.contains(Integer.valueOf(jeb.AuCTelauCTel()))) {
                return false;
            }
        }
        if ((!StringsKt__StringsKt.fARcdN((CharSequence) value.AhwBna().AhwBna())) && C33129mqd.gEmmrt(jeb.EZpvd(), value.AhwBna().AhwBna())) {
            return false;
        }
        if ((!StringsKt__StringsKt.fARcdN((CharSequence) value.AhwBna().KWHzl())) && C33129mqd.AEQbTJ(jeb.EZpvd(), value.AhwBna().KWHzl())) {
            return false;
        }
        if ((!StringsKt__StringsKt.fARcdN((CharSequence) value.EZpvd().AhwBna())) && C33129mqd.gEmmrt(jeb.OLrzqt(), value.EZpvd().AhwBna())) {
            return false;
        }
        if ((!StringsKt__StringsKt.fARcdN((CharSequence) value.EZpvd().KWHzl())) && C33129mqd.AEQbTJ(jeb.OLrzqt(), value.EZpvd().KWHzl())) {
            return false;
        }
        if (!StringsKt__StringsKt.fARcdN((CharSequence) jeb.fJNWhG())) {
            if ((!StringsKt__StringsKt.fARcdN((CharSequence) value.copydefault().AhwBna())) && C33129mqd.gEmmrt(jeb.fJNWhG(), value.copydefault().AhwBna())) {
                return false;
            }
            if ((!StringsKt__StringsKt.fARcdN((CharSequence) value.copydefault().KWHzl())) && C33129mqd.AEQbTJ(jeb.fJNWhG(), value.copydefault().KWHzl())) {
                return false;
            }
        }
        if ((!StringsKt__StringsKt.fARcdN((CharSequence) jeb.fetchVPNInfo())) && (!StringsKt__StringsKt.fARcdN((CharSequence) value.KWHzl().AhwBna())) && C33129mqd.gEmmrt(jeb.fetchVPNInfo(), value.KWHzl().AhwBna())) {
            return false;
        }
        if (!StringsKt__StringsKt.fARcdN((CharSequence) jeb.getFieldNames())) {
            String strKWHzl = this.fJNWhG.getValue().djBIcL().KWHzl();
            String strValueOf = C33129mqd.OLrzqt((CharSequence) strKWHzl) ? String.valueOf(jCurrentTimeMillis - ((C33129mqd.valueOf(strKWHzl) * ((long) 60)) * ((long) 1000))) : "";
            String strAhwBna = this.fJNWhG.getValue().djBIcL().AhwBna();
            String strValueOf2 = C33129mqd.OLrzqt((CharSequence) strAhwBna) ? String.valueOf(jCurrentTimeMillis - ((C33129mqd.valueOf(strAhwBna) * ((long) 60)) * ((long) 1000))) : "";
            if ((!StringsKt__StringsKt.fARcdN((CharSequence) strValueOf)) && C33129mqd.gEmmrt(jeb.getFieldNames(), strValueOf)) {
                return false;
            }
            if ((!StringsKt__StringsKt.fARcdN((CharSequence) strValueOf2)) && C33129mqd.AEQbTJ(jeb.getFieldNames(), strValueOf2)) {
                return false;
            }
        }
        if (!jeb.hDKMBd().isEmpty()) {
            List<Integer> listHDKMBd = jeb.hDKMBd();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listHDKMBd, 10));
            Iterator<T> it = listHDKMBd.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            if (CollectionsKt___CollectionsKt.AhwBna((Iterable) arrayList, (Iterable) this.gHZMYf).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final void KWHzl(@NotNull TrackerTrendUIModel trackerTrendUIModel) {
        Intrinsics.checkNotNullParameter(trackerTrendUIModel, "");
        this.gEmmrt.setValue(trackerTrendUIModel);
    }

    public final void OLrzqt(int i) {
        SPUtils.put("SP_KEY_DEX_SELECTED_TAB", Integer.valueOf(i));
    }

    public final int iwGUEr() {
        Integer num = SPUtils.getInt("SP_KEY_DEX_SELECTED_TAB", 0);
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public final void AEQbTJ(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        SPUtils.put("SP_KEY_DEX_SELECTED_GRPID", list);
    }

    public final List<String> getNewProxyInstance() {
        ArrayList arrayList = SPUtils.getArrayList("SP_KEY_DEX_SELECTED_GRPID", String.class);
        return arrayList != null ? arrayList : yDY.AhwBna();
    }

    public final void OLrzqt(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        SPUtils.put("SP_KEY_DEX_SELECTED_RECOMID", list);
    }

    public final List<String> getFieldNames() {
        ArrayList arrayList = SPUtils.getArrayList("SP_KEY_DEX_SELECTED_RECOMID", String.class);
        return arrayList != null ? arrayList : yDY.AhwBna();
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put("SP_KEY_DEX_SELECTED_PERIOD", str);
    }

    public final String hDKMBd() {
        String string = SPUtils.getString("SP_KEY_DEX_SELECTED_PERIOD", "5");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void copydefault(boolean z) {
        SPUtils.put("SP_KEY_DEX_SELECTED_TOGGLE", Boolean.valueOf(z));
    }

    public final boolean uzCIH() {
        return SPUtils.getBoolean("SP_KEY_DEX_SELECTED_TOGGLE", true);
    }

    public final void zuBGHE() {
        List<String> list = this.gHZMYf;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = (String) obj;
            List<jDG> listDjBIcL = djBIcL();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
            Iterator<T> it = listDjBIcL.iterator();
            while (it.hasNext()) {
                arrayList2.add(((jDG) it.next()).copydefault());
            }
            if (arrayList2.contains(str)) {
                arrayList.add(obj);
            }
        }
        this.gHZMYf = arrayList;
        if (arrayList.size() + this.iwGUEr.size() == 0) {
            if (djBIcL().size() > 0) {
                this.gHZMYf = C56402yEa.EZpvd(((jDG) CollectionsKt___CollectionsKt.AuCTelauCTel(djBIcL())).copydefault());
            } else {
                this.iwGUEr = C56402yEa.EZpvd(((jDG) CollectionsKt___CollectionsKt.AuCTelauCTel(AhwBna())).copydefault());
            }
        }
        AuCTelauCTel();
    }

    public final List<MarketChainBean> DbNXlk() {
        List<MarketChainBean> list = this.fetchVPNInfo;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            MarketChainBean marketChainBean = (MarketChainBean) obj;
            TrackerAddressSourceResponse value = this.isConnected.getValue();
            List<Integer> listKWHzl = value != null ? value.KWHzl() : null;
            if (listKWHzl == null) {
                listKWHzl = yDY.AhwBna();
            }
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                arrayList2.add(String.valueOf(((Number) it.next()).intValue()));
            }
            if (arrayList2.contains(marketChainBean.getChainId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
