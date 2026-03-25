package o;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieListener;
import com.okinc.business.dex.utils.CDNSourceManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22361hds {
    public static final void OLrzqt(@NotNull LottieAnimationView lottieAnimationView, @NotNull CDNSourceManager.LottieSource lottieSource) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "");
        Intrinsics.checkNotNullParameter(lottieSource, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.EZpvd;
        android.content.Context context = lottieAnimationView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        lottieAnimationView.setAnimationFromUrl(cDNSourceManager.OLrzqt(lottieSource, context));
        lottieAnimationView.setFailureListener(new LottieListener() { // from class: o.hdt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                C22361hds.EZpvd((java.lang.Throwable) obj);
            }
        });
    }

    public static final void EZpvd(java.lang.Throwable th) {
        pUU.AEQbTJ("CDNSourceManager", "Failed to load Lottie animation: " + th.getMessage(), th);
    }

    public static final void OLrzqt(@NotNull android.widget.ImageView imageView, @NotNull CDNSourceManager.ImageSource imageSource) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(imageSource, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.EZpvd;
        android.content.Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.loadUrl$default(imageView, cDNSourceManager.OLrzqt(imageSource, context), null, 0, 0, 14, null);
    }
}
