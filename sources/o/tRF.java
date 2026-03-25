package o;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.airbnb.lottie.RenderMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tRF {
    public static final boolean AEQbTJ(android.view.View view, android.view.MotionEvent motionEvent) {
        return true;
    }

    public static final void copydefault(@NotNull LottieAnimationView lottieAnimationView, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "");
        Intrinsics.checkNotNullParameter(str, "");
        lottieAnimationView.setTag(C47501trL.TaskDescription.akftKQ, str);
    }

    public static final java.lang.String AEQbTJ(@NotNull LottieAnimationView lottieAnimationView) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "");
        java.lang.Object tag = lottieAnimationView.getTag(C47501trL.TaskDescription.akftKQ);
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        return str == null ? "" : str;
    }

    public static /* synthetic */ void setAndPlay$default(LottieAnimationView lottieAnimationView, int i, ImageView.ScaleType scaleType, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if ((i4 & 4) != 0) {
            i2 = -1;
        }
        if ((i4 & 8) != 0) {
            i3 = 1;
        }
        AEQbTJ(lottieAnimationView, i, scaleType, i2, i3);
    }

    public static final void AEQbTJ(@NotNull LottieAnimationView lottieAnimationView, @androidx.annotation.RawRes int i, @NotNull ImageView.ScaleType scaleType, int i2, int i3) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "");
        Intrinsics.checkNotNullParameter(scaleType, "");
        lottieAnimationView.setScaleType(scaleType);
        OLrzqt(lottieAnimationView, i, i2, i3);
    }

    public static final class ActionBar implements View.OnLayoutChangeListener {
        public final /* synthetic */ Ref.IntRef AEQbTJ;
        public final /* synthetic */ C55113xdn EZpvd;
        public final /* synthetic */ int copydefault;

        public ActionBar(Ref.IntRef intRef, int i, C55113xdn c55113xdn) {
            this.AEQbTJ = intRef;
            this.copydefault = i;
            this.EZpvd = c55113xdn;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            this.AEQbTJ.element = view.getWidth();
            tRF.copydefault(this.EZpvd, this.copydefault, this.AEQbTJ.element);
        }
    }

    public static final void EZpvd(@NotNull final C55113xdn c55113xdn, @androidx.annotation.RawRes int i) {
        Intrinsics.checkNotNullParameter(c55113xdn, "");
        c55113xdn.setAutoMirrored(true);
        c55113xdn.setScaleType(ImageView.ScaleType.MATRIX);
        c55113xdn.setOnTouchListener(new View.OnTouchListener() { // from class: o.tRI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return tRF.AEQbTJ(view, motionEvent);
            }
        });
        loadAnimation$default(c55113xdn, i, 0, 0, 6, null);
        c55113xdn.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: o.tRH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public final void onCompositionLoaded(LottieComposition lottieComposition) {
                tRF.copydefault(c55113xdn, lottieComposition);
            }
        });
    }

    public static final void copydefault(C55113xdn c55113xdn, int i, int i2) {
        if (i != 0) {
            float f = i2 / i;
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setScale(f, f);
            c55113xdn.setImageMatrix(matrix);
        }
    }

    public static final void copydefault(C55113xdn c55113xdn, LottieComposition lottieComposition) {
        int iWidth = lottieComposition.getBounds().width();
        Ref.IntRef intRef = new Ref.IntRef();
        int width = c55113xdn.getWidth();
        intRef.element = width;
        if (width != 0) {
            copydefault(c55113xdn, iWidth, width);
            return;
        }
        if (ViewCompat.isLaidOut(c55113xdn) && !c55113xdn.isLayoutRequested()) {
            int width2 = c55113xdn.getWidth();
            intRef.element = width2;
            copydefault(c55113xdn, iWidth, width2);
            return;
        }
        c55113xdn.addOnLayoutChangeListener(new ActionBar(intRef, iWidth, c55113xdn));
    }

    public static /* synthetic */ void loadAnimation$default(LottieAnimationView lottieAnimationView, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i2 = -1;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        OLrzqt(lottieAnimationView, i, i2, i3);
    }

    public static final void OLrzqt(LottieAnimationView lottieAnimationView, @androidx.annotation.RawRes int i, int i2, int i3) {
        if (!Intrinsics.EZpvd((java.lang.Object) AEQbTJ(lottieAnimationView), (java.lang.Object) java.lang.String.valueOf(i))) {
            copydefault(lottieAnimationView, java.lang.String.valueOf(i));
            lottieAnimationView.setAnimation(i);
        }
        if (C57601ylW.KWHzl.AhwBna() && Build.VERSION.SDK_INT == 29) {
            lottieAnimationView.setRenderMode(RenderMode.SOFTWARE);
        }
        lottieAnimationView.setScaleType(lottieAnimationView.getScaleType());
        lottieAnimationView.setRepeatCount(i2);
        lottieAnimationView.setRepeatMode(i3);
        lottieAnimationView.playAnimation();
        lottieAnimationView.setVisibility(0);
    }
}
