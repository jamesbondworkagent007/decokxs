package com.okinc.business.market.features.meme.ui;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.data.model.common.ChainInfoData;
import com.okinc.business.market.data.model.common.ProtocolInfoData;
import com.okinc.business.market.features.meme.domain.model.ConfigInfoData;
import com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData;
import com.okinc.business.market.features.meme.domain.model.MemeTabType;
import com.okinc.business.market.features.meme.domain.model.MemeUiModel;
import com.okinc.business.market.features.meme.domain.model.ProtocolFilterInfoData;
import com.okinc.business.market.features.meme.domain.model.RankInfoData;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.core.util.SPUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C22416heu;
import o.C25389ivm;
import o.C28634keV;
import o.C28696kfe;
import o.C33129mqd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC28637keY;
import o.InterfaceC28694kfc;
import o.InterfaceC28695kfd;
import o.InterfaceC28911kjh;
import o.kKG;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeActivityViewModelV2 extends AbstractC33073mpa {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final MutableStateFlow<InterfaceC28637keY> AEQbTJ;
    public final CoroutineDispatcher AYXKKw;
    public final List<StateFlow<InterfaceC28694kfc>> AhwBna;
    public final List<StateFlow<InterfaceC28911kjh>> AkhnZx;
    public final List<StateFlow<C28634keV>> DbNXlk;
    public final List<MutableStateFlow<InterfaceC28695kfd>> EZpvd;
    public final List<MutableStateFlow<C28634keV>> KWHzl;
    public final MutableStateFlow<Boolean> copydefault;
    public int djBIcL;
    public final kKG fJNWhG;
    public MemeSavedFilter fetchVPNInfo;
    public final StateFlow<InterfaceC28637keY> gEmmrt;
    public final StateFlow<Boolean> isConnected;
    public final List<StateFlow<InterfaceC28695kfd>> valueOf;
    public final MemePumpUseCase values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StateFlow<InterfaceC28694kfc>> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28637keY> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StateFlow<C28634keV>> OLrzqt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StateFlow<InterfaceC28695kfd>> copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> gEmmrt() {
        return this.isConnected;
    }

    public static final class ActionBar implements Flow<InterfaceC28694kfc> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: com.okinc.business.market.features.meme.ui.MemeActivityViewModelV2$ActionBar$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                MemeActivityViewModelV2$displayListStateFlow$lambda$6$lambda$3$$inlined$map$1$2$1 memeActivityViewModelV2$displayListStateFlow$lambda$6$lambda$3$$inlined$map$1$2$1;
                if (continuation instanceof MemeActivityViewModelV2$displayListStateFlow$lambda$6$lambda$3$$inlined$map$1$2$1) {
                    memeActivityViewModelV2$displayListStateFlow$lambda$6$lambda$3$$inlined$map$1$2$1 = (MemeActivityViewModelV2$displayListStateFlow$lambda$6$lambda$3$$inlined$map$1$2$1) continuation;
                    int i = memeActivityViewModelV2$displayListStateFlow$lambda$6$lambda$3$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        memeActivityViewModelV2$displayListStateFlow$lambda$6$lambda$3$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        memeActivityViewModelV2$displayListStateFlow$lambda$6$lambda$3$$inlined$map$1$2$1 = new MemeActivityViewModelV2$displayListStateFlow$lambda$6$lambda$3$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = memeActivityViewModelV2$displayListStateFlow$lambda$6$lambda$3$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = memeActivityViewModelV2$displayListStateFlow$lambda$6$lambda$3$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    InterfaceC28694kfc interfaceC28694kfc = (InterfaceC28694kfc) ((Pair) obj).component2();
                    memeActivityViewModelV2$displayListStateFlow$lambda$6$lambda$3$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(interfaceC28694kfc, memeActivityViewModelV2$displayListStateFlow$lambda$6$lambda$3$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super InterfaceC28694kfc> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Application implements Flow<InterfaceC28694kfc> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.business.market.features.meme.ui.MemeActivityViewModelV2$Application$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                MemeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$2$2$1 memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$2$2$1;
                if (continuation instanceof MemeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$2$2$1) {
                    memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$2$2$1 = (MemeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$2$2$1) continuation;
                    int i = memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$2$2$1 = new MemeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$2$2$1(this, continuation);
                    }
                }
                Object obj2 = memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$2$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    InterfaceC28694kfc interfaceC28694kfc = (InterfaceC28694kfc) ((Pair) obj).component2();
                    memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(interfaceC28694kfc, memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$2$2$1) == objCopydefault) {
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
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super InterfaceC28694kfc> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator implements Flow<InterfaceC28694kfc> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ StateFlow KWHzl;
        public final /* synthetic */ MemeActivityViewModelV2 OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.market.features.meme.ui.MemeActivityViewModelV2$StateListAnimator$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ MemeActivityViewModelV2 AEQbTJ;
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ StateFlow KWHzl;
            public final /* synthetic */ int OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, StateFlow stateFlow, MemeActivityViewModelV2 memeActivityViewModelV2, int i) {
                this.EZpvd = flowCollector;
                this.KWHzl = stateFlow;
                this.AEQbTJ = memeActivityViewModelV2;
                this.OLrzqt = i;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                MemeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$1$2$1 memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$1$2$1;
                if (continuation instanceof MemeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$1$2$1) {
                    memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$1$2$1 = (MemeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$1$2$1) continuation;
                    int i = memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$1$2$1 = new MemeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    InterfaceC28911kjh interfaceC28911kjh = (InterfaceC28911kjh) obj;
                    InterfaceC28694kfc interfaceC28694kfc = (InterfaceC28694kfc) this.KWHzl.getValue();
                    Object objCopydefault2 = InterfaceC28694kfc.TaskDescription.EZpvd;
                    if (!Intrinsics.EZpvd(interfaceC28694kfc, objCopydefault2)) {
                        Object obj3 = InterfaceC28694kfc.Activity.KWHzl;
                        if (Intrinsics.EZpvd(interfaceC28694kfc, obj3)) {
                            objCopydefault2 = obj3;
                        } else if ((interfaceC28694kfc instanceof InterfaceC28694kfc.Application) && (interfaceC28911kjh instanceof InterfaceC28911kjh.TaskDescription)) {
                            List<MemeUiModel> listCopydefault = ((InterfaceC28911kjh.TaskDescription) interfaceC28911kjh).copydefault();
                            objCopydefault2 = listCopydefault.isEmpty() ? InterfaceC28694kfc.StateListAnimator.copydefault : this.AEQbTJ.copydefault(listCopydefault, this.OLrzqt);
                        }
                    }
                    memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(objCopydefault2, memeActivityViewModelV2$displayListStateFlow$lambda$6$$inlined$map$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow, StateFlow stateFlow, MemeActivityViewModelV2 memeActivityViewModelV2, int i) {
            this.AEQbTJ = flow;
            this.KWHzl = stateFlow;
            this.OLrzqt = memeActivityViewModelV2;
            this.EZpvd = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super InterfaceC28694kfc> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector, this.KWHzl, this.OLrzqt, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x019f  */
    @yCM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MemeActivityViewModelV2(@NotNull MemePumpUseCase memePumpUseCase, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        StateFlow stateFlowStateIn;
        Intrinsics.checkNotNullParameter(memePumpUseCase, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.values = memePumpUseCase;
        this.fJNWhG = kkg;
        this.AYXKKw = coroutineDispatcher;
        MutableStateFlow<InterfaceC28637keY> MutableStateFlow = StateFlowKt.MutableStateFlow(new InterfaceC28637keY.StateListAnimator(null, null, 3, null));
        this.AEQbTJ = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        this.fetchVPNInfo = new MemeSavedFilter((List) null, 1, (DefaultConstructorMarker) null);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.copydefault = MutableStateFlow2;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow2);
        List<MutableStateFlow<C28634keV>> listGEmmrt = yDY.gEmmrt(StateFlowKt.MutableStateFlow(new C28634keV(null, null, null, null, 15, null)), StateFlowKt.MutableStateFlow(new C28634keV(null, null, null, null, 15, null)), StateFlowKt.MutableStateFlow(new C28634keV(null, null, null, null, 15, null)));
        this.KWHzl = listGEmmrt;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        Iterator<T> it = listGEmmrt.iterator();
        while (it.hasNext()) {
            arrayList.add(FlowKt.asStateFlow((MutableStateFlow) it.next()));
        }
        this.DbNXlk = arrayList;
        InterfaceC28695kfd.ActionBar actionBar = InterfaceC28695kfd.ActionBar.KWHzl;
        List<MutableStateFlow<InterfaceC28695kfd>> listGEmmrt2 = yDY.gEmmrt(StateFlowKt.MutableStateFlow(actionBar), StateFlowKt.MutableStateFlow(actionBar), StateFlowKt.MutableStateFlow(actionBar));
        this.EZpvd = listGEmmrt2;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listGEmmrt2, 10));
        Iterator<T> it2 = listGEmmrt2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(FlowKt.asStateFlow((MutableStateFlow) it2.next()));
        }
        this.valueOf = arrayList2;
        this.djBIcL = 30;
        Flow flowCombine = FlowKt.combine(this.values.copydefault(), this.gEmmrt, new MemeActivityViewModelV2$networkListStateFlow$1(this, null));
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharingStarted eagerly = companion.getEagerly();
        InterfaceC28911kjh.Application application = InterfaceC28911kjh.Application.AEQbTJ;
        this.AkhnZx = yDY.gEmmrt(FlowKt.stateIn(flowCombine, viewModelScope, eagerly, application), FlowKt.stateIn(FlowKt.combine(this.values.OLrzqt(), this.gEmmrt, new MemeActivityViewModelV2$networkListStateFlow$2(this, null)), ViewModelKt.getViewModelScope(this), companion.getEagerly(), application), FlowKt.stateIn(FlowKt.combine(this.values.KWHzl(), this.gEmmrt, new MemeActivityViewModelV2$networkListStateFlow$3(this, null)), ViewModelKt.getViewModelScope(this), companion.getEagerly(), application));
        List<StateFlow<InterfaceC28694kfc>> listEZpvd = this.values.EZpvd();
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        int i = 0;
        for (Object obj : listEZpvd) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            StateFlow stateFlow = (StateFlow) obj;
            StateFlow stateFlow2 = (StateFlow) CollectionsKt___CollectionsKt.AkhnZx(this.DbNXlk, i);
            if (stateFlow2 != null) {
                Flow flowCombine2 = FlowKt.combine(stateFlow, this.AkhnZx.get(i), stateFlow2, new MemeActivityViewModelV2$displayListStateFlow$1$1$1(this, i, null));
                InterfaceC28694kfc.TaskDescription taskDescription = InterfaceC28694kfc.TaskDescription.EZpvd;
                Intrinsics.copydefault(taskDescription, "");
                Intrinsics.copydefault(taskDescription, "");
                stateFlowStateIn = FlowKt.stateIn(new ActionBar(FlowKt.scan(flowCombine2, C56390yDp.OLrzqt(taskDescription, taskDescription), new MemeActivityViewModelV2$displayListStateFlow$1$1$2(this, i, null))), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getEagerly(), taskDescription);
                if (stateFlowStateIn == null) {
                    StateListAnimator stateListAnimator = new StateListAnimator(this.AkhnZx.get(i), stateFlow, this, i);
                    InterfaceC28694kfc.TaskDescription taskDescription2 = InterfaceC28694kfc.TaskDescription.EZpvd;
                    Intrinsics.copydefault(taskDescription2, "");
                    Intrinsics.copydefault(taskDescription2, "");
                    stateFlowStateIn = FlowKt.stateIn(new Application(FlowKt.scan(stateListAnimator, C56390yDp.OLrzqt(taskDescription2, taskDescription2), new MemeActivityViewModelV2$displayListStateFlow$1$3(this, i, null))), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getEagerly(), taskDescription2);
                }
            }
            arrayList3.add(stateFlowStateIn);
            i++;
        }
        this.AhwBna = arrayList3;
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.meme.ui.MemeActivityViewModelV2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MemeActivityViewModelV2.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                MemeActivityViewModelV2.this.valueOf();
                MemeActivityViewModelV2.this.copydefault.setValue(C56443yFo.KWHzl(C22416heu.AwvSrB()));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ void firstLoad$default(MemeActivityViewModelV2 memeActivityViewModelV2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        memeActivityViewModelV2.copydefault(z);
    }

    public final void copydefault(boolean z) {
        this.AEQbTJ.setValue(new InterfaceC28637keY.StateListAnimator(null, null, 3, null));
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new MemeActivityViewModelV2$firstLoad$1(this, z, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull ConfigInfoData configInfoData, @NotNull List<C28696kfe> list) {
        String strEZpvd;
        Object next;
        List<String> defaultProtocolIdList;
        MemeFilter local;
        Object next2;
        ChainInfoData chainInfoData;
        List<MemeSavedTabFilter> filters;
        Intrinsics.checkNotNullParameter(configInfoData, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C28696kfe c28696kfe = (C28696kfe) obj;
            MemeSavedFilter memeSavedFilter = this.fetchVPNInfo;
            MemeSavedTabFilter memeSavedTabFilter = (memeSavedFilter == null || (filters = memeSavedFilter.getFilters()) == null) ? null : (MemeSavedTabFilter) CollectionsKt___CollectionsKt.AkhnZx(filters, i);
            if (memeSavedTabFilter != null && (strEZpvd = memeSavedTabFilter.getChainId()) != null) {
                if (strEZpvd.length() == 0 && ((chainInfoData = (ChainInfoData) CollectionsKt___CollectionsKt.firstOrNull(configInfoData.getChainInfos())) == null || (strEZpvd = chainInfoData.EZpvd()) == null)) {
                    return;
                }
            } else {
                ChainInfoData chainInfoData2 = (ChainInfoData) CollectionsKt___CollectionsKt.firstOrNull(configInfoData.getChainInfos());
                if (chainInfoData2 == null) {
                    return;
                } else {
                    strEZpvd = chainInfoData2.EZpvd();
                }
            }
            String str = strEZpvd;
            Iterator<T> it = configInfoData.getProtocolFilterInfos().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ProtocolFilterInfoData protocolFilterInfoData = (ProtocolFilterInfoData) next;
                if (Intrinsics.EZpvd((Object) protocolFilterInfoData.getChainId(), (Object) str) && KWHzl(C33129mqd.AhwBna(protocolFilterInfoData.getRankType())) == c28696kfe.EZpvd()) {
                    break;
                }
            }
            ProtocolFilterInfoData protocolFilterInfoData2 = (ProtocolFilterInfoData) next;
            if (protocolFilterInfoData2 == null) {
                return;
            }
            if (memeSavedTabFilter != null && (defaultProtocolIdList = memeSavedTabFilter.getProtocols()) != null) {
                if (defaultProtocolIdList.isEmpty()) {
                    defaultProtocolIdList = protocolFilterInfoData2.getDefaultProtocolIdList();
                    if (defaultProtocolIdList.isEmpty()) {
                        defaultProtocolIdList = protocolFilterInfoData2.getProtocolIdList();
                    }
                }
                if (defaultProtocolIdList == null) {
                }
            } else {
                defaultProtocolIdList = protocolFilterInfoData2.getDefaultProtocolIdList();
                if (defaultProtocolIdList.isEmpty()) {
                    defaultProtocolIdList = protocolFilterInfoData2.getProtocolIdList();
                }
            }
            List<String> defaultProtocolIdList2 = protocolFilterInfoData2.getDefaultProtocolIdList();
            if (defaultProtocolIdList2.isEmpty()) {
                defaultProtocolIdList2 = protocolFilterInfoData2.getProtocolIdList();
            }
            List<String> protocolIdList = protocolFilterInfoData2.getProtocolIdList();
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : protocolIdList) {
                Iterator<T> it2 = configInfoData.getProtocolInfos().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (Intrinsics.EZpvd((Object) ((ProtocolInfoData) next2).getProtocolId(), (Object) str2)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                ProtocolInfoData protocolInfoData = (ProtocolInfoData) next2;
                if (protocolInfoData != null) {
                    arrayList2.add(protocolInfoData);
                }
            }
            arrayList.add(new C28634keV(str, null, new MemeProtocolFilterUiData(defaultProtocolIdList, defaultProtocolIdList2, arrayList2), (memeSavedTabFilter == null || (local = memeSavedTabFilter.getLocal()) == null) ? new MemeFilter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, -1, 31, (DefaultConstructorMarker) null) : local, 2, null));
            i++;
        }
        int i2 = 0;
        for (Object obj2 : this.KWHzl) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            MutableStateFlow mutableStateFlow = (MutableStateFlow) obj2;
            C28634keV c28634keV = (C28634keV) CollectionsKt___CollectionsKt.AkhnZx(arrayList, i2);
            if (c28634keV != null) {
                mutableStateFlow.setValue(c28634keV);
            }
            i2++;
        }
    }

    public final void copydefault(InterfaceC28637keY.Activity activity) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new MemeActivityViewModelV2$initContentFlow$1(this, null), 2, null);
    }

    public static /* synthetic */ void initContentTab$default(MemeActivityViewModelV2 memeActivityViewModelV2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        memeActivityViewModelV2.KWHzl(i, z);
    }

    public final void KWHzl(int i, boolean z) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new MemeActivityViewModelV2$initContentTab$1(this, i, z, null), 2, null);
    }

    public final void copydefault(int i) {
        C28696kfe c28696kfeCopy$default;
        InterfaceC28637keY value = this.gEmmrt.getValue();
        InterfaceC28637keY.Activity activity = value instanceof InterfaceC28637keY.Activity ? (InterfaceC28637keY.Activity) value : null;
        if (activity != null) {
            List<C28696kfe> listEZpvd = activity.EZpvd();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            int i2 = 0;
            for (Object obj : listEZpvd) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                C28696kfe c28696kfe = (C28696kfe) obj;
                if (i2 == i) {
                    c28696kfeCopy$default = C28696kfe.copy$default(c28696kfe, true, false, 0, null, null, 28, null);
                } else {
                    c28696kfeCopy$default = C28696kfe.copy$default(c28696kfe, false, false, 0, null, null, 30, null);
                }
                arrayList.add(c28696kfeCopy$default);
                i2++;
            }
            this.AEQbTJ.setValue(InterfaceC28637keY.Activity.copy$default(activity, arrayList, null, 2, null));
        }
    }

    public final void AhwBna(int i) {
        InterfaceC28637keY value = this.gEmmrt.getValue();
        InterfaceC28637keY.Activity activity = value instanceof InterfaceC28637keY.Activity ? (InterfaceC28637keY.Activity) value : null;
        if (activity != null) {
            List<C28696kfe> listEZpvd = activity.EZpvd();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            int i2 = 0;
            for (Object obj : listEZpvd) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                C28696kfe c28696kfeCopy$default = (C28696kfe) obj;
                if (i2 == i && !c28696kfeCopy$default.KWHzl()) {
                    c28696kfeCopy$default = C28696kfe.copy$default(c28696kfeCopy$default, false, true, 0, null, null, 29, null);
                }
                arrayList.add(c28696kfeCopy$default);
                i2++;
            }
            this.AEQbTJ.setValue(InterfaceC28637keY.Activity.copy$default(activity, arrayList, null, 2, null));
        }
    }

    public final void KWHzl(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) AEQbTJ(0).copydefault(), (Object) str)) {
            return;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            modifyTabFilter$default(this, i2, str, null, null, false, 28, null);
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new MemeActivityViewModelV2$onChainSelected$1(this, str, null), 2, null);
    }

    public final void OLrzqt(int i, @NotNull List<String> list) {
        List<String> listEZpvd = list;
        Intrinsics.checkNotNullParameter(listEZpvd, "");
        MemeProtocolFilterUiData memeProtocolFilterUiDataAEQbTJ = AEQbTJ(i).AEQbTJ();
        if (list.isEmpty()) {
            listEZpvd = AEQbTJ(i).AEQbTJ().EZpvd();
        }
        modifyTabFilter$default(this, i, null, MemeProtocolFilterUiData.copy$default(memeProtocolFilterUiDataAEQbTJ, listEZpvd, null, null, 6, null), null, false, 26, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.ui.MemeActivityViewModelV2 */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onLocalFilterSet$default(MemeActivityViewModelV2 memeActivityViewModelV2, int i, MemeFilter memeFilter, List list, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = null;
        }
        memeActivityViewModelV2.copydefault(i, memeFilter, list, z);
    }

    public final void copydefault(int i, @NotNull MemeFilter memeFilter, List<String> list, boolean z) {
        MemeProtocolFilterUiData memeProtocolFilterUiDataCopy$default;
        Intrinsics.checkNotNullParameter(memeFilter, "");
        if (list != null) {
            MemeProtocolFilterUiData memeProtocolFilterUiDataAEQbTJ = AEQbTJ(i).AEQbTJ();
            if (list.isEmpty()) {
                list = AEQbTJ(i).AEQbTJ().EZpvd();
            }
            memeProtocolFilterUiDataCopy$default = MemeProtocolFilterUiData.copy$default(memeProtocolFilterUiDataAEQbTJ, list, null, null, 6, null);
        } else {
            memeProtocolFilterUiDataCopy$default = null;
        }
        modifyTabFilter$default(this, i, null, memeProtocolFilterUiDataCopy$default, memeFilter, z, 2, null);
    }

    public static /* synthetic */ void modifyTabFilter$default(MemeActivityViewModelV2 memeActivityViewModelV2, int i, String str, MemeProtocolFilterUiData memeProtocolFilterUiData, MemeFilter memeFilter, boolean z, int i2, Object obj) {
        String str2 = (i2 & 2) != 0 ? null : str;
        MemeProtocolFilterUiData memeProtocolFilterUiData2 = (i2 & 4) != 0 ? null : memeProtocolFilterUiData;
        MemeFilter memeFilter2 = (i2 & 8) != 0 ? null : memeFilter;
        if ((i2 & 16) != 0) {
            z = false;
        }
        memeActivityViewModelV2.OLrzqt(i, str2, memeProtocolFilterUiData2, memeFilter2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(int i, String str, MemeProtocolFilterUiData memeProtocolFilterUiData, MemeFilter memeFilter, boolean z) {
        C28634keV c28634keV;
        MutableStateFlow mutableStateFlow;
        ConfigInfoData configInfoDataEZpvd;
        Object next;
        MemeProtocolFilterUiData memeProtocolFilterUiData2;
        MemeProtocolFilterUiData memeProtocolFilterUiDataAEQbTJ;
        MemeSavedFilter memeSavedFilter;
        List listAhwBna;
        List<MemeSavedTabFilter> filters;
        Object next2;
        Object next3;
        StateFlow stateFlow = (StateFlow) CollectionsKt___CollectionsKt.AkhnZx(this.DbNXlk, i);
        if (stateFlow == null || (c28634keV = (C28634keV) stateFlow.getValue()) == null || (mutableStateFlow = (MutableStateFlow) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i)) == null || (configInfoDataEZpvd = EZpvd()) == null) {
            return;
        }
        String strCopydefault = str == null ? c28634keV.copydefault() : str;
        Iterator<T> it = configInfoDataEZpvd.getProtocolFilterInfos().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ProtocolFilterInfoData protocolFilterInfoData = (ProtocolFilterInfoData) next;
            if (Intrinsics.EZpvd((Object) protocolFilterInfoData.getChainId(), (Object) str) && KWHzl(C33129mqd.AhwBna(protocolFilterInfoData.getRankType())) == c28634keV.EZpvd()) {
                break;
            }
        }
        ProtocolFilterInfoData protocolFilterInfoData2 = (ProtocolFilterInfoData) next;
        if (!Intrinsics.EZpvd((Object) str, (Object) c28634keV.copydefault()) && protocolFilterInfoData2 != null) {
            Iterator<T> it2 = configInfoDataEZpvd.getProtocolFilterInfos().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                ProtocolFilterInfoData protocolFilterInfoData3 = (ProtocolFilterInfoData) next2;
                if (Intrinsics.EZpvd((Object) protocolFilterInfoData3.getChainId(), (Object) strCopydefault) && KWHzl(C33129mqd.AhwBna(protocolFilterInfoData3.getRankType())) == c28634keV.EZpvd()) {
                    break;
                }
            }
            ProtocolFilterInfoData protocolFilterInfoData4 = (ProtocolFilterInfoData) next2;
            if (protocolFilterInfoData4 != null) {
                List<String> defaultProtocolIdList = protocolFilterInfoData4.getDefaultProtocolIdList();
                if (defaultProtocolIdList.isEmpty()) {
                    defaultProtocolIdList = protocolFilterInfoData4.getProtocolIdList();
                }
                if (str != null) {
                    List<String> listCopydefault = copydefault(str, i);
                    if (listCopydefault.isEmpty()) {
                        listCopydefault = defaultProtocolIdList;
                    }
                    if (listCopydefault != null) {
                        defaultProtocolIdList = listCopydefault;
                    }
                }
                List<String> defaultProtocolIdList2 = protocolFilterInfoData4.getDefaultProtocolIdList();
                if (defaultProtocolIdList2.isEmpty()) {
                    defaultProtocolIdList2 = protocolFilterInfoData4.getProtocolIdList();
                }
                List<String> protocolIdList = protocolFilterInfoData2.getProtocolIdList();
                ArrayList arrayList = new ArrayList();
                for (String str2 : protocolIdList) {
                    Iterator<T> it3 = configInfoDataEZpvd.getProtocolInfos().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next3 = it3.next();
                            if (Intrinsics.EZpvd((Object) ((ProtocolInfoData) next3).getProtocolId(), (Object) str2)) {
                                break;
                            }
                        } else {
                            next3 = null;
                            break;
                        }
                    }
                    ProtocolInfoData protocolInfoData = (ProtocolInfoData) next3;
                    if (protocolInfoData != null) {
                        arrayList.add(protocolInfoData);
                    }
                }
                memeProtocolFilterUiDataAEQbTJ = new MemeProtocolFilterUiData(defaultProtocolIdList, defaultProtocolIdList2, arrayList);
            } else {
                memeProtocolFilterUiDataAEQbTJ = c28634keV.AEQbTJ();
            }
        } else if (memeProtocolFilterUiData == null) {
            memeProtocolFilterUiDataAEQbTJ = c28634keV.AEQbTJ();
        } else {
            memeProtocolFilterUiData2 = memeProtocolFilterUiData;
            if (memeProtocolFilterUiData != null) {
                copydefault(c28634keV.copydefault(), i, memeProtocolFilterUiData.OLrzqt());
            }
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new MemeActivityViewModelV2$modifyTabFilter$1(this, i, str, memeProtocolFilterUiData2, memeFilter, c28634keV, z, null), 2, null);
            mutableStateFlow.setValue(C28634keV.copy$default(c28634keV, strCopydefault, null, memeProtocolFilterUiData2, memeFilter != null ? c28634keV.KWHzl() : memeFilter, 2, null));
            memeSavedFilter = this.fetchVPNInfo;
            if (memeSavedFilter != null || (filters = memeSavedFilter.getFilters()) == null) {
                listAhwBna = yDY.AhwBna();
            } else {
                listAhwBna = new ArrayList(C56403yEb.AYXKKw(filters, 10));
                int i2 = 0;
                for (Object obj : filters) {
                    if (i2 < 0) {
                        yDY.AYXKKw();
                    }
                    MemeSavedTabFilter memeSavedTabFilterCopy = (MemeSavedTabFilter) obj;
                    if (i2 == i) {
                        memeSavedTabFilterCopy = memeSavedTabFilterCopy.copy(str == null ? memeSavedTabFilterCopy.getChainId() : str, memeProtocolFilterUiData2.OLrzqt(), memeFilter == null ? c28634keV.KWHzl() : memeFilter);
                    }
                    listAhwBna.add(memeSavedTabFilterCopy);
                    i2++;
                }
            }
            AEQbTJ(new MemeSavedFilter(listAhwBna));
        }
        memeProtocolFilterUiData2 = memeProtocolFilterUiDataAEQbTJ;
        if (memeProtocolFilterUiData != null) {
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new MemeActivityViewModelV2$modifyTabFilter$1(this, i, str, memeProtocolFilterUiData2, memeFilter, c28634keV, z, null), 2, null);
        mutableStateFlow.setValue(C28634keV.copy$default(c28634keV, strCopydefault, null, memeProtocolFilterUiData2, memeFilter != null ? c28634keV.KWHzl() : memeFilter, 2, null));
        memeSavedFilter = this.fetchVPNInfo;
        if (memeSavedFilter != null) {
            listAhwBna = yDY.AhwBna();
        }
        AEQbTJ(new MemeSavedFilter(listAhwBna));
    }

    public static /* synthetic */ void resumeUpdates$default(MemeActivityViewModelV2 memeActivityViewModelV2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        memeActivityViewModelV2.copydefault(i, z);
    }

    public final void copydefault(int i, boolean z) {
        InterfaceC28695kfd interfaceC28695kfdEZpvd = EZpvd(i);
        boolean z2 = interfaceC28695kfdEZpvd instanceof InterfaceC28695kfd.Activity;
        if (z2 && !z) {
            OLrzqt(i, InterfaceC28695kfd.ActionBar.KWHzl);
            return;
        }
        if ((interfaceC28695kfdEZpvd instanceof InterfaceC28695kfd.ActionBar) || z2) {
            return;
        }
        if (!(interfaceC28695kfdEZpvd instanceof InterfaceC28695kfd.StateListAnimator) || z) {
            OLrzqt(i, z ? InterfaceC28695kfd.Activity.copydefault : InterfaceC28695kfd.ActionBar.KWHzl);
        }
    }

    public static /* synthetic */ void pauseUpdates$default(MemeActivityViewModelV2 memeActivityViewModelV2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        memeActivityViewModelV2.EZpvd(i, z);
    }

    public final void EZpvd(int i, boolean z) {
        InterfaceC28695kfd interfaceC28695kfdEZpvd = EZpvd(i);
        if ((interfaceC28695kfdEZpvd instanceof InterfaceC28695kfd.StateListAnimator) && !z) {
            OLrzqt(i, InterfaceC28695kfd.Application.EZpvd);
            return;
        }
        InterfaceC28695kfd interfaceC28695kfd = z ? InterfaceC28695kfd.StateListAnimator.OLrzqt : InterfaceC28695kfd.Application.EZpvd;
        if (Intrinsics.EZpvd(interfaceC28695kfdEZpvd, interfaceC28695kfd)) {
            return;
        }
        OLrzqt(i, interfaceC28695kfd);
    }

    public final void djBIcL(int i) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new MemeActivityViewModelV2$refreshTab$1(this, i, AEQbTJ(i), null), 2, null);
    }

    public final void AYXKKw(int i) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new MemeActivityViewModelV2$subscribePersonalizedWebSocket$1(this, i, null), 2, null);
    }

    public final void gEmmrt(int i) {
        this.values.AhwBna();
    }

    public final void djBIcL() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new MemeActivityViewModelV2$markCoachmarkViewed$1(null), 2, null);
    }

    public final void AYXKKw() {
        if (this.copydefault.getValue().booleanValue()) {
            this.copydefault.setValue(Boolean.FALSE);
            djBIcL();
        }
    }

    public final C28634keV AEQbTJ(int i) {
        C28634keV c28634keV;
        StateFlow stateFlow = (StateFlow) CollectionsKt___CollectionsKt.AkhnZx(this.DbNXlk, i);
        return (stateFlow == null || (c28634keV = (C28634keV) stateFlow.getValue()) == null) ? new C28634keV(null, null, null, null, 15, null) : c28634keV;
    }

    public final InterfaceC28695kfd EZpvd(int i) {
        InterfaceC28695kfd interfaceC28695kfd;
        StateFlow stateFlow = (StateFlow) CollectionsKt___CollectionsKt.AkhnZx(this.valueOf, i);
        return (stateFlow == null || (interfaceC28695kfd = (InterfaceC28695kfd) stateFlow.getValue()) == null) ? InterfaceC28695kfd.ActionBar.KWHzl : interfaceC28695kfd;
    }

    public final void OLrzqt(int i, @NotNull InterfaceC28695kfd interfaceC28695kfd) {
        Intrinsics.checkNotNullParameter(interfaceC28695kfd, "");
        MutableStateFlow mutableStateFlow = (MutableStateFlow) CollectionsKt___CollectionsKt.AkhnZx(this.EZpvd, i);
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(interfaceC28695kfd);
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new MemeActivityViewModelV2$setTabResumed$1(interfaceC28695kfd, this, i, null), 2, null);
    }

    public final ConfigInfoData EZpvd() {
        ConfigInfoData configInfoDataOLrzqt;
        InterfaceC28637keY value = this.gEmmrt.getValue();
        InterfaceC28637keY.Activity activity = value instanceof InterfaceC28637keY.Activity ? (InterfaceC28637keY.Activity) value : null;
        if (activity != null && (configInfoDataOLrzqt = activity.OLrzqt()) != null) {
            return configInfoDataOLrzqt;
        }
        InterfaceC28637keY value2 = this.gEmmrt.getValue();
        InterfaceC28637keY.StateListAnimator stateListAnimator = value2 instanceof InterfaceC28637keY.StateListAnimator ? (InterfaceC28637keY.StateListAnimator) value2 : null;
        if (stateListAnimator != null) {
            return stateListAnimator.copydefault();
        }
        return null;
    }

    public final List<C28696kfe> AhwBna() {
        List<C28696kfe> listEZpvd;
        InterfaceC28637keY value = this.gEmmrt.getValue();
        InterfaceC28637keY.Activity activity = value instanceof InterfaceC28637keY.Activity ? (InterfaceC28637keY.Activity) value : null;
        if (activity != null && (listEZpvd = activity.EZpvd()) != null) {
            return listEZpvd;
        }
        InterfaceC28637keY value2 = this.gEmmrt.getValue();
        InterfaceC28637keY.StateListAnimator stateListAnimator = value2 instanceof InterfaceC28637keY.StateListAnimator ? (InterfaceC28637keY.StateListAnimator) value2 : null;
        if (stateListAnimator != null) {
            return stateListAnimator.EZpvd();
        }
        return null;
    }

    public final void AkhnZx() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new MemeActivityViewModelV2$subscribeWebSockets$1(this, null), 2, null);
    }

    public final void isConnected() {
        this.values.AYXKKw();
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.values.AYXKKw();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.ui.MemeActivityViewModelV2.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final int OLrzqt(int i) {
        ConfigInfoData configInfoDataCopydefault;
        ConfigInfoData configInfoDataOLrzqt;
        List<RankInfoData> rankInfos;
        InterfaceC28637keY value = this.gEmmrt.getValue();
        List<RankInfoData> rankInfos2 = null;
        InterfaceC28637keY.Activity activity = value instanceof InterfaceC28637keY.Activity ? (InterfaceC28637keY.Activity) value : null;
        if (activity == null || (configInfoDataOLrzqt = activity.OLrzqt()) == null || (rankInfos = configInfoDataOLrzqt.getRankInfos()) == null) {
            InterfaceC28637keY value2 = this.gEmmrt.getValue();
            InterfaceC28637keY.StateListAnimator stateListAnimator = value2 instanceof InterfaceC28637keY.StateListAnimator ? (InterfaceC28637keY.StateListAnimator) value2 : null;
            if (stateListAnimator != null && (configInfoDataCopydefault = stateListAnimator.copydefault()) != null) {
                rankInfos2 = configInfoDataCopydefault.getRankInfos();
            }
        } else {
            rankInfos2 = rankInfos;
        }
        int i2 = 0;
        if (rankInfos2 == null) {
            return 0;
        }
        Iterator<RankInfoData> it = rankInfos2.iterator();
        while (it.hasNext()) {
            if (C33129mqd.AhwBna(it.next().getRankType()) == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final MemeTabType KWHzl(int i) {
        return MemeTabType.Companion.AEQbTJ(OLrzqt(i));
    }

    public final void AEQbTJ(MemeSavedFilter memeSavedFilter) {
        this.fetchVPNInfo = memeSavedFilter;
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new MemeActivityViewModelV2$saveFilters$1(memeSavedFilter, null), 2, null);
    }

    public final void valueOf() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new MemeActivityViewModelV2$getSavedNetworkFilters$1(this, null), 2, null);
    }

    public final List<String> copydefault(String str, int i) {
        ArrayList arrayList = SPUtils.getArrayList("key_dex_sp_meme_" + str + i, String.class);
        return arrayList != null ? arrayList : yDY.AhwBna();
    }

    public final void copydefault(String str, int i, List<String> list) {
        SPUtils.put("key_dex_sp_meme_" + str + i, list);
    }

    public final void AEQbTJ(@NotNull MemeUiModel memeUiModel, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AYXKKw, null, new MemeActivityViewModelV2$hideToken$1(this, memeUiModel, function0, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC28694kfc copydefault(List<MemeUiModel> list, int i) {
        boolean z;
        if (this.copydefault.getValue().booleanValue()) {
            z = (list.isEmpty() ^ true) && i == 0;
        }
        return new InterfaceC28694kfc.Application(list, z);
    }
}
