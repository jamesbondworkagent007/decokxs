package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55334xhw extends AbstractC55333xhv {
    public final long AkhnZx = 150;
    public final float ejfBZ = C55298xhM.dp$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55333xhv
    public void KWHzl(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55333xhv
    public void copydefault(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
    }

    @Override // o.AbstractC55333xhv
    public void copydefault(@NotNull android.view.ViewPropertyAnimator viewPropertyAnimator, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewPropertyAnimator, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        viewPropertyAnimator.alpha(1.0f);
    }

    @Override // o.AbstractC55333xhv
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        android.view.View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        view.setZ(this.ejfBZ);
    }

    @Override // o.AbstractC55333xhv
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        viewHolder.itemView.setTranslationY((-r0.getHeight()) * 1.5f);
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setScaleX(1.0f);
        viewHolder.itemView.setScaleY(1.0f);
        viewHolder.itemView.setZ(this.ejfBZ);
    }

    @Override // o.AbstractC55333xhv
    public void AEQbTJ(@NotNull android.view.ViewPropertyAnimator viewPropertyAnimator, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewPropertyAnimator, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        viewPropertyAnimator.translationY(0.0f);
        viewPropertyAnimator.setDuration(this.AkhnZx);
    }

    @Override // o.AbstractC55333xhv
    public void EZpvd(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        android.view.View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
    }
}
