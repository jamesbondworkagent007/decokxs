package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55337xhz extends AbstractC55333xhv {
    public final long AkhnZx = 250;
    public final float fJNWhG = 0.05f;
    public final float fIwbmz = C55298xhM.dp$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55333xhv
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55333xhv
    public void copydefault(@NotNull android.view.ViewPropertyAnimator viewPropertyAnimator, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewPropertyAnimator, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55333xhv
    public void copydefault(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
    }

    @Override // o.AbstractC55333xhv
    public void KWHzl(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setZ(this.fIwbmz);
    }

    @Override // o.AbstractC55333xhv
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        int height = viewHolder.itemView.getHeight();
        float fCopydefault = C56548yJl.copydefault(C56548yJl.valueOf(1.0f - (this.fJNWhG * viewHolder.getAbsoluteAdapterPosition()), 1.0f), 0.0f);
        viewHolder.itemView.setTranslationY((-height) * viewHolder.getAbsoluteAdapterPosition());
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setScaleX(fCopydefault);
        viewHolder.itemView.setScaleY(fCopydefault);
        viewHolder.itemView.setZ(this.fIwbmz);
    }

    @Override // o.AbstractC55333xhv
    public void AEQbTJ(@NotNull android.view.ViewPropertyAnimator viewPropertyAnimator, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewPropertyAnimator, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        viewPropertyAnimator.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(this.AkhnZx);
    }

    @Override // o.AbstractC55333xhv
    public void EZpvd(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        android.view.View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }
}
