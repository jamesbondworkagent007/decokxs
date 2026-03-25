package o;

import com.okinc.components.track.bean.EventParamsList;
import com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendInfoBean;
import com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendItemBean;
import com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendTotalBean;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pLa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C38068pLa {
    public final InterfaceC38065pKy AEQbTJ;
    public final InterfaceC33171mrS KWHzl;
    public final pKY OLrzqt;

    @yCM
    public C38068pLa(@NotNull InterfaceC33171mrS interfaceC33171mrS, @NotNull InterfaceC38065pKy interfaceC38065pKy, @NotNull pKY pky) {
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        Intrinsics.checkNotNullParameter(interfaceC38065pKy, "");
        Intrinsics.checkNotNullParameter(pky, "");
        this.KWHzl = interfaceC33171mrS;
        this.AEQbTJ = interfaceC38065pKy;
        this.OLrzqt = pky;
    }

    public final void EZpvd(@NotNull TokenRecommendInfoBean tokenRecommendInfoBean, @NotNull TokenRecommendTotalBean tokenRecommendTotalBean) {
        Intrinsics.checkNotNullParameter(tokenRecommendInfoBean, "");
        Intrinsics.checkNotNullParameter(tokenRecommendTotalBean, "");
        InterfaceC38065pKy interfaceC38065pKy = this.AEQbTJ;
        EventParamsList eventParamsList = new EventParamsList();
        eventParamsList.put("location", EZpvd() + " " + tokenRecommendInfoBean.getComponentType().getComponentName(), true);
        EventParamsList.put$default(eventParamsList, "location_token_shortname", tokenRecommendInfoBean.getTokenPair(), false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, tokenRecommendInfoBean.getTrackBean().getOrderType(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "rec_text_id", tokenRecommendTotalBean.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "rec_text_content", tokenRecommendTotalBean.OLrzqt(), false, 4, null);
        int i = 0;
        for (java.lang.Object obj : tokenRecommendTotalBean.KWHzl()) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            TokenRecommendItemBean tokenRecommendItemBean = (TokenRecommendItemBean) obj;
            EventParamsList.put$default(eventParamsList, "impression_token_" + i2, tokenRecommendItemBean.AYXKKw(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "impression_token_" + i2 + "_price_percent", this.OLrzqt.copydefault(tokenRecommendItemBean).getSecond(), false, 4, null);
            i = i2;
        }
        EventParamsList.put$default(eventParamsList, "transaction_id", tokenRecommendInfoBean.getTrackBean().getTransactionId(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "ai_model_version", tokenRecommendTotalBean.copydefault(), false, 4, null);
        Unit unit = Unit.INSTANCE;
        interfaceC38065pKy.OLrzqt("TokenRecommendModule_Full_Token_View", eventParamsList);
    }

    public final void EZpvd(@NotNull TokenRecommendInfoBean tokenRecommendInfoBean, @NotNull TokenRecommendItemBean tokenRecommendItemBean, @NotNull TokenRecommendTotalBean tokenRecommendTotalBean) {
        Intrinsics.checkNotNullParameter(tokenRecommendInfoBean, "");
        Intrinsics.checkNotNullParameter(tokenRecommendItemBean, "");
        Intrinsics.checkNotNullParameter(tokenRecommendTotalBean, "");
        InterfaceC38065pKy interfaceC38065pKy = this.AEQbTJ;
        EventParamsList eventParamsList = new EventParamsList();
        eventParamsList.put("location", EZpvd() + " " + tokenRecommendInfoBean.getComponentType().getComponentName(), true);
        EventParamsList.put$default(eventParamsList, "location_token_shortname", tokenRecommendInfoBean.getTokenPair(), false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, tokenRecommendInfoBean.getTrackBean().getOrderType(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "rec_text_id", tokenRecommendTotalBean.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "rec_text_content", tokenRecommendTotalBean.OLrzqt(), false, 4, null);
        int i = 0;
        int i2 = 0;
        for (java.lang.Object obj : tokenRecommendTotalBean.KWHzl()) {
            int i3 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            TokenRecommendItemBean tokenRecommendItemBean2 = (TokenRecommendItemBean) obj;
            EventParamsList.put$default(eventParamsList, "impression_token_" + i3, tokenRecommendItemBean2.AYXKKw(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "impression_token_" + i3 + "_price_percent", this.OLrzqt.copydefault(tokenRecommendItemBean2).getSecond(), false, 4, null);
            if (tokenRecommendItemBean.djBIcL() == tokenRecommendItemBean2.djBIcL()) {
                i2 = i3;
            }
            i = i3;
        }
        EventParamsList.put$default(eventParamsList, "click_token_name", tokenRecommendItemBean.AYXKKw(), false, 4, null);
        eventParamsList.put("click_token_impression_order", java.lang.String.valueOf(i2), true);
        EventParamsList.put$default(eventParamsList, "transaction_id", tokenRecommendInfoBean.getTrackBean().getTransactionId(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "ai_model_version", tokenRecommendTotalBean.copydefault(), false, 4, null);
        Unit unit = Unit.INSTANCE;
        interfaceC38065pKy.OLrzqt("TokenRecommendModule_Full_Token_Click", eventParamsList);
    }

    public final void copydefault(@NotNull TokenRecommendInfoBean tokenRecommendInfoBean) {
        Intrinsics.checkNotNullParameter(tokenRecommendInfoBean, "");
        InterfaceC38065pKy interfaceC38065pKy = this.AEQbTJ;
        EventParamsList eventParamsList = new EventParamsList();
        EventParamsList.put$default(eventParamsList, "click_token_name", tokenRecommendInfoBean.getToken(), false, 4, null);
        Unit unit = Unit.INSTANCE;
        interfaceC38065pKy.OLrzqt("LiteAssets_Token_Recommendation_Scroll", eventParamsList);
    }

    public final java.lang.String EZpvd() {
        return this.KWHzl.ejfBZ() ? "LITE" : this.KWHzl.getFieldNames() ? "PRO" : this.KWHzl.fIwbmz() ? "WEB" : "";
    }
}
