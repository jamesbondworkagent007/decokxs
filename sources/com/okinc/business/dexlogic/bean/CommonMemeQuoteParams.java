package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class CommonMemeQuoteParams implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CommonMemeQuoteParams> CREATOR = new Creator();
    private final String amount;
    private final String chainId;
    private final String fromTokenAddress;
    private final String maxSlippage;
    private final String slippage;
    private final int slippageType;
    private final String toTokenAddress;
    private final String userWalletAddress;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<CommonMemeQuoteParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonMemeQuoteParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CommonMemeQuoteParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonMemeQuoteParams[] newArray(int i) {
            return new CommonMemeQuoteParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonMemeQuoteParams copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, int i, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new CommonMemeQuoteParams(str, str2, str3, str4, str5, str6, i, str7);
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
        if (!(obj instanceof CommonMemeQuoteParams)) {
            return false;
        }
        CommonMemeQuoteParams commonMemeQuoteParams = (CommonMemeQuoteParams) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) commonMemeQuoteParams.chainId) && Intrinsics.EZpvd((Object) this.amount, (Object) commonMemeQuoteParams.amount) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) commonMemeQuoteParams.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) commonMemeQuoteParams.toTokenAddress) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) commonMemeQuoteParams.userWalletAddress) && Intrinsics.EZpvd((Object) this.slippage, (Object) commonMemeQuoteParams.slippage) && this.slippageType == commonMemeQuoteParams.slippageType && Intrinsics.EZpvd((Object) this.maxSlippage, (Object) commonMemeQuoteParams.maxSlippage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippage() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        int iHashCode2 = this.amount.hashCode();
        int iHashCode3 = this.fromTokenAddress.hashCode();
        int iHashCode4 = this.toTokenAddress.hashCode();
        int iHashCode5 = this.userWalletAddress.hashCode();
        String str = this.slippage;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = Integer.hashCode(this.slippageType);
        String str2 = this.maxSlippage;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommonMemeQuoteParams(chainId=" + this.chainId + ", amount=" + this.amount + ", fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", userWalletAddress=" + this.userWalletAddress + ", slippage=" + this.slippage + ", slippageType=" + this.slippageType + ", maxSlippage=" + this.maxSlippage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.amount);
        parcel.writeString(this.fromTokenAddress);
        parcel.writeString(this.toTokenAddress);
        parcel.writeString(this.userWalletAddress);
        parcel.writeString(this.slippage);
        parcel.writeInt(this.slippageType);
        parcel.writeString(this.maxSlippage);
    }

    public CommonMemeQuoteParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, int i, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chainId = str;
        this.amount = str2;
        this.fromTokenAddress = str3;
        this.toTokenAddress = str4;
        this.userWalletAddress = str5;
        this.slippage = str6;
        this.slippageType = i;
        this.maxSlippage = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (r19v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:16) call: com.okinc.business.dexlogic.bean.CommonMemeQuoteParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ CommonMemeQuoteParams(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i2 & 32) != 0 ? "" : str6, i, (i2 & 128) != 0 ? "" : str7);
    }
}
