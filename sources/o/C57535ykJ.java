package o;

import com.okinc.wholesale.bean.VipLandingPageVersionBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57535ykJ extends AbstractC43215rlA implements kOH {
    @Override // o.kOH
    public void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C43176rkO.AEQbTJ.OLrzqt(context, "/growth/route", C56424yEw.gEmmrt(C56390yDp.OLrzqt("to", "OKGVIPLandingHomePage"), C56390yDp.OLrzqt("theme", "dark"), C56390yDp.OLrzqt("StatusBarStyle", "1"), C56390yDp.OLrzqt("pageanim", "rightToLeft"), C56390yDp.OLrzqt("minversion", EZpvd()), C56390yDp.OLrzqt("from", "UnlockTrialSheet")));
    }

    @Override // o.kOH
    public void OLrzqt(@NotNull android.content.Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        C43176rkO.AEQbTJ.OLrzqt(context, "/growth/route", C56424yEw.gEmmrt(C56390yDp.OLrzqt("to", "OKGVIPLandingHomePage"), C56390yDp.OLrzqt("theme", "dark"), C56390yDp.OLrzqt("StatusBarStyle", "1"), C56390yDp.OLrzqt("pageanim", "rightToLeft"), C56390yDp.OLrzqt("minversion", EZpvd()), C56390yDp.OLrzqt("from", "UnlockTrialSheet"), C56390yDp.OLrzqt("showOtherWays", java.lang.Boolean.valueOf(z))));
    }

    public final java.lang.String EZpvd() {
        java.lang.String vipLandingPageVersion;
        VipLandingPageVersionBean vipLandingPageVersionBean = (VipLandingPageVersionBean) C48787ucK.AEQbTJ.EZpvd("wholesaleConfig", VipLandingPageVersionBean.class);
        if (vipLandingPageVersionBean == null || (vipLandingPageVersion = vipLandingPageVersionBean.getVipLandingPageVersion()) == null) {
            vipLandingPageVersion = "";
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) vipLandingPageVersion)) {
            vipLandingPageVersion = "6.130.2";
        }
        pUU.KWHzl("VipLandingMinVersion", "config is: " + vipLandingPageVersion);
        return vipLandingPageVersion;
    }
}
