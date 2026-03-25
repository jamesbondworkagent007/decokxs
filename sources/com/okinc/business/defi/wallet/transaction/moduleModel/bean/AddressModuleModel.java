package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressModuleModel extends BaseModel<AddressItem> {
    public static final int $stable = 0;

    public AddressModuleModel() {
        super(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
    }

    public static final class AddressItem {
        public static final int $stable = 8;
        private String address;
        private transient String addressType;
        private final Boolean redShow;
        private final Boolean showAccountNameFlag;
        private transient Boolean showArrow;
        private transient String tag;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AddressItem copy$default(AddressItem addressItem, String str, Boolean bool, String str2, Boolean bool2, String str3, String str4, Boolean bool3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = addressItem.address;
            }
            if ((i & 2) != 0) {
                bool = addressItem.redShow;
            }
            Boolean bool4 = bool;
            if ((i & 4) != 0) {
                str2 = addressItem.title;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                bool2 = addressItem.showAccountNameFlag;
            }
            Boolean bool5 = bool2;
            if ((i & 16) != 0) {
                str3 = addressItem.tag;
            }
            String str6 = str3;
            if ((i & 32) != 0) {
                str4 = addressItem.addressType;
            }
            String str7 = str4;
            if ((i & 64) != 0) {
                bool3 = addressItem.showArrow;
            }
            return addressItem.copy(str, bool4, str5, bool5, str6, str7, bool3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component2() {
            return this.redShow;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component4() {
            return this.showAccountNameFlag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.tag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.addressType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component7() {
            return this.showArrow;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AddressItem copy(String str, Boolean bool, @NotNull String str2, Boolean bool2, String str3, String str4, Boolean bool3) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new AddressItem(str, bool, str2, bool2, str3, str4, bool3);
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
            return Intrinsics.EZpvd((Object) this.address, (Object) addressItem.address) && Intrinsics.EZpvd(this.redShow, addressItem.redShow) && Intrinsics.EZpvd((Object) this.title, (Object) addressItem.title) && Intrinsics.EZpvd(this.showAccountNameFlag, addressItem.showAccountNameFlag) && Intrinsics.EZpvd((Object) this.tag, (Object) addressItem.tag) && Intrinsics.EZpvd((Object) this.addressType, (Object) addressItem.addressType) && Intrinsics.EZpvd(this.showArrow, addressItem.showArrow);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddressType() {
            return this.addressType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getRedShow() {
            return this.redShow;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getShowAccountNameFlag() {
            return this.showAccountNameFlag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getShowArrow() {
            return this.showArrow;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTag() {
            return this.tag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.address;
            int iHashCode = str == null ? 0 : str.hashCode();
            Boolean bool = this.redShow;
            int iHashCode2 = bool == null ? 0 : bool.hashCode();
            int iHashCode3 = this.title.hashCode();
            Boolean bool2 = this.showAccountNameFlag;
            int iHashCode4 = bool2 == null ? 0 : bool2.hashCode();
            String str2 = this.tag;
            int iHashCode5 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.addressType;
            int iHashCode6 = str3 == null ? 0 : str3.hashCode();
            Boolean bool3 = this.showArrow;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool3 != null ? bool3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAddress(String str) {
            this.address = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAddressType(String str) {
            this.addressType = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setShowArrow(Boolean bool) {
            this.showArrow = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTag(String str) {
            this.tag = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AddressItem(address=" + this.address + ", redShow=" + this.redShow + ", title=" + this.title + ", showAccountNameFlag=" + this.showAccountNameFlag + ", tag=" + this.tag + ", addressType=" + this.addressType + ", showArrow=" + this.showArrow + ")";
        }

        public AddressItem(String str, Boolean bool, @NotNull String str2, Boolean bool2, String str3, String str4, Boolean bool3) {
            Intrinsics.checkNotNullParameter(str2, "");
            this.address = str;
            this.redShow = bool;
            this.title = str2;
            this.showAccountNameFlag = bool2;
            this.tag = str3;
            this.addressType = str4;
            this.showArrow = bool3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.Boolean)
  (r13v0 java.lang.String)
  (r14v0 java.lang.Boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r17v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:239) call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.AddressModuleModel.AddressItem.<init>(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
        public /* synthetic */ AddressItem(String str, Boolean bool, String str2, Boolean bool2, String str3, String str4, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bool, str2, bool2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool3);
        }
    }
}
