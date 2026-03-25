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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class ChainInfo implements Parcelable {
    public static final int $stable = 0;
    private final String chainId;
    private final String chainName;
    private final String chainSymbol;
    private final String chainUsed;
    private final String id;
    private final boolean isMarketSupported;
    private final String logoUrl;
    private final String network;
    private final String tradeHashUrl;
    private final String walletExplorePrefix;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChainInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ChainInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChainInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChainInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChainInfo[] newArray(int i) {
            return new ChainInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChainInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.walletExplorePrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.logoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tradeHashUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isMarketSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new ChainInfo(str, str2, str3, str4, str5, str6, str7, str8, z, str9);
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
        if (!(obj instanceof ChainInfo)) {
            return false;
        }
        ChainInfo chainInfo = (ChainInfo) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) chainInfo.id) && Intrinsics.EZpvd((Object) this.chainName, (Object) chainInfo.chainName) && Intrinsics.EZpvd((Object) this.chainId, (Object) chainInfo.chainId) && Intrinsics.EZpvd((Object) this.chainSymbol, (Object) chainInfo.chainSymbol) && Intrinsics.EZpvd((Object) this.chainUsed, (Object) chainInfo.chainUsed) && Intrinsics.EZpvd((Object) this.logoUrl, (Object) chainInfo.logoUrl) && Intrinsics.EZpvd((Object) this.tradeHashUrl, (Object) chainInfo.tradeHashUrl) && Intrinsics.EZpvd((Object) this.network, (Object) chainInfo.network) && this.isMarketSupported == chainInfo.isMarketSupported && Intrinsics.EZpvd((Object) this.walletExplorePrefix, (Object) chainInfo.walletExplorePrefix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainSymbol() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainUsed() {
        return this.chainUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeHashUrl() {
        return this.tradeHashUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletExplorePrefix() {
        return this.walletExplorePrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.id.hashCode() * 31) + this.chainName.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.chainSymbol.hashCode()) * 31) + this.chainUsed.hashCode()) * 31) + this.logoUrl.hashCode()) * 31) + this.tradeHashUrl.hashCode()) * 31) + this.network.hashCode()) * 31) + Boolean.hashCode(this.isMarketSupported)) * 31) + this.walletExplorePrefix.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMarketSupported() {
        return this.isMarketSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChainInfo(id=" + this.id + ", chainName=" + this.chainName + ", chainId=" + this.chainId + ", chainSymbol=" + this.chainSymbol + ", chainUsed=" + this.chainUsed + ", logoUrl=" + this.logoUrl + ", tradeHashUrl=" + this.tradeHashUrl + ", network=" + this.network + ", isMarketSupported=" + this.isMarketSupported + ", walletExplorePrefix=" + this.walletExplorePrefix + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.chainName);
        parcel.writeString(this.chainId);
        parcel.writeString(this.chainSymbol);
        parcel.writeString(this.chainUsed);
        parcel.writeString(this.logoUrl);
        parcel.writeString(this.tradeHashUrl);
        parcel.writeString(this.network);
        parcel.writeInt(this.isMarketSupported ? 1 : 0);
        parcel.writeString(this.walletExplorePrefix);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.api.bean.ChainInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChainInfo> serializer() {
            return ChainInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChainInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str2;
        }
        if ((i & 4) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str3;
        }
        if ((i & 8) == 0) {
            this.chainSymbol = "";
        } else {
            this.chainSymbol = str4;
        }
        if ((i & 16) == 0) {
            this.chainUsed = "";
        } else {
            this.chainUsed = str5;
        }
        if ((i & 32) == 0) {
            this.logoUrl = "";
        } else {
            this.logoUrl = str6;
        }
        if ((i & 64) == 0) {
            this.tradeHashUrl = "";
        } else {
            this.tradeHashUrl = str7;
        }
        if ((i & 128) == 0) {
            this.network = "";
        } else {
            this.network = str8;
        }
        if ((i & 256) == 0) {
            this.isMarketSupported = true;
        } else {
            this.isMarketSupported = z;
        }
        if ((i & 512) == 0) {
            this.walletExplorePrefix = "";
        } else {
            this.walletExplorePrefix = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_api(ChainInfo chainInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) chainInfo.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, chainInfo.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) chainInfo.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, chainInfo.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) chainInfo.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, chainInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) chainInfo.chainSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, chainInfo.chainSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) chainInfo.chainUsed, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, chainInfo.chainUsed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) chainInfo.logoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, chainInfo.logoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) chainInfo.tradeHashUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, chainInfo.tradeHashUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) chainInfo.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, chainInfo.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !chainInfo.isMarketSupported) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, chainInfo.isMarketSupported);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) chainInfo.walletExplorePrefix, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, chainInfo.walletExplorePrefix);
    }

    public ChainInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.id = str;
        this.chainName = str2;
        this.chainId = str3;
        this.chainSymbol = str4;
        this.chainUsed = str5;
        this.logoUrl = str6;
        this.tradeHashUrl = str7;
        this.network = str8;
        this.isMarketSupported = z;
        this.walletExplorePrefix = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r20v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:120) call: com.okinc.business.dex.api.bean.ChainInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ ChainInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? true : z, (i & 512) == 0 ? str9 : "");
    }
}
