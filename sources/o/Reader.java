package o;

import com.fasterxml.jackson.core.JsonPointer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Reader {
    public static final java.util.Set<java.lang.Character> EZpvd = yEE.AhwBna('!', '$', '%', '&', '\'', '*', '+', '-', '.', '^', '_', '`', '|', '~');

    public static /* synthetic */ PipedReader loadAwsUserAgentMetadataFromEnvironment$default(HL hl, PrintStream printStream, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return KWHzl(hl, printStream, str);
    }

    public static final PipedReader KWHzl(@NotNull HL hl, @NotNull PrintStream printStream, java.lang.String str) {
        Intrinsics.checkNotNullParameter(hl, "");
        Intrinsics.checkNotNullParameter(printStream, "");
        StringBufferInputStream stringBufferInputStream = new StringBufferInputStream("kotlin", printStream.EZpvd());
        HJ hjEZpvd = hl.EZpvd();
        RandomAccessFile randomAccessFile = new RandomAccessFile(hjEZpvd.KWHzl(), hjEZpvd.EZpvd());
        Serializable serializableEZpvd = PrintWriter.EZpvd();
        if (str == null && (str = hl.OLrzqt("aws.userAgentAppId")) == null) {
            str = hl.EZpvd("AWS_SDK_UA_APP_ID");
        }
        return new PipedReader(stringBufferInputStream, printStream, randomAccessFile, serializableEZpvd, OLrzqt(hl), PushbackReader.EZpvd.OLrzqt(hl), str, UTFDataFormatException.OLrzqt.EZpvd(hl));
    }

    public static final SequenceInputStream OLrzqt(HM hm) {
        java.lang.String strEZpvd = hm.EZpvd("AWS_EXECUTION_ENV");
        if (strEZpvd != null) {
            return new SequenceInputStream(strEZpvd);
        }
        return null;
    }

    public static /* synthetic */ java.lang.String uaPair$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return AEQbTJ(str, str2, str3);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str3 == null) {
            return AEQbTJ(str) + JsonPointer.SEPARATOR + AEQbTJ(str2);
        }
        return AEQbTJ(str) + JsonPointer.SEPARATOR + AEQbTJ(str2) + '#' + AEQbTJ(str3);
    }

    public static final java.lang.String AEQbTJ(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == ' ') {
                sb.append("_");
            } else if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || (('0' <= cCharAt && cCharAt < ':') || EZpvd.contains(java.lang.Character.valueOf(cCharAt))))) {
                sb.append(cCharAt);
            }
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
