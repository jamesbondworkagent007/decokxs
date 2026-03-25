package com.okinc.im.imui.group.members.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.immomo.mls.fun.lt.SILoading;
import com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel;
import com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C34282nYe;
import o.C34286nYi;
import o.C35551nxW;
import o.C35798oEb;
import o.C35859oGi;
import o.C44157sFk;
import o.C44170sFx;
import o.C56391yDq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC56387yDm;
import o.oDI;
import o.oDT;
import o.oDV;
import o.oDX;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupMemberListViewModel extends AbstractC33073mpa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final StateFlow<String> AEQbTJ;
    public final StateFlow<List<C34282nYe>> AYXKKw;
    public final MutableStateFlow<StateListAnimator> AhwBna;
    public final oDI AkhnZx;
    public final oDV AuCTel;
    public final StateFlow<Boolean> DbNXlk;
    public final MutableStateFlow<List<C34286nYi>> KWHzl;
    public final MutableStateFlow<List<C34282nYe>> OLrzqt;
    public final Flow<List<C34282nYe>> copydefault;
    public final Map<Integer, StateFlow<ActionBar>> djBIcL;
    public final C35859oGi ejfBZ;
    public final StateFlow<List<GroupMemberInfo>> fARcdN;
    public final StateFlow<StateListAnimator> fIwbmz;
    public final SavedStateHandle fJNWhG;
    public final oDT fetchVPNInfo;
    public final StateFlow<String> gEmmrt;
    public final oDX isConnected;
    public final InterfaceC56387yDm uzCIH;
    public final C35798oEb valueOf;
    public final Flow<GroupInfo> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<GroupMemberInfo>> EZpvd() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<GroupInfo> OLrzqt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<StateListAnimator> valueOf() {
        return this.fIwbmz;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity implements Flow<ActionBar> {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ GroupMemberListViewModel EZpvd;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel$Activity$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ int AEQbTJ;
            public final /* synthetic */ GroupMemberListViewModel EZpvd;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, GroupMemberListViewModel groupMemberListViewModel, int i) {
                this.copydefault = flowCollector;
                this.EZpvd = groupMemberListViewModel;
                this.AEQbTJ = i;
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
                GroupMemberListViewModel$getCategoryMemberList$$inlined$map$1$2$1 groupMemberListViewModel$getCategoryMemberList$$inlined$map$1$2$1;
                if (continuation instanceof GroupMemberListViewModel$getCategoryMemberList$$inlined$map$1$2$1) {
                    groupMemberListViewModel$getCategoryMemberList$$inlined$map$1$2$1 = (GroupMemberListViewModel$getCategoryMemberList$$inlined$map$1$2$1) continuation;
                    int i = groupMemberListViewModel$getCategoryMemberList$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        groupMemberListViewModel$getCategoryMemberList$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        groupMemberListViewModel$getCategoryMemberList$$inlined$map$1$2$1 = new GroupMemberListViewModel$getCategoryMemberList$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = groupMemberListViewModel$getCategoryMemberList$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = groupMemberListViewModel$getCategoryMemberList$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    List listAEQbTJ = this.EZpvd.AEQbTJ((List) obj, this.AEQbTJ);
                    ActionBar application = listAEQbTJ.isEmpty() ? ActionBar.StateListAnimator.EZpvd : new ActionBar.Application(listAEQbTJ);
                    groupMemberListViewModel$getCategoryMemberList$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(application, groupMemberListViewModel$getCategoryMemberList$$inlined$map$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow, GroupMemberListViewModel groupMemberListViewModel, int i) {
            this.copydefault = flow;
            this.EZpvd = groupMemberListViewModel;
            this.AEQbTJ = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super ActionBar> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector, this.EZpvd, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Application implements Flow<List<? extends C34282nYe>> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ GroupMemberListViewModel OLrzqt;

        /* JADX INFO: renamed from: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel$Application$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ GroupMemberListViewModel copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, GroupMemberListViewModel groupMemberListViewModel) {
                this.KWHzl = flowCollector;
                this.copydefault = groupMemberListViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                GroupMemberListViewModel$_memberListDbFlow$lambda$2$$inlined$map$1$2$1 groupMemberListViewModel$_memberListDbFlow$lambda$2$$inlined$map$1$2$1;
                List<C34282nYe> listEZpvd;
                if (continuation instanceof GroupMemberListViewModel$_memberListDbFlow$lambda$2$$inlined$map$1$2$1) {
                    groupMemberListViewModel$_memberListDbFlow$lambda$2$$inlined$map$1$2$1 = (GroupMemberListViewModel$_memberListDbFlow$lambda$2$$inlined$map$1$2$1) continuation;
                    int i = groupMemberListViewModel$_memberListDbFlow$lambda$2$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        groupMemberListViewModel$_memberListDbFlow$lambda$2$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        groupMemberListViewModel$_memberListDbFlow$lambda$2$$inlined$map$1$2$1 = new GroupMemberListViewModel$_memberListDbFlow$lambda$2$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = groupMemberListViewModel$_memberListDbFlow$lambda$2$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = groupMemberListViewModel$_memberListDbFlow$lambda$2$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    List<C34282nYe> list = (List) obj;
                    if (this.copydefault.djBIcL()) {
                        listEZpvd = C35551nxW.copydefault.AEQbTJ(list);
                    } else {
                        listEZpvd = C35551nxW.copydefault.EZpvd(list);
                    }
                    groupMemberListViewModel$_memberListDbFlow$lambda$2$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listEZpvd, groupMemberListViewModel$_memberListDbFlow$lambda$2$$inlined$map$1$2$1) == objCopydefault) {
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

        public Application(Flow flow, GroupMemberListViewModel groupMemberListViewModel) {
            this.EZpvd = flow;
            this.OLrzqt = groupMemberListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends C34282nYe>> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class FragmentManager implements Flow<List<? extends GroupMemberInfo>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel$FragmentManager$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                GroupMemberListViewModel$special$$inlined$map$1$2$1 groupMemberListViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof GroupMemberListViewModel$special$$inlined$map$1$2$1) {
                    groupMemberListViewModel$special$$inlined$map$1$2$1 = (GroupMemberListViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = groupMemberListViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        groupMemberListViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        groupMemberListViewModel$special$$inlined$map$1$2$1 = new GroupMemberListViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = groupMemberListViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = groupMemberListViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    ArrayList arrayList = new ArrayList();
                    for (T t : (List) obj) {
                        if (((C34282nYe) t).AkhnZx()) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((C34282nYe) it.next()).values());
                    }
                    groupMemberListViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList2, groupMemberListViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
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

        public FragmentManager(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends GroupMemberInfo>> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class PendingIntent implements Flow<String> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel$PendingIntent$4, reason: invalid class name */
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
                GroupMemberListViewModel$special$$inlined$filterNot$1$2$1 groupMemberListViewModel$special$$inlined$filterNot$1$2$1;
                if (continuation instanceof GroupMemberListViewModel$special$$inlined$filterNot$1$2$1) {
                    groupMemberListViewModel$special$$inlined$filterNot$1$2$1 = (GroupMemberListViewModel$special$$inlined$filterNot$1$2$1) continuation;
                    int i = groupMemberListViewModel$special$$inlined$filterNot$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        groupMemberListViewModel$special$$inlined$filterNot$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        groupMemberListViewModel$special$$inlined$filterNot$1$2$1 = new GroupMemberListViewModel$special$$inlined$filterNot$1$2$1(this, continuation);
                    }
                }
                Object obj2 = groupMemberListViewModel$special$$inlined$filterNot$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = groupMemberListViewModel$special$$inlined$filterNot$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    if (!StringsKt__StringsKt.fARcdN((CharSequence) obj)) {
                        groupMemberListViewModel$special$$inlined$filterNot$1$2$1.label = 1;
                        if (flowCollector.emit(obj, groupMemberListViewModel$special$$inlined$filterNot$1$2$1) == objCopydefault) {
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

        public PendingIntent(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public GroupMemberListViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull oDI odi, @NotNull C35798oEb c35798oEb, @NotNull oDX odx, @NotNull oDT odt, @NotNull C35859oGi c35859oGi, @NotNull oDV odv) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(odi, "");
        Intrinsics.checkNotNullParameter(c35798oEb, "");
        Intrinsics.checkNotNullParameter(odx, "");
        Intrinsics.checkNotNullParameter(odt, "");
        Intrinsics.checkNotNullParameter(c35859oGi, "");
        Intrinsics.checkNotNullParameter(odv, "");
        this.fJNWhG = savedStateHandle;
        this.AkhnZx = odi;
        this.valueOf = c35798oEb;
        this.isConnected = odx;
        this.fetchVPNInfo = odt;
        this.ejfBZ = c35859oGi;
        this.AuCTel = odv;
        StateFlow<String> stateFlow = savedStateHandle.getStateFlow("KEY_GROUP_ID", "");
        this.AEQbTJ = stateFlow;
        StateFlow<String> stateFlow2 = savedStateHandle.getStateFlow("KEY_SEARCH_QUERY", "");
        this.gEmmrt = stateFlow2;
        this.DbNXlk = savedStateHandle.getStateFlow("KEY_IS_EDIT_MODE", Boolean.FALSE);
        MutableStateFlow<StateListAnimator> MutableStateFlow = StateFlowKt.MutableStateFlow(StateListAnimator.C0446StateListAnimator.KWHzl);
        this.AhwBna = MutableStateFlow;
        this.fIwbmz = FlowKt.asStateFlow(MutableStateFlow);
        this.KWHzl = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.copydefault = FlowKt.transformLatest(new PendingIntent(stateFlow), new GroupMemberListViewModel$special$$inlined$flatMapLatest$1(null, this));
        MutableStateFlow<List<C34282nYe>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow2;
        Flow flowCombine = FlowKt.combine(FlowKt.filterNotNull(MutableStateFlow2), FlowKt.distinctUntilChanged(FlowKt.debounce(stateFlow2, 300L)), new GroupMemberListViewModel$_searchedListFlow$1(this, null));
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.AYXKKw = FlowKt.stateIn(flowCombine, viewModelScope, companion.getLazily(), null);
        this.djBIcL = new LinkedHashMap();
        this.fARcdN = FlowKt.stateIn(new FragmentManager(FlowKt.filterNotNull(MutableStateFlow2)), ViewModelKt.getViewModelScope(this), companion.getLazily(), yDY.AhwBna());
        this.values = FlowKt.filterNotNull(FlowKt.transformLatest(stateFlow, new GroupMemberListViewModel$special$$inlined$flatMapLatest$2(null, this)));
        this.uzCIH = C56392yDr.copydefault(new Function0() { // from class: o.nYk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(GroupMemberListViewModel.AEQbTJ());
            }
        });
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0446StateListAnimator extends StateListAnimator {
            public static final C0446StateListAnimator KWHzl = new C0446StateListAnimator();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0446StateListAnimator)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1518829667;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return SILoading.LUA_CLASS_NAME;
            }

            private C0446StateListAnimator() {
                super(null);
            }
        }

        private StateListAnimator() {
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class ActionBar extends StateListAnimator {
            public static final ActionBar EZpvd = new ActionBar();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1548186757;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "LegacyLoader";
            }

            private ActionBar() {
                super(null);
            }
        }

        public static final class Application extends StateListAnimator {
            public final int AEQbTJ;
            public final List<C34286nYi> KWHzl;
            public final int OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel$StateListAnimator$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Application copy$default(Application application, List list, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    list = application.KWHzl;
                }
                if ((i3 & 2) != 0) {
                    i = application.AEQbTJ;
                }
                if ((i3 & 4) != 0) {
                    i2 = application.OLrzqt;
                }
                return application.KWHzl(list, i, i2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application KWHzl(@NotNull List<C34286nYi> list, int i, int i2) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Application(list, i, i2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<C34286nYi> OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && this.AEQbTJ == application.AEQbTJ && this.OLrzqt == application.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.KWHzl.hashCode() * 31) + Integer.hashCode(this.AEQbTJ)) * 31) + Integer.hashCode(this.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Content(categories=" + this.KWHzl + ", groupCount=" + this.AEQbTJ + ", selectedCount=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull List<C34286nYi> list, int i, int i2) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.KWHzl = list;
                this.AEQbTJ = i;
                this.OLrzqt = i2;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Activity extends StateListAnimator {
            public static final int copydefault = RelationInfo.$stable;
            public final String KWHzl;
            public final RelationInfo OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, String str, RelationInfo relationInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = activity.KWHzl;
                }
                if ((i & 2) != 0) {
                    relationInfo = activity.OLrzqt;
                }
                return activity.OLrzqt(str, relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity OLrzqt(@NotNull String str, @NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(relationInfo, "");
                return new Activity(str, relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return Intrinsics.EZpvd((Object) this.KWHzl, (Object) activity.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "MemberDetails(memberId=" + this.KWHzl + ", memberInfo=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull String str, @NotNull RelationInfo relationInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(relationInfo, "");
                this.KWHzl = str;
                this.OLrzqt = relationInfo;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class FragmentManager extends StateListAnimator {
            public static final FragmentManager OLrzqt = new FragmentManager();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FragmentManager)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 593776326;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RemoveMemberSuccess";
            }

            private FragmentManager() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Dialog extends StateListAnimator {
            public final Throwable KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Dialog copy$default(Dialog dialog, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = dialog.KWHzl;
                }
                return dialog.OLrzqt(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Dialog OLrzqt(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new Dialog(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Dialog) && Intrinsics.EZpvd(this.KWHzl, ((Dialog) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RemoveMemberFailed(error=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dialog(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.KWHzl = th;
            }
        }

        public static final class TaskDescription extends StateListAnimator {
            public final Throwable AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = taskDescription.AEQbTJ;
                }
                return taskDescription.EZpvd(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription EZpvd(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new TaskDescription(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.AEQbTJ, ((TaskDescription) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(error=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.AEQbTJ = th;
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Activity extends ActionBar {
            public static final Activity OLrzqt = new Activity();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -289034763;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return SILoading.LUA_CLASS_NAME;
            }

            private Activity() {
                super(null);
            }
        }

        private ActionBar() {
        }

        /* JADX INFO: loaded from: classes23.dex */
        public static final class StateListAnimator extends ActionBar {
            public static final StateListAnimator EZpvd = new StateListAnimator();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 109390918;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Empty";
            }

            private StateListAnimator() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Application extends ActionBar {
            public final List<C34282nYe> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel$ActionBar$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Application copy$default(Application application, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = application.copydefault;
                }
                return application.KWHzl(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application KWHzl(@NotNull List<C34282nYe> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Application(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<C34282nYe> copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.copydefault, ((Application) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Content(list=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull List<C34282nYe> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.copydefault = list;
            }
        }
    }

    public final StateListAnimator.Application copydefault() {
        List<C34286nYi> value = this.KWHzl.getValue();
        List<C34282nYe> value2 = this.OLrzqt.getValue();
        return new StateListAnimator.Application(value, value2 != null ? value2.size() : 0, this.fARcdN.getValue().size());
    }

    public final boolean gEmmrt() {
        Boolean bool = (Boolean) this.fJNWhG.get("KEY_IS_PAID_GROUP");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean djBIcL() {
        Boolean bool = (Boolean) this.fJNWhG.get("KEY_IS_VIP_GROUP");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean AhwBna() {
        return ((Boolean) this.uzCIH.getValue()).booleanValue();
    }

    public static final boolean AEQbTJ() {
        return C44157sFk.AEQbTJ();
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = GroupMemberListViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GroupMemberListViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04411(GroupMemberListViewModel groupMemberListViewModel, Continuation<? super C04411> continuation) {
                super(2, continuation);
                this.this$0 = groupMemberListViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04411(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C04421 extends SuspendLambda implements Function2<GroupInfo, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GroupMemberListViewModel this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04421(GroupMemberListViewModel groupMemberListViewModel, Continuation<? super C04421> continuation) {
                    super(2, continuation);
                    this.this$0 = groupMemberListViewModel;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C04421 c04421 = new C04421(this.this$0, continuation);
                    c04421.L$0 = obj;
                    return c04421;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GroupInfo groupInfo, Continuation<? super Unit> continuation) {
                    return ((C04421) create(groupInfo, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        GroupInfo groupInfo = (GroupInfo) this.L$0;
                        SavedStateHandle savedStateHandle = this.this$0.fJNWhG;
                        Integer type = groupInfo.getType();
                        boolean z = false;
                        savedStateHandle.set("KEY_IS_PAID_GROUP", C56443yFo.KWHzl(type != null && type.intValue() == GroupTagType.PAID_GROUP.getValue()));
                        SavedStateHandle savedStateHandle2 = this.this$0.fJNWhG;
                        Integer type2 = groupInfo.getType();
                        int value = GroupTagType.RM_VIP_GROUP.getValue();
                        if (type2 != null && type2.intValue() == value) {
                            z = true;
                        }
                        savedStateHandle2.set("KEY_IS_VIP_GROUP", C56443yFo.KWHzl(z));
                        GroupMemberListViewModel.refreshGroupMemberInfo$default(this.this$0, null, 1, null);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Flow<GroupInfo> flowOLrzqt = this.this$0.OLrzqt();
                    C04421 c04421 = new C04421(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowOLrzqt, c04421, this) == objCopydefault) {
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C04411(GroupMemberListViewModel.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(GroupMemberListViewModel.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(GroupMemberListViewModel.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(GroupMemberListViewModel.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GroupMemberListViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(GroupMemberListViewModel groupMemberListViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = groupMemberListViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel$1$2$1, reason: invalid class name and collision with other inner class name */
            public static final class C04431 extends SuspendLambda implements Function2<List<? extends C34282nYe>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GroupMemberListViewModel this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04431(GroupMemberListViewModel groupMemberListViewModel, Continuation<? super C04431> continuation) {
                    super(2, continuation);
                    this.this$0 = groupMemberListViewModel;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C04431 c04431 = new C04431(this.this$0, continuation);
                    c04431.L$0 = obj;
                    return c04431;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends C34282nYe> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<C34282nYe>) list, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<C34282nYe> list, Continuation<? super Unit> continuation) {
                    return ((C04431) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object value;
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        List list = (List) this.L$0;
                        MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value, list));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Flow flow = this.this$0.copydefault;
                    C04431 c04431 = new C04431(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c04431, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GroupMemberListViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(GroupMemberListViewModel groupMemberListViewModel, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = groupMemberListViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
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
                    StateFlow<Boolean> stateFlowAYXKKw = this.this$0.AYXKKw();
                    C04441 c04441 = new C04441(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowAYXKKw, c04441, this) == objCopydefault) {
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

            /* JADX INFO: renamed from: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel$1$3$1, reason: invalid class name and collision with other inner class name */
            public static final class C04441 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ GroupMemberListViewModel this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04441(GroupMemberListViewModel groupMemberListViewModel, Continuation<? super C04441> continuation) {
                    super(2, continuation);
                    this.this$0 = groupMemberListViewModel;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C04441 c04441 = new C04441(this.this$0, continuation);
                    c04441.Z$0 = ((Boolean) obj).booleanValue();
                    return c04441;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C04441) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    ArrayList arrayList;
                    Object obj2;
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        boolean z = this.Z$0;
                        MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
                        do {
                            Object value = mutableStateFlow.getValue();
                            List<C34282nYe> list = (List) value;
                            if (list != null) {
                                arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                                for (C34282nYe c34282nYe : list) {
                                    ArrayList arrayList2 = arrayList;
                                    arrayList2.add(c34282nYe.EZpvd((61431 & 1) != 0 ? c34282nYe.DbNXlk : null, (61431 & 2) != 0 ? c34282nYe.gEmmrt : null, (61431 & 4) != 0 ? c34282nYe.AEQbTJ : null, (61431 & 8) != 0 ? c34282nYe.copydefault : null, (61431 & 16) != 0 ? c34282nYe.fetchVPNInfo : null, (61431 & 32) != 0 ? c34282nYe.isConnected : null, (61431 & 64) != 0 ? c34282nYe.EZpvd : null, (61431 & 128) != 0 ? c34282nYe.fIwbmz : null, (61431 & 256) != 0 ? c34282nYe.KWHzl : null, (61431 & 512) != 0 ? c34282nYe.OLrzqt : null, (61431 & 1024) != 0 ? c34282nYe.values : null, (61431 & 2048) != 0 ? c34282nYe.djBIcL : null, (61431 & 4096) != 0 ? c34282nYe.AkhnZx : null, (61431 & 8192) != 0 ? c34282nYe.AYXKKw : z, (61431 & 16384) != 0 ? c34282nYe.valueOf : !z ? false : c34282nYe.AkhnZx(), (61431 & 32768) != 0 ? c34282nYe.AhwBna : false));
                                    arrayList = arrayList2;
                                    value = value;
                                    mutableStateFlow = mutableStateFlow;
                                }
                                obj2 = value;
                            } else {
                                arrayList = null;
                                obj2 = value;
                            }
                        } while (!mutableStateFlow.compareAndSet(obj2, arrayList));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GroupMemberListViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(GroupMemberListViewModel groupMemberListViewModel, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = groupMemberListViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
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
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.AYXKKw);
                    C04451 c04451 = new C04451(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowFilterNotNull, c04451, this) == objCopydefault) {
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

            /* JADX INFO: renamed from: com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel$1$4$1, reason: invalid class name and collision with other inner class name */
            public static final class C04451 extends SuspendLambda implements Function2<List<? extends C34282nYe>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GroupMemberListViewModel this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04451(GroupMemberListViewModel groupMemberListViewModel, Continuation<? super C04451> continuation) {
                    super(2, continuation);
                    this.this$0 = groupMemberListViewModel;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C04451 c04451 = new C04451(this.this$0, continuation);
                    c04451.L$0 = obj;
                    return c04451;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends C34282nYe> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<C34282nYe>) list, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<C34282nYe> list, Continuation<? super Unit> continuation) {
                    return ((C04451) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object value;
                    ArrayList arrayList;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i = this.label;
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        List list = (List) this.L$0;
                        if (!(this.this$0.AhwBna.getValue() instanceof StateListAnimator.C0446StateListAnimator)) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list) {
                                if (!C44170sFx.EZpvd(((C34282nYe) obj2).AYXKKw())) {
                                    arrayList2.add(obj2);
                                }
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj3 : arrayList2) {
                                Integer numAEQbTJ = C56443yFo.AEQbTJ(((C34282nYe) obj3).KWHzl().getRawValue());
                                Object arrayList3 = linkedHashMap.get(numAEQbTJ);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    linkedHashMap.put(numAEQbTJ, arrayList3);
                                }
                                ((List) arrayList3).add(obj3);
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                linkedHashMap2.put(entry.getKey(), C56443yFo.AEQbTJ(((List) entry.getValue()).size()));
                            }
                            MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
                            do {
                                value = mutableStateFlow.getValue();
                                List<C34286nYi> list2 = (List) value;
                                arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                                for (C34286nYi c34286nYi : list2) {
                                    Integer num = (Integer) linkedHashMap2.get(C56443yFo.AEQbTJ(c34286nYi.EZpvd()));
                                    arrayList.add(C34286nYi.copy$default(c34286nYi, 0, null, num != null ? num.intValue() : 0, false, 11, null));
                                }
                            } while (!mutableStateFlow.compareAndSet(value, arrayList));
                            MutableStateFlow mutableStateFlow2 = this.this$0.AhwBna;
                            StateListAnimator.Application applicationCopydefault = this.this$0.copydefault();
                            this.label = 1;
                            if (mutableStateFlow2.emit(applicationCopydefault, this) == objCopydefault) {
                                return objCopydefault;
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
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd("GroupMembersViewModel", "initGroupInfo: groupId=" + str);
        this.fJNWhG.set("KEY_GROUP_ID", str);
    }

    public static /* synthetic */ void refreshGroupMemberInfo$default(GroupMemberListViewModel groupMemberListViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        groupMemberListViewModel.EZpvd(str);
    }

    public final void EZpvd(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupMemberListViewModel$refreshGroupMemberInfo$1(this, null), 3, null);
    }

    public final StateFlow<ActionBar> KWHzl(int i) {
        if (this.djBIcL.containsKey(Integer.valueOf(i))) {
            pUU.KWHzl("GroupMembersViewModel", "Using cached filtered list for categoryId=" + i);
            return (StateFlow) C56424yEw.EZpvd((Map<Integer, ? extends V>) ((Map<Object, ? extends V>) this.djBIcL), Integer.valueOf(i));
        }
        pUU.KWHzl("GroupMembersViewModel", "Creating new filtered list for categoryId=" + i);
        StateFlow<ActionBar> stateFlowStateIn = FlowKt.stateIn(new Activity(FlowKt.filterNotNull(this.AYXKKw), this, i), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getEagerly(), ActionBar.Activity.OLrzqt);
        this.djBIcL.put(Integer.valueOf(i), stateFlowStateIn);
        return stateFlowStateIn;
    }

    public final List<C34282nYe> EZpvd(List<C34282nYe> list) {
        if (djBIcL()) {
            return C35551nxW.copydefault.AEQbTJ(list);
        }
        return C35551nxW.copydefault.EZpvd(list);
    }

    public final void KWHzl(boolean z) {
        this.fJNWhG.set("KEY_IS_EDIT_MODE", Boolean.valueOf(z));
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("GroupMembersViewModel", "Group member search: " + str);
        this.fJNWhG.set("KEY_SEARCH_QUERY", str);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C44157sFk.KWHzl(str) || this.DbNXlk.getValue().booleanValue()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupMemberListViewModel$triggerMemberDetails$1(this, str, null), 3, null);
    }

    public final void OLrzqt(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupMemberListViewModel$toggleMemberSelect$1(this, str, z, null), 3, null);
    }

    public final void DbNXlk() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupMemberListViewModel$removeSelectedMembers$1(this, null), 3, null);
    }

    public final List<C34282nYe> AEQbTJ(List<C34282nYe> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C34282nYe c34282nYe = (C34282nYe) obj;
            if (i != BillingCyclePaymentStatus.UNKNOWN.getRawValue()) {
                if (i != BillingCyclePaymentStatus.EXEMPTED.getRawValue() || !C44170sFx.EZpvd(c34282nYe.AYXKKw())) {
                    if (i == c34282nYe.KWHzl().getRawValue()) {
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
