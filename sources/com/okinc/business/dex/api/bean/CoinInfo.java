package com.okinc.business.dex.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CoinInfo implements Parcelable {
    public static final int $stable = 0;
    private final String chainId;
    private final boolean isNativeToken;
    private final String tokenAddress;
    private final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CoinInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CoinInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoinInfo(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinInfo[] newArray(int i) {
            return new CoinInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinInfo() {
        this((String) null, (String) null, false, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoinInfo copy$default(CoinInfo coinInfo, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coinInfo.chainId;
        }
        if ((i & 2) != 0) {
            str2 = coinInfo.tokenAddress;
        }
        if ((i & 4) != 0) {
            z = coinInfo.isNativeToken;
        }
        if ((i & 8) != 0) {
            str3 = coinInfo.tokenSymbol;
        }
        return coinInfo.copy(str, str2, z, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinInfo copy(@NotNull String str, String str2, boolean z, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CoinInfo(str, str2, z, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNativeToken() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinInfo(chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", isNativeToken=" + this.isNativeToken + ", tokenSymbol=" + this.tokenSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.tokenAddress);
        parcel.writeInt(this.isNativeToken ? 1 : 0);
        parcel.writeString(this.tokenSymbol);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.api.bean.CoinInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinInfo> serializer() {
            return CoinInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinInfo(int i, String str, String str2, boolean z, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str2;
        }
        if ((i & 4) == 0) {
            this.isNativeToken = false;
        } else {
            this.isNativeToken = z;
        }
        if ((i & 8) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_api(CoinInfo coinInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) coinInfo.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, coinInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || coinInfo.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, coinInfo.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || coinInfo.isNativeToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, coinInfo.isNativeToken);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) coinInfo.tokenSymbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, coinInfo.tokenSymbol);
    }

    public CoinInfo(@NotNull String str, String str2, boolean z, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.chainId = str;
        this.tokenAddress = str2;
        this.isNativeToken = z;
        this.tokenSymbol = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:18) call: com.okinc.business.dex.api.bean.CoinInfo.<init>(java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ CoinInfo(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3);
    }

    public final boolean coinError() {
        String str = this.tokenAddress;
        return ((str == null || str.length() == 0) && !this.isNativeToken) || this.chainId.length() == 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof CoinInfo)) {
            return false;
        }
        CoinInfo coinInfo = (CoinInfo) obj;
        boolean z2 = coinInfo.isNativeToken;
        boolean z3 = z2 && this.isNativeToken;
        if (!z2 && !this.isNativeToken && Intrinsics.EZpvd((Object) coinInfo.tokenAddress, (Object) this.tokenAddress)) {
            z = true;
        }
        return z | z3;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
