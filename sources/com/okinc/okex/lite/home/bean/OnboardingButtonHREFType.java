package com.okinc.okex.lite.home.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class OnboardingButtonHREFType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OnboardingButtonHREFType[] $VALUES;
    public static final Activity Companion;
    private final String type;
    public static final OnboardingButtonHREFType NA = new OnboardingButtonHREFType("NA", 0, "");
    public static final OnboardingButtonHREFType KYC = new OnboardingButtonHREFType("KYC", 1, "kyc");
    public static final OnboardingButtonHREFType BUY = new OnboardingButtonHREFType("BUY", 2, "buy");
    public static final OnboardingButtonHREFType DEPOSIT = new OnboardingButtonHREFType("DEPOSIT", 3, "deposit");
    public static final OnboardingButtonHREFType UK_RISK = new OnboardingButtonHREFType("UK_RISK", 4, "uk_risk");
    public static final OnboardingButtonHREFType TR_DEPOSIT = new OnboardingButtonHREFType("TR_DEPOSIT", 5, "tr_deposit");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OnboardingButtonHREFType[] $values() {
        return new OnboardingButtonHREFType[]{NA, KYC, BUY, DEPOSIT, UK_RISK, TR_DEPOSIT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OnboardingButtonHREFType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private OnboardingButtonHREFType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        OnboardingButtonHREFType[] onboardingButtonHREFTypeArr$values = $values();
        $VALUES = onboardingButtonHREFTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(onboardingButtonHREFTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.OnboardingButtonHREFType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static OnboardingButtonHREFType valueOf(String str) {
        return (OnboardingButtonHREFType) Enum.valueOf(OnboardingButtonHREFType.class, str);
    }

    public static OnboardingButtonHREFType[] values() {
        return (OnboardingButtonHREFType[]) $VALUES.clone();
    }
}
