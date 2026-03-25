package com.okinc.okimcore.model.im.group;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class VipRmGroupStatus implements Parcelable {
    public static final int $stable = 0;
    private final VipGroupDismissState vipRmGroupStatus;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VipRmGroupStatus> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<VipRmGroupStatus> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipRmGroupStatus createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VipRmGroupStatus(parcel.readInt() == 0 ? null : VipGroupDismissState.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipRmGroupStatus[] newArray(int i) {
            return new VipRmGroupStatus[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VipRmGroupStatus() {
        this((VipGroupDismissState) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VipRmGroupStatus copy$default(VipRmGroupStatus vipRmGroupStatus, VipGroupDismissState vipGroupDismissState, int i, Object obj) {
        if ((i & 1) != 0) {
            vipGroupDismissState = vipRmGroupStatus.vipRmGroupStatus;
        }
        return vipRmGroupStatus.copy(vipGroupDismissState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipGroupDismissState component1() {
        return this.vipRmGroupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipRmGroupStatus copy(VipGroupDismissState vipGroupDismissState) {
        return new VipRmGroupStatus(vipGroupDismissState);
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
        return (obj instanceof VipRmGroupStatus) && Intrinsics.EZpvd(this.vipRmGroupStatus, ((VipRmGroupStatus) obj).vipRmGroupStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipGroupDismissState getVipRmGroupStatus() {
        return this.vipRmGroupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        VipGroupDismissState vipGroupDismissState = this.vipRmGroupStatus;
        if (vipGroupDismissState == null) {
            return 0;
        }
        return vipGroupDismissState.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VipRmGroupStatus(vipRmGroupStatus=" + this.vipRmGroupStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        VipGroupDismissState vipGroupDismissState = this.vipRmGroupStatus;
        if (vipGroupDismissState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vipGroupDismissState.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.group.VipRmGroupStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VipRmGroupStatus> serializer() {
            return VipRmGroupStatus$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VipRmGroupStatus(int i, VipGroupDismissState vipGroupDismissState, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.vipRmGroupStatus = null;
        } else {
            this.vipRmGroupStatus = vipGroupDismissState;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(VipRmGroupStatus vipRmGroupStatus, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && vipRmGroupStatus.vipRmGroupStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, VipGroupDismissState$$serializer.INSTANCE, vipRmGroupStatus.vipRmGroupStatus);
    }

    public VipRmGroupStatus(VipGroupDismissState vipGroupDismissState) {
        this.vipRmGroupStatus = vipGroupDismissState;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.im.group.VipGroupDismissState:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.VipGroupDismissState) : (r1v0 com.okinc.okimcore.model.im.group.VipGroupDismissState))
 A[MD:(com.okinc.okimcore.model.im.group.VipGroupDismissState):void (m)] (LINE:11) call: com.okinc.okimcore.model.im.group.VipRmGroupStatus.<init>(com.okinc.okimcore.model.im.group.VipGroupDismissState):void type: THIS */
    public /* synthetic */ VipRmGroupStatus(VipGroupDismissState vipGroupDismissState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : vipGroupDismissState);
    }
}
