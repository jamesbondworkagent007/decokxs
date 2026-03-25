package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Advance extends BaseModel<AdvanceItem> {
    public static final int $stable = 0;

    public Advance() {
        super("advance");
    }

    public static final class AdvanceItem {
        public static final int $stable = 8;
        private final List<BaseModel<?>> children;
        private final Boolean listExpansion;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.transaction.moduleModel.bean.Advance$AdvanceItem */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AdvanceItem copy$default(AdvanceItem advanceItem, List list, String str, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                list = advanceItem.children;
            }
            if ((i & 2) != 0) {
                str = advanceItem.title;
            }
            if ((i & 4) != 0) {
                bool = advanceItem.listExpansion;
            }
            return advanceItem.copy(list, str, bool);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<BaseModel<?>> component1() {
            return this.children;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component3() {
            return this.listExpansion;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AdvanceItem copy(List<? extends BaseModel<?>> list, String str, Boolean bool) {
            return new AdvanceItem(list, str, bool);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvanceItem)) {
                return false;
            }
            AdvanceItem advanceItem = (AdvanceItem) obj;
            return Intrinsics.EZpvd(this.children, advanceItem.children) && Intrinsics.EZpvd((Object) this.title, (Object) advanceItem.title) && Intrinsics.EZpvd(this.listExpansion, advanceItem.listExpansion);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<BaseModel<?>> getChildren() {
            return this.children;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getListExpansion() {
            return this.listExpansion;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            List<BaseModel<?>> list = this.children;
            int iHashCode = list == null ? 0 : list.hashCode();
            String str = this.title;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            Boolean bool = this.listExpansion;
            return (((iHashCode * 31) + iHashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AdvanceItem(children=" + this.children + ", title=" + this.title + ", listExpansion=" + this.listExpansion + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel<?>> */
        /* JADX WARN: Multi-variable type inference failed */
        public AdvanceItem(List<? extends BaseModel<?>> list, String str, Boolean bool) {
            this.children = list;
            this.title = str;
            this.listExpansion = bool;
        }
    }
}
