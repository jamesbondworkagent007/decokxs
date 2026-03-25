package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mqi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33134mqi {
    public static final void AEQbTJ(java.lang.String str) {
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    public static final void KWHzl(java.lang.String str) {
        C55326xho.OLrzqt(str);
    }

    public static final void copydefault(int i) {
        C55326xho.toast$default(i, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    public static /* synthetic */ void toast$default(int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        EZpvd(i, i2);
    }

    public static final void EZpvd(int i, int i2) {
        C55326xho.toast$default(i, (android.graphics.drawable.Drawable) null, i2, (java.lang.Integer) null, 0, 0, 29, (java.lang.Object) null);
    }

    public static /* synthetic */ android.widget.Toast toast$default(java.lang.String str, android.graphics.drawable.Drawable drawable, int i, java.lang.Integer num, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            drawable = null;
        }
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            num = null;
        }
        if ((i4 & 8) != 0) {
            i2 = 0;
        }
        if ((i4 & 16) != 0) {
            i3 = 0;
        }
        return OLrzqt(str, drawable, i, num, i2, i3);
    }

    public static final android.widget.Toast OLrzqt(java.lang.String str, android.graphics.drawable.Drawable drawable, int i, java.lang.Integer num, int i2, int i3) {
        return C55326xho.EZpvd(str, drawable, i, num, i2, i3);
    }

    public static final void copydefault(@NotNull java.lang.String str, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, java.lang.Integer.valueOf(i), i2, i3, 3, (java.lang.Object) null);
    }

    public static final void EZpvd(int i, int i2, int i3, int i4) {
        C55326xho.toast$default(i, (android.graphics.drawable.Drawable) null, 0, java.lang.Integer.valueOf(i2), i3, i4, 3, (java.lang.Object) null);
    }

    public static /* synthetic */ void toastWithSuccessfulIcon$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        AEQbTJ(str, i);
    }

    public static final void AEQbTJ(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.EZpvd(str, i);
    }

    public static /* synthetic */ void toastWithSuccessfulIcon$default(int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        OLrzqt(i, i2);
    }

    public static final void OLrzqt(int i, int i2) {
        C55326xho.copydefault(i, i2);
    }

    public static /* synthetic */ void toastWithFailedIcon$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        EZpvd(str, i);
    }

    public static final void EZpvd(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.copydefault(str, i);
    }

    public static /* synthetic */ void toastWithFailedIcon$default(int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        copydefault(i, i2);
    }

    public static final void copydefault(int i, int i2) {
        C55326xho.KWHzl(i, i2);
    }

    public static final void copydefault(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        if (str != null) {
            C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    public static final void copydefault(@NotNull androidx.fragment.app.Fragment fragment, java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragment, "");
        if (str != null) {
            C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }
}
