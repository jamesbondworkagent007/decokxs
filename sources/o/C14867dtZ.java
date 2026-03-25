package o;

import com.bumptech.glide.Glide;
import kotlin.jvm.internal.Intrinsics;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dtZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14867dtZ {
    public static final C14867dtZ AEQbTJ = new C14867dtZ();

    private C14867dtZ() {
    }

    public static /* synthetic */ void loadDappRoundImage$default(C14867dtZ c14867dtZ, android.widget.ImageView imageView, java.lang.String str, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 4;
        }
        c14867dtZ.copydefault(imageView, str, i, (i4 & 4) != 0 ? -1 : i2, (i4 & 8) != 0 ? -1 : i3);
    }

    public final void copydefault(@NotNull android.widget.ImageView imageView, java.lang.String str, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (str == null || str.length() == 0) {
            return;
        }
        Glide.AEQbTJ(imageView.getContext()).EZpvd(C14923duc.EZpvd.copydefault(str, i2, i3)).KWHzl(dLX.ActionBar.AYXKKw).OLrzqt((RX<?>) C5448Sc.KWHzl((NN<android.graphics.Bitmap>) new C5417Qx(i))).EZpvd(imageView);
    }

    public static /* synthetic */ C5335Nt loadCropUrl$default(C14867dtZ c14867dtZ, ComponentCallbacks2C5333Nr componentCallbacks2C5333Nr, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        return c14867dtZ.AEQbTJ(componentCallbacks2C5333Nr, str, i, i2);
    }

    public final C5335Nt<android.graphics.drawable.Drawable> AEQbTJ(@NotNull ComponentCallbacks2C5333Nr componentCallbacks2C5333Nr, java.lang.String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(componentCallbacks2C5333Nr, "");
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = componentCallbacks2C5333Nr.EZpvd(C14923duc.EZpvd.copydefault(str, i, i2));
        Intrinsics.checkNotNullExpressionValue(c5335NtEZpvd, "");
        return c5335NtEZpvd;
    }

    public final java.lang.String AEQbTJ() {
        try {
            C43246rlf c43246rlf = C43246rlf.OLrzqt;
            java.lang.String str = c43246rlf.valueOf().getPackageManager().getPackageInfo(c43246rlf.valueOf().getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("tag", e);
            return "";
        }
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (str.length() == 0 || new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)).resolveActivity(C54819xWm.KWHzl().AEQbTJ().getPackageManager()) == null) ? false : true;
    }
}
