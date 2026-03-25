package com.okinc.ok_kyc_core_api;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class Playbook {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Playbook[] $VALUES;
    private final String featureUri;
    private final String value;
    public static final Playbook USER_CENTER_KYC = new Playbook("USER_CENTER_KYC", 0, "user_center_kyc", "kyc");
    public static final Playbook OKCOIN_USER_CENTER_KYC = new Playbook("OKCOIN_USER_CENTER_KYC", 1, "okcoin_user_center_kyc", "kyc");
    public static final Playbook BUY_WITH_CARD = new Playbook("BUY_WITH_CARD", 2, "buy_with_card", "kyc");
    public static final Playbook F2C_WITHDRAW_KYC = new Playbook("F2C_WITHDRAW_KYC", 3, "f2c_withdraw_kyc", "kyc");
    public static final Playbook KYC_REFRESH = new Playbook("KYC_REFRESH", 4, "okx_app_kyc", "kyc");
    public static final Playbook PROMOTION_ADVANCE_KYC_ONBOARDING = new Playbook("PROMOTION_ADVANCE_KYC_ONBOARDING", 5, "promotion_advance_kyc_onboarding", "kyc");
    public static final Playbook NOTABENE_OKCOIN = new Playbook("NOTABENE_OKCOIN", 6, "okcoin_common_notabene", "notabene");
    public static final Playbook NOTABENE_OKX = new Playbook("NOTABENE_OKX", 7, "okx_common_notabene", "notabene");
    public static final Playbook EDD = new Playbook("EDD", 8, "edd", "kyc");
    public static final Playbook OKX_APP_KYC = new Playbook("OKX_APP_KYC", 9, "okx_app_kyc", "kyc");
    public static final Playbook OKX_APP_KYC_OVERVIEW = new Playbook("OKX_APP_KYC_OVERVIEW", 10, "okx_app_kyc_overview", "kyc");
    public static final Playbook OKX_APP_ADDITIONAL_INFO = new Playbook("OKX_APP_ADDITIONAL_INFO", 11, "okx_app_additional_info", "kyc");
    public static final Playbook TRAVEL_RULE_INTERNAL = new Playbook("TRAVEL_RULE_INTERNAL", 12, "okx_travel_internal", "notabene/travelruleinternal");
    public static final Playbook OKX_QUESTION = new Playbook("OKX_QUESTION", 13, "okx_app_question", "question");
    public static final Playbook OKX_APP_UK_CATEGORIZATION = new Playbook("OKX_APP_UK_CATEGORIZATION", 14, "okx_app_categorization", "question");
    public static final Playbook DERIVATIVE_AGREEMENT = new Playbook("DERIVATIVE_AGREEMENT", 15, "okx_app_derivative_agreement", "question");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Playbook[] $values() {
        return new Playbook[]{USER_CENTER_KYC, OKCOIN_USER_CENTER_KYC, BUY_WITH_CARD, F2C_WITHDRAW_KYC, KYC_REFRESH, PROMOTION_ADVANCE_KYC_ONBOARDING, NOTABENE_OKCOIN, NOTABENE_OKX, EDD, OKX_APP_KYC, OKX_APP_KYC_OVERVIEW, OKX_APP_ADDITIONAL_INFO, TRAVEL_RULE_INTERNAL, OKX_QUESTION, OKX_APP_UK_CATEGORIZATION, DERIVATIVE_AGREEMENT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Playbook> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeatureUri() {
        return this.featureUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private Playbook(String str, int i, String str2, String str3) {
        this.value = str2;
        this.featureUri = str3;
    }

    static {
        Playbook[] playbookArr$values = $values();
        $VALUES = playbookArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(playbookArr$values);
    }

    public static Playbook valueOf(String str) {
        return (Playbook) Enum.valueOf(Playbook.class, str);
    }

    public static Playbook[] values() {
        return (Playbook[]) $VALUES.clone();
    }
}
