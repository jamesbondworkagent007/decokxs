package o;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.ylZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57604ylZ {
    public static final int EZpvd;
    public static final C57604ylZ OLrzqt = new C57604ylZ();
    public static android.widget.Toast copydefault;

    private C57604ylZ() {
    }

    static {
        WeakReference<android.widget.Toast> weakReferenceKWHzl = C55328xhq.OLrzqt.KWHzl();
        copydefault = weakReferenceKWHzl != null ? weakReferenceKWHzl.get() : null;
        EZpvd = 8;
    }

    public static /* synthetic */ android.widget.Toast show$default(C57604ylZ c57604ylZ, java.lang.Integer num, android.graphics.drawable.Drawable drawable, int i, java.lang.Integer num2, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            num = null;
        }
        if ((i4 & 2) != 0) {
            drawable = null;
        }
        if ((i4 & 4) != 0) {
            i = 0;
        }
        if ((i4 & 8) != 0) {
            num2 = null;
        }
        if ((i4 & 16) != 0) {
            i2 = 0;
        }
        if ((i4 & 32) != 0) {
            i3 = 0;
        }
        return c57604ylZ.copydefault(num, drawable, i, num2, i2, i3);
    }

    public final android.widget.Toast copydefault(java.lang.Integer num, android.graphics.drawable.Drawable drawable, int i, java.lang.Integer num2, int i2, int i3) {
        return C55328xhq.OLrzqt.KWHzl(num, drawable, i, num2, i2, i3);
    }

    public static /* synthetic */ android.widget.Toast show$default(C57604ylZ c57604ylZ, java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, int i, java.lang.Integer num, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            charSequence = null;
        }
        if ((i4 & 2) != 0) {
            drawable = null;
        }
        if ((i4 & 4) != 0) {
            i = 0;
        }
        if ((i4 & 8) != 0) {
            num = null;
        }
        if ((i4 & 16) != 0) {
            i2 = 0;
        }
        if ((i4 & 32) != 0) {
            i3 = 0;
        }
        return c57604ylZ.OLrzqt(charSequence, drawable, i, num, i2, i3);
    }

    public final android.widget.Toast OLrzqt(java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, int i, java.lang.Integer num, int i2, int i3) {
        return C55328xhq.OLrzqt.AEQbTJ(charSequence, drawable, i, num, i2, i3);
    }
}
