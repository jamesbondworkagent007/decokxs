package com.okinc.tradeuilib.order.trade.view;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class AccountMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AccountMode[] $VALUES;
    public static final StateListAnimator Companion;
    private final String lvl;
    public static final AccountMode TRADING = new AccountMode("TRADING", 0, "1");
    public static final AccountMode FUTURES = new AccountMode("FUTURES", 1, "2");
    public static final AccountMode MULTI = new AccountMode("MULTI", 2, "3");
    public static final AccountMode PM = new AccountMode("PM", 3, "4");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AccountMode[] $values() {
        return new AccountMode[]{TRADING, FUTURES, MULTI, PM};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AccountMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLvl() {
        return this.lvl;
    }

    private AccountMode(String str, int i, String str2) {
        this.lvl = str2;
    }

    static {
        AccountMode[] accountModeArr$values = $values();
        $VALUES = accountModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(accountModeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeuilib.order.trade.view.AccountMode.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final AccountMode copydefault(String str) {
            AccountMode next;
            Iterator<AccountMode> it = AccountMode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getLvl(), (Object) str)) {
                    break;
                }
            }
            return next;
        }
    }

    public static AccountMode valueOf(String str) {
        return (AccountMode) Enum.valueOf(AccountMode.class, str);
    }

    public static AccountMode[] values() {
        return (AccountMode[]) $VALUES.clone();
    }
}
