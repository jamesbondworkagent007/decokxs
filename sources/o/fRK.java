package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fRK implements fDP {
    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16872esC c16872esCKWHzl = C16872esC.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16872esCKWHzl, "");
        return new StateListAnimator(c16872esCKWHzl);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ((StateListAnimator) viewHolder).copydefault((fEO) obj);
    }

    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C16872esC OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C16872esC c16872esC) {
            super(c16872esC.getRoot());
            Intrinsics.checkNotNullParameter(c16872esC, "");
            this.OLrzqt = c16872esC;
        }

        public final void copydefault(@NotNull fEO feo) {
            Intrinsics.checkNotNullParameter(feo, "");
            this.OLrzqt.OLrzqt.setText(feo.KWHzl());
        }
    }
}
