package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wOC {
    public static final float OLrzqt(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, float f) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        return textView.getPaint().measureText(str) + f;
    }

    public static /* synthetic */ int getDividerVisibility$default(RecyclerView.ViewHolder viewHolder, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return OLrzqt(viewHolder, z);
    }

    public static final int OLrzqt(RecyclerView.ViewHolder viewHolder, boolean z) {
        if (z) {
            return 8;
        }
        try {
            if (viewHolder.getBindingAdapterPosition() == -1) {
                return 8;
            }
            if (viewHolder.getAdapterPosition() == (viewHolder.getBindingAdapter() != null ? r3.getItemCount() : 0) - 1) {
                return 8;
            }
        } catch (java.lang.Exception unused) {
        }
        return 0;
    }

    public static /* synthetic */ void applyLayoutStyle$default(C52515wOg c52515wOg, boolean z, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        KWHzl(c52515wOg, z, num);
    }

    public static final void KWHzl(C52515wOg c52515wOg, boolean z, java.lang.Integer num) {
        int dimensionPixelSize;
        android.content.res.Resources resources = c52515wOg.itemView.getContext().getResources();
        ViewGroup.LayoutParams layoutParams = c52515wOg.values().getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (z) {
            c52515wOg.values().setBackgroundResource(C48033uCm.ActionBar.gEmmrt);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C52761wXj.StateListAnimator.AkhnZx);
            c52515wOg.values().setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            marginLayoutParams.bottomMargin = resources.getDimensionPixelSize(C52761wXj.StateListAnimator.fARcdN);
        } else {
            c52515wOg.values().setBackground(null);
            if (num != null) {
                dimensionPixelSize = C55298xhM.dpInt$default(num.intValue(), (android.content.Context) null, 1, (java.lang.Object) null);
            } else {
                dimensionPixelSize = resources.getDimensionPixelSize(C52761wXj.StateListAnimator.fetchVPNInfo);
            }
            c52515wOg.values().setPadding(0, dimensionPixelSize, 0, 0);
            marginLayoutParams.bottomMargin = 0;
        }
        c52515wOg.values().setLayoutParams(marginLayoutParams);
    }

    public static final void AEQbTJ(C52515wOg c52515wOg) {
        c52515wOg.copydefault().setVisibility(8);
        c52515wOg.iwGUEr().setVisibility(8);
        c52515wOg.AhwBna().setVisibility(8);
    }
}
