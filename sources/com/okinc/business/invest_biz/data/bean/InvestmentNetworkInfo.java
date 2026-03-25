package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class InvestmentNetworkInfo implements Parcelable {
    public static final int $stable = 0;
    private final long chainId;
    private final Boolean hasBonus;
    private final long investmentId;
    private final String network;
    private final String networkLogo;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestmentNetworkInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<InvestmentNetworkInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestmentNetworkInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j2 = parcel.readLong();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InvestmentNetworkInfo(j, string, string2, j2, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestmentNetworkInfo[] newArray(int i) {
            return new InvestmentNetworkInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestmentNetworkInfo() {
        this(0L, (String) null, (String) null, 0L, (Boolean) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.investmentId;
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
    public final long component4() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.hasBonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentNetworkInfo copy(long j, @NotNull String str, @NotNull String str2, long j2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new InvestmentNetworkInfo(j, str, str2, j2, bool);
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
        if (!(obj instanceof InvestmentNetworkInfo)) {
            return false;
        }
        InvestmentNetworkInfo investmentNetworkInfo = (InvestmentNetworkInfo) obj;
        return this.investmentId == investmentNetworkInfo.investmentId && Intrinsics.EZpvd((Object) this.network, (Object) investmentNetworkInfo.network) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) investmentNetworkInfo.networkLogo) && this.chainId == investmentNetworkInfo.chainId && Intrinsics.EZpvd(this.hasBonus, investmentNetworkInfo.hasBonus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasBonus() {
        return this.hasBonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkLogo() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.investmentId);
        int iHashCode2 = this.network.hashCode();
        int iHashCode3 = this.networkLogo.hashCode();
        int iHashCode4 = Long.hashCode(this.chainId);
        Boolean bool = this.hasBonus;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestmentNetworkInfo(investmentId=" + this.investmentId + ", network=" + this.network + ", networkLogo=" + this.networkLogo + ", chainId=" + this.chainId + ", hasBonus=" + this.hasBonus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.investmentId);
        parcel.writeString(this.network);
        parcel.writeString(this.networkLogo);
        parcel.writeLong(this.chainId);
        Boolean bool = this.hasBonus;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestmentNetworkInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestmentNetworkInfo> serializer() {
            return InvestmentNetworkInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestmentNetworkInfo(int i, long j, String str, String str2, long j2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.investmentId = 0L;
        } else {
            this.investmentId = j;
        }
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
            this.chainId = 0L;
        } else {
            this.chainId = j2;
        }
        if ((i & 16) == 0) {
            this.hasBonus = null;
        } else {
            this.hasBonus = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestmentNetworkInfo investmentNetworkInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investmentNetworkInfo.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, investmentNetworkInfo.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investmentNetworkInfo.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investmentNetworkInfo.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investmentNetworkInfo.networkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investmentNetworkInfo.networkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investmentNetworkInfo.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, investmentNetworkInfo.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && investmentNetworkInfo.hasBonus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, investmentNetworkInfo.hasBonus);
    }

    public InvestmentNetworkInfo(long j, @NotNull String str, @NotNull String str2, long j2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.investmentId = j;
        this.network = str;
        this.networkLogo = str2;
        this.chainId = j2;
        this.hasBonus = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r6v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0019: ARITH (r13v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r10v0 long) : (0 long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r12v0 java.lang.Boolean))
 A[MD:(long, java.lang.String, java.lang.String, long, java.lang.Boolean):void (m)] (LINE:110) call: com.okinc.business.invest_biz.data.bean.InvestmentNetworkInfo.<init>(long, java.lang.String, java.lang.String, long, java.lang.Boolean):void type: THIS */
    public /* synthetic */ InvestmentNetworkInfo(long j, String str, String str2, long j2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? j2 : 0L, (i & 16) != 0 ? null : bool);
    }
}
