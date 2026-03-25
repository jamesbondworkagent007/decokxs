package o;

import com.okinc.localization.adapter.DateFormatAdapter;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKDateStyle;
import com.okinc.localization.util.format.OKDateTimeFormat;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.localization.util.format.OKTimeStyle;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pTA {

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "");
        return formatSimpleDate$default(date, null, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AYXKKw(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "");
        return formatStandardTime$default(date, null, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String EZpvd(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "");
        return formatSimpleDateTime$default(date, null, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String EZpvd(@NotNull Date date, @NotNull OKTimeEnum oKTimeEnum, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(oKTimeEnum, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return formatTime$default(date, oKTimeEnum, locale, null, false, 12, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String KWHzl(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "");
        return formatStandardDate$default(date, null, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String KWHzl(@NotNull Date date, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(date, "");
        return formatExWithInt$default(date, i, i2, i3, i4, null, 16, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String KWHzl(@NotNull Date date, @NotNull OKDateEnum oKDateEnum, @NotNull OKTimeEnum oKTimeEnum) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(oKDateEnum, "");
        Intrinsics.checkNotNullParameter(oKTimeEnum, "");
        return format$default(date, oKDateEnum, oKTimeEnum, null, null, false, 28, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String OLrzqt(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "");
        return formatStandardDateTime$default(date, null, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String copydefault(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "");
        return formatSimpleTime$default(date, null, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String copydefault(@NotNull Date date, @NotNull OKDateEnum oKDateEnum) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(oKDateEnum, "");
        return formatDate$default(date, oKDateEnum, null, null, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String copydefault(@NotNull Date date, @NotNull OKDateEnum oKDateEnum, @NotNull OKTimeEnum oKTimeEnum, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(oKDateEnum, "");
        Intrinsics.checkNotNullParameter(oKTimeEnum, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return format$default(date, oKDateEnum, oKTimeEnum, locale, null, false, 24, null);
    }

    public static /* synthetic */ java.lang.String formatStandardDate$default(Date date, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return KWHzl(date, locale);
    }

    public static final java.lang.String KWHzl(@NotNull Date date, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return formatDate$default(date, OKDateEnum.DATE_FORMAT_STANDARD, locale, null, 4, null);
    }

    public static /* synthetic */ java.lang.String formatStandardTime$default(Date date, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return AhwBna(date, locale);
    }

    public static final java.lang.String AhwBna(@NotNull Date date, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return formatTime$default(date, OKTimeEnum.TIME_FORMAT_STANDARD, locale, null, false, 12, null);
    }

    public static /* synthetic */ java.lang.String formatStandardDateTime$default(Date date, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return EZpvd(date, locale);
    }

    public static final java.lang.String EZpvd(@NotNull Date date, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return format$default(date, OKDateEnum.DATE_FORMAT_STANDARD, OKTimeEnum.TIME_FORMAT_STANDARD, locale, null, false, 24, null);
    }

    public static /* synthetic */ java.lang.String formatSimpleDate$default(Date date, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return OLrzqt(date, locale);
    }

    public static final java.lang.String OLrzqt(@NotNull Date date, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return formatDate$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, locale, null, 4, null);
    }

    public static /* synthetic */ java.lang.String formatSimpleTime$default(Date date, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return copydefault(date, locale);
    }

    public static final java.lang.String copydefault(@NotNull Date date, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return formatTime$default(date, OKTimeEnum.TIME_FORMAT_SIMPLE, locale, null, false, 12, null);
    }

    public static /* synthetic */ java.lang.String formatSimpleDateTime$default(Date date, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return AEQbTJ(date, locale);
    }

    public static final java.lang.String AEQbTJ(@NotNull Date date, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return format$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, locale, null, false, 24, null);
    }

    public static /* synthetic */ java.lang.String formatExWithInt$default(Date date, int i, int i2, int i3, int i4, java.util.Locale locale, int i5, java.lang.Object obj) {
        if ((i5 & 16) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return EZpvd(date, i, i2, i3, i4, locale);
    }

    public static final java.lang.String EZpvd(@NotNull Date date, int i, int i2, int i3, int i4, @NotNull java.util.Locale locale) {
        OKDateStyle oKDateStyle;
        OKDateTimeFormat oKDateTimeFormat;
        OKTimeStyle oKTimeStyle;
        OKDateTimeFormat oKDateTimeFormat2;
        Intrinsics.checkNotNullParameter(date, "");
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
        return KWHzl(date, oKDateStyle, oKDateTimeFormat, oKTimeStyle, oKDateTimeFormat2, locale);
    }

    public static /* synthetic */ java.lang.String formatEx$default(Date date, OKDateStyle oKDateStyle, OKDateTimeFormat oKDateTimeFormat, OKTimeStyle oKTimeStyle, OKDateTimeFormat oKDateTimeFormat2, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return KWHzl(date, oKDateStyle, oKDateTimeFormat, oKTimeStyle, oKDateTimeFormat2, locale);
    }

    public static final java.lang.String KWHzl(@NotNull Date date, OKDateStyle oKDateStyle, OKDateTimeFormat oKDateTimeFormat, OKTimeStyle oKTimeStyle, OKDateTimeFormat oKDateTimeFormat2, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return (oKDateStyle == OKDateStyle.DATE_STYLE_NONE && oKTimeStyle == OKTimeStyle.TIME_STYLE_NONE) ? "" : format$default(date, AEQbTJ(oKDateStyle, oKDateTimeFormat), AEQbTJ(oKTimeStyle, oKDateTimeFormat2), locale, null, false, 24, null);
    }

    public static /* synthetic */ java.lang.String formatDate$default(Date date, OKDateEnum oKDateEnum, java.util.Locale locale, TimeZone timeZone, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            locale = java.util.Locale.getDefault();
        }
        if ((i & 4) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return KWHzl(date, oKDateEnum, locale, timeZone);
    }

    public static final java.lang.String KWHzl(@NotNull Date date, @NotNull OKDateEnum oKDateEnum, @NotNull java.util.Locale locale, @NotNull TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(oKDateEnum, "");
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(timeZone, "");
        return KWHzl(oKDateEnum.getFormat(), date, locale, timeZone, false);
    }

    public static /* synthetic */ java.lang.String formatTime$default(Date date, OKTimeEnum oKTimeEnum, java.util.Locale locale, TimeZone timeZone, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            locale = java.util.Locale.getDefault();
        }
        if ((i & 4) != 0) {
            timeZone = TimeZone.getDefault();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return OLrzqt(date, oKTimeEnum, locale, timeZone, z);
    }

    public static final java.lang.String OLrzqt(@NotNull Date date, @NotNull OKTimeEnum oKTimeEnum, @NotNull java.util.Locale locale, @NotNull TimeZone timeZone, boolean z) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(oKTimeEnum, "");
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(timeZone, "");
        return KWHzl(oKTimeEnum.getFormat(), date, locale, timeZone, z);
    }

    public static /* synthetic */ java.lang.String format$default(Date date, OKDateEnum oKDateEnum, OKTimeEnum oKTimeEnum, java.util.Locale locale, TimeZone timeZone, boolean z, int i, java.lang.Object obj) {
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
        return copydefault(date, oKDateEnum, oKTimeEnum, locale2, timeZone2, z);
    }

    public static final java.lang.String copydefault(@NotNull Date date, @NotNull OKDateEnum oKDateEnum, @NotNull OKTimeEnum oKTimeEnum, @NotNull java.util.Locale locale, @NotNull TimeZone timeZone, boolean z) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(oKDateEnum, "");
        Intrinsics.checkNotNullParameter(oKTimeEnum, "");
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(timeZone, "");
        return KWHzl(oKDateEnum.getFormat() + oKTimeEnum.getFormat(), date, locale, timeZone, z);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull Date date, @NotNull java.util.Locale locale, @NotNull TimeZone timeZone, boolean z) {
        DateFormatAdapter dateFormatAdapter;
        java.lang.String strReplace;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(timeZone, "");
        java.util.Locale locale2 = C38303pTu.OLrzqt(locale) ? java.util.Locale.TAIWAN : locale;
        java.lang.String strEZpvd = EZpvd(locale, str);
        DateFormatAdapter.DateFormatType dateFormatType = DateFormatAdapter.DateFormatType.ICU_LIB;
        if (z) {
            Intrinsics.copydefault(locale2);
            DateFormatAdapter dateFormatAdapter2 = new DateFormatAdapter(strEZpvd + "O", locale2, dateFormatType);
            if (timeZone.getRawOffset() == 0) {
                strReplace = new Regex("\\S?O\\S?").replace(dateFormatAdapter2.KWHzl(), "O");
            } else {
                strReplace = new Regex("\\S?O\\S?").replace(dateFormatAdapter2.KWHzl(), "(O)");
            }
            dateFormatAdapter = dateFormatAdapter2.copydefault(strReplace);
        } else {
            Intrinsics.copydefault(locale2);
            dateFormatAdapter = new DateFormatAdapter(strEZpvd, locale2, dateFormatType);
        }
        dateFormatAdapter.AEQbTJ(timeZone);
        java.lang.String strOLrzqt = dateFormatAdapter.OLrzqt(date);
        if (z) {
            strOLrzqt = C59449zhJ.replace$default(C59449zhJ.replace$default(strOLrzqt, "GMT", "UTC", false, 4, (java.lang.Object) null), "غرينتش", "UTC", false, 4, (java.lang.Object) null);
        }
        return pTF.KWHzl.copydefault(strOLrzqt);
    }

    public static final java.lang.String EZpvd(java.util.Locale locale, java.lang.String str) {
        return !Intrinsics.EZpvd((java.lang.Object) C38303pTu.AYXKKw(locale), (java.lang.Object) "tr-TR") ? str : C59449zhJ.replace$default(str, "hh", "HH", false, 4, (java.lang.Object) null);
    }

    public static final OKDateEnum AEQbTJ(OKDateStyle oKDateStyle, OKDateTimeFormat oKDateTimeFormat) {
        if (oKDateTimeFormat != OKDateTimeFormat.DT_SIMPLE) {
            int i = oKDateStyle != null ? StateListAnimator.KWHzl[oKDateStyle.ordinal()] : -1;
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
        switch (oKDateStyle != null ? StateListAnimator.KWHzl[oKDateStyle.ordinal()] : -1) {
        }
        return OKDateEnum.NONE;
    }

    public static final OKTimeEnum AEQbTJ(OKTimeStyle oKTimeStyle, OKDateTimeFormat oKDateTimeFormat) {
        int i;
        if (oKDateTimeFormat == OKDateTimeFormat.DT_SIMPLE) {
            i = oKTimeStyle != null ? StateListAnimator.EZpvd[oKTimeStyle.ordinal()] : -1;
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
        i = oKTimeStyle != null ? StateListAnimator.EZpvd[oKTimeStyle.ordinal()] : -1;
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
