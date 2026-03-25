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
public final class SignalListItem implements Parcelable {
    private String avatar;
    private boolean canEdit;
    private String count;
    private String instIds;
    private String profitSharingRatio;
    private final String signalChanId;
    private String signalChanName;
    private String signalDescription;
    private final String signalSourceType;
    private String subscriptionFee;
    private String subscriptionType;
    private String tickType;
    private String type;
    private String userSubscriptionType;
    private String username;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignalListItem> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SignalListItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalListItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalListItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalListItem[] newArray(int i) {
            return new SignalListItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalListItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signalSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.userSubscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tickType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.canEdit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.signalChanName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.signalDescription;
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
    public final SignalListItem copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z) {
        return new SignalListItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, z);
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
        if (!(obj instanceof SignalListItem)) {
            return false;
        }
        SignalListItem signalListItem = (SignalListItem) obj;
        return Intrinsics.EZpvd((Object) this.signalSourceType, (Object) signalListItem.signalSourceType) && Intrinsics.EZpvd((Object) this.signalChanId, (Object) signalListItem.signalChanId) && Intrinsics.EZpvd((Object) this.signalChanName, (Object) signalListItem.signalChanName) && Intrinsics.EZpvd((Object) this.signalDescription, (Object) signalListItem.signalDescription) && Intrinsics.EZpvd((Object) this.subscriptionType, (Object) signalListItem.subscriptionType) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) signalListItem.profitSharingRatio) && Intrinsics.EZpvd((Object) this.subscriptionFee, (Object) signalListItem.subscriptionFee) && Intrinsics.EZpvd((Object) this.username, (Object) signalListItem.username) && Intrinsics.EZpvd((Object) this.avatar, (Object) signalListItem.avatar) && Intrinsics.EZpvd((Object) this.type, (Object) signalListItem.type) && Intrinsics.EZpvd((Object) this.userSubscriptionType, (Object) signalListItem.userSubscriptionType) && Intrinsics.EZpvd((Object) this.instIds, (Object) signalListItem.instIds) && Intrinsics.EZpvd((Object) this.tickType, (Object) signalListItem.tickType) && Intrinsics.EZpvd((Object) this.count, (Object) signalListItem.count) && this.canEdit == signalListItem.canEdit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanEdit() {
        return this.canEdit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCount() {
        return this.count;
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
    public final String getSignalDescription() {
        return this.signalDescription;
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
        String str = this.signalSourceType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.signalChanId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.signalChanName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.signalDescription;
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
        String str10 = this.type;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.userSubscriptionType;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.instIds;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.tickType;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.count;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str14 != null ? str14.hashCode() : 0)) * 31) + Boolean.hashCode(this.canEdit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvatar(String str) {
        this.avatar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanEdit(boolean z) {
        this.canEdit = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCount(String str) {
        this.count = str;
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
    public final void setSignalChanName(String str) {
        this.signalChanName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalDescription(String str) {
        this.signalDescription = str;
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
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserSubscriptionType(String str) {
        this.userSubscriptionType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsername(String str) {
        this.username = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalListItem(signalSourceType=" + this.signalSourceType + ", signalChanId=" + this.signalChanId + ", signalChanName=" + this.signalChanName + ", signalDescription=" + this.signalDescription + ", subscriptionType=" + this.subscriptionType + ", profitSharingRatio=" + this.profitSharingRatio + ", subscriptionFee=" + this.subscriptionFee + ", username=" + this.username + ", avatar=" + this.avatar + ", type=" + this.type + ", userSubscriptionType=" + this.userSubscriptionType + ", instIds=" + this.instIds + ", tickType=" + this.tickType + ", count=" + this.count + ", canEdit=" + this.canEdit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.signalSourceType);
        parcel.writeString(this.signalChanId);
        parcel.writeString(this.signalChanName);
        parcel.writeString(this.signalDescription);
        parcel.writeString(this.subscriptionType);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.subscriptionFee);
        parcel.writeString(this.username);
        parcel.writeString(this.avatar);
        parcel.writeString(this.type);
        parcel.writeString(this.userSubscriptionType);
        parcel.writeString(this.instIds);
        parcel.writeString(this.tickType);
        parcel.writeString(this.count);
        parcel.writeInt(this.canEdit ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SignalListItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalListItem> serializer() {
            return SignalListItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalListItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.signalSourceType = null;
        } else {
            this.signalSourceType = str;
        }
        if ((i & 2) == 0) {
            this.signalChanId = null;
        } else {
            this.signalChanId = str2;
        }
        if ((i & 4) == 0) {
            this.signalChanName = null;
        } else {
            this.signalChanName = str3;
        }
        if ((i & 8) == 0) {
            this.signalDescription = null;
        } else {
            this.signalDescription = str4;
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
            this.type = null;
        } else {
            this.type = str10;
        }
        if ((i & 1024) == 0) {
            this.userSubscriptionType = null;
        } else {
            this.userSubscriptionType = str11;
        }
        if ((i & 2048) == 0) {
            this.instIds = null;
        } else {
            this.instIds = str12;
        }
        if ((i & 4096) == 0) {
            this.tickType = null;
        } else {
            this.tickType = str13;
        }
        if ((i & 8192) == 0) {
            this.count = null;
        } else {
            this.count = str14;
        }
        this.canEdit = (i & 16384) == 0 ? false : z;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SignalListItem signalListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signalListItem.signalSourceType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, signalListItem.signalSourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signalListItem.signalChanId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, signalListItem.signalChanId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || signalListItem.signalChanName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, signalListItem.signalChanName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || signalListItem.signalDescription != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, signalListItem.signalDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || signalListItem.subscriptionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, signalListItem.subscriptionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || signalListItem.profitSharingRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, signalListItem.profitSharingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || signalListItem.subscriptionFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, signalListItem.subscriptionFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || signalListItem.username != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, signalListItem.username);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || signalListItem.avatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, signalListItem.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || signalListItem.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, signalListItem.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || signalListItem.userSubscriptionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, signalListItem.userSubscriptionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || signalListItem.instIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, signalListItem.instIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || signalListItem.tickType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, signalListItem.tickType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || signalListItem.count != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, signalListItem.count);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || signalListItem.canEdit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 14, signalListItem.canEdit);
        }
    }

    public SignalListItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z) {
        this.signalSourceType = str;
        this.signalChanId = str2;
        this.signalChanName = str3;
        this.signalDescription = str4;
        this.subscriptionType = str5;
        this.profitSharingRatio = str6;
        this.subscriptionFee = str7;
        this.username = str8;
        this.avatar = str9;
        this.type = str10;
        this.userSubscriptionType = str11;
        this.instIds = str12;
        this.tickType = str13;
        this.count = str14;
        this.canEdit = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (null java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0072: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:3897) call: com.okinc.unify_trade.biz.SignalListItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ SignalListItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) == 0 ? str14 : null, (i & 16384) != 0 ? false : z);
    }
}
