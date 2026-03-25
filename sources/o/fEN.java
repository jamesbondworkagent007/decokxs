package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fEN implements fDP {
    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55173xeu c55173xeu = new C55173xeu(context, null, 0, 6, null);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C55298xhM.dp2px$default(160.0f, null, 1, null);
        c55173xeu.setLayoutParams(layoutParams);
        return new Activity(c55173xeu);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ((Activity) viewHolder).KWHzl();
    }

    public static final class Activity extends RecyclerView.ViewHolder {
        public static final int EZpvd = C55173xeu.EZpvd;
        public final C55173xeu OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View view2 = this.itemView;
            Intrinsics.copydefault(view2, "");
            this.OLrzqt = (C55173xeu) view2;
        }

        public final void KWHzl() {
            this.OLrzqt.setEmptyTypeImage(7);
            this.OLrzqt.setTitle("");
            this.OLrzqt.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsStartActivityForResult));
            this.OLrzqt.setRetry("");
        }
    }
}
