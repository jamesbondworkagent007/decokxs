package o;

import com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendItemBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pLc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38070pLc {
    public static final pKX AEQbTJ(@NotNull TokenRecommendItemBean tokenRecommendItemBean, @NotNull pKY pky) {
        Intrinsics.checkNotNullParameter(tokenRecommendItemBean, "");
        Intrinsics.checkNotNullParameter(pky, "");
        kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault = pky.copydefault(tokenRecommendItemBean);
        return new pKX(tokenRecommendItemBean.djBIcL(), tokenRecommendItemBean.AYXKKw(), tokenRecommendItemBean.copydefault(), pky.OLrzqt(tokenRecommendItemBean.AhwBna()), pairCopydefault.getSecond(), tokenRecommendItemBean.AEQbTJ(), pairCopydefault.getFirst());
    }
}
