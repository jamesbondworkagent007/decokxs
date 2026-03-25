package com.okinc.im.imui.group.paidgroup.membershipsettings;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import com.okinc.okimcore.model.remote.SupportedCurrencies;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC44412sOw;
import o.C37721ozF;
import o.C44255sJa;
import o.C44264sJj;
import o.C56391yDq;
import o.C56442yFn;
import o.C59443zhD;
import o.oDC;
import o.pUU;
import o.sON;
import o.sOZ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MembershipSettingsViewModel extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final StateFlow<Double> AEQbTJ;
    public final C44264sJj AYXKKw;
    public final StateFlow<ActionBar> AhwBna;
    public final C44255sJa KWHzl;
    public final MutableSharedFlow<Activity> OLrzqt;
    public final MutableStateFlow<ActionBar> copydefault;
    public final SharedFlow<Activity> djBIcL;
    public final oDC gEmmrt;
    public final SavedStateHandle valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Activity> KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ActionBar> OLrzqt() {
        return this.AhwBna;
    }

    @yCM
    public MembershipSettingsViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C44264sJj c44264sJj, @NotNull C44255sJa c44255sJa, @NotNull oDC odc) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c44264sJj, "");
        Intrinsics.checkNotNullParameter(c44255sJa, "");
        Intrinsics.checkNotNullParameter(odc, "");
        this.valueOf = savedStateHandle;
        this.AYXKKw = c44264sJj;
        this.KWHzl = c44255sJa;
        this.gEmmrt = odc;
        this.AEQbTJ = savedStateHandle.getStateFlow("KEY_MEMBERSHIP_FEE", null);
        MutableStateFlow<ActionBar> MutableStateFlow = StateFlowKt.MutableStateFlow(ActionBar.Application.EZpvd);
        this.copydefault = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Activity> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.OLrzqt = mutableSharedFlowAEQbTJ;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long valueOf() {
        Long l = (Long) this.valueOf.get("GROUP_ID");
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    public final SupportedCurrencies AYXKKw() {
        return (SupportedCurrencies) this.valueOf.get("KEY_SELECTED_CURRENCY");
    }

    public final GroupEntryBillingModel AEQbTJ() {
        return (GroupEntryBillingModel) this.valueOf.get("KEY_BILLING_MODEL");
    }

    public final String EZpvd() {
        return (String) this.valueOf.get("KEY_CURRENT_SAVED_FEE");
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MembershipSettingsViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04471 extends SuspendLambda implements Function2<Double, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MembershipSettingsViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04471(MembershipSettingsViewModel membershipSettingsViewModel, Continuation<? super C04471> continuation) {
                super(2, continuation);
                this.this$0 = membershipSettingsViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04471 c04471 = new C04471(this.this$0, continuation);
                c04471.L$0 = obj;
                return c04471;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Double d, Continuation<? super Unit> continuation) {
                return ((C04471) create(d, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    ActionBar.C0448ActionBar c0448ActionBarAEQbTJ = this.this$0.AEQbTJ((Double) this.L$0);
                    MutableStateFlow mutableStateFlow = this.this$0.copydefault;
                    this.label = 1;
                    if (mutableStateFlow.emit(c0448ActionBarAEQbTJ, this) == objCopydefault) {
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
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow stateFlow = MembershipSettingsViewModel.this.AEQbTJ;
                C04471 c04471 = new C04471(MembershipSettingsViewModel.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c04471, this) == objCopydefault) {
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

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MembershipSettingsViewModel$saveMembershipSettings$1(this, str, null), 3, null);
    }

    public final void copydefault() {
        pUU.EZpvd("MembershipSettingsViewModel", "Fetch info");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MembershipSettingsViewModel$fetchInfo$1(this, null), 3, null);
    }

    public final void copydefault(Double d) {
        this.valueOf.set("KEY_MEMBERSHIP_FEE", d);
    }

    public final ActionBar.C0448ActionBar AEQbTJ(Double d) {
        Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            String strEZpvd = EZpvd();
            Double dAuCTel = strEZpvd != null ? C59443zhD.AuCTel(strEZpvd) : null;
            if (dAuCTel == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (dDoubleValue == dAuCTel.doubleValue()) {
                return new ActionBar.C0448ActionBar(true, false);
            }
            SupportedCurrencies supportedCurrenciesAYXKKw = AYXKKw();
            if (supportedCurrenciesAYXKKw != null) {
                boolean z = Double.parseDouble(supportedCurrenciesAYXKKw.getMinAmount()) <= dDoubleValue && dDoubleValue <= Double.parseDouble(supportedCurrenciesAYXKKw.getMaxAmount());
                objM7377constructorimpl = Result.m7377constructorimpl(new ActionBar.C0448ActionBar(z, z));
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    objM7377constructorimpl = new ActionBar.C0448ActionBar(!(r2 instanceof IllegalArgumentException), false);
                }
                return (ActionBar.C0448ActionBar) objM7377constructorimpl;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(AbstractC44412sOw abstractC44412sOw, sOZ soz, Continuation<? super Unit> continuation) throws Throwable {
        MembershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1 membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1;
        MembershipSettingsViewModel membershipSettingsViewModel;
        MutableStateFlow<ActionBar> mutableStateFlow;
        ActionBar.StateListAnimator stateListAnimator;
        if (continuation instanceof MembershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1) {
            membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1 = (MembershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1) continuation;
            int i = membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1.label = i - Integer.MIN_VALUE;
            } else {
                membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1 = new MembershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1(this, continuation);
            }
        }
        Object obj = membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (soz instanceof sOZ.Activity) {
                if (abstractC44412sOw instanceof AbstractC44412sOw.Activity) {
                    this.valueOf.set("KEY_BILLING_MODEL", ((AbstractC44412sOw.Activity) abstractC44412sOw).KWHzl().getBillingModel());
                    GroupEntryBillingModel groupEntryBillingModelAEQbTJ = AEQbTJ();
                    this.valueOf.set("KEY_SELECTED_CURRENCY", CollectionsKt___CollectionsKt.AuCTelauCTel(((sOZ.Activity) soz).EZpvd().getSupportedCurrencies()));
                    this.valueOf.set("KEY_CURRENT_SAVED_FEE", groupEntryBillingModelAEQbTJ != null ? groupEntryBillingModelAEQbTJ.getAmount() : null);
                    SupportedCurrencies supportedCurrenciesAYXKKw = AYXKKw();
                    if (supportedCurrenciesAYXKKw != null) {
                        MutableSharedFlow<Activity> mutableSharedFlow = this.OLrzqt;
                        Activity.TaskDescription taskDescription = new Activity.TaskDescription(groupEntryBillingModelAEQbTJ, supportedCurrenciesAYXKKw);
                        membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1.L$0 = this;
                        membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1.label = 2;
                        if (mutableSharedFlow.emit(taskDescription, membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    membershipSettingsViewModel = this;
                    mutableStateFlow = membershipSettingsViewModel.copydefault;
                    stateListAnimator = ActionBar.StateListAnimator.EZpvd;
                    membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1.L$0 = null;
                    membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1.label = 3;
                    if (mutableStateFlow.emit(stateListAnimator, membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1) == objCopydefault) {
                    }
                } else {
                    if (!(abstractC44412sOw instanceof AbstractC44412sOw.TaskDescription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MutableStateFlow<ActionBar> mutableStateFlow2 = this.copydefault;
                    ActionBar.Activity activity = ActionBar.Activity.AEQbTJ;
                    membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1.label = 1;
                    if (mutableStateFlow2.emit(activity, membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (!(soz instanceof sOZ.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                MutableStateFlow<ActionBar> mutableStateFlow3 = this.copydefault;
                ActionBar.Activity activity2 = ActionBar.Activity.AEQbTJ;
                membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1.label = 4;
                if (mutableStateFlow3.emit(activity2, membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i2 == 2) {
                membershipSettingsViewModel = (MembershipSettingsViewModel) membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableStateFlow = membershipSettingsViewModel.copydefault;
                stateListAnimator = ActionBar.StateListAnimator.EZpvd;
                membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1.L$0 = null;
                membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1.label = 3;
                if (mutableStateFlow.emit(stateListAnimator, membershipSettingsViewModel$handleFetchMembershipFeeInfoResult$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
        }
        return Unit.INSTANCE;
    }

    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Application extends ActionBar {
            public static final Application EZpvd = new Application();

            private Application() {
                super(null);
            }
        }

        private ActionBar() {
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class StateListAnimator extends ActionBar {
            public static final StateListAnimator EZpvd = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsViewModel$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0448ActionBar extends ActionBar {
            public final boolean AEQbTJ;
            public final boolean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0448ActionBar copy$default(C0448ActionBar c0448ActionBar, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = c0448ActionBar.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    z2 = c0448ActionBar.OLrzqt;
                }
                return c0448ActionBar.EZpvd(z, z2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0448ActionBar EZpvd(boolean z, boolean z2) {
                return new C0448ActionBar(z, z2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0448ActionBar)) {
                    return false;
                }
                C0448ActionBar c0448ActionBar = (C0448ActionBar) obj;
                return this.AEQbTJ == c0448ActionBar.AEQbTJ && this.OLrzqt == c0448ActionBar.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (Boolean.hashCode(this.AEQbTJ) * 31) + Boolean.hashCode(this.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ValidationResult(isNumberValid=" + this.AEQbTJ + ", isFormValid=" + this.OLrzqt + ")";
            }

            public C0448ActionBar(boolean z, boolean z2) {
                super(null);
                this.AEQbTJ = z;
                this.OLrzqt = z2;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Activity extends ActionBar {
            public static final Activity AEQbTJ = new Activity();

            private Activity() {
                super(null);
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static final class TaskDescription extends Activity {
            public static final int EZpvd = SupportedCurrencies.$stable | GroupEntryBillingModel.$stable;
            public final GroupEntryBillingModel KWHzl;
            public final SupportedCurrencies OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, GroupEntryBillingModel groupEntryBillingModel, SupportedCurrencies supportedCurrencies, int i, Object obj) {
                if ((i & 1) != 0) {
                    groupEntryBillingModel = taskDescription.KWHzl;
                }
                if ((i & 2) != 0) {
                    supportedCurrencies = taskDescription.OLrzqt;
                }
                return taskDescription.OLrzqt(groupEntryBillingModel, supportedCurrencies);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GroupEntryBillingModel EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SupportedCurrencies KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription OLrzqt(GroupEntryBillingModel groupEntryBillingModel, @NotNull SupportedCurrencies supportedCurrencies) {
                Intrinsics.checkNotNullParameter(supportedCurrencies, "");
                return new TaskDescription(groupEntryBillingModel, supportedCurrencies);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                GroupEntryBillingModel groupEntryBillingModel = this.KWHzl;
                return ((groupEntryBillingModel == null ? 0 : groupEntryBillingModel.hashCode()) * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FetchedMembershipFeeInfo(membershipBillingModel=" + this.KWHzl + ", supportedCurrencies=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(GroupEntryBillingModel groupEntryBillingModel, @NotNull SupportedCurrencies supportedCurrencies) {
                super(null);
                Intrinsics.checkNotNullParameter(supportedCurrencies, "");
                this.KWHzl = groupEntryBillingModel;
                this.OLrzqt = supportedCurrencies;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class StateListAnimator extends Activity {
            public static final int AEQbTJ = sON.copydefault;
            public final sON copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, sON son, int i, Object obj) {
                if ((i & 1) != 0) {
                    son = stateListAnimator.copydefault;
                }
                return stateListAnimator.AEQbTJ(son);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator AEQbTJ(@NotNull sON son) {
                Intrinsics.checkNotNullParameter(son, "");
                return new StateListAnimator(son);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final sON copydefault() {
                return this.copydefault;
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
                return "SaveSettingsResult(apiResult=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull sON son) {
                super(null);
                Intrinsics.checkNotNullParameter(son, "");
                this.copydefault = son;
            }
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
