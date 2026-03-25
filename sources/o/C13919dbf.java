package o;

import com.okinc.business.defi.biz.net.bean.BannerInfoNew;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dbf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13919dbf {
    public static final int copydefault(@NotNull BannerInfoNew bannerInfoNew) {
        Intrinsics.checkNotNullParameter(bannerInfoNew, "");
        java.lang.Integer num = SPUtils.getInt("banner_click_key_" + bannerInfoNew.getId(), 0);
        Intrinsics.copydefault(num);
        return num.intValue();
    }

    public static final void EZpvd(@NotNull BannerInfoNew bannerInfoNew) {
        Intrinsics.checkNotNullParameter(bannerInfoNew, "");
        java.lang.String str = "banner_click_key_" + bannerInfoNew.getId();
        SPUtils.put(str, java.lang.Integer.valueOf(SPUtils.getInt(str, 0).intValue() + 1));
    }
}
