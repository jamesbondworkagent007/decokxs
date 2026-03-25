package o;

/* JADX INFO: loaded from: classes2.dex */
public final class QS extends QL<android.graphics.drawable.Drawable> {
    @Override // o.OC
    public void djBIcL() {
    }

    public static OC<android.graphics.drawable.Drawable> KWHzl(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            return new QS(drawable);
        }
        return null;
    }

    public QS(android.graphics.drawable.Drawable drawable) {
        super(drawable);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<android.graphics.drawable.Drawable> */
    @Override // o.OC
    public java.lang.Class<android.graphics.drawable.Drawable> copydefault() {
        return this.EZpvd.getClass();
    }

    @Override // o.OC
    public int EZpvd() {
        return java.lang.Math.max(1, this.EZpvd.getIntrinsicWidth() * this.EZpvd.getIntrinsicHeight() * 4);
    }
}
