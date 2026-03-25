package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawAddressSubmitReq implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WithdrawAddressSubmitReq> CREATOR = new Creator();
    private String address;
    private Long addressId;
    private boolean allCodeValidate;
    private String amount;
    private ArrayList<Integer> amountUsdtTarget;
    private ArrayList<Amount> amounts;
    private String areaCode;
    private int authFlag;
    private final Integer businessType;
    private String convertRate;
    private final Long convertTime;
    private int currencyId;
    private String emailCode;
    private String ext;
    private ExtInfo extInfo;
    private String faceVerifiedSessionId;
    private String fee;
    private String identifyId;
    private Integer internalAddressType;
    private boolean invalidAsset;
    private String invoice;
    private boolean isExt;
    private boolean loanTrans;
    private final String lstCurrencyAmount;
    private final String lstCurrencyIcon;
    private boolean need2FA;
    private boolean needEmailCode;
    private boolean needTradePassword;
    private String passkeyState;
    private String phoneCode;
    private int subCurrencyId;
    private String tag;
    private String tagTitle;
    private int targetType;
    private long time;
    private String title;
    private String totpCode;
    private String tradePwd;
    private Long travelRuleId;
    private Integer type;
    private final String web3AccountId;

    public static final class Creator implements Parcelable.Creator<WithdrawAddressSubmitReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddressSubmitReq createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String str;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Amount.CREATOR.createFromParcel(parcel));
                }
            }
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i5 = parcel.readInt();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i6 = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            boolean z5 = parcel.readInt() != 0;
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            boolean z6 = parcel.readInt() != 0;
            boolean z7 = parcel.readInt() != 0;
            long j = parcel.readLong();
            if (parcel.readInt() == 0) {
                str = string8;
                arrayList2 = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                str = string8;
                int i8 = 0;
                while (i8 != i7) {
                    arrayList3.add(Integer.valueOf(parcel.readInt()));
                    i8++;
                    i7 = i7;
                }
                arrayList2 = arrayList3;
            }
            return new WithdrawAddressSubmitReq(string, lValueOf, string2, arrayList, i3, i4, string3, string4, string5, string6, string7, i5, str, string9, i6, z, z2, z3, z4, string10, string11, z5, string12, string13, z6, z7, j, arrayList2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : ExtInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddressSubmitReq[] newArray(int i) {
            return new WithdrawAddressSubmitReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawAddressSubmitReq() {
        this(null, null, null, null, 0, 0, null, null, null, null, null, 0, null, null, 0, false, false, false, false, null, null, false, null, null, false, false, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tagTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.totpCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.need2FA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.needEmailCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.needTradePassword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.allCodeValidate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.addressId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.invoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.tradePwd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.isExt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.ext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.identifyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component25() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component26() {
        return this.loanTrans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component27() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Integer> component28() {
        return this.amountUsdtTarget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component29() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component31() {
        return this.internalAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component32() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExtInfo component33() {
        return this.extInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.passkeyState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.web3AccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component36() {
        return this.businessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.faceVerifiedSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.convertRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.lstCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Amount> component4() {
        return this.amounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component40() {
        return this.convertTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.lstCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.authFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.emailCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.phoneCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawAddressSubmitReq copy(String str, Long l, String str2, ArrayList<Amount> arrayList, int i, int i2, String str3, String str4, String str5, String str6, String str7, int i3, String str8, String str9, int i4, boolean z, boolean z2, boolean z3, boolean z4, String str10, String str11, boolean z5, String str12, String str13, boolean z6, boolean z7, long j, ArrayList<Integer> arrayList2, Integer num, String str14, Integer num2, Long l2, ExtInfo extInfo, String str15, String str16, Integer num3, String str17, String str18, String str19, Long l3, String str20) {
        return new WithdrawAddressSubmitReq(str, l, str2, arrayList, i, i2, str3, str4, str5, str6, str7, i3, str8, str9, i4, z, z2, z3, z4, str10, str11, z5, str12, str13, z6, z7, j, arrayList2, num, str14, num2, l2, extInfo, str15, str16, num3, str17, str18, str19, l3, str20);
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
        if (!(obj instanceof WithdrawAddressSubmitReq)) {
            return false;
        }
        WithdrawAddressSubmitReq withdrawAddressSubmitReq = (WithdrawAddressSubmitReq) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) withdrawAddressSubmitReq.address) && Intrinsics.EZpvd(this.addressId, withdrawAddressSubmitReq.addressId) && Intrinsics.EZpvd((Object) this.amount, (Object) withdrawAddressSubmitReq.amount) && Intrinsics.EZpvd(this.amounts, withdrawAddressSubmitReq.amounts) && this.authFlag == withdrawAddressSubmitReq.authFlag && this.currencyId == withdrawAddressSubmitReq.currencyId && Intrinsics.EZpvd((Object) this.emailCode, (Object) withdrawAddressSubmitReq.emailCode) && Intrinsics.EZpvd((Object) this.fee, (Object) withdrawAddressSubmitReq.fee) && Intrinsics.EZpvd((Object) this.phoneCode, (Object) withdrawAddressSubmitReq.phoneCode) && Intrinsics.EZpvd((Object) this.tag, (Object) withdrawAddressSubmitReq.tag) && Intrinsics.EZpvd((Object) this.tagTitle, (Object) withdrawAddressSubmitReq.tagTitle) && this.targetType == withdrawAddressSubmitReq.targetType && Intrinsics.EZpvd((Object) this.title, (Object) withdrawAddressSubmitReq.title) && Intrinsics.EZpvd((Object) this.totpCode, (Object) withdrawAddressSubmitReq.totpCode) && this.subCurrencyId == withdrawAddressSubmitReq.subCurrencyId && this.need2FA == withdrawAddressSubmitReq.need2FA && this.needEmailCode == withdrawAddressSubmitReq.needEmailCode && this.needTradePassword == withdrawAddressSubmitReq.needTradePassword && this.allCodeValidate == withdrawAddressSubmitReq.allCodeValidate && Intrinsics.EZpvd((Object) this.invoice, (Object) withdrawAddressSubmitReq.invoice) && Intrinsics.EZpvd((Object) this.tradePwd, (Object) withdrawAddressSubmitReq.tradePwd) && this.isExt == withdrawAddressSubmitReq.isExt && Intrinsics.EZpvd((Object) this.ext, (Object) withdrawAddressSubmitReq.ext) && Intrinsics.EZpvd((Object) this.identifyId, (Object) withdrawAddressSubmitReq.identifyId) && this.invalidAsset == withdrawAddressSubmitReq.invalidAsset && this.loanTrans == withdrawAddressSubmitReq.loanTrans && this.time == withdrawAddressSubmitReq.time && Intrinsics.EZpvd(this.amountUsdtTarget, withdrawAddressSubmitReq.amountUsdtTarget) && Intrinsics.EZpvd(this.type, withdrawAddressSubmitReq.type) && Intrinsics.EZpvd((Object) this.areaCode, (Object) withdrawAddressSubmitReq.areaCode) && Intrinsics.EZpvd(this.internalAddressType, withdrawAddressSubmitReq.internalAddressType) && Intrinsics.EZpvd(this.travelRuleId, withdrawAddressSubmitReq.travelRuleId) && Intrinsics.EZpvd(this.extInfo, withdrawAddressSubmitReq.extInfo) && Intrinsics.EZpvd((Object) this.passkeyState, (Object) withdrawAddressSubmitReq.passkeyState) && Intrinsics.EZpvd((Object) this.web3AccountId, (Object) withdrawAddressSubmitReq.web3AccountId) && Intrinsics.EZpvd(this.businessType, withdrawAddressSubmitReq.businessType) && Intrinsics.EZpvd((Object) this.faceVerifiedSessionId, (Object) withdrawAddressSubmitReq.faceVerifiedSessionId) && Intrinsics.EZpvd((Object) this.convertRate, (Object) withdrawAddressSubmitReq.convertRate) && Intrinsics.EZpvd((Object) this.lstCurrencyIcon, (Object) withdrawAddressSubmitReq.lstCurrencyIcon) && Intrinsics.EZpvd(this.convertTime, withdrawAddressSubmitReq.convertTime) && Intrinsics.EZpvd((Object) this.lstCurrencyAmount, (Object) withdrawAddressSubmitReq.lstCurrencyAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAddressId() {
        return this.addressId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllCodeValidate() {
        return this.allCodeValidate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Integer> getAmountUsdtTarget() {
        return this.amountUsdtTarget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Amount> getAmounts() {
        return this.amounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAuthFlag() {
        return this.authFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBusinessType() {
        return this.businessType;
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
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmailCode() {
        return this.emailCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExt() {
        return this.ext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExtInfo getExtInfo() {
        return this.extInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFaceVerifiedSessionId() {
        return this.faceVerifiedSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdentifyId() {
        return this.identifyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInternalAddressType() {
        return this.internalAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getInvalidAsset() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvoice() {
        return this.invoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getLoanTrans() {
        return this.loanTrans;
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
    public final boolean getNeed2FA() {
        return this.need2FA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedEmailCode() {
        return this.needEmailCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedTradePassword() {
        return this.needTradePassword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPasskeyState() {
        return this.passkeyState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhoneCode() {
        return this.phoneCode;
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
    public final String getTagTitle() {
        return this.tagTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTargetType() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotpCode() {
        return this.totpCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradePwd() {
        return this.tradePwd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTravelRuleId() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeb3AccountId() {
        return this.web3AccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.addressId;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        String str2 = this.amount;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        ArrayList<Amount> arrayList = this.amounts;
        int iHashCode4 = arrayList == null ? 0 : arrayList.hashCode();
        int iHashCode5 = Integer.hashCode(this.authFlag);
        int iHashCode6 = Integer.hashCode(this.currencyId);
        String str3 = this.emailCode;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.fee;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.phoneCode;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tag;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tagTitle;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        int iHashCode12 = Integer.hashCode(this.targetType);
        String str8 = this.title;
        int iHashCode13 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.totpCode;
        int iHashCode14 = str9 == null ? 0 : str9.hashCode();
        int iHashCode15 = Integer.hashCode(this.subCurrencyId);
        int iHashCode16 = Boolean.hashCode(this.need2FA);
        int iHashCode17 = Boolean.hashCode(this.needEmailCode);
        int iHashCode18 = Boolean.hashCode(this.needTradePassword);
        int iHashCode19 = Boolean.hashCode(this.allCodeValidate);
        String str10 = this.invoice;
        int iHashCode20 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.tradePwd;
        int iHashCode21 = str11 == null ? 0 : str11.hashCode();
        int iHashCode22 = Boolean.hashCode(this.isExt);
        String str12 = this.ext;
        int iHashCode23 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.identifyId;
        int iHashCode24 = str13 == null ? 0 : str13.hashCode();
        int iHashCode25 = Boolean.hashCode(this.invalidAsset);
        int iHashCode26 = Boolean.hashCode(this.loanTrans);
        int i = iHashCode13;
        int i2 = iHashCode14;
        int iHashCode27 = Long.hashCode(this.time);
        ArrayList<Integer> arrayList2 = this.amountUsdtTarget;
        int iHashCode28 = arrayList2 == null ? 0 : arrayList2.hashCode();
        Integer num = this.type;
        int iHashCode29 = num == null ? 0 : num.hashCode();
        String str14 = this.areaCode;
        int iHashCode30 = str14 == null ? 0 : str14.hashCode();
        Integer num2 = this.internalAddressType;
        int iHashCode31 = num2 == null ? 0 : num2.hashCode();
        Long l2 = this.travelRuleId;
        int iHashCode32 = l2 == null ? 0 : l2.hashCode();
        ExtInfo extInfo = this.extInfo;
        int iHashCode33 = extInfo == null ? 0 : extInfo.hashCode();
        String str15 = this.passkeyState;
        int iHashCode34 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.web3AccountId;
        int iHashCode35 = str16 == null ? 0 : str16.hashCode();
        Integer num3 = this.businessType;
        int iHashCode36 = num3 == null ? 0 : num3.hashCode();
        String str17 = this.faceVerifiedSessionId;
        int iHashCode37 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.convertRate;
        int iHashCode38 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.lstCurrencyIcon;
        int iHashCode39 = str19 == null ? 0 : str19.hashCode();
        Long l3 = this.convertTime;
        int iHashCode40 = l3 == null ? 0 : l3.hashCode();
        String str20 = this.lstCurrencyAmount;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + i) * 31) + i2) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + (str20 == null ? 0 : str20.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isExt() {
        return this.isExt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressId(Long l) {
        this.addressId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllCodeValidate(boolean z) {
        this.allCodeValidate = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmountUsdtTarget(ArrayList<Integer> arrayList) {
        this.amountUsdtTarget = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmounts(ArrayList<Amount> arrayList) {
        this.amounts = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAreaCode(String str) {
        this.areaCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthFlag(int i) {
        this.authFlag = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertRate(String str) {
        this.convertRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEmailCode(String str) {
        this.emailCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExt(String str) {
        this.ext = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExt(boolean z) {
        this.isExt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtInfo(ExtInfo extInfo) {
        this.extInfo = extInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceVerifiedSessionId(String str) {
        this.faceVerifiedSessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(String str) {
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIdentifyId(String str) {
        this.identifyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInternalAddressType(Integer num) {
        this.internalAddressType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvalidAsset(boolean z) {
        this.invalidAsset = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvoice(String str) {
        this.invoice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoanTrans(boolean z) {
        this.loanTrans = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeed2FA(boolean z) {
        this.need2FA = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedEmailCode(boolean z) {
        this.needEmailCode = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedTradePassword(boolean z) {
        this.needTradePassword = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPasskeyState(String str) {
        this.passkeyState = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPhoneCode(String str) {
        this.phoneCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrencyId(int i) {
        this.subCurrencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(String str) {
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTagTitle(String str) {
        this.tagTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetType(int i) {
        this.targetType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTime(long j) {
        this.time = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotpCode(String str) {
        this.totpCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradePwd(String str) {
        this.tradePwd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTravelRuleId(Long l) {
        this.travelRuleId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(Integer num) {
        this.type = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawAddressSubmitReq(address=" + this.address + ", addressId=" + this.addressId + ", amount=" + this.amount + ", amounts=" + this.amounts + ", authFlag=" + this.authFlag + ", currencyId=" + this.currencyId + ", emailCode=" + this.emailCode + ", fee=" + this.fee + ", phoneCode=" + this.phoneCode + ", tag=" + this.tag + ", tagTitle=" + this.tagTitle + ", targetType=" + this.targetType + ", title=" + this.title + ", totpCode=" + this.totpCode + ", subCurrencyId=" + this.subCurrencyId + ", need2FA=" + this.need2FA + ", needEmailCode=" + this.needEmailCode + ", needTradePassword=" + this.needTradePassword + ", allCodeValidate=" + this.allCodeValidate + ", invoice=" + this.invoice + ", tradePwd=" + this.tradePwd + ", isExt=" + this.isExt + ", ext=" + this.ext + ", identifyId=" + this.identifyId + ", invalidAsset=" + this.invalidAsset + ", loanTrans=" + this.loanTrans + ", time=" + this.time + ", amountUsdtTarget=" + this.amountUsdtTarget + ", type=" + this.type + ", areaCode=" + this.areaCode + ", internalAddressType=" + this.internalAddressType + ", travelRuleId=" + this.travelRuleId + ", extInfo=" + this.extInfo + ", passkeyState=" + this.passkeyState + ", web3AccountId=" + this.web3AccountId + ", businessType=" + this.businessType + ", faceVerifiedSessionId=" + this.faceVerifiedSessionId + ", convertRate=" + this.convertRate + ", lstCurrencyIcon=" + this.lstCurrencyIcon + ", convertTime=" + this.convertTime + ", lstCurrencyAmount=" + this.lstCurrencyAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        Long l = this.addressId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.amount);
        ArrayList<Amount> arrayList = this.amounts;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<Amount> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.authFlag);
        parcel.writeInt(this.currencyId);
        parcel.writeString(this.emailCode);
        parcel.writeString(this.fee);
        parcel.writeString(this.phoneCode);
        parcel.writeString(this.tag);
        parcel.writeString(this.tagTitle);
        parcel.writeInt(this.targetType);
        parcel.writeString(this.title);
        parcel.writeString(this.totpCode);
        parcel.writeInt(this.subCurrencyId);
        parcel.writeInt(this.need2FA ? 1 : 0);
        parcel.writeInt(this.needEmailCode ? 1 : 0);
        parcel.writeInt(this.needTradePassword ? 1 : 0);
        parcel.writeInt(this.allCodeValidate ? 1 : 0);
        parcel.writeString(this.invoice);
        parcel.writeString(this.tradePwd);
        parcel.writeInt(this.isExt ? 1 : 0);
        parcel.writeString(this.ext);
        parcel.writeString(this.identifyId);
        parcel.writeInt(this.invalidAsset ? 1 : 0);
        parcel.writeInt(this.loanTrans ? 1 : 0);
        parcel.writeLong(this.time);
        ArrayList<Integer> arrayList2 = this.amountUsdtTarget;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator<Integer> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                parcel.writeInt(it2.next().intValue());
            }
        }
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.areaCode);
        Integer num2 = this.internalAddressType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Long l2 = this.travelRuleId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        ExtInfo extInfo = this.extInfo;
        if (extInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            extInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.passkeyState);
        parcel.writeString(this.web3AccountId);
        Integer num3 = this.businessType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.faceVerifiedSessionId);
        parcel.writeString(this.convertRate);
        parcel.writeString(this.lstCurrencyIcon);
        Long l3 = this.convertTime;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.lstCurrencyAmount);
    }

    public WithdrawAddressSubmitReq(String str, Long l, String str2, ArrayList<Amount> arrayList, int i, int i2, String str3, String str4, String str5, String str6, String str7, int i3, String str8, String str9, int i4, boolean z, boolean z2, boolean z3, boolean z4, String str10, String str11, boolean z5, String str12, String str13, boolean z6, boolean z7, long j, ArrayList<Integer> arrayList2, Integer num, String str14, Integer num2, Long l2, ExtInfo extInfo, String str15, String str16, Integer num3, String str17, String str18, String str19, Long l3, String str20) {
        this.address = str;
        this.addressId = l;
        this.amount = str2;
        this.amounts = arrayList;
        this.authFlag = i;
        this.currencyId = i2;
        this.emailCode = str3;
        this.fee = str4;
        this.phoneCode = str5;
        this.tag = str6;
        this.tagTitle = str7;
        this.targetType = i3;
        this.title = str8;
        this.totpCode = str9;
        this.subCurrencyId = i4;
        this.need2FA = z;
        this.needEmailCode = z2;
        this.needTradePassword = z3;
        this.allCodeValidate = z4;
        this.invoice = str10;
        this.tradePwd = str11;
        this.isExt = z5;
        this.ext = str12;
        this.identifyId = str13;
        this.invalidAsset = z6;
        this.loanTrans = z7;
        this.time = j;
        this.amountUsdtTarget = arrayList2;
        this.type = num;
        this.areaCode = str14;
        this.internalAddressType = num2;
        this.travelRuleId = l2;
        this.extInfo = extInfo;
        this.passkeyState = str15;
        this.web3AccountId = str16;
        this.businessType = num3;
        this.faceVerifiedSessionId = str17;
        this.convertRate = str18;
        this.lstCurrencyIcon = str19;
        this.convertTime = l3;
        this.lstCurrencyAmount = str20;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01df: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r84v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r84v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r43v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r84v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x001c: ARITH (r84v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r45v0 java.util.ArrayList))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r84v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r46v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002c: ARITH (r84v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r47v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r84v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r84v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r84v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r84v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r84v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005c: ARITH (r84v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r53v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r84v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:0x0074: TERNARY null = ((wrap:int:0x006c: ARITH (r84v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0076: ARITH (r84v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (Integer.MIN_VALUE int) : (r56v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0084: ARITH (r84v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r57v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008f: ARITH (r84v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r58v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x009a: ARITH (r84v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? true : (r59v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r84v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? false : (r60v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r84v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r84v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r84v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? false : (r63v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r84v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r84v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r84v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? false : (r66v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r84v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? false : (r67v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r84v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r68v0 long))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0108: ARITH (r84v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r70v0 java.util.ArrayList))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0113: ARITH (r84v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r71v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011e: ARITH (r84v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r72v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0129: ARITH (r84v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r73v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0132: ARITH (r84v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r74v0 java.lang.Long))
  (wrap:com.okinc.assets.backend.api.model.WithdrawAddressSubmitReq$ExtInfo:?: TERNARY null = ((wrap:int:0x013a: ARITH (r85v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.WithdrawAddressSubmitReq$ExtInfo) : (r75v0 com.okinc.assets.backend.api.model.WithdrawAddressSubmitReq$ExtInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0143: ARITH (r85v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014c: ARITH (r85v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r77v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0155: ARITH (r85v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r78v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015e: ARITH (r85v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0167: ARITH (r85v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0170: ARITH (r85v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r81v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x017b: ARITH (r85v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r82v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0183: ARITH (r85v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r83v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Long, java.lang.String, java.util.ArrayList<com.okinc.assets.backend.api.model.WithdrawAddressSubmitReq$Amount>, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, long, java.util.ArrayList<java.lang.Integer>, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, com.okinc.assets.backend.api.model.WithdrawAddressSubmitReq$ExtInfo, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String):void (m)] (LINE:195) call: com.okinc.assets.backend.api.model.WithdrawAddressSubmitReq.<init>(java.lang.String, java.lang.Long, java.lang.String, java.util.ArrayList, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, long, java.util.ArrayList, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, com.okinc.assets.backend.api.model.WithdrawAddressSubmitReq$ExtInfo, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ WithdrawAddressSubmitReq(String str, Long l, String str2, ArrayList arrayList, int i, int i2, String str3, String str4, String str5, String str6, String str7, int i3, String str8, String str9, int i4, boolean z, boolean z2, boolean z3, boolean z4, String str10, String str11, boolean z5, String str12, String str13, boolean z6, boolean z7, long j, ArrayList arrayList2, Integer num, String str14, Integer num2, Long l2, ExtInfo extInfo, String str15, String str16, Integer num3, String str17, String str18, String str19, Long l3, String str20, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? null : l, (i5 & 4) != 0 ? null : str2, (i5 & 8) != 0 ? null : arrayList, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? null : str3, (i5 & 128) != 0 ? null : str4, (i5 & 256) != 0 ? null : str5, (i5 & 512) != 0 ? null : str6, (i5 & 1024) != 0 ? null : str7, (i5 & 2048) != 0 ? 0 : i3, (i5 & 4096) != 0 ? null : str8, (i5 & 8192) != 0 ? null : str9, (i5 & 16384) != 0 ? Integer.MIN_VALUE : i4, (i5 & 32768) != 0 ? false : z, (i5 & 65536) != 0 ? false : z2, (i5 & 131072) != 0 ? true : z3, (i5 & 262144) != 0 ? false : z4, (i5 & 524288) != 0 ? null : str10, (i5 & 1048576) != 0 ? null : str11, (i5 & 2097152) != 0 ? false : z5, (i5 & 4194304) != 0 ? null : str12, (i5 & 8388608) != 0 ? null : str13, (i5 & 16777216) != 0 ? false : z6, (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? false : z7, (i5 & 67108864) != 0 ? 0L : j, (i5 & 134217728) != 0 ? null : arrayList2, (i5 & 268435456) != 0 ? null : num, (i5 & 536870912) != 0 ? null : str14, (i5 & 1073741824) != 0 ? null : num2, (i5 & Integer.MIN_VALUE) != 0 ? null : l2, (i6 & 1) != 0 ? null : extInfo, (i6 & 2) != 0 ? null : str15, (i6 & 4) != 0 ? null : str16, (i6 & 8) != 0 ? null : num3, (i6 & 16) != 0 ? null : str17, (i6 & 32) != 0 ? null : str18, (i6 & 64) != 0 ? null : str19, (i6 & 128) != 0 ? null : l3, (i6 & 256) != 0 ? null : str20);
    }

    public static final class Amount implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Amount> CREATOR = new Creator();
        private String amount;
        private int productId;
        private int target;

        public static final class Creator implements Parcelable.Creator<Amount> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Amount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Amount(parcel.readString(), parcel.readInt(), parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Amount[] newArray(int i) {
                return new Amount[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Amount() {
            this(null, 0, 0, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Amount copy$default(Amount amount, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = amount.amount;
            }
            if ((i3 & 2) != 0) {
                i = amount.productId;
            }
            if ((i3 & 4) != 0) {
                i2 = amount.target;
            }
            return amount.copy(str, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component2() {
            return this.productId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component3() {
            return this.target;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Amount copy(String str, int i, int i2) {
            return new Amount(str, i, i2);
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
            if (!(obj instanceof Amount)) {
                return false;
            }
            Amount amount = (Amount) obj;
            return Intrinsics.EZpvd((Object) this.amount, (Object) amount.amount) && this.productId == amount.productId && this.target == amount.target;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAmount() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getProductId() {
            return this.productId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTarget() {
            return this.target;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.amount;
            return ((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.productId)) * 31) + Integer.hashCode(this.target);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAmount(String str) {
            this.amount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setProductId(int i) {
            this.productId = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTarget(int i) {
            this.target = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Amount(amount=" + this.amount + ", productId=" + this.productId + ", target=" + this.target + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.amount);
            parcel.writeInt(this.productId);
            parcel.writeInt(this.target);
        }

        public Amount(String str, int i, int i2) {
            this.amount = str;
            this.productId = i;
            this.target = i2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(java.lang.String, int, int):void (m)] (LINE:244) call: com.okinc.assets.backend.api.model.WithdrawAddressSubmitReq.Amount.<init>(java.lang.String, int, int):void type: THIS */
        public /* synthetic */ Amount(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
        }
    }

    public static final class ExtInfo implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ExtInfo> CREATOR = new Creator();
        private final String originalAddress;
        private final String originalTag;

        public static final class Creator implements Parcelable.Creator<ExtInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ExtInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ExtInfo(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ExtInfo[] newArray(int i) {
                return new ExtInfo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ExtInfo() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ExtInfo copy$default(ExtInfo extInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = extInfo.originalAddress;
            }
            if ((i & 2) != 0) {
                str2 = extInfo.originalTag;
            }
            return extInfo.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.originalAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.originalTag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ExtInfo copy(String str, String str2) {
            return new ExtInfo(str, str2);
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
            if (!(obj instanceof ExtInfo)) {
                return false;
            }
            ExtInfo extInfo = (ExtInfo) obj;
            return Intrinsics.EZpvd((Object) this.originalAddress, (Object) extInfo.originalAddress) && Intrinsics.EZpvd((Object) this.originalTag, (Object) extInfo.originalTag);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOriginalAddress() {
            return this.originalAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOriginalTag() {
            return this.originalTag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.originalAddress;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.originalTag;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ExtInfo(originalAddress=" + this.originalAddress + ", originalTag=" + this.originalTag + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.originalAddress);
            parcel.writeString(this.originalTag);
        }

        public ExtInfo(String str, String str2) {
            this.originalAddress = str;
            this.originalTag = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:252) call: com.okinc.assets.backend.api.model.WithdrawAddressSubmitReq.ExtInfo.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ ExtInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }
}
