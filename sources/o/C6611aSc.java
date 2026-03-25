package o;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aSc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C6611aSc {
    public static /* synthetic */ void showStatusLottieAnimation$default(android.widget.ImageView imageView, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        KWHzl(imageView, i, i2);
    }

    public static final void KWHzl(@NotNull final android.widget.ImageView imageView, @androidx.annotation.RawRes int i, final int i2) {
        Intrinsics.checkNotNullParameter(imageView, "");
        LottieCompositionFactory.fromRawRes(imageView.getContext(), i).addListener(new LottieListener() { // from class: o.aSe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                C6611aSc.EZpvd(imageView, i2, (LottieComposition) obj);
            }
        });
    }

    public static final void EZpvd(android.widget.ImageView imageView, int i, LottieComposition lottieComposition) {
        LottieDrawable lottieDrawable = new LottieDrawable();
        lottieDrawable.setComposition(lottieComposition);
        lottieDrawable.setRepeatCount(i);
        lottieDrawable.playAnimation();
        imageView.performHapticFeedback(0);
        imageView.setImageDrawable(lottieDrawable);
    }
}
