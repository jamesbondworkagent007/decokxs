package o;

import android.graphics.Color;
import com.okinc.kyc.api.biz.bean.BannerModelBean;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.swl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45766swl {
    public static final C45759swe copydefault(@NotNull BannerModelBean bannerModelBean) {
        Intrinsics.checkNotNullParameter(bannerModelBean, "");
        return new C45759swe(AEQbTJ(bannerModelBean.getContent().getBackgroundColorLight(), C52761wXj.Activity.UCQKYV), AEQbTJ(bannerModelBean.getContent().getBackgroundColorDark(), C52761wXj.Activity.UCQKYV), bannerModelBean.getContent().getIcon(), AEQbTJ(bannerModelBean.getContent().getIconTintColorLight(), C52761wXj.Activity.getSerial), AEQbTJ(bannerModelBean.getContent().getIconTintColorDark(), C52761wXj.Activity.getSerial), bannerModelBean.getContent().getContent(), AEQbTJ(bannerModelBean.getContent().getTextColorDark(), C52761wXj.Activity.getSerial), AEQbTJ(bannerModelBean.getContent().getTextColorLight(), C52761wXj.Activity.getSerial), bannerModelBean.getContent().getPosition(), bannerModelBean.getContent().isSticky());
    }

    public static final int AEQbTJ(java.lang.String str, int i) {
        try {
            return Color.parseColor(str);
        } catch (java.lang.Exception unused) {
            return i;
        }
    }
}
