package o;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tTZ {
    public static final tTZ EZpvd = new tTZ();
    public static final java.lang.String[] OLrzqt = {"", "k", "M", "B", ExifInterface.GPS_DIRECTION_TRUE};
    public static final int copydefault = 8;

    private tTZ() {
    }

    public static /* synthetic */ java.lang.String formatPrettyNumber$default(tTZ ttz, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return ttz.KWHzl(str, i);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String plainString = C33129mqd.EZpvd(str).abs().toPlainString();
        int i2 = 0;
        while (C33129mqd.copydefault((java.lang.Object) plainString, (java.lang.Object) 1000) && i2 < yDV.zLjUOn(OLrzqt)) {
            plainString = C33129mqd.divS$default(plainString, 1000, null, null, null, 14, null);
            i2++;
        }
        java.lang.String plainString2 = C33129mqd.EZpvd(plainString).setScale(i, RoundingMode.HALF_UP).toPlainString();
        java.lang.String str2 = "%s%s";
        if (C33129mqd.gEmmrt(str, 0)) {
            str2 = "-%s%s";
        }
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str3 = java.lang.String.format(str2, java.util.Arrays.copyOf(new java.lang.Object[]{plainString2, OLrzqt[i2]}, 2));
        Intrinsics.checkNotNullExpressionValue(str3, "");
        return str3;
    }

    public static /* synthetic */ java.lang.String formatPrettyNumber$default(tTZ ttz, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        return ttz.AEQbTJ(i, i2);
    }

    public final java.lang.String AEQbTJ(int i, int i2) {
        return KWHzl(java.lang.String.valueOf(i), i2);
    }

    public static /* synthetic */ java.lang.String getOrderRatioStr$default(tTZ ttz, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return ttz.AEQbTJ(str, z);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return (z && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? "--" : pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) str), RoundingMode.UP, C38307pTy.Companion.KWHzl(2, 2), DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 16, null);
    }

    public static /* synthetic */ java.lang.String pnlFormatTruncate$default(tTZ ttz, java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        return ttz.AEQbTJ(obj, i);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(obj, "");
        return C33129mqd.gEmmrt(pTB.OLrzqt(obj).setScale(i, RoundingMode.DOWN));
    }

    public final java.lang.String KWHzl(@NotNull android.content.Context context, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(context, "");
        if (l == null) {
            return "";
        }
        int iCurrentTimeMillis = (int) ((java.lang.System.currentTimeMillis() - l.longValue()) / ((long) 1000));
        if (iCurrentTimeMillis < 0) {
            iCurrentTimeMillis = 0;
        }
        if (iCurrentTimeMillis < 60) {
            return C33069mpW.KWHzl(context, C47501trL.Fragment.invokespecialRtjmuc, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iCurrentTimeMillis))));
        }
        if (iCurrentTimeMillis < 3600) {
            return C33069mpW.KWHzl(context, C47501trL.Fragment.invokespecialaGOrKO, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iCurrentTimeMillis / 60))));
        }
        if (iCurrentTimeMillis < 86400) {
            return C33069mpW.KWHzl(context, C47501trL.Fragment.invokespecialRuDPQV, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iCurrentTimeMillis / IMarketApiService.SIXTY_MINUTES))));
        }
        if (iCurrentTimeMillis < 604800) {
            return C33069mpW.KWHzl(context, C47501trL.Fragment.invokespecialaVhqwO, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iCurrentTimeMillis / RemoteMessageConst.DEFAULT_TTL))));
        }
        return pTA.formatSimpleDateTime$default(new Date(l.longValue()), null, 1, null);
    }
}
