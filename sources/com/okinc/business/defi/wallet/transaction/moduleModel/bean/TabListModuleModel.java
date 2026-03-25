package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class TabListModuleModel extends BaseModel<TabListItem> {
    public static final int $stable = 0;

    public TabListModuleModel() {
        super("approveTo");
    }

    public static final class TabListItem {
        public static final int $stable = 8;
        private final List<TabsItem> datas;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.transaction.moduleModel.bean.TabListModuleModel$TabListItem */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TabListItem copy$default(TabListItem tabListItem, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tabListItem.title;
            }
            if ((i & 2) != 0) {
                list = tabListItem.datas;
            }
            return tabListItem.copy(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<TabsItem> component2() {
            return this.datas;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TabListItem copy(@NotNull String str, List<TabsItem> list) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TabListItem(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabListItem)) {
                return false;
            }
            TabListItem tabListItem = (TabListItem) obj;
            return Intrinsics.EZpvd((Object) this.title, (Object) tabListItem.title) && Intrinsics.EZpvd(this.datas, tabListItem.datas);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<TabsItem> getDatas() {
            return this.datas;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.title.hashCode();
            List<TabsItem> list = this.datas;
            return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TabListItem(title=" + this.title + ", datas=" + this.datas + ")";
        }

        public TabListItem(@NotNull String str, List<TabsItem> list) {
            Intrinsics.checkNotNullParameter(str, "");
            this.title = str;
            this.datas = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.defi.wallet.transaction.moduleModel.bean.TabListModuleModel$TabsItem>):void (m)] (LINE:497) call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.TabListModuleModel.TabListItem.<init>(java.lang.String, java.util.List):void type: THIS */
        public /* synthetic */ TabListItem(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : list);
        }
    }

    public static final class TabsItem {
        public static final int $stable = 0;
        private final String address;
        private final String projectName;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TabsItem copy$default(TabsItem tabsItem, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tabsItem.title;
            }
            if ((i & 2) != 0) {
                str2 = tabsItem.address;
            }
            if ((i & 4) != 0) {
                str3 = tabsItem.projectName;
            }
            return tabsItem.copy(str, str2, str3);
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
        public final String component3() {
            return this.projectName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TabsItem copy(@NotNull String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TabsItem(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabsItem)) {
                return false;
            }
            TabsItem tabsItem = (TabsItem) obj;
            return Intrinsics.EZpvd((Object) this.title, (Object) tabsItem.title) && Intrinsics.EZpvd((Object) this.address, (Object) tabsItem.address) && Intrinsics.EZpvd((Object) this.projectName, (Object) tabsItem.projectName);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getProjectName() {
            return this.projectName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.title.hashCode();
            String str = this.address;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.projectName;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TabsItem(title=" + this.title + ", address=" + this.address + ", projectName=" + this.projectName + ")";
        }

        public TabsItem(@NotNull String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.title = str;
            this.address = str2;
            this.projectName = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:503) call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.TabListModuleModel.TabsItem.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ TabsItem(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }
}
