package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lMk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30114lMk {
    public static final void OLrzqt(@NotNull InterfaceC30115lMl interfaceC30115lMl, @NotNull android.widget.ImageView imageView) {
        Intrinsics.checkNotNullParameter(interfaceC30115lMl, "");
        Intrinsics.checkNotNullParameter(imageView, "");
        if (interfaceC30115lMl.getFieldNames()) {
            imageView.setVisibility(0);
            boolean zOLrzqt = C33492mxV.OLrzqt();
            kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = interfaceC30115lMl.OLrzqt();
            java.lang.String second = zOLrzqt ? pairOLrzqt.getSecond() : pairOLrzqt.getFirst();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) second)) {
                imageView.setVisibility(0);
                C33054mpH.loadUrl$default(imageView, second, null, 0, 0, 14, null);
                return;
            } else {
                imageView.setVisibility(8);
                return;
            }
        }
        imageView.setVisibility(8);
    }

    public static final void EZpvd(@NotNull InterfaceC30115lMl interfaceC30115lMl, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(interfaceC30115lMl, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (interfaceC30115lMl.fIwbmz()) {
            textView.setVisibility(0);
            if (interfaceC30115lMl.getNewProxyInstance()) {
                textView.setText(interfaceC30115lMl.AYXKKw());
                return;
            } else {
                textView.setText(interfaceC30115lMl.copydefault());
                return;
            }
        }
        textView.setVisibility(8);
    }

    public static final void copydefault(@NotNull InterfaceC30115lMl interfaceC30115lMl, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(interfaceC30115lMl, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (interfaceC30115lMl.fJNWhG()) {
            textView.setVisibility(0);
            textView.setText(interfaceC30115lMl.EZpvd());
            textView.setTextColor(C33070mpX.copydefault(interfaceC30115lMl.KWHzl()));
            return;
        }
        textView.setVisibility(8);
    }

    public static final void AEQbTJ(@NotNull InterfaceC30115lMl interfaceC30115lMl, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(interfaceC30115lMl, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (interfaceC30115lMl.iwGUEr()) {
            textView.setVisibility(0);
            textView.setText(interfaceC30115lMl.djBIcL());
            textView.setTextColor(C33070mpX.copydefault(interfaceC30115lMl.KWHzl()));
            return;
        }
        textView.setVisibility(8);
    }

    public static final void OLrzqt(@NotNull InterfaceC30115lMl interfaceC30115lMl, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(interfaceC30115lMl, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (interfaceC30115lMl.hDKMBd() && C33129mqd.OLrzqt((java.lang.CharSequence) interfaceC30115lMl.fetchVPNInfo())) {
            textView.setVisibility(0);
            textView.setText(interfaceC30115lMl.fetchVPNInfo());
        } else {
            textView.setVisibility(8);
        }
    }

    public static final void EZpvd(@NotNull InterfaceC30115lMl interfaceC30115lMl, @NotNull android.widget.TextView textView, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC30115lMl, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (interfaceC30115lMl.ejfBZ() && z) {
            textView.setVisibility(0);
            textView.setText(interfaceC30115lMl.AEQbTJ());
        } else {
            textView.setVisibility(8);
        }
    }

    public static final void KWHzl(@NotNull InterfaceC30115lMl interfaceC30115lMl, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(interfaceC30115lMl, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (interfaceC30115lMl.fARcdN()) {
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
        } else {
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        }
    }

    public static /* synthetic */ void applyStatus$default(InterfaceC30115lMl interfaceC30115lMl, android.widget.TextView textView, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        OLrzqt(interfaceC30115lMl, textView, i);
    }

    public static final void OLrzqt(@NotNull InterfaceC30115lMl interfaceC30115lMl, @NotNull android.widget.TextView textView, int i) {
        Intrinsics.checkNotNullParameter(interfaceC30115lMl, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (interfaceC30115lMl.AuCTel() && interfaceC30115lMl.AkhnZx()) {
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        } else {
            textView.setTextColor(i);
        }
    }
}
