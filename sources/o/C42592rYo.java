package o;

import com.bumptech.glide.Glide;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rYo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42592rYo {
    public static final C42592rYo KWHzl = new C42592rYo();

    private C42592rYo() {
    }

    public final void copydefault(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        C5448Sc c5448Sc = new C5448Sc();
        c5448Sc.copydefault(AbstractC5360Os.copydefault);
        resizeRemoteImageToViewSize$default(this, imageView, str, c5448Sc, null, 8, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rYo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void resizeRemoteImageToViewSize$default(C42592rYo c42592rYo, android.view.View view, java.lang.String str, C5448Sc c5448Sc, RY ry, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            ry = null;
        }
        c42592rYo.EZpvd(view, str, c5448Sc, ry);
    }

    public final void EZpvd(android.view.View view, java.lang.String str, C5448Sc c5448Sc, RY<android.graphics.drawable.Drawable> ry) {
        java.lang.Object c42591rYn;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            Intrinsics.copydefault((java.lang.Object) str);
            boolean zStartsWith$default = C59449zhJ.startsWith$default(str, "file://", false, 2, null);
            c42591rYn = str;
            if (!zStartsWith$default) {
                boolean zStartsWith$default2 = C59449zhJ.startsWith$default(str, "/", false, 2, null);
                c42591rYn = str;
                if (!zStartsWith$default2) {
                    c42591rYn = new C42591rYn(str);
                }
            }
        } else {
            c42591rYn = null;
        }
        int i = (view.getLayoutParams().width <= 0 || view.getLayoutParams().height <= 0) ? 200 : view.getLayoutParams().width;
        if (c42591rYn != null) {
            android.widget.ImageView imageView = view instanceof android.widget.ImageView ? (android.widget.ImageView) view : null;
            if (imageView != null) {
                ComponentCallbacks2C5333Nr componentCallbacks2C5333NrKWHzl = Glide.KWHzl(view);
                Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrKWHzl, "");
                C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = C55297xhL.AEQbTJ(componentCallbacks2C5333NrKWHzl, c42591rYn, "lfit", i, i).OLrzqt((RX<?>) c5448Sc);
                if (ry != null) {
                    c5335NtOLrzqt.OLrzqt(ry).EZpvd(imageView);
                } else {
                    c5335NtOLrzqt.EZpvd(imageView);
                }
            }
        }
    }
}
