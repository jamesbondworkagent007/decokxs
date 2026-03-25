package com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SystemPushConversation implements Parcelable {
    private final String darkModeIconUrl;
    private final boolean isNoDisturb;
    private final boolean isTop;
    private final SystemPushMessage latestMessage;
    private final String lightModeIconUrl;
    private final String title;
    private final int type;
    private final int unReadMessageCount;
    private final long updateTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SystemPushConversation> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SystemPushConversation> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SystemPushConversation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SystemPushConversation(parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), (SystemPushMessage) parcel.readParcelable(SystemPushConversation.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SystemPushConversation[] newArray(int i) {
            return new SystemPushConversation[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SystemPushConversation() {
        this((String) null, 0, false, false, 0, 0L, (String) null, (String) null, (SystemPushMessage) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isNoDisturb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.unReadMessageCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.darkModeIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.lightModeIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SystemPushMessage component9() {
        return this.latestMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SystemPushConversation copy(@NotNull String str, int i, boolean z, boolean z2, int i2, long j, @NotNull String str2, @NotNull String str3, SystemPushMessage systemPushMessage) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SystemPushConversation(str, i, z, z2, i2, j, str2, str3, systemPushMessage);
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
        if (!(obj instanceof SystemPushConversation)) {
            return false;
        }
        SystemPushConversation systemPushConversation = (SystemPushConversation) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) systemPushConversation.title) && this.type == systemPushConversation.type && this.isTop == systemPushConversation.isTop && this.isNoDisturb == systemPushConversation.isNoDisturb && this.unReadMessageCount == systemPushConversation.unReadMessageCount && this.updateTime == systemPushConversation.updateTime && Intrinsics.EZpvd((Object) this.darkModeIconUrl, (Object) systemPushConversation.darkModeIconUrl) && Intrinsics.EZpvd((Object) this.lightModeIconUrl, (Object) systemPushConversation.lightModeIconUrl) && Intrinsics.EZpvd(this.latestMessage, systemPushConversation.latestMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDarkModeIconUrl() {
        return this.darkModeIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SystemPushMessage getLatestMessage() {
        return this.latestMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLightModeIconUrl() {
        return this.lightModeIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUnReadMessageCount() {
        return this.unReadMessageCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        int iHashCode2 = Integer.hashCode(this.type);
        int iHashCode3 = Boolean.hashCode(this.isTop);
        int iHashCode4 = Boolean.hashCode(this.isNoDisturb);
        int iHashCode5 = Integer.hashCode(this.unReadMessageCount);
        int iHashCode6 = Long.hashCode(this.updateTime);
        int iHashCode7 = this.darkModeIconUrl.hashCode();
        int iHashCode8 = this.lightModeIconUrl.hashCode();
        SystemPushMessage systemPushMessage = this.latestMessage;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (systemPushMessage == null ? 0 : systemPushMessage.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNoDisturb() {
        return this.isNoDisturb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTop() {
        return this.isTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SystemPushConversation(title=" + this.title + ", type=" + this.type + ", isTop=" + this.isTop + ", isNoDisturb=" + this.isNoDisturb + ", unReadMessageCount=" + this.unReadMessageCount + ", updateTime=" + this.updateTime + ", darkModeIconUrl=" + this.darkModeIconUrl + ", lightModeIconUrl=" + this.lightModeIconUrl + ", latestMessage=" + this.latestMessage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeInt(this.type);
        parcel.writeInt(this.isTop ? 1 : 0);
        parcel.writeInt(this.isNoDisturb ? 1 : 0);
        parcel.writeInt(this.unReadMessageCount);
        parcel.writeLong(this.updateTime);
        parcel.writeString(this.darkModeIconUrl);
        parcel.writeString(this.lightModeIconUrl);
        parcel.writeParcelable(this.latestMessage, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.SystemPushConversation.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SystemPushConversation> serializer() {
            return SystemPushConversation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SystemPushConversation(int i, String str, int i2, boolean z, boolean z2, int i3, long j, String str2, String str3, SystemPushMessage systemPushMessage, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.type = -1;
        } else {
            this.type = i2;
        }
        if ((i & 4) == 0) {
            this.isTop = false;
        } else {
            this.isTop = z;
        }
        if ((i & 8) == 0) {
            this.isNoDisturb = false;
        } else {
            this.isNoDisturb = z2;
        }
        if ((i & 16) == 0) {
            this.unReadMessageCount = 0;
        } else {
            this.unReadMessageCount = i3;
        }
        if ((i & 32) == 0) {
            this.updateTime = 0L;
        } else {
            this.updateTime = j;
        }
        if ((i & 64) == 0) {
            this.darkModeIconUrl = "";
        } else {
            this.darkModeIconUrl = str2;
        }
        if ((i & 128) == 0) {
            this.lightModeIconUrl = "";
        } else {
            this.lightModeIconUrl = str3;
        }
        if ((i & 256) == 0) {
            this.latestMessage = null;
        } else {
            this.latestMessage = systemPushMessage;
        }
    }

    public static final /* synthetic */ void write$Self$OKNotificationCenter_oknotificationcenter_api(SystemPushConversation systemPushConversation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) systemPushConversation.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, systemPushConversation.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || systemPushConversation.type != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, systemPushConversation.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || systemPushConversation.isTop) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, systemPushConversation.isTop);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || systemPushConversation.isNoDisturb) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, systemPushConversation.isNoDisturb);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || systemPushConversation.unReadMessageCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, systemPushConversation.unReadMessageCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || systemPushConversation.updateTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, systemPushConversation.updateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) systemPushConversation.darkModeIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, systemPushConversation.darkModeIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) systemPushConversation.lightModeIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, systemPushConversation.lightModeIconUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && systemPushConversation.latestMessage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, SystemPushMessage$$serializer.INSTANCE, systemPushConversation.latestMessage);
    }

    public SystemPushConversation(@NotNull String str, int i, boolean z, boolean z2, int i2, long j, @NotNull String str2, @NotNull String str3, SystemPushMessage systemPushMessage) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.type = i;
        this.isTop = z;
        this.isNoDisturb = z2;
        this.unReadMessageCount = i2;
        this.updateTime = j;
        this.darkModeIconUrl = str2;
        this.lightModeIconUrl = str3;
        this.latestMessage = systemPushMessage;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0058: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r13v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0021: ARITH (r22v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r16v0 int) : (0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r22v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.SystemPushMessage:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.SystemPushMessage) : (r21v0 com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.SystemPushMessage))
 A[MD:(java.lang.String, int, boolean, boolean, int, long, java.lang.String, java.lang.String, com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.SystemPushMessage):void (m)] (LINE:17) call: com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.SystemPushConversation.<init>(java.lang.String, int, boolean, boolean, int, long, java.lang.String, java.lang.String, com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.SystemPushMessage):void type: THIS */
    public /* synthetic */ SystemPushConversation(String str, int i, boolean z, boolean z2, int i2, long j, String str2, String str3, SystemPushMessage systemPushMessage, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) == 0 ? i2 : 0, (i3 & 32) != 0 ? 0L : j, (i3 & 64) != 0 ? "" : str2, (i3 & 128) == 0 ? str3 : "", (i3 & 256) != 0 ? null : systemPushMessage);
    }
}
