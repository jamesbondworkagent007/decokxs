package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyFromSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PasskeyFromSource[] $VALUES;
    public static final StateListAnimator Companion;
    private final int value;
    public static final PasskeyFromSource LINK_EXCHANGE_PASSKEY = new PasskeyFromSource("LINK_EXCHANGE_PASSKEY", 0, 0);
    public static final PasskeyFromSource LINK_EXTERNAL_DEVICE = new PasskeyFromSource("LINK_EXTERNAL_DEVICE", 1, 1);
    public static final PasskeyFromSource CREATE_NEW_PASSKEY = new PasskeyFromSource("CREATE_NEW_PASSKEY", 2, 2);
    public static final PasskeyFromSource UNKNOWN = new PasskeyFromSource("UNKNOWN", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PasskeyFromSource[] $values() {
        return new PasskeyFromSource[]{LINK_EXCHANGE_PASSKEY, LINK_EXTERNAL_DEVICE, CREATE_NEW_PASSKEY, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PasskeyFromSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private PasskeyFromSource(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        PasskeyFromSource[] passkeyFromSourceArr$values = $values();
        $VALUES = passkeyFromSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(passkeyFromSourceArr$values);
        Companion = new StateListAnimator(null);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyFromSource.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static PasskeyFromSource valueOf(String str) {
        return (PasskeyFromSource) Enum.valueOf(PasskeyFromSource.class, str);
    }

    public static PasskeyFromSource[] values() {
        return (PasskeyFromSource[]) $VALUES.clone();
    }
}
