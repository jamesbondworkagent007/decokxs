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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class ThirdSignalDetail implements Parcelable {
    private String avatar;
    private String instIds;
    private String profitSharingRatio;
    private String signalChanId;
    private String signalChanName;
    private String signalSourceType;
    private String subscriptionFee;
    private String subscriptionType;
    private String tickType;
    private String tipLever;
    private String tipMinInvest;
    private String type;
    private String username;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ThirdSignalDetail> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ThirdSignalDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ThirdSignalDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ThirdSignalDetail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ThirdSignalDetail[] newArray(int i) {
            return new ThirdSignalDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ThirdSignalDetail() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tickType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tipLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tipMinInvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.signalSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.subscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.subscriptionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ThirdSignalDetail copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        return new ThirdSignalDetail(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
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
        if (!(obj instanceof ThirdSignalDetail)) {
            return false;
        }
        ThirdSignalDetail thirdSignalDetail = (ThirdSignalDetail) obj;
        return Intrinsics.EZpvd((Object) this.signalChanId, (Object) thirdSignalDetail.signalChanId) && Intrinsics.EZpvd((Object) this.signalChanName, (Object) thirdSignalDetail.signalChanName) && Intrinsics.EZpvd((Object) this.signalSourceType, (Object) thirdSignalDetail.signalSourceType) && Intrinsics.EZpvd((Object) this.type, (Object) thirdSignalDetail.type) && Intrinsics.EZpvd((Object) this.subscriptionType, (Object) thirdSignalDetail.subscriptionType) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) thirdSignalDetail.profitSharingRatio) && Intrinsics.EZpvd((Object) this.subscriptionFee, (Object) thirdSignalDetail.subscriptionFee) && Intrinsics.EZpvd((Object) this.username, (Object) thirdSignalDetail.username) && Intrinsics.EZpvd((Object) this.avatar, (Object) thirdSignalDetail.avatar) && Intrinsics.EZpvd((Object) this.tickType, (Object) thirdSignalDetail.tickType) && Intrinsics.EZpvd((Object) this.instIds, (Object) thirdSignalDetail.instIds) && Intrinsics.EZpvd((Object) this.tipLever, (Object) thirdSignalDetail.tipLever) && Intrinsics.EZpvd((Object) this.tipMinInvest, (Object) thirdSignalDetail.tipMinInvest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstIds() {
        return this.instIds;
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
    public final String getSignalSourceType() {
        return this.signalSourceType;
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
    public final String getTickType() {
        return this.tickType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTipLever() {
        return this.tipLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTipMinInvest() {
        return this.tipMinInvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsername() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.signalChanId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.signalChanName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.signalSourceType;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.type;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.subscriptionType;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.profitSharingRatio;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.subscriptionFee;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.username;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.avatar;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.tickType;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.instIds;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.tipLever;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.tipMinInvest;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str13 != null ? str13.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvatar(String str) {
        this.avatar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstIds(String str) {
        this.instIds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingRatio(String str) {
        this.profitSharingRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalChanId(String str) {
        this.signalChanId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalChanName(String str) {
        this.signalChanName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalSourceType(String str) {
        this.signalSourceType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubscriptionFee(String str) {
        this.subscriptionFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubscriptionType(String str) {
        this.subscriptionType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTickType(String str) {
        this.tickType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTipLever(String str) {
        this.tipLever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTipMinInvest(String str) {
        this.tipMinInvest = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsername(String str) {
        this.username = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ThirdSignalDetail(signalChanId=" + this.signalChanId + ", signalChanName=" + this.signalChanName + ", signalSourceType=" + this.signalSourceType + ", type=" + this.type + ", subscriptionType=" + this.subscriptionType + ", profitSharingRatio=" + this.profitSharingRatio + ", subscriptionFee=" + this.subscriptionFee + ", username=" + this.username + ", avatar=" + this.avatar + ", tickType=" + this.tickType + ", instIds=" + this.instIds + ", tipLever=" + this.tipLever + ", tipMinInvest=" + this.tipMinInvest + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.signalChanId);
        parcel.writeString(this.signalChanName);
        parcel.writeString(this.signalSourceType);
        parcel.writeString(this.type);
        parcel.writeString(this.subscriptionType);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.subscriptionFee);
        parcel.writeString(this.username);
        parcel.writeString(this.avatar);
        parcel.writeString(this.tickType);
        parcel.writeString(this.instIds);
        parcel.writeString(this.tipLever);
        parcel.writeString(this.tipMinInvest);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ThirdSignalDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ThirdSignalDetail> serializer() {
            return ThirdSignalDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ThirdSignalDetail(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.signalChanId = null;
        } else {
            this.signalChanId = str;
        }
        if ((i & 2) == 0) {
            this.signalChanName = null;
        } else {
            this.signalChanName = str2;
        }
        if ((i & 4) == 0) {
            this.signalSourceType = null;
        } else {
            this.signalSourceType = str3;
        }
        if ((i & 8) == 0) {
            this.type = null;
        } else {
            this.type = str4;
        }
        if ((i & 16) == 0) {
            this.subscriptionType = null;
        } else {
            this.subscriptionType = str5;
        }
        if ((i & 32) == 0) {
            this.profitSharingRatio = null;
        } else {
            this.profitSharingRatio = str6;
        }
        if ((i & 64) == 0) {
            this.subscriptionFee = null;
        } else {
            this.subscriptionFee = str7;
        }
        if ((i & 128) == 0) {
            this.username = null;
        } else {
            this.username = str8;
        }
        if ((i & 256) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str9;
        }
        if ((i & 512) == 0) {
            this.tickType = null;
        } else {
            this.tickType = str10;
        }
        if ((i & 1024) == 0) {
            this.instIds = null;
        } else {
            this.instIds = str11;
        }
        if ((i & 2048) == 0) {
            this.tipLever = null;
        } else {
            this.tipLever = str12;
        }
        if ((i & 4096) == 0) {
            this.tipMinInvest = null;
        } else {
            this.tipMinInvest = str13;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ThirdSignalDetail thirdSignalDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || thirdSignalDetail.signalChanId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, thirdSignalDetail.signalChanId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || thirdSignalDetail.signalChanName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, thirdSignalDetail.signalChanName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || thirdSignalDetail.signalSourceType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, thirdSignalDetail.signalSourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || thirdSignalDetail.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, thirdSignalDetail.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || thirdSignalDetail.subscriptionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, thirdSignalDetail.subscriptionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || thirdSignalDetail.profitSharingRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, thirdSignalDetail.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || thirdSignalDetail.subscriptionFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, thirdSignalDetail.subscriptionFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || thirdSignalDetail.username != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, thirdSignalDetail.username);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || thirdSignalDetail.avatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, thirdSignalDetail.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || thirdSignalDetail.tickType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, thirdSignalDetail.tickType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || thirdSignalDetail.instIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, thirdSignalDetail.instIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || thirdSignalDetail.tipLever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, thirdSignalDetail.tipLever);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && thirdSignalDetail.tipMinInvest == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, thirdSignalDetail.tipMinInvest);
    }

    public ThirdSignalDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.signalChanId = str;
        this.signalChanName = str2;
        this.signalSourceType = str3;
        this.type = str4;
        this.subscriptionType = str5;
        this.profitSharingRatio = str6;
        this.subscriptionFee = str7;
        this.username = str8;
        this.avatar = str9;
        this.tickType = str10;
        this.instIds = str11;
        this.tipLever = str12;
        this.tipMinInvest = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0084: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3942) call: com.okinc.unify_trade.biz.ThirdSignalDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ThirdSignalDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) == 0 ? str13 : null);
    }
}
