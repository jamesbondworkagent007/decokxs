package com.okinc.business.web3pay.lib.features.account.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class AccountInfo {
    public final List<AccountAddress> AEQbTJ;
    public final Status KWHzl;
    public final String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.account.model.AccountInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountInfo copy$default(AccountInfo accountInfo, Status status, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            status = accountInfo.KWHzl;
        }
        if ((i & 2) != 0) {
            str = accountInfo.copydefault;
        }
        if ((i & 4) != 0) {
            list = accountInfo.AEQbTJ;
        }
        return accountInfo.OLrzqt(status, str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountInfo OLrzqt(Status status, @NotNull String str, @NotNull List<AccountAddress> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new AccountInfo(status, str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfo)) {
            return false;
        }
        AccountInfo accountInfo = (AccountInfo) obj;
        return this.KWHzl == accountInfo.KWHzl && Intrinsics.EZpvd((Object) this.copydefault, (Object) accountInfo.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, accountInfo.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Status status = this.KWHzl;
        return ((((status == null ? 0 : status.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountInfo(status=" + this.KWHzl + ", accountId=" + this.copydefault + ", addressList=" + this.AEQbTJ + ")";
    }

    public AccountInfo(Status status, @NotNull String str, @NotNull List<AccountAddress> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = status;
        this.copydefault = str;
        this.AEQbTJ = list;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private final int value;
        public static final Status NORMAL = new Status("NORMAL", 0, 0);
        public static final Status FROZEN = new Status("FROZEN", 1, 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Status[] $values() {
            return new Status[]{NORMAL, FROZEN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Status> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private Status(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(statusArr$values);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }
}
