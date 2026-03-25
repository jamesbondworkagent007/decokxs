package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class MevInfo extends BaseModel<MevInfoItem> {
    public static final int $stable = 0;

    public MevInfo() {
        super("mevInfo");
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class MevInfoItem {
        public static final int $stable = 8;
        private final String gas;
        private final List<MevNode> mevNodeList;
        private final Boolean openMev;
        private final String priorityRate;
        private final Boolean supportMev;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.wallet.transaction.moduleModel.bean.MevInfo$MevInfoItem */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MevInfoItem copy$default(MevInfoItem mevInfoItem, String str, List list, Boolean bool, String str2, Boolean bool2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mevInfoItem.gas;
            }
            if ((i & 2) != 0) {
                list = mevInfoItem.mevNodeList;
            }
            List list2 = list;
            if ((i & 4) != 0) {
                bool = mevInfoItem.openMev;
            }
            Boolean bool3 = bool;
            if ((i & 8) != 0) {
                str2 = mevInfoItem.priorityRate;
            }
            String str4 = str2;
            if ((i & 16) != 0) {
                bool2 = mevInfoItem.supportMev;
            }
            Boolean bool4 = bool2;
            if ((i & 32) != 0) {
                str3 = mevInfoItem.title;
            }
            return mevInfoItem.copy(str, list2, bool3, str4, bool4, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.gas;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<MevNode> component2() {
            return this.mevNodeList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component3() {
            return this.openMev;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.priorityRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component5() {
            return this.supportMev;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MevInfoItem copy(String str, List<MevNode> list, Boolean bool, String str2, Boolean bool2, String str3) {
            return new MevInfoItem(str, list, bool, str2, bool2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MevInfoItem)) {
                return false;
            }
            MevInfoItem mevInfoItem = (MevInfoItem) obj;
            return Intrinsics.EZpvd((Object) this.gas, (Object) mevInfoItem.gas) && Intrinsics.EZpvd(this.mevNodeList, mevInfoItem.mevNodeList) && Intrinsics.EZpvd(this.openMev, mevInfoItem.openMev) && Intrinsics.EZpvd((Object) this.priorityRate, (Object) mevInfoItem.priorityRate) && Intrinsics.EZpvd(this.supportMev, mevInfoItem.supportMev) && Intrinsics.EZpvd((Object) this.title, (Object) mevInfoItem.title);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getGas() {
            return this.gas;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<MevNode> getMevNodeList() {
            return this.mevNodeList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getOpenMev() {
            return this.openMev;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPriorityRate() {
            return this.priorityRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getSupportMev() {
            return this.supportMev;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.gas;
            int iHashCode = str == null ? 0 : str.hashCode();
            List<MevNode> list = this.mevNodeList;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            Boolean bool = this.openMev;
            int iHashCode3 = bool == null ? 0 : bool.hashCode();
            String str2 = this.priorityRate;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            Boolean bool2 = this.supportMev;
            int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
            String str3 = this.title;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MevInfoItem(gas=" + this.gas + ", mevNodeList=" + this.mevNodeList + ", openMev=" + this.openMev + ", priorityRate=" + this.priorityRate + ", supportMev=" + this.supportMev + ", title=" + this.title + ")";
        }

        public MevInfoItem(String str, List<MevNode> list, Boolean bool, String str2, Boolean bool2, String str3) {
            this.gas = str;
            this.mevNodeList = list;
            this.openMev = bool;
            this.priorityRate = str2;
            this.supportMev = bool2;
            this.title = str3;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class MevNode {
        public static final int $stable = 8;
        private final List<Integer> chainIds;
        private final String gas;
        private final String name;
        private final String priorityRate;
        private final String supplier;
        private final String vendorIcon;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.wallet.transaction.moduleModel.bean.MevInfo$MevNode */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MevNode copy$default(MevNode mevNode, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mevNode.name;
            }
            if ((i & 2) != 0) {
                str2 = mevNode.supplier;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = mevNode.vendorIcon;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = mevNode.gas;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = mevNode.priorityRate;
            }
            String str9 = str5;
            if ((i & 32) != 0) {
                list = mevNode.chainIds;
            }
            return mevNode.copy(str, str6, str7, str8, str9, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.supplier;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.vendorIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.gas;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.priorityRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Integer> component6() {
            return this.chainIds;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MevNode copy(String str, String str2, String str3, String str4, String str5, List<Integer> list) {
            return new MevNode(str, str2, str3, str4, str5, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MevNode)) {
                return false;
            }
            MevNode mevNode = (MevNode) obj;
            return Intrinsics.EZpvd((Object) this.name, (Object) mevNode.name) && Intrinsics.EZpvd((Object) this.supplier, (Object) mevNode.supplier) && Intrinsics.EZpvd((Object) this.vendorIcon, (Object) mevNode.vendorIcon) && Intrinsics.EZpvd((Object) this.gas, (Object) mevNode.gas) && Intrinsics.EZpvd((Object) this.priorityRate, (Object) mevNode.priorityRate) && Intrinsics.EZpvd(this.chainIds, mevNode.chainIds);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Integer> getChainIds() {
            return this.chainIds;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getGas() {
            return this.gas;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getName() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPriorityRate() {
            return this.priorityRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSupplier() {
            return this.supplier;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getVendorIcon() {
            return this.vendorIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.name;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.supplier;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.vendorIcon;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.gas;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.priorityRate;
            int iHashCode5 = str5 == null ? 0 : str5.hashCode();
            List<Integer> list = this.chainIds;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MevNode(name=" + this.name + ", supplier=" + this.supplier + ", vendorIcon=" + this.vendorIcon + ", gas=" + this.gas + ", priorityRate=" + this.priorityRate + ", chainIds=" + this.chainIds + ")";
        }

        public MevNode(String str, String str2, String str3, String str4, String str5, List<Integer> list) {
            this.name = str;
            this.supplier = str2;
            this.vendorIcon = str3;
            this.gas = str4;
            this.priorityRate = str5;
            this.chainIds = list;
        }
    }
}
