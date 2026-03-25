package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Tabs extends BaseModel<TabItem> {
    public static final int $stable = 0;

    public Tabs() {
        super("tabs");
    }

    public static final class TabItem {
        public static final int $stable = 8;
        private final List<Children> children;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.transaction.moduleModel.bean.Tabs$TabItem */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TabItem copy$default(TabItem tabItem, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = tabItem.children;
            }
            return tabItem.copy(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Children> component1() {
            return this.children;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TabItem copy(List<Children> list) {
            return new TabItem(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TabItem) && Intrinsics.EZpvd(this.children, ((TabItem) obj).children);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Children> getChildren() {
            return this.children;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            List<Children> list = this.children;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TabItem(children=" + this.children + ")";
        }

        public TabItem(List<Children> list) {
            this.children = list;
        }
    }

    public static final class Children {
        public static final int $stable = 8;
        private String data;
        private final String title;
        private final String type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Children copy$default(Children children, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = children.data;
            }
            if ((i & 2) != 0) {
                str2 = children.title;
            }
            if ((i & 4) != 0) {
                str3 = children.type;
            }
            return children.copy(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Children copy(String str, String str2, String str3) {
            return new Children(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Children)) {
                return false;
            }
            Children children = (Children) obj;
            return Intrinsics.EZpvd((Object) this.data, (Object) children.data) && Intrinsics.EZpvd((Object) this.title, (Object) children.title) && Intrinsics.EZpvd((Object) this.type, (Object) children.type);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.data;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.title;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.type;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setData(String str) {
            this.data = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Children(data=" + this.data + ", title=" + this.title + ", type=" + this.type + ")";
        }

        public Children(String str, String str2, String str3) {
            this.data = str;
            this.title = str2;
            this.type = str3;
        }
    }
}
