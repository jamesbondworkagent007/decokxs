package com.okinc.business.market.features.position.ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C28434kah;
import o.C28443kaq;
import o.C28444kar;
import o.C29092knC;
import o.C29095knF;
import o.C29109knT;
import o.C29123knh;
import o.C29124kni;
import o.C29128knm;
import o.C29129knn;
import o.C29176koh;
import o.C29183koo;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class PositionsViewModel extends ViewModel {
    public final MutableStateFlow<C29092knC> AEQbTJ;
    public final MutableStateFlow<Boolean> AYXKKw;
    public final MutableStateFlow<C29176koh> AhwBna;
    public final TokenFilter AkhnZx;
    public final StateFlow<C29183koo> AuCTel;
    public final Flow<C29109knT> AuCTelauCTel;
    public final C29129knn DbNXlk;
    public final MutableStateFlow<C28443kaq> EZpvd;
    public final MutableStateFlow<C29183koo> KWHzl;
    public final MutableStateFlow<C29095knF> OLrzqt;
    public final MutableStateFlow<Boolean> copydefault;
    public final StateFlow<C29092knC> djBIcL;
    public final StateFlow<C29095knF> ejfBZ;
    public TokenFilter fARcdN;
    public final C29123knh fIwbmz;
    public final C29124kni fJNWhG;
    public final StateFlow<Boolean> fetchVPNInfo;
    public final Flow<C29109knT> gEmmrt;
    public final StateFlow<Boolean> getFieldNames;
    public final PositionDetailsParam getNewProxyInstance;
    public C28444kar hDKMBd;
    public boolean isConnected;
    public final StateFlow<C29176koh> iwGUEr;
    public final C29128knm uzCIH;
    public final C28434kah valueOf;
    public boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter AEQbTJ() {
        TokenFilter tokenFilter = this.fARcdN;
        return tokenFilter == null ? this.AkhnZx : tokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<C29109knT> AkhnZx() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29092knC> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29095knF> djBIcL() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29176koh> fetchVPNInfo() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28444kar gEmmrt() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29183koo> valueOf() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> values() {
        return this.getFieldNames;
    }

    public static final class ActionBar implements Flow<C29092knC> {
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ PositionsViewModel OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.market.features.position.ui.PositionsViewModel$ActionBar$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ PositionsViewModel AEQbTJ;
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, PositionsViewModel positionsViewModel) {
                this.KWHzl = flowCollector;
                this.AEQbTJ = positionsViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                PositionsViewModel$special$$inlined$map$1$2$1 positionsViewModel$special$$inlined$map$1$2$1;
                ArrayList arrayList;
                if (continuation instanceof PositionsViewModel$special$$inlined$map$1$2$1) {
                    positionsViewModel$special$$inlined$map$1$2$1 = (PositionsViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = positionsViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        positionsViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        positionsViewModel$special$$inlined$map$1$2$1 = new PositionsViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = positionsViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = positionsViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    C29092knC c29092knC = (C29092knC) obj;
                    List<HoldingAsset> listOLrzqt = c29092knC.OLrzqt();
                    if (listOLrzqt != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (T t : listOLrzqt) {
                            HoldingAsset holdingAsset = (HoldingAsset) t;
                            if (!Intrinsics.EZpvd((Object) holdingAsset.fetchVPNInfo(), (Object) this.AEQbTJ.getNewProxyInstance.getTokenAddress()) || !Intrinsics.EZpvd((Object) holdingAsset.OLrzqt(), (Object) this.AEQbTJ.getNewProxyInstance.getChainId())) {
                                arrayList2.add(t);
                            }
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    C29092knC c29092knCCopy$default = C29092knC.copy$default(c29092knC, false, arrayList, null, false, 0L, 29, null);
                    positionsViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(c29092knCCopy$default, positionsViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, PositionsViewModel positionsViewModel) {
            this.KWHzl = flow;
            this.OLrzqt = positionsViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super C29092knC> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass4(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public PositionsViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C29129knn c29129knn, @NotNull C29128knm c29128knm, @NotNull C29123knh c29123knh, @NotNull C29124kni c29124kni, @NotNull C28434kah c28434kah) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c29129knn, "");
        Intrinsics.checkNotNullParameter(c29128knm, "");
        Intrinsics.checkNotNullParameter(c29123knh, "");
        Intrinsics.checkNotNullParameter(c29124kni, "");
        Intrinsics.checkNotNullParameter(c28434kah, "");
        this.DbNXlk = c29129knn;
        this.uzCIH = c29128knm;
        this.fIwbmz = c29123knh;
        this.fJNWhG = c29124kni;
        this.valueOf = c28434kah;
        PositionDetailsParam positionDetailsParam = (PositionDetailsParam) savedStateHandle.get("key.position_details");
        this.getNewProxyInstance = positionDetailsParam == null ? new PositionDetailsParam((String) null, (String) null, false, (String) null, (String) null, false, (String) null, false, 255, (DefaultConstructorMarker) null) : positionDetailsParam;
        this.isConnected = true;
        this.EZpvd = StateFlowKt.MutableStateFlow(null);
        MutableStateFlow<C29176koh> MutableStateFlow = StateFlowKt.MutableStateFlow(new C29176koh(true, false, false, null, null, false, 62, null));
        this.AhwBna = MutableStateFlow;
        this.iwGUEr = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C29095knF> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C29095knF(true, null, null, 6, null));
        this.OLrzqt = MutableStateFlow2;
        this.ejfBZ = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<C29183koo> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow3;
        this.AuCTel = FlowKt.asStateFlow(MutableStateFlow3);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.AYXKKw = MutableStateFlow4;
        this.getFieldNames = FlowKt.asStateFlow(MutableStateFlow4);
        this.hDKMBd = new C28444kar(null, false, 3, null);
        MutableStateFlow<C29092knC> MutableStateFlow5 = StateFlowKt.MutableStateFlow(new C29092knC(false, null, null, false, 0L, 31, null));
        this.AEQbTJ = MutableStateFlow5;
        this.djBIcL = FlowKt.stateIn(new ActionBar(MutableStateFlow5, this), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getEagerly(), new C29092knC(false, null, null, false, 0L, 31, null));
        Flow<C29109knT> flowCombine = FlowKt.combine(MutableStateFlow2, MutableStateFlow5, new PositionsViewModel$_uiState$1(this, null));
        this.gEmmrt = flowCombine;
        this.AuCTelauCTel = flowCombine;
        MutableStateFlow<Boolean> MutableStateFlow6 = StateFlowKt.MutableStateFlow(bool);
        this.copydefault = MutableStateFlow6;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow6);
        this.AkhnZx = new TokenFilter(null, null, TxType.ALL.getValue(), null, null, false, false, null, false, false, null, null, null, 8091, null);
        this.values = true;
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass3(null), 3, null);
    }

    public final StateFlow<C28443kaq> KWHzl() {
        return FlowKt.asStateFlow(this.EZpvd);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.position.ui.PositionsViewModel$1, reason: invalid class name */
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

        /* JADX INFO: renamed from: com.okinc.business.market.features.position.ui.PositionsViewModel$1$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ PositionsViewModel AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(PositionsViewModel positionsViewModel) {
                this.AEQbTJ = positionsViewModel;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            /* JADX DEBUG: Multi-variable search result rejected for r11v3, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
            /* JADX DEBUG: Multi-variable search result rejected for r11v8, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
            /* JADX DEBUG: Multi-variable search result rejected for r11v9, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(PnLDetailsUiModel pnLDetailsUiModel, Continuation<? super Unit> continuation) throws Throwable {
                PositionsViewModel$1$1$emit$1 positionsViewModel$1$1$emit$1;
                MutableStateFlow mutableStateFlow;
                if (continuation instanceof PositionsViewModel$1$1$emit$1) {
                    positionsViewModel$1$1$emit$1 = (PositionsViewModel$1$1$emit$1) continuation;
                    int i = positionsViewModel$1$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        positionsViewModel$1$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        positionsViewModel$1$1$emit$1 = new PositionsViewModel$1$1$emit$1(this, continuation);
                    }
                }
                Object objAEQbTJ = positionsViewModel$1$1$emit$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = positionsViewModel$1$1$emit$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    this.AEQbTJ.OLrzqt.setValue(new C29095knF(false, pnLDetailsUiModel, null, 5, null));
                    MutableStateFlow mutableStateFlow2 = this.AEQbTJ.AYXKKw;
                    C29123knh c29123knh = this.AEQbTJ.fIwbmz;
                    PositionDetailsParam positionDetailsParam = this.AEQbTJ.getNewProxyInstance;
                    positionsViewModel$1$1$emit$1.L$0 = mutableStateFlow2;
                    positionsViewModel$1$1$emit$1.label = 1;
                    objAEQbTJ = c29123knh.AEQbTJ(positionDetailsParam, positionsViewModel$1$1$emit$1);
                    mutableStateFlow = mutableStateFlow2;
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    MutableStateFlow mutableStateFlow3 = (MutableStateFlow) positionsViewModel$1$1$emit$1.L$0;
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    mutableStateFlow = mutableStateFlow3;
                }
                mutableStateFlow.setValue(objAEQbTJ);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<PnLDetailsUiModel> stateFlowCopydefault = PositionsViewModel.this.fIwbmz.copydefault();
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(PositionsViewModel.this);
                this.label = 1;
                if (stateFlowCopydefault.collect(anonymousClass4, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.market.features.position.ui.PositionsViewModel$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            MutableStateFlow mutableStateFlow;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow2 = PositionsViewModel.this.EZpvd;
                C28434kah c28434kah = PositionsViewModel.this.valueOf;
                this.L$0 = mutableStateFlow2;
                this.label = 1;
                Object objCopydefault2 = c28434kah.copydefault(this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                mutableStateFlow = mutableStateFlow2;
                obj = objCopydefault2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            mutableStateFlow.setValue(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.position.ui.PositionsViewModel$3, reason: invalid class name */
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
            MutableStateFlow mutableStateFlow;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow2 = PositionsViewModel.this.copydefault;
                C29129knn c29129knn = PositionsViewModel.this.DbNXlk;
                this.L$0 = mutableStateFlow2;
                this.label = 1;
                Object objKWHzl = c29129knn.KWHzl(this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                mutableStateFlow = mutableStateFlow2;
                obj = objKWHzl;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            mutableStateFlow.setValue(obj);
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl(boolean z) {
        this.isConnected = z;
        loadRecentTransactions$default(this, 0L, 1, null);
    }

    public final void AEQbTJ(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        this.fARcdN = tokenFilter;
        loadRecentTransactions$default(this, 0L, 1, null);
    }

    public final void copydefault() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$dismissAlert$1(this, null), 3, null);
    }

    public final C29109knT EZpvd(C29095knF c29095knF, C29092knC c29092knC) {
        if (c29095knF.KWHzl() || c29092knC.KWHzl()) {
            return new C29109knT(true, null, 2, null);
        }
        if (c29095knF.copydefault() != null) {
            return new C29109knT(false, c29095knF.copydefault(), 1, null);
        }
        if (c29095knF.AEQbTJ() != null) {
            if (C33129mqd.OLrzqt((CharSequence) c29095knF.AEQbTJ().AuCTel())) {
                return new C29109knT(false, null, 3, null);
            }
            return new C29109knT(false, new OKServerException(8, null, null, null, 14, null), 1, null);
        }
        return new C29109knT(false, new OKServerException(8, null, null, null, 14, null), 1, null);
    }

    public static /* synthetic */ void loadData$default(PositionsViewModel positionsViewModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = -1;
        }
        positionsViewModel.copydefault(j);
    }

    public final void copydefault(long j) {
        this.values = false;
        if (j == -1 || this.iwGUEr.getValue().KWHzl()) {
            AYXKKw();
            AhwBna();
            loadActivePositions$default(this, false, 1, null);
        }
    }

    public final void AYXKKw() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$getLatestPnL$1(this, null), 3, null);
    }

    public final void AhwBna() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$getLimitOrderAsset$1(this, null), 3, null);
    }

    public static /* synthetic */ void loadRecentTransactions$default(PositionsViewModel positionsViewModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = -1;
        }
        positionsViewModel.OLrzqt(j);
    }

    public final void OLrzqt(long j) {
        C29176koh c29176koh;
        boolean z = j == -1;
        if (z) {
            c29176koh = new C29176koh(true, false, false, null, null, false, 62, null);
        } else {
            c29176koh = new C29176koh(false, true, false, null, null, false, 61, null);
        }
        if (!Intrinsics.EZpvd(AEQbTJ(), this.AkhnZx)) {
            this.AhwBna.setValue(c29176koh);
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$loadRecentTransactions$1(this, j, z, null), 3, null);
    }

    public final void EZpvd(@NotNull C28444kar c28444kar) {
        Intrinsics.checkNotNullParameter(c28444kar, "");
        this.hDKMBd = c28444kar;
        triggerSortingFilter$default(this, null, 1, null);
    }

    public final void copydefault(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$setActivePositionFilter$1(this, z, null), 3, null);
    }

    public static /* synthetic */ void triggerSortingFilter$default(PositionsViewModel positionsViewModel, C29092knC c29092knC, int i, Object obj) {
        if ((i & 1) != 0) {
            c29092knC = null;
        }
        positionsViewModel.copydefault(c29092knC);
    }

    public final void copydefault(C29092knC c29092knC) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$triggerSortingFilter$1(this, c29092knC, null), 3, null);
    }

    public static /* synthetic */ void loadActivePositions$default(PositionsViewModel positionsViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        positionsViewModel.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$loadActivePositions$1(this, z, null), 3, null);
    }

    public final void fJNWhG() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$subscribeHoldingList$1(this, null), 3, null);
    }

    public final void DbNXlk() {
        TxType next;
        Iterator<TxType> it = TxType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getValue(), (Object) AEQbTJ().DbNXlk())) {
                    break;
                }
            }
        }
        TxType txType = next;
        if (txType == null) {
            txType = TxType.ALL;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$resumeWs$1(this, txType, null), 3, null);
    }

    public final void fARcdN() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$unsubscribeWs$1(this, null), 3, null);
    }

    public final void ejfBZ() {
        if (this.AuCTel.getValue() == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$subscribeLimitOrder$1(this, null), 3, null);
    }

    public final TokenBase AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return DexMultiTokenInfoBean.transTokenBase$default(this.fIwbmz.AEQbTJ(), str, null, null, false, 14, null);
    }

    public final void AuCTel() {
        this.copydefault.setValue(Boolean.valueOf(!this.fetchVPNInfo.getValue().booleanValue()));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsViewModel$setPrivateMode$1(this, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        fARcdN();
        super.onCleared();
    }
}
