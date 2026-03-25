package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lMZ {
    public static final void OLrzqt(@NotNull InterfaceC30133lNc interfaceC30133lNc, @NotNull android.widget.ImageView imageView) {
        Intrinsics.checkNotNullParameter(interfaceC30133lNc, "");
        Intrinsics.checkNotNullParameter(imageView, "");
        boolean zOLrzqt = C33492mxV.OLrzqt();
        kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ = interfaceC30133lNc.AEQbTJ();
        java.lang.String second = zOLrzqt ? pairAEQbTJ.getSecond() : pairAEQbTJ.getFirst();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) second)) {
            imageView.setVisibility(0);
            C33054mpH.loadUrl$default(imageView, second, null, 0, 0, 14, null);
        } else {
            imageView.setVisibility(8);
        }
    }

    public static final void OLrzqt(@NotNull InterfaceC30133lNc interfaceC30133lNc, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(interfaceC30133lNc, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (interfaceC30133lNc.fetchVPNInfo() && C33129mqd.OLrzqt((java.lang.CharSequence) interfaceC30133lNc.valueOf())) {
            textView.setVisibility(0);
            textView.setText(interfaceC30133lNc.valueOf());
        } else {
            textView.setVisibility(8);
        }
    }

    public static final void KWHzl(@NotNull InterfaceC30133lNc interfaceC30133lNc, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(interfaceC30133lNc, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) interfaceC30133lNc.copydefault())) {
            textView.setVisibility(0);
            textView.setText(interfaceC30133lNc.copydefault());
        } else {
            textView.setVisibility(8);
        }
    }
}
