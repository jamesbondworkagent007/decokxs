package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class UserFundStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UserFundStatus[] $VALUES;
    public static final Application Companion;
    private final int value;
    public static final UserFundStatus NOT_PAID = new UserFundStatus("NOT_PAID", 0, 0);
    public static final UserFundStatus PAID = new UserFundStatus("PAID", 1, 1);
    public static final UserFundStatus RETURNING = new UserFundStatus("RETURNING", 2, 2);
    public static final UserFundStatus RETURNED = new UserFundStatus("RETURNED", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UserFundStatus[] $values() {
        return new UserFundStatus[]{NOT_PAID, PAID, RETURNING, RETURNED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UserFundStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private UserFundStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        UserFundStatus[] userFundStatusArr$values = $values();
        $VALUES = userFundStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(userFundStatusArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.UserFundStatus.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final UserFundStatus OLrzqt(Integer num) {
            for (UserFundStatus userFundStatus : UserFundStatus.values()) {
                int value = userFundStatus.getValue();
                if (num != null && value == num.intValue()) {
                    return userFundStatus;
                }
            }
            return null;
        }
    }

    public static UserFundStatus valueOf(String str) {
        return (UserFundStatus) Enum.valueOf(UserFundStatus.class, str);
    }

    public static UserFundStatus[] values() {
        return (UserFundStatus[]) $VALUES.clone();
    }
}
