package o;

import android.content.res.Resources;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tRT {
    public static final void OLrzqt(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setVisibility(8);
    }

    public static final void KWHzl(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setVisibility(0);
    }

    public static /* synthetic */ int getColor$default(android.view.View view, int i, Resources.Theme theme, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            theme = null;
        }
        return EZpvd(view, i, theme);
    }

    public static final int EZpvd(@NotNull android.view.View view, @androidx.annotation.ColorRes int i, Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(view, "");
        return ResourcesCompat.getColor(view.getResources(), i, theme);
    }

    public static final void copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object systemService = view.getContext().getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final void AEQbTJ(@NotNull android.view.ViewGroup viewGroup, @NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(view, "");
        try {
            if (Intrinsics.EZpvd(view.getParent(), viewGroup)) {
                viewGroup.removeView(view);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("qjf", "remove View failed", e);
        }
    }

    public static /* synthetic */ void setCornerRadius$default(android.view.View view, float f, float f2, float f3, float f4, int i, float f5, int i2, java.lang.Object obj) {
        if ((i2 & 32) != 0) {
            f5 = 1.0f;
        }
        OLrzqt(view, f, f2, f3, f4, i, f5);
    }

    public static final void OLrzqt(@NotNull android.view.View view, float f, float f2, float f3, float f4, int i, float f5) {
        ShapeAppearanceModel shapeAppearanceModelBuild;
        Intrinsics.checkNotNullParameter(view, "");
        if (C55296xhK.AEQbTJ(view)) {
            shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setTopLeftCorner(f3 < 0.1f ? 1 : 0, C55298xhM.dp2pxFloat$default(f3, null, 1, null)).setBottomLeftCorner(f4 < 0.1f ? 1 : 0, C55298xhM.dp2pxFloat$default(f4, null, 1, null)).setTopRightCorner(f < 0.1f ? 1 : 0, C55298xhM.dp2pxFloat$default(f, null, 1, null)).setBottomRightCorner(f2 < 0.1f ? 1 : 0, C55298xhM.dp2pxFloat$default(f2, null, 1, null)).build();
        } else {
            shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setTopLeftCorner(f < 0.1f ? 1 : 0, C55298xhM.dp2pxFloat$default(f, null, 1, null)).setBottomLeftCorner(f2 < 0.1f ? 1 : 0, C55298xhM.dp2pxFloat$default(f2, null, 1, null)).setTopRightCorner(f3 < 0.1f ? 1 : 0, C55298xhM.dp2pxFloat$default(f3, null, 1, null)).setBottomRightCorner(f4 < 0.1f ? 1 : 0, C55298xhM.dp2pxFloat$default(f4, null, 1, null)).build();
        }
        Intrinsics.copydefault(shapeAppearanceModelBuild);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild);
        view.setBackgroundTintList(android.content.res.ColorStateList.valueOf(i));
        materialShapeDrawable.setAlpha((int) (f5 * 255.0f));
        view.setBackground(materialShapeDrawable);
    }
}
