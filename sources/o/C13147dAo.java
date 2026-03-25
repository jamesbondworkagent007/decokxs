package o;

import com.bumptech.glide.Glide;
import com.okinc.dapp.bean.DappChains;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dAo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13147dAo {
    public static final void EZpvd(@NotNull android.widget.ImageView imageView, @NotNull DappChains dappChains, int i) {
        java.lang.String dayTimeIcon;
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(dappChains, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) dappChains.getNightIcon()) && C33129mqd.OLrzqt((java.lang.CharSequence) dappChains.getDayTimeIcon())) {
            if (C33492mxV.OLrzqt()) {
                dayTimeIcon = dappChains.getNightIcon();
            } else {
                dayTimeIcon = dappChains.getDayTimeIcon();
            }
            java.lang.String str = dayTimeIcon;
            android.content.Context context = imageView.getContext();
            if (context != null) {
                C14867dtZ c14867dtZ = C14867dtZ.AEQbTJ;
                ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
                Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
                C14867dtZ.loadCropUrl$default(c14867dtZ, componentCallbacks2C5333NrAEQbTJ, str, i, 0, 4, null).EZpvd(imageView);
            }
        }
    }
}
