package com.okinc.im.imui.group.paidgroup.dashboard;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.model.remote.PaidGroupTransactionsSummaryResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C44268sJn;
import o.C56442yFn;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class PaidDashboardViewModel extends AbstractC33073mpa {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final C44268sJn AEQbTJ;
    public final StateFlow<Activity> KWHzl;
    public final SavedStateHandle OLrzqt;
    public final MutableStateFlow<Activity> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Activity> copydefault() {
        return this.KWHzl;
    }

    @yCM
    public PaidDashboardViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C44268sJn c44268sJn) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c44268sJn, "");
        this.OLrzqt = savedStateHandle;
        this.AEQbTJ = c44268sJn;
        MutableStateFlow<Activity> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final long EZpvd() {
        Long l = (Long) this.OLrzqt.get("GROUP_ID");
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PaidDashboardViewModel$init$1(this, null), 3, null);
    }

    public final Object OLrzqt(@NotNull Continuation<? super Unit> continuation) {
        pUU.EZpvd("PaidDashboardViewModel", "Fetch info");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PaidDashboardViewModel$fetchInfo$2(this, null), 3, null);
        return Unit.INSTANCE;
    }

    public final Object AEQbTJ(Activity activity, Continuation<? super Unit> continuation) {
        Object objEmit = this.copydefault.emit(activity, continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.paidgroup.dashboard.PaidDashboardViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Application extends Activity {
            public static final Application OLrzqt = new Application();

            private Application() {
                super(null);
            }
        }

        private Activity() {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class TaskDescription extends Activity {
            public static final int EZpvd = PaidGroupTransactionsSummaryResponse.$stable;
            public final PaidGroupTransactionsSummaryResponse copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, PaidGroupTransactionsSummaryResponse paidGroupTransactionsSummaryResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    paidGroupTransactionsSummaryResponse = taskDescription.copydefault;
                }
                return taskDescription.KWHzl(paidGroupTransactionsSummaryResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PaidGroupTransactionsSummaryResponse AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(@NotNull PaidGroupTransactionsSummaryResponse paidGroupTransactionsSummaryResponse) {
                Intrinsics.checkNotNullParameter(paidGroupTransactionsSummaryResponse, "");
                return new TaskDescription(paidGroupTransactionsSummaryResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.copydefault, ((TaskDescription) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Success(summary=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull PaidGroupTransactionsSummaryResponse paidGroupTransactionsSummaryResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(paidGroupTransactionsSummaryResponse, "");
                this.copydefault = paidGroupTransactionsSummaryResponse;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class StateListAnimator extends Activity {
            public static final StateListAnimator EZpvd = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.paidgroup.dashboard.PaidDashboardViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
