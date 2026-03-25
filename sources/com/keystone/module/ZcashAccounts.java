package com.keystone.module;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ZcashAccounts {
    private final List<ZcashAccount> accounts;
    private final String seedFingerprint;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.keystone.module.ZcashAccounts */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZcashAccounts copy$default(ZcashAccounts zcashAccounts, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zcashAccounts.seedFingerprint;
        }
        if ((i & 2) != 0) {
            list = zcashAccounts.accounts;
        }
        return zcashAccounts.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.seedFingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ZcashAccount> component2() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZcashAccounts copy(@NotNull String str, @NotNull List<ZcashAccount> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new ZcashAccounts(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZcashAccounts)) {
            return false;
        }
        ZcashAccounts zcashAccounts = (ZcashAccounts) obj;
        return Intrinsics.EZpvd((Object) this.seedFingerprint, (Object) zcashAccounts.seedFingerprint) && Intrinsics.EZpvd(this.accounts, zcashAccounts.accounts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ZcashAccount> getAccounts() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSeedFingerprint() {
        return this.seedFingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.seedFingerprint.hashCode() * 31) + this.accounts.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ZcashAccounts(seedFingerprint=" + this.seedFingerprint + ", accounts=" + this.accounts + ')';
    }

    public ZcashAccounts(@NotNull String str, @NotNull List<ZcashAccount> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.seedFingerprint = str;
        this.accounts = list;
    }
}
