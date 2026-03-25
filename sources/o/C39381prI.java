package o;

import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C38307pTy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.prI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C39381prI {
    public static final java.lang.String KWHzl(@NotNull C39379prG c39379prG) {
        java.util.List<java.lang.String> listOLrzqt;
        java.util.List<java.lang.String> listOLrzqt2;
        Intrinsics.checkNotNullParameter(c39379prG, "");
        C39382prJ c39382prJCopydefault = c39379prG.copydefault();
        java.lang.String str = null;
        java.util.List<java.lang.String> listOLrzqt3 = c39382prJCopydefault != null ? c39382prJCopydefault.OLrzqt() : null;
        if (listOLrzqt3 == null || listOLrzqt3.isEmpty()) {
            return "";
        }
        C39382prJ c39382prJCopydefault2 = c39379prG.copydefault();
        java.lang.String str2 = (c39382prJCopydefault2 == null || (listOLrzqt2 = c39382prJCopydefault2.OLrzqt()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(listOLrzqt2);
        C39382prJ c39382prJCopydefault3 = c39379prG.copydefault();
        if (c39382prJCopydefault3 != null && (listOLrzqt = c39382prJCopydefault3.OLrzqt()) != null) {
            str = (java.lang.String) CollectionsKt___CollectionsKt.AubY(listOLrzqt);
        }
        if (str2 == null || str == null) {
            return "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) str)) {
            return pTB.formatICUPercent$default(C33129mqd.EZpvd(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str2) / ((double) 100))), RoundingMode.UP, C38307pTy.Companion.KWHzl(0, 2), DisplaySign.AUTO, java.lang.Double.valueOf(100.0d), null, 16, null);
        }
        double d = 100;
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str2) / d));
        RoundingMode roundingMode = RoundingMode.UP;
        C38307pTy.Application application = C38307pTy.Companion;
        C38307pTy c38307pTyKWHzl = application.KWHzl(0, 2);
        DisplaySign displaySign = DisplaySign.AUTO;
        return ((java.lang.Object) pTB.formatICUPercent$default(bigDecimalEZpvd, roundingMode, c38307pTyKWHzl, displaySign, java.lang.Double.valueOf(100.0d), null, 16, null)) + "~" + ((java.lang.Object) pTB.formatICUPercent$default(C33129mqd.EZpvd(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str) / d)), roundingMode, application.KWHzl(0, 2), displaySign, java.lang.Double.valueOf(100.0d), null, 16, null));
    }
}
