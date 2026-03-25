package o;

import java.util.zip.ZipFile;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mkH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32789mkH {
    public static final C32789mkH KWHzl = new C32789mkH();

    private C32789mkH() {
    }

    public final java.util.List<java.lang.String> AEQbTJ(@NotNull android.content.pm.ApplicationInfo applicationInfo) {
        Intrinsics.checkNotNullParameter(applicationInfo, "");
        try {
            ZipFile zipFile = new ZipFile(applicationInfo.publicSourceDir);
            java.io.InputStream inputStream = zipFile.getInputStream(zipFile.getEntry("AndroidManifest.xml"));
            Intrinsics.copydefault(inputStream);
            byte[] bArrKWHzl = KWHzl(inputStream);
            inputStream.close();
            zipFile.close();
            if (C32792mkK.KWHzl.AEQbTJ(bArrKWHzl)) {
                return C56402yEa.EZpvd("android.permission.WAKE_LOCK");
            }
            return yDY.AhwBna();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return yDY.AhwBna();
        }
    }

    public final byte[] KWHzl(@NotNull java.io.InputStream inputStream) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(inputStream, "");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[65535];
        int i = inputStream.read(bArr);
        while (i != -1) {
            byteArrayOutputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "");
        return byteArray;
    }
}
