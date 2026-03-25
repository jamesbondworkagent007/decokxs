package com.okinc.business.defi.wallet.mine.search.data.model;

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
public final class MarketChainBean implements Parcelable {
    public static final int $stable = 0;
    public static final String ALL_CHAIN_ID_TAG = "-100";
    private final String chainBWLogoUrl;
    private final String chainId;
    private final String chainLogo;
    private final String chainName;
    private final boolean popularChain;
    private final String popularWeight;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MarketChainBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MarketChainBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketChainBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MarketChainBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
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
        this((String) null, (String) null, (String) null, (String) null, false, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MarketChainBean copy$default(MarketChainBean marketChainBean, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketChainBean.chainId;
        }
        if ((i & 2) != 0) {
            str2 = marketChainBean.chainName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = marketChainBean.chainLogo;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = marketChainBean.chainBWLogoUrl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            z = marketChainBean.popularChain;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = marketChainBean.popularWeight;
        }
        return marketChainBean.copy(str, str6, str7, str8, z2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
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
        return this.chainBWLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.popularChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.popularWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketChainBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new MarketChainBean(str, str2, str3, str4, z, str5);
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
        return Intrinsics.EZpvd((Object) this.chainId, (Object) marketChainBean.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) marketChainBean.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) marketChainBean.chainLogo) && Intrinsics.EZpvd((Object) this.chainBWLogoUrl, (Object) marketChainBean.chainBWLogoUrl) && this.popularChain == marketChainBean.popularChain && Intrinsics.EZpvd((Object) this.popularWeight, (Object) marketChainBean.popularWeight);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainBWLogoUrl() {
        return this.chainBWLogoUrl;
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
    public final boolean getPopularChain() {
        return this.popularChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPopularWeight() {
        return this.popularWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.chainId.hashCode() * 31) + this.chainName.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + this.chainBWLogoUrl.hashCode()) * 31) + Boolean.hashCode(this.popularChain)) * 31) + this.popularWeight.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketChainBean(chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", chainBWLogoUrl=" + this.chainBWLogoUrl + ", popularChain=" + this.popularChain + ", popularWeight=" + this.popularWeight + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.chainName);
        parcel.writeString(this.chainLogo);
        parcel.writeString(this.chainBWLogoUrl);
        parcel.writeInt(this.popularChain ? 1 : 0);
        parcel.writeString(this.popularWeight);
    }

    public /* synthetic */ MarketChainBean(int i, String str, String str2, String str3, String str4, boolean z, String str5, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.chainBWLogoUrl = "";
        } else {
            this.chainBWLogoUrl = str4;
        }
        if ((i & 16) == 0) {
            this.popularChain = false;
        } else {
            this.popularChain = z;
        }
        if ((i & 32) == 0) {
            this.popularWeight = "";
        } else {
            this.popularWeight = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(MarketChainBean marketChainBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) marketChainBean.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, marketChainBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) marketChainBean.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, marketChainBean.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) marketChainBean.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, marketChainBean.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) marketChainBean.chainBWLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, marketChainBean.chainBWLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || marketChainBean.popularChain) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, marketChainBean.popularChain);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) marketChainBean.popularWeight, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, marketChainBean.popularWeight);
    }

    public MarketChainBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chainId = str;
        this.chainName = str2;
        this.chainLogo = str3;
        this.chainBWLogoUrl = str4;
        this.popularChain = z;
        this.popularWeight = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:boolean:0x0023: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.defi.wallet.mine.search.data.model.MarketChainBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ MarketChainBean(String str, String str2, String str3, String str4, boolean z, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str5);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.MarketChainBean.Companion.<init>():void type: THIS */
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
