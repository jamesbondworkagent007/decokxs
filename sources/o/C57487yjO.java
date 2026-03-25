package o;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57487yjO extends android.text.style.ReplacementSpan {
    public final android.content.Context EZpvd;
    public WeakReference<LottieDrawable> OLrzqt;

    public C57487yjO(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = context;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "");
        android.graphics.Rect bounds = AEQbTJ().getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "");
        return bounds.right;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(paint, "");
        LottieDrawable lottieDrawableAEQbTJ = AEQbTJ();
        canvas.save();
        canvas.translate(f, i4 - (lottieDrawableAEQbTJ.getBounds().bottom - (lottieDrawableAEQbTJ.getBounds().bottom / 4)));
        lottieDrawableAEQbTJ.draw(canvas);
        canvas.restore();
    }

    public final LottieDrawable KWHzl() {
        int iOLrzqt = C55298xhM.OLrzqt(32, this.EZpvd);
        final LottieDrawable lottieDrawable = new LottieDrawable();
        LottieCompositionFactory.fromRawRes(this.EZpvd, C57406yhn.Application.KWHzl).addListener(new LottieListener() { // from class: o.yjW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                C57487yjO.KWHzl(lottieDrawable, (LottieComposition) obj);
            }
        });
        lottieDrawable.setBounds(0, 0, iOLrzqt, iOLrzqt);
        lottieDrawable.setRepeatCount(-1);
        return lottieDrawable;
    }

    public static final void KWHzl(LottieDrawable lottieDrawable, LottieComposition lottieComposition) {
        lottieDrawable.setComposition(lottieComposition);
    }

    public final LottieDrawable AEQbTJ() {
        LottieDrawable lottieDrawable;
        WeakReference<LottieDrawable> weakReference = this.OLrzqt;
        if (weakReference != null && (lottieDrawable = weakReference.get()) != null) {
            return lottieDrawable;
        }
        LottieDrawable lottieDrawableKWHzl = KWHzl();
        this.OLrzqt = new WeakReference<>(lottieDrawableKWHzl);
        return lottieDrawableKWHzl;
    }

    public final void KWHzl(Drawable.Callback callback) {
        AEQbTJ().setCallback(callback);
    }

    public final void OLrzqt() {
        AEQbTJ().playAnimation();
    }

    public final void EZpvd() {
        AEQbTJ().endAnimation();
    }
}
