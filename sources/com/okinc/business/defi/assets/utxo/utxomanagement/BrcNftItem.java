package com.okinc.business.defi.assets.utxo.utxomanagement;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class BrcNftItem implements Parcelable {
    public static final int $stable = 0;
    public final String bizNftId;
    public final Long chainId;
    public final String id;
    public final String imgUrl;
    public final Boolean isBrc20Nft;
    public final boolean isValuable;
    public final String location;
    public final String name;
    public final Boolean platformSupport;
    public final String ticker;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BrcNftItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BrcNftItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BrcNftItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf2 = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BrcNftItem(string, string2, lValueOf, boolValueOf, string3, string4, string5, string6, boolValueOf2, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BrcNftItem[] newArray(int i) {
            return new BrcNftItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BrcNftItem() {
        this((String) null, (String) null, (Long) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, false, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BrcNftItem copydefault(String str, String str2, Long l, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, boolean z) {
        return new BrcNftItem(str, str2, l, bool, str3, str4, str5, str6, bool2, z);
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
        if (!(obj instanceof BrcNftItem)) {
            return false;
        }
        BrcNftItem brcNftItem = (BrcNftItem) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) brcNftItem.id) && Intrinsics.EZpvd((Object) this.location, (Object) brcNftItem.location) && Intrinsics.EZpvd(this.chainId, brcNftItem.chainId) && Intrinsics.EZpvd(this.isBrc20Nft, brcNftItem.isBrc20Nft) && Intrinsics.EZpvd((Object) this.imgUrl, (Object) brcNftItem.imgUrl) && Intrinsics.EZpvd((Object) this.name, (Object) brcNftItem.name) && Intrinsics.EZpvd((Object) this.ticker, (Object) brcNftItem.ticker) && Intrinsics.EZpvd((Object) this.bizNftId, (Object) brcNftItem.bizNftId) && Intrinsics.EZpvd(this.platformSupport, brcNftItem.platformSupport) && this.isValuable == brcNftItem.isValuable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.location;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Long l = this.chainId;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Boolean bool = this.isBrc20Nft;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        String str3 = this.imgUrl;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.name;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.ticker;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.bizNftId;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        Boolean bool2 = this.platformSupport;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (bool2 != null ? bool2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isValuable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BrcNftItem(id=" + this.id + ", location=" + this.location + ", chainId=" + this.chainId + ", isBrc20Nft=" + this.isBrc20Nft + ", imgUrl=" + this.imgUrl + ", name=" + this.name + ", ticker=" + this.ticker + ", bizNftId=" + this.bizNftId + ", platformSupport=" + this.platformSupport + ", isValuable=" + this.isValuable + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.location);
        Long l = this.chainId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool = this.isBrc20Nft;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.imgUrl);
        parcel.writeString(this.name);
        parcel.writeString(this.ticker);
        parcel.writeString(this.bizNftId);
        Boolean bool2 = this.platformSupport;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.isValuable ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.utxo.utxomanagement.BrcNftItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BrcNftItem> serializer() {
            return BrcNftItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BrcNftItem(int i, String str, String str2, Long l, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.location = null;
        } else {
            this.location = str2;
        }
        if ((i & 4) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
        if ((i & 8) == 0) {
            this.isBrc20Nft = null;
        } else {
            this.isBrc20Nft = bool;
        }
        if ((i & 16) == 0) {
            this.imgUrl = null;
        } else {
            this.imgUrl = str3;
        }
        if ((i & 32) == 0) {
            this.name = null;
        } else {
            this.name = str4;
        }
        if ((i & 64) == 0) {
            this.ticker = null;
        } else {
            this.ticker = str5;
        }
        if ((i & 128) == 0) {
            this.bizNftId = null;
        } else {
            this.bizNftId = str6;
        }
        if ((i & 256) == 0) {
            this.platformSupport = null;
        } else {
            this.platformSupport = bool2;
        }
        if ((i & 512) == 0) {
            this.isValuable = false;
        } else {
            this.isValuable = z;
        }
    }

    public static final /* synthetic */ void AEQbTJ(BrcNftItem brcNftItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || brcNftItem.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, brcNftItem.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || brcNftItem.location != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, brcNftItem.location);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || brcNftItem.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, brcNftItem.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || brcNftItem.isBrc20Nft != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, brcNftItem.isBrc20Nft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || brcNftItem.imgUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, brcNftItem.imgUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || brcNftItem.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, brcNftItem.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || brcNftItem.ticker != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, brcNftItem.ticker);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || brcNftItem.bizNftId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, brcNftItem.bizNftId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || brcNftItem.platformSupport != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, brcNftItem.platformSupport);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || brcNftItem.isValuable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, brcNftItem.isValuable);
        }
    }

    public BrcNftItem(String str, String str2, Long l, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, boolean z) {
        this.id = str;
        this.location = str2;
        this.chainId = l;
        this.isBrc20Nft = bool;
        this.imgUrl = str3;
        this.name = str4;
        this.ticker = str5;
        this.bizNftId = str6;
        this.platformSupport = bool2;
        this.isValuable = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r14v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r15v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.Boolean) : (null java.lang.Boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (r22v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, boolean):void (m)] (LINE:79) call: com.okinc.business.defi.assets.utxo.utxomanagement.BrcNftItem.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, boolean):void type: THIS */
    public /* synthetic */ BrcNftItem(String str, String str2, Long l, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) == 0 ? bool2 : null, (i & 512) != 0 ? false : z);
    }
}
