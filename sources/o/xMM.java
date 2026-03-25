package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKDateStyle;
import com.okinc.localization.util.format.OKDateTimeFormat;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.localization.util.format.OKTimeStyle;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xMM {
    public static final xMM AEQbTJ = new xMM();

    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKDateStyle.values().length];
            try {
                iArr[OKDateStyle.DATE_STYLE_NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKDateStyle.DATE_STYLE_FULL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKDateStyle.DATE_STYLE_YM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[OKDateStyle.DATE_STYLE_MD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[OKDateStyle.DATE_STYLE_M.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[OKDateStyle.DATE_STYLE_Y.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[OKTimeStyle.values().length];
            try {
                iArr2[OKTimeStyle.TIME_STYLE_NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[OKTimeStyle.TIME_STYLE_FULL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[OKTimeStyle.TIME_STYLE_HM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            EZpvd = iArr2;
        }
    }

    private xMM() {
    }

    public static /* synthetic */ java.lang.String formatStandardDate$default(xMM xmm, long j, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return xmm.AEQbTJ(j, locale);
    }

    public final java.lang.String AEQbTJ(long j, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        return pTA.formatDate$default(new Date(j), OKDateEnum.DATE_FORMAT_STANDARD, locale, null, 4, null);
    }

    public static /* synthetic */ java.lang.String formatStandardTime$default(xMM xmm, long j, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return xmm.gEmmrt(j, locale);
    }

    public final java.lang.String gEmmrt(long j, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        return pTA.formatTime$default(new Date(j), OKTimeEnum.TIME_FORMAT_STANDARD, locale, null, false, 12, null);
    }

    public static /* synthetic */ java.lang.String formatStandardDateTime$default(xMM xmm, long j, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return xmm.KWHzl(j, locale);
    }

    public final java.lang.String KWHzl(long j, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        return pTA.format$default(new Date(j), OKDateEnum.DATE_FORMAT_STANDARD, OKTimeEnum.TIME_FORMAT_STANDARD, locale, null, false, 24, null);
    }

    public static /* synthetic */ java.lang.String formatSimpleDate$default(xMM xmm, long j, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return xmm.copydefault(j, locale);
    }

    public final java.lang.String copydefault(long j, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        return pTA.formatDate$default(new Date(j), OKDateEnum.DATE_FORMAT_SIMPLE, locale, null, 4, null);
    }

    public static /* synthetic */ java.lang.String formatSimpleTime$default(xMM xmm, long j, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return xmm.OLrzqt(j, locale);
    }

    public final java.lang.String OLrzqt(long j, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        return pTA.formatTime$default(new Date(j), OKTimeEnum.TIME_FORMAT_SIMPLE, locale, null, false, 12, null);
    }

    public static /* synthetic */ java.lang.String formatSimpleDateTime$default(xMM xmm, long j, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return xmm.EZpvd(j, locale);
    }

    public final java.lang.String EZpvd(long j, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        return pTA.format$default(new Date(j), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, locale, null, false, 24, null);
    }

    public final java.lang.String EZpvd(long j, int i, int i2, int i3, int i4, @NotNull java.util.Locale locale) {
        OKDateStyle oKDateStyle;
        OKDateTimeFormat oKDateTimeFormat;
        OKTimeStyle oKTimeStyle;
        OKDateTimeFormat oKDateTimeFormat2;
        Intrinsics.checkNotNullParameter(locale, "");
        OKDateStyle[] oKDateStyleArrValues = OKDateStyle.values();
        int length = oKDateStyleArrValues.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                oKDateStyle = null;
                break;
            }
            oKDateStyle = oKDateStyleArrValues[i6];
            if (oKDateStyle.getStyle() == i) {
                break;
            }
            i6++;
        }
        OKDateTimeFormat[] oKDateTimeFormatArrValues = OKDateTimeFormat.values();
        int length2 = oKDateTimeFormatArrValues.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length2) {
                oKDateTimeFormat = null;
                break;
            }
            OKDateTimeFormat oKDateTimeFormat3 = oKDateTimeFormatArrValues[i7];
            if (oKDateTimeFormat3.getFormat() == i2) {
                oKDateTimeFormat = oKDateTimeFormat3;
                break;
            }
            i7++;
        }
        OKTimeStyle[] oKTimeStyleArrValues = OKTimeStyle.values();
        int length3 = oKTimeStyleArrValues.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length3) {
                oKTimeStyle = null;
                break;
            }
            OKTimeStyle oKTimeStyle2 = oKTimeStyleArrValues[i8];
            if (oKTimeStyle2.getStyle() == i3) {
                oKTimeStyle = oKTimeStyle2;
                break;
            }
            i8++;
        }
        OKDateTimeFormat[] oKDateTimeFormatArrValues2 = OKDateTimeFormat.values();
        int length4 = oKDateTimeFormatArrValues2.length;
        while (true) {
            if (i5 >= length4) {
                oKDateTimeFormat2 = null;
                break;
            }
            OKDateTimeFormat oKDateTimeFormat4 = oKDateTimeFormatArrValues2[i5];
            if (oKDateTimeFormat4.getFormat() == i4) {
                oKDateTimeFormat2 = oKDateTimeFormat4;
                break;
            }
            i5++;
        }
        return pTA.KWHzl(new Date(j), oKDateStyle, oKDateTimeFormat, oKTimeStyle, oKDateTimeFormat2, locale);
    }

    public final java.lang.String OLrzqt(long j, OKDateStyle oKDateStyle, OKDateTimeFormat oKDateTimeFormat, OKTimeStyle oKTimeStyle, OKDateTimeFormat oKDateTimeFormat2, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        if (oKDateStyle == OKDateStyle.DATE_STYLE_NONE && oKTimeStyle == OKTimeStyle.TIME_STYLE_NONE) {
            return "";
        }
        return pTA.format$default(new Date(j), OLrzqt(oKDateStyle, oKDateTimeFormat), OLrzqt(oKTimeStyle, oKDateTimeFormat2), locale, null, false, 24, null);
    }

    public static /* synthetic */ java.lang.String formatDate$default(xMM xmm, long j, OKDateEnum oKDateEnum, java.util.Locale locale, TimeZone timeZone, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            locale = java.util.Locale.getDefault();
        }
        java.util.Locale locale2 = locale;
        if ((i & 8) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return xmm.OLrzqt(j, oKDateEnum, locale2, timeZone);
    }

    public final java.lang.String OLrzqt(long j, @NotNull OKDateEnum oKDateEnum, @NotNull java.util.Locale locale, @NotNull TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(oKDateEnum, "");
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(timeZone, "");
        return pTA.KWHzl(new Date(j), oKDateEnum, locale, timeZone);
    }

    public static /* synthetic */ java.lang.String formatTime$default(xMM xmm, long j, OKTimeEnum oKTimeEnum, java.util.Locale locale, TimeZone timeZone, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            locale = java.util.Locale.getDefault();
        }
        java.util.Locale locale2 = locale;
        if ((i & 8) != 0) {
            timeZone = TimeZone.getDefault();
        }
        TimeZone timeZone2 = timeZone;
        if ((i & 16) != 0) {
            z = false;
        }
        return xmm.AEQbTJ(j, oKTimeEnum, locale2, timeZone2, z);
    }

    public final java.lang.String AEQbTJ(long j, @NotNull OKTimeEnum oKTimeEnum, @NotNull java.util.Locale locale, @NotNull TimeZone timeZone, boolean z) {
        Intrinsics.checkNotNullParameter(oKTimeEnum, "");
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(timeZone, "");
        return pTA.OLrzqt(new Date(j), oKTimeEnum, locale, timeZone, z);
    }

    public final java.lang.String copydefault(long j, @NotNull OKDateEnum oKDateEnum, @NotNull OKTimeEnum oKTimeEnum, @NotNull java.util.Locale locale, @NotNull TimeZone timeZone, boolean z) {
        Intrinsics.checkNotNullParameter(oKDateEnum, "");
        Intrinsics.checkNotNullParameter(oKTimeEnum, "");
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(timeZone, "");
        return pTA.copydefault(new Date(j), oKDateEnum, oKTimeEnum, locale, timeZone, z);
    }

    public final OKDateEnum OLrzqt(OKDateStyle oKDateStyle, OKDateTimeFormat oKDateTimeFormat) {
        if (oKDateTimeFormat != OKDateTimeFormat.DT_SIMPLE) {
            int i = oKDateStyle != null ? Activity.KWHzl[oKDateStyle.ordinal()] : -1;
            if (i == 1) {
                return OKDateEnum.NONE;
            }
            if (i == 2) {
                return OKDateEnum.DATE_FORMAT_STANDARD;
            }
            if (i == 3) {
                return OKDateEnum.DATE_FORMAT_STANDARD_YM;
            }
            if (i == 4) {
                return OKDateEnum.DATE_FORMAT_STANDARD_MD;
            }
            if (i == 5) {
                return OKDateEnum.DATE_FORMAT_STANDARD_M;
            }
            return OKDateEnum.NONE;
        }
        switch (oKDateStyle != null ? Activity.KWHzl[oKDateStyle.ordinal()] : -1) {
        }
        return OKDateEnum.NONE;
    }

    public final OKTimeEnum OLrzqt(OKTimeStyle oKTimeStyle, OKDateTimeFormat oKDateTimeFormat) {
        int i;
        if (oKDateTimeFormat == OKDateTimeFormat.DT_SIMPLE) {
            i = oKTimeStyle != null ? Activity.EZpvd[oKTimeStyle.ordinal()] : -1;
            if (i == 1) {
                return OKTimeEnum.NONE;
            }
            if (i == 2) {
                return OKTimeEnum.TIME_FORMAT_SIMPLE;
            }
            if (i == 3) {
                return OKTimeEnum.TIME_FORMAT_SIMPLE_HM;
            }
            return OKTimeEnum.NONE;
        }
        i = oKTimeStyle != null ? Activity.EZpvd[oKTimeStyle.ordinal()] : -1;
        if (i == 1) {
            return OKTimeEnum.NONE;
        }
        if (i == 2) {
            return OKTimeEnum.TIME_FORMAT_STANDARD;
        }
        if (i == 3) {
            return OKTimeEnum.TIME_FORMAT_STANDARD_HM;
        }
        return OKTimeEnum.NONE;
    }
}
