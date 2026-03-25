package o;

import com.okinc.business.invest_api.bean.DeFiRedeemParam;
import com.okinc.business.invest_api.bean.EarnRecommendApyBean;
import com.okinc.business.invest_api.bean.Web3CampaignBean;
import com.okinc.business.invest_api.bean.Web3CampaignResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iwZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25429iwZ extends InterfaceC43216rlB {
    void AEQbTJ(@NotNull android.content.Context context, long j, long j2, long j3, InterfaceC25422iwS interfaceC25422iwS);

    void AEQbTJ(@NotNull android.content.Context context, long j, long j2, java.lang.String str, java.lang.Integer num);

    void AEQbTJ(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2);

    androidx.fragment.app.Fragment EZpvd(long j, @NotNull java.lang.String str, boolean z);

    java.lang.String EZpvd(java.lang.String str, boolean z);

    void EZpvd(@NotNull android.content.Context context, int i, java.lang.String str, java.lang.String str2, java.lang.String str3);

    void EZpvd(@NotNull android.content.Context context, long j, long j2, long j3, InterfaceC25422iwS interfaceC25422iwS);

    void EZpvd(@NotNull android.content.Context context, long j, long j2, java.lang.String str);

    void EZpvd(android.os.Bundle bundle);

    void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str);

    java.lang.Object OLrzqt(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.util.List<EarnRecommendApyBean>> continuation);

    java.lang.Object OLrzqt(long j, @NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    AbstractC58185ywX<Web3CampaignResponse> copydefault(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, int i2);

    void copydefault(@NotNull android.content.Context context, @NotNull DeFiRedeemParam deFiRedeemParam, InterfaceC25423iwT interfaceC25423iwT);

    void copydefault(@NotNull android.content.Context context, @NotNull Web3CampaignBean web3CampaignBean, InterfaceC25483ixa interfaceC25483ixa);

    void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.iwZ$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ void goToInvestDetailPage$default(InterfaceC25429iwZ interfaceC25429iwZ, android.content.Context context, long j, long j2, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToInvestDetailPage");
            }
            if ((i & 8) != 0) {
                str = null;
            }
            interfaceC25429iwZ.EZpvd(context, j, j2, str);
        }

        public static /* synthetic */ void goToInvestDetailPage$default(InterfaceC25429iwZ interfaceC25429iwZ, android.content.Context context, long j, long j2, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToInvestDetailPage");
            }
            interfaceC25429iwZ.AEQbTJ(context, j, j2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num);
        }

        public static /* synthetic */ java.lang.String formatRatePercent$default(InterfaceC25429iwZ interfaceC25429iwZ, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatRatePercent");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return interfaceC25429iwZ.EZpvd(str, z);
        }

        public static /* synthetic */ void onHomepageTabAccessEvent$default(InterfaceC25429iwZ interfaceC25429iwZ, android.os.Bundle bundle, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onHomepageTabAccessEvent");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            interfaceC25429iwZ.EZpvd(bundle);
        }

        public static /* synthetic */ androidx.fragment.app.Fragment fetchProductListFragmentWithChainId$default(InterfaceC25429iwZ interfaceC25429iwZ, long j, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchProductListFragmentWithChainId");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return interfaceC25429iwZ.EZpvd(j, str, z);
        }
    }
}
