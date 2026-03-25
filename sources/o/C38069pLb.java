package o;

import com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendComponent;
import com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendReqBean;
import com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendTotalBean;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pLb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C38069pLb {
    public final ConcurrentHashMap<java.lang.String, TokenRecommendTotalBean> AEQbTJ;
    public final InterfaceC33171mrS KWHzl;

    @yCM
    public C38069pLb(@NotNull InterfaceC33171mrS interfaceC33171mrS) {
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        this.KWHzl = interfaceC33171mrS;
        this.AEQbTJ = new ConcurrentHashMap<>(16);
    }

    public final void AEQbTJ(@NotNull TokenRecommendReqBean tokenRecommendReqBean, @NotNull TokenRecommendTotalBean tokenRecommendTotalBean) {
        Intrinsics.checkNotNullParameter(tokenRecommendReqBean, "");
        Intrinsics.checkNotNullParameter(tokenRecommendTotalBean, "");
        this.AEQbTJ.put(EZpvd(tokenRecommendReqBean), tokenRecommendTotalBean);
    }

    public final java.lang.String EZpvd(TokenRecommendReqBean tokenRecommendReqBean) {
        int iOLrzqt = tokenRecommendReqBean.OLrzqt();
        int iAEQbTJ = tokenRecommendReqBean.AEQbTJ();
        java.lang.String strCopydefault = tokenRecommendReqBean.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        java.lang.String strEZpvd = tokenRecommendReqBean.EZpvd();
        return iOLrzqt + "_" + iAEQbTJ + "_" + strCopydefault + "_" + (strEZpvd != null ? strEZpvd : "");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TokenRecommendReqBean KWHzl(TokenRecommendComponent tokenRecommendComponent, java.lang.String str, java.lang.String str2) {
        int i;
        if (!this.KWHzl.ejfBZ()) {
            if (this.KWHzl.getFieldNames()) {
                i = 2;
            } else {
                i = this.KWHzl.fIwbmz() ? 3 : 1;
            }
        }
        return new TokenRecommendReqBean(i, tokenRecommendComponent != null ? tokenRecommendComponent.getId() : 0, str, str2);
    }
}
