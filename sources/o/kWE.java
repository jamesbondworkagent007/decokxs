package o;

import com.okinc.business.dexlogic.bean.MemeModeQuoteBean;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22412heq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kWE {
    public final C6968aZQ OLrzqt;

    @yCM
    public kWE(@NotNull C6968aZQ c6968aZQ) {
        Intrinsics.checkNotNullParameter(c6968aZQ, "");
        this.OLrzqt = c6968aZQ;
    }

    public final AbstractC22401hef OLrzqt(@NotNull java.lang.String str, @NotNull MemeModeQuoteBean memeModeQuoteBean, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull PresetUserConfigBean presetUserConfigBean, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, java.util.Map<java.lang.String, java.lang.String> map, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(memeModeQuoteBean, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(presetUserConfigBean, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return C25289its.OLrzqt(new AbstractC22412heq.TaskDescription(str, memeModeQuoteBean, str2, str3, presetUserConfigBean, str4, str5, str6, str7, str8, map, z));
    }

    public final void copydefault(AbstractC22401hef abstractC22401hef) {
        this.OLrzqt.copydefault(abstractC22401hef);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull ServiceFeeInfo serviceFeeInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(serviceFeeInfo, "");
        this.OLrzqt.copydefault(str, str2, str3, str4, str5, C22910hoK.getReferralParamInfoMap$default(str6, str7, serviceFeeInfo.getOriginalServiceFeeRate(), serviceFeeInfo.getDiscountedServiceFeeRate(), null, 16, null));
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull ServiceFeeInfo serviceFeeInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(serviceFeeInfo, "");
        this.OLrzqt.EZpvd(str, str3, str4, str2, str5, C22910hoK.getReferralParamInfoMap$default(str6, str7, serviceFeeInfo.getOriginalServiceFeeRate(), serviceFeeInfo.getDiscountedServiceFeeRate(), null, 16, null));
    }
}
