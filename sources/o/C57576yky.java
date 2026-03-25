package o;

import java.util.zip.InflaterInputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yky, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57576yky {
    public static android.os.HandlerThread EZpvd;
    public static final C57576yky AEQbTJ = new C57576yky();
    public static final int copydefault = 8;

    private C57576yky() {
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.lang.String AEQbTJ(byte[] bArr) {
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        try {
            InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream, new java.util.zip.Inflater(true));
            try {
                byte[] bArr2 = new byte[1024];
                try {
                    java.lang.String str = new java.lang.String(bArr2, 0, inflaterInputStream.read(bArr2), Charsets.UTF_8);
                    yFA.copydefault(inflaterInputStream, null);
                    yFA.copydefault(byteArrayInputStream, null);
                    return str;
                } catch (java.lang.Exception e) {
                    pUU.copydefault("WsUtils", "decompress error:" + e.getMessage());
                    yFA.copydefault(inflaterInputStream, null);
                    yFA.copydefault(byteArrayInputStream, null);
                    return "";
                }
            } finally {
            }
        } finally {
        }
    }

    public final <T> int OLrzqt(@NotNull java.util.ArrayList<? extends java.lang.Comparable<? super T>> arrayList, T t) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            java.lang.Comparable<? super T> comparable = arrayList.get(i2);
            Intrinsics.checkNotNullExpressionValue(comparable, "");
            int iCompareTo = comparable.compareTo(t);
            if (iCompareTo < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public final android.os.Looper EZpvd() {
        android.os.Looper looper;
        if (EZpvd == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("wsWorkThread");
            EZpvd = handlerThread;
            Intrinsics.copydefault(handlerThread);
            handlerThread.start();
        }
        android.os.HandlerThread handlerThread2 = EZpvd;
        if (handlerThread2 != null && (looper = handlerThread2.getLooper()) != null) {
            return looper;
        }
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        Intrinsics.checkNotNullExpressionValue(mainLooper, "");
        return mainLooper;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("channel@" + str);
        for (java.lang.String str2 : strArr) {
            if (str2 != null && C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
                sb.append("?" + str2);
            }
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
