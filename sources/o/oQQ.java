package o;

import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo;
import com.okinc.localization.util.format.OKDateEnum;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oQQ {
    public static final java.lang.String KWHzl(long j) {
        java.lang.String date$default = pTA.formatDate$default(new Date(j), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
        java.lang.String strCopydefault = copydefault(j);
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "today")) {
            return C33069mpW.copydefault(C35964oKf.Fragment.seuMaA, C56423yEv.EZpvd(C56390yDp.OLrzqt("date", date$default)));
        }
        return Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "yesterday") ? C33069mpW.copydefault(C35964oKf.Fragment.znKlvJ, C56423yEv.EZpvd(C56390yDp.OLrzqt("date", date$default))) : date$default;
    }

    public static final java.lang.String copydefault(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        long j2 = 86400000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        calendar2.getTimeInMillis();
        return (timeInMillis > j || j > (timeInMillis + j2) - 1) ? (j > timeInMillis - 1 || timeInMillis - j2 > j) ? "other" : "yesterday" : "today";
    }

    public static final java.lang.CharSequence copydefault(@NotNull MarketEventsVo.Content content) {
        Intrinsics.checkNotNullParameter(content, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) content.KWHzl()) && C33129mqd.OLrzqt((java.lang.CharSequence) content.AhwBna())) {
            java.lang.String strAhwBna = content.AhwBna();
            java.lang.String strKWHzl = content.KWHzl();
            Intrinsics.copydefault((java.lang.Object) strKWHzl);
            return C33061mpO.setupSpanStyles$default(strAhwBna, new java.lang.String[]{strKWHzl}, 0, null, false, new Function1() { // from class: o.oQT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oQQ.copydefault((java.util.List) obj);
                }
            }, 14, null);
        }
        return content.AhwBna();
    }

    public static final Unit copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.UnderlineSpan());
        return Unit.INSTANCE;
    }

    public static final java.lang.CharSequence OLrzqt(@NotNull MarketEventsVo.Content content) {
        Intrinsics.checkNotNullParameter(content, "");
        return content.AEQbTJ();
    }
}
