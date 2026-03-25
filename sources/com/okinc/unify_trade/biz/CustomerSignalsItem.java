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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class CustomerSignalsItem implements Parcelable {
    public static final int $stable = 0;
    private final boolean autoRenewal;
    private final String avatar;
    private final String profitSharingRatio;
    private final String signalChanId;
    private final String signalChanName;
    private final String signalDescription;
    private final String subscriptionExpireTime;
    private final String subscriptionFee;
    private final String totalFollowerCount;
    private final String type;
    private final String userSubscriptionType;
    private final String username;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CustomerSignalsItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CustomerSignalsItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerSignalsItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CustomerSignalsItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerSignalsItem[] newArray(int i) {
            return new CustomerSignalsItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomerSignalsItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.signalDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.userSubscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.subscriptionExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.totalFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.subscriptionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.autoRenewal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomerSignalsItem copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11) {
        return new CustomerSignalsItem(str, str2, str3, str4, str5, str6, str7, str8, z, str9, str10, str11);
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
        if (!(obj instanceof CustomerSignalsItem)) {
            return false;
        }
        CustomerSignalsItem customerSignalsItem = (CustomerSignalsItem) obj;
        return Intrinsics.EZpvd((Object) this.signalChanId, (Object) customerSignalsItem.signalChanId) && Intrinsics.EZpvd((Object) this.signalChanName, (Object) customerSignalsItem.signalChanName) && Intrinsics.EZpvd((Object) this.signalDescription, (Object) customerSignalsItem.signalDescription) && Intrinsics.EZpvd((Object) this.userSubscriptionType, (Object) customerSignalsItem.userSubscriptionType) && Intrinsics.EZpvd((Object) this.subscriptionExpireTime, (Object) customerSignalsItem.subscriptionExpireTime) && Intrinsics.EZpvd((Object) this.totalFollowerCount, (Object) customerSignalsItem.totalFollowerCount) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) customerSignalsItem.profitSharingRatio) && Intrinsics.EZpvd((Object) this.subscriptionFee, (Object) customerSignalsItem.subscriptionFee) && this.autoRenewal == customerSignalsItem.autoRenewal && Intrinsics.EZpvd((Object) this.type, (Object) customerSignalsItem.type) && Intrinsics.EZpvd((Object) this.username, (Object) customerSignalsItem.username) && Intrinsics.EZpvd((Object) this.avatar, (Object) customerSignalsItem.avatar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
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
    public final String getSignalDescription() {
        return this.signalDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscriptionExpireTime() {
        return this.subscriptionExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscriptionFee() {
        return this.subscriptionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFollowerCount() {
        return this.totalFollowerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserSubscriptionType() {
        return this.userSubscriptionType;
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
        String str3 = this.signalDescription;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.userSubscriptionType;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.subscriptionExpireTime;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.totalFollowerCount;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.profitSharingRatio;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.subscriptionFee;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        int iHashCode9 = Boolean.hashCode(this.autoRenewal);
        String str9 = this.type;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.username;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.avatar;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CustomerSignalsItem(signalChanId=" + this.signalChanId + ", signalChanName=" + this.signalChanName + ", signalDescription=" + this.signalDescription + ", userSubscriptionType=" + this.userSubscriptionType + ", subscriptionExpireTime=" + this.subscriptionExpireTime + ", totalFollowerCount=" + this.totalFollowerCount + ", profitSharingRatio=" + this.profitSharingRatio + ", subscriptionFee=" + this.subscriptionFee + ", autoRenewal=" + this.autoRenewal + ", type=" + this.type + ", username=" + this.username + ", avatar=" + this.avatar + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.signalChanId);
        parcel.writeString(this.signalChanName);
        parcel.writeString(this.signalDescription);
        parcel.writeString(this.userSubscriptionType);
        parcel.writeString(this.subscriptionExpireTime);
        parcel.writeString(this.totalFollowerCount);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.subscriptionFee);
        parcel.writeInt(this.autoRenewal ? 1 : 0);
        parcel.writeString(this.type);
        parcel.writeString(this.username);
        parcel.writeString(this.avatar);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.CustomerSignalsItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CustomerSignalsItem> serializer() {
            return CustomerSignalsItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CustomerSignalsItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.signalDescription = null;
        } else {
            this.signalDescription = str3;
        }
        if ((i & 8) == 0) {
            this.userSubscriptionType = null;
        } else {
            this.userSubscriptionType = str4;
        }
        if ((i & 16) == 0) {
            this.subscriptionExpireTime = null;
        } else {
            this.subscriptionExpireTime = str5;
        }
        if ((i & 32) == 0) {
            this.totalFollowerCount = null;
        } else {
            this.totalFollowerCount = str6;
        }
        if ((i & 64) == 0) {
            this.profitSharingRatio = null;
        } else {
            this.profitSharingRatio = str7;
        }
        if ((i & 128) == 0) {
            this.subscriptionFee = null;
        } else {
            this.subscriptionFee = str8;
        }
        if ((i & 256) == 0) {
            this.autoRenewal = true;
        } else {
            this.autoRenewal = z;
        }
        if ((i & 512) == 0) {
            this.type = null;
        } else {
            this.type = str9;
        }
        if ((i & 1024) == 0) {
            this.username = null;
        } else {
            this.username = str10;
        }
        if ((i & 2048) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(CustomerSignalsItem customerSignalsItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || customerSignalsItem.signalChanId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, customerSignalsItem.signalChanId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || customerSignalsItem.signalChanName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, customerSignalsItem.signalChanName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || customerSignalsItem.signalDescription != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, customerSignalsItem.signalDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || customerSignalsItem.userSubscriptionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, customerSignalsItem.userSubscriptionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || customerSignalsItem.subscriptionExpireTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, customerSignalsItem.subscriptionExpireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || customerSignalsItem.totalFollowerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, customerSignalsItem.totalFollowerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || customerSignalsItem.profitSharingRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, customerSignalsItem.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || customerSignalsItem.subscriptionFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, customerSignalsItem.subscriptionFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !customerSignalsItem.autoRenewal) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, customerSignalsItem.autoRenewal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || customerSignalsItem.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, customerSignalsItem.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || customerSignalsItem.username != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, customerSignalsItem.username);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && customerSignalsItem.avatar == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, customerSignalsItem.avatar);
    }

    public CustomerSignalsItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11) {
        this.signalChanId = str;
        this.signalChanName = str2;
        this.signalDescription = str3;
        this.userSubscriptionType = str4;
        this.subscriptionExpireTime = str5;
        this.totalFollowerCount = str6;
        this.profitSharingRatio = str7;
        this.subscriptionFee = str8;
        this.autoRenewal = z;
        this.type = str9;
        this.username = str10;
        this.avatar = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0041: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r22v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4012) call: com.okinc.unify_trade.biz.CustomerSignalsItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CustomerSignalsItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? true : z, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) == 0 ? str11 : null);
    }
}
