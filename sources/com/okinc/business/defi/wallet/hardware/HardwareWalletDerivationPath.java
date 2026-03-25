package com.okinc.business.defi.wallet.hardware;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.wallet.api.bean.AddressType;
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

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class HardwareWalletDerivationPath implements Parcelable {
    public static final int $stable = 0;
    private final AddressType addressType;
    private final String description;
    private final int id;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<HardwareWalletDerivationPath> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.wallet.api.bean.AddressType", AddressType.values())};

    public static final class Creator implements Parcelable.Creator<HardwareWalletDerivationPath> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HardwareWalletDerivationPath createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HardwareWalletDerivationPath(parcel.readInt(), parcel.readString(), parcel.readString(), AddressType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HardwareWalletDerivationPath[] newArray(int i) {
            return new HardwareWalletDerivationPath[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HardwareWalletDerivationPath copy$default(HardwareWalletDerivationPath hardwareWalletDerivationPath, int i, String str, String str2, AddressType addressType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hardwareWalletDerivationPath.id;
        }
        if ((i2 & 2) != 0) {
            str = hardwareWalletDerivationPath.title;
        }
        if ((i2 & 4) != 0) {
            str2 = hardwareWalletDerivationPath.description;
        }
        if ((i2 & 8) != 0) {
            addressType = hardwareWalletDerivationPath.addressType;
        }
        return hardwareWalletDerivationPath.copy(i, str, str2, addressType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressType component4() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HardwareWalletDerivationPath copy(int i, @NotNull String str, String str2, @NotNull AddressType addressType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(addressType, "");
        return new HardwareWalletDerivationPath(i, str, str2, addressType);
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
        if (!(obj instanceof HardwareWalletDerivationPath)) {
            return false;
        }
        HardwareWalletDerivationPath hardwareWalletDerivationPath = (HardwareWalletDerivationPath) obj;
        return this.id == hardwareWalletDerivationPath.id && Intrinsics.EZpvd((Object) this.title, (Object) hardwareWalletDerivationPath.title) && Intrinsics.EZpvd((Object) this.description, (Object) hardwareWalletDerivationPath.description) && this.addressType == hardwareWalletDerivationPath.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressType getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id);
        int iHashCode2 = this.title.hashCode();
        String str = this.description;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.addressType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HardwareWalletDerivationPath(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", addressType=" + this.addressType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.addressType.name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.hardware.HardwareWalletDerivationPath.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HardwareWalletDerivationPath> serializer() {
            return HardwareWalletDerivationPath$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HardwareWalletDerivationPath(int i, int i2, String str, String str2, AddressType addressType, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, HardwareWalletDerivationPath$$serializer.INSTANCE.getDescriptor());
        }
        this.id = (i & 1) == 0 ? -1 : i2;
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        this.addressType = addressType;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(HardwareWalletDerivationPath hardwareWalletDerivationPath, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || hardwareWalletDerivationPath.id != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, hardwareWalletDerivationPath.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) hardwareWalletDerivationPath.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, hardwareWalletDerivationPath.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || hardwareWalletDerivationPath.description != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, hardwareWalletDerivationPath.description);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], hardwareWalletDerivationPath.addressType);
    }

    public HardwareWalletDerivationPath(int i, @NotNull String str, String str2, @NotNull AddressType addressType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(addressType, "");
        this.id = i;
        this.title = str;
        this.description = str2;
        this.addressType = addressType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r1v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (r4v0 com.okinc.wallet.api.bean.AddressType)
 A[MD:(int, java.lang.String, java.lang.String, com.okinc.wallet.api.bean.AddressType):void (m)] (LINE:108) call: com.okinc.business.defi.wallet.hardware.HardwareWalletDerivationPath.<init>(int, java.lang.String, java.lang.String, com.okinc.wallet.api.bean.AddressType):void type: THIS */
    public /* synthetic */ HardwareWalletDerivationPath(int i, String str, String str2, AddressType addressType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : str2, addressType);
    }
}
