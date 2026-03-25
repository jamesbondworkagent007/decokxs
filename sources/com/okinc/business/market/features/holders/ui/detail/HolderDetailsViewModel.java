package com.okinc.business.market.features.holders.ui.detail;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.holders.domain.model.HistoryStatistics;
import com.okinc.business.market.features.holders.domain.model.HolderDetailModel;
import com.okinc.business.market.features.holders.ui.detail.widget.HolderDetailsUiModel;
import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C25624jAh;
import o.C26249jXl;
import o.C26277jYm;
import o.C26287jYw;
import o.C29123knh;
import o.C33129mqd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.jAJ;
import o.jAK;
import o.jYD;
import o.jYE;
import o.jZP;
import o.jZR;
import o.yCM;
import o.yDY;
import o.yHO;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderDetailsViewModel extends ViewModel {
    public final MutableStateFlow<Pair<Boolean, List<C26277jYm>>> AEQbTJ;
    public final MutableStateFlow<HistoryStatistics> AYXKKw;
    public final MutableStateFlow<jZP> AhwBna;
    public final C29123knh AkhnZx;
    public TokenFilter AuCTel;
    public final jAK DbNXlk;
    public final MutableStateFlow<PnLDetailsUiModel> EZpvd;
    public final MutableStateFlow<List<Integer>> KWHzl;
    public final MutableLiveData<Boolean> OLrzqt;
    public final MutableStateFlow<HolderDetailModel> copydefault;
    public final TokenFilter djBIcL;
    public final jYD ejfBZ;
    public boolean fARcdN;
    public final SavedStateHandle fIwbmz;
    public final C25624jAh fJNWhG;
    public final jAJ fetchVPNInfo;
    public final MutableStateFlow<jZR> gEmmrt;
    public final jYE isConnected;
    public final StateFlow<jZP> uzCIH;
    public final CoroutineDispatcher valueOf;
    public final C26249jXl values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter KWHzl() {
        TokenFilter tokenFilter = this.AuCTel;
        return tokenFilter == null ? this.djBIcL : tokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<jZP> OLrzqt() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter copydefault() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.fARcdN;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HolderDetailsViewModel.this.new AnonymousClass5(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel$5$Activity */
        public static final class Activity implements Flow<HolderDetailModel> {
            public final /* synthetic */ HolderDetailsViewModel AEQbTJ;
            public final /* synthetic */ Flow EZpvd;

            /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel$5$Activity$4, reason: invalid class name */
            public static final class AnonymousClass4<T> implements FlowCollector {
                public final /* synthetic */ HolderDetailsViewModel KWHzl;
                public final /* synthetic */ FlowCollector copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass4(FlowCollector flowCollector, HolderDetailsViewModel holderDetailsViewModel) {
                    this.copydefault = flowCollector;
                    this.KWHzl = holderDetailsViewModel;
                }

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
                    HolderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$2$2$1 holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$2$2$1;
                    T next;
                    if (continuation instanceof HolderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$2$2$1) {
                        holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$2$2$1 = (HolderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$2$2$1) continuation;
                        int i = holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$2$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$2$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$2$2$1 = new HolderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$2$2$1(this, continuation);
                        }
                    }
                    Object obj2 = holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$2$2$1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$2$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.copydefault;
                        Iterator<T> it = ((C26287jYw) obj).OLrzqt().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            if (Intrinsics.EZpvd((Object) ((HolderDetailModel) next).valueOf(), (Object) this.KWHzl.EZpvd().KWHzl())) {
                                break;
                            }
                        }
                        if (next != null) {
                            holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$2$2$1.label = 1;
                            if (flowCollector.emit(next, holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$2$2$1) == objCopydefault) {
                                return objCopydefault;
                            }
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

            public Activity(Flow flow, HolderDetailsViewModel holderDetailsViewModel) {
                this.EZpvd = flow;
                this.AEQbTJ = holderDetailsViewModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super HolderDetailModel> flowCollector, Continuation continuation) {
                Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector, this.AEQbTJ), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel$5$TaskDescription */
        public static final class TaskDescription implements Flow<C26287jYw> {
            public final /* synthetic */ Flow KWHzl;

            /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel$5$TaskDescription$3, reason: invalid class name */
            public static final class AnonymousClass3<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector OLrzqt;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass3(FlowCollector flowCollector) {
                    this.OLrzqt = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    HolderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$1$2$1 holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$1$2$1;
                    if (continuation instanceof HolderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$1$2$1) {
                        holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$1$2$1 = (HolderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
                        int i = holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$1$2$1 = new HolderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
                        }
                    }
                    Object obj2 = holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.OLrzqt;
                        C26287jYw c26287jYw = (C26287jYw) obj;
                        if (c26287jYw != null) {
                            holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                            if (flowCollector.emit(c26287jYw, holderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                                return objCopydefault;
                            }
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

            public TaskDescription(Flow flow) {
                this.KWHzl = flow;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super C26287jYw> flowCollector, Continuation continuation) {
                Object objCollect = this.KWHzl.collect(new AnonymousClass3(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Activity activity = new Activity(new TaskDescription(HolderDetailsViewModel.this.ejfBZ.AEQbTJ()), HolderDetailsViewModel.this);
                final HolderDetailsViewModel holderDetailsViewModel = HolderDetailsViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel.5.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(HolderDetailModel holderDetailModel, Continuation<? super Unit> continuation) {
                        holderDetailsViewModel.copydefault.setValue(holderDetailModel);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (activity.collect(flowCollector, this) == objCopydefault) {
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
    }

    @yCM
    public HolderDetailsViewModel(@NotNull jYD jyd, @NotNull C29123knh c29123knh, @NotNull jYE jye, @NotNull C26249jXl c26249jXl, @NotNull C25624jAh c25624jAh, @NotNull SavedStateHandle savedStateHandle, @NotNull jAJ jaj, @NotNull jAK jak, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(jyd, "");
        Intrinsics.checkNotNullParameter(c29123knh, "");
        Intrinsics.checkNotNullParameter(jye, "");
        Intrinsics.checkNotNullParameter(c26249jXl, "");
        Intrinsics.checkNotNullParameter(c25624jAh, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(jaj, "");
        Intrinsics.checkNotNullParameter(jak, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.ejfBZ = jyd;
        this.AkhnZx = c29123knh;
        this.isConnected = jye;
        this.values = c26249jXl;
        this.fJNWhG = c25624jAh;
        this.fIwbmz = savedStateHandle;
        this.fetchVPNInfo = jaj;
        this.DbNXlk = jak;
        this.valueOf = coroutineDispatcher;
        this.copydefault = StateFlowKt.MutableStateFlow(new HolderDetailModel(0, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null));
        this.EZpvd = StateFlowKt.MutableStateFlow(new PnLDetailsUiModel(false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null));
        this.AYXKKw = StateFlowKt.MutableStateFlow(new HistoryStatistics(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null));
        Boolean bool = Boolean.FALSE;
        this.AEQbTJ = StateFlowKt.MutableStateFlow(C56390yDp.OLrzqt(bool, null));
        this.gEmmrt = StateFlowKt.MutableStateFlow(jZR.TaskDescription.EZpvd);
        this.KWHzl = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.OLrzqt = new MutableLiveData<>(bool);
        this.djBIcL = new TokenFilter(EZpvd().AEQbTJ(), EZpvd().valueOf(), TxType.ALL.getValue(), null, C56402yEa.EZpvd(EZpvd().KWHzl()), false, false, null, false, false, null, null, null, 8072, null);
        MutableStateFlow<jZP> MutableStateFlow = StateFlowKt.MutableStateFlow(new jZP(true, false, false, null, false, null, null, false, null, TypedValues.PositionType.TYPE_POSITION_TYPE, null));
        this.AhwBna = MutableStateFlow;
        this.uzCIH = FlowKt.asStateFlow(MutableStateFlow);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), coroutineDispatcher, null, new AnonymousClass1(null), 2, null);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), coroutineDispatcher, null, new AnonymousClass2(null), 2, null);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), coroutineDispatcher, null, new AnonymousClass3(null), 2, null);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), coroutineDispatcher, null, new AnonymousClass4(null), 2, null);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), coroutineDispatcher, null, new AnonymousClass5(null), 2, null);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), coroutineDispatcher, null, new AnonymousClass6(null), 2, null);
    }

    public final HolderDetailsParams EZpvd() {
        HolderDetailsParams holderDetailsParams = (HolderDetailsParams) this.fIwbmz.get("holder_detail");
        return holderDetailsParams == null ? new HolderDetailsParams(null, null, null, null, null, null, null, 0, null, false, null, null, false, null, 16383, null) : holderDetailsParams;
    }

    public final void KWHzl(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        this.AuCTel = tokenFilter;
        OLrzqt("");
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HolderDetailsViewModel.this.new AnonymousClass1(continuation);
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
                Flow flowCombine = FlowKt.combine(FlowKt.combine(HolderDetailsViewModel.this.copydefault, HolderDetailsViewModel.this.EZpvd, HolderDetailsViewModel.this.AYXKKw, AnonymousClass3.INSTANCE), FlowKt.combine(HolderDetailsViewModel.this.AEQbTJ, HolderDetailsViewModel.this.gEmmrt, HolderDetailsViewModel.this.KWHzl, AnonymousClass6.INSTANCE), new AnonymousClass7(HolderDetailsViewModel.this, null));
                final HolderDetailsViewModel holderDetailsViewModel = HolderDetailsViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel.1.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(jZP jzp, Continuation<? super Unit> continuation) {
                        holderDetailsViewModel.AhwBna.setValue(jzp);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowCombine.collect(flowCollector, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel$1$3, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements yHT<HolderDetailModel, PnLDetailsUiModel, HistoryStatistics, Continuation<? super Triple<? extends HolderDetailModel, ? extends PnLDetailsUiModel, ? extends HistoryStatistics>>, Object> {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3() {
                super(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(HolderDetailModel holderDetailModel, PnLDetailsUiModel pnLDetailsUiModel, HistoryStatistics historyStatistics, Continuation<? super Triple<HolderDetailModel, PnLDetailsUiModel, HistoryStatistics>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$0(holderDetailModel, pnLDetailsUiModel, historyStatistics, continuation);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // o.yHT
            public /* bridge */ /* synthetic */ Object invoke(HolderDetailModel holderDetailModel, PnLDetailsUiModel pnLDetailsUiModel, HistoryStatistics historyStatistics, Continuation<? super Triple<? extends HolderDetailModel, ? extends PnLDetailsUiModel, ? extends HistoryStatistics>> continuation) {
                return invoke2(holderDetailModel, pnLDetailsUiModel, historyStatistics, (Continuation<? super Triple<HolderDetailModel, PnLDetailsUiModel, HistoryStatistics>>) continuation);
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel$1$6, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass6 extends AdaptedFunctionReference implements yHT<Pair<? extends Boolean, ? extends List<? extends C26277jYm>>, jZR, List<? extends Integer>, Continuation<? super Triple<? extends Pair<? extends Boolean, ? extends List<? extends C26277jYm>>, ? extends jZR, ? extends List<? extends Integer>>>, Object> {
            public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass6() {
                super(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // o.yHT
            public /* bridge */ /* synthetic */ Object invoke(Pair<? extends Boolean, ? extends List<? extends C26277jYm>> pair, jZR jzr, List<? extends Integer> list, Continuation<? super Triple<? extends Pair<? extends Boolean, ? extends List<? extends C26277jYm>>, ? extends jZR, ? extends List<? extends Integer>>> continuation) {
                return invoke2((Pair<Boolean, ? extends List<C26277jYm>>) pair, jzr, (List<Integer>) list, (Continuation<? super Triple<? extends Pair<Boolean, ? extends List<C26277jYm>>, ? extends jZR, ? extends List<Integer>>>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Pair<Boolean, ? extends List<C26277jYm>> pair, jZR jzr, List<Integer> list, Continuation<? super Triple<? extends Pair<Boolean, ? extends List<C26277jYm>>, ? extends jZR, ? extends List<Integer>>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$1(pair, jzr, list, continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(HolderDetailModel holderDetailModel, PnLDetailsUiModel pnLDetailsUiModel, HistoryStatistics historyStatistics, Continuation continuation) {
            return new Triple(holderDetailModel, pnLDetailsUiModel, historyStatistics);
        }

        /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel$1$7, reason: invalid class name */
        public static final class AnonymousClass7 extends SuspendLambda implements yHO<Triple<? extends HolderDetailModel, ? extends PnLDetailsUiModel, ? extends HistoryStatistics>, Triple<? extends Pair<? extends Boolean, ? extends List<? extends C26277jYm>>, ? extends jZR, ? extends List<? extends Integer>>, Continuation<? super jZP>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ HolderDetailsViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(HolderDetailsViewModel holderDetailsViewModel, Continuation<? super AnonymousClass7> continuation) {
                super(3, continuation);
                this.this$0 = holderDetailsViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // o.yHO
            public /* bridge */ /* synthetic */ Object invoke(Triple<? extends HolderDetailModel, ? extends PnLDetailsUiModel, ? extends HistoryStatistics> triple, Triple<? extends Pair<? extends Boolean, ? extends List<? extends C26277jYm>>, ? extends jZR, ? extends List<? extends Integer>> triple2, Continuation<? super jZP> continuation) {
                return invoke2((Triple<HolderDetailModel, PnLDetailsUiModel, HistoryStatistics>) triple, (Triple<? extends Pair<Boolean, ? extends List<C26277jYm>>, ? extends jZR, ? extends List<Integer>>) triple2, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Triple<HolderDetailModel, PnLDetailsUiModel, HistoryStatistics> triple, Triple<? extends Pair<Boolean, ? extends List<C26277jYm>>, ? extends jZR, ? extends List<Integer>> triple2, Continuation<? super jZP> continuation) {
                AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.this$0, continuation);
                anonymousClass7.L$0 = triple;
                anonymousClass7.L$1 = triple2;
                return anonymousClass7.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                List list;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Triple triple = (Triple) this.L$0;
                    Triple triple2 = (Triple) this.L$1;
                    HolderDetailModel holderDetailModel = (HolderDetailModel) triple.getFirst();
                    PnLDetailsUiModel pnLDetailsUiModel = (PnLDetailsUiModel) triple.getSecond();
                    HistoryStatistics historyStatistics = (HistoryStatistics) triple.getThird();
                    Pair pair = (Pair) triple2.getFirst();
                    jZR jzr = (jZR) triple2.getSecond();
                    List list2 = (List) triple2.getThird();
                    boolean z = jzr instanceof jZR.TaskDescription;
                    boolean z2 = jzr instanceof jZR.ActionBar;
                    Throwable thAEQbTJ = jzr instanceof jZR.Activity ? ((jZR.Activity) jzr).AEQbTJ() : null;
                    boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
                    HolderDetailsViewModel holderDetailsViewModel = this.this$0;
                    return new jZP(z, z2, zBooleanValue, thAEQbTJ, holderDetailsViewModel.AEQbTJ(historyStatistics, holderDetailsViewModel.KWHzl()) && (list = (List) pair.getSecond()) != null && list.isEmpty(), new HolderDetailsUiModel(holderDetailModel.EZpvd((268402687 & 1) != 0 ? holderDetailModel.uzCIH : 0, (268402687 & 2) != 0 ? holderDetailModel.AEQbTJ : null, (268402687 & 4) != 0 ? holderDetailModel.wlaJM : null, (268402687 & 8) != 0 ? holderDetailModel.DbNXlk : null, (268402687 & 16) != 0 ? holderDetailModel.AYXKKw : null, (268402687 & 32) != 0 ? holderDetailModel.isConnected : null, (268402687 & 64) != 0 ? holderDetailModel.AkhnZx : null, (268402687 & 128) != 0 ? holderDetailModel.AhwBna : null, (268402687 & 256) != 0 ? holderDetailModel.gEmmrt : null, (268402687 & 512) != 0 ? holderDetailModel.djBIcL : null, (268402687 & 1024) != 0 ? holderDetailModel.valueOf : null, (268402687 & 2048) != 0 ? holderDetailModel.fJNWhG : false, (268402687 & 4096) != 0 ? holderDetailModel.ejfBZ : false, (268402687 & 8192) != 0 ? holderDetailModel.iwGUEr : null, (268402687 & 16384) != 0 ? holderDetailModel.OLrzqt : null, (268402687 & 32768) != 0 ? holderDetailModel.AuCTel : !list2.isEmpty(), (268402687 & 65536) != 0 ? holderDetailModel.KWHzl : null, (268402687 & 131072) != 0 ? holderDetailModel.hDKMBd : null, (268402687 & 262144) != 0 ? holderDetailModel.getNewProxyInstance : null, (268402687 & 524288) != 0 ? holderDetailModel.AubY : null, (268402687 & 1048576) != 0 ? holderDetailModel.zLjUOn : null, (268402687 & 2097152) != 0 ? holderDetailModel.fIwbmz : null, (268402687 & 4194304) != 0 ? holderDetailModel.fARcdN : null, (268402687 & 8388608) != 0 ? holderDetailModel.fetchVPNInfo : null, (268402687 & 16777216) != 0 ? holderDetailModel.values : null, (268402687 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? holderDetailModel.getFieldNames : null, (268402687 & 67108864) != 0 ? holderDetailModel.copydefault : null, (268402687 & 134217728) != 0 ? holderDetailModel.EZpvd : null), pnLDetailsUiModel, historyStatistics, this.this$0.djBIcL(), this.this$0.EZpvd().gEmmrt()), (List) pair.getSecond(), false, historyStatistics.EZpvd(), 128, null);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$1(Pair pair, jZR jzr, List list, Continuation continuation) {
            return new Triple(pair, jzr, list);
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HolderDetailsViewModel.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<PnLDetailsUiModel> stateFlowCopydefault = HolderDetailsViewModel.this.AkhnZx.copydefault();
                final HolderDetailsViewModel holderDetailsViewModel = HolderDetailsViewModel.this;
                FlowCollector<? super PnLDetailsUiModel> flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel.2.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(PnLDetailsUiModel pnLDetailsUiModel, Continuation<? super Unit> continuation) {
                        if (pnLDetailsUiModel != null) {
                            holderDetailsViewModel.EZpvd.setValue(pnLDetailsUiModel);
                        }
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

    /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HolderDetailsViewModel.this.new AnonymousClass3(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<HistoryStatistics> stateFlowEZpvd = HolderDetailsViewModel.this.isConnected.EZpvd();
                final HolderDetailsViewModel holderDetailsViewModel = HolderDetailsViewModel.this;
                FlowCollector<? super HistoryStatistics> flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel.3.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(HistoryStatistics historyStatistics, Continuation<? super Unit> continuation) {
                        HistoryStatistics historyStatisticsKWHzl;
                        MutableStateFlow mutableStateFlow = holderDetailsViewModel.AYXKKw;
                        if (historyStatistics.EZpvd().length() == 0) {
                            historyStatisticsKWHzl = historyStatistics.KWHzl((65535 & 1) != 0 ? historyStatistics.OLrzqt : 0, (65535 & 2) != 0 ? historyStatistics.AuCTel : null, (65535 & 4) != 0 ? historyStatistics.ejfBZ : null, (65535 & 8) != 0 ? historyStatistics.gEmmrt : null, (65535 & 16) != 0 ? historyStatistics.EZpvd : null, (65535 & 32) != 0 ? historyStatistics.copydefault : null, (65535 & 64) != 0 ? historyStatistics.KWHzl : null, (65535 & 128) != 0 ? historyStatistics.AEQbTJ : null, (65535 & 256) != 0 ? historyStatistics.AkhnZx : null, (65535 & 512) != 0 ? historyStatistics.isConnected : null, (65535 & 1024) != 0 ? historyStatistics.fetchVPNInfo : null, (65535 & 2048) != 0 ? historyStatistics.values : null, (65535 & 4096) != 0 ? historyStatistics.valueOf : null, (65535 & 8192) != 0 ? historyStatistics.DbNXlk : null, (65535 & 16384) != 0 ? historyStatistics.djBIcL : null, (65535 & 32768) != 0 ? historyStatistics.AYXKKw : null, (65535 & 65536) != 0 ? historyStatistics.AhwBna : ((HistoryStatistics) holderDetailsViewModel.AYXKKw.getValue()).EZpvd());
                        } else {
                            historyStatisticsKWHzl = historyStatistics;
                        }
                        mutableStateFlow.setValue(historyStatisticsKWHzl);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HolderDetailsViewModel.this.new AnonymousClass4(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<List<C26277jYm>> stateFlowAEQbTJ = HolderDetailsViewModel.this.values.AEQbTJ();
                final HolderDetailsViewModel holderDetailsViewModel = HolderDetailsViewModel.this;
                FlowCollector<? super List<C26277jYm>> flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel.4.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(List<C26277jYm> list, Continuation<? super Unit> continuation) {
                        Object value;
                        if (list != null) {
                            MutableStateFlow mutableStateFlow = holderDetailsViewModel.AEQbTJ;
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.compareAndSet(value, Pair.copy$default((Pair) value, null, list, 1, null)));
                        }
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

    /* JADX INFO: renamed from: com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel$6, reason: invalid class name */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HolderDetailsViewModel.this.new AnonymousClass6(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            HolderDetailsViewModel holderDetailsViewModel;
            Object objM7386unboximpl;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                HolderDetailsViewModel holderDetailsViewModel2 = HolderDetailsViewModel.this;
                C25624jAh c25624jAh = holderDetailsViewModel2.fJNWhG;
                this.L$0 = holderDetailsViewModel2;
                this.label = 1;
                Object objEZpvd = c25624jAh.EZpvd(this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                holderDetailsViewModel = holderDetailsViewModel2;
                objM7386unboximpl = objEZpvd;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                holderDetailsViewModel = (HolderDetailsViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            Boolean bool = (Boolean) objM7386unboximpl;
            holderDetailsViewModel.fARcdN = bool != null ? bool.booleanValue() : false;
            return Unit.INSTANCE;
        }
    }

    private final void AkhnZx() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new HolderDetailsViewModel$getAmountDisplay$1(this, null), 2, null);
    }

    public final void gEmmrt() {
        AkhnZx();
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new HolderDetailsViewModel$loadData$1(this, null), 2, null);
    }

    public final void values() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new HolderDetailsViewModel$reloadSelectedFollow$1(this, null), 2, null);
    }

    public final void AhwBna() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new HolderDetailsViewModel$loadHolderDetails$1(this, null), 2, null);
    }

    public final void AYXKKw() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new HolderDetailsViewModel$loadPnLDetails$1(this, null), 2, null);
    }

    public final void valueOf() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new HolderDetailsViewModel$loadStatistics$1(this, null), 2, null);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new HolderDetailsViewModel$loadHistory$1(str, this, null), 2, null);
    }

    public final void AEQbTJ(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new HolderDetailsViewModel$subscribeWs$1(this, tokenFilter, null), 2, null);
    }

    public final void DbNXlk() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new HolderDetailsViewModel$resumeWSs$1(this, null), 2, null);
    }

    public final void isConnected() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new HolderDetailsViewModel$unSubscribeWSs$1(this, null), 2, null);
    }

    public final void fetchVPNInfo() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new HolderDetailsViewModel$toggleHistoryItemsTimeFormat$1(this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AEQbTJ(HistoryStatistics historyStatistics, TokenFilter tokenFilter) {
        TxType.Companion companion = TxType.Companion;
        if (companion.OLrzqt(tokenFilter.DbNXlk()) == TxType.ALL) {
            if (!C33129mqd.AEQbTJ(historyStatistics.valueOf() + historyStatistics.AEQbTJ(), 0)) {
                if ((companion.OLrzqt(tokenFilter.DbNXlk()) != TxType.BUY || !C33129mqd.AEQbTJ(historyStatistics.AEQbTJ(), 0)) && (companion.OLrzqt(tokenFilter.DbNXlk()) != TxType.SELL || !C33129mqd.AEQbTJ(historyStatistics.valueOf(), 0))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        isConnected();
        super.onCleared();
    }
}
