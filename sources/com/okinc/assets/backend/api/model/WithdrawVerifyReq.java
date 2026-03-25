package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.assets.backend.api.model.WithdrawAddressSubmitReq;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawVerifyReq implements Parcelable {
    public static final int BusinessTypeWallet = 9;
    private String address;
    private Long addressId;
    private String amount;
    private ArrayList<WithdrawAddressSubmitReq.Amount> amounts;
    private String areaCode;
    private final Integer businessType;
    private Integer currencyId;
    private String fee;
    private String identifyId;
    private Integer internalAddressType;
    private Boolean invalidAsset;
    public Boolean isInvoice;
    private Boolean loanTrans;
    private Boolean riskAddressCheck;
    private Integer subCurrencyId;
    private String tag;
    private Integer targetType;
    private Integer type;
    private Boolean useUsdtFee;
    private Boolean validateAmount;
    private String valuationUnit;
    private final Integer walletType;
    private final String web3AccountId;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WithdrawVerifyReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WithdrawVerifyReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawVerifyReq createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            ArrayList arrayList;
            Boolean boolValueOf6;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string6 = parcel.readString();
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int i2 = 0;
                while (i2 != i) {
                    arrayList2.add(WithdrawAddressSubmitReq.Amount.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList2;
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WithdrawVerifyReq(numValueOf, string, lValueOf, string2, numValueOf2, numValueOf3, string3, boolValueOf, string4, boolValueOf2, string5, boolValueOf3, numValueOf4, boolValueOf4, numValueOf5, string6, numValueOf6, numValueOf7, string7, string8, boolValueOf5, arrayList, boolValueOf6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawVerifyReq[] newArray(int i) {
            return new WithdrawVerifyReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.riskAddressCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component13() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component14() {
        return this.validateAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component15() {
        return this.internalAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.web3AccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component17() {
        return this.businessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component18() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component21() {
        return this.useUsdtFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<WithdrawAddressSubmitReq.Amount> component22() {
        return this.amounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component23() {
        return this.loanTrans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.addressId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.isInvoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.identifyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawVerifyReq copy(Integer num, String str, Long l, String str2, Integer num2, Integer num3, String str3, Boolean bool, String str4, Boolean bool2, String str5, Boolean bool3, Integer num4, Boolean bool4, Integer num5, String str6, Integer num6, Integer num7, String str7, String str8, Boolean bool5, ArrayList<WithdrawAddressSubmitReq.Amount> arrayList, Boolean bool6) {
        return new WithdrawVerifyReq(num, str, l, str2, num2, num3, str3, bool, str4, bool2, str5, bool3, num4, bool4, num5, str6, num6, num7, str7, str8, bool5, arrayList, bool6);
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
        if (!(obj instanceof WithdrawVerifyReq)) {
            return false;
        }
        WithdrawVerifyReq withdrawVerifyReq = (WithdrawVerifyReq) obj;
        return Intrinsics.EZpvd(this.currencyId, withdrawVerifyReq.currencyId) && Intrinsics.EZpvd((Object) this.address, (Object) withdrawVerifyReq.address) && Intrinsics.EZpvd(this.addressId, withdrawVerifyReq.addressId) && Intrinsics.EZpvd((Object) this.tag, (Object) withdrawVerifyReq.tag) && Intrinsics.EZpvd(this.targetType, withdrawVerifyReq.targetType) && Intrinsics.EZpvd(this.subCurrencyId, withdrawVerifyReq.subCurrencyId) && Intrinsics.EZpvd((Object) this.amount, (Object) withdrawVerifyReq.amount) && Intrinsics.EZpvd(this.isInvoice, withdrawVerifyReq.isInvoice) && Intrinsics.EZpvd((Object) this.identifyId, (Object) withdrawVerifyReq.identifyId) && Intrinsics.EZpvd(this.invalidAsset, withdrawVerifyReq.invalidAsset) && Intrinsics.EZpvd((Object) this.areaCode, (Object) withdrawVerifyReq.areaCode) && Intrinsics.EZpvd(this.riskAddressCheck, withdrawVerifyReq.riskAddressCheck) && Intrinsics.EZpvd(this.type, withdrawVerifyReq.type) && Intrinsics.EZpvd(this.validateAmount, withdrawVerifyReq.validateAmount) && Intrinsics.EZpvd(this.internalAddressType, withdrawVerifyReq.internalAddressType) && Intrinsics.EZpvd((Object) this.web3AccountId, (Object) withdrawVerifyReq.web3AccountId) && Intrinsics.EZpvd(this.businessType, withdrawVerifyReq.businessType) && Intrinsics.EZpvd(this.walletType, withdrawVerifyReq.walletType) && Intrinsics.EZpvd((Object) this.valuationUnit, (Object) withdrawVerifyReq.valuationUnit) && Intrinsics.EZpvd((Object) this.fee, (Object) withdrawVerifyReq.fee) && Intrinsics.EZpvd(this.useUsdtFee, withdrawVerifyReq.useUsdtFee) && Intrinsics.EZpvd(this.amounts, withdrawVerifyReq.amounts) && Intrinsics.EZpvd(this.loanTrans, withdrawVerifyReq.loanTrans);
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
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<WithdrawAddressSubmitReq.Amount> getAmounts() {
        return this.amounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBusinessType() {
        return this.businessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
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
    public final Boolean getInvalidAsset() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getLoanTrans() {
        return this.loanTrans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRiskAddressCheck() {
        return this.riskAddressCheck;
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
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUseUsdtFee() {
        return this.useUsdtFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getValidateAmount() {
        return this.validateAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationUnit() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getWalletType() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeb3AccountId() {
        return this.web3AccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.currencyId;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.address;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Long l = this.addressId;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        String str2 = this.tag;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.targetType;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.subCurrencyId;
        int iHashCode6 = num3 == null ? 0 : num3.hashCode();
        String str3 = this.amount;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.isInvoice;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        String str4 = this.identifyId;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        Boolean bool2 = this.invalidAsset;
        int iHashCode10 = bool2 == null ? 0 : bool2.hashCode();
        String str5 = this.areaCode;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        Boolean bool3 = this.riskAddressCheck;
        int iHashCode12 = bool3 == null ? 0 : bool3.hashCode();
        Integer num4 = this.type;
        int iHashCode13 = num4 == null ? 0 : num4.hashCode();
        Boolean bool4 = this.validateAmount;
        int iHashCode14 = bool4 == null ? 0 : bool4.hashCode();
        Integer num5 = this.internalAddressType;
        int iHashCode15 = num5 == null ? 0 : num5.hashCode();
        String str6 = this.web3AccountId;
        int iHashCode16 = str6 == null ? 0 : str6.hashCode();
        Integer num6 = this.businessType;
        int iHashCode17 = num6 == null ? 0 : num6.hashCode();
        Integer num7 = this.walletType;
        int iHashCode18 = num7 == null ? 0 : num7.hashCode();
        String str7 = this.valuationUnit;
        int iHashCode19 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.fee;
        int iHashCode20 = str8 == null ? 0 : str8.hashCode();
        Boolean bool5 = this.useUsdtFee;
        int iHashCode21 = bool5 == null ? 0 : bool5.hashCode();
        ArrayList<WithdrawAddressSubmitReq.Amount> arrayList = this.amounts;
        int iHashCode22 = arrayList == null ? 0 : arrayList.hashCode();
        Boolean bool6 = this.loanTrans;
        return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (bool6 == null ? 0 : bool6.hashCode());
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
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmounts(ArrayList<WithdrawAddressSubmitReq.Amount> arrayList) {
        this.amounts = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAreaCode(String str) {
        this.areaCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(Integer num) {
        this.currencyId = num;
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
    public final void setInvalidAsset(Boolean bool) {
        this.invalidAsset = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoanTrans(Boolean bool) {
        this.loanTrans = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskAddressCheck(Boolean bool) {
        this.riskAddressCheck = bool;
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
    public final void setType(Integer num) {
        this.type = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUseUsdtFee(Boolean bool) {
        this.useUsdtFee = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValidateAmount(Boolean bool) {
        this.validateAmount = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuationUnit(String str) {
        this.valuationUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawVerifyReq(currencyId=" + this.currencyId + ", address=" + this.address + ", addressId=" + this.addressId + ", tag=" + this.tag + ", targetType=" + this.targetType + ", subCurrencyId=" + this.subCurrencyId + ", amount=" + this.amount + ", isInvoice=" + this.isInvoice + ", identifyId=" + this.identifyId + ", invalidAsset=" + this.invalidAsset + ", areaCode=" + this.areaCode + ", riskAddressCheck=" + this.riskAddressCheck + ", type=" + this.type + ", validateAmount=" + this.validateAmount + ", internalAddressType=" + this.internalAddressType + ", web3AccountId=" + this.web3AccountId + ", businessType=" + this.businessType + ", walletType=" + this.walletType + ", valuationUnit=" + this.valuationUnit + ", fee=" + this.fee + ", useUsdtFee=" + this.useUsdtFee + ", amounts=" + this.amounts + ", loanTrans=" + this.loanTrans + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.currencyId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.address);
        Long l = this.addressId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.tag);
        Integer num2 = this.targetType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.subCurrencyId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.amount);
        Boolean bool = this.isInvoice;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.identifyId);
        Boolean bool2 = this.invalidAsset;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.areaCode);
        Boolean bool3 = this.riskAddressCheck;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Integer num4 = this.type;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Boolean bool4 = this.validateAmount;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Integer num5 = this.internalAddressType;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        parcel.writeString(this.web3AccountId);
        Integer num6 = this.businessType;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        Integer num7 = this.walletType;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        parcel.writeString(this.valuationUnit);
        parcel.writeString(this.fee);
        Boolean bool5 = this.useUsdtFee;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        ArrayList<WithdrawAddressSubmitReq.Amount> arrayList = this.amounts;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<WithdrawAddressSubmitReq.Amount> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool6 = this.loanTrans;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
    }

    public WithdrawVerifyReq(Integer num, String str, Long l, String str2, Integer num2, Integer num3, String str3, Boolean bool, String str4, Boolean bool2, String str5, Boolean bool3, Integer num4, Boolean bool4, Integer num5, String str6, Integer num6, Integer num7, String str7, String str8, Boolean bool5, ArrayList<WithdrawAddressSubmitReq.Amount> arrayList, Boolean bool6) {
        this.currencyId = num;
        this.address = str;
        this.addressId = l;
        this.tag = str2;
        this.targetType = num2;
        this.subCurrencyId = num3;
        this.amount = str3;
        this.isInvoice = bool;
        this.identifyId = str4;
        this.invalidAsset = bool2;
        this.areaCode = str5;
        this.riskAddressCheck = bool3;
        this.type = num4;
        this.validateAmount = bool4;
        this.internalAddressType = num5;
        this.web3AccountId = str6;
        this.businessType = num6;
        this.walletType = num7;
        this.valuationUnit = str7;
        this.fee = str8;
        this.useUsdtFee = bool5;
        this.amounts = arrayList;
        this.loanTrans = bool6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009f: CONSTRUCTOR 
  (r28v0 java.lang.Integer)
  (r29v0 java.lang.String)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r51v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r30v0 java.lang.Long))
  (r31v0 java.lang.String)
  (r32v0 java.lang.Integer)
  (r33v0 java.lang.Integer)
  (r34v0 java.lang.String)
  (r35v0 java.lang.Boolean)
  (r36v0 java.lang.String)
  (r37v0 java.lang.Boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r51v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r51v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r39v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r51v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r40v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r51v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002c: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r41v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0031: ARITH (r51v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r42v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (32768 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0047: ARITH (65536 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r44v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0051: ARITH (131072 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r45v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (262144 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (524288 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x006f: ARITH (1048576 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r48v0 java.lang.Boolean))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0079: ARITH (2097152 int) & (r51v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r49v0 java.util.ArrayList))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0083: ARITH (r51v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r50v0 java.lang.Boolean))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.util.ArrayList<com.okinc.assets.backend.api.model.WithdrawAddressSubmitReq$Amount>, java.lang.Boolean):void (m)] (LINE:99) call: com.okinc.assets.backend.api.model.WithdrawVerifyReq.<init>(java.lang.Integer, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.util.ArrayList, java.lang.Boolean):void type: THIS */
    public /* synthetic */ WithdrawVerifyReq(Integer num, String str, Long l, String str2, Integer num2, Integer num3, String str3, Boolean bool, String str4, Boolean bool2, String str5, Boolean bool3, Integer num4, Boolean bool4, Integer num5, String str6, Integer num6, Integer num7, String str7, String str8, Boolean bool5, ArrayList arrayList, Boolean bool6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, (i & 4) != 0 ? null : l, str2, num2, num3, str3, bool, str4, bool2, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? Boolean.FALSE : bool3, (i & 4096) != 0 ? null : num4, (i & 8192) != 0 ? Boolean.FALSE : bool4, (i & 16384) != 0 ? null : num5, (32768 & i) != 0 ? null : str6, (65536 & i) != 0 ? null : num6, (131072 & i) != 0 ? null : num7, (262144 & i) != 0 ? null : str7, (524288 & i) != 0 ? null : str8, (1048576 & i) != 0 ? null : bool5, (2097152 & i) != 0 ? null : arrayList, (i & 4194304) != 0 ? null : bool6);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.WithdrawVerifyReq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
