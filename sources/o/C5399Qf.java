package o;

/* JADX INFO: renamed from: o.Qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5399Qf implements NL<java.nio.ByteBuffer, android.graphics.Bitmap> {
    public final C5403Qj OLrzqt;

    public C5399Qf(C5403Qj c5403Qj) {
        this.OLrzqt = c5403Qj;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/NM;)Z */
    @Override // o.NL
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer, @androidx.annotation.NonNull NM nm) {
        return this.OLrzqt.copydefault(byteBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;IILo/NM;)Lo/OC; */
    @Override // o.NL
    public OC<android.graphics.Bitmap> copydefault(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer, int i, int i2, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        return this.OLrzqt.EZpvd(byteBuffer, i, i2, nm);
    }
}
