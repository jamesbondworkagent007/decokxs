package com.okinc.business.defi.wallet.tee.common.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class TeeCommand {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TeeCommand[] $VALUES;
    private final String command;
    public static final TeeCommand UPGRADE_TEE = new TeeCommand("UPGRADE_TEE", 0, "upgradeTee");
    public static final TeeCommand EXTEND_TEE = new TeeCommand("EXTEND_TEE", 1, "extendTee");
    public static final TeeCommand REMOVE_TEE = new TeeCommand("REMOVE_TEE", 2, "removeTee");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TeeCommand[] $values() {
        return new TeeCommand[]{UPGRADE_TEE, EXTEND_TEE, REMOVE_TEE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TeeCommand> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommand() {
        return this.command;
    }

    private TeeCommand(String str, int i, String str2) {
        this.command = str2;
    }

    static {
        TeeCommand[] teeCommandArr$values = $values();
        $VALUES = teeCommandArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(teeCommandArr$values);
    }

    public static TeeCommand valueOf(String str) {
        return (TeeCommand) Enum.valueOf(TeeCommand.class, str);
    }

    public static TeeCommand[] values() {
        return (TeeCommand[]) $VALUES.clone();
    }
}
