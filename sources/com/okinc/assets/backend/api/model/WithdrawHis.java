package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pTA;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class WithdrawHis implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WithdrawHis> CREATOR = new Creator();
    private final Integer addrStatus;
    private String address;
    private String addressTitle;
    private final Integer addressType;
    private String amount;
    private int areaCode;
    private final CancelledStatus cancelledStatus;
    private final String convertRate;
    private final Long convertTime;
    private long createDate;
    private String currency;
    private int currencyId;
    private final String desc;
    private String detailUrl;
    private final String domain;
    private String fee;
    private String feeCurrency;
    private final String fullName;
    private final String icon;
    private final Long id;
    private Integer internalAddressType;
    private boolean isInvoice;
    private final String isSymbolUntradable;
    private final String lstCurrencyAmount;
    private final String lstCurrencyIcon;
    private final String lstCurrencyName;
    private final String networkIcon;
    private final String networkName;
    private final List<Notice> notices;
    private final String price;
    private int status;
    private String statusRemark;
    private String statusStr;
    private String subCurrency;
    private final String subCurrencyId;
    private int targetType;
    private final String targetTypeStr;
    private String targetUid;
    private final String targetUserId;
    private final String tokenPrice;
    private final String totalAmount;
    private String txid;
    private int type;
    private final String value;
    private final WithdrawalOnchainInfo withdrawalOnchainInfo;

    public static final class Creator implements Parcelable.Creator<WithdrawHis> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawHis createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            long j = parcel.readLong();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i3 = parcel.readInt();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i4 = 0;
            boolean z = parcel.readInt() != 0;
            int i5 = parcel.readInt();
            String string10 = parcel.readString();
            int i6 = parcel.readInt();
            String string11 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                arrayList = new ArrayList(i7);
                while (i4 != i7) {
                    arrayList.add(Notice.CREATOR.createFromParcel(parcel));
                    i4++;
                    i7 = i7;
                }
            }
            return new WithdrawHis(lValueOf, string, string2, string3, j, i, string4, i2, string5, string6, string7, i3, string8, string9, z, i5, string10, i6, string11, numValueOf, string12, arrayList, parcel.readInt() == 0 ? null : CancelledStatus.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : WithdrawalOnchainInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawHis[] newArray(int i) {
            return new WithdrawHis[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawHis() {
        this(null, null, null, null, 0L, 0, null, 0, null, null, null, 0, null, null, false, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.detailUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.subCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.addressTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.isInvoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.feeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component18() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.targetUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component20() {
        return this.internalAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.statusRemark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Notice> component22() {
        return this.notices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CancelledStatus component23() {
        return this.cancelledStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.networkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component29() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.isSymbolUntradable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.targetTypeStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.targetUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.totalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawalOnchainInfo component38() {
        return this.withdrawalOnchainInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component40() {
        return this.addrStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.lstCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.convertRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.lstCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component44() {
        return this.convertTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.lstCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.statusStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.txid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawHis copy(Long l, String str, String str2, String str3, long j, int i, String str4, int i2, String str5, String str6, String str7, int i3, String str8, String str9, boolean z, int i4, String str10, int i5, String str11, Integer num, String str12, List<Notice> list, CancelledStatus cancelledStatus, String str13, String str14, String str15, String str16, String str17, Integer num2, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, WithdrawalOnchainInfo withdrawalOnchainInfo, String str26, Integer num3, String str27, String str28, String str29, Long l2, String str30) {
        return new WithdrawHis(l, str, str2, str3, j, i, str4, i2, str5, str6, str7, i3, str8, str9, z, i4, str10, i5, str11, num, str12, list, cancelledStatus, str13, str14, str15, str16, str17, num2, str18, str19, str20, str21, str22, str23, str24, str25, withdrawalOnchainInfo, str26, num3, str27, str28, str29, l2, str30);
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
        if (!(obj instanceof WithdrawHis)) {
            return false;
        }
        WithdrawHis withdrawHis = (WithdrawHis) obj;
        return Intrinsics.EZpvd(this.id, withdrawHis.id) && Intrinsics.EZpvd((Object) this.address, (Object) withdrawHis.address) && Intrinsics.EZpvd((Object) this.amount, (Object) withdrawHis.amount) && Intrinsics.EZpvd((Object) this.fee, (Object) withdrawHis.fee) && this.createDate == withdrawHis.createDate && this.status == withdrawHis.status && Intrinsics.EZpvd((Object) this.statusStr, (Object) withdrawHis.statusStr) && this.targetType == withdrawHis.targetType && Intrinsics.EZpvd((Object) this.txid, (Object) withdrawHis.txid) && Intrinsics.EZpvd((Object) this.detailUrl, (Object) withdrawHis.detailUrl) && Intrinsics.EZpvd((Object) this.currency, (Object) withdrawHis.currency) && this.currencyId == withdrawHis.currencyId && Intrinsics.EZpvd((Object) this.subCurrency, (Object) withdrawHis.subCurrency) && Intrinsics.EZpvd((Object) this.addressTitle, (Object) withdrawHis.addressTitle) && this.isInvoice == withdrawHis.isInvoice && this.type == withdrawHis.type && Intrinsics.EZpvd((Object) this.feeCurrency, (Object) withdrawHis.feeCurrency) && this.areaCode == withdrawHis.areaCode && Intrinsics.EZpvd((Object) this.targetUid, (Object) withdrawHis.targetUid) && Intrinsics.EZpvd(this.internalAddressType, withdrawHis.internalAddressType) && Intrinsics.EZpvd((Object) this.statusRemark, (Object) withdrawHis.statusRemark) && Intrinsics.EZpvd(this.notices, withdrawHis.notices) && Intrinsics.EZpvd(this.cancelledStatus, withdrawHis.cancelledStatus) && Intrinsics.EZpvd((Object) this.networkName, (Object) withdrawHis.networkName) && Intrinsics.EZpvd((Object) this.networkIcon, (Object) withdrawHis.networkIcon) && Intrinsics.EZpvd((Object) this.icon, (Object) withdrawHis.icon) && Intrinsics.EZpvd((Object) this.value, (Object) withdrawHis.value) && Intrinsics.EZpvd((Object) this.price, (Object) withdrawHis.price) && Intrinsics.EZpvd(this.addressType, withdrawHis.addressType) && Intrinsics.EZpvd((Object) this.desc, (Object) withdrawHis.desc) && Intrinsics.EZpvd((Object) this.domain, (Object) withdrawHis.domain) && Intrinsics.EZpvd((Object) this.fullName, (Object) withdrawHis.fullName) && Intrinsics.EZpvd((Object) this.isSymbolUntradable, (Object) withdrawHis.isSymbolUntradable) && Intrinsics.EZpvd((Object) this.subCurrencyId, (Object) withdrawHis.subCurrencyId) && Intrinsics.EZpvd((Object) this.targetTypeStr, (Object) withdrawHis.targetTypeStr) && Intrinsics.EZpvd((Object) this.targetUserId, (Object) withdrawHis.targetUserId) && Intrinsics.EZpvd((Object) this.totalAmount, (Object) withdrawHis.totalAmount) && Intrinsics.EZpvd(this.withdrawalOnchainInfo, withdrawHis.withdrawalOnchainInfo) && Intrinsics.EZpvd((Object) this.tokenPrice, (Object) withdrawHis.tokenPrice) && Intrinsics.EZpvd(this.addrStatus, withdrawHis.addrStatus) && Intrinsics.EZpvd((Object) this.lstCurrencyName, (Object) withdrawHis.lstCurrencyName) && Intrinsics.EZpvd((Object) this.convertRate, (Object) withdrawHis.convertRate) && Intrinsics.EZpvd((Object) this.lstCurrencyAmount, (Object) withdrawHis.lstCurrencyAmount) && Intrinsics.EZpvd(this.convertTime, withdrawHis.convertTime) && Intrinsics.EZpvd((Object) this.lstCurrencyIcon, (Object) withdrawHis.lstCurrencyIcon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAddrStatus() {
        return this.addrStatus;
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
    public final Integer getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CancelledStatus getCancelledStatus() {
        return this.cancelledStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertRate() {
        return this.convertRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getConvertTime() {
        return this.convertTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateDate() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetailUrl() {
        return this.detailUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInternalAddressType() {
        return this.internalAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLstCurrencyAmount() {
        return this.lstCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLstCurrencyIcon() {
        return this.lstCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLstCurrencyName() {
        return this.lstCurrencyName;
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
    public final List<Notice> getNotices() {
        return this.notices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatusRemark() {
        return this.statusRemark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatusStr() {
        return this.statusStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubCurrency() {
        return this.subCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubCurrencyId() {
        return this.subCurrencyId;
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
    public final String getTargetUid() {
        return this.targetUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetUserId() {
        return this.targetUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenPrice() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxid() {
        return this.txid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawalOnchainInfo getWithdrawalOnchainInfo() {
        return this.withdrawalOnchainInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.id;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.address;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fee;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        int iHashCode5 = Long.hashCode(this.createDate);
        int iHashCode6 = Integer.hashCode(this.status);
        String str4 = this.statusStr;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        int iHashCode8 = Integer.hashCode(this.targetType);
        String str5 = this.txid;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.detailUrl;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.currency;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        int iHashCode12 = Integer.hashCode(this.currencyId);
        String str8 = this.subCurrency;
        int iHashCode13 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.addressTitle;
        int iHashCode14 = str9 == null ? 0 : str9.hashCode();
        int iHashCode15 = Boolean.hashCode(this.isInvoice);
        int iHashCode16 = Integer.hashCode(this.type);
        String str10 = this.feeCurrency;
        int iHashCode17 = str10 == null ? 0 : str10.hashCode();
        int iHashCode18 = Integer.hashCode(this.areaCode);
        String str11 = this.targetUid;
        int iHashCode19 = str11 == null ? 0 : str11.hashCode();
        Integer num = this.internalAddressType;
        int iHashCode20 = num == null ? 0 : num.hashCode();
        String str12 = this.statusRemark;
        int iHashCode21 = str12 == null ? 0 : str12.hashCode();
        List<Notice> list = this.notices;
        int iHashCode22 = list == null ? 0 : list.hashCode();
        CancelledStatus cancelledStatus = this.cancelledStatus;
        int iHashCode23 = cancelledStatus == null ? 0 : cancelledStatus.hashCode();
        String str13 = this.networkName;
        int iHashCode24 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.networkIcon;
        int iHashCode25 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.icon;
        int iHashCode26 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.value;
        int iHashCode27 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.price;
        int iHashCode28 = str17 == null ? 0 : str17.hashCode();
        Integer num2 = this.addressType;
        int iHashCode29 = num2 == null ? 0 : num2.hashCode();
        String str18 = this.desc;
        int iHashCode30 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.domain;
        int iHashCode31 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.fullName;
        int iHashCode32 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.isSymbolUntradable;
        int iHashCode33 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.subCurrencyId;
        int iHashCode34 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.targetTypeStr;
        int iHashCode35 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.targetUserId;
        int iHashCode36 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.totalAmount;
        int iHashCode37 = str25 == null ? 0 : str25.hashCode();
        WithdrawalOnchainInfo withdrawalOnchainInfo = this.withdrawalOnchainInfo;
        int iHashCode38 = withdrawalOnchainInfo == null ? 0 : withdrawalOnchainInfo.hashCode();
        String str26 = this.tokenPrice;
        int iHashCode39 = str26 == null ? 0 : str26.hashCode();
        Integer num3 = this.addrStatus;
        int iHashCode40 = num3 == null ? 0 : num3.hashCode();
        String str27 = this.lstCurrencyName;
        int iHashCode41 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.convertRate;
        int iHashCode42 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.lstCurrencyAmount;
        int iHashCode43 = str29 == null ? 0 : str29.hashCode();
        Long l2 = this.convertTime;
        int iHashCode44 = l2 == null ? 0 : l2.hashCode();
        String str30 = this.lstCurrencyIcon;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + (str30 == null ? 0 : str30.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isInvoice() {
        return this.isInvoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOnChainWithdraw() {
        return this.targetType == -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSymbolUntradable() {
        return this.isSymbolUntradable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUntradableAsset() {
        return this.type == 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressTitle(String str) {
        this.addressTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAreaCode(int i) {
        this.areaCode = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateDate(long j) {
        this.createDate = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(String str) {
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDetailUrl(String str) {
        this.detailUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(String str) {
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeCurrency(String str) {
        this.feeCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInternalAddressType(Integer num) {
        this.internalAddressType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvoice(boolean z) {
        this.isInvoice = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatusRemark(String str) {
        this.statusRemark = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatusStr(String str) {
        this.statusStr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrency(String str) {
        this.subCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetType(int i) {
        this.targetType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetUid(String str) {
        this.targetUid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxid(String str) {
        this.txid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawHis(id=" + this.id + ", address=" + this.address + ", amount=" + this.amount + ", fee=" + this.fee + ", createDate=" + this.createDate + ", status=" + this.status + ", statusStr=" + this.statusStr + ", targetType=" + this.targetType + ", txid=" + this.txid + ", detailUrl=" + this.detailUrl + ", currency=" + this.currency + ", currencyId=" + this.currencyId + ", subCurrency=" + this.subCurrency + ", addressTitle=" + this.addressTitle + ", isInvoice=" + this.isInvoice + ", type=" + this.type + ", feeCurrency=" + this.feeCurrency + ", areaCode=" + this.areaCode + ", targetUid=" + this.targetUid + ", internalAddressType=" + this.internalAddressType + ", statusRemark=" + this.statusRemark + ", notices=" + this.notices + ", cancelledStatus=" + this.cancelledStatus + ", networkName=" + this.networkName + ", networkIcon=" + this.networkIcon + ", icon=" + this.icon + ", value=" + this.value + ", price=" + this.price + ", addressType=" + this.addressType + ", desc=" + this.desc + ", domain=" + this.domain + ", fullName=" + this.fullName + ", isSymbolUntradable=" + this.isSymbolUntradable + ", subCurrencyId=" + this.subCurrencyId + ", targetTypeStr=" + this.targetTypeStr + ", targetUserId=" + this.targetUserId + ", totalAmount=" + this.totalAmount + ", withdrawalOnchainInfo=" + this.withdrawalOnchainInfo + ", tokenPrice=" + this.tokenPrice + ", addrStatus=" + this.addrStatus + ", lstCurrencyName=" + this.lstCurrencyName + ", convertRate=" + this.convertRate + ", lstCurrencyAmount=" + this.lstCurrencyAmount + ", convertTime=" + this.convertTime + ", lstCurrencyIcon=" + this.lstCurrencyIcon + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.id;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.address);
        parcel.writeString(this.amount);
        parcel.writeString(this.fee);
        parcel.writeLong(this.createDate);
        parcel.writeInt(this.status);
        parcel.writeString(this.statusStr);
        parcel.writeInt(this.targetType);
        parcel.writeString(this.txid);
        parcel.writeString(this.detailUrl);
        parcel.writeString(this.currency);
        parcel.writeInt(this.currencyId);
        parcel.writeString(this.subCurrency);
        parcel.writeString(this.addressTitle);
        parcel.writeInt(this.isInvoice ? 1 : 0);
        parcel.writeInt(this.type);
        parcel.writeString(this.feeCurrency);
        parcel.writeInt(this.areaCode);
        parcel.writeString(this.targetUid);
        Integer num = this.internalAddressType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.statusRemark);
        List<Notice> list = this.notices;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Notice> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        CancelledStatus cancelledStatus = this.cancelledStatus;
        if (cancelledStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cancelledStatus.writeToParcel(parcel, i);
        }
        parcel.writeString(this.networkName);
        parcel.writeString(this.networkIcon);
        parcel.writeString(this.icon);
        parcel.writeString(this.value);
        parcel.writeString(this.price);
        Integer num2 = this.addressType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.desc);
        parcel.writeString(this.domain);
        parcel.writeString(this.fullName);
        parcel.writeString(this.isSymbolUntradable);
        parcel.writeString(this.subCurrencyId);
        parcel.writeString(this.targetTypeStr);
        parcel.writeString(this.targetUserId);
        parcel.writeString(this.totalAmount);
        WithdrawalOnchainInfo withdrawalOnchainInfo = this.withdrawalOnchainInfo;
        if (withdrawalOnchainInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            withdrawalOnchainInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tokenPrice);
        Integer num3 = this.addrStatus;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.lstCurrencyName);
        parcel.writeString(this.convertRate);
        parcel.writeString(this.lstCurrencyAmount);
        Long l2 = this.convertTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.lstCurrencyIcon);
    }

    public WithdrawHis(Long l, String str, String str2, String str3, long j, int i, String str4, int i2, String str5, String str6, String str7, int i3, String str8, String str9, boolean z, int i4, String str10, int i5, String str11, Integer num, String str12, List<Notice> list, CancelledStatus cancelledStatus, String str13, String str14, String str15, String str16, String str17, Integer num2, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, WithdrawalOnchainInfo withdrawalOnchainInfo, String str26, Integer num3, String str27, String str28, String str29, Long l2, String str30) {
        this.id = l;
        this.address = str;
        this.amount = str2;
        this.fee = str3;
        this.createDate = j;
        this.status = i;
        this.statusStr = str4;
        this.targetType = i2;
        this.txid = str5;
        this.detailUrl = str6;
        this.currency = str7;
        this.currencyId = i3;
        this.subCurrency = str8;
        this.addressTitle = str9;
        this.isInvoice = z;
        this.type = i4;
        this.feeCurrency = str10;
        this.areaCode = i5;
        this.targetUid = str11;
        this.internalAddressType = num;
        this.statusRemark = str12;
        this.notices = list;
        this.cancelledStatus = cancelledStatus;
        this.networkName = str13;
        this.networkIcon = str14;
        this.icon = str15;
        this.value = str16;
        this.price = str17;
        this.addressType = num2;
        this.desc = str18;
        this.domain = str19;
        this.fullName = str20;
        this.isSymbolUntradable = str21;
        this.subCurrencyId = str22;
        this.targetTypeStr = str23;
        this.targetUserId = str24;
        this.totalAmount = str25;
        this.withdrawalOnchainInfo = withdrawalOnchainInfo;
        this.tokenPrice = str26;
        this.addrStatus = num3;
        this.lstCurrencyName = str27;
        this.convertRate = str28;
        this.lstCurrencyAmount = str29;
        this.convertTime = l2;
        this.lstCurrencyIcon = str30;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x021a: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0004: ARITH (r94v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r48v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r94v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r94v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r94v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r94v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r52v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002d: ARITH (r94v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r54v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r94v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003d: ARITH (r94v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r56v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r94v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r94v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r94v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0060: ARITH (r94v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r60v0 int))
  (wrap:java.lang.String:0x0071: TERNARY null = ((wrap:int:0x0068: ARITH (r94v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:0x007b: TERNARY null = ((wrap:int:0x0073: ARITH (r94v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007d: ARITH (r94v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r63v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0088: ARITH (r94v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r64v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r94v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x009e: ARITH (r94v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r66v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r94v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r94v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r68v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r94v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r94v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ce: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:43)) : (r70v0 java.util.List))
  (wrap:com.okinc.assets.backend.api.model.WithdrawHis$CancelledStatus:?: TERNARY null = ((wrap:int:0x00d7: ARITH (r94v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.WithdrawHis$CancelledStatus) : (r71v0 com.okinc.assets.backend.api.model.WithdrawHis$CancelledStatus))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e2: ARITH (r94v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ed: ARITH (r94v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f8: ARITH (r94v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0103: ARITH (r94v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010e: ARITH (r94v0 int) & (134217728 int) A[WRAPPED]) == (0 int)) ? (r76v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0117: ARITH (r94v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r77v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0122: ARITH (r94v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012d: ARITH (r94v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0138: ARITH (r94v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0140: ARITH (r95v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0149: ARITH (r95v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0152: ARITH (r95v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015b: ARITH (r95v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0164: ARITH (r95v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r85v0 java.lang.String))
  (wrap:com.okinc.assets.backend.api.model.WithdrawHis$WithdrawalOnchainInfo:?: TERNARY null = ((wrap:int:0x016d: ARITH (r95v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.WithdrawHis$WithdrawalOnchainInfo) : (r86v0 com.okinc.assets.backend.api.model.WithdrawHis$WithdrawalOnchainInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0176: ARITH (r95v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r87v0 java.lang.String))
  (wrap:java.lang.Integer:0x0189: TERNARY null = ((wrap:int:0x0181: ARITH (r95v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r88v0 java.lang.Integer))
  (wrap:java.lang.String:0x0193: TERNARY null = ((wrap:int:0x018b: ARITH (r95v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r89v0 java.lang.String))
  (wrap:java.lang.String:0x019d: TERNARY null = ((wrap:int:0x0195: ARITH (r95v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r90v0 java.lang.String))
  (wrap:java.lang.String:0x01a7: TERNARY null = ((wrap:int:0x019f: ARITH (r95v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r91v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x01a9: ARITH (r95v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r92v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01b6: ARITH (r95v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r93v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, long, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, boolean, int, java.lang.String, int, java.lang.String, java.lang.Integer, java.lang.String, java.util.List<com.okinc.assets.backend.api.model.WithdrawHis$Notice>, com.okinc.assets.backend.api.model.WithdrawHis$CancelledStatus, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.assets.backend.api.model.WithdrawHis$WithdrawalOnchainInfo, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String):void (m)] (LINE:21) call: com.okinc.assets.backend.api.model.WithdrawHis.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, long, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, boolean, int, java.lang.String, int, java.lang.String, java.lang.Integer, java.lang.String, java.util.List, com.okinc.assets.backend.api.model.WithdrawHis$CancelledStatus, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.assets.backend.api.model.WithdrawHis$WithdrawalOnchainInfo, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ WithdrawHis(Long l, String str, String str2, String str3, long j, int i, String str4, int i2, String str5, String str6, String str7, int i3, String str8, String str9, boolean z, int i4, String str10, int i5, String str11, Integer num, String str12, List list, CancelledStatus cancelledStatus, String str13, String str14, String str15, String str16, String str17, Integer num2, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, WithdrawalOnchainInfo withdrawalOnchainInfo, String str26, Integer num3, String str27, String str28, String str29, Long l2, String str30, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? null : l, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? null : str2, (i6 & 8) != 0 ? null : str3, (i6 & 16) != 0 ? 0L : j, (i6 & 32) != 0 ? 0 : i, (i6 & 64) != 0 ? null : str4, (i6 & 128) != 0 ? 0 : i2, (i6 & 256) != 0 ? null : str5, (i6 & 512) != 0 ? null : str6, (i6 & 1024) != 0 ? "" : str7, (i6 & 2048) != 0 ? 0 : i3, (i6 & 4096) != 0 ? "" : str8, (i6 & 8192) != 0 ? null : str9, (i6 & 16384) != 0 ? false : z, (i6 & 32768) != 0 ? 0 : i4, (i6 & 65536) != 0 ? "" : str10, (i6 & 131072) != 0 ? 0 : i5, (i6 & 262144) != 0 ? "" : str11, (i6 & 524288) != 0 ? null : num, (i6 & 1048576) != 0 ? "" : str12, (i6 & 2097152) != 0 ? yDY.AhwBna() : list, (i6 & 4194304) != 0 ? null : cancelledStatus, (i6 & 8388608) != 0 ? null : str13, (i6 & 16777216) != 0 ? "" : str14, (i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str15, (i6 & 67108864) != 0 ? "" : str16, (i6 & 134217728) == 0 ? str17 : "", (i6 & 268435456) != 0 ? null : num2, (i6 & 536870912) != 0 ? null : str18, (i6 & 1073741824) != 0 ? null : str19, (i6 & Integer.MIN_VALUE) != 0 ? null : str20, (i7 & 1) != 0 ? null : str21, (i7 & 2) != 0 ? null : str22, (i7 & 4) != 0 ? null : str23, (i7 & 8) != 0 ? null : str24, (i7 & 16) != 0 ? null : str25, (i7 & 32) != 0 ? null : withdrawalOnchainInfo, (i7 & 64) != 0 ? null : str26, (i7 & 128) != 0 ? null : num3, (i7 & 256) != 0 ? null : str27, (i7 & 512) != 0 ? null : str28, (i7 & 1024) != 0 ? null : str29, (i7 & 2048) != 0 ? 0L : l2, (i7 & 4096) != 0 ? null : str30);
    }

    public static final class Notice implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Notice> CREATOR = new Creator();
        private final String body;
        private final String buttonText;
        private final String header;
        private final Integer type;

        public static final class Creator implements Parcelable.Creator<Notice> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Notice createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Notice(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Notice[] newArray(int i) {
                return new Notice[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Notice() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Notice copy$default(Notice notice, String str, String str2, String str3, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notice.header;
            }
            if ((i & 2) != 0) {
                str2 = notice.body;
            }
            if ((i & 4) != 0) {
                str3 = notice.buttonText;
            }
            if ((i & 8) != 0) {
                num = notice.type;
            }
            return notice.copy(str, str2, str3, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.header;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.body;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.buttonText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component4() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Notice copy(@NotNull String str, @NotNull String str2, @NotNull String str3, Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new Notice(str, str2, str3, num);
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
            if (!(obj instanceof Notice)) {
                return false;
            }
            Notice notice = (Notice) obj;
            return Intrinsics.EZpvd((Object) this.header, (Object) notice.header) && Intrinsics.EZpvd((Object) this.body, (Object) notice.body) && Intrinsics.EZpvd((Object) this.buttonText, (Object) notice.buttonText) && Intrinsics.EZpvd(this.type, notice.type);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBody() {
            return this.body;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getButtonText() {
            return this.buttonText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getHeader() {
            return this.header;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.header.hashCode();
            int iHashCode2 = this.body.hashCode();
            int iHashCode3 = this.buttonText.hashCode();
            Integer num = this.type;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num == null ? 0 : num.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Notice(header=" + this.header + ", body=" + this.body + ", buttonText=" + this.buttonText + ", type=" + this.type + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.header);
            parcel.writeString(this.body);
            parcel.writeString(this.buttonText);
            Integer num = this.type;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
        }

        public Notice(@NotNull String str, @NotNull String str2, @NotNull String str3, Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.header = str;
            this.body = str2;
            this.buttonText = str3;
            this.type = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:80) call: com.okinc.assets.backend.api.model.WithdrawHis.Notice.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
        public /* synthetic */ Notice(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : num);
        }

        public final Type getTypeEnum() {
            return Type.Companion.EZpvd(this.type);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: loaded from: classes14.dex */
        public static final class Type {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final ActionBar Companion;
            public static final Type Unknown = new Type("Unknown", 0);
            public static final Type SegregatedWallet = new Type("SegregatedWallet", 1);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ Type[] $values() {
                return new Type[]{Unknown, SegregatedWallet};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<Type> getEntries() {
                return $ENTRIES;
            }

            private Type(String str, int i) {
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(typeArr$values);
                Companion = new ActionBar(null);
            }

            public static final class ActionBar {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.WithdrawHis.Notice.Type.ActionBar.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private ActionBar() {
                }

                public final Type EZpvd(Integer num) {
                    return (num != null && num.intValue() == 1) ? Type.SegregatedWallet : Type.Unknown;
                }
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }
    }

    public static final class WithdrawalOnchainInfo implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<WithdrawalOnchainInfo> CREATOR = new Creator();
        private final String errorMessage;
        private final int statusCode;
        private final String statusString;

        public static final class Creator implements Parcelable.Creator<WithdrawalOnchainInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithdrawalOnchainInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new WithdrawalOnchainInfo(parcel.readString(), parcel.readInt(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithdrawalOnchainInfo[] newArray(int i) {
                return new WithdrawalOnchainInfo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public WithdrawalOnchainInfo() {
            this(null, 0, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ WithdrawalOnchainInfo copy$default(WithdrawalOnchainInfo withdrawalOnchainInfo, String str, int i, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = withdrawalOnchainInfo.errorMessage;
            }
            if ((i2 & 2) != 0) {
                i = withdrawalOnchainInfo.statusCode;
            }
            if ((i2 & 4) != 0) {
                str2 = withdrawalOnchainInfo.statusString;
            }
            return withdrawalOnchainInfo.copy(str, i, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.errorMessage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component2() {
            return this.statusCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.statusString;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WithdrawalOnchainInfo copy(String str, int i, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new WithdrawalOnchainInfo(str, i, str2);
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
            if (!(obj instanceof WithdrawalOnchainInfo)) {
                return false;
            }
            WithdrawalOnchainInfo withdrawalOnchainInfo = (WithdrawalOnchainInfo) obj;
            return Intrinsics.EZpvd((Object) this.errorMessage, (Object) withdrawalOnchainInfo.errorMessage) && this.statusCode == withdrawalOnchainInfo.statusCode && Intrinsics.EZpvd((Object) this.statusString, (Object) withdrawalOnchainInfo.statusString);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getStatusCode() {
            return this.statusCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStatusString() {
            return this.statusString;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.errorMessage;
            return ((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.statusCode)) * 31) + this.statusString.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WithdrawalOnchainInfo(errorMessage=" + this.errorMessage + ", statusCode=" + this.statusCode + ", statusString=" + this.statusString + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.errorMessage);
            parcel.writeInt(this.statusCode);
            parcel.writeString(this.statusString);
        }

        public WithdrawalOnchainInfo(String str, int i, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            this.errorMessage = str;
            this.statusCode = i;
            this.statusString = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String):void (m)] (LINE:104) call: com.okinc.assets.backend.api.model.WithdrawHis.WithdrawalOnchainInfo.<init>(java.lang.String, int, java.lang.String):void type: THIS */
        public /* synthetic */ WithdrawalOnchainInfo(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
        }
    }

    public static final class CancelledStatus implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<CancelledStatus> CREATOR = new Creator();
        private final String detail;
        private final Integer level;

        public static final class Creator implements Parcelable.Creator<CancelledStatus> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CancelledStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new CancelledStatus(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CancelledStatus[] newArray(int i) {
                return new CancelledStatus[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public CancelledStatus() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CancelledStatus copy$default(CancelledStatus cancelledStatus, Integer num, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                num = cancelledStatus.level;
            }
            if ((i & 2) != 0) {
                str = cancelledStatus.detail;
            }
            return cancelledStatus.copy(num, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component1() {
            return this.level;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.detail;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CancelledStatus copy(Integer num, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new CancelledStatus(num, str);
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
            if (!(obj instanceof CancelledStatus)) {
                return false;
            }
            CancelledStatus cancelledStatus = (CancelledStatus) obj;
            return Intrinsics.EZpvd(this.level, cancelledStatus.level) && Intrinsics.EZpvd((Object) this.detail, (Object) cancelledStatus.detail);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDetail() {
            return this.detail;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getLevel() {
            return this.level;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.level;
            return ((num == null ? 0 : num.hashCode()) * 31) + this.detail.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CancelledStatus(level=" + this.level + ", detail=" + this.detail + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer num = this.level;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.detail);
        }

        public CancelledStatus(Integer num, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.level = num;
            this.detail = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r1v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String):void (m)] (LINE:112) call: com.okinc.assets.backend.api.model.WithdrawHis.CancelledStatus.<init>(java.lang.Integer, java.lang.String):void type: THIS */
        public /* synthetic */ CancelledStatus(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? "" : str);
        }

        public final Level getLevelEnum() {
            return Level.Companion.OLrzqt(this.level);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: loaded from: classes14.dex */
        public static final class Level {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ Level[] $VALUES;
            public static final ActionBar Companion;
            public static final Level Fail = new Level("Fail", 0);
            public static final Level Success = new Level("Success", 1);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ Level[] $values() {
                return new Level[]{Fail, Success};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<Level> getEntries() {
                return $ENTRIES;
            }

            private Level(String str, int i) {
            }

            static {
                Level[] levelArr$values = $values();
                $VALUES = levelArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(levelArr$values);
                Companion = new ActionBar(null);
            }

            public static final class ActionBar {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.WithdrawHis.CancelledStatus.Level.ActionBar.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private ActionBar() {
                }

                public final Level OLrzqt(Integer num) {
                    return (num != null && num.intValue() == 1) ? Level.Success : Level.Fail;
                }
            }

            public static Level valueOf(String str) {
                return (Level) Enum.valueOf(Level.class, str);
            }

            public static Level[] values() {
                return (Level[]) $VALUES.clone();
            }
        }
    }

    public final String convertDate() {
        return pTA.formatSimpleDateTime$default(new Date(this.createDate), null, 1, null);
    }

    public final String convertDateV2() {
        Date date = new Date(this.createDate);
        OKDateEnum oKDateEnum = OKDateEnum.DATE_FORMAT_STANDARD;
        OKTimeEnum oKTimeEnum = OKTimeEnum.TIME_FORMAT_STANDARD_HM;
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        return pTA.format$default(date, oKDateEnum, oKTimeEnum, locale, null, false, 24, null);
    }

    public final String convertDate2() {
        return pTA.format$default(new Date(this.createDate), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
    }

    public final Status getStatusEnum() {
        return Status.Companion.copydefault(this.status);
    }

    public final AddressType getAddressTypeEnum() {
        AddressType.Application application = AddressType.Companion;
        Integer num = this.addressType;
        return application.copydefault(num != null ? num.intValue() : 0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class AddressType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AddressType[] $VALUES;
        public static final Application Companion;
        public static final AddressType PHONE = new AddressType("PHONE", 0);
        public static final AddressType EMAIL = new AddressType("EMAIL", 1);
        public static final AddressType SUB_ACCOUNT = new AddressType("SUB_ACCOUNT", 2);
        public static final AddressType UID = new AddressType("UID", 3);
        public static final AddressType CUID = new AddressType("CUID", 4);
        public static final AddressType USER_ID = new AddressType("USER_ID", 5);
        public static final AddressType UNKNOWN = new AddressType("UNKNOWN", 6);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AddressType[] $values() {
            return new AddressType[]{PHONE, EMAIL, SUB_ACCOUNT, UID, CUID, USER_ID, UNKNOWN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AddressType> getEntries() {
            return $ENTRIES;
        }

        private AddressType(String str, int i) {
        }

        static {
            AddressType[] addressTypeArr$values = $values();
            $VALUES = addressTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(addressTypeArr$values);
            Companion = new Application(null);
        }

        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.WithdrawHis.AddressType.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }

            public final AddressType copydefault(int i) {
                switch (i) {
                    case 1:
                        return AddressType.PHONE;
                    case 2:
                        return AddressType.EMAIL;
                    case 3:
                        return AddressType.SUB_ACCOUNT;
                    case 4:
                        return AddressType.UID;
                    case 5:
                        return AddressType.CUID;
                    case 6:
                        return AddressType.USER_ID;
                    default:
                        return AddressType.UNKNOWN;
                }
            }
        }

        public static AddressType valueOf(String str) {
            return (AddressType) Enum.valueOf(AddressType.class, str);
        }

        public static AddressType[] values() {
            return (AddressType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Status {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final TaskDescription Companion;
        public static final Status REVOKING = new Status("REVOKING", 0);
        public static final Status REVOKED = new Status("REVOKED", 1);
        public static final Status FAILURE = new Status("FAILURE", 2);
        public static final Status PENDING_WITHDRAWAL = new Status("PENDING_WITHDRAWAL", 3);
        public static final Status WITHDRAWING = new Status("WITHDRAWING", 4);
        public static final Status SUCCESS = new Status("SUCCESS", 5);
        public static final Status PENDING_TRANSFER = new Status("PENDING_TRANSFER", 6);
        public static final Status PENDING_CS_REVIEW_CANCELABLE = new Status("PENDING_CS_REVIEW_CANCELABLE", 7);
        public static final Status PENDING_CS_REVIEW = new Status("PENDING_CS_REVIEW", 8);
        public static final Status CS_REVIEWED = new Status("CS_REVIEWED", 9);
        public static final Status PENDING_TRANSACTION_VALIDATION = new Status("PENDING_TRANSACTION_VALIDATION", 10);
        public static final Status ENTITY_SEGREGATED_WALLET = new Status("ENTITY_SEGREGATED_WALLET", 11);
        public static final Status ON_HOLD = new Status("ON_HOLD", 12);
        public static final Status PENDING_WITHDRAWAL_ON_THE_WAY = new Status("PENDING_WITHDRAWAL_ON_THE_WAY", 13);
        public static final Status PENDING_APPROVAL = new Status("PENDING_APPROVAL", 14);
        public static final Status UNKNOWN = new Status("UNKNOWN", 15);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Status[] $values() {
            return new Status[]{REVOKING, REVOKED, FAILURE, PENDING_WITHDRAWAL, WITHDRAWING, SUCCESS, PENDING_TRANSFER, PENDING_CS_REVIEW_CANCELABLE, PENDING_CS_REVIEW, CS_REVIEWED, PENDING_TRANSACTION_VALIDATION, ENTITY_SEGREGATED_WALLET, ON_HOLD, PENDING_WITHDRAWAL_ON_THE_WAY, PENDING_APPROVAL, UNKNOWN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Status> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isCancellable() {
            return this == PENDING_WITHDRAWAL || this == ON_HOLD || this == PENDING_CS_REVIEW_CANCELABLE || this == PENDING_WITHDRAWAL_ON_THE_WAY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isCancellableV2() {
            return this == PENDING_WITHDRAWAL || this == ON_HOLD || this == PENDING_WITHDRAWAL_ON_THE_WAY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isNotFinalStatus() {
            return (this == REVOKED || this == FAILURE || this == SUCCESS) ? false : true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isWithdrawalOnTheWay() {
            return this == PENDING_WITHDRAWAL_ON_THE_WAY;
        }

        private Status(String str, int i) {
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(statusArr$values);
            Companion = new TaskDescription(null);
        }

        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.WithdrawHis.Status.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public final Status copydefault(int i) {
                switch (i) {
                    case -3:
                        return Status.REVOKING;
                    case -2:
                        return Status.REVOKED;
                    case -1:
                        return Status.FAILURE;
                    case 0:
                        return Status.PENDING_WITHDRAWAL;
                    case 1:
                        return Status.WITHDRAWING;
                    case 2:
                        return Status.SUCCESS;
                    case 3:
                    case 11:
                    case 13:
                    case 14:
                    default:
                        return Status.UNKNOWN;
                    case 4:
                    case 6:
                        return Status.PENDING_CS_REVIEW_CANCELABLE;
                    case 5:
                    case 8:
                    case 9:
                    case 12:
                        return Status.PENDING_CS_REVIEW;
                    case 7:
                        return Status.CS_REVIEWED;
                    case 10:
                        return Status.PENDING_TRANSFER;
                    case 15:
                        return Status.PENDING_TRANSACTION_VALIDATION;
                    case 16:
                        return Status.ENTITY_SEGREGATED_WALLET;
                    case 17:
                        return Status.ON_HOLD;
                    case 18:
                        return Status.PENDING_APPROVAL;
                    case 19:
                        return Status.PENDING_WITHDRAWAL_ON_THE_WAY;
                }
            }
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }
}
