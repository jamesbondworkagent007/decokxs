package com.okinc.business.dexlogic.main.swap.trade.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class MemeStateData implements Parcelable {
    private final String content;
    private final String exploreUrl;
    private final String fromTokenSymbol;
    private final boolean hasSurplus;
    private final boolean isSolanaPost;
    private final RetryMemeParams memeRetry;
    private final int noticeState;
    private final String orderId;
    private final String status;
    private final boolean success;
    private final String surplusAmount;
    private final String surplusValueUSD;
    private final String toTokenSymbol;
    private final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MemeStateData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<MemeStateData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeStateData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MemeStateData(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RetryMemeParams.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeStateData[] newArray(int i) {
            return new MemeStateData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeStateData() {
        this(false, (String) null, (String) null, false, (String) null, (String) null, (RetryMemeParams) null, 0, false, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.surplusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.surplusValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isSolanaPost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RetryMemeParams component7() {
        return this.memeRetry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.noticeState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.hasSurplus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeStateData copy(boolean z, @NotNull String str, @NotNull String str2, boolean z2, @NotNull String str3, @NotNull String str4, RetryMemeParams retryMemeParams, int i, boolean z3, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new MemeStateData(z, str, str2, z2, str3, str4, retryMemeParams, i, z3, str5, str6, str7, str8, str9);
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
        if (!(obj instanceof MemeStateData)) {
            return false;
        }
        MemeStateData memeStateData = (MemeStateData) obj;
        return this.success == memeStateData.success && Intrinsics.EZpvd((Object) this.exploreUrl, (Object) memeStateData.exploreUrl) && Intrinsics.EZpvd((Object) this.content, (Object) memeStateData.content) && this.isSolanaPost == memeStateData.isSolanaPost && Intrinsics.EZpvd((Object) this.status, (Object) memeStateData.status) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) memeStateData.userWalletAddress) && Intrinsics.EZpvd(this.memeRetry, memeStateData.memeRetry) && this.noticeState == memeStateData.noticeState && this.hasSurplus == memeStateData.hasSurplus && Intrinsics.EZpvd((Object) this.surplusAmount, (Object) memeStateData.surplusAmount) && Intrinsics.EZpvd((Object) this.surplusValueUSD, (Object) memeStateData.surplusValueUSD) && Intrinsics.EZpvd((Object) this.orderId, (Object) memeStateData.orderId) && Intrinsics.EZpvd((Object) this.fromTokenSymbol, (Object) memeStateData.fromTokenSymbol) && Intrinsics.EZpvd((Object) this.toTokenSymbol, (Object) memeStateData.toTokenSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExploreUrl() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenSymbol() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasSurplus() {
        return this.hasSurplus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RetryMemeParams getMemeRetry() {
        return this.memeRetry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNoticeState() {
        return this.noticeState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSurplusAmount() {
        return this.surplusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSurplusValueUSD() {
        return this.surplusValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenSymbol() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success);
        int iHashCode2 = this.exploreUrl.hashCode();
        int iHashCode3 = this.content.hashCode();
        int iHashCode4 = Boolean.hashCode(this.isSolanaPost);
        int iHashCode5 = this.status.hashCode();
        int iHashCode6 = this.userWalletAddress.hashCode();
        RetryMemeParams retryMemeParams = this.memeRetry;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (retryMemeParams == null ? 0 : retryMemeParams.hashCode())) * 31) + Integer.hashCode(this.noticeState)) * 31) + Boolean.hashCode(this.hasSurplus)) * 31) + this.surplusAmount.hashCode()) * 31) + this.surplusValueUSD.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.fromTokenSymbol.hashCode()) * 31) + this.toTokenSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSolanaPost() {
        return this.isSolanaPost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeStateData(success=" + this.success + ", exploreUrl=" + this.exploreUrl + ", content=" + this.content + ", isSolanaPost=" + this.isSolanaPost + ", status=" + this.status + ", userWalletAddress=" + this.userWalletAddress + ", memeRetry=" + this.memeRetry + ", noticeState=" + this.noticeState + ", hasSurplus=" + this.hasSurplus + ", surplusAmount=" + this.surplusAmount + ", surplusValueUSD=" + this.surplusValueUSD + ", orderId=" + this.orderId + ", fromTokenSymbol=" + this.fromTokenSymbol + ", toTokenSymbol=" + this.toTokenSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.success ? 1 : 0);
        parcel.writeString(this.exploreUrl);
        parcel.writeString(this.content);
        parcel.writeInt(this.isSolanaPost ? 1 : 0);
        parcel.writeString(this.status);
        parcel.writeString(this.userWalletAddress);
        RetryMemeParams retryMemeParams = this.memeRetry;
        if (retryMemeParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            retryMemeParams.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.noticeState);
        parcel.writeInt(this.hasSurplus ? 1 : 0);
        parcel.writeString(this.surplusAmount);
        parcel.writeString(this.surplusValueUSD);
        parcel.writeString(this.orderId);
        parcel.writeString(this.fromTokenSymbol);
        parcel.writeString(this.toTokenSymbol);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.trade.bean.MemeStateData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MemeStateData> serializer() {
            return MemeStateData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MemeStateData(int i, boolean z, String str, String str2, boolean z2, String str3, String str4, RetryMemeParams retryMemeParams, int i2, boolean z3, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        this.success = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.exploreUrl = "";
        } else {
            this.exploreUrl = str;
        }
        if ((i & 4) == 0) {
            this.content = "";
        } else {
            this.content = str2;
        }
        if ((i & 8) == 0) {
            this.isSolanaPost = false;
        } else {
            this.isSolanaPost = z2;
        }
        if ((i & 16) == 0) {
            this.status = "";
        } else {
            this.status = str3;
        }
        if ((i & 32) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str4;
        }
        this.memeRetry = (i & 64) == 0 ? null : retryMemeParams;
        this.noticeState = (i & 128) == 0 ? -1000 : i2;
        if ((i & 256) == 0) {
            this.hasSurplus = false;
        } else {
            this.hasSurplus = z3;
        }
        if ((i & 512) == 0) {
            this.surplusAmount = "";
        } else {
            this.surplusAmount = str5;
        }
        if ((i & 1024) == 0) {
            this.surplusValueUSD = "";
        } else {
            this.surplusValueUSD = str6;
        }
        if ((i & 2048) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str7;
        }
        if ((i & 4096) == 0) {
            this.fromTokenSymbol = "";
        } else {
            this.fromTokenSymbol = str8;
        }
        if ((i & 8192) == 0) {
            this.toTokenSymbol = "";
        } else {
            this.toTokenSymbol = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MemeStateData memeStateData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !memeStateData.success) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, memeStateData.success);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) memeStateData.exploreUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, memeStateData.exploreUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) memeStateData.content, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, memeStateData.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || memeStateData.isSolanaPost) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, memeStateData.isSolanaPost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) memeStateData.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, memeStateData.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) memeStateData.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, memeStateData.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || memeStateData.memeRetry != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, RetryMemeParams$$serializer.INSTANCE, memeStateData.memeRetry);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || memeStateData.noticeState != -1000) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, memeStateData.noticeState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || memeStateData.hasSurplus) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, memeStateData.hasSurplus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) memeStateData.surplusAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, memeStateData.surplusAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) memeStateData.surplusValueUSD, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, memeStateData.surplusValueUSD);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) memeStateData.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, memeStateData.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) memeStateData.fromTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, memeStateData.fromTokenSymbol);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) memeStateData.toTokenSymbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, memeStateData.toTokenSymbol);
    }

    public MemeStateData(boolean z, @NotNull String str, @NotNull String str2, boolean z2, @NotNull String str3, @NotNull String str4, RetryMemeParams retryMemeParams, int i, boolean z3, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.success = z;
        this.exploreUrl = str;
        this.content = str2;
        this.isSolanaPost = z2;
        this.status = str3;
        this.userWalletAddress = str4;
        this.memeRetry = retryMemeParams;
        this.noticeState = i;
        this.hasSurplus = z3;
        this.surplusAmount = str5;
        this.surplusValueUSD = str6;
        this.orderId = str7;
        this.fromTokenSymbol = str8;
        this.toTokenSymbol = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0092: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.main.swap.trade.bean.RetryMemeParams:?: TERNARY null = ((wrap:int:0x0035: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.main.swap.trade.bean.RetryMemeParams) : (r22v0 com.okinc.business.dexlogic.main.swap.trade.bean.RetryMemeParams))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003d: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (-1000 int) : (r23v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (r30v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r24v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
 A[MD:(boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.business.dexlogic.main.swap.trade.bean.RetryMemeParams, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:54) call: com.okinc.business.dexlogic.main.swap.trade.bean.MemeStateData.<init>(boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.business.dexlogic.main.swap.trade.bean.RetryMemeParams, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MemeStateData(boolean z, String str, String str2, boolean z2, String str3, String str4, RetryMemeParams retryMemeParams, int i, boolean z3, String str5, String str6, String str7, String str8, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? null : retryMemeParams, (i2 & 128) != 0 ? -1000 : i, (i2 & 256) == 0 ? z3 : false, (i2 & 512) != 0 ? "" : str5, (i2 & 1024) != 0 ? "" : str6, (i2 & 2048) != 0 ? "" : str7, (i2 & 4096) != 0 ? "" : str8, (i2 & 8192) == 0 ? str9 : "");
    }
}
