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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AAActiveRes implements Parcelable {
    public static final int $stable = 0;
    private final String aaAddress;
    private final Long chainId;
    private final String eoaAddress;
    private final Boolean isActive;
    private final String proxyAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AAActiveRes> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AAActiveRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AAActiveRes createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AAActiveRes(string, lValueOf, boolValueOf, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AAActiveRes[] newArray(int i) {
            return new AAActiveRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AAActiveRes() {
        this((String) null, (Long) null, (Boolean) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AAActiveRes copy$default(AAActiveRes aAActiveRes, String str, Long l, Boolean bool, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aAActiveRes.eoaAddress;
        }
        if ((i & 2) != 0) {
            l = aAActiveRes.chainId;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            bool = aAActiveRes.isActive;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            str2 = aAActiveRes.aaAddress;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = aAActiveRes.proxyAddress;
        }
        return aAActiveRes.copy(str, l2, bool2, str4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.eoaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.aaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.proxyAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAActiveRes copy(String str, Long l, Boolean bool, String str2, String str3) {
        return new AAActiveRes(str, l, bool, str2, str3);
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
        if (!(obj instanceof AAActiveRes)) {
            return false;
        }
        AAActiveRes aAActiveRes = (AAActiveRes) obj;
        return Intrinsics.EZpvd((Object) this.eoaAddress, (Object) aAActiveRes.eoaAddress) && Intrinsics.EZpvd(this.chainId, aAActiveRes.chainId) && Intrinsics.EZpvd(this.isActive, aAActiveRes.isActive) && Intrinsics.EZpvd((Object) this.aaAddress, (Object) aAActiveRes.aaAddress) && Intrinsics.EZpvd((Object) this.proxyAddress, (Object) aAActiveRes.proxyAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAaAddress() {
        return this.aaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEoaAddress() {
        return this.eoaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProxyAddress() {
        return this.proxyAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.eoaAddress;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.chainId;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Boolean bool = this.isActive;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str2 = this.aaAddress;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.proxyAddress;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isActive() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AAActiveRes(eoaAddress=" + this.eoaAddress + ", chainId=" + this.chainId + ", isActive=" + this.isActive + ", aaAddress=" + this.aaAddress + ", proxyAddress=" + this.proxyAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.eoaAddress);
        Long l = this.chainId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool = this.isActive;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.aaAddress);
        parcel.writeString(this.proxyAddress);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AAActiveRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AAActiveRes> serializer() {
            return AAActiveRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AAActiveRes(int i, String str, Long l, Boolean bool, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.eoaAddress = null;
        } else {
            this.eoaAddress = str;
        }
        if ((i & 2) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
        if ((i & 4) == 0) {
            this.isActive = Boolean.FALSE;
        } else {
            this.isActive = bool;
        }
        if ((i & 8) == 0) {
            this.aaAddress = null;
        } else {
            this.aaAddress = str2;
        }
        if ((i & 16) == 0) {
            this.proxyAddress = null;
        } else {
            this.proxyAddress = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AAActiveRes aAActiveRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || aAActiveRes.eoaAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, aAActiveRes.eoaAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || aAActiveRes.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, aAActiveRes.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(aAActiveRes.isActive, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, aAActiveRes.isActive);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || aAActiveRes.aaAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, aAActiveRes.aaAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && aAActiveRes.proxyAddress == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, aAActiveRes.proxyAddress);
    }

    public AAActiveRes(String str, Long l, Boolean bool, String str2, String str3) {
        this.eoaAddress = str;
        this.chainId = l;
        this.isActive = bool;
        this.aaAddress = str2;
        this.proxyAddress = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.lang.Boolean:0x0015: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0013: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r7v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:1236) call: com.okinc.business.defi.biz.net.bean.AAActiveRes.<init>(java.lang.String, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AAActiveRes(String str, Long l, Boolean bool, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
