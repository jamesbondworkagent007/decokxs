package o;

/* JADX INFO: loaded from: classes2.dex */
public final class QD implements NL<android.graphics.Bitmap, android.graphics.Bitmap> {
    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/NM;)Z */
    @Override // o.NL
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@androidx.annotation.NonNull android.graphics.Bitmap bitmap, @androidx.annotation.NonNull NM nm) {
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;IILo/NM;)Lo/OC; */
    @Override // o.NL
    public OC<android.graphics.Bitmap> copydefault(@androidx.annotation.NonNull android.graphics.Bitmap bitmap, int i, int i2, @androidx.annotation.NonNull NM nm) {
        return new ActionBar(bitmap);
    }

    public static final class ActionBar implements OC<android.graphics.Bitmap> {
        public final android.graphics.Bitmap KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/lang/Object; */
        @Override // o.OC
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public android.graphics.Bitmap AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.OC
        public java.lang.Class<android.graphics.Bitmap> copydefault() {
            return android.graphics.Bitmap.class;
        }

        @Override // o.OC
        public void djBIcL() {
        }

        public ActionBar(@androidx.annotation.NonNull android.graphics.Bitmap bitmap) {
            this.KWHzl = bitmap;
        }

        @Override // o.OC
        public int EZpvd() {
            return SI.KWHzl(this.KWHzl);
        }
    }
}
