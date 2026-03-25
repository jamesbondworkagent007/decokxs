package com.okinc.unify_trade.trade.account;

import com.okinc.unify_trade.biz.subscribe.AccountBalanceData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class AccountBalance {
    public static final int $stable = 8;
    private final String origin;
    private final AccountBalanceData resp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountBalance copy$default(AccountBalance accountBalance, AccountBalanceData accountBalanceData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            accountBalanceData = accountBalance.resp;
        }
        if ((i & 2) != 0) {
            str = accountBalance.origin;
        }
        return accountBalance.copy(accountBalanceData, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountBalanceData component1() {
        return this.resp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountBalance copy(@NotNull AccountBalanceData accountBalanceData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(accountBalanceData, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new AccountBalance(accountBalanceData, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountBalance)) {
            return false;
        }
        AccountBalance accountBalance = (AccountBalance) obj;
        return Intrinsics.EZpvd(this.resp, accountBalance.resp) && Intrinsics.EZpvd((Object) this.origin, (Object) accountBalance.origin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountBalanceData getResp() {
        return this.resp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.resp.hashCode() * 31) + this.origin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountBalance(resp=" + this.resp + ", origin=" + this.origin + ")";
    }

    public AccountBalance(@NotNull AccountBalanceData accountBalanceData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(accountBalanceData, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.resp = accountBalanceData;
        this.origin = str;
    }
}
