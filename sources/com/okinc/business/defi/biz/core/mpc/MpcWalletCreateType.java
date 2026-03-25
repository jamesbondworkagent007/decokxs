package com.okinc.business.defi.biz.core.mpc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MpcWalletCreateType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MpcWalletCreateType[] $VALUES;
    public static final StateListAnimator Companion;
    private final int value;
    public static final MpcWalletCreateType LOCAL_CREATE = new MpcWalletCreateType("LOCAL_CREATE", 0, 0);
    public static final MpcWalletCreateType QRCODE_RECOVER = new MpcWalletCreateType("QRCODE_RECOVER", 1, 1);
    public static final MpcWalletCreateType ICLOUD_RECOVER = new MpcWalletCreateType("ICLOUD_RECOVER", 2, 2);
    public static final MpcWalletCreateType SMART_CREATE = new MpcWalletCreateType("SMART_CREATE", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MpcWalletCreateType[] $values() {
        return new MpcWalletCreateType[]{LOCAL_CREATE, QRCODE_RECOVER, ICLOUD_RECOVER, SMART_CREATE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MpcWalletCreateType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private MpcWalletCreateType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        MpcWalletCreateType[] mpcWalletCreateTypeArr$values = $values();
        $VALUES = mpcWalletCreateTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mpcWalletCreateTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static MpcWalletCreateType valueOf(String str) {
        return (MpcWalletCreateType) Enum.valueOf(MpcWalletCreateType.class, str);
    }

    public static MpcWalletCreateType[] values() {
        return (MpcWalletCreateType[]) $VALUES.clone();
    }
}
