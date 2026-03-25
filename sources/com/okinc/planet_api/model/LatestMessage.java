package com.okinc.planet_api.model;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class LatestMessage implements Parcelable {
    private final int eventSourceType;
    private final int eventSubType;
    private final String eventTime;
    private String localizedTitle;
    private final String msgId;
    private final String senderNickname;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LatestMessage> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LatestMessage> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LatestMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LatestMessage(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LatestMessage[] newArray(int i) {
            return new LatestMessage[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LatestMessage() {
        this((String) null, 0, 0, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LatestMessage copy$default(LatestMessage latestMessage, String str, int i, int i2, String str2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = latestMessage.senderNickname;
        }
        if ((i3 & 2) != 0) {
            i = latestMessage.eventSourceType;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = latestMessage.eventSubType;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str2 = latestMessage.eventTime;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = latestMessage.msgId;
        }
        String str6 = str3;
        if ((i3 & 32) != 0) {
            str4 = latestMessage.localizedTitle;
        }
        return latestMessage.copy(str, i4, i5, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.senderNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.eventSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.eventSubType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.msgId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.localizedTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LatestMessage copy(String str, int i, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new LatestMessage(str, i, i2, str2, str3, str4);
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
        if (!(obj instanceof LatestMessage)) {
            return false;
        }
        LatestMessage latestMessage = (LatestMessage) obj;
        return Intrinsics.EZpvd((Object) this.senderNickname, (Object) latestMessage.senderNickname) && this.eventSourceType == latestMessage.eventSourceType && this.eventSubType == latestMessage.eventSubType && Intrinsics.EZpvd((Object) this.eventTime, (Object) latestMessage.eventTime) && Intrinsics.EZpvd((Object) this.msgId, (Object) latestMessage.msgId) && Intrinsics.EZpvd((Object) this.localizedTitle, (Object) latestMessage.localizedTitle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getEventSourceType() {
        return this.eventSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getEventSubType() {
        return this.eventSubType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventTime() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalizedTitle() {
        return this.localizedTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsgId() {
        return this.msgId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSenderNickname() {
        return this.senderNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.senderNickname;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.eventSourceType)) * 31) + Integer.hashCode(this.eventSubType)) * 31) + this.eventTime.hashCode()) * 31) + this.msgId.hashCode()) * 31) + this.localizedTitle.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalizedTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.localizedTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LatestMessage(senderNickname=" + this.senderNickname + ", eventSourceType=" + this.eventSourceType + ", eventSubType=" + this.eventSubType + ", eventTime=" + this.eventTime + ", msgId=" + this.msgId + ", localizedTitle=" + this.localizedTitle + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.senderNickname);
        parcel.writeInt(this.eventSourceType);
        parcel.writeInt(this.eventSubType);
        parcel.writeString(this.eventTime);
        parcel.writeString(this.msgId);
        parcel.writeString(this.localizedTitle);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.model.LatestMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LatestMessage> serializer() {
            return LatestMessage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LatestMessage(int i, String str, int i2, int i3, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.senderNickname = "";
        } else {
            this.senderNickname = str;
        }
        if ((i & 2) == 0) {
            this.eventSourceType = 0;
        } else {
            this.eventSourceType = i2;
        }
        if ((i & 4) == 0) {
            this.eventSubType = 0;
        } else {
            this.eventSubType = i3;
        }
        if ((i & 8) == 0) {
            this.eventTime = "";
        } else {
            this.eventTime = str2;
        }
        if ((i & 16) == 0) {
            this.msgId = "";
        } else {
            this.msgId = str3;
        }
        if ((i & 32) == 0) {
            this.localizedTitle = "";
        } else {
            this.localizedTitle = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_api(LatestMessage latestMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) latestMessage.senderNickname, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, latestMessage.senderNickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || latestMessage.eventSourceType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, latestMessage.eventSourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || latestMessage.eventSubType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, latestMessage.eventSubType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) latestMessage.eventTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, latestMessage.eventTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) latestMessage.msgId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, latestMessage.msgId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) latestMessage.localizedTitle, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, latestMessage.localizedTitle);
    }

    public LatestMessage(String str, int i, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.senderNickname = str;
        this.eventSourceType = i;
        this.eventSubType = i2;
        this.eventTime = str2;
        this.msgId = str3;
        this.localizedTitle = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r12v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r8v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:40) call: com.okinc.planet_api.model.LatestMessage.<init>(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LatestMessage(String str, int i, int i2, String str2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4);
    }

    public final PlanetNotificationCategory getNotificationCategory() {
        int i = this.eventSourceType;
        if (i == 1) {
            return PlanetNotificationCategory.Likes;
        }
        if (i == 2) {
            return PlanetNotificationCategory.Followers;
        }
        if (i == 3) {
            return PlanetNotificationCategory.Comments;
        }
        if (i == 4) {
            return PlanetNotificationCategory.System;
        }
        return PlanetNotificationCategory.All;
    }
}
