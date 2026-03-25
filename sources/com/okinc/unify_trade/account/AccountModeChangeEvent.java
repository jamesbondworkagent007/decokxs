package com.okinc.unify_trade.account;

import com.okinc.rxutils.RxBus;

/* JADX INFO: loaded from: classes11.dex */
public final class AccountModeChangeEvent implements RxBus.Application {
    public static final int $stable = 0;
    private final String currAccountMode;
    private final String prevAccountMode;

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrAccountMode() {
        return this.currAccountMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrevAccountMode() {
        return this.prevAccountMode;
    }

    public AccountModeChangeEvent(String str, String str2) {
        this.prevAccountMode = str;
        this.currAccountMode = str2;
    }
}
