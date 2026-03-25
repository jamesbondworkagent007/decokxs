package o;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.Hk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5170Hk {
    public static final C5173Hn OLrzqt(C5176Hq c5176Hq) {
        java.util.List listGEmmrt;
        if (c5176Hq.KWHzl() == 24 && c5176Hq.copydefault() == 0 && c5176Hq.valueOf() == 0) {
            listGEmmrt = yDY.gEmmrt(1, 0, 0, 0);
        } else {
            listGEmmrt = (c5176Hq.KWHzl() == 23 && c5176Hq.copydefault() == 59 && c5176Hq.valueOf() == 60) ? yDY.gEmmrt(0, 23, 59, 59) : yDY.gEmmrt(0, java.lang.Integer.valueOf(c5176Hq.KWHzl()), java.lang.Integer.valueOf(c5176Hq.copydefault()), java.lang.Integer.valueOf(c5176Hq.valueOf()));
        }
        Instant instant = LocalDateTime.of(c5176Hq.gEmmrt(), c5176Hq.OLrzqt(), c5176Hq.AEQbTJ(), ((java.lang.Number) listGEmmrt.get(1)).intValue(), ((java.lang.Number) listGEmmrt.get(2)).intValue(), ((java.lang.Number) listGEmmrt.get(3)).intValue(), c5176Hq.EZpvd()).plusDays(((java.lang.Number) listGEmmrt.get(0)).intValue()).atOffset(ZoneOffset.ofTotalSeconds(c5176Hq.AYXKKw())).toInstant();
        Intrinsics.copydefault(instant);
        return new C5173Hn(instant);
    }

    public static final C56350yCc AEQbTJ() {
        java.util.Map<java.lang.Long, java.lang.String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(1L, "Mon"), C56390yDp.OLrzqt(2L, "Tue"), C56390yDp.OLrzqt(3L, "Wed"), C56390yDp.OLrzqt(4L, "Thu"), C56390yDp.OLrzqt(5L, "Fri"), C56390yDp.OLrzqt(6L, "Sat"), C56390yDp.OLrzqt(7L, "Sun"));
        C56350yCc c56350yCcKWHzl = new DateTimeFormatterBuilder().AYXKKw().gEmmrt().djBIcL().AEQbTJ(ChronoField.DAY_OF_WEEK, mapGEmmrt).KWHzl(", ").EZpvd().OLrzqt(ChronoField.DAY_OF_MONTH, 2, 2, SignStyle.NOT_NEGATIVE).EZpvd(' ').AEQbTJ(ChronoField.MONTH_OF_YEAR, C56424yEw.gEmmrt(C56390yDp.OLrzqt(1L, "Jan"), C56390yDp.OLrzqt(2L, "Feb"), C56390yDp.OLrzqt(3L, "Mar"), C56390yDp.OLrzqt(4L, "Apr"), C56390yDp.OLrzqt(5L, "May"), C56390yDp.OLrzqt(6L, "Jun"), C56390yDp.OLrzqt(7L, "Jul"), C56390yDp.OLrzqt(8L, "Aug"), C56390yDp.OLrzqt(9L, "Sep"), C56390yDp.OLrzqt(10L, "Oct"), C56390yDp.OLrzqt(11L, "Nov"), C56390yDp.OLrzqt(12L, "Dec"))).EZpvd(' ').AEQbTJ(ChronoField.YEAR, 4).EZpvd(' ').AEQbTJ(ChronoField.HOUR_OF_DAY, 2).EZpvd(AbstractJsonLexerKt.COLON).AEQbTJ(ChronoField.MINUTE_OF_HOUR, 2).djBIcL().EZpvd(AbstractJsonLexerKt.COLON).AEQbTJ(ChronoField.SECOND_OF_MINUTE, 2).EZpvd().EZpvd(' ').AEQbTJ("+HHMM", "GMT").AhwBna().KWHzl(IsoChronology.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(c56350yCcKWHzl, "");
        return c56350yCcKWHzl;
    }
}
