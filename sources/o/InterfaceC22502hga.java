package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dex.api.bean.LimitParam;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeConfig;
import com.okinc.business.dexlogic.main.limmitorder.bean.BizMode;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitSuggestCoinBean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC22502hga {
    AbstractC58185ywX<java.util.List<ExpireTimeConfig>> EZpvd(@NotNull BizMode bizMode);

    AbstractC58185ywX<LimitSuggestCoinBean> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3);

    AbstractC58185ywX<LimitCalResult> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7);

    MutableLiveData<LimitParam> OLrzqt();

    java.util.List<ExpireTimeConfig> OLrzqt(@NotNull BizMode bizMode);

    /* JADX INFO: renamed from: o.hga$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ AbstractC58185ywX getExpireTimeConfig$default(InterfaceC22502hga interfaceC22502hga, BizMode bizMode, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getExpireTimeConfig");
            }
            if ((i & 1) != 0) {
                bizMode = BizMode.LIMIT_ORDER;
            }
            return interfaceC22502hga.EZpvd(bizMode);
        }

        public static /* synthetic */ java.util.List getExpireTimeList$default(InterfaceC22502hga interfaceC22502hga, BizMode bizMode, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getExpireTimeList");
            }
            if ((i & 1) != 0) {
                bizMode = BizMode.LIMIT_ORDER;
            }
            return interfaceC22502hga.OLrzqt(bizMode);
        }

        public static /* synthetic */ AbstractC58185ywX coinDetailLimitSuggest$default(InterfaceC22502hga interfaceC22502hga, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: coinDetailLimitSuggest");
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return interfaceC22502hga.KWHzl(str, str2, str3);
        }
    }
}
