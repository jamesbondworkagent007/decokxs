package o;

/* JADX INFO: renamed from: o.Nx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5339Nx {
    public static final java.nio.charset.Charset AEQbTJ = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ASCII_NAME);
    public static final java.nio.charset.Charset KWHzl = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME);

    private C5339Nx() {
    }

    public static void copydefault(java.io.File file) throws java.io.IOException {
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new java.io.IOException("not a readable directory: " + file);
        }
        for (java.io.File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                copydefault(file2);
            }
            if (!file2.delete()) {
                throw new java.io.IOException("failed to delete file: " + file2);
            }
        }
    }

    public static void KWHzl(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
