package o;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19177fwP {
    public static final LayerDrawable KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(ContextCompat.getColor(context, C52761wXj.Activity.djBIcL));
        gradientDrawable.setStroke(C55298xhM.copydefault(1.0f, context), ContextCompat.getColor(context, C52761wXj.Activity.zuBGHE));
        gradientDrawable.setCornerRadius(C55298xhM.EZpvd(8.0f, context));
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.gasjUx);
        android.graphics.drawable.Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        if (drawableMutate != null) {
            DrawableCompat.setTint(drawableMutate, ContextCompat.getColor(context, C52761wXj.Activity.UlJrfe));
        }
        LayerDrawable layerDrawable = new LayerDrawable(new android.graphics.drawable.Drawable[]{gradientDrawable, drawableMutate});
        int iOLrzqt = C55298xhM.OLrzqt(20, context);
        layerDrawable.setLayerSize(1, iOLrzqt, iOLrzqt);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }
}
