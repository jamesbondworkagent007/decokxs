package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AAGenerateRes implements Parcelable {
    public static final int $stable = 0;
    private final String aaAddress;
    private final Long chainId;
    private final String eoaAddress;
    private final String proxyAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AAGenerateRes> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AAGenerateRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AAGenerateRes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AAGenerateRes(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AAGenerateRes[] newArray(int i) {
            return new AAGenerateRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AAGenerateRes() {
        this((String) null, (Long) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AAGenerateRes copy$default(AAGenerateRes aAGenerateRes, String str, Long l, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aAGenerateRes.eoaAddress;
        }
        if ((i & 2) != 0) {
            l = aAGenerateRes.chainId;
        }
        if ((i & 4) != 0) {
            str2 = aAGenerateRes.aaAddress;
        }
        if ((i & 8) != 0) {
            str3 = aAGenerateRes.proxyAddress;
        }
        return aAGenerateRes.copy(str, l, str2, str3);
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
    public final String component3() {
        return this.aaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.proxyAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAGenerateRes copy(String str, Long l, String str2, String str3) {
        return new AAGenerateRes(str, l, str2, str3);
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
        if (!(obj instanceof AAGenerateRes)) {
            return false;
        }
        AAGenerateRes aAGenerateRes = (AAGenerateRes) obj;
        return Intrinsics.EZpvd((Object) this.eoaAddress, (Object) aAGenerateRes.eoaAddress) && Intrinsics.EZpvd(this.chainId, aAGenerateRes.chainId) && Intrinsics.EZpvd((Object) this.aaAddress, (Object) aAGenerateRes.aaAddress) && Intrinsics.EZpvd((Object) this.proxyAddress, (Object) aAGenerateRes.proxyAddress);
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
        String str2 = this.aaAddress;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.proxyAddress;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AAGenerateRes(eoaAddress=" + this.eoaAddress + ", chainId=" + this.chainId + ", aaAddress=" + this.aaAddress + ", proxyAddress=" + this.proxyAddress + ")";
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
        parcel.writeString(this.aaAddress);
        parcel.writeString(this.proxyAddress);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AAGenerateRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AAGenerateRes> serializer() {
            return AAGenerateRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AAGenerateRes(int i, String str, Long l, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.aaAddress = null;
        } else {
            this.aaAddress = str2;
        }
        if ((i & 8) == 0) {
            this.proxyAddress = null;
        } else {
            this.proxyAddress = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AAGenerateRes aAGenerateRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || aAGenerateRes.eoaAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, aAGenerateRes.eoaAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || aAGenerateRes.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, aAGenerateRes.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || aAGenerateRes.aaAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, aAGenerateRes.aaAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && aAGenerateRes.proxyAddress == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, aAGenerateRes.proxyAddress);
    }

    public AAGenerateRes(String str, Long l, String str2, String str3) {
        this.eoaAddress = str;
        this.chainId = l;
        this.aaAddress = str2;
        this.proxyAddress = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Long, java.lang.String, java.lang.String):void (m)] (LINE:1226) call: com.okinc.business.defi.biz.net.bean.AAGenerateRes.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AAGenerateRes(String str, Long l, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
