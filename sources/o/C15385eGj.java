package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eGj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15385eGj extends AbstractC59533zio<eFO, RecyclerView.ViewHolder> {
    public final int KWHzl;
    public final Function1<eFO, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.eFO, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C15385eGj(@androidx.annotation.LayoutRes int i, @NotNull Function1<? super eFO, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = i;
        this.OLrzqt = function1;
    }

    /* JADX INFO: renamed from: o.eGj$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public Activity(android.view.View view) {
            super(view);
        }
    }

    @Override // o.AbstractC59533zio
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new Activity(layoutInflater.inflate(this.KWHzl, viewGroup, false));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull eFO efo) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(efo, "");
        ((android.widget.TextView) viewHolder.itemView.findViewById(C13754dXa.ActionBar.ViewTreeOnBackPressedDispatcherOwnerfindViewTreeOnBackPressedDispatcherOwner1)).setText(efo.AEQbTJ().getName());
        android.view.View viewFindViewById = viewHolder.itemView.findViewById(C13754dXa.ActionBar.ReportDrawnKtReportDrawnAfterfullyDrawnReporter1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        viewFindViewById.setVisibility(efo.OLrzqt() ? 0 : 8);
        android.view.View view = viewHolder.itemView;
        view.setOnClickListener(new TaskDescription(view, 1000L, this, efo));
    }

    /* JADX INFO: renamed from: o.eGj$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C15385eGj KWHzl;
        public final /* synthetic */ eFO OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C15385eGj c15385eGj, eFO efo) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c15385eGj;
            this.OLrzqt = efo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.OLrzqt.invoke(this.OLrzqt);
            }
        }
    }
}
