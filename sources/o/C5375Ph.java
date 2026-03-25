package o;

/* JADX INFO: renamed from: o.Ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5375Ph implements NI<java.nio.ByteBuffer> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/io/File;Lo/NM;)Z */
    @Override // o.NI
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean KWHzl(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer, @androidx.annotation.NonNull java.io.File file, @androidx.annotation.NonNull NM nm) throws java.lang.Throwable {
        try {
            C5466Su.AEQbTJ(byteBuffer, file);
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }
}
