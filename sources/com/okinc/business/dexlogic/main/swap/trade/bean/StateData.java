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
public final class StateData implements Parcelable {
    private String content;
    private String exploreUrl;
    private String fromTokenSymbol;
    private boolean hasSurplus;
    private boolean isSolanaPost;
    private int noticeState;
    private String orderId;
    private String status;
    private boolean success;
    private String surplusAmount;
    private String surplusValueUSD;
    private String toTokenSymbol;
    private String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StateData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<StateData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StateData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new StateData(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StateData[] newArray(int i) {
            return new StateData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StateData() {
        this(false, (String) null, (String) null, false, (String) null, (String) null, 0, false, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.surplusValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
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
    public final int component7() {
        return this.noticeState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.hasSurplus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.surplusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateData copy(boolean z, @NotNull String str, @NotNull String str2, boolean z2, @NotNull String str3, @NotNull String str4, int i, boolean z3, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new StateData(z, str, str2, z2, str3, str4, i, z3, str5, str6, str7, str8, str9);
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
        if (!(obj instanceof StateData)) {
            return false;
        }
        StateData stateData = (StateData) obj;
        return this.success == stateData.success && Intrinsics.EZpvd((Object) this.exploreUrl, (Object) stateData.exploreUrl) && Intrinsics.EZpvd((Object) this.content, (Object) stateData.content) && this.isSolanaPost == stateData.isSolanaPost && Intrinsics.EZpvd((Object) this.status, (Object) stateData.status) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) stateData.userWalletAddress) && this.noticeState == stateData.noticeState && this.hasSurplus == stateData.hasSurplus && Intrinsics.EZpvd((Object) this.surplusAmount, (Object) stateData.surplusAmount) && Intrinsics.EZpvd((Object) this.surplusValueUSD, (Object) stateData.surplusValueUSD) && Intrinsics.EZpvd((Object) this.orderId, (Object) stateData.orderId) && Intrinsics.EZpvd((Object) this.fromTokenSymbol, (Object) stateData.fromTokenSymbol) && Intrinsics.EZpvd((Object) this.toTokenSymbol, (Object) stateData.toTokenSymbol);
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
        return (((((((((((((((((((((((Boolean.hashCode(this.success) * 31) + this.exploreUrl.hashCode()) * 31) + this.content.hashCode()) * 31) + Boolean.hashCode(this.isSolanaPost)) * 31) + this.status.hashCode()) * 31) + this.userWalletAddress.hashCode()) * 31) + Integer.hashCode(this.noticeState)) * 31) + Boolean.hashCode(this.hasSurplus)) * 31) + this.surplusAmount.hashCode()) * 31) + this.surplusValueUSD.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.fromTokenSymbol.hashCode()) * 31) + this.toTokenSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOtherState() {
        return this.noticeState != -1000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSolanaPost() {
        return this.isSolanaPost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExploreUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.exploreUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromTokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasSurplus(boolean z) {
        this.hasSurplus = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNoticeState(int i) {
        this.noticeState = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSolanaPost(boolean z) {
        this.isSolanaPost = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuccess(boolean z) {
        this.success = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSurplusAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.surplusAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSurplusValueUSD(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.surplusValueUSD = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toTokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserWalletAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StateData(success=" + this.success + ", exploreUrl=" + this.exploreUrl + ", content=" + this.content + ", isSolanaPost=" + this.isSolanaPost + ", status=" + this.status + ", userWalletAddress=" + this.userWalletAddress + ", noticeState=" + this.noticeState + ", hasSurplus=" + this.hasSurplus + ", surplusAmount=" + this.surplusAmount + ", surplusValueUSD=" + this.surplusValueUSD + ", orderId=" + this.orderId + ", fromTokenSymbol=" + this.fromTokenSymbol + ", toTokenSymbol=" + this.toTokenSymbol + ")";
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.trade.bean.StateData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StateData> serializer() {
            return StateData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StateData(int i, boolean z, String str, String str2, boolean z2, String str3, String str4, int i2, boolean z3, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
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
        if ((i & 64) == 0) {
            this.noticeState = -1000;
        } else {
            this.noticeState = i2;
        }
        if ((i & 128) == 0) {
            this.hasSurplus = false;
        } else {
            this.hasSurplus = z3;
        }
        if ((i & 256) == 0) {
            this.surplusAmount = "";
        } else {
            this.surplusAmount = str5;
        }
        if ((i & 512) == 0) {
            this.surplusValueUSD = "";
        } else {
            this.surplusValueUSD = str6;
        }
        if ((i & 1024) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str7;
        }
        if ((i & 2048) == 0) {
            this.fromTokenSymbol = "";
        } else {
            this.fromTokenSymbol = str8;
        }
        if ((i & 4096) == 0) {
            this.toTokenSymbol = "";
        } else {
            this.toTokenSymbol = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(StateData stateData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !stateData.success) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, stateData.success);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) stateData.exploreUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, stateData.exploreUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) stateData.content, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, stateData.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || stateData.isSolanaPost) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, stateData.isSolanaPost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) stateData.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, stateData.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) stateData.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, stateData.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || stateData.noticeState != -1000) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, stateData.noticeState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || stateData.hasSurplus) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, stateData.hasSurplus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) stateData.surplusAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, stateData.surplusAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) stateData.surplusValueUSD, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, stateData.surplusValueUSD);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) stateData.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, stateData.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) stateData.fromTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, stateData.fromTokenSymbol);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd((Object) stateData.toTokenSymbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, stateData.toTokenSymbol);
    }

    public StateData(boolean z, @NotNull String str, @NotNull String str2, boolean z2, @NotNull String str3, @NotNull String str4, int i, boolean z3, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
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
        this.noticeState = i;
        this.hasSurplus = z3;
        this.surplusAmount = str5;
        this.surplusValueUSD = str6;
        this.orderId = str7;
        this.fromTokenSymbol = str8;
        this.toTokenSymbol = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0086: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r15v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0034: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (-1000 int) : (r21v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r28v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r22v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.business.dexlogic.main.swap.trade.bean.StateData.<init>(boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StateData(boolean z, String str, String str2, boolean z2, String str3, String str4, int i, boolean z3, String str5, String str6, String str7, String str8, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? -1000 : i, (i2 & 128) == 0 ? z3 : false, (i2 & 256) != 0 ? "" : str5, (i2 & 512) != 0 ? "" : str6, (i2 & 1024) != 0 ? "" : str7, (i2 & 2048) != 0 ? "" : str8, (i2 & 4096) == 0 ? str9 : "");
    }
}
