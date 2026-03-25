package com.okinc.business.defi.biz.model;

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
import o.C10854bwM;
import o.C10954byG;
import o.C8322bAY;
import o.InterfaceC9780bbz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ChainAddress implements Parcelable, InterfaceC9780bbz {
    private String address;
    private int addressType;
    private String addressTypeText;
    private long chainId;
    private long coinId;
    private String derivePath;
    private String eoaAddress;
    private boolean isDefault;
    private String proxyAddres;
    private String publicKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChainAddress> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ChainAddress> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChainAddress createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChainAddress(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChainAddress[] newArray(int i) {
            return new ChainAddress[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.proxyAddres;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.eoaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.derivePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainAddress copy(long j, @NotNull String str, int i, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ChainAddress(j, str, i, str2, str3, z, str4, str5);
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
        if (!(obj instanceof ChainAddress)) {
            return false;
        }
        ChainAddress chainAddress = (ChainAddress) obj;
        return this.coinId == chainAddress.coinId && Intrinsics.EZpvd((Object) this.address, (Object) chainAddress.address) && this.addressType == chainAddress.addressType && Intrinsics.EZpvd((Object) this.proxyAddres, (Object) chainAddress.proxyAddres) && Intrinsics.EZpvd((Object) this.eoaAddress, (Object) chainAddress.eoaAddress) && this.isDefault == chainAddress.isDefault && Intrinsics.EZpvd((Object) this.publicKey, (Object) chainAddress.publicKey) && Intrinsics.EZpvd((Object) this.derivePath, (Object) chainAddress.derivePath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9780bbz
    public String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9780bbz
    public int getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9780bbz
    public long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDerivePath() {
        return this.derivePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9780bbz
    public String getEoaAddress() {
        return this.eoaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getProxyAddres() {
        return this.proxyAddres;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9780bbz
    public String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((Long.hashCode(this.coinId) * 31) + this.address.hashCode()) * 31) + Integer.hashCode(this.addressType)) * 31) + this.proxyAddres.hashCode()) * 31) + this.eoaAddress.hashCode()) * 31) + Boolean.hashCode(this.isDefault)) * 31) + this.publicKey.hashCode()) * 31) + this.derivePath.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDefault() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAddressType(int i) {
        this.addressType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAddressTypeText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.addressTypeText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefault(boolean z) {
        this.isDefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDerivePath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.derivePath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setEoaAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eoaAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setProxyAddres(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.proxyAddres = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPublicKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.publicKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChainAddress(coinId=" + this.coinId + ", address=" + this.address + ", addressType=" + this.addressType + ", proxyAddres=" + this.proxyAddres + ", eoaAddress=" + this.eoaAddress + ", isDefault=" + this.isDefault + ", publicKey=" + this.publicKey + ", derivePath=" + this.derivePath + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.coinId);
        parcel.writeString(this.address);
        parcel.writeInt(this.addressType);
        parcel.writeString(this.proxyAddres);
        parcel.writeString(this.eoaAddress);
        parcel.writeInt(this.isDefault ? 1 : 0);
        parcel.writeString(this.publicKey);
        parcel.writeString(this.derivePath);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.model.ChainAddress.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChainAddress> serializer() {
            return ChainAddress$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChainAddress(int i, long j, String str, int i2, String str2, String str3, boolean z, String str4, String str5, long j2, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (231 != (i & 231)) {
            PluginExceptionsKt.throwMissingFieldException(i, 231, ChainAddress$$serializer.INSTANCE.getDescriptor());
        }
        this.coinId = j;
        this.address = str;
        this.addressType = i2;
        if ((i & 8) == 0) {
            this.proxyAddres = "";
        } else {
            this.proxyAddres = str2;
        }
        if ((i & 16) == 0) {
            this.eoaAddress = "";
        } else {
            this.eoaAddress = str3;
        }
        this.isDefault = z;
        this.publicKey = str4;
        this.derivePath = str5;
        if ((i & 256) == 0) {
            this.chainId = -1L;
        } else {
            this.chainId = j2;
        }
        if ((i & 512) == 0) {
            this.addressTypeText = "";
        } else {
            this.addressTypeText = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ChainAddress chainAddress, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, chainAddress.getCoinId());
        compositeEncoder.encodeStringElement(serialDescriptor, 1, chainAddress.getAddress());
        compositeEncoder.encodeIntElement(serialDescriptor, 2, chainAddress.getAddressType());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) chainAddress.getProxyAddres(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, chainAddress.getProxyAddres());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) chainAddress.getEoaAddress(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, chainAddress.getEoaAddress());
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 5, chainAddress.isDefault);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, chainAddress.getPublicKey());
        compositeEncoder.encodeStringElement(serialDescriptor, 7, chainAddress.derivePath);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || chainAddress.getChainId() != -1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 8, chainAddress.getChainId());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) chainAddress.getAddressTypeText(), (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, chainAddress.getAddressTypeText());
    }

    public ChainAddress(long j, @NotNull String str, int i, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.coinId = j;
        this.address = str;
        this.addressType = i;
        this.proxyAddres = str2;
        this.eoaAddress = str3;
        this.isDefault = z;
        this.publicKey = str4;
        this.derivePath = str5;
        this.chainId = -1L;
        this.addressTypeText = "";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r13v0 long)
  (r15v0 java.lang.String)
  (r16v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (r19v0 boolean)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
 A[MD:(long, java.lang.String, int, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:14) call: com.okinc.business.defi.biz.model.ChainAddress.<init>(long, java.lang.String, int, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ChainAddress(long j, String str, int i, String str2, String str3, boolean z, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, i, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, z, str4, str5);
    }

    @Override // o.InterfaceC9780bbz
    public long getChainId() {
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(Long.valueOf(getCoinId()));
        if (c10854bwMKWHzl != null) {
            return c10854bwMKWHzl.fetchVPNInfo();
        }
        return -1L;
    }

    @Override // o.InterfaceC9780bbz
    public String getAddressTypeText() {
        return C8322bAY.getAddressFormat$default(C8322bAY.KWHzl, getAddressType(), false, 2, null);
    }
}
