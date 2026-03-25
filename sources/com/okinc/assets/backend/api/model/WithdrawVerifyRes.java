package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.assets.backend.api.model.WithdrawAddressSubmitReq;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawVerifyRes implements Serializable, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WithdrawVerifyRes> CREATOR = new Creator();
    private String addrTitle;
    private Integer addressId;
    private ArrayList<WithdrawAddressSubmitReq.Amount> amounts;
    private String convertRate;
    private final FaceVerification faceVerification;
    private boolean googleVerification;
    private String lstCurrencyAmount;
    private String lstCurrencyIcon;
    private boolean need2FA;
    private boolean needEmailCode;
    private boolean needTradePassword;
    private PasskeyStatus passkeyStatus;
    private boolean phoneVerification;
    private QuestionnaireResponse questionnaireResponse;
    private String realAmount;
    private String realValuation;
    private int status;
    private int subCurrencyId;
    private String totalAmount;
    private String uid;
    private String web3AddrName;
    private final Web3QuickWithdraw web3QuickWithdraw;
    private WithdrawTravelRuleResponse withdrawTravelRuleResponse;

    public static final class Creator implements Parcelable.Creator<WithdrawVerifyRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawVerifyRes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string = parcel.readString();
            ArrayList arrayList = null;
            WithdrawTravelRuleResponse withdrawTravelRuleResponseCreateFromParcel = parcel.readInt() == 0 ? null : WithdrawTravelRuleResponse.CREATOR.createFromParcel(parcel);
            QuestionnaireResponse questionnaireResponseCreateFromParcel = parcel.readInt() == 0 ? null : QuestionnaireResponse.CREATOR.createFromParcel(parcel);
            PasskeyStatus passkeyStatusCreateFromParcel = parcel.readInt() == 0 ? null : PasskeyStatus.CREATOR.createFromParcel(parcel);
            FaceVerification faceVerificationCreateFromParcel = parcel.readInt() == 0 ? null : FaceVerification.CREATOR.createFromParcel(parcel);
            Web3QuickWithdraw web3QuickWithdrawCreateFromParcel = parcel.readInt() == 0 ? null : Web3QuickWithdraw.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(WithdrawAddressSubmitReq.Amount.CREATOR.createFromParcel(parcel));
                }
            }
            return new WithdrawVerifyRes(z, z2, z3, z4, z5, i, i2, string, withdrawTravelRuleResponseCreateFromParcel, questionnaireResponseCreateFromParcel, passkeyStatusCreateFromParcel, faceVerificationCreateFromParcel, web3QuickWithdrawCreateFromParcel, string2, string3, numValueOf, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawVerifyRes[] newArray(int i) {
            return new WithdrawVerifyRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawVerifyRes() {
        this(false, false, false, false, false, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.googleVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuestionnaireResponse component10() {
        return this.questionnaireResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyStatus component11() {
        return this.passkeyStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceVerification component12() {
        return this.faceVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3QuickWithdraw component13() {
        return this.web3QuickWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.web3AddrName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.addrTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component16() {
        return this.addressId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<WithdrawAddressSubmitReq.Amount> component17() {
        return this.amounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.realAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.totalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.phoneVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.realValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.convertRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.lstCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.lstCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.need2FA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.needEmailCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.needTradePassword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawTravelRuleResponse component9() {
        return this.withdrawTravelRuleResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawVerifyRes copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2, String str, WithdrawTravelRuleResponse withdrawTravelRuleResponse, QuestionnaireResponse questionnaireResponse, PasskeyStatus passkeyStatus, FaceVerification faceVerification, Web3QuickWithdraw web3QuickWithdraw, String str2, String str3, Integer num, ArrayList<WithdrawAddressSubmitReq.Amount> arrayList, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new WithdrawVerifyRes(z, z2, z3, z4, z5, i, i2, str, withdrawTravelRuleResponse, questionnaireResponse, passkeyStatus, faceVerification, web3QuickWithdraw, str2, str3, num, arrayList, str4, str5, str6, str7, str8, str9);
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
        if (!(obj instanceof WithdrawVerifyRes)) {
            return false;
        }
        WithdrawVerifyRes withdrawVerifyRes = (WithdrawVerifyRes) obj;
        return this.googleVerification == withdrawVerifyRes.googleVerification && this.phoneVerification == withdrawVerifyRes.phoneVerification && this.need2FA == withdrawVerifyRes.need2FA && this.needEmailCode == withdrawVerifyRes.needEmailCode && this.needTradePassword == withdrawVerifyRes.needTradePassword && this.status == withdrawVerifyRes.status && this.subCurrencyId == withdrawVerifyRes.subCurrencyId && Intrinsics.EZpvd((Object) this.uid, (Object) withdrawVerifyRes.uid) && Intrinsics.EZpvd(this.withdrawTravelRuleResponse, withdrawVerifyRes.withdrawTravelRuleResponse) && Intrinsics.EZpvd(this.questionnaireResponse, withdrawVerifyRes.questionnaireResponse) && Intrinsics.EZpvd(this.passkeyStatus, withdrawVerifyRes.passkeyStatus) && Intrinsics.EZpvd(this.faceVerification, withdrawVerifyRes.faceVerification) && Intrinsics.EZpvd(this.web3QuickWithdraw, withdrawVerifyRes.web3QuickWithdraw) && Intrinsics.EZpvd((Object) this.web3AddrName, (Object) withdrawVerifyRes.web3AddrName) && Intrinsics.EZpvd((Object) this.addrTitle, (Object) withdrawVerifyRes.addrTitle) && Intrinsics.EZpvd(this.addressId, withdrawVerifyRes.addressId) && Intrinsics.EZpvd(this.amounts, withdrawVerifyRes.amounts) && Intrinsics.EZpvd((Object) this.realAmount, (Object) withdrawVerifyRes.realAmount) && Intrinsics.EZpvd((Object) this.totalAmount, (Object) withdrawVerifyRes.totalAmount) && Intrinsics.EZpvd((Object) this.realValuation, (Object) withdrawVerifyRes.realValuation) && Intrinsics.EZpvd((Object) this.convertRate, (Object) withdrawVerifyRes.convertRate) && Intrinsics.EZpvd((Object) this.lstCurrencyIcon, (Object) withdrawVerifyRes.lstCurrencyIcon) && Intrinsics.EZpvd((Object) this.lstCurrencyAmount, (Object) withdrawVerifyRes.lstCurrencyAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddrTitle() {
        return this.addrTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAddressId() {
        return this.addressId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<WithdrawAddressSubmitReq.Amount> getAmounts() {
        return this.amounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertRate() {
        return this.convertRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceVerification getFaceVerification() {
        return this.faceVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getGoogleVerification() {
        return this.googleVerification;
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
    public final PasskeyStatus getPasskeyStatus() {
        return this.passkeyStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPhoneVerification() {
        return this.phoneVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuestionnaireResponse getQuestionnaireResponse() {
        return this.questionnaireResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealAmount() {
        return this.realAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealValuation() {
        return this.realValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUid() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeb3AddrName() {
        return this.web3AddrName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3QuickWithdraw getWeb3QuickWithdraw() {
        return this.web3QuickWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawTravelRuleResponse getWithdrawTravelRuleResponse() {
        return this.withdrawTravelRuleResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.googleVerification);
        int iHashCode2 = Boolean.hashCode(this.phoneVerification);
        int iHashCode3 = Boolean.hashCode(this.need2FA);
        int iHashCode4 = Boolean.hashCode(this.needEmailCode);
        int iHashCode5 = Boolean.hashCode(this.needTradePassword);
        int iHashCode6 = Integer.hashCode(this.status);
        int iHashCode7 = Integer.hashCode(this.subCurrencyId);
        String str = this.uid;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        WithdrawTravelRuleResponse withdrawTravelRuleResponse = this.withdrawTravelRuleResponse;
        int iHashCode9 = withdrawTravelRuleResponse == null ? 0 : withdrawTravelRuleResponse.hashCode();
        QuestionnaireResponse questionnaireResponse = this.questionnaireResponse;
        int iHashCode10 = questionnaireResponse == null ? 0 : questionnaireResponse.hashCode();
        PasskeyStatus passkeyStatus = this.passkeyStatus;
        int iHashCode11 = passkeyStatus == null ? 0 : passkeyStatus.hashCode();
        FaceVerification faceVerification = this.faceVerification;
        int iHashCode12 = faceVerification == null ? 0 : faceVerification.hashCode();
        Web3QuickWithdraw web3QuickWithdraw = this.web3QuickWithdraw;
        int iHashCode13 = web3QuickWithdraw == null ? 0 : web3QuickWithdraw.hashCode();
        String str2 = this.web3AddrName;
        int iHashCode14 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.addrTitle;
        int iHashCode15 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.addressId;
        int iHashCode16 = num == null ? 0 : num.hashCode();
        ArrayList<WithdrawAddressSubmitReq.Amount> arrayList = this.amounts;
        int iHashCode17 = arrayList == null ? 0 : arrayList.hashCode();
        String str4 = this.realAmount;
        int iHashCode18 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.totalAmount;
        int iHashCode19 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.realValuation;
        int iHashCode20 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.convertRate;
        int iHashCode21 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.lstCurrencyIcon;
        int iHashCode22 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.lstCurrencyAmount;
        return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (str9 == null ? 0 : str9.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddrTitle(String str) {
        this.addrTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressId(Integer num) {
        this.addressId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmounts(ArrayList<WithdrawAddressSubmitReq.Amount> arrayList) {
        this.amounts = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertRate(String str) {
        this.convertRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGoogleVerification(boolean z) {
        this.googleVerification = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLstCurrencyAmount(String str) {
        this.lstCurrencyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLstCurrencyIcon(String str) {
        this.lstCurrencyIcon = str;
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
    public final void setPasskeyStatus(PasskeyStatus passkeyStatus) {
        this.passkeyStatus = passkeyStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPhoneVerification(boolean z) {
        this.phoneVerification = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuestionnaireResponse(QuestionnaireResponse questionnaireResponse) {
        this.questionnaireResponse = questionnaireResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealAmount(String str) {
        this.realAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealValuation(String str) {
        this.realValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrencyId(int i) {
        this.subCurrencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalAmount(String str) {
        this.totalAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUid(String str) {
        this.uid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeb3AddrName(String str) {
        this.web3AddrName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWithdrawTravelRuleResponse(WithdrawTravelRuleResponse withdrawTravelRuleResponse) {
        this.withdrawTravelRuleResponse = withdrawTravelRuleResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawVerifyRes(googleVerification=" + this.googleVerification + ", phoneVerification=" + this.phoneVerification + ", need2FA=" + this.need2FA + ", needEmailCode=" + this.needEmailCode + ", needTradePassword=" + this.needTradePassword + ", status=" + this.status + ", subCurrencyId=" + this.subCurrencyId + ", uid=" + this.uid + ", withdrawTravelRuleResponse=" + this.withdrawTravelRuleResponse + ", questionnaireResponse=" + this.questionnaireResponse + ", passkeyStatus=" + this.passkeyStatus + ", faceVerification=" + this.faceVerification + ", web3QuickWithdraw=" + this.web3QuickWithdraw + ", web3AddrName=" + this.web3AddrName + ", addrTitle=" + this.addrTitle + ", addressId=" + this.addressId + ", amounts=" + this.amounts + ", realAmount=" + this.realAmount + ", totalAmount=" + this.totalAmount + ", realValuation=" + this.realValuation + ", convertRate=" + this.convertRate + ", lstCurrencyIcon=" + this.lstCurrencyIcon + ", lstCurrencyAmount=" + this.lstCurrencyAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.googleVerification ? 1 : 0);
        parcel.writeInt(this.phoneVerification ? 1 : 0);
        parcel.writeInt(this.need2FA ? 1 : 0);
        parcel.writeInt(this.needEmailCode ? 1 : 0);
        parcel.writeInt(this.needTradePassword ? 1 : 0);
        parcel.writeInt(this.status);
        parcel.writeInt(this.subCurrencyId);
        parcel.writeString(this.uid);
        WithdrawTravelRuleResponse withdrawTravelRuleResponse = this.withdrawTravelRuleResponse;
        if (withdrawTravelRuleResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            withdrawTravelRuleResponse.writeToParcel(parcel, i);
        }
        QuestionnaireResponse questionnaireResponse = this.questionnaireResponse;
        if (questionnaireResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            questionnaireResponse.writeToParcel(parcel, i);
        }
        PasskeyStatus passkeyStatus = this.passkeyStatus;
        if (passkeyStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            passkeyStatus.writeToParcel(parcel, i);
        }
        FaceVerification faceVerification = this.faceVerification;
        if (faceVerification == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            faceVerification.writeToParcel(parcel, i);
        }
        Web3QuickWithdraw web3QuickWithdraw = this.web3QuickWithdraw;
        if (web3QuickWithdraw == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            web3QuickWithdraw.writeToParcel(parcel, i);
        }
        parcel.writeString(this.web3AddrName);
        parcel.writeString(this.addrTitle);
        Integer num = this.addressId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
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
        parcel.writeString(this.realAmount);
        parcel.writeString(this.totalAmount);
        parcel.writeString(this.realValuation);
        parcel.writeString(this.convertRate);
        parcel.writeString(this.lstCurrencyIcon);
        parcel.writeString(this.lstCurrencyAmount);
    }

    public WithdrawVerifyRes(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2, String str, WithdrawTravelRuleResponse withdrawTravelRuleResponse, QuestionnaireResponse questionnaireResponse, PasskeyStatus passkeyStatus, FaceVerification faceVerification, Web3QuickWithdraw web3QuickWithdraw, String str2, String str3, Integer num, ArrayList<WithdrawAddressSubmitReq.Amount> arrayList, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.googleVerification = z;
        this.phoneVerification = z2;
        this.need2FA = z3;
        this.needEmailCode = z4;
        this.needTradePassword = z5;
        this.status = i;
        this.subCurrencyId = i2;
        this.uid = str;
        this.withdrawTravelRuleResponse = withdrawTravelRuleResponse;
        this.questionnaireResponse = questionnaireResponse;
        this.passkeyStatus = passkeyStatus;
        this.faceVerification = faceVerification;
        this.web3QuickWithdraw = web3QuickWithdraw;
        this.web3AddrName = str2;
        this.addrTitle = str3;
        this.addressId = num;
        this.amounts = arrayList;
        this.realAmount = str4;
        this.totalAmount = str5;
        this.realValuation = str6;
        this.convertRate = str7;
        this.lstCurrencyIcon = str8;
        this.lstCurrencyAmount = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0103: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r48v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r48v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r48v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r48v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r48v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r29v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002b: ARITH (r48v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r30v0 int) : (0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0032: ARITH (r48v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (Integer.MIN_VALUE int) : (r31v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r48v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:com.okinc.assets.backend.api.model.WithdrawTravelRuleResponse:?: TERNARY null = ((wrap:int:0x0043: ARITH (r48v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.WithdrawTravelRuleResponse) : (r33v0 com.okinc.assets.backend.api.model.WithdrawTravelRuleResponse))
  (wrap:com.okinc.assets.backend.api.model.QuestionnaireResponse:?: TERNARY null = ((wrap:int:0x004b: ARITH (r48v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.QuestionnaireResponse) : (r34v0 com.okinc.assets.backend.api.model.QuestionnaireResponse))
  (wrap:com.okinc.assets.backend.api.model.PasskeyStatus:?: TERNARY null = ((wrap:int:0x0053: ARITH (r48v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.PasskeyStatus) : (r35v0 com.okinc.assets.backend.api.model.PasskeyStatus))
  (wrap:com.okinc.assets.backend.api.model.FaceVerification:?: TERNARY null = ((wrap:int:0x005b: ARITH (r48v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.FaceVerification) : (r36v0 com.okinc.assets.backend.api.model.FaceVerification))
  (wrap:com.okinc.assets.backend.api.model.Web3QuickWithdraw:?: TERNARY null = ((wrap:int:0x0063: ARITH (r48v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.Web3QuickWithdraw) : (r37v0 com.okinc.assets.backend.api.model.Web3QuickWithdraw))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r48v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (r48v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x007e: ARITH (r48v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r40v0 java.lang.Integer))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0089: ARITH (r48v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r41v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0094: ARITH (r48v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009f: ARITH (r48v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r48v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b5: ARITH (r48v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c0: ARITH (r48v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cb: ARITH (r48v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
 A[MD:(boolean, boolean, boolean, boolean, boolean, int, int, java.lang.String, com.okinc.assets.backend.api.model.WithdrawTravelRuleResponse, com.okinc.assets.backend.api.model.QuestionnaireResponse, com.okinc.assets.backend.api.model.PasskeyStatus, com.okinc.assets.backend.api.model.FaceVerification, com.okinc.assets.backend.api.model.Web3QuickWithdraw, java.lang.String, java.lang.String, java.lang.Integer, java.util.ArrayList<com.okinc.assets.backend.api.model.WithdrawAddressSubmitReq$Amount>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:83) call: com.okinc.assets.backend.api.model.WithdrawVerifyRes.<init>(boolean, boolean, boolean, boolean, boolean, int, int, java.lang.String, com.okinc.assets.backend.api.model.WithdrawTravelRuleResponse, com.okinc.assets.backend.api.model.QuestionnaireResponse, com.okinc.assets.backend.api.model.PasskeyStatus, com.okinc.assets.backend.api.model.FaceVerification, com.okinc.assets.backend.api.model.Web3QuickWithdraw, java.lang.String, java.lang.String, java.lang.Integer, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WithdrawVerifyRes(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2, String str, WithdrawTravelRuleResponse withdrawTravelRuleResponse, QuestionnaireResponse questionnaireResponse, PasskeyStatus passkeyStatus, FaceVerification faceVerification, Web3QuickWithdraw web3QuickWithdraw, String str2, String str3, Integer num, ArrayList arrayList, String str4, String str5, String str6, String str7, String str8, String str9, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? false : z4, (i3 & 16) != 0 ? true : z5, (i3 & 32) == 0 ? i : 0, (i3 & 64) != 0 ? Integer.MIN_VALUE : i2, (i3 & 128) != 0 ? null : str, (i3 & 256) != 0 ? null : withdrawTravelRuleResponse, (i3 & 512) != 0 ? null : questionnaireResponse, (i3 & 1024) != 0 ? null : passkeyStatus, (i3 & 2048) != 0 ? null : faceVerification, (i3 & 4096) != 0 ? null : web3QuickWithdraw, (i3 & 8192) != 0 ? null : str2, (i3 & 16384) != 0 ? null : str3, (i3 & 32768) != 0 ? null : num, (i3 & 65536) != 0 ? null : arrayList, (i3 & 131072) != 0 ? null : str4, (i3 & 262144) != 0 ? null : str5, (i3 & 524288) != 0 ? null : str6, (i3 & 1048576) != 0 ? null : str7, (i3 & 2097152) != 0 ? null : str8, (i3 & 4194304) != 0 ? null : str9);
    }
}
