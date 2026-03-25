package com.okinc.okex.lite.home.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class OnboardingButtonActionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OnboardingButtonActionType[] $VALUES;
    public static final OnboardingButtonActionType CUSTOM_HANDLER = new OnboardingButtonActionType("CUSTOM_HANDLER", 0, 0);
    public static final OnboardingButtonActionType DEEPLINK = new OnboardingButtonActionType("DEEPLINK", 1, 1);
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OnboardingButtonActionType[] $values() {
        return new OnboardingButtonActionType[]{CUSTOM_HANDLER, DEEPLINK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OnboardingButtonActionType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private OnboardingButtonActionType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        OnboardingButtonActionType[] onboardingButtonActionTypeArr$values = $values();
        $VALUES = onboardingButtonActionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(onboardingButtonActionTypeArr$values);
    }

    public static OnboardingButtonActionType valueOf(String str) {
        return (OnboardingButtonActionType) Enum.valueOf(OnboardingButtonActionType.class, str);
    }

    public static OnboardingButtonActionType[] values() {
        return (OnboardingButtonActionType[]) $VALUES.clone();
    }
}
