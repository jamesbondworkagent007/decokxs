package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ClaimTransactionParams implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ClaimTransactionParams> CREATOR = new Creator();
    private final String chainIndex;
    private final ClaimApiErrorType claimApiErrorType;
    private final String orderId;
    private final String senderMessage;
    private final String senderName;
    private final String tokenAmountInfo;
    private final String uid;
    private final String usdValue;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ClaimTransactionParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClaimTransactionParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ClaimTransactionParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ClaimApiErrorType.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClaimTransactionParams[] newArray(int i) {
            return new ClaimTransactionParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.senderName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAmountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.senderMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.usdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClaimApiErrorType component8() {
        return this.claimApiErrorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClaimTransactionParams copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, ClaimApiErrorType claimApiErrorType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new ClaimTransactionParams(str, str2, str3, str4, str5, str6, str7, claimApiErrorType);
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
        if (!(obj instanceof ClaimTransactionParams)) {
            return false;
        }
        ClaimTransactionParams claimTransactionParams = (ClaimTransactionParams) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) claimTransactionParams.orderId) && Intrinsics.EZpvd((Object) this.senderName, (Object) claimTransactionParams.senderName) && Intrinsics.EZpvd((Object) this.tokenAmountInfo, (Object) claimTransactionParams.tokenAmountInfo) && Intrinsics.EZpvd((Object) this.senderMessage, (Object) claimTransactionParams.senderMessage) && Intrinsics.EZpvd((Object) this.usdValue, (Object) claimTransactionParams.usdValue) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) claimTransactionParams.chainIndex) && Intrinsics.EZpvd((Object) this.uid, (Object) claimTransactionParams.uid) && this.claimApiErrorType == claimTransactionParams.claimApiErrorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClaimApiErrorType getClaimApiErrorType() {
        return this.claimApiErrorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSenderMessage() {
        return this.senderMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSenderName() {
        return this.senderName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmountInfo() {
        return this.tokenAmountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUid() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdValue() {
        return this.usdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderId.hashCode();
        int iHashCode2 = this.senderName.hashCode();
        int iHashCode3 = this.tokenAmountInfo.hashCode();
        int iHashCode4 = this.senderMessage.hashCode();
        int iHashCode5 = this.usdValue.hashCode();
        int iHashCode6 = this.chainIndex.hashCode();
        int iHashCode7 = this.uid.hashCode();
        ClaimApiErrorType claimApiErrorType = this.claimApiErrorType;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (claimApiErrorType == null ? 0 : claimApiErrorType.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ClaimTransactionParams(orderId=" + this.orderId + ", senderName=" + this.senderName + ", tokenAmountInfo=" + this.tokenAmountInfo + ", senderMessage=" + this.senderMessage + ", usdValue=" + this.usdValue + ", chainIndex=" + this.chainIndex + ", uid=" + this.uid + ", claimApiErrorType=" + this.claimApiErrorType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.orderId);
        parcel.writeString(this.senderName);
        parcel.writeString(this.tokenAmountInfo);
        parcel.writeString(this.senderMessage);
        parcel.writeString(this.usdValue);
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.uid);
        ClaimApiErrorType claimApiErrorType = this.claimApiErrorType;
        if (claimApiErrorType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            claimApiErrorType.writeToParcel(parcel, i);
        }
    }

    public ClaimTransactionParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, ClaimApiErrorType claimApiErrorType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.orderId = str;
        this.senderName = str2;
        this.tokenAmountInfo = str3;
        this.senderMessage = str4;
        this.usdValue = str5;
        this.chainIndex = str6;
        this.uid = str7;
        this.claimApiErrorType = claimApiErrorType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (wrap:com.okinc.business.web3pay.api.model.ClaimApiErrorType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.api.model.ClaimApiErrorType) : (r18v0 com.okinc.business.web3pay.api.model.ClaimApiErrorType))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.web3pay.api.model.ClaimApiErrorType):void (m)] (LINE:9) call: com.okinc.business.web3pay.api.model.ClaimTransactionParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.web3pay.api.model.ClaimApiErrorType):void type: THIS */
    public /* synthetic */ ClaimTransactionParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, ClaimApiErrorType claimApiErrorType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, (i & 128) != 0 ? null : claimApiErrorType);
    }
}
