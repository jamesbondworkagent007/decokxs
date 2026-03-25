package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class Web3PayRouteParams implements Parcelable {
    public String address;
    public final OffshoreActivatePayFlowParams offshoreActivatePayFlowParams;
    public final OffshoreAddFundsFlowParams offshoreAddFundsFlowParams;
    public final OffshoreCovertToPayParams offshoreCovertToPayFlowParams;
    public final OffshorePayFlowParams offshorePayFlow;
    public final OffshorePayTabParams offshorePayTabParams;
    public final ReceiverOrClaimParams receiverOrClaimParams;
    public final RewardsParams rewardsParams;
    public JumpTargetType targetType;
    public final TransactionParams transactionParams;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Web3PayRouteParams> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.business.web3pay.api.model.JumpTargetType", JumpTargetType.values()), null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<Web3PayRouteParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Web3PayRouteParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Web3PayRouteParams(JumpTargetType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : TransactionParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ReceiverOrClaimParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OffshorePayFlowParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OffshoreActivatePayFlowParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OffshoreAddFundsFlowParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OffshoreCovertToPayParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OffshorePayTabParams.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RewardsParams.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Web3PayRouteParams[] newArray(int i) {
            return new Web3PayRouteParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3PayRouteParams OLrzqt(@NotNull JumpTargetType jumpTargetType, String str, TransactionParams transactionParams, ReceiverOrClaimParams receiverOrClaimParams, OffshorePayFlowParams offshorePayFlowParams, OffshoreActivatePayFlowParams offshoreActivatePayFlowParams, OffshoreAddFundsFlowParams offshoreAddFundsFlowParams, OffshoreCovertToPayParams offshoreCovertToPayParams, OffshorePayTabParams offshorePayTabParams, RewardsParams rewardsParams) {
        Intrinsics.checkNotNullParameter(jumpTargetType, "");
        return new Web3PayRouteParams(jumpTargetType, str, transactionParams, receiverOrClaimParams, offshorePayFlowParams, offshoreActivatePayFlowParams, offshoreAddFundsFlowParams, offshoreCovertToPayParams, offshorePayTabParams, rewardsParams);
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
        if (!(obj instanceof Web3PayRouteParams)) {
            return false;
        }
        Web3PayRouteParams web3PayRouteParams = (Web3PayRouteParams) obj;
        return this.targetType == web3PayRouteParams.targetType && Intrinsics.EZpvd((Object) this.address, (Object) web3PayRouteParams.address) && Intrinsics.EZpvd(this.transactionParams, web3PayRouteParams.transactionParams) && Intrinsics.EZpvd(this.receiverOrClaimParams, web3PayRouteParams.receiverOrClaimParams) && Intrinsics.EZpvd(this.offshorePayFlow, web3PayRouteParams.offshorePayFlow) && Intrinsics.EZpvd(this.offshoreActivatePayFlowParams, web3PayRouteParams.offshoreActivatePayFlowParams) && Intrinsics.EZpvd(this.offshoreAddFundsFlowParams, web3PayRouteParams.offshoreAddFundsFlowParams) && Intrinsics.EZpvd(this.offshoreCovertToPayFlowParams, web3PayRouteParams.offshoreCovertToPayFlowParams) && Intrinsics.EZpvd(this.offshorePayTabParams, web3PayRouteParams.offshorePayTabParams) && Intrinsics.EZpvd(this.rewardsParams, web3PayRouteParams.rewardsParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.targetType.hashCode();
        String str = this.address;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        TransactionParams transactionParams = this.transactionParams;
        int iHashCode3 = transactionParams == null ? 0 : transactionParams.hashCode();
        ReceiverOrClaimParams receiverOrClaimParams = this.receiverOrClaimParams;
        int iHashCode4 = receiverOrClaimParams == null ? 0 : receiverOrClaimParams.hashCode();
        OffshorePayFlowParams offshorePayFlowParams = this.offshorePayFlow;
        int iHashCode5 = offshorePayFlowParams == null ? 0 : offshorePayFlowParams.hashCode();
        OffshoreActivatePayFlowParams offshoreActivatePayFlowParams = this.offshoreActivatePayFlowParams;
        int iHashCode6 = offshoreActivatePayFlowParams == null ? 0 : offshoreActivatePayFlowParams.hashCode();
        OffshoreAddFundsFlowParams offshoreAddFundsFlowParams = this.offshoreAddFundsFlowParams;
        int iHashCode7 = offshoreAddFundsFlowParams == null ? 0 : offshoreAddFundsFlowParams.hashCode();
        OffshoreCovertToPayParams offshoreCovertToPayParams = this.offshoreCovertToPayFlowParams;
        int iHashCode8 = offshoreCovertToPayParams == null ? 0 : offshoreCovertToPayParams.hashCode();
        OffshorePayTabParams offshorePayTabParams = this.offshorePayTabParams;
        int iHashCode9 = offshorePayTabParams == null ? 0 : offshorePayTabParams.hashCode();
        RewardsParams rewardsParams = this.rewardsParams;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (rewardsParams != null ? rewardsParams.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Web3PayRouteParams(targetType=" + this.targetType + ", address=" + this.address + ", transactionParams=" + this.transactionParams + ", receiverOrClaimParams=" + this.receiverOrClaimParams + ", offshorePayFlow=" + this.offshorePayFlow + ", offshoreActivatePayFlowParams=" + this.offshoreActivatePayFlowParams + ", offshoreAddFundsFlowParams=" + this.offshoreAddFundsFlowParams + ", offshoreCovertToPayFlowParams=" + this.offshoreCovertToPayFlowParams + ", offshorePayTabParams=" + this.offshorePayTabParams + ", rewardsParams=" + this.rewardsParams + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.targetType.name());
        parcel.writeString(this.address);
        TransactionParams transactionParams = this.transactionParams;
        if (transactionParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transactionParams.writeToParcel(parcel, i);
        }
        ReceiverOrClaimParams receiverOrClaimParams = this.receiverOrClaimParams;
        if (receiverOrClaimParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            receiverOrClaimParams.writeToParcel(parcel, i);
        }
        OffshorePayFlowParams offshorePayFlowParams = this.offshorePayFlow;
        if (offshorePayFlowParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offshorePayFlowParams.writeToParcel(parcel, i);
        }
        OffshoreActivatePayFlowParams offshoreActivatePayFlowParams = this.offshoreActivatePayFlowParams;
        if (offshoreActivatePayFlowParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offshoreActivatePayFlowParams.writeToParcel(parcel, i);
        }
        OffshoreAddFundsFlowParams offshoreAddFundsFlowParams = this.offshoreAddFundsFlowParams;
        if (offshoreAddFundsFlowParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offshoreAddFundsFlowParams.writeToParcel(parcel, i);
        }
        OffshoreCovertToPayParams offshoreCovertToPayParams = this.offshoreCovertToPayFlowParams;
        if (offshoreCovertToPayParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offshoreCovertToPayParams.writeToParcel(parcel, i);
        }
        OffshorePayTabParams offshorePayTabParams = this.offshorePayTabParams;
        if (offshorePayTabParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offshorePayTabParams.writeToParcel(parcel, i);
        }
        RewardsParams rewardsParams = this.rewardsParams;
        if (rewardsParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rewardsParams.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.Web3PayRouteParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Web3PayRouteParams> serializer() {
            return Web3PayRouteParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Web3PayRouteParams(int i, JumpTargetType jumpTargetType, String str, TransactionParams transactionParams, ReceiverOrClaimParams receiverOrClaimParams, OffshorePayFlowParams offshorePayFlowParams, OffshoreActivatePayFlowParams offshoreActivatePayFlowParams, OffshoreAddFundsFlowParams offshoreAddFundsFlowParams, OffshoreCovertToPayParams offshoreCovertToPayParams, OffshorePayTabParams offshorePayTabParams, RewardsParams rewardsParams, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, Web3PayRouteParams$$serializer.INSTANCE.getDescriptor());
        }
        this.targetType = jumpTargetType;
        if ((i & 2) == 0) {
            this.address = null;
        } else {
            this.address = str;
        }
        if ((i & 4) == 0) {
            this.transactionParams = null;
        } else {
            this.transactionParams = transactionParams;
        }
        if ((i & 8) == 0) {
            this.receiverOrClaimParams = null;
        } else {
            this.receiverOrClaimParams = receiverOrClaimParams;
        }
        if ((i & 16) == 0) {
            this.offshorePayFlow = null;
        } else {
            this.offshorePayFlow = offshorePayFlowParams;
        }
        if ((i & 32) == 0) {
            this.offshoreActivatePayFlowParams = null;
        } else {
            this.offshoreActivatePayFlowParams = offshoreActivatePayFlowParams;
        }
        if ((i & 64) == 0) {
            this.offshoreAddFundsFlowParams = null;
        } else {
            this.offshoreAddFundsFlowParams = offshoreAddFundsFlowParams;
        }
        if ((i & 128) == 0) {
            this.offshoreCovertToPayFlowParams = null;
        } else {
            this.offshoreCovertToPayFlowParams = offshoreCovertToPayParams;
        }
        if ((i & 256) == 0) {
            this.offshorePayTabParams = null;
        } else {
            this.offshorePayTabParams = offshorePayTabParams;
        }
        if ((i & 512) == 0) {
            this.rewardsParams = null;
        } else {
            this.rewardsParams = rewardsParams;
        }
    }

    public static final /* synthetic */ void EZpvd(Web3PayRouteParams web3PayRouteParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], web3PayRouteParams.targetType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || web3PayRouteParams.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, web3PayRouteParams.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || web3PayRouteParams.transactionParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, TransactionParams$$serializer.INSTANCE, web3PayRouteParams.transactionParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || web3PayRouteParams.receiverOrClaimParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, ReceiverOrClaimParams$$serializer.INSTANCE, web3PayRouteParams.receiverOrClaimParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || web3PayRouteParams.offshorePayFlow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, OffshorePayFlowParams$$serializer.INSTANCE, web3PayRouteParams.offshorePayFlow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || web3PayRouteParams.offshoreActivatePayFlowParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, OffshoreActivatePayFlowParams$$serializer.INSTANCE, web3PayRouteParams.offshoreActivatePayFlowParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || web3PayRouteParams.offshoreAddFundsFlowParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, OffshoreAddFundsFlowParams$$serializer.INSTANCE, web3PayRouteParams.offshoreAddFundsFlowParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || web3PayRouteParams.offshoreCovertToPayFlowParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, OffshoreCovertToPayParams$$serializer.INSTANCE, web3PayRouteParams.offshoreCovertToPayFlowParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || web3PayRouteParams.offshorePayTabParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, OffshorePayTabParams$$serializer.INSTANCE, web3PayRouteParams.offshorePayTabParams);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && web3PayRouteParams.rewardsParams == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, RewardsParams$$serializer.INSTANCE, web3PayRouteParams.rewardsParams);
    }

    public Web3PayRouteParams(@NotNull JumpTargetType jumpTargetType, String str, TransactionParams transactionParams, ReceiverOrClaimParams receiverOrClaimParams, OffshorePayFlowParams offshorePayFlowParams, OffshoreActivatePayFlowParams offshoreActivatePayFlowParams, OffshoreAddFundsFlowParams offshoreAddFundsFlowParams, OffshoreCovertToPayParams offshoreCovertToPayParams, OffshorePayTabParams offshorePayTabParams, RewardsParams rewardsParams) {
        Intrinsics.checkNotNullParameter(jumpTargetType, "");
        this.targetType = jumpTargetType;
        this.address = str;
        this.transactionParams = transactionParams;
        this.receiverOrClaimParams = receiverOrClaimParams;
        this.offshorePayFlow = offshorePayFlowParams;
        this.offshoreActivatePayFlowParams = offshoreActivatePayFlowParams;
        this.offshoreAddFundsFlowParams = offshoreAddFundsFlowParams;
        this.offshoreCovertToPayFlowParams = offshoreCovertToPayParams;
        this.offshorePayTabParams = offshorePayTabParams;
        this.rewardsParams = rewardsParams;
    }
}
