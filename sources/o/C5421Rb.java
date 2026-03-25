package o;

import com.bumptech.glide.load.ImageHeaderParser;

/* JADX INFO: renamed from: o.Rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5421Rb implements NL<java.io.InputStream, QX> {
    public final NL<java.nio.ByteBuffer, QX> EZpvd;
    public final OF KWHzl;
    public final java.util.List<ImageHeaderParser> OLrzqt;

    public C5421Rb(java.util.List<ImageHeaderParser> list, NL<java.nio.ByteBuffer, QX> nl, OF of) {
        this.OLrzqt = list;
        this.EZpvd = nl;
        this.KWHzl = of;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/NM;)Z */
    @Override // o.NL
    public boolean copydefault(@androidx.annotation.NonNull java.io.InputStream inputStream, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        return !((java.lang.Boolean) nm.OLrzqt(C5424Re.KWHzl)).booleanValue() && NK.EZpvd(this.OLrzqt, inputStream, this.KWHzl) == ImageHeaderParser.ImageType.GIF;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;IILo/NM;)Lo/OC; */
    @Override // o.NL
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public OC<QX> copydefault(@androidx.annotation.NonNull java.io.InputStream inputStream, int i, int i2, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        byte[] bArrKWHzl = KWHzl(inputStream);
        if (bArrKWHzl == null) {
            return null;
        }
        return this.EZpvd.copydefault(java.nio.ByteBuffer.wrap(bArrKWHzl), i, i2, nm);
    }

    public static byte[] KWHzl(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }
}
