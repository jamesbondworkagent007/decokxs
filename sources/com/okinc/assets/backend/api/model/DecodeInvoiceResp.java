package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class DecodeInvoiceResp implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DecodeInvoiceResp> CREATOR = new Creator();
    private final String address;
    private final String amount;
    private final String desc;
    private final FaceVerification faceVerification;
    private final String fee;
    private final boolean googleVerification;
    private final boolean need2FA;
    private final boolean needEmailCode;
    private final boolean needTradePassword;
    private final PasskeyStatus passkeyStatus;
    private final boolean phoneVerification;
    private final QuestionnaireResponse questionnaireResponse;
    private final WithdrawTravelRuleResponse withdrawTravelRuleResponse;

    public static final class Creator implements Parcelable.Creator<DecodeInvoiceResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DecodeInvoiceResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DecodeInvoiceResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : WithdrawTravelRuleResponse.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : QuestionnaireResponse.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PasskeyStatus.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FaceVerification.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DecodeInvoiceResp[] newArray(int i) {
            return new DecodeInvoiceResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecodeInvoiceResp() {
        this(null, null, null, null, false, false, false, false, false, null, null, null, null, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawTravelRuleResponse component10() {
        return this.withdrawTravelRuleResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuestionnaireResponse component11() {
        return this.questionnaireResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyStatus component12() {
        return this.passkeyStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceVerification component13() {
        return this.faceVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.googleVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.need2FA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.needEmailCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.needTradePassword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.phoneVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DecodeInvoiceResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, WithdrawTravelRuleResponse withdrawTravelRuleResponse, QuestionnaireResponse questionnaireResponse, PasskeyStatus passkeyStatus, FaceVerification faceVerification) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new DecodeInvoiceResp(str, str2, str3, str4, z, z2, z3, z4, z5, withdrawTravelRuleResponse, questionnaireResponse, passkeyStatus, faceVerification);
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
        if (!(obj instanceof DecodeInvoiceResp)) {
            return false;
        }
        DecodeInvoiceResp decodeInvoiceResp = (DecodeInvoiceResp) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) decodeInvoiceResp.address) && Intrinsics.EZpvd((Object) this.amount, (Object) decodeInvoiceResp.amount) && Intrinsics.EZpvd((Object) this.desc, (Object) decodeInvoiceResp.desc) && Intrinsics.EZpvd((Object) this.fee, (Object) decodeInvoiceResp.fee) && this.googleVerification == decodeInvoiceResp.googleVerification && this.need2FA == decodeInvoiceResp.need2FA && this.needEmailCode == decodeInvoiceResp.needEmailCode && this.needTradePassword == decodeInvoiceResp.needTradePassword && this.phoneVerification == decodeInvoiceResp.phoneVerification && Intrinsics.EZpvd(this.withdrawTravelRuleResponse, decodeInvoiceResp.withdrawTravelRuleResponse) && Intrinsics.EZpvd(this.questionnaireResponse, decodeInvoiceResp.questionnaireResponse) && Intrinsics.EZpvd(this.passkeyStatus, decodeInvoiceResp.passkeyStatus) && Intrinsics.EZpvd(this.faceVerification, decodeInvoiceResp.faceVerification);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceVerification getFaceVerification() {
        return this.faceVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getGoogleVerification() {
        return this.googleVerification;
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
    public final WithdrawTravelRuleResponse getWithdrawTravelRuleResponse() {
        return this.withdrawTravelRuleResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        int iHashCode2 = this.amount.hashCode();
        int iHashCode3 = this.desc.hashCode();
        int iHashCode4 = this.fee.hashCode();
        int iHashCode5 = Boolean.hashCode(this.googleVerification);
        int iHashCode6 = Boolean.hashCode(this.need2FA);
        int iHashCode7 = Boolean.hashCode(this.needEmailCode);
        int iHashCode8 = Boolean.hashCode(this.needTradePassword);
        int iHashCode9 = Boolean.hashCode(this.phoneVerification);
        WithdrawTravelRuleResponse withdrawTravelRuleResponse = this.withdrawTravelRuleResponse;
        int iHashCode10 = withdrawTravelRuleResponse == null ? 0 : withdrawTravelRuleResponse.hashCode();
        QuestionnaireResponse questionnaireResponse = this.questionnaireResponse;
        int iHashCode11 = questionnaireResponse == null ? 0 : questionnaireResponse.hashCode();
        PasskeyStatus passkeyStatus = this.passkeyStatus;
        int iHashCode12 = passkeyStatus == null ? 0 : passkeyStatus.hashCode();
        FaceVerification faceVerification = this.faceVerification;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (faceVerification != null ? faceVerification.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DecodeInvoiceResp(address=" + this.address + ", amount=" + this.amount + ", desc=" + this.desc + ", fee=" + this.fee + ", googleVerification=" + this.googleVerification + ", need2FA=" + this.need2FA + ", needEmailCode=" + this.needEmailCode + ", needTradePassword=" + this.needTradePassword + ", phoneVerification=" + this.phoneVerification + ", withdrawTravelRuleResponse=" + this.withdrawTravelRuleResponse + ", questionnaireResponse=" + this.questionnaireResponse + ", passkeyStatus=" + this.passkeyStatus + ", faceVerification=" + this.faceVerification + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeString(this.amount);
        parcel.writeString(this.desc);
        parcel.writeString(this.fee);
        parcel.writeInt(this.googleVerification ? 1 : 0);
        parcel.writeInt(this.need2FA ? 1 : 0);
        parcel.writeInt(this.needEmailCode ? 1 : 0);
        parcel.writeInt(this.needTradePassword ? 1 : 0);
        parcel.writeInt(this.phoneVerification ? 1 : 0);
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
    }

    public DecodeInvoiceResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, WithdrawTravelRuleResponse withdrawTravelRuleResponse, QuestionnaireResponse questionnaireResponse, PasskeyStatus passkeyStatus, FaceVerification faceVerification) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.address = str;
        this.amount = str2;
        this.desc = str3;
        this.fee = str4;
        this.googleVerification = z;
        this.need2FA = z2;
        this.needEmailCode = z3;
        this.needTradePassword = z4;
        this.phoneVerification = z5;
        this.withdrawTravelRuleResponse = withdrawTravelRuleResponse;
        this.questionnaireResponse = questionnaireResponse;
        this.passkeyStatus = passkeyStatus;
        this.faceVerification = faceVerification;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0085: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0043: ARITH (r28v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r23v0 boolean) : false)
  (wrap:com.okinc.assets.backend.api.model.WithdrawTravelRuleResponse:?: TERNARY null = ((wrap:int:0x004a: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.WithdrawTravelRuleResponse) : (r24v0 com.okinc.assets.backend.api.model.WithdrawTravelRuleResponse))
  (wrap:com.okinc.assets.backend.api.model.QuestionnaireResponse:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.QuestionnaireResponse) : (r25v0 com.okinc.assets.backend.api.model.QuestionnaireResponse))
  (wrap:com.okinc.assets.backend.api.model.PasskeyStatus:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.PasskeyStatus) : (r26v0 com.okinc.assets.backend.api.model.PasskeyStatus))
  (wrap:com.okinc.assets.backend.api.model.FaceVerification:?: TERNARY null = ((wrap:int:0x0063: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 com.okinc.assets.backend.api.model.FaceVerification) : (null com.okinc.assets.backend.api.model.FaceVerification))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, com.okinc.assets.backend.api.model.WithdrawTravelRuleResponse, com.okinc.assets.backend.api.model.QuestionnaireResponse, com.okinc.assets.backend.api.model.PasskeyStatus, com.okinc.assets.backend.api.model.FaceVerification):void (m)] (LINE:67) call: com.okinc.assets.backend.api.model.DecodeInvoiceResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, com.okinc.assets.backend.api.model.WithdrawTravelRuleResponse, com.okinc.assets.backend.api.model.QuestionnaireResponse, com.okinc.assets.backend.api.model.PasskeyStatus, com.okinc.assets.backend.api.model.FaceVerification):void type: THIS */
    public /* synthetic */ DecodeInvoiceResp(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, WithdrawTravelRuleResponse withdrawTravelRuleResponse, QuestionnaireResponse questionnaireResponse, PasskeyStatus passkeyStatus, FaceVerification faceVerification, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) == 0 ? z5 : false, (i & 512) != 0 ? null : withdrawTravelRuleResponse, (i & 1024) != 0 ? null : questionnaireResponse, (i & 2048) != 0 ? null : passkeyStatus, (i & 4096) == 0 ? faceVerification : null);
    }
}
