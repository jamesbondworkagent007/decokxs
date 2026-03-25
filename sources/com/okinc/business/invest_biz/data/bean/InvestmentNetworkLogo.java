package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33492mxV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestmentNetworkLogo implements Parcelable {
    public static final int $stable = 0;
    private final long chainId;
    private final String network;
    private final String networkBigLogo;
    private final String networkLogo;
    private final String nightNetworkLogo;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestmentNetworkLogo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestmentNetworkLogo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestmentNetworkLogo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestmentNetworkLogo(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestmentNetworkLogo[] newArray(int i) {
            return new InvestmentNetworkLogo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestmentNetworkLogo() {
        this(0L, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestmentNetworkLogo copy$default(InvestmentNetworkLogo investmentNetworkLogo, long j, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = investmentNetworkLogo.chainId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = investmentNetworkLogo.network;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = investmentNetworkLogo.networkLogo;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = investmentNetworkLogo.nightNetworkLogo;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = investmentNetworkLogo.networkBigLogo;
        }
        return investmentNetworkLogo.copy(j2, str5, str6, str7, str4);
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("network")
    public static /* synthetic */ void getNetwork$annotations() {
    }

    @SerialName("networkBigLogo")
    public static /* synthetic */ void getNetworkBigLogo$annotations() {
    }

    @SerialName("networkLogo")
    public static /* synthetic */ void getNetworkLogo$annotations() {
    }

    @SerialName("nightNetworkLogo")
    public static /* synthetic */ void getNightNetworkLogo$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nightNetworkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.networkBigLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentNetworkLogo copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new InvestmentNetworkLogo(j, str, str2, str3, str4);
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
        if (!(obj instanceof InvestmentNetworkLogo)) {
            return false;
        }
        InvestmentNetworkLogo investmentNetworkLogo = (InvestmentNetworkLogo) obj;
        return this.chainId == investmentNetworkLogo.chainId && Intrinsics.EZpvd((Object) this.network, (Object) investmentNetworkLogo.network) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) investmentNetworkLogo.networkLogo) && Intrinsics.EZpvd((Object) this.nightNetworkLogo, (Object) investmentNetworkLogo.nightNetworkLogo) && Intrinsics.EZpvd((Object) this.networkBigLogo, (Object) investmentNetworkLogo.networkBigLogo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkBigLogo() {
        return this.networkBigLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkLogo() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNightNetworkLogo() {
        return this.nightNetworkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Long.hashCode(this.chainId) * 31) + this.network.hashCode()) * 31) + this.networkLogo.hashCode()) * 31) + this.nightNetworkLogo.hashCode()) * 31) + this.networkBigLogo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestmentNetworkLogo(chainId=" + this.chainId + ", network=" + this.network + ", networkLogo=" + this.networkLogo + ", nightNetworkLogo=" + this.nightNetworkLogo + ", networkBigLogo=" + this.networkBigLogo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainId);
        parcel.writeString(this.network);
        parcel.writeString(this.networkLogo);
        parcel.writeString(this.nightNetworkLogo);
        parcel.writeString(this.networkBigLogo);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestmentNetworkLogo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestmentNetworkLogo> serializer() {
            return InvestmentNetworkLogo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestmentNetworkLogo(int i, long j, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.network = "";
        } else {
            this.network = str;
        }
        if ((i & 4) == 0) {
            this.networkLogo = "";
        } else {
            this.networkLogo = str2;
        }
        if ((i & 8) == 0) {
            this.nightNetworkLogo = "";
        } else {
            this.nightNetworkLogo = str3;
        }
        if ((i & 16) == 0) {
            this.networkBigLogo = "";
        } else {
            this.networkBigLogo = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestmentNetworkLogo investmentNetworkLogo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investmentNetworkLogo.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, investmentNetworkLogo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investmentNetworkLogo.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investmentNetworkLogo.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investmentNetworkLogo.networkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investmentNetworkLogo.networkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investmentNetworkLogo.nightNetworkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investmentNetworkLogo.nightNetworkLogo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) investmentNetworkLogo.networkBigLogo, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, investmentNetworkLogo.networkBigLogo);
    }

    public InvestmentNetworkLogo(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.chainId = j;
        this.network = str;
        this.networkLogo = str2;
        this.nightNetworkLogo = str3;
        this.networkBigLogo = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r8v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:116) call: com.okinc.business.invest_biz.data.bean.InvestmentNetworkLogo.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestmentNetworkLogo(long j, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }

    public final String getLogo() {
        return C33492mxV.OLrzqt() ? this.nightNetworkLogo : this.networkLogo;
    }
}
