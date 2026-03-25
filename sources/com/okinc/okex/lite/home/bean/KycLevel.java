package com.okinc.okex.lite.home.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class KycLevel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ KycLevel[] $VALUES;
    public static final StateListAnimator Companion;
    private final int value;
    public static final KycLevel NOT_SUBMITTED = new KycLevel("NOT_SUBMITTED", 0, 0);
    public static final KycLevel UNDER_REVIEW = new KycLevel("UNDER_REVIEW", 1, 1);
    public static final KycLevel PASSED = new KycLevel("PASSED", 2, 2);
    public static final KycLevel REJECTED = new KycLevel("REJECTED", 3, 3);
    public static final KycLevel NOT_COMPLETED = new KycLevel("NOT_COMPLETED", 4, 4);
    public static final KycLevel REFRESH_REQUIRED = new KycLevel("REFRESH_REQUIRED", 5, 5);
    public static final KycLevel ADDITIONAL_INFO_REQUIRED = new KycLevel("ADDITIONAL_INFO_REQUIRED", 6, 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ KycLevel[] $values() {
        return new KycLevel[]{NOT_SUBMITTED, UNDER_REVIEW, PASSED, REJECTED, NOT_COMPLETED, REFRESH_REQUIRED, ADDITIONAL_INFO_REQUIRED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<KycLevel> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private KycLevel(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        KycLevel[] kycLevelArr$values = $values();
        $VALUES = kycLevelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(kycLevelArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.KycLevel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static KycLevel valueOf(String str) {
        return (KycLevel) Enum.valueOf(KycLevel.class, str);
    }

    public static KycLevel[] values() {
        return (KycLevel[]) $VALUES.clone();
    }
}
