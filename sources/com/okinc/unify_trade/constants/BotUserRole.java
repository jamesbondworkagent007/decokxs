package com.okinc.unify_trade.constants;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class BotUserRole {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BotUserRole[] $VALUES;
    public static final BotUserRole DEFAULT = new BotUserRole("DEFAULT", 0, "");
    public static final BotUserRole LEAD_TRADER = new BotUserRole("LEAD_TRADER", 1, "lead_trader");
    public static final BotUserRole SIGNAL_PROVIDER = new BotUserRole("SIGNAL_PROVIDER", 2, "signal_provider");
    private final String role;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BotUserRole[] $values() {
        return new BotUserRole[]{DEFAULT, LEAD_TRADER, SIGNAL_PROVIDER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BotUserRole> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRole() {
        return this.role;
    }

    private BotUserRole(String str, int i, String str2) {
        this.role = str2;
    }

    static {
        BotUserRole[] botUserRoleArr$values = $values();
        $VALUES = botUserRoleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(botUserRoleArr$values);
    }

    public static BotUserRole valueOf(String str) {
        return (BotUserRole) Enum.valueOf(BotUserRole.class, str);
    }

    public static BotUserRole[] values() {
        return (BotUserRole[]) $VALUES.clone();
    }
}
