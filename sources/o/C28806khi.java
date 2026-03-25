package o;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28806khi {
    public static final void KWHzl(@NotNull android.widget.ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "");
        int i = C52761wXj.TaskDescription.sElUiK;
        android.content.Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.graphics.drawable.Drawable drawableEZpvd = C33070mpX.EZpvd(i, context);
        if (drawableEZpvd != null) {
            C33057mpK.copydefault(drawableEZpvd, C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
        }
        if (drawableEZpvd != null) {
            int iDp2px$default = C55298xhM.dp2px$default(48.0f, null, 1, null);
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iDp2px$default, iDp2px$default, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            drawableEZpvd.setBounds(0, 0, iDp2px$default, iDp2px$default);
            drawableEZpvd.draw(canvas);
            imageView.setImageBitmap(bitmapCreateBitmap);
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }
}
