package com.okinc.business.invest_biz.ui.page.order.details;

import android.content.Context;
import androidx.annotation.StringRes;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.iVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestOrderDetailsState {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final TaskDescription EZpvd;
    public final ActionBar KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestOrderDetailsState() {
        this(false, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestOrderDetailsState copy$default(InvestOrderDetailsState investOrderDetailsState, boolean z, TaskDescription taskDescription, ActionBar actionBar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = investOrderDetailsState.OLrzqt;
        }
        if ((i & 2) != 0) {
            taskDescription = investOrderDetailsState.EZpvd;
        }
        if ((i & 4) != 0) {
            actionBar = investOrderDetailsState.KWHzl;
        }
        return investOrderDetailsState.copydefault(z, taskDescription, actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaskDescription AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestOrderDetailsState copydefault(boolean z, TaskDescription taskDescription, ActionBar actionBar) {
        return new InvestOrderDetailsState(z, taskDescription, actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestOrderDetailsState)) {
            return false;
        }
        InvestOrderDetailsState investOrderDetailsState = (InvestOrderDetailsState) obj;
        return this.OLrzqt == investOrderDetailsState.OLrzqt && Intrinsics.EZpvd(this.EZpvd, investOrderDetailsState.EZpvd) && Intrinsics.EZpvd(this.KWHzl, investOrderDetailsState.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.OLrzqt);
        TaskDescription taskDescription = this.EZpvd;
        int iHashCode2 = taskDescription == null ? 0 : taskDescription.hashCode();
        ActionBar actionBar = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (actionBar != null ? actionBar.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestOrderDetailsState(isLoading=" + this.OLrzqt + ", data=" + this.EZpvd + ", errorMessage=" + this.KWHzl + ")";
    }

    public InvestOrderDetailsState(boolean z, TaskDescription taskDescription, ActionBar actionBar) {
        this.OLrzqt = z;
        this.EZpvd = taskDescription;
        this.KWHzl = actionBar;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState$TaskDescription:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState$TaskDescription) : (r3v0 com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState$TaskDescription))
  (wrap:com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState$ActionBar:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState$ActionBar) : (r4v0 com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState$ActionBar))
 A[MD:(boolean, com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState$TaskDescription, com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState$ActionBar):void (m)] (LINE:6) call: com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState.<init>(boolean, com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState$TaskDescription, com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState$ActionBar):void type: THIS */
    public /* synthetic */ InvestOrderDetailsState(boolean z, TaskDescription taskDescription, ActionBar actionBar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : taskDescription, (i & 4) != 0 ? null : actionBar);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final InvestOrderDetailsState EZpvd(@NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            return new InvestOrderDetailsState(false, taskDescription, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status PENDING = new Status(CardSyncResponse.PENDING, 0);
        public static final Status COMPLETED = new Status("COMPLETED", 1);
        public static final Status FAILED = new Status(CardSyncResponse.FAILED, 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Status[] $values() {
            return new Status[]{PENDING, COMPLETED, FAILED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Status> getEntries() {
            return $ENTRIES;
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(statusArr$values);
        }

        private Status(String str, int i) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public static final class TaskDescription {
        public final Status AEQbTJ;
        public final List<iVX> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, List list, Status status, int i, Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                status = taskDescription.AEQbTJ;
            }
            return taskDescription.copydefault(list, status);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<iVX> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Status EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull List<? extends iVX> list, @NotNull Status status) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(status, "");
            return new TaskDescription(list, status);
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
            return Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && this.AEQbTJ == taskDescription.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Data(items=" + this.KWHzl + ", status=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.iVX> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull List<? extends iVX> list, @NotNull Status status) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(status, "");
            this.KWHzl = list;
            this.AEQbTJ = status;
        }
    }

    public interface ActionBar {
        String KWHzl(@NotNull Context context);

        public static final class StateListAnimator implements ActionBar {
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.copydefault;
                }
                return stateListAnimator.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator AEQbTJ(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState.ActionBar
            public String KWHzl(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "");
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((StateListAnimator) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Text(value=" + this.copydefault + ")";
            }

            public StateListAnimator(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0334ActionBar implements ActionBar {
            public final int KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0334ActionBar copy$default(C0334ActionBar c0334ActionBar, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = c0334ActionBar.KWHzl;
                }
                return c0334ActionBar.EZpvd(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0334ActionBar EZpvd(@StringRes int i) {
                return new C0334ActionBar(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0334ActionBar) && this.KWHzl == ((C0334ActionBar) obj).KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Integer.hashCode(this.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Resource(id=" + this.KWHzl + ")";
            }

            public C0334ActionBar(@StringRes int i) {
                this.KWHzl = i;
            }

            @Override // com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState.ActionBar
            public String KWHzl(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "");
                String string = context.getString(this.KWHzl);
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
        }
    }
}
