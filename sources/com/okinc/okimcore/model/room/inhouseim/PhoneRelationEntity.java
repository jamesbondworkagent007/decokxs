package com.okinc.okimcore.model.room.inhouseim;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PhoneRelationEntity implements Parcelable {
    public static final int $stable = 0;
    private final String countryCode;
    private final String hash;
    private final boolean isSynced;
    private final String name;
    private final String nationalNumber;
    private final String okxRelationId;
    private final String phoneRelationId;
    private final String rawNumber;
    private final String rowId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PhoneRelationEntity> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PhoneRelationEntity> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneRelationEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PhoneRelationEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneRelationEntity[] newArray(int i) {
            return new PhoneRelationEntity[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.countryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isSynced;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.phoneRelationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.okxRelationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.rawNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.nationalNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PhoneRelationEntity copy(@NotNull String str, @NotNull String str2, String str3, boolean z, @NotNull String str4, String str5, String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new PhoneRelationEntity(str, str2, str3, z, str4, str5, str6, str7, str8);
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
        if (!(obj instanceof PhoneRelationEntity)) {
            return false;
        }
        PhoneRelationEntity phoneRelationEntity = (PhoneRelationEntity) obj;
        return Intrinsics.EZpvd((Object) this.hash, (Object) phoneRelationEntity.hash) && Intrinsics.EZpvd((Object) this.rowId, (Object) phoneRelationEntity.rowId) && Intrinsics.EZpvd((Object) this.countryCode, (Object) phoneRelationEntity.countryCode) && this.isSynced == phoneRelationEntity.isSynced && Intrinsics.EZpvd((Object) this.phoneRelationId, (Object) phoneRelationEntity.phoneRelationId) && Intrinsics.EZpvd((Object) this.okxRelationId, (Object) phoneRelationEntity.okxRelationId) && Intrinsics.EZpvd((Object) this.name, (Object) phoneRelationEntity.name) && Intrinsics.EZpvd((Object) this.rawNumber, (Object) phoneRelationEntity.rawNumber) && Intrinsics.EZpvd((Object) this.nationalNumber, (Object) phoneRelationEntity.nationalNumber);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHash() {
        return this.hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNationalNumber() {
        return this.nationalNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkxRelationId() {
        return this.okxRelationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhoneRelationId() {
        return this.phoneRelationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawNumber() {
        return this.rawNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRowId() {
        return this.rowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.hash.hashCode();
        int iHashCode2 = this.rowId.hashCode();
        String str = this.countryCode;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = Boolean.hashCode(this.isSynced);
        int iHashCode5 = this.phoneRelationId.hashCode();
        String str2 = this.okxRelationId;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.name;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.rawNumber.hashCode()) * 31) + this.nationalNumber.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSynced() {
        return this.isSynced;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PhoneRelationEntity(hash=" + this.hash + ", rowId=" + this.rowId + ", countryCode=" + this.countryCode + ", isSynced=" + this.isSynced + ", phoneRelationId=" + this.phoneRelationId + ", okxRelationId=" + this.okxRelationId + ", name=" + this.name + ", rawNumber=" + this.rawNumber + ", nationalNumber=" + this.nationalNumber + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.hash);
        parcel.writeString(this.rowId);
        parcel.writeString(this.countryCode);
        parcel.writeInt(this.isSynced ? 1 : 0);
        parcel.writeString(this.phoneRelationId);
        parcel.writeString(this.okxRelationId);
        parcel.writeString(this.name);
        parcel.writeString(this.rawNumber);
        parcel.writeString(this.nationalNumber);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PhoneRelationEntity> serializer() {
            return PhoneRelationEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PhoneRelationEntity(int i, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i, FrameMetricsAggregator.EVERY_DURATION, PhoneRelationEntity$$serializer.INSTANCE.getDescriptor());
        }
        this.hash = str;
        this.rowId = str2;
        this.countryCode = str3;
        this.isSynced = z;
        this.phoneRelationId = str4;
        this.okxRelationId = str5;
        this.name = str6;
        this.rawNumber = str7;
        this.nationalNumber = str8;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(PhoneRelationEntity phoneRelationEntity, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, phoneRelationEntity.hash);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, phoneRelationEntity.rowId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, phoneRelationEntity.countryCode);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, phoneRelationEntity.isSynced);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, phoneRelationEntity.phoneRelationId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, phoneRelationEntity.okxRelationId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, phoneRelationEntity.name);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, phoneRelationEntity.rawNumber);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, phoneRelationEntity.nationalNumber);
    }

    public PhoneRelationEntity(@NotNull String str, @NotNull String str2, String str3, boolean z, @NotNull String str4, String str5, String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.hash = str;
        this.rowId = str2;
        this.countryCode = str3;
        this.isSynced = z;
        this.phoneRelationId = str4;
        this.okxRelationId = str5;
        this.name = str6;
        this.rawNumber = str7;
        this.nationalNumber = str8;
    }
}
