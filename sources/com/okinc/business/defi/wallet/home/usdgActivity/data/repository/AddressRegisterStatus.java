package com.okinc.business.defi.wallet.home.usdgActivity.data.repository;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class AddressRegisterStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AddressRegisterStatus[] $VALUES;
    public static final ActionBar Companion;
    private final int status;
    public static final AddressRegisterStatus STATUS_ACTIVATED = new AddressRegisterStatus("STATUS_ACTIVATED", 0, 1);
    public static final AddressRegisterStatus STATUS_UNACTIVATED = new AddressRegisterStatus("STATUS_UNACTIVATED", 1, 2);
    public static final AddressRegisterStatus STATUS_DEACTIVATED = new AddressRegisterStatus("STATUS_DEACTIVATED", 2, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AddressRegisterStatus[] $values() {
        return new AddressRegisterStatus[]{STATUS_ACTIVATED, STATUS_UNACTIVATED, STATUS_DEACTIVATED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AddressRegisterStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    private AddressRegisterStatus(String str, int i, int i2) {
        this.status = i2;
    }

    static {
        AddressRegisterStatus[] addressRegisterStatusArr$values = $values();
        $VALUES = addressRegisterStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(addressRegisterStatusArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.usdgActivity.data.repository.AddressRegisterStatus.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final AddressRegisterStatus copydefault(int i) {
            for (AddressRegisterStatus addressRegisterStatus : AddressRegisterStatus.values()) {
                if (addressRegisterStatus.getStatus() == i) {
                    return addressRegisterStatus;
                }
            }
            return null;
        }
    }

    public static AddressRegisterStatus valueOf(String str) {
        return (AddressRegisterStatus) Enum.valueOf(AddressRegisterStatus.class, str);
    }

    public static AddressRegisterStatus[] values() {
        return (AddressRegisterStatus[]) $VALUES.clone();
    }
}
