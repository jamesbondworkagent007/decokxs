package o;

import androidx.recyclerview.widget.NoMoveItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fEz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17428fEz implements fDP {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.FHvxmb, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Activity(viewInflate);
    }

    /* JADX INFO: renamed from: o.fEz$Activity */
    public static final class Activity extends RecyclerView.ViewHolder implements NoMoveItemAnimator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
        }
    }
}
