package com.okinc.business.dex.trade.core.domain.model.common;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class NetworkFee implements Parcelable {
    public static final int $stable = 0;
    private final String priorityFee;
    private final String priorityFeeType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<NetworkFee> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NetworkFee> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkFee createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NetworkFee(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkFee[] newArray(int i) {
            return new NetworkFee[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NetworkFee copy$default(NetworkFee networkFee, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkFee.priorityFee;
        }
        if ((i & 2) != 0) {
            str2 = networkFee.priorityFeeType;
        }
        return networkFee.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkFee copy(String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new NetworkFee(str, str2);
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
        if (!(obj instanceof NetworkFee)) {
            return false;
        }
        NetworkFee networkFee = (NetworkFee) obj;
        return Intrinsics.EZpvd((Object) this.priorityFee, (Object) networkFee.priorityFee) && Intrinsics.EZpvd((Object) this.priorityFeeType, (Object) networkFee.priorityFeeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFeeType() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.priorityFee;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.priorityFeeType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NetworkFee(priorityFee=" + this.priorityFee + ", priorityFeeType=" + this.priorityFeeType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.priorityFee);
        parcel.writeString(this.priorityFeeType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.common.NetworkFee.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NetworkFee> serializer() {
            return NetworkFee$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NetworkFee(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, NetworkFee$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.priorityFee = null;
        } else {
            this.priorityFee = str;
        }
        this.priorityFeeType = str2;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(NetworkFee networkFee, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || networkFee.priorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, networkFee.priorityFee);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, networkFee.priorityFeeType);
    }

    public NetworkFee(String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.priorityFee = str;
        this.priorityFeeType = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
  (r2v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:139) call: com.okinc.business.dex.trade.core.domain.model.common.NetworkFee.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NetworkFee(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2);
    }
}
