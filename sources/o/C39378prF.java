package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.prF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C39378prF extends AbstractC59533zio<java.lang.String, RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: o.prF$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public TaskDescription(android.view.View view) {
            super(view);
        }
    }

    @Override // o.AbstractC59533zio
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new TaskDescription(layoutInflater.inflate(C35964oKf.Application.values, viewGroup, false));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = (android.widget.TextView) viewHolder.itemView.findViewById(C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi212);
        if (textView != null) {
            textView.setText(str);
        }
    }
}
