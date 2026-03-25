package o;

import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.led, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30622led {
    public static final DexAutoSlippageInfoParam copydefault(@NotNull AutoSlippageInfo autoSlippageInfo, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(autoSlippageInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String autoSlippage = autoSlippageInfo.getAutoSlippage();
        if (autoSlippage == null) {
            autoSlippage = "";
        }
        java.lang.String autoFromSlippage = autoSlippageInfo.getAutoFromSlippage();
        if (autoFromSlippage == null) {
            autoFromSlippage = "";
        }
        java.util.List<java.lang.String> shortcutFixSlippage = autoSlippageInfo.getShortcutFixSlippage();
        java.lang.Boolean supportMaxSlippage = autoSlippageInfo.getSupportMaxSlippage();
        boolean zBooleanValue = supportMaxSlippage != null ? supportMaxSlippage.booleanValue() : false;
        java.lang.String dynamicSlippageRangeMin = autoSlippageInfo.getDynamicSlippageRangeMin();
        java.lang.String str2 = dynamicSlippageRangeMin == null ? "" : dynamicSlippageRangeMin;
        java.lang.String dynamicSlippageRangeMax = autoSlippageInfo.getDynamicSlippageRangeMax();
        java.lang.String str3 = dynamicSlippageRangeMax == null ? "" : dynamicSlippageRangeMax;
        java.lang.String recommendSlippageRangeMin = autoSlippageInfo.getRecommendSlippageRangeMin();
        java.lang.String str4 = recommendSlippageRangeMin == null ? "" : recommendSlippageRangeMin;
        java.lang.String recommendSlippageRangeMax = autoSlippageInfo.getRecommendSlippageRangeMax();
        java.lang.String str5 = recommendSlippageRangeMax == null ? "" : recommendSlippageRangeMax;
        java.lang.String referenceSlippage = autoSlippageInfo.getReferenceSlippage();
        java.lang.String str6 = referenceSlippage == null ? "" : referenceSlippage;
        java.lang.String limitOrderDynamicSpecialSlippage = autoSlippageInfo.getLimitOrderDynamicSpecialSlippage();
        return new DexAutoSlippageInfoParam(autoSlippage, autoFromSlippage, (java.lang.String) null, (java.lang.String) null, shortcutFixSlippage, zBooleanValue, str2, str3, str4, str5, str6, limitOrderDynamicSpecialSlippage == null ? "" : limitOrderDynamicSpecialSlippage, i, str, 12, (DefaultConstructorMarker) null);
    }
}
