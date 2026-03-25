package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C52761wXj;
import o.C8162axY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawAddress implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WithdrawAddress> CREATOR = new Creator();
    private final String addrWithoutTag;
    private final String address;
    private final String addressTitle;
    private final int addressType;
    private final Integer approvalStatus;
    private final String approvalStatusRemark;
    private final String areaCode;
    private final boolean canWithdraw;
    private final long createdDate;
    private final int emailTime;
    private final int generalType;
    private final long id;
    private final String img;
    private final boolean needTag;
    private final String networkIcon;
    private final String networkName;
    private final Boolean showApprovalStatus;
    private final SpecialField specialField;
    private final int status;
    private final String subCurrency;
    private final int subCurrencyId;
    private final String tag;
    private final int targetType;
    private final String targetTypeStr;
    private final long targetUserId;
    private final String title;
    private final boolean travelRuleVerified;
    private Long verifiedAddressExpiryDate;
    private final Long withdrawalLockedUntil;

    public static final class Creator implements Parcelable.Creator<WithdrawAddress> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddress createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            long j = parcel.readLong();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            long j2 = parcel.readLong();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i3 = parcel.readInt();
            String string4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i4 = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i5 = parcel.readInt();
            String string7 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int i6 = parcel.readInt();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            SpecialField specialFieldCreateFromParcel = parcel.readInt() == 0 ? null : SpecialField.CREATOR.createFromParcel(parcel);
            long j3 = parcel.readLong();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WithdrawAddress(string, j, i, i2, j2, string2, string3, i3, string4, z, i4, string5, string6, i5, string7, lValueOf, i6, z2, z3, specialFieldCreateFromParcel, j3, lValueOf2, string8, string9, numValueOf, string10, boolValueOf, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddress[] newArray(int i) {
            return new WithdrawAddress[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawAddress() {
        this(null, 0L, 0, 0, 0L, null, null, 0, null, false, 0, null, null, 0, null, null, 0, false, false, null, 0L, null, null, null, null, null, null, null, null, 536870911, null);
    }

    public static /* synthetic */ void isVerified$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.canWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.emailTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.targetTypeStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.addressTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component16() {
        return this.withdrawalLockedUntil;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.generalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.travelRuleVerified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.needTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpecialField component20() {
        return this.specialField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component21() {
        return this.createdDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component22() {
        return this.verifiedAddressExpiryDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.networkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component25() {
        return this.approvalStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.approvalStatusRemark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component27() {
        return this.showApprovalStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.addrWithoutTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.targetUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.img;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.subCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawAddress copy(String str, long j, int i, int i2, long j2, String str2, String str3, int i3, String str4, boolean z, int i4, String str5, String str6, int i5, String str7, Long l, int i6, boolean z2, boolean z3, SpecialField specialField, long j3, Long l2, String str8, String str9, Integer num, String str10, Boolean bool, String str11, String str12) {
        return new WithdrawAddress(str, j, i, i2, j2, str2, str3, i3, str4, z, i4, str5, str6, i5, str7, l, i6, z2, z3, specialField, j3, l2, str8, str9, num, str10, bool, str11, str12);
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
        if (!(obj instanceof WithdrawAddress)) {
            return false;
        }
        WithdrawAddress withdrawAddress = (WithdrawAddress) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) withdrawAddress.address) && this.id == withdrawAddress.id && this.status == withdrawAddress.status && this.targetType == withdrawAddress.targetType && this.targetUserId == withdrawAddress.targetUserId && Intrinsics.EZpvd((Object) this.title, (Object) withdrawAddress.title) && Intrinsics.EZpvd((Object) this.img, (Object) withdrawAddress.img) && this.subCurrencyId == withdrawAddress.subCurrencyId && Intrinsics.EZpvd((Object) this.subCurrency, (Object) withdrawAddress.subCurrency) && this.canWithdraw == withdrawAddress.canWithdraw && this.emailTime == withdrawAddress.emailTime && Intrinsics.EZpvd((Object) this.targetTypeStr, (Object) withdrawAddress.targetTypeStr) && Intrinsics.EZpvd((Object) this.addressTitle, (Object) withdrawAddress.addressTitle) && this.addressType == withdrawAddress.addressType && Intrinsics.EZpvd((Object) this.areaCode, (Object) withdrawAddress.areaCode) && Intrinsics.EZpvd(this.withdrawalLockedUntil, withdrawAddress.withdrawalLockedUntil) && this.generalType == withdrawAddress.generalType && this.travelRuleVerified == withdrawAddress.travelRuleVerified && this.needTag == withdrawAddress.needTag && Intrinsics.EZpvd(this.specialField, withdrawAddress.specialField) && this.createdDate == withdrawAddress.createdDate && Intrinsics.EZpvd(this.verifiedAddressExpiryDate, withdrawAddress.verifiedAddressExpiryDate) && Intrinsics.EZpvd((Object) this.networkName, (Object) withdrawAddress.networkName) && Intrinsics.EZpvd((Object) this.networkIcon, (Object) withdrawAddress.networkIcon) && Intrinsics.EZpvd(this.approvalStatus, withdrawAddress.approvalStatus) && Intrinsics.EZpvd((Object) this.approvalStatusRemark, (Object) withdrawAddress.approvalStatusRemark) && Intrinsics.EZpvd(this.showApprovalStatus, withdrawAddress.showApprovalStatus) && Intrinsics.EZpvd((Object) this.addrWithoutTag, (Object) withdrawAddress.addrWithoutTag) && Intrinsics.EZpvd((Object) this.tag, (Object) withdrawAddress.tag);
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
    public final String getAddressTitle() {
        return this.addressTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getApprovalStatus() {
        return this.approvalStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovalStatusRemark() {
        return this.approvalStatusRemark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanWithdraw() {
        return this.canWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getEmailTime() {
        return this.emailTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGeneralType() {
        return this.generalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImg() {
        return this.img;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedTag() {
        return this.needTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkIcon() {
        return this.networkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkName() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowApprovalStatus() {
        return this.showApprovalStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpecialField getSpecialField() {
        return this.specialField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubCurrency() {
        return this.subCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTargetType() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetTypeStr() {
        return this.targetTypeStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTargetUserId() {
        return this.targetUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTravelRuleVerified() {
        return this.travelRuleVerified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getVerifiedAddressExpiryDate() {
        return this.verifiedAddressExpiryDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getWithdrawalLockedUntil() {
        return this.withdrawalLockedUntil;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode;
        int i;
        int i2;
        String str = this.address;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = Long.hashCode(this.id);
        int iHashCode4 = Integer.hashCode(this.status);
        int iHashCode5 = Integer.hashCode(this.targetType);
        int iHashCode6 = Long.hashCode(this.targetUserId);
        String str2 = this.title;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.img;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        int iHashCode9 = Integer.hashCode(this.subCurrencyId);
        String str4 = this.subCurrency;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        int iHashCode11 = Boolean.hashCode(this.canWithdraw);
        int iHashCode12 = Integer.hashCode(this.emailTime);
        String str5 = this.targetTypeStr;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.addressTitle;
        int iHashCode14 = str6 == null ? 0 : str6.hashCode();
        int iHashCode15 = Integer.hashCode(this.addressType);
        String str7 = this.areaCode;
        int iHashCode16 = str7 == null ? 0 : str7.hashCode();
        Long l = this.withdrawalLockedUntil;
        int iHashCode17 = l == null ? 0 : l.hashCode();
        int iHashCode18 = Integer.hashCode(this.generalType);
        int iHashCode19 = Boolean.hashCode(this.travelRuleVerified);
        int iHashCode20 = Boolean.hashCode(this.needTag);
        SpecialField specialField = this.specialField;
        if (specialField == null) {
            i = iHashCode14;
            i2 = iHashCode15;
            iHashCode = 0;
        } else {
            iHashCode = specialField.hashCode();
            i = iHashCode14;
            i2 = iHashCode15;
        }
        int iHashCode21 = Long.hashCode(this.createdDate);
        Long l2 = this.verifiedAddressExpiryDate;
        int iHashCode22 = l2 == null ? 0 : l2.hashCode();
        String str8 = this.networkName;
        int iHashCode23 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.networkIcon;
        int iHashCode24 = str9 == null ? 0 : str9.hashCode();
        Integer num = this.approvalStatus;
        int iHashCode25 = num == null ? 0 : num.hashCode();
        String str10 = this.approvalStatusRemark;
        int iHashCode26 = str10 == null ? 0 : str10.hashCode();
        Boolean bool = this.showApprovalStatus;
        int iHashCode27 = bool == null ? 0 : bool.hashCode();
        String str11 = this.addrWithoutTag;
        int iHashCode28 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.tag;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + i2) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + (str12 == null ? 0 : str12.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isVerified() {
        return this.status == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVerifiedAddressExpiryDate(Long l) {
        this.verifiedAddressExpiryDate = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawAddress(address=" + this.address + ", id=" + this.id + ", status=" + this.status + ", targetType=" + this.targetType + ", targetUserId=" + this.targetUserId + ", title=" + this.title + ", img=" + this.img + ", subCurrencyId=" + this.subCurrencyId + ", subCurrency=" + this.subCurrency + ", canWithdraw=" + this.canWithdraw + ", emailTime=" + this.emailTime + ", targetTypeStr=" + this.targetTypeStr + ", addressTitle=" + this.addressTitle + ", addressType=" + this.addressType + ", areaCode=" + this.areaCode + ", withdrawalLockedUntil=" + this.withdrawalLockedUntil + ", generalType=" + this.generalType + ", travelRuleVerified=" + this.travelRuleVerified + ", needTag=" + this.needTag + ", specialField=" + this.specialField + ", createdDate=" + this.createdDate + ", verifiedAddressExpiryDate=" + this.verifiedAddressExpiryDate + ", networkName=" + this.networkName + ", networkIcon=" + this.networkIcon + ", approvalStatus=" + this.approvalStatus + ", approvalStatusRemark=" + this.approvalStatusRemark + ", showApprovalStatus=" + this.showApprovalStatus + ", addrWithoutTag=" + this.addrWithoutTag + ", tag=" + this.tag + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeLong(this.id);
        parcel.writeInt(this.status);
        parcel.writeInt(this.targetType);
        parcel.writeLong(this.targetUserId);
        parcel.writeString(this.title);
        parcel.writeString(this.img);
        parcel.writeInt(this.subCurrencyId);
        parcel.writeString(this.subCurrency);
        parcel.writeInt(this.canWithdraw ? 1 : 0);
        parcel.writeInt(this.emailTime);
        parcel.writeString(this.targetTypeStr);
        parcel.writeString(this.addressTitle);
        parcel.writeInt(this.addressType);
        parcel.writeString(this.areaCode);
        Long l = this.withdrawalLockedUntil;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.generalType);
        parcel.writeInt(this.travelRuleVerified ? 1 : 0);
        parcel.writeInt(this.needTag ? 1 : 0);
        SpecialField specialField = this.specialField;
        if (specialField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            specialField.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.createdDate);
        Long l2 = this.verifiedAddressExpiryDate;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.networkName);
        parcel.writeString(this.networkIcon);
        Integer num = this.approvalStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.approvalStatusRemark);
        Boolean bool = this.showApprovalStatus;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.addrWithoutTag);
        parcel.writeString(this.tag);
    }

    public WithdrawAddress(String str, long j, int i, int i2, long j2, String str2, String str3, int i3, String str4, boolean z, int i4, String str5, String str6, int i5, String str7, Long l, int i6, boolean z2, boolean z3, SpecialField specialField, long j3, Long l2, String str8, String str9, Integer num, String str10, Boolean bool, String str11, String str12) {
        this.address = str;
        this.id = j;
        this.status = i;
        this.targetType = i2;
        this.targetUserId = j2;
        this.title = str2;
        this.img = str3;
        this.subCurrencyId = i3;
        this.subCurrency = str4;
        this.canWithdraw = z;
        this.emailTime = i4;
        this.targetTypeStr = str5;
        this.addressTitle = str6;
        this.addressType = i5;
        this.areaCode = str7;
        this.withdrawalLockedUntil = l;
        this.generalType = i6;
        this.travelRuleVerified = z2;
        this.needTag = z3;
        this.specialField = specialField;
        this.createdDate = j3;
        this.verifiedAddressExpiryDate = l2;
        this.networkName = str8;
        this.networkIcon = str9;
        this.approvalStatus = num;
        this.approvalStatusRemark = str10;
        this.showApprovalStatus = bool;
        this.addrWithoutTag = str11;
        this.tag = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0158: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r66v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r66v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r35v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r66v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r37v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001b: ARITH (r66v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r38v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0023: ARITH (r66v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r39v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r66v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r66v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003c: ARITH (r66v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (Integer.MIN_VALUE int) : (r43v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r66v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004e: ARITH (r66v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r45v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0056: ARITH (r66v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r46v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r66v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:0x006e: TERNARY null = ((wrap:int:0x0066: ARITH (r66v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:int:0x0078: TERNARY null = ((wrap:int:0x0070: ARITH (r66v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r49v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007a: ARITH (r66v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0085: ARITH (r66v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r51v0 java.lang.Long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0090: ARITH (r66v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r52v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x009b: ARITH (r66v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? false : (r53v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r66v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? false : (r54v0 boolean))
  (wrap:com.okinc.assets.backend.api.model.SpecialField:?: TERNARY null = ((wrap:int:0x00b1: ARITH (r66v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.SpecialField) : (r55v0 com.okinc.assets.backend.api.model.SpecialField))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r66v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r56v0 long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00c7: ARITH (r66v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r58v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d2: ARITH (r66v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dd: ARITH (r66v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00e8: ARITH (r66v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r61v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f3: ARITH (r66v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00fe: ARITH (r66v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r63v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0109: ARITH (r66v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0114: ARITH (r66v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
 A[MD:(java.lang.String, long, int, int, long, java.lang.String, java.lang.String, int, java.lang.String, boolean, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Long, int, boolean, boolean, com.okinc.assets.backend.api.model.SpecialField, long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:22) call: com.okinc.assets.backend.api.model.WithdrawAddress.<init>(java.lang.String, long, int, int, long, java.lang.String, java.lang.String, int, java.lang.String, boolean, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Long, int, boolean, boolean, com.okinc.assets.backend.api.model.SpecialField, long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WithdrawAddress(String str, long j, int i, int i2, long j2, String str2, String str3, int i3, String str4, boolean z, int i4, String str5, String str6, int i5, String str7, Long l, int i6, boolean z2, boolean z3, SpecialField specialField, long j3, Long l2, String str8, String str9, Integer num, String str10, Boolean bool, String str11, String str12, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? 0L : j, (i7 & 4) != 0 ? 0 : i, (i7 & 8) != 0 ? 0 : i2, (i7 & 16) != 0 ? 0L : j2, (i7 & 32) != 0 ? null : str2, (i7 & 64) != 0 ? null : str3, (i7 & 128) != 0 ? Integer.MIN_VALUE : i3, (i7 & 256) != 0 ? "" : str4, (i7 & 512) != 0 ? false : z, (i7 & 1024) != 0 ? 0 : i4, (i7 & 2048) != 0 ? null : str5, (i7 & 4096) != 0 ? null : str6, (i7 & 8192) != 0 ? 0 : i5, (i7 & 16384) != 0 ? null : str7, (i7 & 32768) != 0 ? null : l, (i7 & 65536) != 0 ? 0 : i6, (i7 & 131072) != 0 ? false : z2, (i7 & 262144) != 0 ? false : z3, (i7 & 524288) != 0 ? null : specialField, (i7 & 1048576) != 0 ? 0L : j3, (i7 & 2097152) != 0 ? null : l2, (i7 & 4194304) != 0 ? null : str8, (i7 & 8388608) != 0 ? null : str9, (i7 & 16777216) != 0 ? null : num, (i7 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str10, (i7 & 67108864) != 0 ? null : bool, (i7 & 134217728) != 0 ? null : str11, (i7 & 268435456) != 0 ? null : str12);
    }

    public final Integer getApprovalStatusIcon() {
        Integer num = this.approvalStatus;
        if (num != null && num.intValue() == -1) {
            return Integer.valueOf(C52761wXj.TaskDescription.ULRxlR);
        }
        if (num != null && num.intValue() == 0) {
            return Integer.valueOf(C52761wXj.TaskDescription.UhxbNG);
        }
        if (num != null && num.intValue() == 1) {
            return Integer.valueOf(C52761wXj.TaskDescription.fRNHEq);
        }
        if (num != null && num.intValue() == 2) {
            return Integer.valueOf(C52761wXj.TaskDescription.GGlJim);
        }
        return null;
    }

    public final Integer getApprovalStatusIconTint() {
        Integer num = this.approvalStatus;
        if (num != null && num.intValue() == -1) {
            return Integer.valueOf(C52761wXj.Activity.v);
        }
        if (num != null && num.intValue() == 0) {
            return Integer.valueOf(C52761wXj.Activity.FSMca);
        }
        if (num != null && num.intValue() == 1) {
            return Integer.valueOf(C52761wXj.Activity.finishInit);
        }
        if (num != null && num.intValue() == 2) {
            return Integer.valueOf(C52761wXj.Activity.v);
        }
        return null;
    }

    public final String getApprovalStatusSubtitle() {
        Integer num = this.approvalStatus;
        return (num != null && num.intValue() == -1) ? C33070mpX.AYXKKw(C8162axY.TaskDescription.fetchVPNInfo) : (num != null && num.intValue() == 0) ? C33070mpX.AYXKKw(C8162axY.TaskDescription.DbNXlk) : (num != null && num.intValue() == 1) ? C33070mpX.AYXKKw(C8162axY.TaskDescription.AkhnZx) : (num != null && num.intValue() == 2) ? C33070mpX.AYXKKw(C8162axY.TaskDescription.values) : "";
    }
}
