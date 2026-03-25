package com.okinc.okrisk;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class Action {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Action[] $VALUES;
    public static final Action INSTALL = new Action("INSTALL", 0);
    public static final Action START = new Action("START", 1);
    public static final Action EVENT = new Action("EVENT", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Action[] $values() {
        return new Action[]{INSTALL, START, EVENT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Action> getEntries() {
        return $ENTRIES;
    }

    private Action(String str, int i) {
    }

    static {
        Action[] actionArr$values = $values();
        $VALUES = actionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(actionArr$values);
    }

    public static Action valueOf(String str) {
        return (Action) Enum.valueOf(Action.class, str);
    }

    public static Action[] values() {
        return (Action[]) $VALUES.clone();
    }
}
