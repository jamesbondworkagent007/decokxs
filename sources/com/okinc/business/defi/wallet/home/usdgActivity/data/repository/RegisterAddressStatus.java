package com.okinc.business.defi.wallet.home.usdgActivity.data.repository;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class RegisterAddressStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RegisterAddressStatus[] $VALUES;
    public static final ActionBar Companion;
    private final int status;
    public static final RegisterAddressStatus STATUS_REGISTERED_SUCCESS = new RegisterAddressStatus("STATUS_REGISTERED_SUCCESS", 0, 0);
    public static final RegisterAddressStatus STATUS_REGISTERED_REGION_NOT_SUPPORTED = new RegisterAddressStatus("STATUS_REGISTERED_REGION_NOT_SUPPORTED", 1, 2000003);
    public static final RegisterAddressStatus STATUS_REGISTERED_FAIL = new RegisterAddressStatus("STATUS_REGISTERED_FAIL", 2, 2000004);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RegisterAddressStatus[] $values() {
        return new RegisterAddressStatus[]{STATUS_REGISTERED_SUCCESS, STATUS_REGISTERED_REGION_NOT_SUPPORTED, STATUS_REGISTERED_FAIL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RegisterAddressStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    private RegisterAddressStatus(String str, int i, int i2) {
        this.status = i2;
    }

    static {
        RegisterAddressStatus[] registerAddressStatusArr$values = $values();
        $VALUES = registerAddressStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(registerAddressStatusArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.usdgActivity.data.repository.RegisterAddressStatus.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final RegisterAddressStatus AEQbTJ(int i) {
            for (RegisterAddressStatus registerAddressStatus : RegisterAddressStatus.values()) {
                if (registerAddressStatus.getStatus() == i) {
                    return registerAddressStatus;
                }
            }
            return null;
        }
    }

    public static RegisterAddressStatus valueOf(String str) {
        return (RegisterAddressStatus) Enum.valueOf(RegisterAddressStatus.class, str);
    }

    public static RegisterAddressStatus[] values() {
        return (RegisterAddressStatus[]) $VALUES.clone();
    }
}
