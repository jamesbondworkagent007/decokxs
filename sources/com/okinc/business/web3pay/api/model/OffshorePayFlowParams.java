package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OffshorePayFlowParams implements Parcelable {
    public static final int $stable = 0;
    public final String chainIndex;
    public final String tokenCoinTypeNo;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OffshorePayFlowParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OffshorePayFlowParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OffshorePayFlowParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OffshorePayFlowParams(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OffshorePayFlowParams[] newArray(int i) {
            return new OffshorePayFlowParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OffshorePayFlowParams copy$default(OffshorePayFlowParams offshorePayFlowParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offshorePayFlowParams.chainIndex;
        }
        if ((i & 2) != 0) {
            str2 = offshorePayFlowParams.tokenCoinTypeNo;
        }
        return offshorePayFlowParams.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OffshorePayFlowParams AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new OffshorePayFlowParams(str, str2);
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
        if (!(obj instanceof OffshorePayFlowParams)) {
            return false;
        }
        OffshorePayFlowParams offshorePayFlowParams = (OffshorePayFlowParams) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) offshorePayFlowParams.chainIndex) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) offshorePayFlowParams.tokenCoinTypeNo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.chainIndex.hashCode() * 31) + this.tokenCoinTypeNo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OffshorePayFlowParams(chainIndex=" + this.chainIndex + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.tokenCoinTypeNo);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.OffshorePayFlowParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OffshorePayFlowParams> serializer() {
            return OffshorePayFlowParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OffshorePayFlowParams(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, OffshorePayFlowParams$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.tokenCoinTypeNo = str2;
    }

    public static final /* synthetic */ void EZpvd(OffshorePayFlowParams offshorePayFlowParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, offshorePayFlowParams.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, offshorePayFlowParams.tokenCoinTypeNo);
    }

    public OffshorePayFlowParams(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.chainIndex = str;
        this.tokenCoinTypeNo = str2;
    }
}
