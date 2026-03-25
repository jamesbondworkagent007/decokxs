package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pUU;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class PasskeyOperationType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PasskeyOperationType[] $VALUES;
    public static final Application Companion;
    public static final PasskeyOperationType LINK_PASSKEY = new PasskeyOperationType("LINK_PASSKEY", 0);
    public static final PasskeyOperationType REGISTER_PASSKEY = new PasskeyOperationType("REGISTER_PASSKEY", 1);
    public static final PasskeyOperationType UNKNOWN = new PasskeyOperationType("UNKNOWN", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PasskeyOperationType[] $values() {
        return new PasskeyOperationType[]{LINK_PASSKEY, REGISTER_PASSKEY, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PasskeyOperationType> getEntries() {
        return $ENTRIES;
    }

    private PasskeyOperationType(String str, int i) {
    }

    static {
        PasskeyOperationType[] passkeyOperationTypeArr$values = $values();
        $VALUES = passkeyOperationTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(passkeyOperationTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final PasskeyOperationType copydefault(int i) {
            if (i == 0) {
                return PasskeyOperationType.LINK_PASSKEY;
            }
            if (i == 1) {
                return PasskeyOperationType.REGISTER_PASSKEY;
            }
            pUU.copydefault("PasskeyOperationType", i + " PasskeyOperationType is error");
            return PasskeyOperationType.UNKNOWN;
        }
    }

    public static PasskeyOperationType valueOf(String str) {
        return (PasskeyOperationType) Enum.valueOf(PasskeyOperationType.class, str);
    }

    public static PasskeyOperationType[] values() {
        return (PasskeyOperationType[]) $VALUES.clone();
    }
}
