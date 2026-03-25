package o;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: o.Rg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5426Rg implements InterfaceC5429Rj<android.graphics.Bitmap, BitmapDrawable> {
    public final android.content.res.Resources EZpvd;

    public C5426Rg(@androidx.annotation.NonNull android.content.res.Resources resources) {
        this.EZpvd = (android.content.res.Resources) SE.OLrzqt(resources);
    }

    @Override // o.InterfaceC5429Rj
    public OC<BitmapDrawable> KWHzl(@androidx.annotation.NonNull OC<android.graphics.Bitmap> oc, @androidx.annotation.NonNull NM nm) {
        return C5418Qy.copydefault(this.EZpvd, oc);
    }
}
