package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yFK {
    public static /* synthetic */ java.io.BufferedReader buffered$default(java.io.Reader reader, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(reader, "");
        return reader instanceof java.io.BufferedReader ? (java.io.BufferedReader) reader : new java.io.BufferedReader(reader, i);
    }

    public static /* synthetic */ java.io.BufferedWriter buffered$default(java.io.Writer writer, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(writer, "");
        return writer instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) writer : new java.io.BufferedWriter(writer, i);
    }

    public static final java.util.List<java.lang.String> OLrzqt(@NotNull java.io.Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        AEQbTJ(reader, new Function1() { // from class: o.yFR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return yFK.copydefault(arrayList, (java.lang.String) obj);
            }
        });
        return arrayList;
    }

    public static final Unit copydefault(java.util.ArrayList arrayList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        arrayList.add(str);
        return Unit.INSTANCE;
    }

    public static final Sequence<java.lang.String> KWHzl(@NotNull java.io.BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "");
        return C59405zgS.fARcdN(new yFM(bufferedReader));
    }

    public static final java.lang.String AEQbTJ(@NotNull java.io.Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        copyTo$default(reader, stringWriter, 0, 2, null);
        java.lang.String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ long copyTo$default(java.io.Reader reader, java.io.Writer writer, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return copydefault(reader, writer, i);
    }

    public static final long copydefault(@NotNull java.io.Reader reader, @NotNull java.io.Writer writer, int i) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(reader, "");
        Intrinsics.checkNotNullParameter(writer, "");
        char[] cArr = new char[i];
        int i2 = reader.read(cArr);
        long j = 0;
        while (i2 >= 0) {
            writer.write(cArr, 0, i2);
            j += (long) i2;
            i2 = reader.read(cArr);
        }
        return j;
    }

    public static /* synthetic */ java.lang.String readText$default(java.net.URL url, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(url, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new java.lang.String(AEQbTJ(url), charset);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final byte[] AEQbTJ(@NotNull java.net.URL url) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(url, "");
        java.io.InputStream inputStreamOpenStream = url.openStream();
        try {
            Intrinsics.copydefault(inputStreamOpenStream);
            byte[] bArrKWHzl = yFB.KWHzl(inputStreamOpenStream);
            yFA.copydefault(inputStreamOpenStream, null);
            return bArrKWHzl;
        } finally {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final void AEQbTJ(@NotNull java.io.Reader reader, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(reader, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.io.BufferedReader bufferedReader = reader instanceof java.io.BufferedReader ? (java.io.BufferedReader) reader : new java.io.BufferedReader(reader, 8192);
        try {
            java.util.Iterator<java.lang.String> it = KWHzl(bufferedReader).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            Unit unit = Unit.INSTANCE;
            yFA.copydefault(bufferedReader, null);
        } finally {
        }
    }
}
