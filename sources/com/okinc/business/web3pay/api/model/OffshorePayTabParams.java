package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OffshorePayTabParams implements Parcelable {
    public static final int $stable = 0;
    public final PayMethod payMethod;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OffshorePayTabParams> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.business.web3pay.api.model.PayMethod", PayMethod.values())};

    public static final class Creator implements Parcelable.Creator<OffshorePayTabParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OffshorePayTabParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OffshorePayTabParams(parcel.readInt() == 0 ? null : PayMethod.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OffshorePayTabParams[] newArray(int i) {
            return new OffshorePayTabParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OffshorePayTabParams copy$default(OffshorePayTabParams offshorePayTabParams, PayMethod payMethod, int i, Object obj) {
        if ((i & 1) != 0) {
            payMethod = offshorePayTabParams.payMethod;
        }
        return offshorePayTabParams.KWHzl(payMethod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OffshorePayTabParams KWHzl(PayMethod payMethod) {
        return new OffshorePayTabParams(payMethod);
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
        return (obj instanceof OffshorePayTabParams) && this.payMethod == ((OffshorePayTabParams) obj).payMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        PayMethod payMethod = this.payMethod;
        if (payMethod == null) {
            return 0;
        }
        return payMethod.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OffshorePayTabParams(payMethod=" + this.payMethod + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        PayMethod payMethod = this.payMethod;
        if (payMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(payMethod.name());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.OffshorePayTabParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OffshorePayTabParams> serializer() {
            return OffshorePayTabParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OffshorePayTabParams(int i, PayMethod payMethod, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, OffshorePayTabParams$$serializer.INSTANCE.getDescriptor());
        }
        this.payMethod = payMethod;
    }

    public OffshorePayTabParams(PayMethod payMethod) {
        this.payMethod = payMethod;
    }
}
