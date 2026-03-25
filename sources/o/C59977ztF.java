package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: renamed from: o.ztF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59977ztF {
    public static final java.lang.String EZpvd(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo, InterfaceC59997ztZ interfaceC59997ztZ, @NotNull InterfaceC59997ztZ interfaceC59997ztZ2) {
        java.lang.String strEZpvd;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(interfaceC59997ztZ2, "");
        if (interfaceC59997ztZ != null && (strEZpvd = interfaceC59997ztZ.EZpvd()) != null) {
            str = strEZpvd;
        }
        return C60067zuq.KWHzl(interfaceC56551yJo) + AbstractJsonLexerKt.COLON + str + AbstractJsonLexerKt.COLON + interfaceC59997ztZ2;
    }

    public static /* synthetic */ C59978ztG _createDefinition$default(Kind kind, InterfaceC59997ztZ interfaceC59997ztZ, Function2 function2, java.util.List list, InterfaceC59997ztZ interfaceC59997ztZ2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            kind = Kind.Singleton;
        }
        Kind kind2 = kind;
        if ((i & 2) != 0) {
            interfaceC59997ztZ = null;
        }
        InterfaceC59997ztZ interfaceC59997ztZ3 = interfaceC59997ztZ;
        if ((i & 8) != 0) {
            list = yDY.AhwBna();
        }
        java.util.List list2 = list;
        Intrinsics.checkNotNullParameter(kind2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(interfaceC59997ztZ2, "");
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new C59978ztG(interfaceC59997ztZ2, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ3, function2, kind2, list2);
    }
}
