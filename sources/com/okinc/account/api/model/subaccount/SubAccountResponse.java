package com.okinc.account.api.model.subaccount;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class SubAccountResponse {
    public static final int $stable = 8;
    private final List<SubAccountInfo> list;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.account.api.model.subaccount.SubAccountResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubAccountResponse copy$default(SubAccountResponse subAccountResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = subAccountResponse.list;
        }
        return subAccountResponse.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SubAccountInfo> component1() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubAccountResponse copy(@NotNull List<SubAccountInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SubAccountResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubAccountResponse) && Intrinsics.EZpvd(this.list, ((SubAccountResponse) obj).list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SubAccountInfo> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubAccountResponse(list=" + this.list + ")";
    }

    public SubAccountResponse(@NotNull List<SubAccountInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.list = list;
    }

    public static final class SubAccountInfo {
        public static final int $stable = 0;
        private final int accountType;
        private final String email;
        private final boolean isAllowWithdraw;
        private final long userId;
        private final int v3ApiKeyRemainQuota;
        private final int v5ApiKeyRemainQuota;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.userId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.email;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component3() {
            return this.accountType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component4() {
            return this.v3ApiKeyRemainQuota;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component5() {
            return this.v5ApiKeyRemainQuota;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component6() {
            return this.isAllowWithdraw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubAccountInfo copy(long j, String str, int i, int i2, int i3, boolean z) {
            return new SubAccountInfo(j, str, i, i2, i3, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubAccountInfo)) {
                return false;
            }
            SubAccountInfo subAccountInfo = (SubAccountInfo) obj;
            return this.userId == subAccountInfo.userId && Intrinsics.EZpvd((Object) this.email, (Object) subAccountInfo.email) && this.accountType == subAccountInfo.accountType && this.v3ApiKeyRemainQuota == subAccountInfo.v3ApiKeyRemainQuota && this.v5ApiKeyRemainQuota == subAccountInfo.v5ApiKeyRemainQuota && this.isAllowWithdraw == subAccountInfo.isAllowWithdraw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getAccountType() {
            return this.accountType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getEmail() {
            return this.email;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getQuota(int i) {
            return i == 3 ? this.v3ApiKeyRemainQuota : this.v5ApiKeyRemainQuota;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getUserId() {
            return this.userId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getV3ApiKeyRemainQuota() {
            return this.v3ApiKeyRemainQuota;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getV5ApiKeyRemainQuota() {
            return this.v5ApiKeyRemainQuota;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.userId);
            String str = this.email;
            return (((((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.accountType)) * 31) + Integer.hashCode(this.v3ApiKeyRemainQuota)) * 31) + Integer.hashCode(this.v5ApiKeyRemainQuota)) * 31) + Boolean.hashCode(this.isAllowWithdraw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAllowWithdraw() {
            return this.isAllowWithdraw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isStandardSubAccount() {
            return this.accountType == 1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubAccountInfo(userId=" + this.userId + ", email=" + this.email + ", accountType=" + this.accountType + ", v3ApiKeyRemainQuota=" + this.v3ApiKeyRemainQuota + ", v5ApiKeyRemainQuota=" + this.v5ApiKeyRemainQuota + ", isAllowWithdraw=" + this.isAllowWithdraw + ")";
        }

        public SubAccountInfo(long j, String str, int i, int i2, int i3, boolean z) {
            this.userId = j;
            this.email = str;
            this.accountType = i;
            this.v3ApiKeyRemainQuota = i2;
            this.v5ApiKeyRemainQuota = i3;
            this.isAllowWithdraw = z;
        }
    }
}
