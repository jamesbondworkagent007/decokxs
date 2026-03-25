package o;

import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.ui.finality_provider.InvestFinalityProviderItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class iPN {
    public static final InvestFinalityProviderItem OLrzqt(@NotNull InvestValidatorListItems investValidatorListItems) {
        Intrinsics.checkNotNullParameter(investValidatorListItems, "");
        java.lang.String totalDelegations = investValidatorListItems.getTotalDelegations();
        java.lang.String str = totalDelegations == null ? "" : totalDelegations;
        java.lang.String commission = investValidatorListItems.getCommission();
        java.lang.String str2 = commission == null ? "" : commission;
        java.lang.String validatorName = investValidatorListItems.getValidatorName();
        java.lang.String str3 = validatorName == null ? "" : validatorName;
        boolean recommended = investValidatorListItems.getRecommended();
        java.lang.String providerPubkey = investValidatorListItems.getProviderPubkey();
        return new InvestFinalityProviderItem(str, str2, str3, recommended, providerPubkey == null ? "" : providerPubkey, false, 32, (DefaultConstructorMarker) null);
    }
}
