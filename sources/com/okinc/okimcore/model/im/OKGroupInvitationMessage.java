package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKGroupInvitationMessage extends OKMessageContent {
    public static final int $stable = 0;
    private final Long expireTime;
    private final String groupAvatar;
    private final Long groupId;
    private final String groupName;
    private final String invitationId;
    private final String inviterUid;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OKGroupInvitationMessage> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<OKGroupInvitationMessage> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKGroupInvitationMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKGroupInvitationMessage(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKGroupInvitationMessage[] newArray(int i) {
            return new OKGroupInvitationMessage[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKGroupInvitationMessage() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OKGroupInvitationMessage copy$default(OKGroupInvitationMessage oKGroupInvitationMessage, String str, Long l, String str2, String str3, String str4, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oKGroupInvitationMessage.invitationId;
        }
        if ((i & 2) != 0) {
            l = oKGroupInvitationMessage.groupId;
        }
        Long l3 = l;
        if ((i & 4) != 0) {
            str2 = oKGroupInvitationMessage.groupName;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = oKGroupInvitationMessage.groupAvatar;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = oKGroupInvitationMessage.inviterUid;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            l2 = oKGroupInvitationMessage.expireTime;
        }
        return oKGroupInvitationMessage.copy(str, l3, str5, str6, str7, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.groupAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.inviterUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKGroupInvitationMessage copy(String str, Long l, String str2, String str3, String str4, Long l2) {
        return new OKGroupInvitationMessage(str, l, str2, str3, str4, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OKGroupInvitationMessage)) {
            return false;
        }
        OKGroupInvitationMessage oKGroupInvitationMessage = (OKGroupInvitationMessage) obj;
        return Intrinsics.EZpvd((Object) this.invitationId, (Object) oKGroupInvitationMessage.invitationId) && Intrinsics.EZpvd(this.groupId, oKGroupInvitationMessage.groupId) && Intrinsics.EZpvd((Object) this.groupName, (Object) oKGroupInvitationMessage.groupName) && Intrinsics.EZpvd((Object) this.groupAvatar, (Object) oKGroupInvitationMessage.groupAvatar) && Intrinsics.EZpvd((Object) this.inviterUid, (Object) oKGroupInvitationMessage.inviterUid) && Intrinsics.EZpvd(this.expireTime, oKGroupInvitationMessage.expireTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupAvatar() {
        return this.groupAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvitationId() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviterUid() {
        return this.inviterUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.invitationId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.groupId;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        String str2 = this.groupName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.groupAvatar;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.inviterUid;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        Long l2 = this.expireTime;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKGroupInvitationMessage(invitationId=" + this.invitationId + ", groupId=" + this.groupId + ", groupName=" + this.groupName + ", groupAvatar=" + this.groupAvatar + ", inviterUid=" + this.inviterUid + ", expireTime=" + this.expireTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.invitationId);
        Long l = this.groupId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.groupName);
        parcel.writeString(this.groupAvatar);
        parcel.writeString(this.inviterUid);
        Long l2 = this.expireTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKGroupInvitationMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKGroupInvitationMessage> serializer() {
            return OKGroupInvitationMessage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKGroupInvitationMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, Long l, String str4, String str5, String str6, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        if ((i & 256) == 0) {
            this.invitationId = null;
        } else {
            this.invitationId = str3;
        }
        if ((i & 512) == 0) {
            this.groupId = null;
        } else {
            this.groupId = l;
        }
        if ((i & 1024) == 0) {
            this.groupName = null;
        } else {
            this.groupName = str4;
        }
        if ((i & 2048) == 0) {
            this.groupAvatar = null;
        } else {
            this.groupAvatar = str5;
        }
        if ((i & 4096) == 0) {
            this.inviterUid = null;
        } else {
            this.inviterUid = str6;
        }
        if ((i & 8192) == 0) {
            this.expireTime = null;
        } else {
            this.expireTime = l2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKGroupInvitationMessage oKGroupInvitationMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(oKGroupInvitationMessage, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || oKGroupInvitationMessage.invitationId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, oKGroupInvitationMessage.invitationId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || oKGroupInvitationMessage.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, oKGroupInvitationMessage.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || oKGroupInvitationMessage.groupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, oKGroupInvitationMessage.groupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || oKGroupInvitationMessage.groupAvatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, oKGroupInvitationMessage.groupAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || oKGroupInvitationMessage.inviterUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, oKGroupInvitationMessage.inviterUid);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && oKGroupInvitationMessage.expireTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.INSTANCE, oKGroupInvitationMessage.expireTime);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r11v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long):void (m)] (LINE:11) call: com.okinc.okimcore.model.im.OKGroupInvitationMessage.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ OKGroupInvitationMessage(String str, Long l, String str2, String str3, String str4, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l2);
    }

    public OKGroupInvitationMessage(String str, Long l, String str2, String str3, String str4, Long l2) {
        this.invitationId = str;
        this.groupId = l;
        this.groupName = str2;
        this.groupAvatar = str3;
        this.inviterUid = str4;
        this.expireTime = l2;
    }
}
