package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.teE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46808teE extends AbstractC59533zio<C46904tfv, TaskDescription> {
    public final Function1<java.lang.Integer, Unit> EZpvd;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.Integer, Unit> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.teE$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C46808teE AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C46904tfv OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C46808teE c46808teE, C46904tfv c46904tfv) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c46808teE;
            this.OLrzqt = c46904tfv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function1<java.lang.Integer, Unit> function1AEQbTJ = this.AEQbTJ.AEQbTJ();
                if (function1AEQbTJ != null) {
                    function1AEQbTJ.invoke(java.lang.Integer.valueOf(this.OLrzqt.AEQbTJ()));
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C46808teE(int i, Function1<? super java.lang.Integer, Unit> function1) {
        this.OLrzqt = i;
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42941rfs c42941rfsKWHzl = C42941rfs.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42941rfsKWHzl, "");
        return new TaskDescription(c42941rfsKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull C46904tfv c46904tfv) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(c46904tfv, "");
        taskDescription.copydefault().AEQbTJ.setText(c46904tfv.EZpvd());
        taskDescription.copydefault().EZpvd.setImageResource(this.OLrzqt == c46904tfv.AEQbTJ() ? C52761wXj.TaskDescription.gqESXP : 0);
        android.widget.LinearLayout root = taskDescription.copydefault().getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this, c46904tfv));
    }

    /* JADX INFO: renamed from: o.teE$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final C42941rfs copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C42941rfs copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C42941rfs c42941rfs) {
            super(c42941rfs.getRoot());
            Intrinsics.checkNotNullParameter(c42941rfs, "");
            this.copydefault = c42941rfs;
        }
    }
}
