package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressSwitchModuleModel extends BaseModel<AddressItem> {
    public static final int $stable = 0;

    public AddressSwitchModuleModel() {
        super("addressSwitch");
    }

    public static final class AddressItem {
        public static final int $stable = 0;
        private final String addressTypeText;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AddressItem copy$default(AddressItem addressItem, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = addressItem.title;
            }
            if ((i & 2) != 0) {
                str2 = addressItem.addressTypeText;
            }
            return addressItem.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.addressTypeText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AddressItem copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new AddressItem(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddressItem)) {
                return false;
            }
            AddressItem addressItem = (AddressItem) obj;
            return Intrinsics.EZpvd((Object) this.title, (Object) addressItem.title) && Intrinsics.EZpvd((Object) this.addressTypeText, (Object) addressItem.addressTypeText);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddressTypeText() {
            return this.addressTypeText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.title.hashCode() * 31) + this.addressTypeText.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AddressItem(title=" + this.title + ", addressTypeText=" + this.addressTypeText + ")";
        }

        public AddressItem(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.title = str;
            this.addressTypeText = str2;
        }
    }
}
