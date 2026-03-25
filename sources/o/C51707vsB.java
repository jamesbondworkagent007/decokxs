package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.BindingAdapter;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vsB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51707vsB {
    @BindingAdapter({"fromCRActivityStyle"})
    public static final void EZpvd(@NotNull ConstraintLayout constraintLayout, boolean z) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        if (z) {
            constraintLayout.setBackgroundResource(C48033uCm.ActionBar.gEmmrt);
            constraintLayout.setPadding(0, constraintLayout.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.AkhnZx), 0, constraintLayout.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.AkhnZx));
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(constraintLayout.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fARcdN));
                marginLayoutParams.setMarginEnd(constraintLayout.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fARcdN));
                constraintLayout.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        constraintLayout.setBackgroundResource(0);
        constraintLayout.setPadding(0, 0, 0, 0);
        ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginStart(0);
            marginLayoutParams2.setMarginEnd(0);
            constraintLayout.setLayoutParams(marginLayoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
