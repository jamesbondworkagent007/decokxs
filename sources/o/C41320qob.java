package o;

import android.view.View;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41320qob extends AbstractC40515qYs<TaskDescription, C42816rdZ> {
    public PeriodEnum OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum KWHzl() {
        return this.OLrzqt;
    }

    public C41320qob(@NotNull java.util.List<? extends PeriodEnum> list, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.OLrzqt = periodEnum;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (PeriodEnum periodEnum2 : list) {
            arrayList.add(new TaskDescription(periodEnum2, this.OLrzqt == periodEnum2));
        }
        submitList(arrayList);
    }

    /* JADX INFO: renamed from: o.qob$TaskDescription */
    public static final class TaskDescription implements InterfaceC40516qYt {
        public final PeriodEnum AEQbTJ;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, PeriodEnum periodEnum, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                periodEnum = taskDescription.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z = taskDescription.OLrzqt;
            }
            return taskDescription.OLrzqt(periodEnum, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PeriodEnum OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull PeriodEnum periodEnum, boolean z) {
            Intrinsics.checkNotNullParameter(periodEnum, "");
            return new TaskDescription(periodEnum, z);
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
            return this.AEQbTJ == taskDescription.AEQbTJ && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SelectablePeriodVo(vo=" + this.AEQbTJ + ", isSelected=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull PeriodEnum periodEnum, boolean z) {
            Intrinsics.checkNotNullParameter(periodEnum, "");
            this.AEQbTJ = periodEnum;
            this.OLrzqt = z;
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return (interfaceC40516qYt instanceof TaskDescription) && this.AEQbTJ == ((TaskDescription) interfaceC40516qYt).AEQbTJ;
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return Intrinsics.EZpvd(this, interfaceC40516qYt);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42816rdZ AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42816rdZ c42816rdZKWHzl = C42816rdZ.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42816rdZKWHzl, "");
        return c42816rdZKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C42816rdZ c42816rdZ, int i, @NotNull final TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(c42816rdZ, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        c42816rdZ.OLrzqt.setText(C33070mpX.AYXKKw(taskDescription.OLrzqt().getTitleResId()));
        c42816rdZ.OLrzqt.setSelected(taskDescription.KWHzl());
        c42816rdZ.OLrzqt.setEnabled(true);
        c42816rdZ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.qoc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C41320qob.EZpvd(this.EZpvd, taskDescription, view);
            }
        });
    }

    public static final void EZpvd(C41320qob c41320qob, TaskDescription taskDescription, android.view.View view) {
        c41320qob.OLrzqt = taskDescription.OLrzqt();
        java.util.List<TaskDescription> listOLrzqt = c41320qob.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (TaskDescription taskDescription2 : listOLrzqt) {
            arrayList.add(TaskDescription.copy$default(taskDescription2, null, c41320qob.OLrzqt == taskDescription2.OLrzqt(), 1, null));
        }
        c41320qob.submitList(arrayList);
    }
}
