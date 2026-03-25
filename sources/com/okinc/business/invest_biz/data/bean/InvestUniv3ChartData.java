package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class InvestUniv3ChartData implements Parcelable {
    public static final int $stable = 0;
    private final String liquidity;
    private final int tick;
    private final long timestamp;
    private final String token0Price;
    private final String token1Price;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestUniv3ChartData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<InvestUniv3ChartData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3ChartData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestUniv3ChartData(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3ChartData[] newArray(int i) {
            return new InvestUniv3ChartData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUniv3ChartData() {
        this(0, 0L, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestUniv3ChartData copy$default(InvestUniv3ChartData investUniv3ChartData, int i, long j, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = investUniv3ChartData.tick;
        }
        if ((i2 & 2) != 0) {
            j = investUniv3ChartData.timestamp;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            str = investUniv3ChartData.token0Price;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = investUniv3ChartData.token1Price;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = investUniv3ChartData.liquidity;
        }
        return investUniv3ChartData.copy(i, j2, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.tick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.token0Price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.token1Price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3ChartData copy(int i, long j, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InvestUniv3ChartData(i, j, str, str2, str3);
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
        if (!(obj instanceof InvestUniv3ChartData)) {
            return false;
        }
        InvestUniv3ChartData investUniv3ChartData = (InvestUniv3ChartData) obj;
        return this.tick == investUniv3ChartData.tick && this.timestamp == investUniv3ChartData.timestamp && Intrinsics.EZpvd((Object) this.token0Price, (Object) investUniv3ChartData.token0Price) && Intrinsics.EZpvd((Object) this.token1Price, (Object) investUniv3ChartData.token1Price) && Intrinsics.EZpvd((Object) this.liquidity, (Object) investUniv3ChartData.liquidity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidity() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTick() {
        return this.tick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken0Price() {
        return this.token0Price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken1Price() {
        return this.token1Price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Integer.hashCode(this.tick) * 31) + Long.hashCode(this.timestamp)) * 31) + this.token0Price.hashCode()) * 31) + this.token1Price.hashCode()) * 31) + this.liquidity.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUniv3ChartData(tick=" + this.tick + ", timestamp=" + this.timestamp + ", token0Price=" + this.token0Price + ", token1Price=" + this.token1Price + ", liquidity=" + this.liquidity + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.tick);
        parcel.writeLong(this.timestamp);
        parcel.writeString(this.token0Price);
        parcel.writeString(this.token1Price);
        parcel.writeString(this.liquidity);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUniv3ChartData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUniv3ChartData> serializer() {
            return InvestUniv3ChartData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUniv3ChartData(int i, int i2, long j, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.tick = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.timestamp = 0L;
        } else {
            this.timestamp = j;
        }
        if ((i & 4) == 0) {
            this.token0Price = "";
        } else {
            this.token0Price = str;
        }
        if ((i & 8) == 0) {
            this.token1Price = "";
        } else {
            this.token1Price = str2;
        }
        if ((i & 16) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUniv3ChartData investUniv3ChartData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investUniv3ChartData.tick != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, investUniv3ChartData.tick);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investUniv3ChartData.timestamp != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, investUniv3ChartData.timestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investUniv3ChartData.token0Price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investUniv3ChartData.token0Price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investUniv3ChartData.token1Price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investUniv3ChartData.token1Price);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) investUniv3ChartData.liquidity, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, investUniv3ChartData.liquidity);
    }

    public InvestUniv3ChartData(int i, long j, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.tick = i;
        this.timestamp = j;
        this.token0Price = str;
        this.token1Price = str2;
        this.liquidity = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (wrap:long:0x000b: TERNARY null = ((wrap:int:0x0005: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r6v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
 A[MD:(int, long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:964) call: com.okinc.business.invest_biz.data.bean.InvestUniv3ChartData.<init>(int, long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestUniv3ChartData(int i, long j, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3);
    }
}
