package com.okinc.okimcore.model.im.group.voicecall;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.GroupVoiceCallData;
import com.okinc.okimcore.model.im.GroupVoiceCallData$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupVoiceCallConfig implements Parcelable {
    private final GroupVoiceCallData currentCall;
    private final Integer maxParticipants;
    private final Long tokenTtlSeconds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GroupVoiceCallConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<GroupVoiceCallConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupVoiceCallConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GroupVoiceCallConfig(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? GroupVoiceCallData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupVoiceCallConfig[] newArray(int i) {
            return new GroupVoiceCallConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupVoiceCallConfig() {
        this((Integer) null, (Long) null, (GroupVoiceCallData) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupVoiceCallConfig copy$default(GroupVoiceCallConfig groupVoiceCallConfig, Integer num, Long l, GroupVoiceCallData groupVoiceCallData, int i, Object obj) {
        if ((i & 1) != 0) {
            num = groupVoiceCallConfig.maxParticipants;
        }
        if ((i & 2) != 0) {
            l = groupVoiceCallConfig.tokenTtlSeconds;
        }
        if ((i & 4) != 0) {
            groupVoiceCallData = groupVoiceCallConfig.currentCall;
        }
        return groupVoiceCallConfig.copy(num, l, groupVoiceCallData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.maxParticipants;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.tokenTtlSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupVoiceCallData component3() {
        return this.currentCall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupVoiceCallConfig copy(Integer num, Long l, GroupVoiceCallData groupVoiceCallData) {
        return new GroupVoiceCallConfig(num, l, groupVoiceCallData);
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
        if (!(obj instanceof GroupVoiceCallConfig)) {
            return false;
        }
        GroupVoiceCallConfig groupVoiceCallConfig = (GroupVoiceCallConfig) obj;
        return Intrinsics.EZpvd(this.maxParticipants, groupVoiceCallConfig.maxParticipants) && Intrinsics.EZpvd(this.tokenTtlSeconds, groupVoiceCallConfig.tokenTtlSeconds) && Intrinsics.EZpvd(this.currentCall, groupVoiceCallConfig.currentCall);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupVoiceCallData getCurrentCall() {
        return this.currentCall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMaxParticipants() {
        return this.maxParticipants;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTokenTtlSeconds() {
        return this.tokenTtlSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.maxParticipants;
        int iHashCode = num == null ? 0 : num.hashCode();
        Long l = this.tokenTtlSeconds;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        GroupVoiceCallData groupVoiceCallData = this.currentCall;
        return (((iHashCode * 31) + iHashCode2) * 31) + (groupVoiceCallData != null ? groupVoiceCallData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupVoiceCallConfig(maxParticipants=" + this.maxParticipants + ", tokenTtlSeconds=" + this.tokenTtlSeconds + ", currentCall=" + this.currentCall + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.maxParticipants;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.tokenTtlSeconds;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        GroupVoiceCallData groupVoiceCallData = this.currentCall;
        if (groupVoiceCallData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupVoiceCallData.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupVoiceCallConfig> serializer() {
            return GroupVoiceCallConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupVoiceCallConfig(int i, Integer num, Long l, GroupVoiceCallData groupVoiceCallData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.maxParticipants = null;
        } else {
            this.maxParticipants = num;
        }
        if ((i & 2) == 0) {
            this.tokenTtlSeconds = null;
        } else {
            this.tokenTtlSeconds = l;
        }
        if ((i & 4) == 0) {
            this.currentCall = null;
        } else {
            this.currentCall = groupVoiceCallData;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupVoiceCallConfig groupVoiceCallConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupVoiceCallConfig.maxParticipants != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, groupVoiceCallConfig.maxParticipants);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupVoiceCallConfig.tokenTtlSeconds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, groupVoiceCallConfig.tokenTtlSeconds);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && groupVoiceCallConfig.currentCall == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, GroupVoiceCallData$$serializer.INSTANCE, groupVoiceCallConfig.currentCall);
    }

    public GroupVoiceCallConfig(Integer num, Long l, GroupVoiceCallData groupVoiceCallData) {
        this.maxParticipants = num;
        this.tokenTtlSeconds = l;
        this.currentCall = groupVoiceCallData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
  (wrap:com.okinc.okimcore.model.im.GroupVoiceCallData:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.GroupVoiceCallData) : (r4v0 com.okinc.okimcore.model.im.GroupVoiceCallData))
 A[MD:(java.lang.Integer, java.lang.Long, com.okinc.okimcore.model.im.GroupVoiceCallData):void (m)] (LINE:12) call: com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig.<init>(java.lang.Integer, java.lang.Long, com.okinc.okimcore.model.im.GroupVoiceCallData):void type: THIS */
    public /* synthetic */ GroupVoiceCallConfig(Integer num, Long l, GroupVoiceCallData groupVoiceCallData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : groupVoiceCallData);
    }
}
