package com.okinc.okimcore.model.im.group;

import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class VipGroupDismissState implements Parcelable {
    public static final int $stable = 0;
    private final Integer expiryDays;
    private final Long expiryTimestamp;
    private final Long groupId;
    private final VipGroupStatus status;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VipGroupDismissState> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, VipGroupStatus.Companion.serializer(), null, null};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<VipGroupDismissState> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipGroupDismissState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VipGroupDismissState(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : VipGroupStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipGroupDismissState[] newArray(int i) {
            return new VipGroupDismissState[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VipGroupDismissState() {
        this((Long) null, (VipGroupStatus) null, (Integer) null, (Long) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VipGroupDismissState copy$default(VipGroupDismissState vipGroupDismissState, Long l, VipGroupStatus vipGroupStatus, Integer num, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = vipGroupDismissState.groupId;
        }
        if ((i & 2) != 0) {
            vipGroupStatus = vipGroupDismissState.status;
        }
        if ((i & 4) != 0) {
            num = vipGroupDismissState.expiryDays;
        }
        if ((i & 8) != 0) {
            l2 = vipGroupDismissState.expiryTimestamp;
        }
        return vipGroupDismissState.copy(l, vipGroupStatus, num, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipGroupStatus component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.expiryDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.expiryTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipGroupDismissState copy(Long l, VipGroupStatus vipGroupStatus, Integer num, Long l2) {
        return new VipGroupDismissState(l, vipGroupStatus, num, l2);
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
        if (!(obj instanceof VipGroupDismissState)) {
            return false;
        }
        VipGroupDismissState vipGroupDismissState = (VipGroupDismissState) obj;
        return Intrinsics.EZpvd(this.groupId, vipGroupDismissState.groupId) && this.status == vipGroupDismissState.status && Intrinsics.EZpvd(this.expiryDays, vipGroupDismissState.expiryDays) && Intrinsics.EZpvd(this.expiryTimestamp, vipGroupDismissState.expiryTimestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getExpiryDays() {
        return this.expiryDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpiryTimestamp() {
        return this.expiryTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipGroupStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.groupId;
        int iHashCode = l == null ? 0 : l.hashCode();
        VipGroupStatus vipGroupStatus = this.status;
        int iHashCode2 = vipGroupStatus == null ? 0 : vipGroupStatus.hashCode();
        Integer num = this.expiryDays;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Long l2 = this.expiryTimestamp;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VipGroupDismissState(groupId=" + this.groupId + ", status=" + this.status + ", expiryDays=" + this.expiryDays + ", expiryTimestamp=" + this.expiryTimestamp + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.groupId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        VipGroupStatus vipGroupStatus = this.status;
        if (vipGroupStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(vipGroupStatus.name());
        }
        Integer num = this.expiryDays;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l2 = this.expiryTimestamp;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.group.VipGroupDismissState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VipGroupDismissState> serializer() {
            return VipGroupDismissState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VipGroupDismissState(int i, Long l, VipGroupStatus vipGroupStatus, Integer num, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.groupId = null;
        } else {
            this.groupId = l;
        }
        if ((i & 2) == 0) {
            this.status = null;
        } else {
            this.status = vipGroupStatus;
        }
        if ((i & 4) == 0) {
            this.expiryDays = null;
        } else {
            this.expiryDays = num;
        }
        if ((i & 8) == 0) {
            this.expiryTimestamp = null;
        } else {
            this.expiryTimestamp = l2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(VipGroupDismissState vipGroupDismissState, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || vipGroupDismissState.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, vipGroupDismissState.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || vipGroupDismissState.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], vipGroupDismissState.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || vipGroupDismissState.expiryDays != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, vipGroupDismissState.expiryDays);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && vipGroupDismissState.expiryTimestamp == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, vipGroupDismissState.expiryTimestamp);
    }

    public VipGroupDismissState(Long l, VipGroupStatus vipGroupStatus, Integer num, Long l2) {
        this.groupId = l;
        this.status = vipGroupStatus;
        this.expiryDays = num;
        this.expiryTimestamp = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:com.okinc.okimcore.model.im.group.VipGroupStatus:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.VipGroupStatus) : (r3v0 com.okinc.okimcore.model.im.group.VipGroupStatus))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r5v0 java.lang.Long))
 A[MD:(java.lang.Long, com.okinc.okimcore.model.im.group.VipGroupStatus, java.lang.Integer, java.lang.Long):void (m)] (LINE:19) call: com.okinc.okimcore.model.im.group.VipGroupDismissState.<init>(java.lang.Long, com.okinc.okimcore.model.im.group.VipGroupStatus, java.lang.Integer, java.lang.Long):void type: THIS */
    public /* synthetic */ VipGroupDismissState(Long l, VipGroupStatus vipGroupStatus, Integer num, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : vipGroupStatus, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l2);
    }
}
