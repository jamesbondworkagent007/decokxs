package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class AppBarTitleModuleModel extends BaseModel<AppBarTitleItem> {
    public static final int $stable = 0;

    public AppBarTitleModuleModel() {
        super("appBarTitle");
    }

    public static final class AppBarTitleItem {
        public static final int $stable = 0;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AppBarTitleItem copy$default(AppBarTitleItem appBarTitleItem, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = appBarTitleItem.title;
            }
            return appBarTitleItem.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppBarTitleItem copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new AppBarTitleItem(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppBarTitleItem) && Intrinsics.EZpvd((Object) this.title, (Object) ((AppBarTitleItem) obj).title);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.title.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AppBarTitleItem(title=" + this.title + ")";
        }

        public AppBarTitleItem(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.title = str;
        }
    }
}
