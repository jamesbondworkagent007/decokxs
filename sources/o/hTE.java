package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class hTE extends android.widget.PopupWindow {
    public C21565hEb AEQbTJ;
    public java.util.List<TaskDescription> EZpvd;
    public android.content.Context KWHzl;
    public C59534zip OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hTE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hTE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TaskDescription> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.Context copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int, int):void (m)] (LINE:26) call: o.hTE.<init>(android.content.Context, android.util.AttributeSet, int, int):void type: THIS */
    public /* synthetic */ hTE(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public static final class TaskDescription {
        public final int AEQbTJ;
        public final Function0<Unit> EZpvd;
        public final java.lang.CharSequence OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hTE$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, java.lang.CharSequence charSequence, Function0 function0, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskDescription.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                charSequence = taskDescription.OLrzqt;
            }
            if ((i2 & 4) != 0) {
                function0 = taskDescription.EZpvd;
            }
            if ((i2 & 8) != 0) {
                str = taskDescription.copydefault;
            }
            return taskDescription.EZpvd(i, charSequence, function0, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@androidx.annotation.DrawableRes int i, @NotNull java.lang.CharSequence charSequence, @NotNull Function0<Unit> function0, java.lang.String str) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(function0, "");
            return new TaskDescription(i, charSequence, function0, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.AEQbTJ;
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
            return this.AEQbTJ == taskDescription.AEQbTJ && Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.AEQbTJ);
            int iHashCode2 = this.OLrzqt.hashCode();
            int iHashCode3 = this.EZpvd.hashCode();
            java.lang.String str = this.copydefault;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            int i = this.AEQbTJ;
            java.lang.CharSequence charSequence = this.OLrzqt;
            return "ShareItem(icon=" + i + ", text=" + ((java.lang.Object) charSequence) + ", clickListener=" + this.EZpvd + ", a11yId=" + this.copydefault + ")";
        }

        public TaskDescription(@androidx.annotation.DrawableRes int i, @NotNull java.lang.CharSequence charSequence, @NotNull Function0<Unit> function0, java.lang.String str) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(function0, "");
            this.AEQbTJ = i;
            this.OLrzqt = charSequence;
            this.EZpvd = function0;
            this.copydefault = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.CharSequence)
  (r3v0 kotlin.jvm.functions.Function0)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(int, java.lang.CharSequence, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.String):void (m)] (LINE:32) call: o.hTE.TaskDescription.<init>(int, java.lang.CharSequence, kotlin.jvm.functions.Function0, java.lang.String):void type: THIS */
        public /* synthetic */ TaskDescription(int i, java.lang.CharSequence charSequence, Function0 function0, java.lang.String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, charSequence, function0, (i2 & 8) != 0 ? null : str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hTE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = context;
        this.EZpvd = new java.util.ArrayList();
        C21565hEb c21565hEbCopydefault = C21565hEb.copydefault(android.view.LayoutInflater.from(this.KWHzl));
        Intrinsics.checkNotNullExpressionValue(c21565hEbCopydefault, "");
        this.AEQbTJ = c21565hEbCopydefault;
        setOutsideTouchable(true);
        setContentView(this.AEQbTJ.getRoot());
        C59534zip c59534zip = new C59534zip();
        c59534zip.setItems(c59534zip.getItems());
        c59534zip.register(TaskDescription.class, new Activity());
        this.OLrzqt = c59534zip;
        RecyclerView recyclerView = this.AEQbTJ.OLrzqt;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.OLrzqt);
        C55279xgu c55279xgu = new C55279xgu();
        c55279xgu.DbNXlk(C25382ivf.KWHzl(this.KWHzl, C52761wXj.Activity.gCNefq));
        c55279xgu.fIwbmz(C55298xhM.OLrzqt(1, this.KWHzl));
        c55279xgu.isConnected(C25382ivf.KWHzl(this.KWHzl, C52761wXj.Activity.GhqvEQ));
        c55279xgu.OLrzqt(C55298xhM.EZpvd(24.0f, this.KWHzl));
        C55280xgv c55280xgv = new C55280xgv();
        RecyclerView recyclerView2 = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        c55280xgv.KWHzl(recyclerView2, c55279xgu);
    }

    public final void copydefault(@NotNull java.util.List<TaskDescription> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
        C59534zip c59534zip = this.OLrzqt;
        if (c59534zip != null) {
            c59534zip.setItems(list);
            c59534zip.notifyDataSetChanged();
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i, int i2) {
        super.showAsDropDown(view, i + C55298xhM.OLrzqt(C55296xhK.OLrzqt(this.KWHzl) ? 12 : -12, this.KWHzl), 0);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity extends AbstractC59533zio<TaskDescription, ActionBar> {
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public ActionBar onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            hTE hte = hTE.this;
            hDZ hdzEZpvd = hDZ.EZpvd(layoutInflater, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(hdzEZpvd, "");
            return new ActionBar(hte, hdzEZpvd);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(ActionBar actionBar, TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            Intrinsics.checkNotNullParameter(taskDescription, "");
            hDZ hdzAEQbTJ = actionBar.AEQbTJ();
            hTE hte = hTE.this;
            java.lang.String strKWHzl = taskDescription.KWHzl();
            if (strKWHzl != null) {
                hdzAEQbTJ.getRoot().setContentDescription(strKWHzl);
            }
            hdzAEQbTJ.AEQbTJ.setText(taskDescription.AEQbTJ());
            android.widget.TextView textView = hdzAEQbTJ.AEQbTJ;
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(taskDescription.copydefault());
            if (drawableKWHzl != null) {
                drawableKWHzl.setBounds(0, 0, C55298xhM.OLrzqt(20, hte.copydefault()), C55298xhM.OLrzqt(20, hte.copydefault()));
            } else {
                drawableKWHzl = null;
            }
            textView.setCompoundDrawablesRelative(drawableKWHzl, null, null, null);
            android.widget.TextView textView2 = hdzAEQbTJ.AEQbTJ;
            textView2.setOnClickListener(new TaskDescription(textView2, 1000L, hte, taskDescription));
        }

        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ TaskDescription KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ hTE copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, hTE hte, TaskDescription taskDescription) {
                this.OLrzqt = view;
                this.EZpvd = j;
                this.copydefault = hte;
                this.KWHzl = taskDescription;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    this.copydefault.dismiss();
                    this.KWHzl.OLrzqt().invoke();
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final hDZ AEQbTJ;
        public final /* synthetic */ hTE KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final hDZ AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull hTE hte, hDZ hdz) {
            super(hdz.getRoot());
            Intrinsics.checkNotNullParameter(hdz, "");
            this.KWHzl = hte;
            this.AEQbTJ = hdz;
        }
    }
}
