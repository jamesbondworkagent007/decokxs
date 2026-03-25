package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ycj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57137ycj {
    public static final C57137ycj copydefault = new C57137ycj();

    private C57137ycj() {
    }

    public final java.lang.String KWHzl(@NotNull java.io.InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        java.io.BufferedReader bufferedReader = null;
        try {
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(inputStream, Charsets.UTF_8);
            bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
            java.lang.String strAEQbTJ = yFK.AEQbTJ(bufferedReader);
            try {
                bufferedReader.close();
            } catch (java.lang.Exception unused) {
            }
            return strAEQbTJ;
        } catch (java.lang.Exception unused2) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (java.lang.Exception unused3) {
                }
            }
            return "";
        } catch (java.lang.Throwable th) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (java.lang.Exception unused4) {
                }
            }
            throw th;
        }
    }

    public final byte[] EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listAYXKKw = C59454zhO.AYXKKw((java.lang.CharSequence) str, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAYXKKw, 10));
        java.util.Iterator it = listAYXKKw.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Byte.valueOf((byte) java.lang.Integer.parseInt((java.lang.String) it.next(), CharsKt__CharJVMKt.checkRadix(16))));
        }
        return CollectionsKt___CollectionsKt.DbNXlk(arrayList);
    }

    public static /* synthetic */ java.lang.String toHexString$default(C57137ycj c57137ycj, byte b, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c57137ycj.EZpvd(b, z);
    }

    public final java.lang.String EZpvd(byte b, boolean z) {
        if (z) {
            java.lang.String str = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }
        java.lang.String str2 = java.lang.String.format("%2x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str2).toString();
    }

    public final java.lang.String OLrzqt(int i) {
        return copydefault(new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i});
    }

    public final java.lang.String copydefault(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(toHexString$default(copydefault, b, false, 1, null));
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
