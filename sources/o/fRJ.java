package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fRJ implements fDP {
    public final Function1<AbstractC12784ctX, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctX, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public fRJ(@NotNull Function1<? super AbstractC12784ctX, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    public static final class ActionBar extends RecyclerView.ViewHolder {
        public ActionBar(android.view.View view) {
            super(view);
        }
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new ActionBar(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.GQzpsZsQwTVT, viewGroup, false));
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        android.view.View view = viewHolder.itemView;
        view.setOnClickListener(new TaskDescription(view, 1000L, obj, this));
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ java.lang.Object KWHzl;
        public final /* synthetic */ fRJ OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, java.lang.Object obj, fRJ frj) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = obj;
            this.OLrzqt = frj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            AbstractC12784ctX abstractC12784ctXCopydefault;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                java.lang.Object obj = this.KWHzl;
                C17737fQk c17737fQk = obj instanceof C17737fQk ? (C17737fQk) obj : null;
                if (c17737fQk == null || (abstractC12784ctXCopydefault = c17737fQk.copydefault()) == null) {
                    return;
                }
                this.OLrzqt.AEQbTJ.invoke(abstractC12784ctXCopydefault);
            }
        }
    }
}
