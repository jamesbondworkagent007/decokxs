package com.okinc.web3.security.utils.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class SupportLevel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SupportLevel[] $VALUES;
    public static final Companion Companion;
    private final int value;
    public static final SupportLevel SOFTWARE_ONLY = new SupportLevel("SOFTWARE_ONLY", 0, 0);
    public static final SupportLevel TEE = new SupportLevel("TEE", 1, 1);
    public static final SupportLevel STRONGBOX = new SupportLevel("STRONGBOX", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SupportLevel[] $values() {
        return new SupportLevel[]{SOFTWARE_ONLY, TEE, STRONGBOX};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SupportLevel> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private SupportLevel(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        SupportLevel[] supportLevelArr$values = $values();
        $VALUES = supportLevelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(supportLevelArr$values);
        Companion = new Companion(null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.utils.internal.SupportLevel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SupportLevel fromValue(int i) {
            if (i == 0) {
                return SupportLevel.SOFTWARE_ONLY;
            }
            if (i == 1) {
                return SupportLevel.TEE;
            }
            if (i == 2) {
                return SupportLevel.STRONGBOX;
            }
            throw new IllegalArgumentException("Invalid support level value: " + i);
        }
    }

    public static SupportLevel valueOf(String str) {
        return (SupportLevel) Enum.valueOf(SupportLevel.class, str);
    }

    public static SupportLevel[] values() {
        return (SupportLevel[]) $VALUES.clone();
    }
}
