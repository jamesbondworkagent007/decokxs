package o;

import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public class yGB {
    public static /* synthetic */ java.io.InputStreamReader reader$default(java.nio.file.Path path, java.nio.charset.Charset charset, OpenOption[] openOptionArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(openOptionArr, "");
        return new java.io.InputStreamReader(Files.newInputStream(path, (OpenOption[]) java.util.Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    public static /* synthetic */ java.io.BufferedReader bufferedReader$default(java.nio.file.Path path, java.nio.charset.Charset charset, int i, OpenOption[] openOptionArr, int i2, java.lang.Object obj) throws java.io.IOException {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(openOptionArr, "");
        return new java.io.BufferedReader(new java.io.InputStreamReader(Files.newInputStream(path, (OpenOption[]) java.util.Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    public static /* synthetic */ java.io.OutputStreamWriter writer$default(java.nio.file.Path path, java.nio.charset.Charset charset, OpenOption[] openOptionArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(openOptionArr, "");
        return new java.io.OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) java.util.Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    public static /* synthetic */ java.io.BufferedWriter bufferedWriter$default(java.nio.file.Path path, java.nio.charset.Charset charset, int i, OpenOption[] openOptionArr, int i2, java.lang.Object obj) throws java.io.IOException {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(openOptionArr, "");
        return new java.io.BufferedWriter(new java.io.OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) java.util.Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    public static /* synthetic */ java.lang.String readText$default(java.nio.file.Path path, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return eM_(path, charset);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final java.lang.String eM_(@NotNull java.nio.file.Path path, @NotNull java.nio.charset.Charset charset) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(charset, "");
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(Files.newInputStream(path, (OpenOption[]) java.util.Arrays.copyOf(new OpenOption[0], 0)), charset);
        try {
            java.lang.String strAEQbTJ = yFK.AEQbTJ(inputStreamReader);
            yFA.copydefault(inputStreamReader, null);
            return strAEQbTJ;
        } finally {
        }
    }

    public static /* synthetic */ void writeText$default(java.nio.file.Path path, java.lang.CharSequence charSequence, java.nio.charset.Charset charset, OpenOption[] openOptionArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        eN_(path, charSequence, charset, openOptionArr);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final void eN_(@NotNull java.nio.file.Path path, @NotNull java.lang.CharSequence charSequence, @NotNull java.nio.charset.Charset charset, @NotNull OpenOption... openOptionArr) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(openOptionArr, "");
        java.io.OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) java.util.Arrays.copyOf(openOptionArr, openOptionArr.length));
        try {
            if (charSequence instanceof java.lang.String) {
                Intrinsics.copydefault(outputStreamNewOutputStream);
                yFI.EZpvd(outputStreamNewOutputStream, (java.lang.String) charSequence, charset);
            } else {
                java.nio.charset.CharsetEncoder charsetEncoderAEQbTJ = yFI.AEQbTJ(charset);
                java.nio.CharBuffer charBufferAsReadOnlyBuffer = charSequence instanceof java.nio.CharBuffer ? ((java.nio.CharBuffer) charSequence).asReadOnlyBuffer() : java.nio.CharBuffer.wrap(charSequence);
                int iMin = java.lang.Math.min(charSequence.length(), 8192);
                Intrinsics.copydefault(charsetEncoderAEQbTJ);
                java.nio.ByteBuffer byteBufferCopydefault = yFI.copydefault(iMin, charsetEncoderAEQbTJ);
                while (charBufferAsReadOnlyBuffer.hasRemaining()) {
                    if (!(true ^ charsetEncoderAEQbTJ.encode(charBufferAsReadOnlyBuffer, byteBufferCopydefault, true).isError())) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    outputStreamNewOutputStream.write(byteBufferCopydefault.array(), 0, byteBufferCopydefault.position());
                    byteBufferCopydefault.clear();
                }
            }
            Unit unit = Unit.INSTANCE;
            yFA.copydefault(outputStreamNewOutputStream, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                yFA.copydefault(outputStreamNewOutputStream, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void appendText$default(java.nio.file.Path path, java.lang.CharSequence charSequence, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        eL_(path, charSequence, charset);
    }

    public static final void eL_(@NotNull java.nio.file.Path path, @NotNull java.lang.CharSequence charSequence, @NotNull java.nio.charset.Charset charset) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charset, "");
        eN_(path, charSequence, charset, StandardOpenOption.APPEND);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static /* synthetic */ void forEachLine$default(java.nio.file.Path path, java.nio.charset.Charset charset, Function1 function1, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.io.BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        Intrinsics.checkNotNullExpressionValue(bufferedReaderNewBufferedReader, "");
        try {
            java.util.Iterator<java.lang.String> it = yFK.KWHzl(bufferedReaderNewBufferedReader).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            Unit unit = Unit.INSTANCE;
            C56518yIi.KWHzl(1);
            if (C56452yFx.OLrzqt(1, 1, 0)) {
                yFA.copydefault(bufferedReaderNewBufferedReader, null);
            } else {
                bufferedReaderNewBufferedReader.close();
            }
            C56518yIi.copydefault(1);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                C56518yIi.KWHzl(1);
                if (C56452yFx.OLrzqt(1, 1, 0)) {
                    yFA.copydefault(bufferedReaderNewBufferedReader, th);
                } else {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                C56518yIi.copydefault(1);
                throw th2;
            }
        }
    }

    public static /* synthetic */ java.util.List readLines$default(java.nio.file.Path path, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(charset, "");
        java.util.List allLines = Files.readAllLines(path, charset);
        Intrinsics.checkNotNullExpressionValue(allLines, "");
        return allLines;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static /* synthetic */ java.lang.Object useLines$default(java.nio.file.Path path, java.nio.charset.Charset charset, Function1 function1, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.io.BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        try {
            Intrinsics.copydefault(bufferedReaderNewBufferedReader);
            java.lang.Object objInvoke = function1.invoke(yFK.KWHzl(bufferedReaderNewBufferedReader));
            C56518yIi.KWHzl(1);
            if (C56452yFx.OLrzqt(1, 1, 0)) {
                yFA.copydefault(bufferedReaderNewBufferedReader, null);
            } else if (bufferedReaderNewBufferedReader != null) {
                bufferedReaderNewBufferedReader.close();
            }
            C56518yIi.copydefault(1);
            return objInvoke;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                C56518yIi.KWHzl(1);
                if (C56452yFx.OLrzqt(1, 1, 0)) {
                    yFA.copydefault(bufferedReaderNewBufferedReader, th);
                } else if (bufferedReaderNewBufferedReader != null) {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                C56518yIi.copydefault(1);
                throw th2;
            }
        }
    }

    public static /* synthetic */ java.nio.file.Path writeLines$default(java.nio.file.Path path, java.lang.Iterable iterable, java.nio.charset.Charset charset, OpenOption[] openOptionArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(openOptionArr, "");
        java.nio.file.Path pathWrite = Files.write(path, iterable, charset, (OpenOption[]) java.util.Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(pathWrite, "");
        return pathWrite;
    }

    public static /* synthetic */ java.nio.file.Path writeLines$default(java.nio.file.Path path, Sequence sequence, java.nio.charset.Charset charset, OpenOption[] openOptionArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(openOptionArr, "");
        java.nio.file.Path pathWrite = Files.write(path, C59467zhb.getFieldNames(sequence), charset, (OpenOption[]) java.util.Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(pathWrite, "");
        return pathWrite;
    }

    public static /* synthetic */ java.nio.file.Path appendLines$default(java.nio.file.Path path, java.lang.Iterable iterable, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(charset, "");
        java.nio.file.Path pathWrite = Files.write(path, iterable, charset, StandardOpenOption.APPEND);
        Intrinsics.checkNotNullExpressionValue(pathWrite, "");
        return pathWrite;
    }

    public static /* synthetic */ java.nio.file.Path appendLines$default(java.nio.file.Path path, Sequence sequence, java.nio.charset.Charset charset, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(charset, "");
        java.nio.file.Path pathWrite = Files.write(path, C59467zhb.getFieldNames(sequence), charset, StandardOpenOption.APPEND);
        Intrinsics.checkNotNullExpressionValue(pathWrite, "");
        return pathWrite;
    }
}
