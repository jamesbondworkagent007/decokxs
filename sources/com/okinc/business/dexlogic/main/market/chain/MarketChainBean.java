package com.okinc.business.dexlogic.main.market.chain;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class MarketChainBean implements Parcelable {
    public static final int $stable = 0;
    public static final String ALL_CHAIN_ID_TAG = "-100";
    private final String chainBWLogoUrl;
    private final String chainCustomLogo;
    private final String chainId;
    private final String chainLogo;
    private final String chainName;
    private final String nativeTokenSymbol;
    private final boolean needTop;
    private final boolean popularChain;
    private final String popularWeight;
    private final int resourceId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MarketChainBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MarketChainBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketChainBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MarketChainBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketChainBean[] newArray(int i) {
            return new MarketChainBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketChainBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, 0, (String) null, false, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.needTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainBWLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.popularChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.popularWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.resourceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.chainCustomLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketChainBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull String str6, int i, @NotNull String str7, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new MarketChainBean(str, str2, str3, str4, str5, z, str6, i, str7, z2);
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
        if (!(obj instanceof MarketChainBean)) {
            return false;
        }
        MarketChainBean marketChainBean = (MarketChainBean) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) marketChainBean.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) marketChainBean.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) marketChainBean.chainLogo) && Intrinsics.EZpvd((Object) this.nativeTokenSymbol, (Object) marketChainBean.nativeTokenSymbol) && Intrinsics.EZpvd((Object) this.chainBWLogoUrl, (Object) marketChainBean.chainBWLogoUrl) && this.popularChain == marketChainBean.popularChain && Intrinsics.EZpvd((Object) this.popularWeight, (Object) marketChainBean.popularWeight) && this.resourceId == marketChainBean.resourceId && Intrinsics.EZpvd((Object) this.chainCustomLogo, (Object) marketChainBean.chainCustomLogo) && this.needTop == marketChainBean.needTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainBWLogoUrl() {
        return this.chainBWLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainCustomLogo() {
        return this.chainCustomLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenSymbol() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedTop() {
        return this.needTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPopularChain() {
        return this.popularChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPopularWeight() {
        return this.popularWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getResourceId() {
        return this.resourceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.chainId.hashCode() * 31) + this.chainName.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + this.nativeTokenSymbol.hashCode()) * 31) + this.chainBWLogoUrl.hashCode()) * 31) + Boolean.hashCode(this.popularChain)) * 31) + this.popularWeight.hashCode()) * 31) + Integer.hashCode(this.resourceId)) * 31) + this.chainCustomLogo.hashCode()) * 31) + Boolean.hashCode(this.needTop);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketChainBean(chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", nativeTokenSymbol=" + this.nativeTokenSymbol + ", chainBWLogoUrl=" + this.chainBWLogoUrl + ", popularChain=" + this.popularChain + ", popularWeight=" + this.popularWeight + ", resourceId=" + this.resourceId + ", chainCustomLogo=" + this.chainCustomLogo + ", needTop=" + this.needTop + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.chainName);
        parcel.writeString(this.chainLogo);
        parcel.writeString(this.nativeTokenSymbol);
        parcel.writeString(this.chainBWLogoUrl);
        parcel.writeInt(this.popularChain ? 1 : 0);
        parcel.writeString(this.popularWeight);
        parcel.writeInt(this.resourceId);
        parcel.writeString(this.chainCustomLogo);
        parcel.writeInt(this.needTop ? 1 : 0);
    }

    public /* synthetic */ MarketChainBean(int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i2, String str7, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str2;
        }
        if ((i & 4) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str3;
        }
        if ((i & 8) == 0) {
            this.nativeTokenSymbol = "";
        } else {
            this.nativeTokenSymbol = str4;
        }
        if ((i & 16) == 0) {
            this.chainBWLogoUrl = "";
        } else {
            this.chainBWLogoUrl = str5;
        }
        if ((i & 32) == 0) {
            this.popularChain = false;
        } else {
            this.popularChain = z;
        }
        if ((i & 64) == 0) {
            this.popularWeight = "";
        } else {
            this.popularWeight = str6;
        }
        if ((i & 128) == 0) {
            this.resourceId = 0;
        } else {
            this.resourceId = i2;
        }
        if ((i & 256) == 0) {
            this.chainCustomLogo = "";
        } else {
            this.chainCustomLogo = str7;
        }
        if ((i & 512) == 0) {
            this.needTop = false;
        } else {
            this.needTop = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MarketChainBean marketChainBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) marketChainBean.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, marketChainBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) marketChainBean.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, marketChainBean.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) marketChainBean.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, marketChainBean.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) marketChainBean.nativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, marketChainBean.nativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) marketChainBean.chainBWLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, marketChainBean.chainBWLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || marketChainBean.popularChain) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, marketChainBean.popularChain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) marketChainBean.popularWeight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, marketChainBean.popularWeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || marketChainBean.resourceId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, marketChainBean.resourceId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) marketChainBean.chainCustomLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, marketChainBean.chainCustomLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || marketChainBean.needTop) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, marketChainBean.needTop);
        }
    }

    public MarketChainBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull String str6, int i, @NotNull String str7, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.chainId = str;
        this.chainName = str2;
        this.chainLogo = str3;
        this.nativeTokenSymbol = str4;
        this.chainBWLogoUrl = str5;
        this.popularChain = z;
        this.popularWeight = str6;
        this.resourceId = i;
        this.chainCustomLogo = str7;
        this.needTop = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0063: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003a: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r23v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0049: ARITH (r23v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, java.lang.String, boolean):void (m)] (LINE:23) call: com.okinc.business.dexlogic.main.market.chain.MarketChainBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ MarketChainBean(String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, String str7, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? 0 : i, (i2 & 256) == 0 ? str7 : "", (i2 & 512) == 0 ? z2 : false);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.market.chain.MarketChainBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MarketChainBean> serializer() {
            return MarketChainBean$$serializer.INSTANCE;
        }
    }
}
