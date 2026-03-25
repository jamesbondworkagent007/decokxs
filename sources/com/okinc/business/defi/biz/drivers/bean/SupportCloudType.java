package com.okinc.business.defi.biz.drivers.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class SupportCloudType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SupportCloudType[] $VALUES;
    public static final StateListAnimator Companion;
    private final int value;
    public static final SupportCloudType GOOGLE_CLOUD = new SupportCloudType("GOOGLE_CLOUD", 0, 0);
    public static final SupportCloudType HUAWEI_CLOUD = new SupportCloudType("HUAWEI_CLOUD", 1, 1);
    public static final SupportCloudType BOTH_CLOUD = new SupportCloudType("BOTH_CLOUD", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SupportCloudType[] $values() {
        return new SupportCloudType[]{GOOGLE_CLOUD, HUAWEI_CLOUD, BOTH_CLOUD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SupportCloudType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private SupportCloudType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        SupportCloudType[] supportCloudTypeArr$values = $values();
        $VALUES = supportCloudTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(supportCloudTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.drivers.bean.SupportCloudType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static SupportCloudType valueOf(String str) {
        return (SupportCloudType) Enum.valueOf(SupportCloudType.class, str);
    }

    public static SupportCloudType[] values() {
        return (SupportCloudType[]) $VALUES.clone();
    }
}
