package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AddressCoinPriceInfo implements Parcelable {
    public static final int $stable = 0;
    private final String address;
    private final long chainId;
    private final Boolean hasPercent;
    private final Boolean hasPrice;
    private final String price;
    private final String priceChangePercent24h;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AddressCoinPriceInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AddressCoinPriceInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCoinPriceInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AddressCoinPriceInfo(string, boolValueOf, string2, boolValueOf2, parcel.readString(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCoinPriceInfo[] newArray(int i) {
            return new AddressCoinPriceInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddressCoinPriceInfo copy$default(AddressCoinPriceInfo addressCoinPriceInfo, String str, Boolean bool, String str2, Boolean bool2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressCoinPriceInfo.address;
        }
        if ((i & 2) != 0) {
            bool = addressCoinPriceInfo.hasPrice;
        }
        Boolean bool3 = bool;
        if ((i & 4) != 0) {
            str2 = addressCoinPriceInfo.price;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            bool2 = addressCoinPriceInfo.hasPercent;
        }
        Boolean bool4 = bool2;
        if ((i & 16) != 0) {
            str3 = addressCoinPriceInfo.priceChangePercent24h;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            j = addressCoinPriceInfo.chainId;
        }
        return addressCoinPriceInfo.copy(str, bool3, str4, bool4, str5, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.hasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.hasPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.priceChangePercent24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCoinPriceInfo copy(String str, Boolean bool, String str2, Boolean bool2, String str3, long j) {
        return new AddressCoinPriceInfo(str, bool, str2, bool2, str3, j);
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
        if (!(obj instanceof AddressCoinPriceInfo)) {
            return false;
        }
        AddressCoinPriceInfo addressCoinPriceInfo = (AddressCoinPriceInfo) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) addressCoinPriceInfo.address) && Intrinsics.EZpvd(this.hasPrice, addressCoinPriceInfo.hasPrice) && Intrinsics.EZpvd((Object) this.price, (Object) addressCoinPriceInfo.price) && Intrinsics.EZpvd(this.hasPercent, addressCoinPriceInfo.hasPercent) && Intrinsics.EZpvd((Object) this.priceChangePercent24h, (Object) addressCoinPriceInfo.priceChangePercent24h) && this.chainId == addressCoinPriceInfo.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasPercent() {
        return this.hasPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasPrice() {
        return this.hasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceChangePercent24h() {
        return this.priceChangePercent24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.hasPrice;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        String str2 = this.price;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Boolean bool2 = this.hasPercent;
        int iHashCode4 = bool2 == null ? 0 : bool2.hashCode();
        String str3 = this.priceChangePercent24h;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.chainId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressCoinPriceInfo(address=" + this.address + ", hasPrice=" + this.hasPrice + ", price=" + this.price + ", hasPercent=" + this.hasPercent + ", priceChangePercent24h=" + this.priceChangePercent24h + ", chainId=" + this.chainId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        Boolean bool = this.hasPrice;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.price);
        Boolean bool2 = this.hasPercent;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.priceChangePercent24h);
        parcel.writeLong(this.chainId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddressCoinPriceInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressCoinPriceInfo> serializer() {
            return AddressCoinPriceInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressCoinPriceInfo(int i, String str, Boolean bool, String str2, Boolean bool2, String str3, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (32 != (i & 32)) {
            PluginExceptionsKt.throwMissingFieldException(i, 32, AddressCoinPriceInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.address = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.hasPrice = Boolean.FALSE;
        } else {
            this.hasPrice = bool;
        }
        if ((i & 4) == 0) {
            this.price = "";
        } else {
            this.price = str2;
        }
        if ((i & 8) == 0) {
            this.hasPercent = Boolean.FALSE;
        } else {
            this.hasPercent = bool2;
        }
        if ((i & 16) == 0) {
            this.priceChangePercent24h = "";
        } else {
            this.priceChangePercent24h = str3;
        }
        this.chainId = j;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AddressCoinPriceInfo addressCoinPriceInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || addressCoinPriceInfo.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, addressCoinPriceInfo.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(addressCoinPriceInfo.hasPrice, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, addressCoinPriceInfo.hasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) addressCoinPriceInfo.price, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, addressCoinPriceInfo.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(addressCoinPriceInfo.hasPercent, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, addressCoinPriceInfo.hasPercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) addressCoinPriceInfo.priceChangePercent24h, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, addressCoinPriceInfo.priceChangePercent24h);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 5, addressCoinPriceInfo.chainId);
    }

    public AddressCoinPriceInfo(String str, Boolean bool, String str2, Boolean bool2, String str3, long j) {
        this.address = str;
        this.hasPrice = bool;
        this.price = str2;
        this.hasPercent = bool2;
        this.priceChangePercent24h = str3;
        this.chainId = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r11v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r13v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (r15v0 long)
 A[MD:(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, long):void (m)] (LINE:1784) call: com.okinc.business.defi.biz.net.bean.AddressCoinPriceInfo.<init>(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, long):void type: THIS */
    public /* synthetic */ AddressCoinPriceInfo(String str, Boolean bool, String str2, Boolean bool2, String str3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? Boolean.FALSE : bool2, (i & 16) != 0 ? "" : str3, j);
    }
}
