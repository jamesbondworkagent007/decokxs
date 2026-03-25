package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class RecentWithdrawAddressItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecentWithdrawAddressItem> CREATOR = new Creator();
    private String addrWithoutTag;
    private String address;
    private String areaCode;
    private Integer brokerId;
    private Long createdDate;
    private Integer currencyId;
    private String domain;
    private Integer generalType;
    private Long id;
    private Boolean inAddrBook;
    private Integer internalAddressType;
    private Boolean isHalfBlack;
    private Integer isLast;
    private Integer isPluginWallet;
    private Long lastWithdrawalDate;
    private Long modifyDate;
    private Boolean needTag;
    private Integer status;
    private Integer subCurrencyId;
    private String tag;
    private Integer targetType;
    private Long targetUserId;
    private String targetUserSiteId;
    private String title;
    private Long userId;
    private Integer validate;
    private Long verifiedAddressExpiryDate;
    private String web3AccountId;
    private String web3AccountName;
    private Integer web3AddressType;
    private Integer web3ChainIndex;
    private Integer web3WalletType;

    public static final class Creator implements Parcelable.Creator<RecentWithdrawAddressItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecentWithdrawAddressItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf3 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf6 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            Integer numValueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string6 = parcel.readString();
            Integer numValueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf7 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RecentWithdrawAddressItem(boolValueOf, lValueOf, string, string2, numValueOf, numValueOf2, lValueOf2, string3, string4, numValueOf3, numValueOf4, numValueOf5, boolValueOf2, lValueOf3, numValueOf6, numValueOf7, numValueOf8, lValueOf4, numValueOf9, numValueOf10, numValueOf11, lValueOf5, lValueOf6, string5, numValueOf12, string6, numValueOf13, lValueOf7, boolValueOf3, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecentWithdrawAddressItem[] newArray(int i) {
            return new RecentWithdrawAddressItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecentWithdrawAddressItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.inAddrBook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.web3WalletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.web3AddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.web3ChainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.needTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component14() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component15() {
        return this.brokerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component16() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component17() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component18() {
        return this.targetUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component19() {
        return this.isLast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component20() {
        return this.validate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component21() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component22() {
        return this.createdDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component23() {
        return this.modifyDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component25() {
        return this.isPluginWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component27() {
        return this.internalAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component28() {
        return this.verifiedAddressExpiryDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component29() {
        return this.isHalfBlack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.targetUserSiteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.addrWithoutTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.generalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.lastWithdrawalDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.web3AccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.web3AccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecentWithdrawAddressItem copy(Boolean bool, Long l, String str, String str2, Integer num, Integer num2, Long l2, String str3, String str4, Integer num3, Integer num4, Integer num5, Boolean bool2, Long l3, Integer num6, Integer num7, Integer num8, Long l4, Integer num9, Integer num10, Integer num11, Long l5, Long l6, String str5, Integer num12, String str6, Integer num13, Long l7, Boolean bool3, String str7, String str8, String str9) {
        return new RecentWithdrawAddressItem(bool, l, str, str2, num, num2, l2, str3, str4, num3, num4, num5, bool2, l3, num6, num7, num8, l4, num9, num10, num11, l5, l6, str5, num12, str6, num13, l7, bool3, str7, str8, str9);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentWithdrawAddressItem)) {
            return false;
        }
        RecentWithdrawAddressItem recentWithdrawAddressItem = (RecentWithdrawAddressItem) obj;
        return Intrinsics.EZpvd(this.inAddrBook, recentWithdrawAddressItem.inAddrBook) && Intrinsics.EZpvd(this.id, recentWithdrawAddressItem.id) && Intrinsics.EZpvd((Object) this.address, (Object) recentWithdrawAddressItem.address) && Intrinsics.EZpvd((Object) this.title, (Object) recentWithdrawAddressItem.title) && Intrinsics.EZpvd(this.generalType, recentWithdrawAddressItem.generalType) && Intrinsics.EZpvd(this.status, recentWithdrawAddressItem.status) && Intrinsics.EZpvd(this.lastWithdrawalDate, recentWithdrawAddressItem.lastWithdrawalDate) && Intrinsics.EZpvd((Object) this.web3AccountName, (Object) recentWithdrawAddressItem.web3AccountName) && Intrinsics.EZpvd((Object) this.web3AccountId, (Object) recentWithdrawAddressItem.web3AccountId) && Intrinsics.EZpvd(this.web3WalletType, recentWithdrawAddressItem.web3WalletType) && Intrinsics.EZpvd(this.web3AddressType, recentWithdrawAddressItem.web3AddressType) && Intrinsics.EZpvd(this.web3ChainIndex, recentWithdrawAddressItem.web3ChainIndex) && Intrinsics.EZpvd(this.needTag, recentWithdrawAddressItem.needTag) && Intrinsics.EZpvd(this.userId, recentWithdrawAddressItem.userId) && Intrinsics.EZpvd(this.brokerId, recentWithdrawAddressItem.brokerId) && Intrinsics.EZpvd(this.currencyId, recentWithdrawAddressItem.currencyId) && Intrinsics.EZpvd(this.targetType, recentWithdrawAddressItem.targetType) && Intrinsics.EZpvd(this.targetUserId, recentWithdrawAddressItem.targetUserId) && Intrinsics.EZpvd(this.isLast, recentWithdrawAddressItem.isLast) && Intrinsics.EZpvd(this.validate, recentWithdrawAddressItem.validate) && Intrinsics.EZpvd(this.subCurrencyId, recentWithdrawAddressItem.subCurrencyId) && Intrinsics.EZpvd(this.createdDate, recentWithdrawAddressItem.createdDate) && Intrinsics.EZpvd(this.modifyDate, recentWithdrawAddressItem.modifyDate) && Intrinsics.EZpvd((Object) this.domain, (Object) recentWithdrawAddressItem.domain) && Intrinsics.EZpvd(this.isPluginWallet, recentWithdrawAddressItem.isPluginWallet) && Intrinsics.EZpvd((Object) this.areaCode, (Object) recentWithdrawAddressItem.areaCode) && Intrinsics.EZpvd(this.internalAddressType, recentWithdrawAddressItem.internalAddressType) && Intrinsics.EZpvd(this.verifiedAddressExpiryDate, recentWithdrawAddressItem.verifiedAddressExpiryDate) && Intrinsics.EZpvd(this.isHalfBlack, recentWithdrawAddressItem.isHalfBlack) && Intrinsics.EZpvd((Object) this.targetUserSiteId, (Object) recentWithdrawAddressItem.targetUserSiteId) && Intrinsics.EZpvd((Object) this.addrWithoutTag, (Object) recentWithdrawAddressItem.addrWithoutTag) && Intrinsics.EZpvd((Object) this.tag, (Object) recentWithdrawAddressItem.tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddrWithoutTag() {
        return this.addrWithoutTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBrokerId() {
        return this.brokerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getGeneralType() {
        return this.generalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getInAddrBook() {
        return this.inAddrBook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInternalAddressType() {
        return this.internalAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getLastWithdrawalDate() {
        return this.lastWithdrawalDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getModifyDate() {
        return this.modifyDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedTag() {
        return this.needTag;
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
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTargetType() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTargetUserId() {
        return this.targetUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetUserSiteId() {
        return this.targetUserSiteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getUserId() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getValidate() {
        return this.validate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getVerifiedAddressExpiryDate() {
        return this.verifiedAddressExpiryDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeb3AccountId() {
        return this.web3AccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeb3AccountName() {
        return this.web3AccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getWeb3AddressType() {
        return this.web3AddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getWeb3ChainIndex() {
        return this.web3ChainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getWeb3WalletType() {
        return this.web3WalletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.inAddrBook;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Long l = this.id;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        String str = this.address;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.generalType;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        Integer num2 = this.status;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        Long l2 = this.lastWithdrawalDate;
        int iHashCode7 = l2 == null ? 0 : l2.hashCode();
        String str3 = this.web3AccountName;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.web3AccountId;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        Integer num3 = this.web3WalletType;
        int iHashCode10 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.web3AddressType;
        int iHashCode11 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.web3ChainIndex;
        int iHashCode12 = num5 == null ? 0 : num5.hashCode();
        Boolean bool2 = this.needTag;
        int iHashCode13 = bool2 == null ? 0 : bool2.hashCode();
        Long l3 = this.userId;
        int iHashCode14 = l3 == null ? 0 : l3.hashCode();
        Integer num6 = this.brokerId;
        int iHashCode15 = num6 == null ? 0 : num6.hashCode();
        Integer num7 = this.currencyId;
        int iHashCode16 = num7 == null ? 0 : num7.hashCode();
        Integer num8 = this.targetType;
        int iHashCode17 = num8 == null ? 0 : num8.hashCode();
        Long l4 = this.targetUserId;
        int iHashCode18 = l4 == null ? 0 : l4.hashCode();
        Integer num9 = this.isLast;
        int iHashCode19 = num9 == null ? 0 : num9.hashCode();
        Integer num10 = this.validate;
        int iHashCode20 = num10 == null ? 0 : num10.hashCode();
        Integer num11 = this.subCurrencyId;
        int iHashCode21 = num11 == null ? 0 : num11.hashCode();
        Long l5 = this.createdDate;
        int iHashCode22 = l5 == null ? 0 : l5.hashCode();
        Long l6 = this.modifyDate;
        int iHashCode23 = l6 == null ? 0 : l6.hashCode();
        String str5 = this.domain;
        int iHashCode24 = str5 == null ? 0 : str5.hashCode();
        Integer num12 = this.isPluginWallet;
        int iHashCode25 = num12 == null ? 0 : num12.hashCode();
        String str6 = this.areaCode;
        int iHashCode26 = str6 == null ? 0 : str6.hashCode();
        Integer num13 = this.internalAddressType;
        int iHashCode27 = num13 == null ? 0 : num13.hashCode();
        Long l7 = this.verifiedAddressExpiryDate;
        int iHashCode28 = l7 == null ? 0 : l7.hashCode();
        Boolean bool3 = this.isHalfBlack;
        int iHashCode29 = bool3 == null ? 0 : bool3.hashCode();
        String str7 = this.targetUserSiteId;
        int iHashCode30 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.addrWithoutTag;
        int iHashCode31 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tag;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + (str9 == null ? 0 : str9.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isHalfBlack() {
        return this.isHalfBlack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isLast() {
        return this.isLast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isPluginWallet() {
        return this.isPluginWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddrWithoutTag(String str) {
        this.addrWithoutTag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAreaCode(String str) {
        this.areaCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBrokerId(Integer num) {
        this.brokerId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreatedDate(Long l) {
        this.createdDate = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(Integer num) {
        this.currencyId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDomain(String str) {
        this.domain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGeneralType(Integer num) {
        this.generalType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHalfBlack(Boolean bool) {
        this.isHalfBlack = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(Long l) {
        this.id = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInAddrBook(Boolean bool) {
        this.inAddrBook = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInternalAddressType(Integer num) {
        this.internalAddressType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLast(Integer num) {
        this.isLast = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastWithdrawalDate(Long l) {
        this.lastWithdrawalDate = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModifyDate(Long l) {
        this.modifyDate = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedTag(Boolean bool) {
        this.needTag = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPluginWallet(Integer num) {
        this.isPluginWallet = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(Integer num) {
        this.status = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrencyId(Integer num) {
        this.subCurrencyId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(String str) {
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetType(Integer num) {
        this.targetType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetUserId(Long l) {
        this.targetUserId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetUserSiteId(String str) {
        this.targetUserSiteId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserId(Long l) {
        this.userId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValidate(Integer num) {
        this.validate = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVerifiedAddressExpiryDate(Long l) {
        this.verifiedAddressExpiryDate = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeb3AccountId(String str) {
        this.web3AccountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeb3AccountName(String str) {
        this.web3AccountName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeb3AddressType(Integer num) {
        this.web3AddressType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeb3ChainIndex(Integer num) {
        this.web3ChainIndex = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeb3WalletType(Integer num) {
        this.web3WalletType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecentWithdrawAddressItem(inAddrBook=" + this.inAddrBook + ", id=" + this.id + ", address=" + this.address + ", title=" + this.title + ", generalType=" + this.generalType + ", status=" + this.status + ", lastWithdrawalDate=" + this.lastWithdrawalDate + ", web3AccountName=" + this.web3AccountName + ", web3AccountId=" + this.web3AccountId + ", web3WalletType=" + this.web3WalletType + ", web3AddressType=" + this.web3AddressType + ", web3ChainIndex=" + this.web3ChainIndex + ", needTag=" + this.needTag + ", userId=" + this.userId + ", brokerId=" + this.brokerId + ", currencyId=" + this.currencyId + ", targetType=" + this.targetType + ", targetUserId=" + this.targetUserId + ", isLast=" + this.isLast + ", validate=" + this.validate + ", subCurrencyId=" + this.subCurrencyId + ", createdDate=" + this.createdDate + ", modifyDate=" + this.modifyDate + ", domain=" + this.domain + ", isPluginWallet=" + this.isPluginWallet + ", areaCode=" + this.areaCode + ", internalAddressType=" + this.internalAddressType + ", verifiedAddressExpiryDate=" + this.verifiedAddressExpiryDate + ", isHalfBlack=" + this.isHalfBlack + ", targetUserSiteId=" + this.targetUserSiteId + ", addrWithoutTag=" + this.addrWithoutTag + ", tag=" + this.tag + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.inAddrBook;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l = this.id;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.address);
        parcel.writeString(this.title);
        Integer num = this.generalType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.status;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Long l2 = this.lastWithdrawalDate;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.web3AccountName);
        parcel.writeString(this.web3AccountId);
        Integer num3 = this.web3WalletType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.web3AddressType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.web3ChainIndex;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Boolean bool2 = this.needTag;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Long l3 = this.userId;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Integer num6 = this.brokerId;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        Integer num7 = this.currencyId;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        Integer num8 = this.targetType;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num8.intValue());
        }
        Long l4 = this.targetUserId;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        Integer num9 = this.isLast;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num9.intValue());
        }
        Integer num10 = this.validate;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num10.intValue());
        }
        Integer num11 = this.subCurrencyId;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num11.intValue());
        }
        Long l5 = this.createdDate;
        if (l5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l5.longValue());
        }
        Long l6 = this.modifyDate;
        if (l6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l6.longValue());
        }
        parcel.writeString(this.domain);
        Integer num12 = this.isPluginWallet;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num12.intValue());
        }
        parcel.writeString(this.areaCode);
        Integer num13 = this.internalAddressType;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num13.intValue());
        }
        Long l7 = this.verifiedAddressExpiryDate;
        if (l7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l7.longValue());
        }
        Boolean bool3 = this.isHalfBlack;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.targetUserSiteId);
        parcel.writeString(this.addrWithoutTag);
        parcel.writeString(this.tag);
    }

    public RecentWithdrawAddressItem(Boolean bool, Long l, String str, String str2, Integer num, Integer num2, Long l2, String str3, String str4, Integer num3, Integer num4, Integer num5, Boolean bool2, Long l3, Integer num6, Integer num7, Integer num8, Long l4, Integer num9, Integer num10, Integer num11, Long l5, Long l6, String str5, Integer num12, String str6, Integer num13, Long l7, Boolean bool3, String str7, String str8, String str9) {
        this.inAddrBook = bool;
        this.id = l;
        this.address = str;
        this.title = str2;
        this.generalType = num;
        this.status = num2;
        this.lastWithdrawalDate = l2;
        this.web3AccountName = str3;
        this.web3AccountId = str4;
        this.web3WalletType = num3;
        this.web3AddressType = num4;
        this.web3ChainIndex = num5;
        this.needTag = bool2;
        this.userId = l3;
        this.brokerId = num6;
        this.currencyId = num7;
        this.targetType = num8;
        this.targetUserId = l4;
        this.isLast = num9;
        this.validate = num10;
        this.subCurrencyId = num11;
        this.createdDate = l5;
        this.modifyDate = l6;
        this.domain = str5;
        this.isPluginWallet = num12;
        this.areaCode = str6;
        this.internalAddressType = num13;
        this.verifiedAddressExpiryDate = l7;
        this.isHalfBlack = bool3;
        this.targetUserSiteId = str7;
        this.addrWithoutTag = str8;
        this.tag = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0177: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r66v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r34v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r66v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r35v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r66v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r66v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0022: ARITH (r66v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r38v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002a: ARITH (r66v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r39v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0032: ARITH (r66v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r40v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r66v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r66v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004a: ARITH (r66v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r43v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0052: ARITH (r66v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r44v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005a: ARITH (r66v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r45v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0062: ARITH (r66v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r46v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x006a: ARITH (r66v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r47v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0072: ARITH (r66v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r48v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x007d: ARITH (r66v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r49v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0088: ARITH (r66v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r50v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0093: ARITH (r66v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r51v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x009e: ARITH (r66v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r52v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r66v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r53v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r66v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r54v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r66v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r55v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r66v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r56v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r66v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r66v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r58v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r66v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r66v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r60v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0101: ARITH (r66v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r61v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x010c: ARITH (r66v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r62v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0117: ARITH (r66v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0122: ARITH (r66v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012d: ARITH (r66v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.RecentWithdrawAddressItem.<init>(java.lang.Boolean, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RecentWithdrawAddressItem(Boolean bool, Long l, String str, String str2, Integer num, Integer num2, Long l2, String str3, String str4, Integer num3, Integer num4, Integer num5, Boolean bool2, Long l3, Integer num6, Integer num7, Integer num8, Long l4, Integer num9, Integer num10, Integer num11, Long l5, Long l6, String str5, Integer num12, String str6, Integer num13, Long l7, Boolean bool3, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : num4, (i & 2048) != 0 ? null : num5, (i & 4096) != 0 ? null : bool2, (i & 8192) != 0 ? null : l3, (i & 16384) != 0 ? null : num6, (i & 32768) != 0 ? null : num7, (i & 65536) != 0 ? null : num8, (i & 131072) != 0 ? null : l4, (i & 262144) != 0 ? null : num9, (i & 524288) != 0 ? null : num10, (i & 1048576) != 0 ? null : num11, (i & 2097152) != 0 ? null : l5, (i & 4194304) != 0 ? null : l6, (i & 8388608) != 0 ? null : str5, (i & 16777216) != 0 ? null : num12, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str6, (i & 67108864) != 0 ? null : num13, (i & 134217728) != 0 ? null : l7, (i & 268435456) != 0 ? null : bool3, (i & 536870912) != 0 ? null : str7, (i & 1073741824) != 0 ? null : str8, (i & Integer.MIN_VALUE) != 0 ? null : str9);
    }

    public final boolean isVerified() {
        Integer num = this.status;
        return num != null && num.intValue() == 1;
    }
}
