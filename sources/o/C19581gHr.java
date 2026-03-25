package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gHr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19581gHr extends AbstractC59533zio<C17742fQp, RecyclerView.ViewHolder> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull C17742fQp c17742fQp) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(c17742fQp, "");
    }

    /* JADX INFO: renamed from: o.gHr$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public Application(android.view.View view) {
            super(view);
        }
    }

    @Override // o.AbstractC59533zio
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View view = new android.view.View(viewGroup.getContext());
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, C55298xhM.copydefault(16.0f, context)));
        return new Application(view);
    }
}
