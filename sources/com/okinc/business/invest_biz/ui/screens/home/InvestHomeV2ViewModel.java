package com.okinc.business.invest_biz.ui.screens.home;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_api.bean.DeFiApyDataInfoData;
import com.okinc.business.invest_biz.data.bean.HomeLearnEarnVO;
import com.okinc.business.invest_biz.data.bean.HomeTab;
import com.okinc.business.invest_biz.data.bean.HomeTokensItemData;
import com.okinc.business.invest_biz.data.bean.HomeTokensResponse;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetailResponse;
import com.okinc.business.invest_biz.ui.screens.home.InvestHomeV2ViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C23701iGc;
import o.C23719iGu;
import o.C25542iyg;
import o.C25595izg;
import o.C27492jwH;
import o.C27493jwI;
import o.C33129mqd;
import o.C55276xgr;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.C56444yFp;
import o.C56521yIl;
import o.C59449zhJ;
import o.C9917bed;
import o.InterfaceC23702iGd;
import o.InterfaceC23721iGw;
import o.InterfaceC26470jct;
import o.InterfaceC26472jcv;
import o.InterfaceC26474jcx;
import o.InterfaceC26475jcy;
import o.InterfaceC56445yFq;
import o.iFP;
import o.iFW;
import o.iFZ;
import o.iGF;
import o.iOM;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestHomeV2ViewModel extends ViewModel {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final MutableStateFlow<C55276xgr> AEQbTJ;
    public final MutableStateFlow<InterfaceC26474jcx> AYXKKw;
    public final MutableStateFlow<InterfaceC26472jcv> AhwBna;
    public final StateFlow<Boolean> AkhnZx;
    public final StateFlow<Boolean> AuCTel;
    public final iFW AuCTelauCTel;
    public final InterfaceC23702iGd AubY;
    public final StateFlow<InterfaceC26472jcv> AxsJAY;
    public final StateFlow<Boolean> DbNXlk;
    public final MutableStateFlow<InterfaceC26475jcy> EZpvd;
    public final MutableStateFlow<InterfaceC26470jct> KWHzl;
    public final MutableSharedFlow<Unit> OLrzqt;
    public HomeTokensResponse djBIcL;
    public final iFZ ejfBZ;
    public boolean fARcdN;
    public final CoroutineDispatcher fIwbmz;
    public final StateFlow<InterfaceC26475jcy> fJNWhG;
    public final StateFlow<InterfaceC26470jct> fetchVPNInfo;
    public final MutableStateFlow<TaskDescription> gEmmrt;
    public final StateFlow<TaskDescription> getFieldNames;
    public final iFP getNewProxyInstance;
    public final InterfaceC23721iGw hDKMBd;
    public final StateFlow<C55276xgr> isConnected;
    public Function1<? super C9917bed, Unit> iwGUEr;
    public final SharedFlow<Unit> uzCIH;
    public final MutableStateFlow<List<TokenInvestDetail>> valueOf;
    public final iOM values;
    public final StateFlow<List<TokenInvestDetail>> wlaJM;
    public final iGF zLjUOn;
    public final StateFlow<InterfaceC26474jcx> zsXlph;
    public String zuBGHE;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[RequestType.CAROUSEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestType.TOKENS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestType.TABS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RequestType.LEARN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC26475jcy> AhwBna() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AkhnZx() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC26472jcv> DbNXlk() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> KWHzl() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC26470jct> OLrzqt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> copydefault() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<TokenInvestDetail>> fetchVPNInfo() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC26474jcx> isConnected() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> valueOf() {
        return this.uzCIH;
    }

    public static final class Activity implements Flow<Boolean> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.home.InvestHomeV2ViewModel$Activity$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                InvestHomeV2ViewModel$special$$inlined$map$2$2$1 investHomeV2ViewModel$special$$inlined$map$2$2$1;
                if (continuation instanceof InvestHomeV2ViewModel$special$$inlined$map$2$2$1) {
                    investHomeV2ViewModel$special$$inlined$map$2$2$1 = (InvestHomeV2ViewModel$special$$inlined$map$2$2$1) continuation;
                    int i = investHomeV2ViewModel$special$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        investHomeV2ViewModel$special$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        investHomeV2ViewModel$special$$inlined$map$2$2$1 = new InvestHomeV2ViewModel$special$$inlined$map$2$2$1(this, continuation);
                    }
                }
                Object obj2 = investHomeV2ViewModel$special$$inlined$map$2$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = investHomeV2ViewModel$special$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    Boolean boolKWHzl = C56443yFo.KWHzl(((TaskDescription) obj) instanceof TaskDescription.ActionBar);
                    investHomeV2ViewModel$special$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, investHomeV2ViewModel$special$$inlined$map$2$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Application implements Flow<Boolean> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.home.InvestHomeV2ViewModel$Application$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                InvestHomeV2ViewModel$special$$inlined$map$1$2$1 investHomeV2ViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof InvestHomeV2ViewModel$special$$inlined$map$1$2$1) {
                    investHomeV2ViewModel$special$$inlined$map$1$2$1 = (InvestHomeV2ViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = investHomeV2ViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        investHomeV2ViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        investHomeV2ViewModel$special$$inlined$map$1$2$1 = new InvestHomeV2ViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = investHomeV2ViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = investHomeV2ViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    Boolean boolKWHzl = C56443yFo.KWHzl(((TaskDescription) obj) instanceof TaskDescription.Activity);
                    investHomeV2ViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, investHomeV2ViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class PendingIntent implements Flow<Boolean> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.home.InvestHomeV2ViewModel$PendingIntent$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                InvestHomeV2ViewModel$special$$inlined$map$3$2$1 investHomeV2ViewModel$special$$inlined$map$3$2$1;
                if (continuation instanceof InvestHomeV2ViewModel$special$$inlined$map$3$2$1) {
                    investHomeV2ViewModel$special$$inlined$map$3$2$1 = (InvestHomeV2ViewModel$special$$inlined$map$3$2$1) continuation;
                    int i = investHomeV2ViewModel$special$$inlined$map$3$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        investHomeV2ViewModel$special$$inlined$map$3$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        investHomeV2ViewModel$special$$inlined$map$3$2$1 = new InvestHomeV2ViewModel$special$$inlined$map$3$2$1(this, continuation);
                    }
                }
                Object obj2 = investHomeV2ViewModel$special$$inlined$map$3$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = investHomeV2ViewModel$special$$inlined$map$3$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    Boolean boolKWHzl = C56443yFo.KWHzl(((TaskDescription) obj) instanceof TaskDescription.StateListAnimator);
                    investHomeV2ViewModel$special$$inlined$map$3$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, investHomeV2ViewModel$special$$inlined$map$3$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public PendingIntent(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public InvestHomeV2ViewModel(@NotNull iFZ ifz, @NotNull InterfaceC23721iGw interfaceC23721iGw, @NotNull iFP ifp, @NotNull InterfaceC23702iGd interfaceC23702iGd, @NotNull iFW ifw, @NotNull iGF igf, @NotNull iOM iom, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ifz, "");
        Intrinsics.checkNotNullParameter(interfaceC23721iGw, "");
        Intrinsics.checkNotNullParameter(ifp, "");
        Intrinsics.checkNotNullParameter(interfaceC23702iGd, "");
        Intrinsics.checkNotNullParameter(ifw, "");
        Intrinsics.checkNotNullParameter(igf, "");
        Intrinsics.checkNotNullParameter(iom, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.ejfBZ = ifz;
        this.hDKMBd = interfaceC23721iGw;
        this.getNewProxyInstance = ifp;
        this.AubY = interfaceC23702iGd;
        this.AuCTelauCTel = ifw;
        this.zLjUOn = igf;
        this.values = iom;
        this.fIwbmz = coroutineDispatcher;
        MutableStateFlow<TaskDescription> MutableStateFlow = StateFlowKt.MutableStateFlow(TaskDescription.Activity.EZpvd);
        this.gEmmrt = MutableStateFlow;
        StateFlow<TaskDescription> stateFlowAsStateFlow = FlowKt.asStateFlow(MutableStateFlow);
        this.getFieldNames = stateFlowAsStateFlow;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.uzCIH = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<InterfaceC26472jcv> MutableStateFlow2 = StateFlowKt.MutableStateFlow(InterfaceC26472jcv.StateListAnimator.EZpvd);
        this.AhwBna = MutableStateFlow2;
        this.AxsJAY = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<InterfaceC26475jcy> MutableStateFlow3 = StateFlowKt.MutableStateFlow(InterfaceC26475jcy.Activity.copydefault);
        this.EZpvd = MutableStateFlow3;
        this.fJNWhG = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<InterfaceC26470jct> MutableStateFlow4 = StateFlowKt.MutableStateFlow(InterfaceC26470jct.TaskDescription.EZpvd);
        this.KWHzl = MutableStateFlow4;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<C55276xgr> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow5;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<InterfaceC26474jcx> MutableStateFlow6 = StateFlowKt.MutableStateFlow(InterfaceC26474jcx.TaskDescription.OLrzqt);
        this.AYXKKw = MutableStateFlow6;
        this.zsXlph = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<List<TokenInvestDetail>> MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this.valueOf = MutableStateFlow7;
        this.wlaJM = FlowKt.asStateFlow(MutableStateFlow7);
        Application application = new Application(stateFlowAsStateFlow);
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.AuCTel = FlowKt.stateIn(application, viewModelScope, companion.getLazily(), Boolean.TRUE);
        Activity activity = new Activity(stateFlowAsStateFlow);
        CoroutineScope viewModelScope2 = ViewModelKt.getViewModelScope(this);
        SharingStarted lazily = companion.getLazily();
        Boolean bool = Boolean.FALSE;
        this.AkhnZx = FlowKt.stateIn(activity, viewModelScope2, lazily, bool);
        this.DbNXlk = FlowKt.stateIn(new PendingIntent(stateFlowAsStateFlow), ViewModelKt.getViewModelScope(this), companion.getLazily(), bool);
        this.zuBGHE = toString();
        this.iwGUEr = new Function1() { // from class: o.jdb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestHomeV2ViewModel.OLrzqt(this.AEQbTJ, (C9917bed) obj);
            }
        };
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.home.InvestHomeV2ViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final Unit OLrzqt(InvestHomeV2ViewModel investHomeV2ViewModel, C9917bed c9917bed) {
        ArrayList arrayList;
        List<HomeTokensItemData> listKWHzl;
        Intrinsics.checkNotNullParameter(c9917bed, "");
        InterfaceC26474jcx value = investHomeV2ViewModel.zsXlph.getValue();
        InterfaceC26474jcx.StateListAnimator stateListAnimator = value instanceof InterfaceC26474jcx.StateListAnimator ? (InterfaceC26474jcx.StateListAnimator) value : null;
        HomeTokensResponse homeTokensResponseEZpvd = stateListAnimator != null ? stateListAnimator.EZpvd() : null;
        boolean z = false;
        if (homeTokensResponseEZpvd == null || (listKWHzl = homeTokensResponseEZpvd.KWHzl()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            boolean z2 = false;
            for (HomeTokensItemData homeTokensItemDataOLrzqt : listKWHzl) {
                if (Intrinsics.EZpvd((Object) homeTokensItemDataOLrzqt.EZpvd(), (Object) C33129mqd.gEmmrt(c9917bed.copydefault())) && !C59449zhJ.equals$default(c9917bed.KWHzl(), homeTokensItemDataOLrzqt.djBIcL(), false, 2, null)) {
                    String strKWHzl = c9917bed.KWHzl();
                    if (strKWHzl == null) {
                        strKWHzl = homeTokensItemDataOLrzqt.djBIcL();
                    }
                    homeTokensItemDataOLrzqt = homeTokensItemDataOLrzqt.OLrzqt((1015 & 1) != 0 ? homeTokensItemDataOLrzqt.tokenSymbol : null, (1015 & 2) != 0 ? homeTokensItemDataOLrzqt.tokenLogo : null, (1015 & 4) != 0 ? homeTokensItemDataOLrzqt.networkData : null, (1015 & 8) != 0 ? homeTokensItemDataOLrzqt.rateDesc : null, (1015 & 16) != 0 ? homeTokensItemDataOLrzqt.totalTokenAmount : strKWHzl, (1015 & 32) != 0 ? homeTokensItemDataOLrzqt.investmentId : 0L, (1015 & 64) != 0 ? homeTokensItemDataOLrzqt.hasMultipleProtocols : false, (1015 & 128) != 0 ? homeTokensItemDataOLrzqt.chainId : 0L, (1015 & 256) != 0 ? homeTokensItemDataOLrzqt.coinId : null, (1015 & 512) != 0 ? homeTokensItemDataOLrzqt.tokenAddress : null);
                    z2 = true;
                }
                arrayList.add(homeTokensItemDataOLrzqt);
            }
            z = z2;
        }
        if (z && homeTokensResponseEZpvd != null && arrayList != null) {
            C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(investHomeV2ViewModel), null, null, new InvestHomeV2ViewModel$mBalanceListener$1$1(investHomeV2ViewModel, homeTokensResponseEZpvd, arrayList, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.home.InvestHomeV2ViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestHomeV2ViewModel.this.new AnonymousClass1(continuation);
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
                SharedFlow<Unit> sharedFlowOLrzqt = InvestHomeV2ViewModel.this.values.OLrzqt();
                C03381 c03381 = new C03381(InvestHomeV2ViewModel.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlowOLrzqt, c03381, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.home.InvestHomeV2ViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03381 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InvestHomeV2ViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03381(InvestHomeV2ViewModel investHomeV2ViewModel, Continuation<? super C03381> continuation) {
                super(2, continuation);
                this.this$0 = investHomeV2ViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03381(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return ((C03381) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.invest_biz.data.bean.HomeTokensItemData.copy$default(com.okinc.business.invest_biz.data.bean.HomeTokensItemData, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.HomeTokensLogoData, java.lang.String, java.lang.String, long, boolean, long, java.lang.String, java.lang.String, int, java.lang.Object):com.okinc.business.invest_biz.data.bean.HomeTokensItemData */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                HomeTokensResponse homeTokensResponseEZpvd;
                List<HomeTokensItemData> listKWHzl;
                boolean z;
                HomeTokensResponse homeTokensResponseEZpvd2;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    Object value = this.this$0.AYXKKw.getValue();
                    byte b = 0;
                    byte b2 = 0;
                    InterfaceC26474jcx.StateListAnimator stateListAnimator = value instanceof InterfaceC26474jcx.StateListAnimator ? (InterfaceC26474jcx.StateListAnimator) value : null;
                    if (stateListAnimator != null && (homeTokensResponseEZpvd = stateListAnimator.EZpvd()) != null && (listKWHzl = homeTokensResponseEZpvd.KWHzl()) != null) {
                        InvestHomeV2ViewModel investHomeV2ViewModel = this.this$0;
                        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
                        Iterator<T> it = listKWHzl.iterator();
                        while (true) {
                            z = false;
                            z = false;
                            if (!it.hasNext()) {
                                break;
                            }
                            HomeTokensItemData homeTokensItemDataOLrzqt = (HomeTokensItemData) it.next();
                            DeFiApyDataInfoData deFiApyDataInfoDataAEQbTJ = investHomeV2ViewModel.values.AEQbTJ(C33129mqd.copydefault(C56521yIl.copydefault, (Object) homeTokensItemDataOLrzqt.EZpvd()));
                            String strKWHzl = deFiApyDataInfoDataAEQbTJ != null ? C27492jwH.OLrzqt.KWHzl(deFiApyDataInfoDataAEQbTJ.getMinApy(), deFiApyDataInfoDataAEQbTJ.getMaxApy()) : null;
                            if (C33129mqd.OLrzqt((CharSequence) strKWHzl) && !Intrinsics.EZpvd((Object) strKWHzl, (Object) homeTokensItemDataOLrzqt.AhwBna())) {
                                z = true;
                            }
                            booleanRef2.element = z;
                            if (z) {
                                booleanRef.element = true;
                            }
                            if (booleanRef2.element) {
                                if (strKWHzl == null) {
                                    strKWHzl = homeTokensItemDataOLrzqt.AhwBna();
                                }
                                homeTokensItemDataOLrzqt = homeTokensItemDataOLrzqt.OLrzqt((1015 & 1) != 0 ? homeTokensItemDataOLrzqt.tokenSymbol : null, (1015 & 2) != 0 ? homeTokensItemDataOLrzqt.tokenLogo : null, (1015 & 4) != 0 ? homeTokensItemDataOLrzqt.networkData : null, (1015 & 8) != 0 ? homeTokensItemDataOLrzqt.rateDesc : strKWHzl, (1015 & 16) != 0 ? homeTokensItemDataOLrzqt.totalTokenAmount : null, (1015 & 32) != 0 ? homeTokensItemDataOLrzqt.investmentId : 0L, (1015 & 64) != 0 ? homeTokensItemDataOLrzqt.hasMultipleProtocols : false, (1015 & 128) != 0 ? homeTokensItemDataOLrzqt.chainId : 0L, (1015 & 256) != 0 ? homeTokensItemDataOLrzqt.coinId : null, (1015 & 512) != 0 ? homeTokensItemDataOLrzqt.tokenAddress : null);
                            }
                            arrayList.add(homeTokensItemDataOLrzqt);
                        }
                        InvestHomeV2ViewModel investHomeV2ViewModel2 = this.this$0;
                        if (booleanRef.element) {
                            MutableStateFlow mutableStateFlow = investHomeV2ViewModel2.AYXKKw;
                            HomeTokensResponse homeTokensResponse = new HomeTokensResponse(z ? 1 : 0, (List) (b2 == true ? 1 : 0), 3, (DefaultConstructorMarker) (b == true ? 1 : 0));
                            Object value2 = investHomeV2ViewModel2.AYXKKw.getValue();
                            InterfaceC26474jcx.StateListAnimator stateListAnimator2 = value2 instanceof InterfaceC26474jcx.StateListAnimator ? (InterfaceC26474jcx.StateListAnimator) value2 : null;
                            InterfaceC26474jcx.StateListAnimator stateListAnimator3 = new InterfaceC26474jcx.StateListAnimator(homeTokensResponse.copydefault((stateListAnimator2 == null || (homeTokensResponseEZpvd2 = stateListAnimator2.EZpvd()) == null) ? 1 : homeTokensResponseEZpvd2.AEQbTJ(), arrayList));
                            this.label = 1;
                            if (mutableStateFlow.emit(stateListAnimator3, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
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
    }

    public final void values() {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestHomeV2ViewModel$refreshApy$1(this, null), 3, null);
    }

    public static /* synthetic */ void initData$default(InvestHomeV2ViewModel investHomeV2ViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        investHomeV2ViewModel.copydefault(z);
    }

    public final void copydefault(boolean z) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestHomeV2ViewModel$initData$1(z, this, null), 3, null);
    }

    /* JADX DEBUG: Duplicate block (B:52:0x01e7) to fix multi-entry loop: BACK_EDGE: B:52:0x01e7 -> B:53:0x01e9 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x018c -> B:40:0x0190). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0289 -> B:74:0x028a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x02e0 -> B:87:0x02e6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(boolean z, List<? extends Result<? extends Object>> list, Continuation<? super Unit> continuation) throws Throwable {
        InvestHomeV2ViewModel$analyzeResults$1 investHomeV2ViewModel$analyzeResults$1;
        InvestHomeV2ViewModel investHomeV2ViewModel;
        Iterator it;
        RequestType[] requestTypeArr;
        List list2;
        Ref.BooleanRef booleanRef;
        int i;
        boolean z2;
        InvestHomeV2ViewModel investHomeV2ViewModel2;
        int i2;
        boolean z3;
        InvestHomeV2ViewModel investHomeV2ViewModel3;
        boolean z4;
        int i3;
        boolean z5;
        InvestHomeV2ViewModel investHomeV2ViewModel4;
        boolean z6;
        boolean z7;
        InvestHomeV2ViewModel investHomeV2ViewModel5;
        boolean z8;
        boolean z9;
        if (continuation instanceof InvestHomeV2ViewModel$analyzeResults$1) {
            investHomeV2ViewModel$analyzeResults$1 = (InvestHomeV2ViewModel$analyzeResults$1) continuation;
            int i4 = investHomeV2ViewModel$analyzeResults$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                investHomeV2ViewModel$analyzeResults$1.label = i4 - Integer.MIN_VALUE;
                investHomeV2ViewModel = this;
            } else {
                investHomeV2ViewModel = this;
                investHomeV2ViewModel$analyzeResults$1 = new InvestHomeV2ViewModel$analyzeResults$1(investHomeV2ViewModel, continuation);
            }
        }
        Object obj = investHomeV2ViewModel$analyzeResults$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        boolean z10 = true;
        switch (investHomeV2ViewModel$analyzeResults$1.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                RequestType[] requestTypeArrValues = RequestType.values();
                ArrayList arrayList = new ArrayList();
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                it = list.iterator();
                requestTypeArr = requestTypeArrValues;
                list2 = arrayList;
                booleanRef = booleanRef2;
                i = 0;
                z2 = z;
                investHomeV2ViewModel2 = investHomeV2ViewModel;
                if (it.hasNext()) {
                    Object next = it.next();
                    int i5 = i + 1;
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    Object objM7386unboximpl = ((Result) next).m7386unboximpl();
                    RequestType requestType = requestTypeArr[i];
                    int i6 = StateListAnimator.EZpvd[requestType.ordinal()];
                    if (i6 != z10) {
                        if (i6 == 2) {
                            C25595izg.AEQbTJ.AEQbTJ("invest_global").OLrzqt().removeIncrementListener(investHomeV2ViewModel2.zuBGHE);
                            if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) == null) {
                                investHomeV2ViewModel2.djBIcL = (HomeTokensResponse) objM7386unboximpl;
                                investHomeV2ViewModel$analyzeResults$1.L$0 = investHomeV2ViewModel2;
                                investHomeV2ViewModel$analyzeResults$1.L$1 = requestTypeArr;
                                investHomeV2ViewModel$analyzeResults$1.L$2 = list2;
                                investHomeV2ViewModel$analyzeResults$1.L$3 = booleanRef;
                                investHomeV2ViewModel$analyzeResults$1.L$4 = it;
                                investHomeV2ViewModel$analyzeResults$1.Z$0 = z2;
                                investHomeV2ViewModel$analyzeResults$1.I$0 = i5;
                                investHomeV2ViewModel$analyzeResults$1.label = 3;
                                if (investHomeV2ViewModel2.AEQbTJ(investHomeV2ViewModel$analyzeResults$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                z5 = z2;
                                investHomeV2ViewModel4 = investHomeV2ViewModel2;
                                i3 = i5;
                                investHomeV2ViewModel$analyzeResults$1.L$0 = investHomeV2ViewModel4;
                                investHomeV2ViewModel$analyzeResults$1.L$1 = requestTypeArr;
                                investHomeV2ViewModel$analyzeResults$1.L$2 = list2;
                                investHomeV2ViewModel$analyzeResults$1.L$3 = booleanRef;
                                investHomeV2ViewModel$analyzeResults$1.L$4 = it;
                                investHomeV2ViewModel$analyzeResults$1.Z$0 = z5;
                                investHomeV2ViewModel$analyzeResults$1.I$0 = i3;
                                investHomeV2ViewModel$analyzeResults$1.label = 4;
                                if (investHomeV2ViewModel4.OLrzqt(investHomeV2ViewModel$analyzeResults$1) != objCopydefault) {
                                    return objCopydefault;
                                }
                                z6 = true;
                                booleanRef.element = z6;
                                investHomeV2ViewModel4.AuCTel();
                                z2 = z5;
                                i = i3;
                                investHomeV2ViewModel2 = investHomeV2ViewModel4;
                                z4 = true;
                                z10 = z4;
                                if (it.hasNext()) {
                                }
                            } else {
                                list2.add(requestType);
                                investHomeV2ViewModel2.djBIcL = null;
                                MutableStateFlow<InterfaceC26474jcx> mutableStateFlow = investHomeV2ViewModel2.AYXKKw;
                                InterfaceC26474jcx.ActionBar actionBar = InterfaceC26474jcx.ActionBar.EZpvd;
                                investHomeV2ViewModel$analyzeResults$1.L$0 = investHomeV2ViewModel2;
                                investHomeV2ViewModel$analyzeResults$1.L$1 = requestTypeArr;
                                investHomeV2ViewModel$analyzeResults$1.L$2 = list2;
                                investHomeV2ViewModel$analyzeResults$1.L$3 = booleanRef;
                                investHomeV2ViewModel$analyzeResults$1.L$4 = it;
                                investHomeV2ViewModel$analyzeResults$1.Z$0 = z2;
                                investHomeV2ViewModel$analyzeResults$1.I$0 = i5;
                                investHomeV2ViewModel$analyzeResults$1.label = 5;
                                if (mutableStateFlow.emit(actionBar, investHomeV2ViewModel$analyzeResults$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                        } else if (i6 == 3) {
                            if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) == null) {
                                MutableStateFlow<InterfaceC26472jcv> mutableStateFlow2 = investHomeV2ViewModel2.AhwBna;
                                Intrinsics.copydefault(objM7386unboximpl, "");
                                InterfaceC26472jcv.TaskDescription taskDescription = new InterfaceC26472jcv.TaskDescription((List) objM7386unboximpl);
                                investHomeV2ViewModel$analyzeResults$1.L$0 = investHomeV2ViewModel2;
                                investHomeV2ViewModel$analyzeResults$1.L$1 = requestTypeArr;
                                investHomeV2ViewModel$analyzeResults$1.L$2 = list2;
                                investHomeV2ViewModel$analyzeResults$1.L$3 = booleanRef;
                                investHomeV2ViewModel$analyzeResults$1.L$4 = it;
                                investHomeV2ViewModel$analyzeResults$1.Z$0 = z2;
                                investHomeV2ViewModel$analyzeResults$1.I$0 = i5;
                                investHomeV2ViewModel$analyzeResults$1.label = 6;
                                if (mutableStateFlow2.emit(taskDescription, investHomeV2ViewModel$analyzeResults$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                z7 = z2;
                                investHomeV2ViewModel4 = investHomeV2ViewModel2;
                                i3 = i5;
                                booleanRef.element = true;
                                z2 = z7;
                                i = i3;
                                investHomeV2ViewModel2 = investHomeV2ViewModel4;
                                z4 = true;
                                z10 = z4;
                                if (it.hasNext()) {
                                }
                            } else {
                                list2.add(requestType);
                                MutableStateFlow<InterfaceC26472jcv> mutableStateFlow3 = investHomeV2ViewModel2.AhwBna;
                                InterfaceC26472jcv.ActionBar actionBar2 = InterfaceC26472jcv.ActionBar.copydefault;
                                investHomeV2ViewModel$analyzeResults$1.L$0 = investHomeV2ViewModel2;
                                investHomeV2ViewModel$analyzeResults$1.L$1 = requestTypeArr;
                                investHomeV2ViewModel$analyzeResults$1.L$2 = list2;
                                investHomeV2ViewModel$analyzeResults$1.L$3 = booleanRef;
                                investHomeV2ViewModel$analyzeResults$1.L$4 = it;
                                investHomeV2ViewModel$analyzeResults$1.Z$0 = z2;
                                investHomeV2ViewModel$analyzeResults$1.I$0 = i5;
                                investHomeV2ViewModel$analyzeResults$1.label = 7;
                                if (mutableStateFlow3.emit(actionBar2, investHomeV2ViewModel$analyzeResults$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                        } else {
                            if (i6 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) == null) {
                                MutableStateFlow<InterfaceC26475jcy> mutableStateFlow4 = investHomeV2ViewModel2.EZpvd;
                                Intrinsics.copydefault(objM7386unboximpl, "");
                                InterfaceC26475jcy.ActionBar actionBarAEQbTJ = C23719iGu.AEQbTJ((HomeLearnEarnVO) objM7386unboximpl);
                                investHomeV2ViewModel$analyzeResults$1.L$0 = investHomeV2ViewModel2;
                                investHomeV2ViewModel$analyzeResults$1.L$1 = requestTypeArr;
                                investHomeV2ViewModel$analyzeResults$1.L$2 = list2;
                                investHomeV2ViewModel$analyzeResults$1.L$3 = booleanRef;
                                investHomeV2ViewModel$analyzeResults$1.L$4 = it;
                                investHomeV2ViewModel$analyzeResults$1.Z$0 = z2;
                                investHomeV2ViewModel$analyzeResults$1.I$0 = i5;
                                investHomeV2ViewModel$analyzeResults$1.label = 8;
                                if (mutableStateFlow4.emit(actionBarAEQbTJ, investHomeV2ViewModel$analyzeResults$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                z7 = z2;
                                investHomeV2ViewModel4 = investHomeV2ViewModel2;
                                i3 = i5;
                                z9 = true;
                                booleanRef.element = z9;
                                z2 = z7;
                                i = i3;
                                investHomeV2ViewModel2 = investHomeV2ViewModel4;
                                z4 = true;
                                z10 = z4;
                                if (it.hasNext()) {
                                }
                            } else {
                                list2.add(requestType);
                                MutableStateFlow<InterfaceC26475jcy> mutableStateFlow5 = investHomeV2ViewModel2.EZpvd;
                                InterfaceC26475jcy.Application application = InterfaceC26475jcy.Application.AEQbTJ;
                                investHomeV2ViewModel$analyzeResults$1.L$0 = investHomeV2ViewModel2;
                                investHomeV2ViewModel$analyzeResults$1.L$1 = requestTypeArr;
                                investHomeV2ViewModel$analyzeResults$1.L$2 = list2;
                                investHomeV2ViewModel$analyzeResults$1.L$3 = booleanRef;
                                investHomeV2ViewModel$analyzeResults$1.L$4 = it;
                                investHomeV2ViewModel$analyzeResults$1.Z$0 = z2;
                                investHomeV2ViewModel$analyzeResults$1.I$0 = i5;
                                investHomeV2ViewModel$analyzeResults$1.label = 9;
                                if (mutableStateFlow5.emit(application, investHomeV2ViewModel$analyzeResults$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                        }
                        z5 = z2;
                        investHomeV2ViewModel4 = investHomeV2ViewModel2;
                        i3 = i5;
                        z2 = z5;
                        i = i3;
                        investHomeV2ViewModel2 = investHomeV2ViewModel4;
                        z4 = true;
                        z10 = z4;
                        if (it.hasNext()) {
                        }
                    } else if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) == null) {
                        MutableStateFlow<InterfaceC26470jct> mutableStateFlow6 = investHomeV2ViewModel2.KWHzl;
                        Intrinsics.copydefault(objM7386unboximpl, "");
                        InterfaceC26470jct.ActionBar actionBarAEQbTJ2 = C23701iGc.AEQbTJ((C25542iyg) objM7386unboximpl);
                        investHomeV2ViewModel$analyzeResults$1.L$0 = investHomeV2ViewModel2;
                        investHomeV2ViewModel$analyzeResults$1.L$1 = requestTypeArr;
                        investHomeV2ViewModel$analyzeResults$1.L$2 = list2;
                        investHomeV2ViewModel$analyzeResults$1.L$3 = booleanRef;
                        investHomeV2ViewModel$analyzeResults$1.L$4 = it;
                        investHomeV2ViewModel$analyzeResults$1.Z$0 = z2;
                        investHomeV2ViewModel$analyzeResults$1.I$0 = i5;
                        z4 = true;
                        investHomeV2ViewModel$analyzeResults$1.label = 1;
                        if (mutableStateFlow6.emit(actionBarAEQbTJ2, investHomeV2ViewModel$analyzeResults$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        z3 = z2;
                        investHomeV2ViewModel3 = investHomeV2ViewModel2;
                        i2 = i5;
                        booleanRef.element = z4;
                        int i7 = i2;
                        investHomeV2ViewModel2 = investHomeV2ViewModel3;
                        z2 = z3;
                        i = i7;
                        z10 = z4;
                        if (it.hasNext()) {
                            if (list2.size() == RequestType.values().length) {
                                booleanRef.element = false;
                            }
                            if (list2.isEmpty()) {
                                MutableStateFlow<TaskDescription> mutableStateFlow7 = investHomeV2ViewModel2.gEmmrt;
                                TaskDescription.C0339TaskDescription c0339TaskDescription = TaskDescription.C0339TaskDescription.KWHzl;
                                investHomeV2ViewModel$analyzeResults$1.L$0 = investHomeV2ViewModel2;
                                investHomeV2ViewModel$analyzeResults$1.L$1 = null;
                                investHomeV2ViewModel$analyzeResults$1.L$2 = null;
                                investHomeV2ViewModel$analyzeResults$1.L$3 = null;
                                investHomeV2ViewModel$analyzeResults$1.L$4 = null;
                                investHomeV2ViewModel$analyzeResults$1.Z$0 = z2;
                                investHomeV2ViewModel$analyzeResults$1.label = 10;
                                if (mutableStateFlow7.emit(c0339TaskDescription, investHomeV2ViewModel$analyzeResults$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else if (booleanRef.element) {
                                MutableStateFlow<TaskDescription> mutableStateFlow8 = investHomeV2ViewModel2.gEmmrt;
                                TaskDescription.StateListAnimator stateListAnimator = new TaskDescription.StateListAnimator(list2);
                                investHomeV2ViewModel$analyzeResults$1.L$0 = investHomeV2ViewModel2;
                                investHomeV2ViewModel$analyzeResults$1.L$1 = null;
                                investHomeV2ViewModel$analyzeResults$1.L$2 = null;
                                investHomeV2ViewModel$analyzeResults$1.L$3 = null;
                                investHomeV2ViewModel$analyzeResults$1.L$4 = null;
                                investHomeV2ViewModel$analyzeResults$1.Z$0 = z2;
                                investHomeV2ViewModel$analyzeResults$1.label = 11;
                                if (mutableStateFlow8.emit(stateListAnimator, investHomeV2ViewModel$analyzeResults$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                MutableStateFlow<TaskDescription> mutableStateFlow9 = investHomeV2ViewModel2.gEmmrt;
                                TaskDescription.ActionBar actionBar3 = new TaskDescription.ActionBar("");
                                investHomeV2ViewModel$analyzeResults$1.L$0 = investHomeV2ViewModel2;
                                investHomeV2ViewModel$analyzeResults$1.L$1 = null;
                                investHomeV2ViewModel$analyzeResults$1.L$2 = null;
                                investHomeV2ViewModel$analyzeResults$1.L$3 = null;
                                investHomeV2ViewModel$analyzeResults$1.L$4 = null;
                                investHomeV2ViewModel$analyzeResults$1.Z$0 = z2;
                                investHomeV2ViewModel$analyzeResults$1.label = 12;
                                if (mutableStateFlow9.emit(actionBar3, investHomeV2ViewModel$analyzeResults$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                            investHomeV2ViewModel5 = investHomeV2ViewModel2;
                            z8 = z2;
                            if (z8) {
                                return Unit.INSTANCE;
                            }
                            MutableSharedFlow<Unit> mutableSharedFlow = investHomeV2ViewModel5.OLrzqt;
                            Unit unit = Unit.INSTANCE;
                            investHomeV2ViewModel$analyzeResults$1.L$0 = null;
                            investHomeV2ViewModel$analyzeResults$1.label = 13;
                            if (mutableSharedFlow.emit(unit, investHomeV2ViewModel$analyzeResults$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        z4 = true;
                        list2.add(requestType);
                        MutableStateFlow<InterfaceC26470jct> mutableStateFlow10 = investHomeV2ViewModel2.KWHzl;
                        InterfaceC26470jct.Application application2 = InterfaceC26470jct.Application.OLrzqt;
                        investHomeV2ViewModel$analyzeResults$1.L$0 = investHomeV2ViewModel2;
                        investHomeV2ViewModel$analyzeResults$1.L$1 = requestTypeArr;
                        investHomeV2ViewModel$analyzeResults$1.L$2 = list2;
                        investHomeV2ViewModel$analyzeResults$1.L$3 = booleanRef;
                        investHomeV2ViewModel$analyzeResults$1.L$4 = it;
                        investHomeV2ViewModel$analyzeResults$1.Z$0 = z2;
                        investHomeV2ViewModel$analyzeResults$1.I$0 = i5;
                        investHomeV2ViewModel$analyzeResults$1.label = 2;
                        if (mutableStateFlow10.emit(application2, investHomeV2ViewModel$analyzeResults$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        z3 = z2;
                        investHomeV2ViewModel3 = investHomeV2ViewModel2;
                        i2 = i5;
                        int i72 = i2;
                        investHomeV2ViewModel2 = investHomeV2ViewModel3;
                        z2 = z3;
                        i = i72;
                        z10 = z4;
                        if (it.hasNext()) {
                        }
                    }
                }
                break;
            case 1:
                i2 = investHomeV2ViewModel$analyzeResults$1.I$0;
                z3 = investHomeV2ViewModel$analyzeResults$1.Z$0;
                it = (Iterator) investHomeV2ViewModel$analyzeResults$1.L$4;
                booleanRef = (Ref.BooleanRef) investHomeV2ViewModel$analyzeResults$1.L$3;
                list2 = (List) investHomeV2ViewModel$analyzeResults$1.L$2;
                requestTypeArr = (RequestType[]) investHomeV2ViewModel$analyzeResults$1.L$1;
                InvestHomeV2ViewModel investHomeV2ViewModel6 = (InvestHomeV2ViewModel) investHomeV2ViewModel$analyzeResults$1.L$0;
                C56391yDq.AEQbTJ(obj);
                investHomeV2ViewModel3 = investHomeV2ViewModel6;
                z4 = true;
                booleanRef.element = z4;
                int i722 = i2;
                investHomeV2ViewModel2 = investHomeV2ViewModel3;
                z2 = z3;
                i = i722;
                z10 = z4;
                if (it.hasNext()) {
                }
                break;
            case 2:
                i2 = investHomeV2ViewModel$analyzeResults$1.I$0;
                z3 = investHomeV2ViewModel$analyzeResults$1.Z$0;
                it = (Iterator) investHomeV2ViewModel$analyzeResults$1.L$4;
                booleanRef = (Ref.BooleanRef) investHomeV2ViewModel$analyzeResults$1.L$3;
                list2 = (List) investHomeV2ViewModel$analyzeResults$1.L$2;
                requestTypeArr = (RequestType[]) investHomeV2ViewModel$analyzeResults$1.L$1;
                InvestHomeV2ViewModel investHomeV2ViewModel7 = (InvestHomeV2ViewModel) investHomeV2ViewModel$analyzeResults$1.L$0;
                C56391yDq.AEQbTJ(obj);
                investHomeV2ViewModel3 = investHomeV2ViewModel7;
                z4 = true;
                int i7222 = i2;
                investHomeV2ViewModel2 = investHomeV2ViewModel3;
                z2 = z3;
                i = i7222;
                z10 = z4;
                if (it.hasNext()) {
                }
                break;
            case 3:
                i3 = investHomeV2ViewModel$analyzeResults$1.I$0;
                z5 = investHomeV2ViewModel$analyzeResults$1.Z$0;
                it = (Iterator) investHomeV2ViewModel$analyzeResults$1.L$4;
                booleanRef = (Ref.BooleanRef) investHomeV2ViewModel$analyzeResults$1.L$3;
                list2 = (List) investHomeV2ViewModel$analyzeResults$1.L$2;
                requestTypeArr = (RequestType[]) investHomeV2ViewModel$analyzeResults$1.L$1;
                investHomeV2ViewModel4 = (InvestHomeV2ViewModel) investHomeV2ViewModel$analyzeResults$1.L$0;
                C56391yDq.AEQbTJ(obj);
                investHomeV2ViewModel$analyzeResults$1.L$0 = investHomeV2ViewModel4;
                investHomeV2ViewModel$analyzeResults$1.L$1 = requestTypeArr;
                investHomeV2ViewModel$analyzeResults$1.L$2 = list2;
                investHomeV2ViewModel$analyzeResults$1.L$3 = booleanRef;
                investHomeV2ViewModel$analyzeResults$1.L$4 = it;
                investHomeV2ViewModel$analyzeResults$1.Z$0 = z5;
                investHomeV2ViewModel$analyzeResults$1.I$0 = i3;
                investHomeV2ViewModel$analyzeResults$1.label = 4;
                if (investHomeV2ViewModel4.OLrzqt(investHomeV2ViewModel$analyzeResults$1) != objCopydefault) {
                }
                break;
            case 4:
                i3 = investHomeV2ViewModel$analyzeResults$1.I$0;
                z5 = investHomeV2ViewModel$analyzeResults$1.Z$0;
                it = (Iterator) investHomeV2ViewModel$analyzeResults$1.L$4;
                booleanRef = (Ref.BooleanRef) investHomeV2ViewModel$analyzeResults$1.L$3;
                list2 = (List) investHomeV2ViewModel$analyzeResults$1.L$2;
                requestTypeArr = (RequestType[]) investHomeV2ViewModel$analyzeResults$1.L$1;
                investHomeV2ViewModel4 = (InvestHomeV2ViewModel) investHomeV2ViewModel$analyzeResults$1.L$0;
                C56391yDq.AEQbTJ(obj);
                z6 = true;
                booleanRef.element = z6;
                investHomeV2ViewModel4.AuCTel();
                z2 = z5;
                i = i3;
                investHomeV2ViewModel2 = investHomeV2ViewModel4;
                z4 = true;
                z10 = z4;
                if (it.hasNext()) {
                }
                break;
            case 5:
            case 7:
            case 9:
                i3 = investHomeV2ViewModel$analyzeResults$1.I$0;
                z5 = investHomeV2ViewModel$analyzeResults$1.Z$0;
                it = (Iterator) investHomeV2ViewModel$analyzeResults$1.L$4;
                booleanRef = (Ref.BooleanRef) investHomeV2ViewModel$analyzeResults$1.L$3;
                list2 = (List) investHomeV2ViewModel$analyzeResults$1.L$2;
                requestTypeArr = (RequestType[]) investHomeV2ViewModel$analyzeResults$1.L$1;
                investHomeV2ViewModel4 = (InvestHomeV2ViewModel) investHomeV2ViewModel$analyzeResults$1.L$0;
                C56391yDq.AEQbTJ(obj);
                z2 = z5;
                i = i3;
                investHomeV2ViewModel2 = investHomeV2ViewModel4;
                z4 = true;
                z10 = z4;
                if (it.hasNext()) {
                }
                break;
            case 6:
                i3 = investHomeV2ViewModel$analyzeResults$1.I$0;
                z7 = investHomeV2ViewModel$analyzeResults$1.Z$0;
                it = (Iterator) investHomeV2ViewModel$analyzeResults$1.L$4;
                booleanRef = (Ref.BooleanRef) investHomeV2ViewModel$analyzeResults$1.L$3;
                list2 = (List) investHomeV2ViewModel$analyzeResults$1.L$2;
                requestTypeArr = (RequestType[]) investHomeV2ViewModel$analyzeResults$1.L$1;
                investHomeV2ViewModel4 = (InvestHomeV2ViewModel) investHomeV2ViewModel$analyzeResults$1.L$0;
                C56391yDq.AEQbTJ(obj);
                booleanRef.element = true;
                z2 = z7;
                i = i3;
                investHomeV2ViewModel2 = investHomeV2ViewModel4;
                z4 = true;
                z10 = z4;
                if (it.hasNext()) {
                }
                break;
            case 8:
                i3 = investHomeV2ViewModel$analyzeResults$1.I$0;
                z7 = investHomeV2ViewModel$analyzeResults$1.Z$0;
                it = (Iterator) investHomeV2ViewModel$analyzeResults$1.L$4;
                booleanRef = (Ref.BooleanRef) investHomeV2ViewModel$analyzeResults$1.L$3;
                list2 = (List) investHomeV2ViewModel$analyzeResults$1.L$2;
                requestTypeArr = (RequestType[]) investHomeV2ViewModel$analyzeResults$1.L$1;
                investHomeV2ViewModel4 = (InvestHomeV2ViewModel) investHomeV2ViewModel$analyzeResults$1.L$0;
                C56391yDq.AEQbTJ(obj);
                z9 = true;
                booleanRef.element = z9;
                z2 = z7;
                i = i3;
                investHomeV2ViewModel2 = investHomeV2ViewModel4;
                z4 = true;
                z10 = z4;
                if (it.hasNext()) {
                }
                break;
            case 10:
            case 11:
            case 12:
                z8 = investHomeV2ViewModel$analyzeResults$1.Z$0;
                investHomeV2ViewModel5 = (InvestHomeV2ViewModel) investHomeV2ViewModel$analyzeResults$1.L$0;
                C56391yDq.AEQbTJ(obj);
                if (z8) {
                }
                break;
            case 13:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void AuCTel() {
        HomeTokensResponse homeTokensResponseEZpvd;
        List<HomeTokensItemData> listKWHzl;
        HomeTokensItemData homeTokensItemData;
        InterfaceC26474jcx value = this.zsXlph.getValue();
        String strDjBIcL = null;
        InterfaceC26474jcx.StateListAnimator stateListAnimator = value instanceof InterfaceC26474jcx.StateListAnimator ? (InterfaceC26474jcx.StateListAnimator) value : null;
        if (stateListAnimator != null && (homeTokensResponseEZpvd = stateListAnimator.EZpvd()) != null && (listKWHzl = homeTokensResponseEZpvd.KWHzl()) != null && (homeTokensItemData = (HomeTokensItemData) CollectionsKt___CollectionsKt.AkhnZx(listKWHzl, 0)) != null) {
            strDjBIcL = homeTokensItemData.djBIcL();
        }
        if (C33129mqd.OLrzqt((CharSequence) strDjBIcL)) {
            C25595izg.AEQbTJ.AEQbTJ("invest_global").OLrzqt().addIncrementListener(this.zuBGHE, this.iwGUEr);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.AubY.AEQbTJ();
    }

    public static /* synthetic */ Deferred getInitDataAsync$default(InvestHomeV2ViewModel investHomeV2ViewModel, CoroutineScope coroutineScope, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return investHomeV2ViewModel.OLrzqt(coroutineScope, z, z2);
    }

    public final Deferred<Result<C25542iyg>> OLrzqt(CoroutineScope coroutineScope, boolean z, boolean z2) {
        return BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new InvestHomeV2ViewModel$getInitDataAsync$1(z, this, z2, null), 3, null);
    }

    public static /* synthetic */ Deferred getTabsDataAsync$default(InvestHomeV2ViewModel investHomeV2ViewModel, CoroutineScope coroutineScope, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return investHomeV2ViewModel.KWHzl(coroutineScope, z, z2);
    }

    public final Deferred<Result<List<HomeTab>>> KWHzl(CoroutineScope coroutineScope, boolean z, boolean z2) {
        return BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new InvestHomeV2ViewModel$getTabsDataAsync$1(z, this, z2, null), 3, null);
    }

    public static /* synthetic */ Deferred getLearnDataAsync$OKDeFi_invest_biz$default(InvestHomeV2ViewModel investHomeV2ViewModel, CoroutineScope coroutineScope, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return investHomeV2ViewModel.copydefault(coroutineScope, z, z2);
    }

    public final Deferred<Result<HomeLearnEarnVO>> copydefault(@NotNull CoroutineScope coroutineScope, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        return BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new InvestHomeV2ViewModel$getLearnDataAsync$1(z, this, z2, null), 3, null);
    }

    public static /* synthetic */ Deferred getHomeTokensAsync$OKDeFi_invest_biz$default(InvestHomeV2ViewModel investHomeV2ViewModel, CoroutineScope coroutineScope, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return investHomeV2ViewModel.AEQbTJ(coroutineScope, z, z2);
    }

    public final Deferred<Result<HomeTokensResponse>> AEQbTJ(@NotNull CoroutineScope coroutineScope, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        return BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new InvestHomeV2ViewModel$getHomeTokensAsync$1(z, this, z2, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(Continuation<? super Unit> continuation) throws Throwable {
        InvestHomeV2ViewModel$getTokenDetails$1 investHomeV2ViewModel$getTokenDetails$1;
        List<String> listAhwBna;
        Object objM7386unboximpl;
        InvestHomeV2ViewModel investHomeV2ViewModel;
        List<HomeTokensItemData> listKWHzl;
        InvestHomeV2ViewModel investHomeV2ViewModel2;
        if (continuation instanceof InvestHomeV2ViewModel$getTokenDetails$1) {
            investHomeV2ViewModel$getTokenDetails$1 = (InvestHomeV2ViewModel$getTokenDetails$1) continuation;
            int i = investHomeV2ViewModel$getTokenDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investHomeV2ViewModel$getTokenDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                investHomeV2ViewModel$getTokenDetails$1 = new InvestHomeV2ViewModel$getTokenDetails$1(this, continuation);
            }
        }
        Object obj = investHomeV2ViewModel$getTokenDetails$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = investHomeV2ViewModel$getTokenDetails$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            HomeTokensResponse homeTokensResponse = this.djBIcL;
            if (homeTokensResponse == null || (listKWHzl = homeTokensResponse.KWHzl()) == null) {
                listAhwBna = yDY.AhwBna();
            } else {
                listAhwBna = new ArrayList<>(C56403yEb.AYXKKw(listKWHzl, 10));
                Iterator<T> it = listKWHzl.iterator();
                while (it.hasNext()) {
                    listAhwBna.add(C33129mqd.gEmmrt(C56443yFo.KWHzl(((HomeTokensItemData) it.next()).AEQbTJ())));
                }
            }
            if (!listAhwBna.isEmpty()) {
                iGF igf = this.zLjUOn;
                investHomeV2ViewModel$getTokenDetails$1.L$0 = this;
                investHomeV2ViewModel$getTokenDetails$1.label = 1;
                Object objKWHzl = igf.KWHzl(listAhwBna, investHomeV2ViewModel$getTokenDetails$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                objM7386unboximpl = objKWHzl;
                investHomeV2ViewModel = this;
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                }
                if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
                }
            }
        } else if (i2 == 1) {
            InvestHomeV2ViewModel investHomeV2ViewModel3 = (InvestHomeV2ViewModel) investHomeV2ViewModel$getTokenDetails$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
            investHomeV2ViewModel = investHomeV2ViewModel3;
            if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                MutableStateFlow<List<TokenInvestDetail>> mutableStateFlow = investHomeV2ViewModel.valueOf;
                List<TokenInvestDetail> listOLrzqt = ((TokenInvestDetailResponse) objM7386unboximpl).OLrzqt();
                investHomeV2ViewModel$getTokenDetails$1.L$0 = investHomeV2ViewModel;
                investHomeV2ViewModel$getTokenDetails$1.L$1 = objM7386unboximpl;
                investHomeV2ViewModel$getTokenDetails$1.label = 2;
                if (mutableStateFlow.emit(listOLrzqt, investHomeV2ViewModel$getTokenDetails$1) == objCopydefault) {
                    return objCopydefault;
                }
                investHomeV2ViewModel2 = investHomeV2ViewModel;
                investHomeV2ViewModel = investHomeV2ViewModel2;
            }
            if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
            }
        } else if (i2 == 2) {
            objM7386unboximpl = investHomeV2ViewModel$getTokenDetails$1.L$1;
            investHomeV2ViewModel2 = (InvestHomeV2ViewModel) investHomeV2ViewModel$getTokenDetails$1.L$0;
            C56391yDq.AEQbTJ(obj);
            investHomeV2ViewModel = investHomeV2ViewModel2;
            if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
                MutableStateFlow<List<TokenInvestDetail>> mutableStateFlow2 = investHomeV2ViewModel.valueOf;
                investHomeV2ViewModel$getTokenDetails$1.L$0 = objM7386unboximpl;
                investHomeV2ViewModel$getTokenDetails$1.L$1 = null;
                investHomeV2ViewModel$getTokenDetails$1.label = 3;
                if (mutableStateFlow2.emit(null, investHomeV2ViewModel$getTokenDetails$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    public final Job AYXKKw() {
        return C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestHomeV2ViewModel$getLearnData$1(this, null), 3, null);
    }

    public final Job EZpvd() {
        return C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestHomeV2ViewModel$getBannerData$1(this, null), 3, null);
    }

    public final Job gEmmrt() {
        return C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestHomeV2ViewModel$getTabsData$1(this, null), 3, null);
    }

    public final Job djBIcL() {
        return C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestHomeV2ViewModel$getHomeTokens$1(this, null), 3, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RequestType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ RequestType[] $VALUES;
        public static final RequestType CAROUSEL = new RequestType("CAROUSEL", 0);
        public static final RequestType TOKENS = new RequestType("TOKENS", 1);
        public static final RequestType TABS = new RequestType("TABS", 2);
        public static final RequestType LEARN = new RequestType("LEARN", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ RequestType[] $values() {
            return new RequestType[]{CAROUSEL, TOKENS, TABS, LEARN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<RequestType> getEntries() {
            return $ENTRIES;
        }

        private RequestType(String str, int i) {
        }

        static {
            RequestType[] requestTypeArr$values = $values();
            $VALUES = requestTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(requestTypeArr$values);
        }

        public static RequestType valueOf(String str) {
            return (RequestType) Enum.valueOf(RequestType.class, str);
        }

        public static RequestType[] values() {
            return (RequestType[]) $VALUES.clone();
        }
    }

    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.home.InvestHomeV2ViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Activity extends TaskDescription {
            public static final Activity EZpvd = new Activity();

            private Activity() {
                super(null);
            }
        }

        private TaskDescription() {
        }

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.home.InvestHomeV2ViewModel$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0339TaskDescription extends TaskDescription {
            public static final C0339TaskDescription KWHzl = new C0339TaskDescription();

            private C0339TaskDescription() {
                super(null);
            }
        }

        public static final class StateListAnimator extends TaskDescription {
            public final List<RequestType> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.home.InvestHomeV2ViewModel$TaskDescription$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = stateListAnimator.copydefault;
                }
                return stateListAnimator.AEQbTJ(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator AEQbTJ(@NotNull List<? extends RequestType> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new StateListAnimator(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.copydefault, ((StateListAnimator) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "PartialSuccess(failedRequests=" + this.copydefault + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.invest_biz.ui.screens.home.InvestHomeV2ViewModel$RequestType> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public StateListAnimator(@NotNull List<? extends RequestType> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.copydefault = list;
            }
        }

        public static final class ActionBar extends TaskDescription {
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.OLrzqt;
                }
                return actionBar.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar KWHzl(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ActionBar(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((ActionBar) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Failed(error=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }
    }

    public final void fJNWhG() {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestHomeV2ViewModel$trackCampaignExposureEvent$1(this, null), 3, null);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestHomeV2ViewModel$trackClickEvent$1(this, str, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestHomeV2ViewModel$trackCampaignLaunch$1(this, str, null), 3, null);
    }

    public final void KWHzl(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestHomeV2ViewModel$trackHotCardClick$1(this, j, str, null), 3, null);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestHomeV2ViewModel$trackLearnCardClick$1(this, str, null), 3, null);
    }

    public final Object copydefault(@NotNull Continuation<? super Unit> continuation) {
        this.fARcdN = !this.fARcdN;
        Object objOLrzqt = OLrzqt(continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.invest_biz.data.bean.HomeTokensResponse.copy$default(com.okinc.business.invest_biz.data.bean.HomeTokensResponse, int, java.util.List, int, java.lang.Object):com.okinc.business.invest_biz.data.bean.HomeTokensResponse */
    public final Object OLrzqt(Continuation<? super Unit> continuation) {
        HomeTokensResponse homeTokensResponseCopy$default = this.djBIcL;
        if (homeTokensResponseCopy$default == null) {
            return Unit.INSTANCE;
        }
        if (!this.fARcdN) {
            homeTokensResponseCopy$default = HomeTokensResponse.copy$default(homeTokensResponseCopy$default, 0, CollectionsKt___CollectionsKt.AhwBna((Iterable) homeTokensResponseCopy$default.KWHzl(), 5), 1, null);
        }
        Object objEmit = this.AYXKKw.emit(new InterfaceC26474jcx.StateListAnimator(homeTokensResponseCopy$default), continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    public final boolean fARcdN() {
        List<HomeTokensItemData> listKWHzl;
        HomeTokensResponse homeTokensResponse = this.djBIcL;
        return (homeTokensResponse == null || (listKWHzl = homeTokensResponse.KWHzl()) == null || listKWHzl.size() <= 5) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(long j, @NotNull Continuation<? super Result<TokenInvestDetailResponse>> continuation) throws Throwable {
        InvestHomeV2ViewModel$getClickInvestmentDetail$1 investHomeV2ViewModel$getClickInvestmentDetail$1;
        if (continuation instanceof InvestHomeV2ViewModel$getClickInvestmentDetail$1) {
            investHomeV2ViewModel$getClickInvestmentDetail$1 = (InvestHomeV2ViewModel$getClickInvestmentDetail$1) continuation;
            int i = investHomeV2ViewModel$getClickInvestmentDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investHomeV2ViewModel$getClickInvestmentDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                investHomeV2ViewModel$getClickInvestmentDetail$1 = new InvestHomeV2ViewModel$getClickInvestmentDetail$1(this, continuation);
            }
        }
        Object obj = investHomeV2ViewModel$getClickInvestmentDetail$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = investHomeV2ViewModel$getClickInvestmentDetail$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        iGF igf = this.zLjUOn;
        List<String> listEZpvd = C56402yEa.EZpvd(C33129mqd.gEmmrt(C56443yFo.KWHzl(j)));
        investHomeV2ViewModel$getClickInvestmentDetail$1.label = 1;
        Object objKWHzl = igf.KWHzl(listEZpvd, investHomeV2ViewModel$getClickInvestmentDetail$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }
}
