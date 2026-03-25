package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.sWj;

/* JADX INFO: renamed from: o.sTw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44544sTw {
    public static final C44544sTw OLrzqt = new C44544sTw();

    private C44544sTw() {
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        java.lang.String strCopydefault;
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str);
            if (fieldNames == null) {
                return "";
            }
            long j = 1000;
            long jLongValue = fieldNames.longValue() * j;
            int iCurrentTimeMillis = (int) ((java.lang.System.currentTimeMillis() - jLongValue) / j);
            if (iCurrentTimeMillis < 0) {
                iCurrentTimeMillis = 0;
            }
            android.content.res.Resources resources = C43246rlf.OLrzqt.valueOf().getResources();
            if (iCurrentTimeMillis < 60) {
                Intrinsics.copydefault(resources);
                strCopydefault = pTD.copydefault(resources, sWj.StateListAnimator.KWHzl, iCurrentTimeMillis, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iCurrentTimeMillis))));
            } else if (iCurrentTimeMillis < 3600) {
                int i = iCurrentTimeMillis / 60;
                Intrinsics.copydefault(resources);
                strCopydefault = pTD.copydefault(resources, sWj.StateListAnimator.OLrzqt, i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(i))));
            } else if (iCurrentTimeMillis < 86400) {
                int i2 = iCurrentTimeMillis / IMarketApiService.SIXTY_MINUTES;
                Intrinsics.copydefault(resources);
                strCopydefault = pTD.copydefault(resources, sWj.StateListAnimator.EZpvd, i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(i2))));
            } else if (iCurrentTimeMillis < 604800) {
                int i3 = iCurrentTimeMillis / RemoteMessageConst.DEFAULT_TTL;
                Intrinsics.copydefault(resources);
                strCopydefault = pTD.copydefault(resources, sWj.StateListAnimator.AEQbTJ, i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(i3))));
            } else {
                java.lang.String str2 = new SimpleDateFormat("dd/MM/yyyy", java.util.Locale.getDefault()).format(new Date(jLongValue));
                Intrinsics.checkNotNullExpressionValue(str2, "");
                return str2;
            }
            return strCopydefault;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final java.lang.String OLrzqt(long j, java.lang.String str) {
        return pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), sWj.StateListAnimator.copydefault, (int) j, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", str)));
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return C59449zhJ.replace$default(C33070mpX.AYXKKw(sWj.Activity.iwGUEr), "{num}", str, false, 4, (java.lang.Object) null);
    }

    public final java.lang.String copydefault(long j, boolean z) {
        C38307pTy c38307pTyEZpvd;
        if (C33129mqd.gEmmrt(java.lang.Long.valueOf(j), 10000)) {
            c38307pTyEZpvd = C38307pTy.Companion.EZpvd(0);
        } else {
            c38307pTyEZpvd = C38307pTy.Companion.EZpvd(2);
        }
        java.lang.String iCUCompact$default = pTB.formatICUCompact$default(java.lang.Long.valueOf(j), null, c38307pTyEZpvd, null, null, 13, null);
        if (z) {
            return copydefault(iCUCompact$default);
        }
        return OLrzqt(j, iCUCompact$default);
    }
}
