package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_social_feeds.FollowerDataViewModel$internalRefresh$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC46197tLk;

/* JADX INFO: renamed from: o.tJa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46133tJa extends AbstractC33073mpa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final StateFlow<java.lang.Boolean> AEQbTJ;
    public final MutableStateFlow<AbstractC46197tLk<Activity>> KWHzl;
    public final MutableStateFlow<java.lang.Boolean> OLrzqt;
    public final C46147tJo copydefault;
    public final StateFlow<AbstractC46197tLk<Activity>> gEmmrt;
    public final C46388tSm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC46197tLk<Activity>> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> KWHzl() {
        return this.AEQbTJ;
    }

    public C46133tJa() {
        tPF tpf = tPF.copydefault;
        this.valueOf = tpf.alsFma();
        this.copydefault = tpf.ixgjPv();
        MutableStateFlow<AbstractC46197tLk<Activity>> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC46197tLk.Companion.OLrzqt(true));
        this.KWHzl = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(java.lang.Boolean.TRUE);
        this.OLrzqt = MutableStateFlow2;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow2);
        internalRefresh$default(this, false, 1, null);
    }

    /* JADX INFO: renamed from: o.tJa$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tJa.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void AEQbTJ() {
        internalRefresh$default(this, false, 1, null);
    }

    public final void copydefault() {
        OLrzqt(false);
    }

    public static /* synthetic */ void internalRefresh$default(C46133tJa c46133tJa, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c46133tJa.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        Activity activityOLrzqt = this.KWHzl.getValue().OLrzqt();
        OLrzqt();
        if (!this.valueOf.gEmmrt()) {
            KWHzl(new java.lang.Throwable("ERR_NOT_LOGIN"));
        } else {
            C46374tRz.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new FollowerDataViewModel$internalRefresh$1(this, z, activityOLrzqt, null), 3, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tJa */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setSuccessViewState$default(C46133tJa c46133tJa, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = yDY.AhwBna();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        c46133tJa.OLrzqt(list, z);
    }

    public final void OLrzqt(java.util.List<C46139tJg> list, boolean z) {
        this.KWHzl.setValue(AbstractC46197tLk.Companion.KWHzl(new Activity(z, list)));
    }

    public final void OLrzqt() {
        this.KWHzl.setValue(AbstractC46197tLk.TaskDescription.loading$default(AbstractC46197tLk.Companion, false, 1, null));
    }

    public static /* synthetic */ void setErrorViewState$default(C46133tJa c46133tJa, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = new java.lang.Throwable();
        }
        c46133tJa.KWHzl(th);
    }

    public final void KWHzl(java.lang.Throwable th) {
        this.KWHzl.setValue(AbstractC46197tLk.Companion.OLrzqt(th));
    }

    public final void EZpvd(boolean z) {
        this.OLrzqt.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: o.tJa$Activity */
    public static final class Activity {
        public final boolean AEQbTJ;
        public final java.util.List<C46139tJg> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tJa$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, boolean z, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                list = activity.OLrzqt;
            }
            return activity.KWHzl(z, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(boolean z, java.util.List<C46139tJg> list) {
            return new Activity(z, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C46139tJg> OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.AEQbTJ == activity.AEQbTJ && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
            java.util.List<C46139tJg> list = this.OLrzqt;
            return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "State(isLoadMore=" + this.AEQbTJ + ", list=" + this.OLrzqt + ")";
        }

        public Activity(boolean z, java.util.List<C46139tJg> list) {
            this.AEQbTJ = z;
            this.OLrzqt = list;
        }
    }
}
