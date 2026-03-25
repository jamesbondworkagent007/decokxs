package com.okinc.unify_trade.trade.account;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class AccountTypeData {
    public static final int $stable = 8;
    private final String acctLv;
    private final String desc;
    private boolean isCurrent;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountTypeData copy$default(AccountTypeData accountTypeData, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountTypeData.acctLv;
        }
        if ((i & 2) != 0) {
            str2 = accountTypeData.title;
        }
        if ((i & 4) != 0) {
            str3 = accountTypeData.desc;
        }
        if ((i & 8) != 0) {
            z = accountTypeData.isCurrent;
        }
        return accountTypeData.copy(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.acctLv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isCurrent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountTypeData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AccountTypeData(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountTypeData)) {
            return false;
        }
        AccountTypeData accountTypeData = (AccountTypeData) obj;
        return Intrinsics.EZpvd((Object) this.acctLv, (Object) accountTypeData.acctLv) && Intrinsics.EZpvd((Object) this.title, (Object) accountTypeData.title) && Intrinsics.EZpvd((Object) this.desc, (Object) accountTypeData.desc) && this.isCurrent == accountTypeData.isCurrent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctLv() {
        return this.acctLv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.acctLv.hashCode() * 31) + this.title.hashCode()) * 31) + this.desc.hashCode()) * 31) + Boolean.hashCode(this.isCurrent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCurrent() {
        return this.isCurrent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrent(boolean z) {
        this.isCurrent = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountTypeData(acctLv=" + this.acctLv + ", title=" + this.title + ", desc=" + this.desc + ", isCurrent=" + this.isCurrent + ")";
    }

    public AccountTypeData(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.acctLv = str;
        this.title = str2;
        this.desc = str3;
        this.isCurrent = z;
    }
}
