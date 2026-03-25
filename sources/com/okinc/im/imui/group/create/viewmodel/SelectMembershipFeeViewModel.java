package com.okinc.im.imui.group.create.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.okimcore.model.remote.SupportedCurrencies;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C37721ozF;
import o.C44264sJj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56547yJk;
import o.C59443zhD;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class SelectMembershipFeeViewModel extends AbstractC33073mpa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final StateFlow<Double> AEQbTJ;
    public final MutableStateFlow<Application> AYXKKw;
    public final C44264sJj AhwBna;
    public final StateFlow<SupportedCurrencies> AkhnZx;
    public final SharedFlow<ActionBar> DbNXlk;
    public final MutableStateFlow<SupportedCurrencies> EZpvd;
    public final StateFlow<GroupBillingType> KWHzl;
    public final MutableStateFlow<List<SupportedCurrencies>> OLrzqt;
    public final SavedStateHandle djBIcL;
    public final StateFlow<Application> fetchVPNInfo;
    public final MutableSharedFlow<ActionBar> gEmmrt;
    public final StateFlow<Boolean> valueOf;
    public final Flow<Application.C0417Application> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Application> AEQbTJ() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<SupportedCurrencies> EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<ActionBar> copydefault() {
        return this.DbNXlk;
    }

    @yCM
    public SelectMembershipFeeViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C44264sJj c44264sJj) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c44264sJj, "");
        this.djBIcL = savedStateHandle;
        this.AhwBna = c44264sJj;
        StateFlow<Double> stateFlow = savedStateHandle.getStateFlow("KEY_MEMBERSHIP_FEE", null);
        this.AEQbTJ = stateFlow;
        StateFlow<GroupBillingType> stateFlow2 = savedStateHandle.getStateFlow("KEY_BILLING_CYCLE", null);
        this.KWHzl = stateFlow2;
        StateFlow<Boolean> stateFlow3 = savedStateHandle.getStateFlow("KEY_TNC_CHECKED", Boolean.FALSE);
        this.valueOf = stateFlow3;
        this.OLrzqt = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        MutableStateFlow<SupportedCurrencies> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<ActionBar> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.gEmmrt = mutableSharedFlowAEQbTJ;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
        MutableStateFlow<Application> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new Application.C0417Application(true, false));
        this.AYXKKw = MutableStateFlow2;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow2);
        this.values = FlowKt.combine(stateFlow, stateFlow2, stateFlow3, MutableStateFlow, new SelectMembershipFeeViewModel$validateFormFlow$1(this, null));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.create.viewmodel.SelectMembershipFeeViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.create.viewmodel.SelectMembershipFeeViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.create.viewmodel.SelectMembershipFeeViewModel$Application$Application, reason: collision with other inner class name */
        public static final class C0417Application extends Application {
            public final boolean AEQbTJ;
            public final boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0417Application copy$default(C0417Application c0417Application, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = c0417Application.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    z2 = c0417Application.copydefault;
                }
                return c0417Application.AEQbTJ(z, z2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0417Application AEQbTJ(boolean z, boolean z2) {
                return new C0417Application(z, z2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0417Application)) {
                    return false;
                }
                C0417Application c0417Application = (C0417Application) obj;
                return this.AEQbTJ == c0417Application.AEQbTJ && this.copydefault == c0417Application.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (Boolean.hashCode(this.AEQbTJ) * 31) + Boolean.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ValidationResult(isNumberValid=" + this.AEQbTJ + ", isFormValid=" + this.copydefault + ")";
            }

            public C0417Application(boolean z, boolean z2) {
                super(null);
                this.AEQbTJ = z;
                this.copydefault = z2;
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.create.viewmodel.SelectMembershipFeeViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Application extends ActionBar {
            public final List<SupportedCurrencies> AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.imui.group.create.viewmodel.SelectMembershipFeeViewModel$ActionBar$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Application copy$default(Application application, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = application.AEQbTJ;
                }
                return application.EZpvd(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application EZpvd(@NotNull List<SupportedCurrencies> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Application(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<SupportedCurrencies> copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.AEQbTJ, ((Application) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "BillingConfig(supportedCurrencies=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull List<SupportedCurrencies> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.AEQbTJ = list;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class TaskDescription extends ActionBar {
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = taskDescription.copydefault;
                }
                return taskDescription.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription copydefault(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new TaskDescription(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((TaskDescription) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ToastError(message=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }
    }

    public final Double OLrzqt() {
        return this.AEQbTJ.getValue();
    }

    public final GroupBillingType KWHzl() {
        return this.KWHzl.getValue();
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.group.create.viewmodel.SelectMembershipFeeViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SelectMembershipFeeViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.create.viewmodel.SelectMembershipFeeViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04161 extends SuspendLambda implements Function2<Application.C0417Application, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SelectMembershipFeeViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04161(SelectMembershipFeeViewModel selectMembershipFeeViewModel, Continuation<? super C04161> continuation) {
                super(2, continuation);
                this.this$0 = selectMembershipFeeViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04161 c04161 = new C04161(this.this$0, continuation);
                c04161.L$0 = obj;
                return c04161;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Application.C0417Application c0417Application, Continuation<? super Unit> continuation) {
                return ((C04161) create(c0417Application, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Application.C0417Application c0417Application = (Application.C0417Application) this.L$0;
                    MutableStateFlow mutableStateFlow = this.this$0.AYXKKw;
                    this.label = 1;
                    if (mutableStateFlow.emit(c0417Application, this) == objCopydefault) {
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
                Flow flow = SelectMembershipFeeViewModel.this.values;
                C04161 c04161 = new C04161(SelectMembershipFeeViewModel.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c04161, this) == objCopydefault) {
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

    public final Application.C0417Application AEQbTJ(Double d, GroupBillingType groupBillingType, boolean z, SupportedCurrencies supportedCurrencies) {
        boolean z2 = false;
        if (d == null || supportedCurrencies == null) {
            return new Application.C0417Application(true, false);
        }
        Double dAuCTel = C59443zhD.AuCTel(supportedCurrencies.getMinAmount());
        Double dAuCTel2 = C59443zhD.AuCTel(supportedCurrencies.getMaxAmount());
        if (dAuCTel == null || dAuCTel2 == null) {
            return new Application.C0417Application(false, false);
        }
        boolean zContains = C56547yJk.copydefault(dAuCTel.doubleValue(), dAuCTel2.doubleValue()).contains(d);
        if (groupBillingType == null) {
            return new Application.C0417Application(zContains, false);
        }
        if (zContains && z) {
            z2 = true;
        }
        return new Application.C0417Application(zContains, z2);
    }

    public final void OLrzqt(@NotNull GroupBillingType groupBillingType) {
        Intrinsics.checkNotNullParameter(groupBillingType, "");
        this.djBIcL.set("KEY_BILLING_CYCLE", groupBillingType);
    }

    public final void AEQbTJ(Double d) {
        this.djBIcL.set("KEY_MEMBERSHIP_FEE", d);
    }

    public final void EZpvd(@NotNull SupportedCurrencies supportedCurrencies) {
        Intrinsics.checkNotNullParameter(supportedCurrencies, "");
        this.EZpvd.setValue(supportedCurrencies);
    }

    public final void AEQbTJ(boolean z) {
        this.djBIcL.set("KEY_TNC_CHECKED", Boolean.valueOf(z));
    }

    public final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectMembershipFeeViewModel$loadBillingConfig$1(this, null), 3, null);
    }
}
