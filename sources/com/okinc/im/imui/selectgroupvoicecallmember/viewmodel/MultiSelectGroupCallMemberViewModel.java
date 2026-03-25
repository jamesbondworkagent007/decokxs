package com.okinc.im.imui.selectgroupvoicecallmember.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.relationlist.model.ReferralData;
import com.okinc.im.imui.selectgroupvoicecallmember.model.SelectionStatus;
import com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel;
import com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
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
import o.C32989mnw;
import o.C34282nYe;
import o.C35551nxW;
import o.C37563owG;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.oDI;
import o.oDX;
import o.pUU;
import o.yCM;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiSelectGroupCallMemberViewModel extends ViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final StateFlow<String> AEQbTJ;
    public final MutableStateFlow<Set<String>> AYXKKw;
    public final MutableLiveData<Boolean> AhwBna;
    public final StateFlow<Integer> AkhnZx;
    public ActionBar AuCTel;
    public final oDI DbNXlk;
    public final MutableLiveData<List<Object>> EZpvd;
    public final MutableLiveData<C32989mnw<TaskDescription>> OLrzqt;
    public final StateFlow<GroupInfo> copydefault;
    public final Flow<List<C34282nYe>> djBIcL;
    public final StateFlow<Set<String>> fARcdN;
    public MutableStateFlow<String> fJNWhG;
    public boolean fetchVPNInfo;
    public final MutableLiveData<List<C34282nYe>> gEmmrt;
    public final oDX isConnected;
    public final LiveData<Boolean> valueOf;
    public String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Set<String>> EZpvd() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<Object>> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar OLrzqt() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.fetchVPNInfo = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<TaskDescription>> copydefault() {
        return this.OLrzqt;
    }

    public static final class Activity implements Flow<String> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel$Activity$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                MultiSelectGroupCallMemberViewModel$special$$inlined$filterNot$1$2$1 multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$1$2$1;
                if (continuation instanceof MultiSelectGroupCallMemberViewModel$special$$inlined$filterNot$1$2$1) {
                    multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$1$2$1 = (MultiSelectGroupCallMemberViewModel$special$$inlined$filterNot$1$2$1) continuation;
                    int i = multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$1$2$1 = new MultiSelectGroupCallMemberViewModel$special$$inlined$filterNot$1$2$1(this, continuation);
                    }
                }
                Object obj2 = multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    if (!StringsKt__StringsKt.fARcdN((CharSequence) obj)) {
                        multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$1$2$1.label = 1;
                        if (flowCollector.emit(obj, multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Application implements Flow<List<? extends C34282nYe>> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel$Application$5, reason: invalid class name */
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
                MultiSelectGroupCallMemberViewModel$_memberListDbFlow$lambda$6$$inlined$map$1$2$1 multiSelectGroupCallMemberViewModel$_memberListDbFlow$lambda$6$$inlined$map$1$2$1;
                if (continuation instanceof MultiSelectGroupCallMemberViewModel$_memberListDbFlow$lambda$6$$inlined$map$1$2$1) {
                    multiSelectGroupCallMemberViewModel$_memberListDbFlow$lambda$6$$inlined$map$1$2$1 = (MultiSelectGroupCallMemberViewModel$_memberListDbFlow$lambda$6$$inlined$map$1$2$1) continuation;
                    int i = multiSelectGroupCallMemberViewModel$_memberListDbFlow$lambda$6$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        multiSelectGroupCallMemberViewModel$_memberListDbFlow$lambda$6$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        multiSelectGroupCallMemberViewModel$_memberListDbFlow$lambda$6$$inlined$map$1$2$1 = new MultiSelectGroupCallMemberViewModel$_memberListDbFlow$lambda$6$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = multiSelectGroupCallMemberViewModel$_memberListDbFlow$lambda$6$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = multiSelectGroupCallMemberViewModel$_memberListDbFlow$lambda$6$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    List<C34282nYe> listEZpvd = C35551nxW.copydefault.EZpvd((List<C34282nYe>) obj);
                    multiSelectGroupCallMemberViewModel$_memberListDbFlow$lambda$6$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listEZpvd, multiSelectGroupCallMemberViewModel$_memberListDbFlow$lambda$6$$inlined$map$1$2$1) == objCopydefault) {
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
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends C34282nYe>> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Dialog implements Flow<String> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel$Dialog$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                MultiSelectGroupCallMemberViewModel$special$$inlined$filterNot$2$2$1 multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$2$2$1;
                if (continuation instanceof MultiSelectGroupCallMemberViewModel$special$$inlined$filterNot$2$2$1) {
                    multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$2$2$1 = (MultiSelectGroupCallMemberViewModel$special$$inlined$filterNot$2$2$1) continuation;
                    int i = multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$2$2$1 = new MultiSelectGroupCallMemberViewModel$special$$inlined$filterNot$2$2$1(this, continuation);
                    }
                }
                Object obj2 = multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$2$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    if (!StringsKt__StringsKt.fARcdN((CharSequence) obj)) {
                        multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$2$2$1.label = 1;
                        if (flowCollector.emit(obj, multiSelectGroupCallMemberViewModel$special$$inlined$filterNot$2$2$1) == objCopydefault) {
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

        public Dialog(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class FragmentManager implements Flow<Integer> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel$FragmentManager$3, reason: invalid class name */
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
                MultiSelectGroupCallMemberViewModel$special$$inlined$map$1$2$1 multiSelectGroupCallMemberViewModel$special$$inlined$map$1$2$1;
                GroupVoiceCallConfig groupVoiceCallConfig;
                Integer maxParticipants;
                if (continuation instanceof MultiSelectGroupCallMemberViewModel$special$$inlined$map$1$2$1) {
                    multiSelectGroupCallMemberViewModel$special$$inlined$map$1$2$1 = (MultiSelectGroupCallMemberViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = multiSelectGroupCallMemberViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        multiSelectGroupCallMemberViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        multiSelectGroupCallMemberViewModel$special$$inlined$map$1$2$1 = new MultiSelectGroupCallMemberViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = multiSelectGroupCallMemberViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = multiSelectGroupCallMemberViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    GroupInfo groupInfo = (GroupInfo) obj;
                    Integer numAEQbTJ = C56443yFo.AEQbTJ((groupInfo == null || (groupVoiceCallConfig = groupInfo.getGroupVoiceCallConfig()) == null || (maxParticipants = groupVoiceCallConfig.getMaxParticipants()) == null) ? 16 : maxParticipants.intValue());
                    multiSelectGroupCallMemberViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(numAEQbTJ, multiSelectGroupCallMemberViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
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
        public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @yCM
    public MultiSelectGroupCallMemberViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull oDX odx, @NotNull oDI odi) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(odx, "");
        Intrinsics.checkNotNullParameter(odi, "");
        this.isConnected = odx;
        this.DbNXlk = odi;
        this.AuCTel = ActionBar.TaskDescription.copydefault;
        this.EZpvd = new MutableLiveData<>();
        this.fJNWhG = StateFlowKt.MutableStateFlow(null);
        MutableStateFlow<Set<String>> MutableStateFlow = StateFlowKt.MutableStateFlow(yEE.copydefault());
        this.AYXKKw = MutableStateFlow;
        this.fARcdN = FlowKt.asStateFlow(MutableStateFlow);
        this.gEmmrt = new MutableLiveData<>();
        this.valueOf = Transformations.map(KWHzl(), new Function1() { // from class: o.owL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(MultiSelectGroupCallMemberViewModel.EZpvd((java.util.List) obj));
            }
        });
        this.OLrzqt = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        StateFlow<String> stateFlow = savedStateHandle.getStateFlow("ARG_GROUP_ID", "");
        this.AEQbTJ = stateFlow;
        Flow flowTransformLatest = FlowKt.transformLatest(new Activity(stateFlow), new MultiSelectGroupCallMemberViewModel$special$$inlined$flatMapLatest$1(null, this));
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        StateFlow<GroupInfo> stateFlowStateIn = FlowKt.stateIn(flowTransformLatest, viewModelScope, companion.getEagerly(), null);
        this.copydefault = stateFlowStateIn;
        this.AkhnZx = FlowKt.stateIn(FlowKt.distinctUntilChanged(new FragmentManager(stateFlowStateIn)), ViewModelKt.getViewModelScope(this), companion.getEagerly(), 16);
        this.djBIcL = FlowKt.transformLatest(new Dialog(stateFlow), new MultiSelectGroupCallMemberViewModel$special$$inlined$flatMapLatest$2(null, this));
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel$TaskDescription$TaskDescription, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class C0485TaskDescription extends TaskDescription {
            public final ReferralData KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0485TaskDescription copy$default(C0485TaskDescription c0485TaskDescription, ReferralData referralData, int i, Object obj) {
                if ((i & 1) != 0) {
                    referralData = c0485TaskDescription.KWHzl;
                }
                return c0485TaskDescription.copydefault(referralData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ReferralData EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0485TaskDescription copydefault(@NotNull ReferralData referralData) {
                Intrinsics.checkNotNullParameter(referralData, "");
                return new C0485TaskDescription(referralData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0485TaskDescription) && Intrinsics.EZpvd(this.KWHzl, ((C0485TaskDescription) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InviteUser(referralData=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0485TaskDescription(@NotNull ReferralData referralData) {
                super(null);
                Intrinsics.checkNotNullParameter(referralData, "");
                this.KWHzl = referralData;
            }
        }

        private TaskDescription() {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class StateListAnimator extends TaskDescription {
            public final String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.AEQbTJ;
                }
                return stateListAnimator.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator AEQbTJ(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((StateListAnimator) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ToastWithFail(msg=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }
    }

    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Activity extends ActionBar {
            public static final Activity OLrzqt = new Activity();

            private Activity() {
                super(null);
            }
        }

        public static final class TaskDescription extends ActionBar {
            public static final TaskDescription copydefault = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }
    }

    public final LiveData<List<C34282nYe>> djBIcL() {
        return Transformations.distinctUntilChanged(this.gEmmrt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EZpvd(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.isEmpty();
    }

    public final void KWHzl(String str, @NotNull List<String> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.values = str;
        pUU.EZpvd("MultiSelectRelationViewModel", "Set groupId: " + str);
        this.AuCTel = ActionBar.Activity.OLrzqt;
        AEQbTJ(list);
        KWHzl(list2);
        AhwBna();
        AhwBna();
    }

    public final void AEQbTJ(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AYXKKw.setValue(CollectionsKt___CollectionsKt.OqFWZa(list));
    }

    public final void copydefault(String str) {
        this.fJNWhG.setValue(str);
    }

    public final void KWHzl(List<String> list) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MultiSelectGroupCallMemberViewModel$observeDataList$1(this, list, null), 3, null);
    }

    public final List<C34282nYe> EZpvd(@NotNull List<C34282nYe> list, @NotNull String str, boolean z) {
        String str2;
        String str3 = "";
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (!StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            HashMap map = new HashMap();
            ArrayList<C34282nYe> arrayList = new ArrayList();
            for (Object obj : list) {
                C34282nYe c34282nYe = (C34282nYe) obj;
                GroupMemberInfo groupMemberInfoValues = c34282nYe.values();
                if (z) {
                    str2 = str;
                    if (StringsKt__StringsKt.AhwBna((CharSequence) c34282nYe.AhwBna(), (CharSequence) str2, true)) {
                        map.put(c34282nYe.AhwBna(), c34282nYe.AhwBna());
                    }
                    arrayList.add(obj);
                } else {
                    str2 = str;
                }
                if (!StringsKt__StringsKt.AhwBna((CharSequence) c34282nYe.AEQbTJ(), (CharSequence) str2, true)) {
                    if (StringsKt__StringsKt.AhwBna((CharSequence) groupMemberInfoValues.getNickName(), (CharSequence) str2, true)) {
                        map.put(c34282nYe.AhwBna(), groupMemberInfoValues.getNickName());
                    } else {
                        String remarkName = groupMemberInfoValues.getRemarkName();
                        if (remarkName == null) {
                            remarkName = "";
                        }
                        if (StringsKt__StringsKt.AhwBna((CharSequence) remarkName, (CharSequence) str2, true)) {
                            String strAhwBna = c34282nYe.AhwBna();
                            String remarkName2 = groupMemberInfoValues.getRemarkName();
                            if (remarkName2 == null) {
                                remarkName2 = "";
                            }
                            map.put(strAhwBna, remarkName2);
                        }
                    }
                }
                arrayList.add(obj);
            }
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            for (C34282nYe c34282nYe2 : arrayList) {
                String str4 = (String) map.get(c34282nYe2.AhwBna());
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(c34282nYe2.EZpvd((61431 & 1) != 0 ? c34282nYe2.DbNXlk : null, (61431 & 2) != 0 ? c34282nYe2.gEmmrt : null, (61431 & 4) != 0 ? c34282nYe2.AEQbTJ : null, (61431 & 8) != 0 ? c34282nYe2.copydefault : str4 == null ? str3 : str4, (61431 & 16) != 0 ? c34282nYe2.fetchVPNInfo : null, (61431 & 32) != 0 ? c34282nYe2.isConnected : null, (61431 & 64) != 0 ? c34282nYe2.EZpvd : null, (61431 & 128) != 0 ? c34282nYe2.fIwbmz : null, (61431 & 256) != 0 ? c34282nYe2.KWHzl : null, (61431 & 512) != 0 ? c34282nYe2.OLrzqt : null, (61431 & 1024) != 0 ? c34282nYe2.values : null, (61431 & 2048) != 0 ? c34282nYe2.djBIcL : null, (61431 & 4096) != 0 ? c34282nYe2.AkhnZx : str, (61431 & 8192) != 0 ? c34282nYe2.AYXKKw : false, (61431 & 16384) != 0 ? c34282nYe2.valueOf : false, (61431 & 32768) != 0 ? c34282nYe2.AhwBna : false));
                arrayList2 = arrayList3;
                str3 = str3;
                map = map;
            }
            return arrayList2;
        }
        ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C34282nYe c34282nYe3 : list) {
            ArrayList arrayList5 = arrayList4;
            arrayList5.add(c34282nYe3.EZpvd((61431 & 1) != 0 ? c34282nYe3.DbNXlk : null, (61431 & 2) != 0 ? c34282nYe3.gEmmrt : null, (61431 & 4) != 0 ? c34282nYe3.AEQbTJ : null, (61431 & 8) != 0 ? c34282nYe3.copydefault : "", (61431 & 16) != 0 ? c34282nYe3.fetchVPNInfo : null, (61431 & 32) != 0 ? c34282nYe3.isConnected : null, (61431 & 64) != 0 ? c34282nYe3.EZpvd : null, (61431 & 128) != 0 ? c34282nYe3.fIwbmz : null, (61431 & 256) != 0 ? c34282nYe3.KWHzl : null, (61431 & 512) != 0 ? c34282nYe3.OLrzqt : null, (61431 & 1024) != 0 ? c34282nYe3.values : null, (61431 & 2048) != 0 ? c34282nYe3.djBIcL : null, (61431 & 4096) != 0 ? c34282nYe3.AkhnZx : str, (61431 & 8192) != 0 ? c34282nYe3.AYXKKw : false, (61431 & 16384) != 0 ? c34282nYe3.valueOf : false, (61431 & 32768) != 0 ? c34282nYe3.AhwBna : false));
            arrayList4 = arrayList5;
        }
        return arrayList4;
    }

    public final List<Object> KWHzl(List<C34282nYe> list, Set<String> set, List<String> list2, String str) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            ArrayList<C34282nYe> arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!list2.contains(((C34282nYe) obj).AhwBna())) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (C34282nYe c34282nYe : arrayList2) {
                arrayList3.add(new C37563owG(c34282nYe, str, AEQbTJ(set, list2, c34282nYe)));
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    private final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MultiSelectGroupCallMemberViewModel$observeSelectedFriendList$1(this, null), 3, null);
    }

    public final SelectionStatus AEQbTJ(Set<String> set, List<String> list, C34282nYe c34282nYe) {
        Object next;
        boolean zContains = list.contains(c34282nYe.AhwBna());
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) c34282nYe.AhwBna(), next)) {
                break;
            }
        }
        boolean z = next != null;
        boolean z2 = set.size() + list.size() >= this.AkhnZx.getValue().intValue();
        if (zContains) {
            return SelectionStatus.COMPLETED;
        }
        if (z) {
            return SelectionStatus.SELECTED;
        }
        if (!z2) {
            return SelectionStatus.UNSELECTED;
        }
        return SelectionStatus.DISABLED;
    }

    public final void AEQbTJ(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        int iIntValue = this.AkhnZx.getValue().intValue();
        Set<String> setDXXBbs = CollectionsKt___CollectionsKt.DXXBbs(this.AYXKKw.getValue());
        if (z) {
            if (setDXXBbs.size() >= iIntValue) {
                pUU.AEQbTJ("Update relation Selection: Reached selection limit");
                return;
            } else {
                this.AuCTel = ActionBar.Activity.OLrzqt;
                setDXXBbs.add(str);
            }
        } else {
            this.AuCTel = ActionBar.TaskDescription.copydefault;
            setDXXBbs.remove(str);
        }
        this.AYXKKw.setValue(setDXXBbs);
    }

    public final void valueOf() {
        this.AuCTel = ActionBar.TaskDescription.copydefault;
    }
}
