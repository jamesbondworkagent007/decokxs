package o;

import java.nio.charset.CodingErrorAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yFI extends yFF {
    public static /* synthetic */ java.io.InputStreamReader reader$default(java.io.File file, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
    }

    public static /* synthetic */ java.io.BufferedReader bufferedReader$default(java.io.File file, java.nio.charset.Charset charset, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
        return inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, i);
    }

    public static /* synthetic */ java.io.OutputStreamWriter writer$default(java.io.File file, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset);
    }

    public static /* synthetic */ java.io.BufferedWriter bufferedWriter$default(java.io.File file, java.nio.charset.Charset charset, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        java.io.Writer outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset);
        return outputStreamWriter instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) outputStreamWriter : new java.io.BufferedWriter(outputStreamWriter, i);
    }

    public static /* synthetic */ java.io.PrintWriter printWriter$default(java.io.File file, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        java.io.Writer outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset);
        return new java.io.PrintWriter(outputStreamWriter instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) outputStreamWriter : new java.io.BufferedWriter(outputStreamWriter, 8192));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yFB.copyTo$default(java.io.InputStream, java.io.OutputStream, int, int, java.lang.Object):long */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static byte[] AhwBna(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new java.lang.OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopydefault = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopydefault, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopydefault = java.util.Arrays.copyOf(bArrCopydefault, i3);
                Intrinsics.checkNotNullExpressionValue(bArrCopydefault, "");
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    C56454yFz c56454yFz = new C56454yFz(8193);
                    c56454yFz.write(i5);
                    yFB.copyTo$default(fileInputStream, c56454yFz, 0, 2, null);
                    int size = c56454yFz.size() + i;
                    if (size < 0) {
                        throw new java.lang.OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrEZpvd = c56454yFz.EZpvd();
                    byte[] bArrCopyOf = java.util.Arrays.copyOf(bArrCopydefault, size);
                    Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
                    bArrCopydefault = yDT.copydefault(bArrEZpvd, bArrCopyOf, i, 0, c56454yFz.size());
                }
            }
            yFA.copydefault(fileInputStream, null);
            return bArrCopydefault;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                yFA.copydefault(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static void copydefault(@NotNull java.io.File file, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            Unit unit = Unit.INSTANCE;
            yFA.copydefault(fileOutputStream, null);
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static java.lang.String EZpvd(@NotNull java.io.File file, @NotNull java.nio.charset.Charset charset) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
        try {
            java.lang.String strAEQbTJ = yFK.AEQbTJ(inputStreamReader);
            yFA.copydefault(inputStreamReader, null);
            return strAEQbTJ;
        } finally {
        }
    }

    public static /* synthetic */ java.lang.String readText$default(java.io.File file, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return EZpvd(file, charset);
    }

    public static /* synthetic */ void writeText$default(java.io.File file, java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        EZpvd(file, str, charset);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static void EZpvd(@NotNull java.io.File file, @NotNull java.lang.String str, @NotNull java.nio.charset.Charset charset) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        try {
            EZpvd(fileOutputStream, str, charset);
            Unit unit = Unit.INSTANCE;
            yFA.copydefault(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void appendText$default(java.io.File file, java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        OLrzqt(file, str, charset);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final void OLrzqt(@NotNull java.io.File file, @NotNull java.lang.String str, @NotNull java.nio.charset.Charset charset) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file, true);
        try {
            EZpvd(fileOutputStream, str, charset);
            Unit unit = Unit.INSTANCE;
            yFA.copydefault(fileOutputStream, null);
        } finally {
        }
    }

    public static void EZpvd(@NotNull java.io.OutputStream outputStream, @NotNull java.lang.String str, @NotNull java.nio.charset.Charset charset) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(outputStream, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            outputStream.write(bytes);
            return;
        }
        java.nio.charset.CharsetEncoder charsetEncoderAEQbTJ = AEQbTJ(charset);
        java.nio.CharBuffer charBufferAllocate = java.nio.CharBuffer.allocate(8192);
        Intrinsics.copydefault(charsetEncoderAEQbTJ);
        java.nio.ByteBuffer byteBufferCopydefault = copydefault(8192, charsetEncoderAEQbTJ);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = java.lang.Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            Intrinsics.checkNotNullExpressionValue(cArrArray, "");
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderAEQbTJ.encode(charBufferAllocate, byteBufferCopydefault, i3 == str.length()).isUnderflow()) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferCopydefault.array(), 0, byteBufferCopydefault.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferCopydefault.clear();
            i = i3;
        }
    }

    public static java.nio.charset.CharsetEncoder AEQbTJ(@NotNull java.nio.charset.Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "");
        java.nio.charset.CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static java.nio.ByteBuffer copydefault(int i, @NotNull java.nio.charset.CharsetEncoder charsetEncoder) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "");
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(i * ((int) java.lang.Math.ceil(charsetEncoder.maxBytesPerChar())));
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "");
        return byteBufferAllocate;
    }

    public static /* synthetic */ void forEachLine$default(java.io.File file, java.nio.charset.Charset charset, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        copydefault(file, charset, function1);
    }

    public static final void copydefault(@NotNull java.io.File file, @NotNull java.nio.charset.Charset charset, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(function1, "");
        yFK.AEQbTJ(new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file), charset)), function1);
    }

    public static /* synthetic */ java.util.List readLines$default(java.io.File file, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return copydefault(file, charset);
    }

    public static final java.util.List<java.lang.String> copydefault(@NotNull java.io.File file, @NotNull java.nio.charset.Charset charset) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        copydefault(file, charset, new Function1() { // from class: o.yFG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return yFI.AEQbTJ(arrayList, (java.lang.String) obj);
            }
        });
        return arrayList;
    }

    public static final Unit AEQbTJ(java.util.ArrayList arrayList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        arrayList.add(str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static /* synthetic */ java.lang.Object useLines$default(java.io.File file, java.nio.charset.Charset charset, Function1 function1, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(file), charset);
        java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
        try {
            java.lang.Object objInvoke = function1.invoke(yFK.KWHzl(bufferedReader));
            C56518yIi.KWHzl(1);
            if (C56452yFx.OLrzqt(1, 1, 0)) {
                yFA.copydefault(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            C56518yIi.copydefault(1);
            return objInvoke;
        } finally {
        }
    }
}
