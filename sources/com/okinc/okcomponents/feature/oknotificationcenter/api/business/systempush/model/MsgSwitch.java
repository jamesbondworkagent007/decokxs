package com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class MsgSwitch implements Parcelable {
    public static final int $stable = 0;
    private final Integer showStatus;
    private final Integer switchStatus;
    private final Integer type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MsgSwitch> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<MsgSwitch> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MsgSwitch createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MsgSwitch(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MsgSwitch[] newArray(int i) {
            return new MsgSwitch[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MsgSwitch() {
        this((Integer) null, (Integer) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MsgSwitch copy$default(MsgSwitch msgSwitch, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = msgSwitch.type;
        }
        if ((i & 2) != 0) {
            num2 = msgSwitch.switchStatus;
        }
        if ((i & 4) != 0) {
            num3 = msgSwitch.showStatus;
        }
        return msgSwitch.copy(num, num2, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.switchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.showStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MsgSwitch copy(Integer num, Integer num2, Integer num3) {
        return new MsgSwitch(num, num2, num3);
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
        if (!(obj instanceof MsgSwitch)) {
            return false;
        }
        MsgSwitch msgSwitch = (MsgSwitch) obj;
        return Intrinsics.EZpvd(this.type, msgSwitch.type) && Intrinsics.EZpvd(this.switchStatus, msgSwitch.switchStatus) && Intrinsics.EZpvd(this.showStatus, msgSwitch.showStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getShowStatus() {
        return this.showStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSwitchStatus() {
        return this.switchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.type;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.switchStatus;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.showStatus;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MsgSwitch(type=" + this.type + ", switchStatus=" + this.switchStatus + ", showStatus=" + this.showStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.switchStatus;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.showStatus;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.MsgSwitch.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MsgSwitch> serializer() {
            return MsgSwitch$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MsgSwitch(int i, Integer num, Integer num2, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = num;
        }
        if ((i & 2) == 0) {
            this.switchStatus = null;
        } else {
            this.switchStatus = num2;
        }
        if ((i & 4) == 0) {
            this.showStatus = null;
        } else {
            this.showStatus = num3;
        }
    }

    public static final /* synthetic */ void write$Self$OKNotificationCenter_oknotificationcenter_api(MsgSwitch msgSwitch, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || msgSwitch.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, msgSwitch.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || msgSwitch.switchStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, msgSwitch.switchStatus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && msgSwitch.showStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, msgSwitch.showStatus);
    }

    public MsgSwitch(Integer num, Integer num2, Integer num3) {
        this.type = num;
        this.switchStatus = num2;
        this.showStatus = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.Integer):void (m)] (LINE:17) call: com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.MsgSwitch.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ MsgSwitch(Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
