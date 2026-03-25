package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKDateStyle;
import com.okinc.localization.util.format.OKDateTimeFormat;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.localization.util.format.OKTimeStyle;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.rjv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43156rjv {
    public static final C43156rjv copydefault = new C43156rjv();

    /* JADX INFO: renamed from: o.rjv$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;

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
            AEQbTJ = iArr;
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

    private C43156rjv() {
    }

    public static final java.lang.String AEQbTJ(long j, boolean z, int i, int i2, int i3, int i4, java.lang.String str) {
        OKDateStyle oKDateStyle;
        OKDateTimeFormat oKDateTimeFormat;
        OKTimeStyle oKTimeStyle;
        TimeZone timeZoneOLrzqt;
        long j2 = ((long) 1000) * j;
        OKDateTimeFormat oKDateTimeFormat2 = null;
        if (j2 < 0) {
            return null;
        }
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
            oKDateTimeFormat = oKDateTimeFormatArrValues[i7];
            if (oKDateTimeFormat.getFormat() == i2) {
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
            oKTimeStyle = oKTimeStyleArrValues[i8];
            if (oKTimeStyle.getStyle() == i3) {
                break;
            }
            i8++;
        }
        OKDateTimeFormat[] oKDateTimeFormatArrValues2 = OKDateTimeFormat.values();
        int length4 = oKDateTimeFormatArrValues2.length;
        while (true) {
            if (i5 >= length4) {
                break;
            }
            OKDateTimeFormat oKDateTimeFormat3 = oKDateTimeFormatArrValues2[i5];
            if (oKDateTimeFormat3.getFormat() == i4) {
                oKDateTimeFormat2 = oKDateTimeFormat3;
                break;
            }
            i5++;
        }
        C43156rjv c43156rjv = copydefault;
        OKDateEnum oKDateEnumEZpvd = c43156rjv.EZpvd(oKDateStyle, oKDateTimeFormat);
        OKTimeEnum oKTimeEnumEZpvd = c43156rjv.EZpvd(oKTimeStyle, oKDateTimeFormat2);
        if (!android.text.TextUtils.isEmpty(str)) {
            Intrinsics.copydefault((java.lang.Object) str);
            timeZoneOLrzqt = yCN.OLrzqt(C59449zhJ.replace$default(str, "UTC", "GMT", false, 4, (java.lang.Object) null));
        } else {
            timeZoneOLrzqt = TimeZone.getDefault();
        }
        TimeZone timeZone = timeZoneOLrzqt;
        Date date = new Date(j2);
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        Intrinsics.copydefault(timeZone);
        return pTA.copydefault(date, oKDateEnumEZpvd, oKTimeEnumEZpvd, locale, timeZone, z);
    }

    public final OKDateEnum EZpvd(OKDateStyle oKDateStyle, OKDateTimeFormat oKDateTimeFormat) {
        if (oKDateTimeFormat == OKDateTimeFormat.DT_SIMPLE) {
            switch (oKDateStyle != null ? ActionBar.AEQbTJ[oKDateStyle.ordinal()] : -1) {
                case 1:
                    return OKDateEnum.NONE;
                case 2:
                    return OKDateEnum.DATE_FORMAT_SIMPLE;
                case 3:
                    return OKDateEnum.DATE_FORMAT_SIMPLE_YM;
                case 4:
                    return OKDateEnum.DATE_FORMAT_SIMPLE_MD;
                case 5:
                    return OKDateEnum.DATE_FORMAT_SIMPLE_M;
                case 6:
                    return OKDateEnum.DATE_FORMAT_Y;
                default:
                    return OKDateEnum.DATE_FORMAT_SIMPLE;
            }
        }
        int i = oKDateStyle != null ? ActionBar.AEQbTJ[oKDateStyle.ordinal()] : -1;
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
        return OKDateEnum.DATE_FORMAT_STANDARD;
    }

    public final OKTimeEnum EZpvd(OKTimeStyle oKTimeStyle, OKDateTimeFormat oKDateTimeFormat) {
        int i;
        if (oKDateTimeFormat == OKDateTimeFormat.DT_SIMPLE) {
            i = oKTimeStyle != null ? ActionBar.EZpvd[oKTimeStyle.ordinal()] : -1;
            if (i == 1) {
                return OKTimeEnum.NONE;
            }
            if (i == 2) {
                return OKTimeEnum.TIME_FORMAT_SIMPLE;
            }
            if (i == 3) {
                return OKTimeEnum.TIME_FORMAT_SIMPLE_HM;
            }
            return OKTimeEnum.TIME_FORMAT_SIMPLE_HM;
        }
        i = oKTimeStyle != null ? ActionBar.EZpvd[oKTimeStyle.ordinal()] : -1;
        if (i == 1) {
            return OKTimeEnum.NONE;
        }
        if (i == 2) {
            return OKTimeEnum.TIME_FORMAT_STANDARD;
        }
        if (i == 3) {
            return OKTimeEnum.TIME_FORMAT_STANDARD_HM;
        }
        return OKTimeEnum.TIME_FORMAT_STANDARD;
    }
}
