package o;

/* JADX INFO: renamed from: o.mxP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33486mxP {
    public static byte[] OLrzqt(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        AEQbTJ(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int AEQbTJ(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        long jKWHzl = KWHzl(inputStream, outputStream);
        if (jKWHzl > 2147483647L) {
            return -1;
        }
        return (int) jKWHzl;
    }

    public static long KWHzl(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        return KWHzl(inputStream, outputStream, new byte[4096]);
    }

    public static long KWHzl(java.io.InputStream inputStream, java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        long j = 0;
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (-1 == i) {
                    break;
                }
                outputStream.write(bArr, 0, i);
                j += (long) i;
            } catch (java.lang.OutOfMemoryError e) {
                pUU.AEQbTJ("IOUtils", e);
            }
        }
        return j;
    }

    public static void AEQbTJ(java.io.InputStream inputStream) {
        if (inputStream != null) {
            AEQbTJ((java.io.Closeable) inputStream);
        }
    }

    public static void AEQbTJ(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static java.lang.String EZpvd(android.content.Context context, java.lang.String str) {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(context.getAssets().open(str), com.google.android.exoplayer2.C.UTF8_NAME));
            while (true) {
                java.lang.String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                } else {
                    bufferedReader.close();
                    return sb.toString();
                }
            }
        } catch (java.io.IOException e) {
            pUU.AEQbTJ("tag", e);
            return null;
        }
    }

    public static boolean AEQbTJ(java.io.InputStream inputStream, java.io.File file) throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream;
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new java.io.FileOutputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i <= 0) {
                            fileOutputStream.flush();
                            AEQbTJ(inputStream);
                            AEQbTJ(fileOutputStream);
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } catch (java.io.IOException e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    pUU.AEQbTJ("tag", e);
                    AEQbTJ(inputStream);
                    AEQbTJ(fileOutputStream2);
                    return false;
                } catch (java.lang.Throwable th) {
                    th = th;
                    AEQbTJ(inputStream);
                    AEQbTJ(fileOutputStream);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (java.io.IOException e2) {
            e = e2;
        }
    }
}
