package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ShowInformationModuleModel extends BaseModel<InformationItem> {
    public static final int $stable = 0;

    public ShowInformationModuleModel() {
        super("showInformation");
    }

    public static final class InformationItem {
        public static final int $stable = 0;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ InformationItem copy$default(InformationItem informationItem, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = informationItem.title;
            }
            return informationItem.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InformationItem copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new InformationItem(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InformationItem) && Intrinsics.EZpvd((Object) this.title, (Object) ((InformationItem) obj).title);
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
            return "InformationItem(title=" + this.title + ")";
        }

        public InformationItem(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.title = str;
        }
    }
}
