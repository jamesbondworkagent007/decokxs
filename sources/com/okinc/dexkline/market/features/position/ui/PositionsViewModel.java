package com.okinc.dexkline.market.features.position.ui;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.dexkline.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.dexkline.dexlogic.txs.TxType;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.position.ui.PositionsViewModel;
import com.okinc.dexkline.market.features.position.ui.widget.PnLDetailsUiModel;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C33129mqd;
import o.C34379nav;
import o.C34380naw;
import o.C34446ncI;
import o.C34455ncR;
import o.C34457ncT;
import o.C34462ncY;
import o.C34466ncc;
import o.C34467ncd;
import o.C34474nck;
import o.C34479ncp;
import o.C43251rlk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.InterfaceC32389mcE;
import o.InterfaceC56387yDm;
import o.mRE;
import o.mUR;
import o.xHC;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class PositionsViewModel extends ViewModel {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final MutableStateFlow<Pair<C34479ncp, xHC.ActionBar>> AEQbTJ;
    public final StateFlow<C34474nck> AYXKKw;
    public final MutableStateFlow<C34457ncT> AhwBna;
    public TokenFilter AkhnZx;
    public final PositionDetailsParam AuCTel;
    public final Flow<C34446ncI> AuCTelauCTel;
    public final StateFlow<C34455ncR> AubY;
    public final TokenFilter DbNXlk;
    public final MutableStateFlow<C34380naw> EZpvd;
    public final MutableStateFlow<C34474nck> KWHzl;
    public final MutableStateFlow<C34455ncR> OLrzqt;
    public final Flow<C34446ncI> djBIcL;
    public String ejfBZ;
    public DexMultiTokenInfoBean fARcdN;
    public final StateFlow<Pair<C34479ncp, xHC.ActionBar>> fIwbmz;
    public final C34467ncd fJNWhG;
    public boolean fetchVPNInfo;
    public final C34379nav gEmmrt;
    public final StateFlow<Boolean> getFieldNames;
    public final StateFlow<C34457ncT> getNewProxyInstance;
    public boolean hDKMBd;
    public boolean isConnected;
    public final C34466ncc iwGUEr;
    public final StateFlow<C34380naw> uzCIH;
    public final MutableStateFlow<Boolean> valueOf;
    public xHC.ActionBar values;
    public final InterfaceC56387yDm zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Pair<C34479ncp, xHC.ActionBar>> AhwBna() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C34457ncT> AkhnZx() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter EZpvd() {
        TokenFilter tokenFilter = this.AkhnZx;
        return tokenFilter == null ? this.DbNXlk : tokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C34474nck> copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C34380naw> djBIcL() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C34455ncR> fetchVPNInfo() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> valueOf() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<C34446ncI> values() {
        return this.AuCTelauCTel;
    }

    @yCM
    public PositionsViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C34466ncc c34466ncc, @NotNull C34467ncd c34467ncd, @NotNull C34379nav c34379nav) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c34466ncc, "");
        Intrinsics.checkNotNullParameter(c34467ncd, "");
        Intrinsics.checkNotNullParameter(c34379nav, "");
        this.iwGUEr = c34466ncc;
        this.fJNWhG = c34467ncd;
        this.gEmmrt = c34379nav;
        PositionDetailsParam positionDetailsParam = (PositionDetailsParam) savedStateHandle.get("key.position_details");
        this.AuCTel = positionDetailsParam == null ? new PositionDetailsParam((String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, false, 255, (DefaultConstructorMarker) null) : positionDetailsParam;
        this.fetchVPNInfo = true;
        this.hDKMBd = true;
        this.zsXlph = C56392yDr.copydefault(new Function0() { // from class: o.ncP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PositionsViewModel.AEQbTJ();
            }
        });
        MutableStateFlow<C34457ncT> MutableStateFlow = StateFlowKt.MutableStateFlow(new C34457ncT(true, false, null, null, null, 30, null));
        this.AhwBna = MutableStateFlow;
        this.getNewProxyInstance = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C34455ncR> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C34455ncR(true, false, false, null, null, false, 62, null));
        this.OLrzqt = MutableStateFlow2;
        this.AubY = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Pair<C34479ncp, xHC.ActionBar>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new Pair(new C34479ncp(null, null, 3, null), new xHC.ActionBar(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1023, null)));
        this.AEQbTJ = MutableStateFlow3;
        this.fIwbmz = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.valueOf = MutableStateFlow4;
        this.getFieldNames = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<C34380naw> MutableStateFlow5 = StateFlowKt.MutableStateFlow(new C34380naw(false, false, null, false, 15, null));
        this.EZpvd = MutableStateFlow5;
        this.uzCIH = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<C34474nck> MutableStateFlow6 = StateFlowKt.MutableStateFlow(new C34474nck(true, null, 2, null));
        this.KWHzl = MutableStateFlow6;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow6);
        Flow<C34446ncI> flowCombine = FlowKt.combine(MutableStateFlow, MutableStateFlow3, MutableStateFlow2, new PositionsViewModel$_uiState$1(this, null));
        this.djBIcL = flowCombine;
        this.AuCTelauCTel = flowCombine;
        this.ejfBZ = "";
        this.fARcdN = new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, -1, 33554431, (DefaultConstructorMarker) null);
        this.values = new xHC.ActionBar(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1023, null);
        this.DbNXlk = new TokenFilter(null, null, TxType.ALL.getValue(), null, null, false, false, null, false, false, null, null, null, null, 16283, null);
        this.isConnected = true;
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(null), 3, null);
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass3(null), 3, null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.features.position.ui.PositionsViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final InterfaceC32389mcE DbNXlk() {
        return (InterfaceC32389mcE) this.zsXlph.getValue();
    }

    public static final InterfaceC32389mcE AEQbTJ() {
        return (InterfaceC32389mcE) C43251rlk.copydefault(InterfaceC32389mcE.class);
    }

    /* JADX INFO: renamed from: com.okinc.dexkline.market.features.position.ui.PositionsViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionsViewModel.this.new AnonymousClass1(continuation);
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
                StateFlow<List<C34462ncY>> stateFlowCopydefault = PositionsViewModel.this.iwGUEr.copydefault();
                final PositionsViewModel positionsViewModel = PositionsViewModel.this;
                FlowCollector<? super List<C34462ncY>> flowCollector = new FlowCollector() { // from class: com.okinc.dexkline.market.features.position.ui.PositionsViewModel.1.2
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public final Object emit(List<C34462ncY> list, Continuation<? super Unit> continuation) {
                        positionsViewModel.OLrzqt.setValue(new C34455ncR(false, false, positionsViewModel.fetchVPNInfo().getValue().OLrzqt(), list, null, false, 51, null));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowCopydefault.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.dexkline.market.features.position.ui.PositionsViewModel$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionsViewModel.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.dexkline.market.features.position.ui.PositionsViewModel$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ PositionsViewModel AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(PositionsViewModel positionsViewModel) {
                this.AEQbTJ = positionsViewModel;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            /* JADX DEBUG: Multi-variable search result rejected for r6v13, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
            /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
            /* JADX DEBUG: Multi-variable search result rejected for r6v6, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(PnLDetailsUiModel pnLDetailsUiModel, Continuation<? super Unit> continuation) throws Throwable {
                PositionsViewModel$2$1$emit$1 positionsViewModel$2$1$emit$1;
                MutableStateFlow mutableStateFlow;
                if (continuation instanceof PositionsViewModel$2$1$emit$1) {
                    positionsViewModel$2$1$emit$1 = (PositionsViewModel$2$1$emit$1) continuation;
                    int i = positionsViewModel$2$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        positionsViewModel$2$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        positionsViewModel$2$1$emit$1 = new PositionsViewModel$2$1$emit$1(this, continuation);
                    }
                }
                Object obj = positionsViewModel$2$1$emit$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = positionsViewModel$2$1$emit$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj);
                    MutableStateFlow mutableStateFlow2 = this.AEQbTJ.valueOf;
                    C34467ncd c34467ncd = this.AEQbTJ.fJNWhG;
                    PositionDetailsParam positionDetailsParam = this.AEQbTJ.AuCTel;
                    positionsViewModel$2$1$emit$1.L$0 = mutableStateFlow2;
                    positionsViewModel$2$1$emit$1.label = 1;
                    Object objAEQbTJ = c34467ncd.AEQbTJ(positionDetailsParam, positionsViewModel$2$1$emit$1);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    obj = objAEQbTJ;
                    mutableStateFlow = mutableStateFlow2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    MutableStateFlow mutableStateFlow3 = (MutableStateFlow) positionsViewModel$2$1$emit$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    mutableStateFlow = mutableStateFlow3;
                }
                mutableStateFlow.setValue(obj);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<PnLDetailsUiModel> stateFlowOLrzqt = PositionsViewModel.this.fJNWhG.OLrzqt();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PositionsViewModel.this);
                this.label = 1;
                if (stateFlowOLrzqt.collect(anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.dexkline.market.features.position.ui.PositionsViewModel$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionsViewModel.this.new AnonymousClass3(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            PositionsViewModel positionsViewModel;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PositionsViewModel positionsViewModel2 = PositionsViewModel.this;
                C34379nav c34379nav = positionsViewModel2.gEmmrt;
                this.L$0 = positionsViewModel2;
                this.label = 1;
                Object objAEQbTJ = c34379nav.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                positionsViewModel = positionsViewModel2;
                obj = objAEQbTJ;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                positionsViewModel = (PositionsViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            positionsViewModel.hDKMBd = ((Boolean) obj).booleanValue();
            PositionsViewModel.this.EZpvd.setValue(C34380naw.copy$default((C34380naw) PositionsViewModel.this.EZpvd.getValue(), PositionsViewModel.this.hDKMBd, false, null, false, 14, null));
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl(boolean z) {
        this.fetchVPNInfo = z;
        loadRecentTransactions$default(this, 0L, 1, null);
    }

    public final void AEQbTJ(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        this.AkhnZx = tokenFilter;
        loadRecentTransactions$default(this, 0L, 1, null);
    }

    public final void KWHzl() {
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$dismissAlert$1(this, null), 3, null);
    }

    public final C34446ncI KWHzl(boolean z, boolean z2) {
        return new C34446ncI(false, z, z2, false, null, 25, null);
    }

    public final C34446ncI copydefault(C34457ncT c34457ncT, C34479ncp c34479ncp, C34455ncR c34455ncR) {
        C34446ncI c34446ncI;
        if (c34457ncT.KWHzl() || c34455ncR.EZpvd() || c34455ncR.AYXKKw()) {
            return KWHzl(c34457ncT.KWHzl(), c34455ncR.AYXKKw());
        }
        if (c34457ncT.OLrzqt() != null || (c34479ncp.OLrzqt() != null && c34455ncR.KWHzl() != null)) {
            Throwable thOLrzqt = c34457ncT.OLrzqt();
            if (thOLrzqt == null) {
                thOLrzqt = new OKServerException(6, null, null, null, 14, null);
            }
            c34446ncI = new C34446ncI(false, false, false, false, thOLrzqt, 15, null);
        } else if ((c34457ncT.AEQbTJ().length() == 0 || C33129mqd.OLrzqt((Object) c34457ncT.AEQbTJ(), (Object) 0)) && c34455ncR.copydefault().isEmpty()) {
            c34446ncI = new C34446ncI(false, false, false, false, new OKServerException(6, null, null, null, 14, null), 15, null);
        } else if (mRE.copydefault(Double.valueOf(C33129mqd.AEQbTJ(c34457ncT.AEQbTJ())), Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE)) && c34479ncp.KWHzl().KWHzl() && c34455ncR.copydefault().isEmpty()) {
            c34446ncI = new C34446ncI(c34455ncR.OLrzqt(), false, false, true, null, 22, null);
        } else if (C33129mqd.OLrzqt((CharSequence) c34457ncT.AEQbTJ()) && (!c34455ncR.copydefault().isEmpty())) {
            c34446ncI = new C34446ncI(c34455ncR.OLrzqt(), false, false, false, null, 30, null);
        } else {
            c34446ncI = ((!C33129mqd.OLrzqt((CharSequence) c34457ncT.AEQbTJ()) || c34479ncp.KWHzl().AEQbTJ()) && !c34455ncR.copydefault().isEmpty()) ? new C34446ncI(false, false, false, false, new OKServerException(8, null, null, null, 14, null), 15, null) : new C34446ncI(false, false, false, false, null, 30, null);
        }
        return c34446ncI;
    }

    public static /* synthetic */ void loadData$default(PositionsViewModel positionsViewModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = -1;
        }
        positionsViewModel.EZpvd(j);
    }

    public final void EZpvd(long j) {
        this.isConnected = false;
        AYXKKw();
        if (j == -1 || this.AubY.getValue().OLrzqt()) {
            AEQbTJ(j);
        }
    }

    public final void AYXKKw() {
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$getTokenBalanceAndLatestPnL$1(this, null), 3, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ncd.invoke-0E7RQCE$default(o.ncd, o.xHC$ActionBar, java.lang.String, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        PositionsViewModel$getLatestPnL$1 positionsViewModel$getLatestPnL$1;
        Object objM8696invoke0E7RQCE$default;
        PositionsViewModel positionsViewModel;
        if (continuation instanceof PositionsViewModel$getLatestPnL$1) {
            positionsViewModel$getLatestPnL$1 = (PositionsViewModel$getLatestPnL$1) continuation;
            int i = positionsViewModel$getLatestPnL$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                positionsViewModel$getLatestPnL$1.label = i - Integer.MIN_VALUE;
            } else {
                positionsViewModel$getLatestPnL$1 = new PositionsViewModel$getLatestPnL$1(this, continuation);
            }
        }
        PositionsViewModel$getLatestPnL$1 positionsViewModel$getLatestPnL$12 = positionsViewModel$getLatestPnL$1;
        Object obj = positionsViewModel$getLatestPnL$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = positionsViewModel$getLatestPnL$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C34467ncd c34467ncd = this.fJNWhG;
            xHC.ActionBar actionBar = this.values;
            positionsViewModel$getLatestPnL$12.L$0 = this;
            positionsViewModel$getLatestPnL$12.label = 1;
            objM8696invoke0E7RQCE$default = C34467ncd.m8696invoke0E7RQCE$default(c34467ncd, actionBar, null, positionsViewModel$getLatestPnL$12, 2, null);
            if (objM8696invoke0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
            positionsViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            positionsViewModel = (PositionsViewModel) positionsViewModel$getLatestPnL$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objM8696invoke0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM8696invoke0E7RQCE$default)) {
            positionsViewModel.AEQbTJ.setValue(C56390yDp.OLrzqt(new C34479ncp((PnLDetailsUiModel) objM8696invoke0E7RQCE$default, null, 2, null), positionsViewModel.values));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8696invoke0E7RQCE$default);
        if (thM7380exceptionOrNullimpl != null) {
            positionsViewModel.AEQbTJ.setValue(C56390yDp.OLrzqt(new C34479ncp(new PnLDetailsUiModel(false, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null), thM7380exceptionOrNullimpl), new xHC.ActionBar(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1023, null)));
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(xHC.ActionBar actionBar) {
        MutableStateFlow<C34457ncT> mutableStateFlow = this.AhwBna;
        String strOLrzqt = actionBar.OLrzqt();
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        mutableStateFlow.setValue(new C34457ncT(false, true, strOLrzqt, actionBar.copydefault(), null, 17, null));
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ejfBZ = str;
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$onTokenPriceChange$1(this, str, null), 3, null);
    }

    public static /* synthetic */ void loadRecentTransactions$default(PositionsViewModel positionsViewModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = -1;
        }
        positionsViewModel.AEQbTJ(j);
    }

    public final void AEQbTJ(long j) {
        C34455ncR c34455ncR;
        boolean z = j == -1;
        if (z) {
            c34455ncR = new C34455ncR(true, false, false, null, null, false, 62, null);
        } else {
            c34455ncR = new C34455ncR(false, true, false, null, null, false, 61, null);
        }
        if (!Intrinsics.EZpvd(EZpvd(), this.DbNXlk)) {
            this.OLrzqt.setValue(c34455ncR);
        }
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$loadRecentTransactions$1(this, j, z, null), 3, null);
    }

    public final void copydefault(@NotNull Function1<? super C34380naw, C34380naw> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd.setValue(function1.invoke(this.EZpvd.getValue()));
    }

    public final void ejfBZ() {
        TxType txType;
        TxType[] txTypeArrValues = TxType.values();
        int length = txTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                txType = null;
                break;
            }
            txType = txTypeArrValues[i];
            if (Intrinsics.EZpvd((Object) txType.getValue(), (Object) EZpvd().isConnected())) {
                break;
            } else {
                i++;
            }
        }
        if (txType == null) {
            txType = TxType.ALL;
        }
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$resumeWSs$1(this, txType, null), 3, null);
    }

    public final void fIwbmz() {
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$unsubscribeWSs$1(this, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        fIwbmz();
        super.onCleared();
    }
}
