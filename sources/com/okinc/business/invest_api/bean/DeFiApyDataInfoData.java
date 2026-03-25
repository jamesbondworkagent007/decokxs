package com.okinc.business.invest_api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class DeFiApyDataInfoData implements Parcelable {
    public static final int $stable = 0;
    private final long coinId;
    private final long investmentId;
    private final String maxApy;
    private final String minApy;
    private final boolean showOnHomepage;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DeFiApyDataInfoData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DeFiApyDataInfoData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeFiApyDataInfoData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DeFiApyDataInfoData(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeFiApyDataInfoData[] newArray(int i) {
            return new DeFiApyDataInfoData[i];
        }
    }

    @SerialName("investmentId")
    public static /* synthetic */ void getInvestmentId$annotations() {
    }

    @SerialName("maxApy")
    public static /* synthetic */ void getMaxApy$annotations() {
    }

    @SerialName("minApy")
    public static /* synthetic */ void getMinApy$annotations() {
    }

    @SerialName("showOnHomepage")
    public static /* synthetic */ void getShowOnHomepage$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.minApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.showOnHomepage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeFiApyDataInfoData copy(long j, @NotNull String str, @NotNull String str2, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DeFiApyDataInfoData(j, str, str2, j2, z);
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
        if (!(obj instanceof DeFiApyDataInfoData)) {
            return false;
        }
        DeFiApyDataInfoData deFiApyDataInfoData = (DeFiApyDataInfoData) obj;
        return this.coinId == deFiApyDataInfoData.coinId && Intrinsics.EZpvd((Object) this.minApy, (Object) deFiApyDataInfoData.minApy) && Intrinsics.EZpvd((Object) this.maxApy, (Object) deFiApyDataInfoData.maxApy) && this.investmentId == deFiApyDataInfoData.investmentId && this.showOnHomepage == deFiApyDataInfoData.showOnHomepage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxApy() {
        return this.maxApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinApy() {
        return this.minApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowOnHomepage() {
        return this.showOnHomepage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Long.hashCode(this.coinId) * 31) + this.minApy.hashCode()) * 31) + this.maxApy.hashCode()) * 31) + Long.hashCode(this.investmentId)) * 31) + Boolean.hashCode(this.showOnHomepage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeFiApyDataInfoData(coinId=" + this.coinId + ", minApy=" + this.minApy + ", maxApy=" + this.maxApy + ", investmentId=" + this.investmentId + ", showOnHomepage=" + this.showOnHomepage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.coinId);
        parcel.writeString(this.minApy);
        parcel.writeString(this.maxApy);
        parcel.writeLong(this.investmentId);
        parcel.writeInt(this.showOnHomepage ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_api.bean.DeFiApyDataInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeFiApyDataInfoData> serializer() {
            return DeFiApyDataInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeFiApyDataInfoData(int i, long j, String str, String str2, long j2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i, 14, DeFiApyDataInfoData$$serializer.INSTANCE.getDescriptor());
        }
        this.coinId = (i & 1) == 0 ? 0L : j;
        this.minApy = str;
        this.maxApy = str2;
        this.investmentId = j2;
        if ((i & 16) == 0) {
            this.showOnHomepage = false;
        } else {
            this.showOnHomepage = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_api(DeFiApyDataInfoData deFiApyDataInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || deFiApyDataInfoData.coinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, deFiApyDataInfoData.coinId);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, deFiApyDataInfoData.minApy);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, deFiApyDataInfoData.maxApy);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, deFiApyDataInfoData.investmentId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || deFiApyDataInfoData.showOnHomepage) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, deFiApyDataInfoData.showOnHomepage);
        }
    }

    public DeFiApyDataInfoData(long j, @NotNull String str, @NotNull String str2, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.coinId = j;
        this.minApy = str;
        this.maxApy = str2;
        this.investmentId = j2;
        this.showOnHomepage = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r11v0 long))
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 long)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
 A[MD:(long, java.lang.String, java.lang.String, long, boolean):void (m)] (LINE:12) call: com.okinc.business.invest_api.bean.DeFiApyDataInfoData.<init>(long, java.lang.String, java.lang.String, long, boolean):void type: THIS */
    public /* synthetic */ DeFiApyDataInfoData(long j, String str, String str2, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, str2, j2, (i & 16) != 0 ? false : z);
    }
}
