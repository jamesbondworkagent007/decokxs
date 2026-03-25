package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SignalBotSubsInfoBean implements Parcelable {
    public static final int $stable = 0;
    private final String annualizedRate;
    private final String ccy;
    private final String followerWinRate;
    private final boolean isSubscribed;
    private final String profitSharingRatio;
    private final String signalChanId;
    private final String signalChanName;
    private final String subscriptionFee;
    private final String subscriptionType;
    private final String totalFollowerAssets;
    private final String totalFollowerCount;
    private final String userSubscriptionType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SignalBotSubsInfoBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SignalBotSubsInfoBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotSubsInfoBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalBotSubsInfoBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotSubsInfoBean[] newArray(int i) {
            return new SignalBotSubsInfoBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalBotSubsInfoBean() {
        this((String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.annualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.totalFollowerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.totalFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.userSubscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.followerWinRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isSubscribed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.subscriptionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.subscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalBotSubsInfoBean copy(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        return new SignalBotSubsInfoBean(str, str2, str3, z, str4, str5, str6, str7, str8, str9, str10, str11);
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
        if (!(obj instanceof SignalBotSubsInfoBean)) {
            return false;
        }
        SignalBotSubsInfoBean signalBotSubsInfoBean = (SignalBotSubsInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.annualizedRate, (Object) signalBotSubsInfoBean.annualizedRate) && Intrinsics.EZpvd((Object) this.ccy, (Object) signalBotSubsInfoBean.ccy) && Intrinsics.EZpvd((Object) this.followerWinRate, (Object) signalBotSubsInfoBean.followerWinRate) && this.isSubscribed == signalBotSubsInfoBean.isSubscribed && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) signalBotSubsInfoBean.profitSharingRatio) && Intrinsics.EZpvd((Object) this.signalChanId, (Object) signalBotSubsInfoBean.signalChanId) && Intrinsics.EZpvd((Object) this.signalChanName, (Object) signalBotSubsInfoBean.signalChanName) && Intrinsics.EZpvd((Object) this.subscriptionFee, (Object) signalBotSubsInfoBean.subscriptionFee) && Intrinsics.EZpvd((Object) this.subscriptionType, (Object) signalBotSubsInfoBean.subscriptionType) && Intrinsics.EZpvd((Object) this.totalFollowerAssets, (Object) signalBotSubsInfoBean.totalFollowerAssets) && Intrinsics.EZpvd((Object) this.totalFollowerCount, (Object) signalBotSubsInfoBean.totalFollowerCount) && Intrinsics.EZpvd((Object) this.userSubscriptionType, (Object) signalBotSubsInfoBean.userSubscriptionType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnnualizedRate() {
        return this.annualizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowerWinRate() {
        return this.followerWinRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingRatio() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalChanId() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalChanName() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscriptionFee() {
        return this.subscriptionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscriptionType() {
        return this.subscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFollowerAssets() {
        return this.totalFollowerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFollowerCount() {
        return this.totalFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserSubscriptionType() {
        return this.userSubscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.annualizedRate;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ccy;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.followerWinRate;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = Boolean.hashCode(this.isSubscribed);
        String str4 = this.profitSharingRatio;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.signalChanId;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.signalChanName;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.subscriptionFee;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.subscriptionType;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.totalFollowerAssets;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.totalFollowerCount;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.userSubscriptionType;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSubscribed() {
        return this.isSubscribed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalBotSubsInfoBean(annualizedRate=" + this.annualizedRate + ", ccy=" + this.ccy + ", followerWinRate=" + this.followerWinRate + ", isSubscribed=" + this.isSubscribed + ", profitSharingRatio=" + this.profitSharingRatio + ", signalChanId=" + this.signalChanId + ", signalChanName=" + this.signalChanName + ", subscriptionFee=" + this.subscriptionFee + ", subscriptionType=" + this.subscriptionType + ", totalFollowerAssets=" + this.totalFollowerAssets + ", totalFollowerCount=" + this.totalFollowerCount + ", userSubscriptionType=" + this.userSubscriptionType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.annualizedRate);
        parcel.writeString(this.ccy);
        parcel.writeString(this.followerWinRate);
        parcel.writeInt(this.isSubscribed ? 1 : 0);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.signalChanId);
        parcel.writeString(this.signalChanName);
        parcel.writeString(this.subscriptionFee);
        parcel.writeString(this.subscriptionType);
        parcel.writeString(this.totalFollowerAssets);
        parcel.writeString(this.totalFollowerCount);
        parcel.writeString(this.userSubscriptionType);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SignalBotSubsInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalBotSubsInfoBean> serializer() {
            return SignalBotSubsInfoBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalBotSubsInfoBean(int i, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.annualizedRate = null;
        } else {
            this.annualizedRate = str;
        }
        if ((i & 2) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str2;
        }
        if ((i & 4) == 0) {
            this.followerWinRate = null;
        } else {
            this.followerWinRate = str3;
        }
        if ((i & 8) == 0) {
            this.isSubscribed = false;
        } else {
            this.isSubscribed = z;
        }
        if ((i & 16) == 0) {
            this.profitSharingRatio = null;
        } else {
            this.profitSharingRatio = str4;
        }
        if ((i & 32) == 0) {
            this.signalChanId = null;
        } else {
            this.signalChanId = str5;
        }
        if ((i & 64) == 0) {
            this.signalChanName = null;
        } else {
            this.signalChanName = str6;
        }
        if ((i & 128) == 0) {
            this.subscriptionFee = null;
        } else {
            this.subscriptionFee = str7;
        }
        if ((i & 256) == 0) {
            this.subscriptionType = null;
        } else {
            this.subscriptionType = str8;
        }
        if ((i & 512) == 0) {
            this.totalFollowerAssets = null;
        } else {
            this.totalFollowerAssets = str9;
        }
        if ((i & 1024) == 0) {
            this.totalFollowerCount = null;
        } else {
            this.totalFollowerCount = str10;
        }
        if ((i & 2048) == 0) {
            this.userSubscriptionType = null;
        } else {
            this.userSubscriptionType = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SignalBotSubsInfoBean signalBotSubsInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signalBotSubsInfoBean.annualizedRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, signalBotSubsInfoBean.annualizedRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signalBotSubsInfoBean.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, signalBotSubsInfoBean.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || signalBotSubsInfoBean.followerWinRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, signalBotSubsInfoBean.followerWinRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || signalBotSubsInfoBean.isSubscribed) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, signalBotSubsInfoBean.isSubscribed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || signalBotSubsInfoBean.profitSharingRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, signalBotSubsInfoBean.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || signalBotSubsInfoBean.signalChanId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, signalBotSubsInfoBean.signalChanId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || signalBotSubsInfoBean.signalChanName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, signalBotSubsInfoBean.signalChanName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || signalBotSubsInfoBean.subscriptionFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, signalBotSubsInfoBean.subscriptionFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || signalBotSubsInfoBean.subscriptionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, signalBotSubsInfoBean.subscriptionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || signalBotSubsInfoBean.totalFollowerAssets != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, signalBotSubsInfoBean.totalFollowerAssets);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || signalBotSubsInfoBean.totalFollowerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, signalBotSubsInfoBean.totalFollowerCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && signalBotSubsInfoBean.userSubscriptionType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, signalBotSubsInfoBean.userSubscriptionType);
    }

    public SignalBotSubsInfoBean(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.annualizedRate = str;
        this.ccy = str2;
        this.followerWinRate = str3;
        this.isSubscribed = z;
        this.profitSharingRatio = str4;
        this.signalChanId = str5;
        this.signalChanName = str6;
        this.subscriptionFee = str7;
        this.subscriptionType = str8;
        this.totalFollowerAssets = str9;
        this.totalFollowerCount = str10;
        this.userSubscriptionType = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4115) call: com.okinc.unify_trade.biz.SignalBotSubsInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignalBotSubsInfoBean(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) == 0 ? str11 : null);
    }
}
