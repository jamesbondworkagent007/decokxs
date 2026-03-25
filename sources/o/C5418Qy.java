package o;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: o.Qy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5418Qy implements OC<BitmapDrawable>, InterfaceC5364Ow {
    public final OC<android.graphics.Bitmap> KWHzl;
    public final android.content.res.Resources copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.OC
    public java.lang.Class<BitmapDrawable> copydefault() {
        return BitmapDrawable.class;
    }

    public static OC<BitmapDrawable> copydefault(@androidx.annotation.NonNull android.content.res.Resources resources, @androidx.annotation.Nullable OC<android.graphics.Bitmap> oc) {
        if (oc == null) {
            return null;
        }
        return new C5418Qy(resources, oc);
    }

    public C5418Qy(@androidx.annotation.NonNull android.content.res.Resources resources, @androidx.annotation.NonNull OC<android.graphics.Bitmap> oc) {
        this.copydefault = (android.content.res.Resources) SE.OLrzqt(resources);
        this.KWHzl = (OC) SE.OLrzqt(oc);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/lang/Object; */
    @Override // o.OC
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable AEQbTJ() {
        return new BitmapDrawable(this.copydefault, this.KWHzl.AEQbTJ());
    }

    @Override // o.OC
    public int EZpvd() {
        return this.KWHzl.EZpvd();
    }

    @Override // o.OC
    public void djBIcL() {
        this.KWHzl.djBIcL();
    }

    @Override // o.InterfaceC5364Ow
    public void KWHzl() {
        OC<android.graphics.Bitmap> oc = this.KWHzl;
        if (oc instanceof InterfaceC5364Ow) {
            ((InterfaceC5364Ow) oc).KWHzl();
        }
    }
}
