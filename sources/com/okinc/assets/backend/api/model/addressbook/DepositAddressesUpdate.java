package com.okinc.assets.backend.api.model.addressbook;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class DepositAddressesUpdate {
    public static final int $stable = 8;
    private final int currencyId;
    private final List<DepositAddressUpdate> nicknameList;
    private final int subCurrencyId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.addressbook.DepositAddressesUpdate */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DepositAddressesUpdate copy$default(DepositAddressesUpdate depositAddressesUpdate, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = depositAddressesUpdate.currencyId;
        }
        if ((i3 & 2) != 0) {
            i2 = depositAddressesUpdate.subCurrencyId;
        }
        if ((i3 & 4) != 0) {
            list = depositAddressesUpdate.nicknameList;
        }
        return depositAddressesUpdate.copy(i, i2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DepositAddressUpdate> component3() {
        return this.nicknameList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositAddressesUpdate copy(int i, int i2, @NotNull List<DepositAddressUpdate> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DepositAddressesUpdate(i, i2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositAddressesUpdate)) {
            return false;
        }
        DepositAddressesUpdate depositAddressesUpdate = (DepositAddressesUpdate) obj;
        return this.currencyId == depositAddressesUpdate.currencyId && this.subCurrencyId == depositAddressesUpdate.subCurrencyId && Intrinsics.EZpvd(this.nicknameList, depositAddressesUpdate.nicknameList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DepositAddressUpdate> getNicknameList() {
        return this.nicknameList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.currencyId) * 31) + Integer.hashCode(this.subCurrencyId)) * 31) + this.nicknameList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DepositAddressesUpdate(currencyId=" + this.currencyId + ", subCurrencyId=" + this.subCurrencyId + ", nicknameList=" + this.nicknameList + ")";
    }

    public DepositAddressesUpdate(int i, int i2, @NotNull List<DepositAddressUpdate> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.currencyId = i;
        this.subCurrencyId = i2;
        this.nicknameList = list;
    }

    public static final class DepositAddressUpdate {
        public static final int $stable = 0;
        private final int id;
        private final String nickname;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DepositAddressUpdate copy$default(DepositAddressUpdate depositAddressUpdate, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = depositAddressUpdate.id;
            }
            if ((i2 & 2) != 0) {
                str = depositAddressUpdate.nickname;
            }
            return depositAddressUpdate.copy(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.nickname;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DepositAddressUpdate copy(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new DepositAddressUpdate(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DepositAddressUpdate)) {
                return false;
            }
            DepositAddressUpdate depositAddressUpdate = (DepositAddressUpdate) obj;
            return this.id == depositAddressUpdate.id && Intrinsics.EZpvd((Object) this.nickname, (Object) depositAddressUpdate.nickname);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNickname() {
            return this.nickname;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Integer.hashCode(this.id) * 31) + this.nickname.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DepositAddressUpdate(id=" + this.id + ", nickname=" + this.nickname + ")";
        }

        public DepositAddressUpdate(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.id = i;
            this.nickname = str;
        }
    }
}
