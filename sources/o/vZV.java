package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vZV extends AbstractC59533zio<C55844xrc, TaskDescription> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC50817vbM abstractC50817vbMCopydefault = AbstractC50817vbM.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC50817vbMCopydefault, "");
        return new TaskDescription(abstractC50817vbMCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull C55844xrc c55844xrc) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(c55844xrc, "");
        AbstractC50817vbM abstractC50817vbMOLrzqt = taskDescription.OLrzqt();
        abstractC50817vbMOLrzqt.KWHzl.setText(c55844xrc.OLrzqt());
        abstractC50817vbMOLrzqt.KWHzl.setPaddingRelative(0, c55844xrc.KWHzl(), 0, 0);
    }

    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final AbstractC50817vbM AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC50817vbM OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull AbstractC50817vbM abstractC50817vbM) {
            super(abstractC50817vbM.getRoot());
            Intrinsics.checkNotNullParameter(abstractC50817vbM, "");
            this.AEQbTJ = abstractC50817vbM;
        }
    }
}
