package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class PasskeyOperationSourceType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PasskeyOperationSourceType[] $VALUES;
    public static final Activity Companion;
    public static final PasskeyOperationSourceType FROM_CREATE_WALLET = new PasskeyOperationSourceType("FROM_CREATE_WALLET", 0);
    public static final PasskeyOperationSourceType FROM_SIGN_TRANSACTION = new PasskeyOperationSourceType("FROM_SIGN_TRANSACTION", 1);
    public static final PasskeyOperationSourceType FROM_CEDEFI_RECOVER = new PasskeyOperationSourceType("FROM_CEDEFI_RECOVER", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PasskeyOperationSourceType[] $values() {
        return new PasskeyOperationSourceType[]{FROM_CREATE_WALLET, FROM_SIGN_TRANSACTION, FROM_CEDEFI_RECOVER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PasskeyOperationSourceType> getEntries() {
        return $ENTRIES;
    }

    private PasskeyOperationSourceType(String str, int i) {
    }

    static {
        PasskeyOperationSourceType[] passkeyOperationSourceTypeArr$values = $values();
        $VALUES = passkeyOperationSourceTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(passkeyOperationSourceTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationSourceType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static PasskeyOperationSourceType valueOf(String str) {
        return (PasskeyOperationSourceType) Enum.valueOf(PasskeyOperationSourceType.class, str);
    }

    public static PasskeyOperationSourceType[] values() {
        return (PasskeyOperationSourceType[]) $VALUES.clone();
    }
}
