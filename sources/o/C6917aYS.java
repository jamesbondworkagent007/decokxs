package o;

import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.ByteString;
import retrofit2.Converter;

/* JADX INFO: renamed from: o.aYS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6917aYS<T> implements Converter<T, RequestBody> {
    public static final MediaType AEQbTJ = MediaType.parse("plain/text; charset=UTF-8");
    public static final java.nio.charset.Charset copydefault = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME);
    public final java.lang.reflect.Type KWHzl;

    public C6917aYS(java.lang.reflect.Type type) {
        this.KWHzl = type;
    }

    /* JADX DEBUG: Method merged with bridge method: convert(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // retrofit2.Converter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public RequestBody convert(T t) throws java.io.IOException {
        if (!(t instanceof InterfaceC6910aYL)) {
            return null;
        }
        return RequestBody.create(AEQbTJ, ByteString.of(KWHzl(((InterfaceC6910aYL) t).format())));
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0047: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:27:0x0047 */
    public static byte[] KWHzl(java.lang.String str) throws java.lang.Throwable {
        java.io.OutputStream outputStream;
        GZIPOutputStream gZIPOutputStream;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.OutputStream outputStream2 = null;
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (java.io.IOException e) {
                e = e;
                gZIPOutputStream = null;
            } catch (java.lang.Throwable th) {
                th = th;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (java.io.IOException e2) {
                        pUU.AEQbTJ("tag", e2);
                    }
                }
                throw th;
            }
            try {
                gZIPOutputStream.write(str.getBytes(copydefault));
                gZIPOutputStream.flush();
                try {
                    gZIPOutputStream.close();
                } catch (java.io.IOException e3) {
                    pUU.AEQbTJ("tag", e3);
                }
                return android.util.Base64.encode(byteArrayOutputStream.toByteArray(), 2);
            } catch (java.io.IOException e4) {
                e = e4;
                pUU.AEQbTJ("tag", e);
                if (gZIPOutputStream != null) {
                    try {
                        gZIPOutputStream.close();
                    } catch (java.io.IOException e5) {
                        pUU.AEQbTJ("tag", e5);
                    }
                }
                return null;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            outputStream2 = outputStream;
        }
    }
}
