package com.okinc.im.imui.messages.audio.call.fragment;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.model.im.GroupVoiceCallData;
import com.okinc.okimcore.model.im.GroupVoiceCallUser;
import com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC33073mpa;
import o.C34282nYe;
import o.C44157sFk;
import o.C44170sFx;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oDI;
import o.oDQ;
import o.oDT;
import o.yCM;
import o.yDY;
import o.yEE;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class CallMembersViewModel extends AbstractC33073mpa {
    public final StateFlow<Boolean> AYXKKw;
    public final SavedStateHandle AhwBna;
    public final StateFlow<List<C34282nYe>> EZpvd;
    public final oDT KWHzl;
    public final StateFlow<String> OLrzqt;
    public final SharedFlow<GroupInfo> copydefault;
    public final StateFlow<Boolean> djBIcL;
    public final oDI gEmmrt;
    public final Set<Integer> isConnected;
    public final StateFlow<Boolean> valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C34282nYe>> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> copydefault() {
        return this.AYXKKw;
    }

    @yCM
    public CallMembersViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull oDI odi, @NotNull oDT odt) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(odi, "");
        Intrinsics.checkNotNullParameter(odt, "");
        this.AhwBna = savedStateHandle;
        this.gEmmrt = odi;
        this.KWHzl = odt;
        StateFlow<String> stateFlow = savedStateHandle.getStateFlow("key_audio_call_group_id", null);
        this.OLrzqt = stateFlow;
        Flow flowFilterNotNull = FlowKt.filterNotNull(FlowKt.transformLatest(FlowKt.filterNotNull(stateFlow), new CallMembersViewModel$special$$inlined$flatMapLatest$1(null, this)));
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow<GroupInfo> sharedFlowShareIn = FlowKt.shareIn(flowFilterNotNull, viewModelScope, SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), 1);
        this.copydefault = sharedFlowShareIn;
        this.EZpvd = FlowKt.stateIn(FlowKt.mapLatest(sharedFlowShareIn, new CallMembersViewModel$callMembersList$1(this, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), yDY.AhwBna());
        Activity activity = new Activity(sharedFlowShareIn);
        CoroutineScope viewModelScope2 = ViewModelKt.getViewModelScope(this);
        SharingStarted sharingStartedWhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null);
        Boolean bool = Boolean.FALSE;
        this.valueOf = FlowKt.stateIn(activity, viewModelScope2, sharingStartedWhileSubscribed$default, bool);
        this.djBIcL = FlowKt.stateIn(new TaskDescription(sharedFlowShareIn), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), bool);
        this.isConnected = yEE.AhwBna(Integer.valueOf(GroupTagType.VIP_CHAT_GROUP.getValue()), Integer.valueOf(GroupTagType.RM_VIP_GROUP.getValue()));
        this.AYXKKw = FlowKt.stateIn(new FragmentManager(sharedFlowShareIn, this), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), bool);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messages.audio.call.fragment.CallMembersViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final class Activity implements Flow<Boolean> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: com.okinc.im.imui.messages.audio.call.fragment.CallMembersViewModel$Activity$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                CallMembersViewModel$special$$inlined$map$1$2$1 callMembersViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof CallMembersViewModel$special$$inlined$map$1$2$1) {
                    callMembersViewModel$special$$inlined$map$1$2$1 = (CallMembersViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = callMembersViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        callMembersViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        callMembersViewModel$special$$inlined$map$1$2$1 = new CallMembersViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = callMembersViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = callMembersViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    Boolean boolKWHzl = C56443yFo.KWHzl(((GroupInfo) obj).getAllowStartGroupVoiceCall());
                    callMembersViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, callMembersViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
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
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class FragmentManager implements Flow<Boolean> {
        public final /* synthetic */ CallMembersViewModel AEQbTJ;
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.im.imui.messages.audio.call.fragment.CallMembersViewModel$FragmentManager$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ CallMembersViewModel AEQbTJ;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, CallMembersViewModel callMembersViewModel) {
                this.OLrzqt = flowCollector;
                this.AEQbTJ = callMembersViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                CallMembersViewModel$special$$inlined$map$3$2$1 callMembersViewModel$special$$inlined$map$3$2$1;
                if (continuation instanceof CallMembersViewModel$special$$inlined$map$3$2$1) {
                    callMembersViewModel$special$$inlined$map$3$2$1 = (CallMembersViewModel$special$$inlined$map$3$2$1) continuation;
                    int i = callMembersViewModel$special$$inlined$map$3$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        callMembersViewModel$special$$inlined$map$3$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        callMembersViewModel$special$$inlined$map$3$2$1 = new CallMembersViewModel$special$$inlined$map$3$2$1(this, continuation);
                    }
                }
                Object obj2 = callMembersViewModel$special$$inlined$map$3$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = callMembersViewModel$special$$inlined$map$3$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    Boolean boolKWHzl = C56443yFo.KWHzl(CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends Integer>) ((Iterable<? extends Object>) this.AEQbTJ.isConnected), ((GroupInfo) obj).getType()));
                    callMembersViewModel$special$$inlined$map$3$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, callMembersViewModel$special$$inlined$map$3$2$1) == objCopydefault) {
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

        public FragmentManager(Flow flow, CallMembersViewModel callMembersViewModel) {
            this.OLrzqt = flow;
            this.AEQbTJ = callMembersViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass1(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class TaskDescription implements Flow<Boolean> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: com.okinc.im.imui.messages.audio.call.fragment.CallMembersViewModel$TaskDescription$2, reason: invalid class name */
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
                CallMembersViewModel$special$$inlined$map$2$2$1 callMembersViewModel$special$$inlined$map$2$2$1;
                Integer maxParticipants;
                List<GroupVoiceCallUser> activeUsers;
                if (continuation instanceof CallMembersViewModel$special$$inlined$map$2$2$1) {
                    callMembersViewModel$special$$inlined$map$2$2$1 = (CallMembersViewModel$special$$inlined$map$2$2$1) continuation;
                    int i = callMembersViewModel$special$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        callMembersViewModel$special$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        callMembersViewModel$special$$inlined$map$2$2$1 = new CallMembersViewModel$special$$inlined$map$2$2$1(this, continuation);
                    }
                }
                Object obj2 = callMembersViewModel$special$$inlined$map$2$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = callMembersViewModel$special$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    GroupVoiceCallConfig groupVoiceCallConfig = ((GroupInfo) obj).getGroupVoiceCallConfig();
                    GroupVoiceCallData currentCall = groupVoiceCallConfig != null ? groupVoiceCallConfig.getCurrentCall() : null;
                    Boolean boolKWHzl = C56443yFo.KWHzl(((currentCall == null || (activeUsers = currentCall.getActiveUsers()) == null) ? 0 : activeUsers.size()) >= ((currentCall == null || (maxParticipants = currentCall.getMaxParticipants()) == null) ? Integer.MAX_VALUE : maxParticipants.intValue()));
                    callMembersViewModel$special$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, callMembersViewModel$special$$inlined$map$2$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Application<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String strAEQbTJ = ((C34282nYe) t).AEQbTJ();
            Locale locale = Locale.ROOT;
            String lowerCase = strAEQbTJ.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            String lowerCase2 = ((C34282nYe) t2).AEQbTJ().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return yET.KWHzl(lowerCase, lowerCase2);
        }
    }

    public static final class StateListAnimator<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String strAEQbTJ = ((C34282nYe) t).AEQbTJ();
            Locale locale = Locale.ROOT;
            String lowerCase = strAEQbTJ.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            String lowerCase2 = ((C34282nYe) t2).AEQbTJ().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return yET.KWHzl(lowerCase, lowerCase2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(String str, GroupVoiceCallUser groupVoiceCallUser, Continuation<? super C34282nYe> continuation) throws Throwable {
        CallMembersViewModel$toGroupMemberDisplayModel$1 callMembersViewModel$toGroupMemberDisplayModel$1;
        if (continuation instanceof CallMembersViewModel$toGroupMemberDisplayModel$1) {
            callMembersViewModel$toGroupMemberDisplayModel$1 = (CallMembersViewModel$toGroupMemberDisplayModel$1) continuation;
            int i = callMembersViewModel$toGroupMemberDisplayModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                callMembersViewModel$toGroupMemberDisplayModel$1.label = i - Integer.MIN_VALUE;
            } else {
                callMembersViewModel$toGroupMemberDisplayModel$1 = new CallMembersViewModel$toGroupMemberDisplayModel$1(this, continuation);
            }
        }
        Object objAEQbTJ = callMembersViewModel$toGroupMemberDisplayModel$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = callMembersViewModel$toGroupMemberDisplayModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            String userUid = groupVoiceCallUser.getUserUid();
            if (userUid == null) {
                return null;
            }
            oDT odt = this.KWHzl;
            callMembersViewModel$toGroupMemberDisplayModel$1.label = 1;
            objAEQbTJ = odt.AEQbTJ(str, userUid, false, callMembersViewModel$toGroupMemberDisplayModel$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        GroupMemberInfo groupMemberInfo = (GroupMemberInfo) objAEQbTJ;
        if (groupMemberInfo == null) {
            return null;
        }
        return oDQ.EZpvd(groupMemberInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(String str, String str2, Continuation<? super C34282nYe> continuation) throws Throwable {
        CallMembersViewModel$toGroupMemberCallingDisplayModel$1 callMembersViewModel$toGroupMemberCallingDisplayModel$1;
        if (continuation instanceof CallMembersViewModel$toGroupMemberCallingDisplayModel$1) {
            callMembersViewModel$toGroupMemberCallingDisplayModel$1 = (CallMembersViewModel$toGroupMemberCallingDisplayModel$1) continuation;
            int i = callMembersViewModel$toGroupMemberCallingDisplayModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                callMembersViewModel$toGroupMemberCallingDisplayModel$1.label = i - Integer.MIN_VALUE;
            } else {
                callMembersViewModel$toGroupMemberCallingDisplayModel$1 = new CallMembersViewModel$toGroupMemberCallingDisplayModel$1(this, continuation);
            }
        }
        Object objAEQbTJ = callMembersViewModel$toGroupMemberCallingDisplayModel$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = callMembersViewModel$toGroupMemberCallingDisplayModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            if (str2 == null) {
                return null;
            }
            oDT odt = this.KWHzl;
            callMembersViewModel$toGroupMemberCallingDisplayModel$1.label = 1;
            objAEQbTJ = odt.AEQbTJ(str, str2, false, callMembersViewModel$toGroupMemberCallingDisplayModel$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        GroupMemberInfo groupMemberInfo = (GroupMemberInfo) objAEQbTJ;
        if (groupMemberInfo == null) {
            return null;
        }
        C34282nYe c34282nYeEZpvd = oDQ.EZpvd(groupMemberInfo);
        return c34282nYeEZpvd.EZpvd((61431 & 1) != 0 ? c34282nYeEZpvd.DbNXlk : null, (61431 & 2) != 0 ? c34282nYeEZpvd.gEmmrt : null, (61431 & 4) != 0 ? c34282nYeEZpvd.AEQbTJ : null, (61431 & 8) != 0 ? c34282nYeEZpvd.copydefault : null, (61431 & 16) != 0 ? c34282nYeEZpvd.fetchVPNInfo : null, (61431 & 32) != 0 ? c34282nYeEZpvd.isConnected : null, (61431 & 64) != 0 ? c34282nYeEZpvd.EZpvd : null, (61431 & 128) != 0 ? c34282nYeEZpvd.fIwbmz : null, (61431 & 256) != 0 ? c34282nYeEZpvd.KWHzl : null, (61431 & 512) != 0 ? c34282nYeEZpvd.OLrzqt : null, (61431 & 1024) != 0 ? c34282nYeEZpvd.values : null, (61431 & 2048) != 0 ? c34282nYeEZpvd.djBIcL : null, (61431 & 4096) != 0 ? c34282nYeEZpvd.AkhnZx : null, (61431 & 8192) != 0 ? c34282nYeEZpvd.AYXKKw : false, (61431 & 16384) != 0 ? c34282nYeEZpvd.valueOf : false, (61431 & 32768) != 0 ? c34282nYeEZpvd.AhwBna : true);
    }

    public final List<C34282nYe> copydefault(List<C34282nYe> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.EZpvd((Object) ((C34282nYe) obj).AhwBna(), (Object) C44157sFk.KWHzl())) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.component1();
        List list3 = (List) pair.component2();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list3) {
            if (C44170sFx.valueOf(((C34282nYe) obj2).djBIcL())) {
                arrayList3.add(obj2);
            } else {
                arrayList4.add(obj2);
            }
        }
        Pair pair2 = new Pair(arrayList3, arrayList4);
        return CollectionsKt___CollectionsKt.djBIcL((Collection) CollectionsKt___CollectionsKt.djBIcL((Collection) list2, (Iterable) CollectionsKt___CollectionsKt.EZpvd((List) pair2.component1(), new StateListAnimator())), (Iterable) CollectionsKt___CollectionsKt.EZpvd((List) pair2.component2(), new Application()));
    }
}
