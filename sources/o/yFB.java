package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yFB {
    public static /* synthetic */ java.io.ByteArrayInputStream byteInputStream$default(java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return new java.io.ByteArrayInputStream(bytes);
    }

    public static /* synthetic */ java.io.BufferedInputStream buffered$default(java.io.InputStream inputStream, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(inputStream, "");
        return inputStream instanceof java.io.BufferedInputStream ? (java.io.BufferedInputStream) inputStream : new java.io.BufferedInputStream(inputStream, i);
    }

    public static /* synthetic */ java.io.InputStreamReader reader$default(java.io.InputStream inputStream, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(inputStream, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new java.io.InputStreamReader(inputStream, charset);
    }

    public static /* synthetic */ java.io.BufferedReader bufferedReader$default(java.io.InputStream inputStream, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(inputStream, "");
        Intrinsics.checkNotNullParameter(charset, "");
        java.io.Reader inputStreamReader = new java.io.InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
    }

    public static /* synthetic */ java.io.BufferedOutputStream buffered$default(java.io.OutputStream outputStream, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(outputStream, "");
        return outputStream instanceof java.io.BufferedOutputStream ? (java.io.BufferedOutputStream) outputStream : new java.io.BufferedOutputStream(outputStream, i);
    }

    public static /* synthetic */ java.io.OutputStreamWriter writer$default(java.io.OutputStream outputStream, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(outputStream, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new java.io.OutputStreamWriter(outputStream, charset);
    }

    public static /* synthetic */ java.io.BufferedWriter bufferedWriter$default(java.io.OutputStream outputStream, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(outputStream, "");
        Intrinsics.checkNotNullParameter(charset, "");
        java.io.Writer outputStreamWriter = new java.io.OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) outputStreamWriter : new java.io.BufferedWriter(outputStreamWriter, 8192);
    }

    public static /* synthetic */ long copyTo$default(java.io.InputStream inputStream, java.io.OutputStream outputStream, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return copydefault(inputStream, outputStream, i);
    }

    public static final long copydefault(@NotNull java.io.InputStream inputStream, @NotNull java.io.OutputStream outputStream, int i) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(inputStream, "");
        Intrinsics.checkNotNullParameter(outputStream, "");
        byte[] bArr = new byte[i];
        int i2 = inputStream.read(bArr);
        long j = 0;
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            j += (long) i2;
            i2 = inputStream.read(bArr);
        }
        return j;
    }

    public static /* synthetic */ byte[] readBytes$default(java.io.InputStream inputStream, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return KWHzl(inputStream, i);
    }

    public static final byte[] KWHzl(@NotNull java.io.InputStream inputStream, int i) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(java.lang.Math.max(i, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "");
        return byteArray;
    }

    public static final byte[] KWHzl(@NotNull java.io.InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(java.lang.Math.max(8192, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "");
        return byteArray;
    }
}
