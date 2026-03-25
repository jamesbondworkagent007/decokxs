package com.okinc.im.imui.group.paidgroup.transactionsummary;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C37721ozF;
import o.C44266sJl;
import o.nZM;
import o.sIR;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class PaidGroupTransactionListViewModel extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final MutableSharedFlow<StateListAnimator> AEQbTJ;
    public final sIR AYXKKw;
    public final SharedFlow<Boolean> AhwBna;
    public final StateFlow<Application> AkhnZx;
    public final MutableStateFlow<Application> EZpvd;
    public final MutableSharedFlow<Boolean> OLrzqt;
    public final MutableStateFlow<Boolean> copydefault;
    public final MutableStateFlow<Boolean> djBIcL;
    public final C44266sJl gEmmrt;
    public final SharedFlow<StateListAnimator> isConnected;
    public final List<nZM> valueOf;
    public final SavedStateHandle values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Application> AEQbTJ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<StateListAnimator> EZpvd() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<Boolean> copydefault() {
        return this.djBIcL;
    }

    @yCM
    public PaidGroupTransactionListViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C44266sJl c44266sJl, @NotNull sIR sir) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c44266sJl, "");
        Intrinsics.checkNotNullParameter(sir, "");
        this.values = savedStateHandle;
        this.gEmmrt = c44266sJl;
        this.AYXKKw = sir;
        MutableStateFlow<Application> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<StateListAnimator> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.AEQbTJ = mutableSharedFlowAEQbTJ;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
        this.valueOf = new ArrayList();
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.copydefault = MutableStateFlow2;
        this.djBIcL = MutableStateFlow2;
        MutableSharedFlow<Boolean> mutableSharedFlowAEQbTJ2 = C37721ozF.AEQbTJ();
        this.OLrzqt = mutableSharedFlowAEQbTJ2;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long AhwBna() {
        Long l = (Long) this.values.get("GROUP_ID");
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PaidGroupTransactionListViewModel$init$1(this, null), 3, null);
    }

    public static /* synthetic */ void fetchTransactionList$default(PaidGroupTransactionListViewModel paidGroupTransactionListViewModel, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        paidGroupTransactionListViewModel.AEQbTJ(str, num);
    }

    public final void AEQbTJ(String str, Integer num) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new PaidGroupTransactionListViewModel$fetchTransactionList$1(this, str, num, null), 2, null);
    }

    public final void AYXKKw() {
        if (this.copydefault.getValue().booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PaidGroupTransactionListViewModel$loadMoreHistory$1(this, null), 3, null);
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class TaskDescription extends Application {
            public static final TaskDescription copydefault = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        private Application() {
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListViewModel$Application$Application, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class C0449Application extends Application {
            public static final C0449Application AEQbTJ = new C0449Application();

            private C0449Application() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class ActionBar extends Application {
            public static final ActionBar KWHzl = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class StateListAnimator extends Application {
            public static final StateListAnimator KWHzl = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class TaskDescription extends StateListAnimator {
            public final List<nZM> KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListViewModel$StateListAnimator$TaskDescription */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = taskDescription.KWHzl;
                }
                return taskDescription.KWHzl(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(@NotNull List<nZM> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new TaskDescription(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<nZM> OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.KWHzl, ((TaskDescription) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FetchedTransactionList(result=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull List<nZM> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.KWHzl = list;
            }
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
