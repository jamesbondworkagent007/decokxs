package o;

import com.okinc.crcore.coreapi.service.IMarketApiService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sFn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44160sFn {
    public static final java.io.File EZpvd(@NotNull android.net.Uri uri, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String strKWHzl = C44163sFq.OLrzqt.KWHzl(context, uri, true);
        if (strKWHzl == null) {
            return null;
        }
        if (strKWHzl.length() <= 0) {
            strKWHzl = null;
        }
        if (strKWHzl != null) {
            return new java.io.File(strKWHzl);
        }
        return null;
    }

    public static final java.lang.String EZpvd(@NotNull java.io.File file) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(file, "");
        byte[] byteArray = new byte[0];
        if (file.exists()) {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(2048);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
                byteArrayOutputStream.flush();
            }
            byteArrayOutputStream.close();
            fileInputStream.close();
            byteArray = byteArrayOutputStream.toByteArray();
        }
        byte[] bArrEncode = android.util.Base64.encode(byteArray, 2);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "");
        return new java.lang.String(bArrEncode, Charsets.UTF_8);
    }

    public static final java.lang.String copydefault(int i) {
        if (i <= 0) {
            return "0:00";
        }
        int i2 = i / 60;
        if (i2 < 60) {
            return i2 + ":" + StringsKt__StringsKt.copydefault(java.lang.String.valueOf(i % 60), 2, '0');
        }
        int i3 = i2 / 60;
        if (i3 > 9) {
            return "9:59:59";
        }
        int i4 = i2 % 60;
        return i3 + ":" + StringsKt__StringsKt.copydefault(java.lang.String.valueOf(i4), 2, '0') + ":" + StringsKt__StringsKt.copydefault(java.lang.String.valueOf((i - (i3 * IMarketApiService.SIXTY_MINUTES)) - (i4 * 60)), 2, '0');
    }
}
