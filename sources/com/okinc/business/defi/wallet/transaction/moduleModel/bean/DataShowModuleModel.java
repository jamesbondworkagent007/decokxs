package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class DataShowModuleModel extends BaseModel<DataShowItem> {
    public static final int $stable = 0;

    public DataShowModuleModel() {
        super("dataShow");
    }

    public static final class DataShowItem {
        public static final int $stable = 0;
        private final String content;
        private final String descText;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DataShowItem copy$default(DataShowItem dataShowItem, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dataShowItem.title;
            }
            if ((i & 2) != 0) {
                str2 = dataShowItem.content;
            }
            if ((i & 4) != 0) {
                str3 = dataShowItem.descText;
            }
            return dataShowItem.copy(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.content;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.descText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DataShowItem copy(@NotNull String str, @NotNull String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new DataShowItem(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataShowItem)) {
                return false;
            }
            DataShowItem dataShowItem = (DataShowItem) obj;
            return Intrinsics.EZpvd((Object) this.title, (Object) dataShowItem.title) && Intrinsics.EZpvd((Object) this.content, (Object) dataShowItem.content) && Intrinsics.EZpvd((Object) this.descText, (Object) dataShowItem.descText);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContent() {
            return this.content;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDescText() {
            return this.descText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.title.hashCode();
            int iHashCode2 = this.content.hashCode();
            String str = this.descText;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DataShowItem(title=" + this.title + ", content=" + this.content + ", descText=" + this.descText + ")";
        }

        public DataShowItem(@NotNull String str, @NotNull String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.title = str;
            this.content = str2;
            this.descText = str3;
        }
    }
}
