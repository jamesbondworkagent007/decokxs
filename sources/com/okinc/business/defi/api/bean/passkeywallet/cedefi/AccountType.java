package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AccountType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AccountType[] $VALUES;
    public static final Activity Companion;
    private final int value;
    public static final AccountType EASY_WALLET = new AccountType("EASY_WALLET", 0, 1);
    public static final AccountType CeDeFi = new AccountType("CeDeFi", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AccountType[] $values() {
        return new AccountType[]{EASY_WALLET, CeDeFi};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AccountType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AccountType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AccountType[] accountTypeArr$values = $values();
        $VALUES = accountTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(accountTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static AccountType valueOf(String str) {
        return (AccountType) Enum.valueOf(AccountType.class, str);
    }

    public static AccountType[] values() {
        return (AccountType[]) $VALUES.clone();
    }
}
