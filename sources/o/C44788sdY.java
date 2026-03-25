package o;

import com.okinc.okex.campaign.bean.Campaign;
import com.okinc.okex.campaign.bean.CampaignStatus;
import com.okinc.okex.campaign.ui.displaymodels.CampaignDisplayModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sdY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44788sdY {
    public static final CampaignDisplayModel EZpvd(@NotNull Campaign campaign, @NotNull CampaignStatus campaignStatus) {
        Intrinsics.checkNotNullParameter(campaign, "");
        Intrinsics.checkNotNullParameter(campaignStatus, "");
        return new CampaignDisplayModel(campaign.getCampaignTitle(), campaign.getCampaignEndTime(), campaign.getSlug(), campaignStatus, new java.util.ArrayList(campaign.getRedirectList()));
    }
}
