package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class PasskeyOperationSourceSubType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PasskeyOperationSourceSubType[] $VALUES;
    public static final Application Companion;
    public static final PasskeyOperationSourceSubType DIRECT = new PasskeyOperationSourceSubType("DIRECT", 0);
    public static final PasskeyOperationSourceSubType AFTER_EMAIL_UPDATE = new PasskeyOperationSourceSubType("AFTER_EMAIL_UPDATE", 1);
    public static final PasskeyOperationSourceSubType AFTER_EMAIL_ADDITION = new PasskeyOperationSourceSubType("AFTER_EMAIL_ADDITION", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PasskeyOperationSourceSubType[] $values() {
        return new PasskeyOperationSourceSubType[]{DIRECT, AFTER_EMAIL_UPDATE, AFTER_EMAIL_ADDITION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PasskeyOperationSourceSubType> getEntries() {
        return $ENTRIES;
    }

    private PasskeyOperationSourceSubType(String str, int i) {
    }

    static {
        PasskeyOperationSourceSubType[] passkeyOperationSourceSubTypeArr$values = $values();
        $VALUES = passkeyOperationSourceSubTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(passkeyOperationSourceSubTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationSourceSubType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static PasskeyOperationSourceSubType valueOf(String str) {
        return (PasskeyOperationSourceSubType) Enum.valueOf(PasskeyOperationSourceSubType.class, str);
    }

    public static PasskeyOperationSourceSubType[] values() {
        return (PasskeyOperationSourceSubType[]) $VALUES.clone();
    }
}
