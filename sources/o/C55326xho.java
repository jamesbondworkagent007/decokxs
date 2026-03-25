package o;

import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55326xho {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final android.widget.Toast EZpvd(java.lang.String str) {
        return toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    public static final void OLrzqt(java.lang.String str) {
        if (C52762wXk.copydefault()) {
            C55328xhq.show$default(C55328xhq.OLrzqt, str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        }
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
        return EZpvd(str, drawable, i, num, i2, i3);
    }

    public static final android.widget.Toast EZpvd(java.lang.String str, android.graphics.drawable.Drawable drawable, int i, java.lang.Integer num, int i2, int i3) {
        return C55328xhq.OLrzqt.AEQbTJ(str, drawable, i, num, i2, i3);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xhq.show$default(o.xhq, java.lang.CharSequence, android.graphics.drawable.Drawable, int, java.lang.Integer, int, int, int, java.lang.Object):android.widget.Toast */
    public static final void AEQbTJ(java.lang.String str) {
        C55328xhq.show$default(C55328xhq.OLrzqt, str, (android.graphics.drawable.Drawable) null, 1, (java.lang.Integer) null, 0, 0, 58, (java.lang.Object) null);
    }

    public static final void EZpvd(int i) {
        if (i != -1) {
            AEQbTJ(C55328xhq.OLrzqt.copydefault().getResources().getString(i));
        }
    }

    public static /* synthetic */ void toast$default(int i, android.graphics.drawable.Drawable drawable, int i2, java.lang.Integer num, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            drawable = null;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            num = null;
        }
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        if ((i5 & 16) != 0) {
            i4 = 0;
        }
        copydefault(i, drawable, i2, num, i3, i4);
    }

    public static final void copydefault(int i, android.graphics.drawable.Drawable drawable, int i2, java.lang.Integer num, int i3, int i4) {
        if (i != -1) {
            EZpvd(C55328xhq.OLrzqt.copydefault().getResources().getString(i), drawable, i2, num, i3, i4);
        }
    }

    public static /* synthetic */ void toastWithSuccessfulIcon$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        EZpvd(str, i);
    }

    public static final void EZpvd(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        toast$default(str, ContextCompat.getDrawable(C55328xhq.OLrzqt.copydefault(), C52761wXj.TaskDescription.FYtjSf), i, (java.lang.Integer) null, 0, 0, 28, (java.lang.Object) null);
    }

    public static /* synthetic */ void toastWithSuccessfulIcon$default(int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        copydefault(i, i2);
    }

    public static final void copydefault(int i, int i2) {
        android.content.Context contextCopydefault = C55328xhq.OLrzqt.copydefault();
        toast$default(contextCopydefault.getString(i), ContextCompat.getDrawable(contextCopydefault, C52761wXj.TaskDescription.FYtjSf), i2, (java.lang.Integer) null, 0, 0, 28, (java.lang.Object) null);
    }

    public static /* synthetic */ void toastWithFailedIcon$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        copydefault(str, i);
    }

    public static final void copydefault(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        toast$default(str, ContextCompat.getDrawable(C55328xhq.OLrzqt.copydefault(), C52761wXj.TaskDescription.dPkBzA), i, (java.lang.Integer) null, 0, 0, 28, (java.lang.Object) null);
    }

    public static /* synthetic */ void toastWithFailedIcon$default(int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        KWHzl(i, i2);
    }

    public static final void KWHzl(int i, int i2) {
        android.content.Context contextCopydefault = C55328xhq.OLrzqt.copydefault();
        toast$default(contextCopydefault.getString(i), ContextCompat.getDrawable(contextCopydefault, C52761wXj.TaskDescription.dPkBzA), i2, (java.lang.Integer) null, 0, 0, 28, (java.lang.Object) null);
    }
}
