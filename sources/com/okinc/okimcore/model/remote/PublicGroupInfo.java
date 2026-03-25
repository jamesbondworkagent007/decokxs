package com.okinc.okimcore.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class PublicGroupInfo implements Parcelable {
    public static final int $stable = 0;
    private final String groupAvatar;
    private final String groupDescription;
    private final String groupId;
    private final String groupName;
    private final String invitationId;
    private final Boolean isOfficialGroup;
    private final Boolean isPaidGroup;
    private final Integer maxMemberCount;
    private final Integer memberCount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PublicGroupInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<PublicGroupInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PublicGroupInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PublicGroupInfo(string, string2, string3, string4, numValueOf, boolValueOf, numValueOf2, string5, boolValueOf2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PublicGroupInfo[] newArray(int i) {
            return new PublicGroupInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PublicGroupInfo() {
        this((String) null, (String) null, (String) null, (String) null, (Integer) null, (Boolean) null, (Integer) null, (String) null, (Boolean) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.groupAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.groupDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.memberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.isPaidGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.maxMemberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.isOfficialGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PublicGroupInfo copy(String str, String str2, String str3, String str4, Integer num, Boolean bool, Integer num2, String str5, Boolean bool2) {
        return new PublicGroupInfo(str, str2, str3, str4, num, bool, num2, str5, bool2);
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
        if (!(obj instanceof PublicGroupInfo)) {
            return false;
        }
        PublicGroupInfo publicGroupInfo = (PublicGroupInfo) obj;
        return Intrinsics.EZpvd((Object) this.groupId, (Object) publicGroupInfo.groupId) && Intrinsics.EZpvd((Object) this.groupName, (Object) publicGroupInfo.groupName) && Intrinsics.EZpvd((Object) this.groupAvatar, (Object) publicGroupInfo.groupAvatar) && Intrinsics.EZpvd((Object) this.groupDescription, (Object) publicGroupInfo.groupDescription) && Intrinsics.EZpvd(this.memberCount, publicGroupInfo.memberCount) && Intrinsics.EZpvd(this.isPaidGroup, publicGroupInfo.isPaidGroup) && Intrinsics.EZpvd(this.maxMemberCount, publicGroupInfo.maxMemberCount) && Intrinsics.EZpvd((Object) this.invitationId, (Object) publicGroupInfo.invitationId) && Intrinsics.EZpvd(this.isOfficialGroup, publicGroupInfo.isOfficialGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupAvatar() {
        return this.groupAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupDescription() {
        return this.groupDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
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
    public final Integer getMaxMemberCount() {
        return this.maxMemberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMemberCount() {
        return this.memberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.groupId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.groupName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.groupAvatar;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.groupDescription;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        Integer num = this.memberCount;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        Boolean bool = this.isPaidGroup;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        Integer num2 = this.maxMemberCount;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        String str5 = this.invitationId;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        Boolean bool2 = this.isOfficialGroup;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isOfficialGroup() {
        return this.isOfficialGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isPaidGroup() {
        return this.isPaidGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PublicGroupInfo(groupId=" + this.groupId + ", groupName=" + this.groupName + ", groupAvatar=" + this.groupAvatar + ", groupDescription=" + this.groupDescription + ", memberCount=" + this.memberCount + ", isPaidGroup=" + this.isPaidGroup + ", maxMemberCount=" + this.maxMemberCount + ", invitationId=" + this.invitationId + ", isOfficialGroup=" + this.isOfficialGroup + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.groupId);
        parcel.writeString(this.groupName);
        parcel.writeString(this.groupAvatar);
        parcel.writeString(this.groupDescription);
        Integer num = this.memberCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.isPaidGroup;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.maxMemberCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.invitationId);
        Boolean bool2 = this.isOfficialGroup;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.PublicGroupInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PublicGroupInfo> serializer() {
            return PublicGroupInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PublicGroupInfo(int i, String str, String str2, String str3, String str4, Integer num, Boolean bool, Integer num2, String str5, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.groupId = null;
        } else {
            this.groupId = str;
        }
        if ((i & 2) == 0) {
            this.groupName = null;
        } else {
            this.groupName = str2;
        }
        if ((i & 4) == 0) {
            this.groupAvatar = null;
        } else {
            this.groupAvatar = str3;
        }
        if ((i & 8) == 0) {
            this.groupDescription = null;
        } else {
            this.groupDescription = str4;
        }
        if ((i & 16) == 0) {
            this.memberCount = null;
        } else {
            this.memberCount = num;
        }
        if ((i & 32) == 0) {
            this.isPaidGroup = null;
        } else {
            this.isPaidGroup = bool;
        }
        if ((i & 64) == 0) {
            this.maxMemberCount = null;
        } else {
            this.maxMemberCount = num2;
        }
        if ((i & 128) == 0) {
            this.invitationId = null;
        } else {
            this.invitationId = str5;
        }
        if ((i & 256) == 0) {
            this.isOfficialGroup = null;
        } else {
            this.isOfficialGroup = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(PublicGroupInfo publicGroupInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || publicGroupInfo.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, publicGroupInfo.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || publicGroupInfo.groupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, publicGroupInfo.groupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || publicGroupInfo.groupAvatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, publicGroupInfo.groupAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || publicGroupInfo.groupDescription != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, publicGroupInfo.groupDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || publicGroupInfo.memberCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, publicGroupInfo.memberCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || publicGroupInfo.isPaidGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, publicGroupInfo.isPaidGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || publicGroupInfo.maxMemberCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, publicGroupInfo.maxMemberCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || publicGroupInfo.invitationId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, publicGroupInfo.invitationId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && publicGroupInfo.isOfficialGroup == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, publicGroupInfo.isOfficialGroup);
    }

    public PublicGroupInfo(String str, String str2, String str3, String str4, Integer num, Boolean bool, Integer num2, String str5, Boolean bool2) {
        this.groupId = str;
        this.groupName = str2;
        this.groupAvatar = str3;
        this.groupDescription = str4;
        this.memberCount = num;
        this.isPaidGroup = bool;
        this.maxMemberCount = num2;
        this.invitationId = str5;
        this.isOfficialGroup = bool2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.Boolean):void (m)] (LINE:116) call: com.okinc.okimcore.model.remote.PublicGroupInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ PublicGroupInfo(String str, String str2, String str3, String str4, Integer num, Boolean bool, Integer num2, String str5, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : str5, (i & 256) == 0 ? bool2 : null);
    }
}
