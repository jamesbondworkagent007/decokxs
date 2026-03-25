package o;

/* JADX INFO: loaded from: classes2.dex */
public class PC implements NI<java.io.InputStream> {
    public final OF copydefault;

    public PC(OF of) {
        this.copydefault = of;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/io/File;Lo/NM;)Z */
    @Override // o.NI
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean KWHzl(@androidx.annotation.NonNull java.io.InputStream inputStream, @androidx.annotation.NonNull java.io.File file, @androidx.annotation.NonNull NM nm) throws java.lang.Throwable {
        byte[] bArr = (byte[]) this.copydefault.EZpvd(65536, byte[].class);
        java.io.FileOutputStream fileOutputStream = null;
        try {
            java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i);
                } catch (java.io.IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                    this.copydefault.EZpvd(bArr);
                    return false;
                } catch (java.lang.Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    this.copydefault.EZpvd(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (java.io.IOException unused4) {
            }
            this.copydefault.EZpvd(bArr);
            return true;
        } catch (java.io.IOException unused5) {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
