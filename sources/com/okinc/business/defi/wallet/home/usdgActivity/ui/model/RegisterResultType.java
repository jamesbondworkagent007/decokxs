package com.okinc.business.defi.wallet.home.usdgActivity.ui.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class RegisterResultType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RegisterResultType[] $VALUES;
    public static final Application Companion;
    private final int value;
    public static final RegisterResultType TYPE_REGION_NOT_SUPPORTED = new RegisterResultType("TYPE_REGION_NOT_SUPPORTED", 0, 1);
    public static final RegisterResultType TYPE_REGISTERING = new RegisterResultType("TYPE_REGISTERING", 1, 2);
    public static final RegisterResultType TYPE_REGISTER_SUCCESS = new RegisterResultType("TYPE_REGISTER_SUCCESS", 2, 3);
    public static final RegisterResultType TYPE_REGISTER_FAIL = new RegisterResultType("TYPE_REGISTER_FAIL", 3, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RegisterResultType[] $values() {
        return new RegisterResultType[]{TYPE_REGION_NOT_SUPPORTED, TYPE_REGISTERING, TYPE_REGISTER_SUCCESS, TYPE_REGISTER_FAIL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RegisterResultType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private RegisterResultType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        RegisterResultType[] registerResultTypeArr$values = $values();
        $VALUES = registerResultTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(registerResultTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.usdgActivity.ui.model.RegisterResultType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final RegisterResultType KWHzl(int i) {
            for (RegisterResultType registerResultType : RegisterResultType.values()) {
                if (registerResultType.getValue() == i) {
                    return registerResultType;
                }
            }
            return null;
        }
    }

    public static RegisterResultType valueOf(String str) {
        return (RegisterResultType) Enum.valueOf(RegisterResultType.class, str);
    }

    public static RegisterResultType[] values() {
        return (RegisterResultType[]) $VALUES.clone();
    }
}
