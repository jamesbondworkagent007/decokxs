package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23311hvo {
    public static /* synthetic */ java.lang.String getRightString$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = OrderDetailListItem.SLIP_OUT;
        }
        return OLrzqt(str, str2);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C23313hvq.OLrzqt(str);
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) JwtUtilsKt.JWT_DELIMITER, false, 2, (java.lang.Object) null) ? C33129mqd.formatS$default(str, java.lang.Integer.valueOf(C33129mqd.AhwBna(str2)), null, null, 6, null) : str;
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C23313hvq.OLrzqt(str);
        return str.length() == 0 ? str : C33129mqd.formatS$default(str, java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 6, null);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C23313hvq.OLrzqt(str);
        return pTB.formatLocalized$default(str, null, 1, null);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String lowerCase;
        Intrinsics.checkNotNullParameter(str, "");
        DefiChainInfo defiChainInfoAEQbTJ = C22380heK.OLrzqt.AEQbTJ().AEQbTJ(str2);
        if (defiChainInfoAEQbTJ != null) {
            if (defiChainInfoAEQbTJ.isSensitiveChain()) {
                lowerCase = str;
            } else {
                lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            }
            if (lowerCase != null) {
                return lowerCase;
            }
        }
        java.lang.String lowerCase2 = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return lowerCase2;
    }

    public static final boolean copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return Intrinsics.EZpvd((java.lang.Object) (str2 != null ? EZpvd(str2, str) : null), (java.lang.Object) (str3 != null ? EZpvd(str3, str) : null));
    }

    public static /* synthetic */ java.lang.String formatPercent$default(java.lang.String str, boolean z, int i, int i2, RoundingMode roundingMode, java.util.Locale locale, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z = true;
        }
        if ((i3 & 2) != 0) {
            i = 2;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i3 & 16) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return EZpvd(str, z, i4, i5, roundingMode2, locale);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, boolean z, int i, int i2, @NotNull RoundingMode roundingMode, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(locale, "");
        C23313hvq.OLrzqt(str);
        if (!z) {
            str = C23313hvq.divCheckS$default(str, 100, null, null, null, 14, null);
        }
        return pTB.EZpvd(C33129mqd.EZpvd(str), i, i2, roundingMode, locale);
    }

    public static /* synthetic */ java.lang.String formatPercentWithSymbol$default(java.lang.String str, boolean z, int i, int i2, RoundingMode roundingMode, java.util.Locale locale, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z = true;
        }
        if ((i3 & 2) != 0) {
            i = 2;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i3 & 16) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return OLrzqt(str, z, i4, i5, roundingMode2, locale);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z, int i, int i2, @NotNull RoundingMode roundingMode, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(locale, "");
        C23313hvq.OLrzqt(str);
        if (!z) {
            str = C23313hvq.divCheckS$default(str, 100, null, null, null, 14, null);
        }
        return pTF.KWHzl.AEQbTJ(pTB.KWHzl(C33129mqd.EZpvd(str), i, i2, roundingMode, locale));
    }

    public static /* synthetic */ java.lang.String formatPercentWithoutSymbol$default(java.lang.String str, boolean z, int i, BigDecimal bigDecimal, boolean z2, java.lang.Integer num, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = 2;
        }
        if ((i2 & 4) != 0) {
            bigDecimal = null;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        if ((i2 & 16) != 0) {
            num = null;
        }
        return EZpvd(str, z, i, bigDecimal, z2, num);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, boolean z, int i, BigDecimal bigDecimal, boolean z2, java.lang.Integer num) {
        BigDecimal bigDecimalEZpvd;
        java.lang.String strDivCheckS$default = str;
        Intrinsics.checkNotNullParameter(strDivCheckS$default, "");
        if (Intrinsics.EZpvd((java.lang.Object) strDivCheckS$default, (java.lang.Object) "--")) {
            return strDivCheckS$default;
        }
        C23313hvq.OLrzqt(str);
        if (!z) {
            strDivCheckS$default = C23313hvq.divCheckS$default(str, 100, null, null, null, 14, null);
        }
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(strDivCheckS$default);
        if (bigDecimal != null) {
            bigDecimalEZpvd = C33129mqd.EZpvd(z ? bigDecimal : C23313hvq.divCheckS$default(bigDecimal, 100, null, null, null, 14, null));
        } else {
            bigDecimalEZpvd = bigDecimalEZpvd2;
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimalEZpvd2.compareTo(bigDecimal2) > 0 && bigDecimalEZpvd2.compareTo(bigDecimalEZpvd) < 0) {
            return "<" + pTB.formatICUPercent$default(C33129mqd.EZpvd(bigDecimalEZpvd), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(num != null ? num.intValue() : i, i), null, java.lang.Double.valueOf(100.0d), null, 20, null);
        }
        if (z2 && Intrinsics.EZpvd(bigDecimalEZpvd2, bigDecimal2)) {
            return "0%";
        }
        return pTB.formatICUPercent$default(bigDecimalEZpvd2, RoundingMode.DOWN, C38307pTy.Companion.KWHzl(num != null ? num.intValue() : i, i), null, java.lang.Double.valueOf(100.0d), null, 20, null);
    }

    public static final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, boolean z) {
        if (z) {
            if (str == null) {
                str = "";
            }
            return str + "nativeToken";
        }
        java.lang.String str3 = str == null ? "" : str;
        java.lang.String strEZpvd = str2 != null ? EZpvd(str2, str) : null;
        return str3 + (strEZpvd != null ? strEZpvd : "");
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.valueOf(str, 0) ? C59449zhJ.replace$default(str, "-", "", false, 4, (java.lang.Object) null) : str;
    }

    public static /* synthetic */ java.lang.String fmtFiatWithThousandsNoZero$default(java.lang.String str, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return OLrzqt(str, roundingMode);
    }

    public static final java.lang.String OLrzqt(java.lang.String str, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(roundingMode, "");
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        if (dAEQbTJ >= 1.0d) {
            return pTB.toLocalizationStringWithMaxPrecision$default(C33129mqd.gEmmrt(java.lang.Double.valueOf(dAEQbTJ)), 2, roundingMode, null, 4, null);
        }
        if (dAEQbTJ >= 1.0E-4d) {
            return pTB.toLocalizationStringWithMaxPrecision$default(C33129mqd.gEmmrt(java.lang.Double.valueOf(dAEQbTJ)), 4, roundingMode, null, 4, null);
        }
        return pTB.toLocalizationStringWithMaxPrecision$default(C33129mqd.gEmmrt(java.lang.Double.valueOf(dAEQbTJ)), 8, roundingMode, null, 4, null);
    }

    public static /* synthetic */ java.lang.String setCountDownText$default(int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return KWHzl(i, z);
    }

    public static final java.lang.String KWHzl(int i, boolean z) {
        int i2 = i / RemoteMessageConst.DEFAULT_TTL;
        int i3 = (i / IMarketApiService.SIXTY_MINUTES) % 24;
        int i4 = (i / 60) % 60;
        int i5 = i % 60;
        if (i >= 90000) {
            if (i3 == 0) {
                return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.IPostMessageService, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.Integer.valueOf(i2))));
            }
            return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.ICustomTabsServiceStub, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("value1", java.lang.Integer.valueOf(i2)), C56390yDp.OLrzqt("value2", java.lang.Integer.valueOf(i3))));
        }
        if (i >= 86400) {
            if (i4 == 0) {
                return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.IPostMessageServiceStub, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", 24)));
            }
            return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.IPostMessageServiceDefault, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("value1", 24), C56390yDp.OLrzqt("value2", java.lang.Integer.valueOf(i4))));
        }
        if (i >= 3600) {
            if (i4 == 0) {
                return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.IPostMessageServiceStub, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.Integer.valueOf(i3))));
            }
            return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.IPostMessageServiceDefault, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("value1", java.lang.Integer.valueOf(i3)), C56390yDp.OLrzqt("value2", java.lang.Integer.valueOf(i4))));
        }
        if (i >= 60) {
            if (i5 == 0) {
                return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.IPostMessageServiceStubProxy, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.Integer.valueOf(i4))));
            }
            return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.ITrustedWebActivityCallback, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("value1", java.lang.Integer.valueOf(i4)), C56390yDp.OLrzqt("value2", java.lang.Integer.valueOf(i5))));
        }
        if (i5 != 0) {
            return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.areNotificationsEnabled, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.Integer.valueOf(i5))));
        }
        return z ? C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.areNotificationsEnabled, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.Integer.valueOf(i5)))) : "";
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0 || C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) {
            return "";
        }
        int iAhwBna = C33129mqd.AhwBna(str);
        int i = iAhwBna / RemoteMessageConst.DEFAULT_TTL;
        int i2 = (iAhwBna / IMarketApiService.SIXTY_MINUTES) % 24;
        int i3 = (iAhwBna / 60) % 60;
        int i4 = iAhwBna % 60;
        if (C33129mqd.copydefault((java.lang.Object) str, (java.lang.Object) 90000)) {
            if (i2 == 0) {
                return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.IPostMessageService, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.Integer.valueOf(i))));
            }
            return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.ICustomTabsServiceStub, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("value1", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("value2", java.lang.Integer.valueOf(i2))));
        }
        if (C33129mqd.copydefault(str, java.lang.Integer.valueOf(RemoteMessageConst.DEFAULT_TTL))) {
            if (i3 == 0) {
                return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.IPostMessageServiceStub, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", 24)));
            }
            return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.IPostMessageServiceDefault, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("value1", 24), C56390yDp.OLrzqt("value2", java.lang.Integer.valueOf(i3))));
        }
        if (C33129mqd.copydefault(str, java.lang.Integer.valueOf(IMarketApiService.SIXTY_MINUTES))) {
            if (i3 == 0) {
                return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.IPostMessageServiceStub, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.Integer.valueOf(i2))));
            }
            return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.IPostMessageServiceDefault, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("value1", java.lang.Integer.valueOf(i2)), C56390yDp.OLrzqt("value2", java.lang.Integer.valueOf(i3))));
        }
        if (!C33129mqd.copydefault((java.lang.Object) str, (java.lang.Object) 60)) {
            return C33129mqd.AEQbTJ(str, 0) ? C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.areNotificationsEnabled, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", str))) : "";
        }
        if (i4 == 0) {
            return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.IPostMessageServiceStubProxy, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", java.lang.Integer.valueOf(i3))));
        }
        return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.ITrustedWebActivityCallback, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("value1", java.lang.Integer.valueOf(i3)), C56390yDp.OLrzqt("value2", java.lang.Integer.valueOf(i4))));
    }

    public static /* synthetic */ java.lang.String getNumber$default(java.lang.Float f, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return EZpvd(f, i);
    }

    public static final java.lang.String EZpvd(java.lang.Float f, int i) {
        if (f == null || java.lang.Float.isNaN(f.floatValue())) {
            return "--";
        }
        java.lang.String str = java.lang.String.format("%." + i + "f", java.util.Arrays.copyOf(new java.lang.Object[]{f}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
