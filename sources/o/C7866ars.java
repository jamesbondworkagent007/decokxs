package o;

/* JADX INFO: renamed from: o.ars, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7866ars {
    public static void AEQbTJ(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static byte[] AEQbTJ(java.io.InputStream inputStream) {
        byte[] bArr = new byte[8192];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    AEQbTJ(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (java.lang.Exception unused) {
                AEQbTJ(byteArrayOutputStream);
                return null;
            } catch (java.lang.Throwable th) {
                AEQbTJ(byteArrayOutputStream);
                throw th;
            }
        }
    }

    public static byte[] EZpvd(java.io.InputStream inputStream, int i) {
        if (i > 0) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                try {
                    int i3 = inputStream.read(bArr, i2, i - i2);
                    if (i3 == -1) {
                        break;
                    }
                    i2 += i3;
                } catch (java.io.IOException e) {
                    pUU.copydefault("mln", android.util.Log.getStackTraceString(e));
                }
            }
            if (i2 != i) {
                return null;
            }
            return bArr;
        }
        return AEQbTJ(inputStream);
    }
}
