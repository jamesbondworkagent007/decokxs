package o;

/* JADX INFO: renamed from: o.Qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5398Qe implements OC<android.graphics.Bitmap>, InterfaceC5364Ow {
    public final OG AEQbTJ;
    public final android.graphics.Bitmap OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/lang/Object; */
    @Override // o.OC
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.graphics.Bitmap AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.OC
    public java.lang.Class<android.graphics.Bitmap> copydefault() {
        return android.graphics.Bitmap.class;
    }

    public static C5398Qe copydefault(@androidx.annotation.Nullable android.graphics.Bitmap bitmap, @androidx.annotation.NonNull OG og) {
        if (bitmap == null) {
            return null;
        }
        return new C5398Qe(bitmap, og);
    }

    public C5398Qe(@androidx.annotation.NonNull android.graphics.Bitmap bitmap, @androidx.annotation.NonNull OG og) {
        this.OLrzqt = (android.graphics.Bitmap) SE.copydefault(bitmap, "Bitmap must not be null");
        this.AEQbTJ = (OG) SE.copydefault(og, "BitmapPool must not be null");
    }

    @Override // o.OC
    public int EZpvd() {
        return SI.KWHzl(this.OLrzqt);
    }

    @Override // o.OC
    public void djBIcL() {
        this.AEQbTJ.copydefault(this.OLrzqt);
    }

    @Override // o.InterfaceC5364Ow
    public void KWHzl() {
        this.OLrzqt.prepareToDraw();
    }
}
