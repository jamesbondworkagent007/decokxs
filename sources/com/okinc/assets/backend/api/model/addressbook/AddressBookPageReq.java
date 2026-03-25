package com.okinc.assets.backend.api.model.addressbook;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AddressBookPageReq {
    public static final int $stable = 0;
    private final int currencyId;
    private final Integer maxIdExclusive;
    private final Integer onchainAddressType;
    private final Integer page;
    private final String searchWord;
    private final Integer size;
    private final Integer status;
    private final Integer subCurrencyId;
    private final int type;
    private final boolean upgradeAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.upgradeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.onchainAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.searchWord;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.maxIdExclusive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressBookPageReq copy(int i, int i2, Integer num, Integer num2, Integer num3, String str, Integer num4, Integer num5, Integer num6, boolean z) {
        return new AddressBookPageReq(i, i2, num, num2, num3, str, num4, num5, num6, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressBookPageReq)) {
            return false;
        }
        AddressBookPageReq addressBookPageReq = (AddressBookPageReq) obj;
        return this.currencyId == addressBookPageReq.currencyId && this.type == addressBookPageReq.type && Intrinsics.EZpvd(this.subCurrencyId, addressBookPageReq.subCurrencyId) && Intrinsics.EZpvd(this.onchainAddressType, addressBookPageReq.onchainAddressType) && Intrinsics.EZpvd(this.status, addressBookPageReq.status) && Intrinsics.EZpvd((Object) this.searchWord, (Object) addressBookPageReq.searchWord) && Intrinsics.EZpvd(this.page, addressBookPageReq.page) && Intrinsics.EZpvd(this.size, addressBookPageReq.size) && Intrinsics.EZpvd(this.maxIdExclusive, addressBookPageReq.maxIdExclusive) && this.upgradeAddress == addressBookPageReq.upgradeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMaxIdExclusive() {
        return this.maxIdExclusive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOnchainAddressType() {
        return this.onchainAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPage() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSearchWord() {
        return this.searchWord;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUpgradeAddress() {
        return this.upgradeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.currencyId);
        int iHashCode2 = Integer.hashCode(this.type);
        Integer num = this.subCurrencyId;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.onchainAddressType;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.status;
        int iHashCode5 = num3 == null ? 0 : num3.hashCode();
        String str = this.searchWord;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        Integer num4 = this.page;
        int iHashCode7 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.size;
        int iHashCode8 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.maxIdExclusive;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (num6 != null ? num6.hashCode() : 0)) * 31) + Boolean.hashCode(this.upgradeAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressBookPageReq(currencyId=" + this.currencyId + ", type=" + this.type + ", subCurrencyId=" + this.subCurrencyId + ", onchainAddressType=" + this.onchainAddressType + ", status=" + this.status + ", searchWord=" + this.searchWord + ", page=" + this.page + ", size=" + this.size + ", maxIdExclusive=" + this.maxIdExclusive + ", upgradeAddress=" + this.upgradeAddress + ")";
    }

    public AddressBookPageReq(int i, int i2, Integer num, Integer num2, Integer num3, String str, Integer num4, Integer num5, Integer num6, boolean z) {
        this.currencyId = i;
        this.type = i2;
        this.subCurrencyId = num;
        this.onchainAddressType = num2;
        this.status = num3;
        this.searchWord = str;
        this.page = num4;
        this.size = num5;
        this.maxIdExclusive = num6;
        this.upgradeAddress = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (r15v0 int)
  (r16v0 int)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0013: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0023: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r21v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002b: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0033: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r23v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
 A[MD:(int, int, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean):void (m)] (LINE:15) call: com.okinc.assets.backend.api.model.addressbook.AddressBookPageReq.<init>(int, int, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean):void type: THIS */
    public /* synthetic */ AddressBookPageReq(int i, int i2, Integer num, Integer num2, Integer num3, String str, Integer num4, Integer num5, Integer num6, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : num2, (i3 & 16) != 0 ? null : num3, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? null : num4, (i3 & 128) != 0 ? null : num5, (i3 & 256) != 0 ? null : num6, (i3 & 512) != 0 ? false : z);
    }
}
