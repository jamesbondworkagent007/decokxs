package com.okinc.business.web3pay.lib.features.campaign.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class CampaignGuideCtaType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CampaignGuideCtaType[] $VALUES;
    public static final StateListAnimator Companion;
    private final int value;
    public static final CampaignGuideCtaType UNKNOWN = new CampaignGuideCtaType("UNKNOWN", 0, -1);
    public static final CampaignGuideCtaType CONVERT = new CampaignGuideCtaType("CONVERT", 1, 1);
    public static final CampaignGuideCtaType ADD = new CampaignGuideCtaType("ADD", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CampaignGuideCtaType[] $values() {
        return new CampaignGuideCtaType[]{UNKNOWN, CONVERT, ADD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CampaignGuideCtaType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private CampaignGuideCtaType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        CampaignGuideCtaType[] campaignGuideCtaTypeArr$values = $values();
        $VALUES = campaignGuideCtaTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(campaignGuideCtaTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.campaign.model.CampaignGuideCtaType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final CampaignGuideCtaType AEQbTJ(int i) {
            CampaignGuideCtaType campaignGuideCtaType;
            CampaignGuideCtaType[] campaignGuideCtaTypeArrValues = CampaignGuideCtaType.values();
            int length = campaignGuideCtaTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    campaignGuideCtaType = null;
                    break;
                }
                campaignGuideCtaType = campaignGuideCtaTypeArrValues[i2];
                if (campaignGuideCtaType.getValue() == i) {
                    break;
                }
                i2++;
            }
            return campaignGuideCtaType == null ? CampaignGuideCtaType.UNKNOWN : campaignGuideCtaType;
        }
    }

    public static CampaignGuideCtaType valueOf(String str) {
        return (CampaignGuideCtaType) Enum.valueOf(CampaignGuideCtaType.class, str);
    }

    public static CampaignGuideCtaType[] values() {
        return (CampaignGuideCtaType[]) $VALUES.clone();
    }
}
