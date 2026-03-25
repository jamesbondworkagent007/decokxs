package com.okinc.web3Uilib.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class TransactionAddressPermissionInfoBean {
    public static final int $stable = 8;
    private final List<AddressPermissionDataBean> dataList;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.web3Uilib.bean.TransactionAddressPermissionInfoBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionAddressPermissionInfoBean copy$default(TransactionAddressPermissionInfoBean transactionAddressPermissionInfoBean, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionAddressPermissionInfoBean.title;
        }
        if ((i & 2) != 0) {
            list = transactionAddressPermissionInfoBean.dataList;
        }
        return transactionAddressPermissionInfoBean.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressPermissionDataBean> component2() {
        return this.dataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionAddressPermissionInfoBean copy(@NotNull String str, @NotNull List<AddressPermissionDataBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TransactionAddressPermissionInfoBean(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionAddressPermissionInfoBean)) {
            return false;
        }
        TransactionAddressPermissionInfoBean transactionAddressPermissionInfoBean = (TransactionAddressPermissionInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) transactionAddressPermissionInfoBean.title) && Intrinsics.EZpvd(this.dataList, transactionAddressPermissionInfoBean.dataList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressPermissionDataBean> getDataList() {
        return this.dataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.title.hashCode() * 31) + this.dataList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionAddressPermissionInfoBean(title=" + this.title + ", dataList=" + this.dataList + ")";
    }

    public TransactionAddressPermissionInfoBean(@NotNull String str, @NotNull List<AddressPermissionDataBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.title = str;
        this.dataList = list;
    }

    public static final class AddressPermissionDataBean {
        public static final int $stable = 0;
        private final String address;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AddressPermissionDataBean copy$default(AddressPermissionDataBean addressPermissionDataBean, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = addressPermissionDataBean.title;
            }
            if ((i & 2) != 0) {
                str2 = addressPermissionDataBean.address;
            }
            return addressPermissionDataBean.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AddressPermissionDataBean copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new AddressPermissionDataBean(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddressPermissionDataBean)) {
                return false;
            }
            AddressPermissionDataBean addressPermissionDataBean = (AddressPermissionDataBean) obj;
            return Intrinsics.EZpvd((Object) this.title, (Object) addressPermissionDataBean.title) && Intrinsics.EZpvd((Object) this.address, (Object) addressPermissionDataBean.address);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.title.hashCode() * 31) + this.address.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AddressPermissionDataBean(title=" + this.title + ", address=" + this.address + ")";
        }

        public AddressPermissionDataBean(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.title = str;
            this.address = str2;
        }
    }
}
