package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_content.draft.DraftDataInfo;
import com.okinc.planet.biz_content.draft.PublisherDraftViewModel$loadMoreDrafts$1;
import com.okinc.planet.biz_content.draft.PublisherDraftViewModel$refreshDraftList$1;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.trW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47512trW extends ViewModel {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public java.lang.String EZpvd;
    public boolean OLrzqt;
    public final C46359tRk copydefault = tPF.copydefault.KDccX();
    public final MutableLiveData<TaskDescription> AEQbTJ = new MutableLiveData<>();
    public final MutableLiveData<java.lang.String> gEmmrt = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<TaskDescription> copydefault() {
        return this.AEQbTJ;
    }

    public C47512trW() {
        OLrzqt(true);
    }

    /* JADX INFO: renamed from: o.trW$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.trW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.trW$TaskDescription */
    public static final class TaskDescription {
        public final StatefulView.Status AEQbTJ;
        public final boolean EZpvd;
        public final int KWHzl;
        public final java.util.List<DraftDataInfo> OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, null, false, null, 0, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.trW$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, StatefulView.Status status, java.util.List list, boolean z, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                status = taskDescription.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                list = taskDescription.OLrzqt;
            }
            java.util.List list2 = list;
            if ((i2 & 4) != 0) {
                z = taskDescription.EZpvd;
            }
            boolean z2 = z;
            if ((i2 & 8) != 0) {
                str = taskDescription.copydefault;
            }
            java.lang.String str2 = str;
            if ((i2 & 16) != 0) {
                i = taskDescription.KWHzl;
            }
            return taskDescription.copydefault(status, list2, z2, str2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatefulView.Status AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<DraftDataInfo> copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull StatefulView.Status status, @NotNull java.util.List<DraftDataInfo> list, boolean z, java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(status, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(status, list, z, str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.AEQbTJ == taskDescription.AEQbTJ && Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && this.EZpvd == taskDescription.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault) && this.KWHzl == taskDescription.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            int iHashCode3 = java.lang.Boolean.hashCode(this.EZpvd);
            java.lang.String str = this.copydefault;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DraftListUiState(status=" + this.AEQbTJ + ", drafts=" + this.OLrzqt + ", isRefresh=" + this.EZpvd + ", nextCursor=" + this.copydefault + ", errorCode=" + this.KWHzl + ")";
        }

        public TaskDescription(@NotNull StatefulView.Status status, @NotNull java.util.List<DraftDataInfo> list, boolean z, java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(status, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = status;
            this.OLrzqt = list;
            this.EZpvd = z;
            this.copydefault = str;
            this.KWHzl = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:com.okinc.uilab.stateful.StatefulView$Status:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.uilab.stateful.StatefulView$Status:0x0004: SGET  A[WRAPPED] (LINE:36) com.okinc.uilab.stateful.StatefulView.Status.Loading com.okinc.uilab.stateful.StatefulView$Status) : (r4v0 com.okinc.uilab.stateful.StatefulView$Status))
  (wrap:java.util.List:0x000e: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:37)) : (r5v0 java.util.List))
  (wrap:boolean:0x0014: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r6v0 boolean))
  (wrap:java.lang.String:0x001a: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
 A[MD:(com.okinc.uilab.stateful.StatefulView$Status, java.util.List<com.okinc.planet.biz_content.draft.DraftDataInfo>, boolean, java.lang.String, int):void (m)] (LINE:35) call: o.trW.TaskDescription.<init>(com.okinc.uilab.stateful.StatefulView$Status, java.util.List, boolean, java.lang.String, int):void type: THIS */
        public /* synthetic */ TaskDescription(StatefulView.Status status, java.util.List list, boolean z, java.lang.String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? StatefulView.Status.Loading : status, (i2 & 2) != 0 ? yDY.AhwBna() : list, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? 0 : i);
        }

        public final boolean EZpvd() {
            java.lang.String str = this.copydefault;
            return !(str == null || str.length() == 0);
        }
    }

    public final void OLrzqt(boolean z) {
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        this.EZpvd = null;
        if (z) {
            this.AEQbTJ.setValue(new TaskDescription(StatefulView.Status.Loading, yDY.AhwBna(), true, null, 0, 16, null));
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PublisherDraftViewModel$refreshDraftList$1(this, null), 3, null);
    }

    public final boolean EZpvd() {
        TaskDescription value = this.AEQbTJ.getValue();
        if (value == null || value.AEQbTJ() != StatefulView.Status.Content) {
            return false;
        }
        java.lang.String str = this.EZpvd;
        if (str == null || str.length() == 0) {
            pUU.EZpvd("PublisherDraftViewModel", "No more data to load - nextCursor is empty");
            return false;
        }
        if (this.OLrzqt) {
            return true;
        }
        this.OLrzqt = true;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PublisherDraftViewModel$loadMoreDrafts$1(this, str, value, null), 3, null);
        return true;
    }
}
