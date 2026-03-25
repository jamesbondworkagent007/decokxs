package o;

import com.okinc.business.web3pay.lib.features.campaign.model.CampaignDesc;
import com.okinc.business.web3pay.lib.features.campaign.model.CampaignGuide;
import com.okinc.business.web3pay.lib.features.campaign.model.CampaignGuideCtaType;
import com.okinc.business.web3pay.lib.features.campaign.model.CampaignGuideResponse;
import com.okinc.business.web3pay.lib.features.campaign.model.Cta;
import com.okinc.business.web3pay.lib.features.campaign.model.CtaApiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31237lqI {
    public static final CampaignGuide EZpvd(@NotNull CampaignGuideResponse campaignGuideResponse) {
        Intrinsics.checkNotNullParameter(campaignGuideResponse, "");
        CampaignDesc campaignDesc = campaignGuideResponse.getCampaignDesc();
        CtaApiModel cta = campaignGuideResponse.getCta();
        return new CampaignGuide(campaignDesc, cta != null ? copydefault(cta) : null);
    }

    public static final Cta copydefault(@NotNull CtaApiModel ctaApiModel) {
        Intrinsics.checkNotNullParameter(ctaApiModel, "");
        return new Cta(ctaApiModel.getText(), ctaApiModel.getDeepLink(), CampaignGuideCtaType.Companion.AEQbTJ(ctaApiModel.getType()));
    }
}
