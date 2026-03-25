package com.okinc.ok_kyc_core_api;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class PlaybookParameter {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlaybookParameter[] $VALUES;
    private final String value;
    public static final PlaybookParameter BASE_AMOUNT = new PlaybookParameter("BASE_AMOUNT", 0, "baseAmount");
    public static final PlaybookParameter QUOTE_AMOUNT = new PlaybookParameter("QUOTE_AMOUNT", 1, "quoteAmount");
    public static final PlaybookParameter TRAVEL_RULE_ID = new PlaybookParameter("TRAVEL_RULE_ID", 2, "travelRuleId");
    public static final PlaybookParameter QUESTION_TYPE_ID = new PlaybookParameter("QUESTION_TYPE_ID", 3, "questionTypeId");
    public static final PlaybookParameter COUNTRY_OF_RESIDENCE = new PlaybookParameter("COUNTRY_OF_RESIDENCE", 4, "countryOfResidence");
    public static final PlaybookParameter REFRESHTYPE = new PlaybookParameter("REFRESHTYPE", 5, "refreshType");
    public static final PlaybookParameter BUTTONTEXT = new PlaybookParameter("BUTTONTEXT", 6, "buttonText");
    public static final PlaybookParameter BUSINESSSOURCE = new PlaybookParameter("BUSINESSSOURCE", 7, "businessSource");
    public static final PlaybookParameter QUESTION_TYPE = new PlaybookParameter("QUESTION_TYPE", 8, "questionType");
    public static final PlaybookParameter ADDITIONALINFOFIELDS = new PlaybookParameter("ADDITIONALINFOFIELDS", 9, "additionalInfoFields");
    public static final PlaybookParameter POST_SIGNUP = new PlaybookParameter("POST_SIGNUP", 10, "postSignup");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlaybookParameter[] $values() {
        return new PlaybookParameter[]{BASE_AMOUNT, QUOTE_AMOUNT, TRAVEL_RULE_ID, QUESTION_TYPE_ID, COUNTRY_OF_RESIDENCE, REFRESHTYPE, BUTTONTEXT, BUSINESSSOURCE, QUESTION_TYPE, ADDITIONALINFOFIELDS, POST_SIGNUP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlaybookParameter> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private PlaybookParameter(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        PlaybookParameter[] playbookParameterArr$values = $values();
        $VALUES = playbookParameterArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(playbookParameterArr$values);
    }

    public static PlaybookParameter valueOf(String str) {
        return (PlaybookParameter) Enum.valueOf(PlaybookParameter.class, str);
    }

    public static PlaybookParameter[] values() {
        return (PlaybookParameter[]) $VALUES.clone();
    }
}
