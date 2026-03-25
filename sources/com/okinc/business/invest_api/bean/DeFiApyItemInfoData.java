package com.okinc.business.invest_api.bean;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class DeFiApyItemInfoData implements Parcelable {
    public static final int $stable = 0;
    private final String amountInt;
    private final String chainImageUrl;
    private final long coinId;
    private final String currentPriceStr;
    private final String displayCountStr;
    private final long investmentId;
    private final String maxApy;
    private final String minApy;
    private final String netName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DeFiApyItemInfoData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DeFiApyItemInfoData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeFiApyItemInfoData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DeFiApyItemInfoData(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeFiApyItemInfoData[] newArray(int i) {
            return new DeFiApyItemInfoData[i];
        }
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
    public final String component5() {
        return this.displayCountStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.currentPriceStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.amountInt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.netName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.chainImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeFiApyItemInfoData copy(long j, @NotNull String str, @NotNull String str2, long j2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new DeFiApyItemInfoData(j, str, str2, j2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof DeFiApyItemInfoData)) {
            return false;
        }
        DeFiApyItemInfoData deFiApyItemInfoData = (DeFiApyItemInfoData) obj;
        return this.coinId == deFiApyItemInfoData.coinId && Intrinsics.EZpvd((Object) this.minApy, (Object) deFiApyItemInfoData.minApy) && Intrinsics.EZpvd((Object) this.maxApy, (Object) deFiApyItemInfoData.maxApy) && this.investmentId == deFiApyItemInfoData.investmentId && Intrinsics.EZpvd((Object) this.displayCountStr, (Object) deFiApyItemInfoData.displayCountStr) && Intrinsics.EZpvd((Object) this.currentPriceStr, (Object) deFiApyItemInfoData.currentPriceStr) && Intrinsics.EZpvd((Object) this.amountInt, (Object) deFiApyItemInfoData.amountInt) && Intrinsics.EZpvd((Object) this.netName, (Object) deFiApyItemInfoData.netName) && Intrinsics.EZpvd((Object) this.chainImageUrl, (Object) deFiApyItemInfoData.chainImageUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmountInt() {
        return this.amountInt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainImageUrl() {
        return this.chainImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPriceStr() {
        return this.currentPriceStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayCountStr() {
        return this.displayCountStr;
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
    public final String getNetName() {
        return this.netName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((Long.hashCode(this.coinId) * 31) + this.minApy.hashCode()) * 31) + this.maxApy.hashCode()) * 31) + Long.hashCode(this.investmentId)) * 31) + this.displayCountStr.hashCode()) * 31) + this.currentPriceStr.hashCode()) * 31) + this.amountInt.hashCode()) * 31) + this.netName.hashCode()) * 31) + this.chainImageUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeFiApyItemInfoData(coinId=" + this.coinId + ", minApy=" + this.minApy + ", maxApy=" + this.maxApy + ", investmentId=" + this.investmentId + ", displayCountStr=" + this.displayCountStr + ", currentPriceStr=" + this.currentPriceStr + ", amountInt=" + this.amountInt + ", netName=" + this.netName + ", chainImageUrl=" + this.chainImageUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.coinId);
        parcel.writeString(this.minApy);
        parcel.writeString(this.maxApy);
        parcel.writeLong(this.investmentId);
        parcel.writeString(this.displayCountStr);
        parcel.writeString(this.currentPriceStr);
        parcel.writeString(this.amountInt);
        parcel.writeString(this.netName);
        parcel.writeString(this.chainImageUrl);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_api.bean.DeFiApyItemInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeFiApyItemInfoData> serializer() {
            return DeFiApyItemInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeFiApyItemInfoData(int i, long j, String str, String str2, long j2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (478 != (i & 478)) {
            PluginExceptionsKt.throwMissingFieldException(i, 478, DeFiApyItemInfoData$$serializer.INSTANCE.getDescriptor());
        }
        this.coinId = (i & 1) == 0 ? 0L : j;
        this.minApy = str;
        this.maxApy = str2;
        this.investmentId = j2;
        this.displayCountStr = str3;
        if ((i & 32) == 0) {
            this.currentPriceStr = "";
        } else {
            this.currentPriceStr = str4;
        }
        this.amountInt = str5;
        this.netName = str6;
        this.chainImageUrl = str7;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_api(DeFiApyItemInfoData deFiApyItemInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || deFiApyItemInfoData.coinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, deFiApyItemInfoData.coinId);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, deFiApyItemInfoData.minApy);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, deFiApyItemInfoData.maxApy);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, deFiApyItemInfoData.investmentId);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, deFiApyItemInfoData.displayCountStr);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) deFiApyItemInfoData.currentPriceStr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, deFiApyItemInfoData.currentPriceStr);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, deFiApyItemInfoData.amountInt);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, deFiApyItemInfoData.netName);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, deFiApyItemInfoData.chainImageUrl);
    }

    public DeFiApyItemInfoData(long j, @NotNull String str, @NotNull String str2, long j2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.coinId = j;
        this.minApy = str;
        this.maxApy = str2;
        this.investmentId = j2;
        this.displayCountStr = str3;
        this.currentPriceStr = str4;
        this.amountInt = str5;
        this.netName = str6;
        this.chainImageUrl = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 long)
  (r21v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
 A[MD:(long, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:28) call: com.okinc.business.invest_api.bean.DeFiApyItemInfoData.<init>(long, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DeFiApyItemInfoData(long j, String str, String str2, long j2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, str2, j2, str3, (i & 32) != 0 ? "" : str4, str5, str6, str7);
    }
}
