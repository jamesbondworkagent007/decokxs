package o;

import androidx.exifinterface.media.ExifInterface;
import aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader;
import aws.smithy.kotlin.runtime.serde.xml.XmlStreamReaderKt$peekSeek$1;
import aws.smithy.kotlin.runtime.serde.xml.XmlStreamReaderKt$seek$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FB {
    public static /* synthetic */ FA seek$default(XmlStreamReader xmlStreamReader, Function1 function1, int i, java.lang.Object obj) {
        boolean zBooleanValue;
        if ((i & 1) != 0) {
            Intrinsics.OLrzqt();
            function1 = XmlStreamReaderKt$seek$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(xmlStreamReader, "");
        Intrinsics.checkNotNullParameter(function1, "");
        FA faOLrzqt = xmlStreamReader.OLrzqt();
        do {
            Intrinsics.KWHzl(3, ExifInterface.GPS_DIRECTION_TRUE);
            zBooleanValue = faOLrzqt instanceof FA ? ((java.lang.Boolean) function1.invoke(faOLrzqt)).booleanValue() : false;
            if (!zBooleanValue) {
                faOLrzqt = xmlStreamReader.AEQbTJ();
            }
            if (faOLrzqt == null) {
                break;
            }
        } while (!zBooleanValue);
        Intrinsics.KWHzl(1, "T?");
        return faOLrzqt;
    }

    public static /* synthetic */ FA peekSeek$default(XmlStreamReader xmlStreamReader, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            Intrinsics.OLrzqt();
            function1 = XmlStreamReaderKt$peekSeek$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(xmlStreamReader, "");
        Intrinsics.checkNotNullParameter(function1, "");
        FA faOLrzqt = xmlStreamReader.OLrzqt();
        if (faOLrzqt != null) {
            Intrinsics.KWHzl(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (((java.lang.Boolean) function1.invoke(faOLrzqt)).booleanValue()) {
                return faOLrzqt;
            }
            return null;
        }
        do {
            Intrinsics.KWHzl(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (faOLrzqt instanceof FA) {
                if (!((java.lang.Boolean) function1.invoke(faOLrzqt)).booleanValue()) {
                    return null;
                }
                FA faAEQbTJ = xmlStreamReader.AEQbTJ();
                Intrinsics.KWHzl(1, ExifInterface.GPS_DIRECTION_TRUE);
                return faAEQbTJ;
            }
            xmlStreamReader.AEQbTJ();
            faOLrzqt = XmlStreamReader.StateListAnimator.peek$default(xmlStreamReader, 0, 1, null);
        } while (faOLrzqt != null);
        return null;
    }

    public static final XmlStreamReader KWHzl(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new FJ(new FI(new FK(C59449zhJ.copydefault(bArr))));
    }
}
