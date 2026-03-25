package o;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: o.Rh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5427Rh implements InterfaceC5429Rj<android.graphics.drawable.Drawable, byte[]> {
    public final InterfaceC5429Rj<android.graphics.Bitmap, byte[]> AEQbTJ;
    public final InterfaceC5429Rj<QX, byte[]> KWHzl;
    public final OG OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.OC<android.graphics.drawable.Drawable> */
    /* JADX WARN: Multi-variable type inference failed */
    public static OC<QX> OLrzqt(@androidx.annotation.NonNull OC<android.graphics.drawable.Drawable> oc) {
        return oc;
    }

    public C5427Rh(@androidx.annotation.NonNull OG og, @androidx.annotation.NonNull InterfaceC5429Rj<android.graphics.Bitmap, byte[]> interfaceC5429Rj, @androidx.annotation.NonNull InterfaceC5429Rj<QX, byte[]> interfaceC5429Rj2) {
        this.OLrzqt = og;
        this.AEQbTJ = interfaceC5429Rj;
        this.KWHzl = interfaceC5429Rj2;
    }

    @Override // o.InterfaceC5429Rj
    public OC<byte[]> KWHzl(@androidx.annotation.NonNull OC<android.graphics.drawable.Drawable> oc, @androidx.annotation.NonNull NM nm) {
        android.graphics.drawable.Drawable drawableAEQbTJ = oc.AEQbTJ();
        if (drawableAEQbTJ instanceof BitmapDrawable) {
            return this.AEQbTJ.KWHzl(C5398Qe.copydefault(((BitmapDrawable) drawableAEQbTJ).getBitmap(), this.OLrzqt), nm);
        }
        if (drawableAEQbTJ instanceof QX) {
            return this.KWHzl.KWHzl(OLrzqt(oc), nm);
        }
        return null;
    }
}
