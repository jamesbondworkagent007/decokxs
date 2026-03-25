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
import o.pTA;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class HistoryItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<HistoryItem> CREATOR = new Creator();
    private String address;
    private Integer addressType;
    private String amount;
    private final int arrivalType;
    private int confirmNum;
    private final String convertRate;
    private final Long convertTime;
    private String currency;
    private int currencyId;
    private int depositConfirmations;
    private long depositId;
    private final Long depositInitiateTime;
    private String detailUrl;
    private final String dexOrderType;
    private final String earnMaxAprStr;
    private final Integer estimatedDepositCreditedTime;
    private final Integer estimatedWithdrawUnlockTime;
    private String fullName;
    private final Boolean hasSubTransactions;
    private String icon;
    private boolean isInnerTransfer;
    private boolean isInvoice;
    private long lastUpdate;
    private final String lstCurrencyName;
    private final String networkIcon;
    private final String networkName;
    private final List<Notice> notices;
    private final String originAmount;
    private final String price;
    private String senderUid;
    private String status;
    private int statusNum;
    private String subCurrency;
    private String targetTypeStr;
    private Long travelRuleId;
    private final Integer travelRuleStatus;
    private String txid;
    private int type;
    private final String value;
    private int withdrawConfirmations;

    public static final class Creator implements Parcelable.Creator<HistoryItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryItem createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                z = z2;
                arrayList = null;
            } else {
                int i8 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i8);
                z = z2;
                int i9 = 0;
                while (i9 != i8) {
                    arrayList2.add(Notice.CREATOR.createFromParcel(parcel));
                    i9++;
                    i8 = i8;
                }
                arrayList = arrayList2;
            }
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new HistoryItem(string, numValueOf, string2, j, j2, string3, string4, i, string5, string6, z, string7, string8, z3, i2, i3, i4, i5, i6, i7, string9, string10, string11, lValueOf, numValueOf2, arrayList, numValueOf3, numValueOf4, lValueOf2, string12, string13, string14, string15, string16, string17, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryItem[] newArray(int i) {
            return new HistoryItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HistoryItem() {
        this(null, null, null, 0L, 0L, null, null, 0, null, null, false, null, null, false, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.targetTypeStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isInnerTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.detailUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.txid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.isInvoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.arrivalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.withdrawConfirmations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.confirmNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component18() {
        return this.depositConfirmations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component19() {
        return this.statusNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component20() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.senderUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component24() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component25() {
        return this.travelRuleStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Notice> component26() {
        return this.notices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component27() {
        return this.estimatedDepositCreditedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component28() {
        return this.estimatedWithdrawUnlockTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component29() {
        return this.depositInitiateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.networkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.earnMaxAprStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.dexOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component36() {
        return this.hasSubTransactions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.lstCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.convertRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.originAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.lastUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component40() {
        return this.convertTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.depositId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.subCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryItem copy(String str, Integer num, String str2, long j, long j2, String str3, String str4, int i, String str5, String str6, boolean z, String str7, String str8, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7, String str9, String str10, String str11, Long l, Integer num2, List<Notice> list, Integer num3, Integer num4, Long l2, String str12, String str13, String str14, String str15, String str16, String str17, Boolean bool, String str18, String str19, String str20, Long l3) {
        return new HistoryItem(str, num, str2, j, j2, str3, str4, i, str5, str6, z, str7, str8, z2, i2, i3, i4, i5, i6, i7, str9, str10, str11, l, num2, list, num3, num4, l2, str12, str13, str14, str15, str16, str17, bool, str18, str19, str20, l3);
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
        if (!(obj instanceof HistoryItem)) {
            return false;
        }
        HistoryItem historyItem = (HistoryItem) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) historyItem.address) && Intrinsics.EZpvd(this.addressType, historyItem.addressType) && Intrinsics.EZpvd((Object) this.amount, (Object) historyItem.amount) && this.lastUpdate == historyItem.lastUpdate && this.depositId == historyItem.depositId && Intrinsics.EZpvd((Object) this.status, (Object) historyItem.status) && Intrinsics.EZpvd((Object) this.currency, (Object) historyItem.currency) && this.currencyId == historyItem.currencyId && Intrinsics.EZpvd((Object) this.subCurrency, (Object) historyItem.subCurrency) && Intrinsics.EZpvd((Object) this.targetTypeStr, (Object) historyItem.targetTypeStr) && this.isInnerTransfer == historyItem.isInnerTransfer && Intrinsics.EZpvd((Object) this.detailUrl, (Object) historyItem.detailUrl) && Intrinsics.EZpvd((Object) this.txid, (Object) historyItem.txid) && this.isInvoice == historyItem.isInvoice && this.arrivalType == historyItem.arrivalType && this.withdrawConfirmations == historyItem.withdrawConfirmations && this.confirmNum == historyItem.confirmNum && this.depositConfirmations == historyItem.depositConfirmations && this.statusNum == historyItem.statusNum && this.type == historyItem.type && Intrinsics.EZpvd((Object) this.fullName, (Object) historyItem.fullName) && Intrinsics.EZpvd((Object) this.icon, (Object) historyItem.icon) && Intrinsics.EZpvd((Object) this.senderUid, (Object) historyItem.senderUid) && Intrinsics.EZpvd(this.travelRuleId, historyItem.travelRuleId) && Intrinsics.EZpvd(this.travelRuleStatus, historyItem.travelRuleStatus) && Intrinsics.EZpvd(this.notices, historyItem.notices) && Intrinsics.EZpvd(this.estimatedDepositCreditedTime, historyItem.estimatedDepositCreditedTime) && Intrinsics.EZpvd(this.estimatedWithdrawUnlockTime, historyItem.estimatedWithdrawUnlockTime) && Intrinsics.EZpvd(this.depositInitiateTime, historyItem.depositInitiateTime) && Intrinsics.EZpvd((Object) this.networkName, (Object) historyItem.networkName) && Intrinsics.EZpvd((Object) this.value, (Object) historyItem.value) && Intrinsics.EZpvd((Object) this.price, (Object) historyItem.price) && Intrinsics.EZpvd((Object) this.networkIcon, (Object) historyItem.networkIcon) && Intrinsics.EZpvd((Object) this.earnMaxAprStr, (Object) historyItem.earnMaxAprStr) && Intrinsics.EZpvd((Object) this.dexOrderType, (Object) historyItem.dexOrderType) && Intrinsics.EZpvd(this.hasSubTransactions, historyItem.hasSubTransactions) && Intrinsics.EZpvd((Object) this.lstCurrencyName, (Object) historyItem.lstCurrencyName) && Intrinsics.EZpvd((Object) this.convertRate, (Object) historyItem.convertRate) && Intrinsics.EZpvd((Object) this.originAmount, (Object) historyItem.originAmount) && Intrinsics.EZpvd(this.convertTime, historyItem.convertTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
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
    public final int getArrivalType() {
        return this.arrivalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getConfirmNum() {
        return this.confirmNum;
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
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDepositConfirmations() {
        return this.depositConfirmations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDepositId() {
        return this.depositId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getDepositInitiateTime() {
        return this.depositInitiateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetailUrl() {
        return this.detailUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexOrderType() {
        return this.dexOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnMaxAprStr() {
        return this.earnMaxAprStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEstimatedDepositCreditedTime() {
        return this.estimatedDepositCreditedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEstimatedWithdrawUnlockTime() {
        return this.estimatedWithdrawUnlockTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasSubTransactions() {
        return this.hasSubTransactions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getLastUpdate() {
        return this.lastUpdate;
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
    public final String getOriginAmount() {
        return this.originAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSenderUid() {
        return this.senderUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatusNum() {
        return this.statusNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubCurrency() {
        return this.subCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetTypeStr() {
        return this.targetTypeStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTravelRuleId() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTravelRuleStatus() {
        return this.travelRuleStatus;
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
    public final int getWithdrawConfirmations() {
        return this.withdrawConfirmations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.addressType;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.amount;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = Long.hashCode(this.lastUpdate);
        int iHashCode5 = Long.hashCode(this.depositId);
        String str3 = this.status;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.currency;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        int iHashCode8 = Integer.hashCode(this.currencyId);
        String str5 = this.subCurrency;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.targetTypeStr;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        int iHashCode11 = Boolean.hashCode(this.isInnerTransfer);
        String str7 = this.detailUrl;
        int iHashCode12 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.txid;
        int iHashCode13 = str8 == null ? 0 : str8.hashCode();
        int iHashCode14 = Boolean.hashCode(this.isInvoice);
        int iHashCode15 = Integer.hashCode(this.arrivalType);
        int iHashCode16 = Integer.hashCode(this.withdrawConfirmations);
        int iHashCode17 = Integer.hashCode(this.confirmNum);
        int iHashCode18 = Integer.hashCode(this.depositConfirmations);
        int iHashCode19 = Integer.hashCode(this.statusNum);
        int iHashCode20 = Integer.hashCode(this.type);
        String str9 = this.fullName;
        int iHashCode21 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.icon;
        int iHashCode22 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.senderUid;
        int iHashCode23 = str11 == null ? 0 : str11.hashCode();
        Long l = this.travelRuleId;
        int iHashCode24 = l == null ? 0 : l.hashCode();
        Integer num2 = this.travelRuleStatus;
        int iHashCode25 = num2 == null ? 0 : num2.hashCode();
        List<Notice> list = this.notices;
        int iHashCode26 = list == null ? 0 : list.hashCode();
        Integer num3 = this.estimatedDepositCreditedTime;
        int iHashCode27 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.estimatedWithdrawUnlockTime;
        int iHashCode28 = num4 == null ? 0 : num4.hashCode();
        Long l2 = this.depositInitiateTime;
        int iHashCode29 = l2 == null ? 0 : l2.hashCode();
        String str12 = this.networkName;
        int iHashCode30 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.value;
        int iHashCode31 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.price;
        int iHashCode32 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.networkIcon;
        int iHashCode33 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.earnMaxAprStr;
        int iHashCode34 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.dexOrderType;
        int iHashCode35 = str17 == null ? 0 : str17.hashCode();
        Boolean bool = this.hasSubTransactions;
        int iHashCode36 = bool == null ? 0 : bool.hashCode();
        String str18 = this.lstCurrencyName;
        int iHashCode37 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.convertRate;
        int iHashCode38 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.originAmount;
        int iHashCode39 = str20 == null ? 0 : str20.hashCode();
        Long l3 = this.convertTime;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + (l3 == null ? 0 : l3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isInnerTransfer() {
        return this.isInnerTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isInvoice() {
        return this.isInvoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOnChainRecharge() {
        return !this.isInnerTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUntradableTx() {
        return this.type == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressType(Integer num) {
        this.addressType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfirmNum(int i) {
        this.confirmNum = i;
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
    public final void setDepositConfirmations(int i) {
        this.depositConfirmations = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositId(long j) {
        this.depositId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDetailUrl(String str) {
        this.detailUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullName(String str) {
        this.fullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(String str) {
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInnerTransfer(boolean z) {
        this.isInnerTransfer = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvoice(boolean z) {
        this.isInvoice = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastUpdate(long j) {
        this.lastUpdate = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSenderUid(String str) {
        this.senderUid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(String str) {
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatusNum(int i) {
        this.statusNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrency(String str) {
        this.subCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetTypeStr(String str) {
        this.targetTypeStr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTravelRuleId(Long l) {
        this.travelRuleId = l;
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
    public final void setWithdrawConfirmations(int i) {
        this.withdrawConfirmations = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryItem(address=" + this.address + ", addressType=" + this.addressType + ", amount=" + this.amount + ", lastUpdate=" + this.lastUpdate + ", depositId=" + this.depositId + ", status=" + this.status + ", currency=" + this.currency + ", currencyId=" + this.currencyId + ", subCurrency=" + this.subCurrency + ", targetTypeStr=" + this.targetTypeStr + ", isInnerTransfer=" + this.isInnerTransfer + ", detailUrl=" + this.detailUrl + ", txid=" + this.txid + ", isInvoice=" + this.isInvoice + ", arrivalType=" + this.arrivalType + ", withdrawConfirmations=" + this.withdrawConfirmations + ", confirmNum=" + this.confirmNum + ", depositConfirmations=" + this.depositConfirmations + ", statusNum=" + this.statusNum + ", type=" + this.type + ", fullName=" + this.fullName + ", icon=" + this.icon + ", senderUid=" + this.senderUid + ", travelRuleId=" + this.travelRuleId + ", travelRuleStatus=" + this.travelRuleStatus + ", notices=" + this.notices + ", estimatedDepositCreditedTime=" + this.estimatedDepositCreditedTime + ", estimatedWithdrawUnlockTime=" + this.estimatedWithdrawUnlockTime + ", depositInitiateTime=" + this.depositInitiateTime + ", networkName=" + this.networkName + ", value=" + this.value + ", price=" + this.price + ", networkIcon=" + this.networkIcon + ", earnMaxAprStr=" + this.earnMaxAprStr + ", dexOrderType=" + this.dexOrderType + ", hasSubTransactions=" + this.hasSubTransactions + ", lstCurrencyName=" + this.lstCurrencyName + ", convertRate=" + this.convertRate + ", originAmount=" + this.originAmount + ", convertTime=" + this.convertTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        Integer num = this.addressType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.amount);
        parcel.writeLong(this.lastUpdate);
        parcel.writeLong(this.depositId);
        parcel.writeString(this.status);
        parcel.writeString(this.currency);
        parcel.writeInt(this.currencyId);
        parcel.writeString(this.subCurrency);
        parcel.writeString(this.targetTypeStr);
        parcel.writeInt(this.isInnerTransfer ? 1 : 0);
        parcel.writeString(this.detailUrl);
        parcel.writeString(this.txid);
        parcel.writeInt(this.isInvoice ? 1 : 0);
        parcel.writeInt(this.arrivalType);
        parcel.writeInt(this.withdrawConfirmations);
        parcel.writeInt(this.confirmNum);
        parcel.writeInt(this.depositConfirmations);
        parcel.writeInt(this.statusNum);
        parcel.writeInt(this.type);
        parcel.writeString(this.fullName);
        parcel.writeString(this.icon);
        parcel.writeString(this.senderUid);
        Long l = this.travelRuleId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num2 = this.travelRuleStatus;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
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
        Integer num3 = this.estimatedDepositCreditedTime;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.estimatedWithdrawUnlockTime;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Long l2 = this.depositInitiateTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.networkName);
        parcel.writeString(this.value);
        parcel.writeString(this.price);
        parcel.writeString(this.networkIcon);
        parcel.writeString(this.earnMaxAprStr);
        parcel.writeString(this.dexOrderType);
        Boolean bool = this.hasSubTransactions;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.lstCurrencyName);
        parcel.writeString(this.convertRate);
        parcel.writeString(this.originAmount);
        Long l3 = this.convertTime;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
    }

    public HistoryItem(String str, Integer num, String str2, long j, long j2, String str3, String str4, int i, String str5, String str6, boolean z, String str7, String str8, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7, String str9, String str10, String str11, Long l, Integer num2, List<Notice> list, Integer num3, Integer num4, Long l2, String str12, String str13, String str14, String str15, String str16, String str17, Boolean bool, String str18, String str19, String str20, Long l3) {
        this.address = str;
        this.addressType = num;
        this.amount = str2;
        this.lastUpdate = j;
        this.depositId = j2;
        this.status = str3;
        this.currency = str4;
        this.currencyId = i;
        this.subCurrency = str5;
        this.targetTypeStr = str6;
        this.isInnerTransfer = z;
        this.detailUrl = str7;
        this.txid = str8;
        this.isInvoice = z2;
        this.arrivalType = i2;
        this.withdrawConfirmations = i3;
        this.confirmNum = i4;
        this.depositConfirmations = i5;
        this.statusNum = i6;
        this.type = i7;
        this.fullName = str9;
        this.icon = str10;
        this.senderUid = str11;
        this.travelRuleId = l;
        this.travelRuleStatus = num2;
        this.notices = list;
        this.estimatedDepositCreditedTime = num3;
        this.estimatedWithdrawUnlockTime = num4;
        this.depositInitiateTime = l2;
        this.networkName = str12;
        this.value = str13;
        this.price = str14;
        this.networkIcon = str15;
        this.earnMaxAprStr = str16;
        this.dexOrderType = str17;
        this.hasSubTransactions = bool;
        this.lstCurrencyName = str18;
        this.convertRate = str19;
        this.originAmount = str20;
        this.convertTime = l3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HistoryItem(String str, Integer num, String str2, long j, long j2, String str3, String str4, int i, String str5, String str6, boolean z, String str7, String str8, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7, String str9, String str10, String str11, Long l, Integer num2, List list, Integer num3, Integer num4, Long l2, String str12, String str13, String str14, String str15, String str16, String str17, Boolean bool, String str18, String str19, String str20, Long l3, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        int i10;
        Integer num5;
        String str21 = (i8 & 1) != 0 ? null : str;
        Integer num6 = (i8 & 2) != 0 ? null : num;
        String str22 = (i8 & 4) != 0 ? null : str2;
        long j3 = (i8 & 8) != 0 ? 0L : j;
        long j4 = (i8 & 16) != 0 ? 0L : j2;
        String str23 = (i8 & 32) != 0 ? null : str3;
        String str24 = (i8 & 64) != 0 ? null : str4;
        int i11 = (i8 & 128) != 0 ? 0 : i;
        String str25 = (i8 & 256) != 0 ? "" : str5;
        String str26 = (i8 & 512) != 0 ? null : str6;
        boolean z3 = (i8 & 1024) != 0 ? false : z;
        String str27 = (i8 & 2048) != 0 ? null : str7;
        String str28 = (i8 & 4096) != 0 ? null : str8;
        boolean z4 = (i8 & 8192) != 0 ? false : z2;
        int i12 = (i8 & 16384) != 0 ? 0 : i2;
        int i13 = (i8 & 32768) != 0 ? 0 : i3;
        int i14 = (i8 & 65536) != 0 ? 0 : i4;
        int i15 = (i8 & 131072) != 0 ? 0 : i5;
        int i16 = (i8 & 262144) != 0 ? 0 : i6;
        int i17 = (i8 & 524288) != 0 ? 0 : i7;
        String str29 = (i8 & 1048576) != 0 ? "" : str9;
        String str30 = (i8 & 2097152) != 0 ? "" : str10;
        String str31 = (i8 & 4194304) != 0 ? "" : str11;
        Long l4 = (i8 & 8388608) != 0 ? null : l;
        Integer num7 = (i8 & 16777216) != 0 ? null : num2;
        List listAhwBna = (i8 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? yDY.AhwBna() : list;
        if ((i8 & 67108864) != 0) {
            i10 = 0;
            num5 = 0;
        } else {
            i10 = 0;
            num5 = num3;
        }
        this(str21, num6, str22, j3, j4, str23, str24, i11, str25, str26, z3, str27, str28, z4, i12, i13, i14, i15, i16, i17, str29, str30, str31, l4, num7, listAhwBna, num5, (i8 & 134217728) != 0 ? Integer.valueOf(i10) : num4, (i8 & 268435456) != 0 ? 0L : l2, (i8 & 536870912) != 0 ? null : str12, (i8 & 1073741824) != 0 ? "" : str13, (i8 & Integer.MIN_VALUE) != 0 ? "" : str14, (i9 & 1) != 0 ? "" : str15, (i9 & 2) != 0 ? null : str16, (i9 & 4) == 0 ? str17 : "", (i9 & 8) != 0 ? Boolean.FALSE : bool, (i9 & 16) != 0 ? null : str18, (i9 & 32) != 0 ? null : str19, (i9 & 64) != 0 ? null : str20, (i9 & 128) != 0 ? null : l3);
    }

    public static final class Notice implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Notice> CREATOR = new Creator();
        private final Integer actionType;
        private final String body;
        private final String buttonText;
        private final String dialogueContent;
        private final String header;
        private final Integer showType;

        public static final class Creator implements Parcelable.Creator<Notice> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Notice createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Notice(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
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
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Notice copy$default(Notice notice, String str, String str2, Integer num, String str3, Integer num2, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notice.header;
            }
            if ((i & 2) != 0) {
                str2 = notice.body;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                num = notice.actionType;
            }
            Integer num3 = num;
            if ((i & 8) != 0) {
                str3 = notice.dialogueContent;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                num2 = notice.showType;
            }
            Integer num4 = num2;
            if ((i & 32) != 0) {
                str4 = notice.buttonText;
            }
            return notice.copy(str, str5, num3, str6, num4, str4);
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
        public final Integer component3() {
            return this.actionType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.dialogueContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component5() {
            return this.showType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.buttonText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Notice copy(@NotNull String str, @NotNull String str2, Integer num, String str3, Integer num2, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Notice(str, str2, num, str3, num2, str4);
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
            return Intrinsics.EZpvd((Object) this.header, (Object) notice.header) && Intrinsics.EZpvd((Object) this.body, (Object) notice.body) && Intrinsics.EZpvd(this.actionType, notice.actionType) && Intrinsics.EZpvd((Object) this.dialogueContent, (Object) notice.dialogueContent) && Intrinsics.EZpvd(this.showType, notice.showType) && Intrinsics.EZpvd((Object) this.buttonText, (Object) notice.buttonText);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getActionType() {
            return this.actionType;
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
        public final String getDialogueContent() {
            return this.dialogueContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getHeader() {
            return this.header;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getShowType() {
            return this.showType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.header.hashCode();
            int iHashCode2 = this.body.hashCode();
            Integer num = this.actionType;
            int iHashCode3 = num == null ? 0 : num.hashCode();
            String str = this.dialogueContent;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            Integer num2 = this.showType;
            int iHashCode5 = num2 == null ? 0 : num2.hashCode();
            String str2 = this.buttonText;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Notice(header=" + this.header + ", body=" + this.body + ", actionType=" + this.actionType + ", dialogueContent=" + this.dialogueContent + ", showType=" + this.showType + ", buttonText=" + this.buttonText + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.header);
            parcel.writeString(this.body);
            Integer num = this.actionType;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.dialogueContent);
            Integer num2 = this.showType;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            parcel.writeString(this.buttonText);
        }

        public Notice(@NotNull String str, @NotNull String str2, Integer num, String str3, Integer num2, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.header = str;
            this.body = str2;
            this.actionType = num;
            this.dialogueContent = str3;
            this.showType = num2;
            this.buttonText = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:0x0018: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Integer:0x0029: TERNARY null = ((wrap:int:0x0021: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:63) call: com.okinc.assets.backend.api.model.HistoryItem.Notice.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
        public /* synthetic */ Notice(String str, String str2, Integer num, String str3, Integer num2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? 0 : num2, (i & 32) != 0 ? null : str4);
        }

        public final DepositHistoryNoticeActionType getActionTypeEnum() {
            return DepositHistoryNoticeActionType.Companion.KWHzl(this.actionType);
        }

        public final DepositHistoryNoticeShowType getShowTypeEnum() {
            return DepositHistoryNoticeShowType.Companion.OLrzqt(this.showType);
        }
    }

    public final DepositTransactionStatus getStatusNumEnum() {
        return DepositTransactionStatus.Companion.AEQbTJ(Integer.valueOf(this.statusNum));
    }

    private final TravelRuleStatus getTravelRuleStatusEnum() {
        return TravelRuleStatus.Companion.EZpvd(this.travelRuleStatus);
    }

    public final String convertDate() {
        Long l = this.depositInitiateTime;
        if ((l != null && l.longValue() == 0) || l == null) {
            return pTA.formatSimpleDateTime$default(new Date(this.lastUpdate), null, 1, null);
        }
        return pTA.formatSimpleDateTime$default(new Date(this.depositInitiateTime.longValue()), null, 1, null);
    }

    public final String convertDateV2() {
        Long l = this.depositInitiateTime;
        if ((l != null && l.longValue() == 0) || l == null) {
            Date date = new Date(this.lastUpdate);
            OKDateEnum oKDateEnum = OKDateEnum.DATE_FORMAT_STANDARD;
            OKTimeEnum oKTimeEnum = OKTimeEnum.TIME_FORMAT_STANDARD_HM;
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            return pTA.format$default(date, oKDateEnum, oKTimeEnum, locale, null, false, 24, null);
        }
        Date date2 = new Date(this.depositInitiateTime.longValue());
        OKDateEnum oKDateEnum2 = OKDateEnum.DATE_FORMAT_STANDARD;
        OKTimeEnum oKTimeEnum2 = OKTimeEnum.TIME_FORMAT_STANDARD_HM;
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        return pTA.format$default(date2, oKDateEnum2, oKTimeEnum2, locale2, null, false, 24, null);
    }

    public final String convertDate2() {
        Long l = this.depositInitiateTime;
        if ((l != null && l.longValue() == 0) || l == null) {
            return pTA.format$default(new Date(this.lastUpdate), OKDateEnum.DATE_FORMAT_STANDARD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
        }
        return pTA.format$default(new Date(this.depositInitiateTime.longValue()), OKDateEnum.DATE_FORMAT_STANDARD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
    }

    public final boolean showTravelRuleWarning() {
        return getStatusNumEnum() == DepositTransactionStatus.OnHoldStatus && getTravelRuleStatusEnum() == TravelRuleStatus.PendingSubmitInfo;
    }

    public final boolean showPendingCSApproval() {
        return getStatusNumEnum() == DepositTransactionStatus.OnHoldStatus && getTravelRuleStatusEnum() == TravelRuleStatus.PendingCSApproval;
    }

    public final boolean showAdditionalInfo() {
        return getStatusNumEnum() == DepositTransactionStatus.OnHoldStatus && getTravelRuleStatusEnum() == TravelRuleStatus.PendingAdditionalInfo;
    }
}
