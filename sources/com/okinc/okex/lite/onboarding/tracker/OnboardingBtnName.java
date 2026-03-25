package com.okinc.okex.lite.onboarding.tracker;

import com.okinc.business.invest_biz.data.bean.InvestButtonAction;
import com.okinc.liveness.lca.EopTrackEvent;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class OnboardingBtnName {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OnboardingBtnName[] $VALUES;
    private final String btnName;
    public static final OnboardingBtnName GET_STARTED = new OnboardingBtnName("GET_STARTED", 0, "get_started");
    public static final OnboardingBtnName LOG_IN = new OnboardingBtnName("LOG_IN", 1, "log_in");
    public static final OnboardingBtnName START_TRADING = new OnboardingBtnName("START_TRADING", 2, "start_trading");
    public static final OnboardingBtnName EXPERIENCE_IT = new OnboardingBtnName("EXPERIENCE_IT", 3, "experience_it");
    public static final OnboardingBtnName CLOSE = new OnboardingBtnName(InvestButtonAction.ACTION_CALLBACK_CLOSE, 4, EopTrackEvent.CLOSE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OnboardingBtnName[] $values() {
        return new OnboardingBtnName[]{GET_STARTED, LOG_IN, START_TRADING, EXPERIENCE_IT, CLOSE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OnboardingBtnName> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBtnName() {
        return this.btnName;
    }

    private OnboardingBtnName(String str, int i, String str2) {
        this.btnName = str2;
    }

    static {
        OnboardingBtnName[] onboardingBtnNameArr$values = $values();
        $VALUES = onboardingBtnNameArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(onboardingBtnNameArr$values);
    }

    public static OnboardingBtnName valueOf(String str) {
        return (OnboardingBtnName) Enum.valueOf(OnboardingBtnName.class, str);
    }

    public static OnboardingBtnName[] values() {
        return (OnboardingBtnName[]) $VALUES.clone();
    }
}
