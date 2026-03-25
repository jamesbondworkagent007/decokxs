package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nPG extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
    public final int AEQbTJ;
    public final android.content.Context KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final float copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 android.widget.ImageView)
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (80.0f float) : (r3v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000a: SGET  A[WRAPPED] o.wXj.Activity.GhqvEQ int) : (r4v0 int))
 A[MD:(android.content.Context, android.widget.ImageView, float, int):void (m)] (LINE:27) call: o.nPG.<init>(android.content.Context, android.widget.ImageView, float, int):void type: THIS */
    public /* synthetic */ nPG(android.content.Context context, android.widget.ImageView imageView, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, imageView, (i2 & 4) != 0 ? 80.0f : f, (i2 & 8) != 0 ? C52761wXj.Activity.GhqvEQ : i);
    }

    @Override // o.InterfaceC5462Sq
    public /* synthetic */ void copydefault(java.lang.Object obj, InterfaceC5460So interfaceC5460So) {
        KWHzl((android.graphics.drawable.Drawable) obj, (InterfaceC5460So<? super android.graphics.drawable.Drawable>) interfaceC5460So);
    }

    public nPG(@NotNull android.content.Context context, @NotNull android.widget.ImageView imageView, float f, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(imageView, "");
        this.KWHzl = context;
        this.OLrzqt = imageView;
        this.copydefault = f;
        this.AEQbTJ = i;
    }

    public void KWHzl(@NotNull final android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
        Intrinsics.checkNotNullParameter(drawable, "");
        this.OLrzqt.post(new java.lang.Runnable() { // from class: o.nPD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                nPG.EZpvd(this.EZpvd, drawable);
            }
        });
    }

    public static final void EZpvd(nPG npg, android.graphics.drawable.Drawable drawable) {
        int height = npg.OLrzqt.getHeight();
        int width = npg.OLrzqt.getWidth();
        if (width <= 0 || height <= 0) {
            return;
        }
        android.graphics.drawable.Drawable drawableAEQbTJ = npg.AEQbTJ(drawable, width, height);
        int iCopydefault = C55298xhM.copydefault(npg.copydefault, npg.KWHzl);
        LayerDrawable layerDrawable = new LayerDrawable(new android.graphics.drawable.Drawable[]{drawableAEQbTJ, npg.KWHzl(width, iCopydefault)});
        layerDrawable.setLayerInset(1, 0, height - iCopydefault, 0, 0);
        npg.OLrzqt.setImageDrawable(layerDrawable);
    }

    @Override // o.InterfaceC5462Sq
    public void a_(android.graphics.drawable.Drawable drawable) {
        this.OLrzqt.setImageDrawable(null);
        this.OLrzqt.setImageMatrix(new android.graphics.Matrix());
    }

    public final android.graphics.drawable.Drawable AEQbTJ(android.graphics.drawable.Drawable drawable, int i, int i2) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return drawable;
        }
        float f = i / intrinsicWidth;
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(f, f);
        canvas.setMatrix(matrix);
        drawable.draw(canvas);
        android.content.res.Resources resources = this.KWHzl.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return new BitmapDrawable(resources, bitmapCreateBitmap);
    }

    public final GradientDrawable KWHzl(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, ContextCompat.getColor(this.KWHzl, this.AEQbTJ)});
        gradientDrawable.setSize(i, i2);
        return gradientDrawable;
    }
}
