package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qdi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40744qdi extends AbstractC40515qYs<TaskDescription, C42816rdZ> {
    public boolean KWHzl;
    public FuturesUnitVo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesUnitVo copydefault() {
        return this.copydefault;
    }

    public C40744qdi(@NotNull java.util.List<FuturesUnitVo> list, @NotNull FuturesUnitVo futuresUnitVo) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(futuresUnitVo, "");
        this.copydefault = futuresUnitVo;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (FuturesUnitVo futuresUnitVo2 : list) {
            arrayList.add(new TaskDescription(futuresUnitVo2, Intrinsics.EZpvd(this.copydefault, futuresUnitVo2)));
        }
        submitList(arrayList);
        this.KWHzl = true;
    }

    /* JADX INFO: renamed from: o.qdi$TaskDescription */
    public static final class TaskDescription implements InterfaceC40516qYt {
        public static final int EZpvd = FuturesUnitVo.KWHzl;
        public final boolean AEQbTJ;
        public final FuturesUnitVo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, FuturesUnitVo futuresUnitVo, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                futuresUnitVo = taskDescription.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = taskDescription.AEQbTJ;
            }
            return taskDescription.OLrzqt(futuresUnitVo, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FuturesUnitVo AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull FuturesUnitVo futuresUnitVo, boolean z) {
            Intrinsics.checkNotNullParameter(futuresUnitVo, "");
            return new TaskDescription(futuresUnitVo, z);
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
            return Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && this.AEQbTJ == taskDescription.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SelectableUnitVo(vo=" + this.OLrzqt + ", isSelected=" + this.AEQbTJ + ")";
        }

        public TaskDescription(@NotNull FuturesUnitVo futuresUnitVo, boolean z) {
            Intrinsics.checkNotNullParameter(futuresUnitVo, "");
            this.OLrzqt = futuresUnitVo;
            this.AEQbTJ = z;
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return (interfaceC40516qYt instanceof TaskDescription) && Intrinsics.EZpvd(this.OLrzqt, ((TaskDescription) interfaceC40516qYt).OLrzqt);
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return Intrinsics.EZpvd(this, interfaceC40516qYt);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42816rdZ AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42816rdZ c42816rdZKWHzl = C42816rdZ.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42816rdZKWHzl, "");
        return c42816rdZKWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [48=4] */
    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(@NotNull C42816rdZ c42816rdZ, int i, @NotNull final TaskDescription taskDescription) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(c42816rdZ, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        AppCompatTextView appCompatTextView = c42816rdZ.OLrzqt;
        java.lang.String strEZpvd = taskDescription.AEQbTJ().EZpvd();
        if (strEZpvd == null) {
            strKWHzl = taskDescription.AEQbTJ().KWHzl();
        } else {
            int iHashCode = strEZpvd.hashCode();
            if (iHashCode != 84326) {
                if (iHashCode != 2614173) {
                    if (iHashCode == 2614190 && strEZpvd.equals("USDT")) {
                        strKWHzl = C33070mpX.AYXKKw(qZH.PendingIntent.GiPPlLQAswws);
                    }
                } else if (strEZpvd.equals("USDC")) {
                    strKWHzl = C33070mpX.AYXKKw(qZH.PendingIntent.setLocationManually);
                }
            } else if (strEZpvd.equals("USD")) {
                strKWHzl = C33070mpX.AYXKKw(qZH.PendingIntent.sElUiK);
            }
        }
        appCompatTextView.setText(strKWHzl);
        c42816rdZ.OLrzqt.setSelected(taskDescription.KWHzl());
        c42816rdZ.OLrzqt.setEnabled(this.KWHzl);
        if (this.KWHzl) {
            c42816rdZ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.qdk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C40744qdi.EZpvd(this.AEQbTJ, taskDescription, view);
                }
            });
        }
    }

    public static final void EZpvd(C40744qdi c40744qdi, TaskDescription taskDescription, android.view.View view) {
        c40744qdi.copydefault = taskDescription.AEQbTJ();
        java.util.List<TaskDescription> listOLrzqt = c40744qdi.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (TaskDescription taskDescription2 : listOLrzqt) {
            arrayList.add(TaskDescription.copy$default(taskDescription2, null, Intrinsics.EZpvd(c40744qdi.copydefault, taskDescription2.AEQbTJ()), 1, null));
        }
        c40744qdi.submitList(arrayList);
    }

    public final void AEQbTJ(boolean z) {
        this.KWHzl = z;
        notifyDataSetChanged();
    }
}
