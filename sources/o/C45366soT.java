package o;

import com.okinc.core.util.SPUtils;
import com.okinc.di.LocalizeDIModule;
import com.okinc.okuser.data.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.soT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45366soT {
    public static final C45366soT KWHzl = new C45366soT();

    private C45366soT() {
    }

    public final java.lang.String OLrzqt() {
        java.lang.String strCopydefault;
        User userOLrzqt = ((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC47230tmC.class)).fmB().OLrzqt();
        if (userOLrzqt == null || (strCopydefault = userOLrzqt.getUid()) == null) {
            strCopydefault = xVW.copydefault();
        }
        if (strCopydefault == null) {
            return null;
        }
        return strCopydefault + "_config";
    }

    public final pTU copydefault() {
        return ((LocalizeDIModule.Activity) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), LocalizeDIModule.Activity.class)).gkJEwt();
    }

    public final void AhwBna() {
        long jCopydefault = C45359soM.copydefault.copydefault();
        SPUtils.put("KEY_SUPPORT_CENTER_LAST_ENGAGEMENT_TIMESTAMP", java.lang.Long.valueOf(jCopydefault), OLrzqt());
    }

    public final long AEQbTJ() {
        java.lang.Long l = SPUtils.getLong("KEY_SUPPORT_CENTER_LAST_ENGAGEMENT_TIMESTAMP", 0L, OLrzqt());
        Intrinsics.checkNotNullExpressionValue(l, "");
        return l.longValue();
    }

    public final java.lang.String EZpvd() {
        return copydefault().OLrzqt().getLanguageCode();
    }

    public final void AYXKKw() {
        SPUtils.put("KEY_LAST_SUPPORT_BANNER_LANGUAGE", EZpvd(), OLrzqt());
    }

    public final boolean KWHzl() {
        return !Intrinsics.EZpvd((java.lang.Object) SPUtils.getString("KEY_LAST_SUPPORT_BANNER_LANGUAGE", "", OLrzqt()), (java.lang.Object) EZpvd());
    }
}
