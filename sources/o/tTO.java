package o;

import android.graphics.drawable.BitmapDrawable;
import androidx.appcompat.content.res.AppCompatResources;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tTO {
    public static /* synthetic */ void setButtonDrawable$default(C52794wYp c52794wYp, android.content.Context context, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        OLrzqt(c52794wYp, context, num, num2, num3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, android.graphics.drawable.BitmapDrawable] */
    public static final void OLrzqt(@NotNull C52794wYp c52794wYp, @NotNull android.content.Context context, @androidx.annotation.DrawableRes java.lang.Integer num, @androidx.annotation.ColorRes java.lang.Integer num2, java.lang.Integer num3) {
        android.graphics.Bitmap bitmapKWHzl;
        int color;
        Intrinsics.checkNotNullParameter(c52794wYp, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (num != null) {
            int iIntValue = num.intValue();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? drawable = AppCompatResources.getDrawable(context, iIntValue);
            if (drawable != 0) {
                if (num2 != null) {
                    color = java.lang.Integer.valueOf(context.getColor(num2.intValue())).intValue();
                } else {
                    color = context.getColor(C52761wXj.Activity.DeEinT);
                }
                drawable.setTint(color);
            }
            objectRef.element = drawable;
            if (num3 != null) {
                int iIntValue2 = num3.intValue();
                android.graphics.drawable.Drawable drawable2 = (android.graphics.drawable.Drawable) objectRef.element;
                if (drawable2 != null && (bitmapKWHzl = C55299xhN.KWHzl(drawable2)) != null) {
                    float f = iIntValue2;
                    android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmapKWHzl, C55298xhM.copydefault(f, context), C55298xhM.copydefault(f, context), true);
                    Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "");
                    android.content.res.Resources resources = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "");
                    objectRef.element = new BitmapDrawable(resources, bitmapCreateScaledBitmap);
                }
            }
            c52794wYp.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) objectRef.element, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            return;
        }
        c52794wYp.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
    }
}
