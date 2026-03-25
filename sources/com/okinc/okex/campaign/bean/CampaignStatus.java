package com.okinc.okex.campaign.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class CampaignStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CampaignStatus[] $VALUES;
    public static final CampaignStatus ONGOING = new CampaignStatus("ONGOING", 0);
    public static final CampaignStatus ENDED = new CampaignStatus("ENDED", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CampaignStatus[] $values() {
        return new CampaignStatus[]{ONGOING, ENDED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CampaignStatus> getEntries() {
        return $ENTRIES;
    }

    private CampaignStatus(String str, int i) {
    }

    static {
        CampaignStatus[] campaignStatusArr$values = $values();
        $VALUES = campaignStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(campaignStatusArr$values);
    }

    public static CampaignStatus valueOf(String str) {
        return (CampaignStatus) Enum.valueOf(CampaignStatus.class, str);
    }

    public static CampaignStatus[] values() {
        return (CampaignStatus[]) $VALUES.clone();
    }
}
