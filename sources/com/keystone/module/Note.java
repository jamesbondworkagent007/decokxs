package com.keystone.module;

/* JADX INFO: loaded from: classes3.dex */
public enum Note {
    STANDARD("account.standard"),
    LEDGER_LEGACY("account.ledger_legacy"),
    LEDGER_LIVE("account.ledger_live");

    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    Note(String str) {
        this.value = str;
    }
}
