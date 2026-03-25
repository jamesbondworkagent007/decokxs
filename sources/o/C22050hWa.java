package o;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hWa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C22050hWa extends AbstractC59533zio<hUZ, RecyclerView.ViewHolder> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull hUZ huz) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(huz, "");
    }

    @Override // o.AbstractC59533zio
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        android.view.View view = new android.view.View(context);
        view.setBackgroundColor(ContextCompat.getColor(context, C52761wXj.Activity.zuBGHE));
        Intrinsics.copydefault(context);
        view.setLayoutParams(new RecyclerView.LayoutParams(-1, C55298xhM.KWHzl(0.5f, context)));
        return new Activity(view);
    }

    /* JADX INFO: renamed from: o.hWa$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public Activity(android.view.View view) {
            super(view);
        }
    }
}
