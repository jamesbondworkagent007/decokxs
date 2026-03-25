package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC18139fck;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18137fci extends AbstractC59533zio<InterfaceC18139fck.ActionBar, RecyclerView.ViewHolder> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull InterfaceC18139fck.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
    }

    /* JADX INFO: renamed from: o.fci$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public ActionBar(android.view.View view) {
            super(view);
        }
    }

    @Override // o.AbstractC59533zio
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new ActionBar(layoutInflater.inflate(C13754dXa.TaskDescription.DlmWDR, viewGroup, false));
    }
}
