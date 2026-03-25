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
public final class TransactionParams implements Parcelable {
    public static final int $stable = 0;
    public final String orderId;
    public final int orderType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TransactionParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TransactionParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TransactionParams(parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionParams[] newArray(int i) {
            return new TransactionParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TransactionParams copy$default(TransactionParams transactionParams, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = transactionParams.orderId;
        }
        if ((i2 & 2) != 0) {
            i = transactionParams.orderType;
        }
        return transactionParams.OLrzqt(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionParams OLrzqt(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TransactionParams(str, i);
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
        if (!(obj instanceof TransactionParams)) {
            return false;
        }
        TransactionParams transactionParams = (TransactionParams) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) transactionParams.orderId) && this.orderType == transactionParams.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.orderId.hashCode() * 31) + Integer.hashCode(this.orderType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionParams(orderId=" + this.orderId + ", orderType=" + this.orderType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.orderId);
        parcel.writeInt(this.orderType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.TransactionParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionParams> serializer() {
            return TransactionParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionParams(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TransactionParams$$serializer.INSTANCE.getDescriptor());
        }
        this.orderId = str;
        this.orderType = i2;
    }

    public static final /* synthetic */ void EZpvd(TransactionParams transactionParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, transactionParams.orderId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, transactionParams.orderType);
    }

    public TransactionParams(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
        this.orderType = i;
    }
}
