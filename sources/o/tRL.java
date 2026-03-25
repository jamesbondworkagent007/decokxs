package o;

import com.google.common.base.Ascii;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tRL {
    public static final java.util.List<java.lang.Byte> OLrzqt = yDY.gEmmrt(java.lang.Byte.valueOf(Ascii.FS), (byte) 19, (byte) 6, java.lang.Byte.valueOf(Ascii.CAN), java.lang.Byte.valueOf(Ascii.SUB), java.lang.Byte.valueOf(Ascii.EM), (byte) 16, java.lang.Byte.valueOf(Ascii.RS), java.lang.Byte.valueOf(Ascii.GS), java.lang.Byte.valueOf(Ascii.DC4), java.lang.Byte.valueOf(Ascii.SYN), java.lang.Byte.valueOf(Ascii.NAK), java.lang.Byte.valueOf(Ascii.ESC), java.lang.Byte.valueOf(Ascii.ETB), java.lang.Byte.valueOf(Ascii.FF));

    public static /* synthetic */ java.lang.String toSimpleDateAndTime$default(java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return EZpvd(str, z, z2);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return "--";
        }
        Date date = new Date(C33129mqd.valueOf(str));
        OKDateEnum oKDateEnum = OKDateEnum.DATE_FORMAT_Y;
        java.lang.String date$default = pTA.formatDate$default(date, oKDateEnum, null, null, 6, null);
        java.lang.String date$default2 = pTA.formatDate$default(new Date(java.lang.System.currentTimeMillis()), oKDateEnum, null, null, 6, null);
        Date date2 = new Date(C33129mqd.valueOf(str));
        OKDateEnum oKDateEnum2 = (Intrinsics.EZpvd((java.lang.Object) date$default, (java.lang.Object) date$default2) && z2) ? OKDateEnum.DATE_FORMAT_SIMPLE_MD : OKDateEnum.DATE_FORMAT_SIMPLE;
        if (z) {
            return pTA.format$default(date2, oKDateEnum2, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, true, 12, null);
        }
        return pTA.formatTime$default(date2, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, true, 6, null) + "\n" + pTA.formatDate$default(date2, oKDateEnum2, null, null, 6, null);
    }

    public static /* synthetic */ java.lang.String trimIntermediateLineBreaks$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return copydefault(str, i);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listUzCIH = StringsKt__StringsKt.uzCIH((java.lang.CharSequence) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listUzCIH) {
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, i), " ", null, null, 0, null, new Function1() { // from class: o.tRO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return tRL.AEQbTJ((java.lang.String) obj2);
            }
        }, 30, null);
    }

    public static final java.lang.CharSequence AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString();
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str);
        return java.lang.String.valueOf((intOrNull != null ? intOrNull.intValue() : 0) + 1);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return java.lang.String.valueOf((StringsKt__StringNumberConversionsKt.toIntOrNull(str) != null ? r1.intValue() : 0) - 1);
    }
}
