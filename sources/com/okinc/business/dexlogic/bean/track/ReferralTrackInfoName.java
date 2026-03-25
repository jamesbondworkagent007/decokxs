package com.okinc.business.dexlogic.bean.track;

import com.okinc.liveness.lca.EopTrackEvent;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ReferralTrackInfoName {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ReferralTrackInfoName[] $VALUES;
    private final String info;
    public static final ReferralTrackInfoName DEX_MODE = new ReferralTrackInfoName("DEX_MODE", 0, "dex_mode");
    public static final ReferralTrackInfoName TOKEN_PAIR = new ReferralTrackInfoName("TOKEN_PAIR", 1, "token_pair");
    public static final ReferralTrackInfoName FEE_RATE_BEFORE_CODE = new ReferralTrackInfoName("FEE_RATE_BEFORE_CODE", 2, "fee_rate_before_code");
    public static final ReferralTrackInfoName INVITEE_DISCOUNT = new ReferralTrackInfoName("INVITEE_DISCOUNT", 3, "invitee_discount");
    public static final ReferralTrackInfoName BUTTON_NAME = new ReferralTrackInfoName("BUTTON_NAME", 4, EopTrackEvent.KEY_BUTTON_NAME);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ReferralTrackInfoName[] $values() {
        return new ReferralTrackInfoName[]{DEX_MODE, TOKEN_PAIR, FEE_RATE_BEFORE_CODE, INVITEE_DISCOUNT, BUTTON_NAME};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ReferralTrackInfoName> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInfo() {
        return this.info;
    }

    private ReferralTrackInfoName(String str, int i, String str2) {
        this.info = str2;
    }

    static {
        ReferralTrackInfoName[] referralTrackInfoNameArr$values = $values();
        $VALUES = referralTrackInfoNameArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(referralTrackInfoNameArr$values);
    }

    public static ReferralTrackInfoName valueOf(String str) {
        return (ReferralTrackInfoName) Enum.valueOf(ReferralTrackInfoName.class, str);
    }

    public static ReferralTrackInfoName[] values() {
        return (ReferralTrackInfoName[]) $VALUES.clone();
    }
}
