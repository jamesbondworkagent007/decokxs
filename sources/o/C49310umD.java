package o;

/* JADX INFO: renamed from: o.umD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49310umD {
    public android.content.Context AEQbTJ;
    public android.graphics.Bitmap KWHzl;
    public C49314umH copydefault;
    public C49316umJ gEmmrt;
    public boolean OLrzqt = false;
    public java.util.List<C49316umJ> valueOf = new java.util.ArrayList();
    public java.util.List<C49314umH> EZpvd = new java.util.ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C49310umD EZpvd(@androidx.annotation.NonNull C49316umJ c49316umJ) {
        this.gEmmrt = c49316umJ;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C49310umD EZpvd(boolean z) {
        this.OLrzqt = z;
        return this;
    }

    public C49310umD(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull android.graphics.Bitmap bitmap) {
        this.AEQbTJ = context;
        this.KWHzl = bitmap;
    }

    public static C49310umD AEQbTJ(android.content.Context context, android.graphics.Bitmap bitmap) {
        return new C49310umD(context, bitmap);
    }

    public C49311umE EZpvd() {
        return new C49311umE(this.AEQbTJ, this.KWHzl, this.copydefault, this.EZpvd, this.gEmmrt, this.valueOf, this.OLrzqt);
    }
}
