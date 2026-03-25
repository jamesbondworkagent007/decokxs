package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qem, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40801qem extends AbstractC40515qYs<TaskDescription, C42807rdQ> {
    public java.lang.String KWHzl;
    public final Function1<java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C40801qem(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = str;
        this.copydefault = function1;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (java.lang.String str2 : list) {
            arrayList.add(new TaskDescription(str2, Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) str2)));
        }
        submitList(arrayList);
    }

    /* JADX INFO: renamed from: o.qem$TaskDescription */
    public static final class TaskDescription implements InterfaceC40516qYt {
        public final boolean OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.copydefault;
            }
            if ((i & 2) != 0) {
                z = taskDescription.OLrzqt;
            }
            return taskDescription.EZpvd(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
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
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault) && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SelectablePeriodVo(vo=" + this.copydefault + ", isSelected=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            this.OLrzqt = z;
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return (interfaceC40516qYt instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((TaskDescription) interfaceC40516qYt).copydefault);
        }

        @Override // o.InterfaceC40516qYt
        public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return Intrinsics.EZpvd(this, interfaceC40516qYt);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42807rdQ AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42807rdQ c42807rdQAEQbTJ = C42807rdQ.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42807rdQAEQbTJ, "");
        return c42807rdQAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C42807rdQ c42807rdQ, int i, @NotNull final TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(c42807rdQ, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        c42807rdQ.KWHzl.setText(taskDescription.copydefault());
        android.widget.ImageView imageView = c42807rdQ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(taskDescription.AEQbTJ() ? 0 : 8);
        c42807rdQ.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.qep
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C40801qem.EZpvd(this.KWHzl, taskDescription, view);
            }
        });
    }

    public static final void EZpvd(C40801qem c40801qem, TaskDescription taskDescription, android.view.View view) {
        java.lang.String strCopydefault = taskDescription.copydefault();
        c40801qem.KWHzl = strCopydefault;
        c40801qem.copydefault.invoke(strCopydefault);
    }
}
