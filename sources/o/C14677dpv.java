package o;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieListener;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dpv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14677dpv {
    public static final void KWHzl(@NotNull LottieAnimationView lottieAnimationView, @NotNull CDNSourceManager.LottieSource lottieSource) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "");
        Intrinsics.checkNotNullParameter(lottieSource, "");
        try {
            CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
            android.content.Context context = lottieAnimationView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.lang.String strKWHzl = cDNSourceManager.KWHzl(lottieSource, context);
            lottieAnimationView.setFailureListener(new LottieListener() { // from class: o.dpu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(java.lang.Object obj) {
                    C14677dpv.KWHzl((java.lang.Throwable) obj);
                }
            });
            lottieAnimationView.setAnimationFromUrl(strKWHzl);
        } catch (java.lang.Exception e) {
            pUU.copydefault("CDNSourceManager", "loadRemoteLottie error = " + e.getMessage());
        }
    }

    public static final void KWHzl(java.lang.Throwable th) {
        pUU.AEQbTJ("CDNSourceManager", "Failed to load Lottie animation: " + (th != null ? th.getMessage() : null), th);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mpH.loadUrl$default(android.widget.ImageView, java.lang.String, java.lang.String, int, int, int, java.lang.Object):void */
    public static final void OLrzqt(@NotNull android.widget.ImageView imageView, @NotNull CDNSourceManager.ImageSource imageSource) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(imageSource, "");
        try {
            CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C33054mpH.loadUrl$default(imageView, cDNSourceManager.KWHzl(imageSource, context), null, 0, 0, 14, null);
        } catch (java.lang.Exception e) {
            pUU.copydefault("CDNSourceManager", "loadRemoteImage error = " + e.getMessage());
        }
    }
}
