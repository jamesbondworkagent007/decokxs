package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class fES implements fDP {
    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16822erF c16822erFCopydefault = C16822erF.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16822erFCopydefault, "");
        return new Activity(c16822erFCopydefault);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ((Activity) viewHolder).EZpvd((fEO) obj);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final C16822erF EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C16822erF c16822erF) {
            super(c16822erF.getRoot());
            Intrinsics.checkNotNullParameter(c16822erF, "");
            this.EZpvd = c16822erF;
        }

        public final void EZpvd(@NotNull fEO feo) {
            Intrinsics.checkNotNullParameter(feo, "");
            this.EZpvd.copydefault.setText(feo.KWHzl());
        }
    }
}
