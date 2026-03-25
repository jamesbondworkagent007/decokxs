package o;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public class OM implements OG {
    @Override // o.OG
    public void AEQbTJ() {
    }

    @Override // o.OG
    public void KWHzl(int i) {
    }

    @Override // o.OG
    public void copydefault(android.graphics.Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // o.OG
    public android.graphics.Bitmap copydefault(int i, int i2, Bitmap.Config config) {
        return android.graphics.Bitmap.createBitmap(i, i2, config);
    }

    @Override // o.OG
    public android.graphics.Bitmap KWHzl(int i, int i2, Bitmap.Config config) {
        return copydefault(i, i2, config);
    }
}
