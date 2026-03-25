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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OffshoreCovertToPayParams implements Parcelable {
    public static final int $stable = 0;
    public final String fromMasterCurrencyId;
    public final String fromTokenCoinTypeNo;
    public final String toTokenCoinTypeNo;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OffshoreCovertToPayParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OffshoreCovertToPayParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OffshoreCovertToPayParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OffshoreCovertToPayParams(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OffshoreCovertToPayParams[] newArray(int i) {
            return new OffshoreCovertToPayParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OffshoreCovertToPayParams copy$default(OffshoreCovertToPayParams offshoreCovertToPayParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offshoreCovertToPayParams.fromTokenCoinTypeNo;
        }
        if ((i & 2) != 0) {
            str2 = offshoreCovertToPayParams.toTokenCoinTypeNo;
        }
        if ((i & 4) != 0) {
            str3 = offshoreCovertToPayParams.fromMasterCurrencyId;
        }
        return offshoreCovertToPayParams.copydefault(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OffshoreCovertToPayParams copydefault(String str, String str2, String str3) {
        return new OffshoreCovertToPayParams(str, str2, str3);
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
        if (!(obj instanceof OffshoreCovertToPayParams)) {
            return false;
        }
        OffshoreCovertToPayParams offshoreCovertToPayParams = (OffshoreCovertToPayParams) obj;
        return Intrinsics.EZpvd((Object) this.fromTokenCoinTypeNo, (Object) offshoreCovertToPayParams.fromTokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.toTokenCoinTypeNo, (Object) offshoreCovertToPayParams.toTokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.fromMasterCurrencyId, (Object) offshoreCovertToPayParams.fromMasterCurrencyId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.fromTokenCoinTypeNo;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.toTokenCoinTypeNo;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fromMasterCurrencyId;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OffshoreCovertToPayParams(fromTokenCoinTypeNo=" + this.fromTokenCoinTypeNo + ", toTokenCoinTypeNo=" + this.toTokenCoinTypeNo + ", fromMasterCurrencyId=" + this.fromMasterCurrencyId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fromTokenCoinTypeNo);
        parcel.writeString(this.toTokenCoinTypeNo);
        parcel.writeString(this.fromMasterCurrencyId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.OffshoreCovertToPayParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OffshoreCovertToPayParams> serializer() {
            return OffshoreCovertToPayParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OffshoreCovertToPayParams(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, OffshoreCovertToPayParams$$serializer.INSTANCE.getDescriptor());
        }
        this.fromTokenCoinTypeNo = str;
        this.toTokenCoinTypeNo = str2;
        this.fromMasterCurrencyId = str3;
    }

    public static final /* synthetic */ void EZpvd(OffshoreCovertToPayParams offshoreCovertToPayParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, offshoreCovertToPayParams.fromTokenCoinTypeNo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, offshoreCovertToPayParams.toTokenCoinTypeNo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, offshoreCovertToPayParams.fromMasterCurrencyId);
    }

    public OffshoreCovertToPayParams(String str, String str2, String str3) {
        this.fromTokenCoinTypeNo = str;
        this.toTokenCoinTypeNo = str2;
        this.fromMasterCurrencyId = str3;
    }
}
