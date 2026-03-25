package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.InterfaceC47221tlu;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class FundingRateArbCoin implements Parcelable, InterfaceC47221tlu {
    private final String apy;
    private final String ccy;
    private final String fundingRate;
    private final HighestApyOverview highestApyOverview;
    private final List<FundingRate> historicalRates;
    private final String instId;
    private final String nextFundingTime;
    private String primary;
    private double primarySimilarity;
    private String secondary;
    private double secondarySimilarity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FundingRateArbCoin> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(FundingRate$$serializer.INSTANCE), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<FundingRateArbCoin> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundingRateArbCoin createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            HighestApyOverview highestApyOverviewCreateFromParcel = parcel.readInt() == 0 ? null : HighestApyOverview.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FundingRate.CREATOR.createFromParcel(parcel));
            }
            return new FundingRateArbCoin(string, string2, string3, string4, highestApyOverviewCreateFromParcel, arrayList, parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readDouble());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundingRateArbCoin[] newArray(int i) {
            return new FundingRateArbCoin[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FundingRateArbCoin() {
        this((String) null, (String) null, (String) null, (String) null, (HighestApyOverview) null, (List) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.secondary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component11() {
        return this.secondarySimilarity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HighestApyOverview component5() {
        return this.highestApyOverview;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingRate> component6() {
        return this.historicalRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.nextFundingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.primary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component9() {
        return this.primarySimilarity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingRateArbCoin copy(String str, String str2, String str3, String str4, HighestApyOverview highestApyOverview, @NotNull List<FundingRate> list, @NotNull String str5, String str6, double d, String str7, double d2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new FundingRateArbCoin(str, str2, str3, str4, highestApyOverview, list, str5, str6, d, str7, d2);
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
        if (!(obj instanceof FundingRateArbCoin)) {
            return false;
        }
        FundingRateArbCoin fundingRateArbCoin = (FundingRateArbCoin) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) fundingRateArbCoin.ccy) && Intrinsics.EZpvd((Object) this.fundingRate, (Object) fundingRateArbCoin.fundingRate) && Intrinsics.EZpvd((Object) this.apy, (Object) fundingRateArbCoin.apy) && Intrinsics.EZpvd((Object) this.instId, (Object) fundingRateArbCoin.instId) && Intrinsics.EZpvd(this.highestApyOverview, fundingRateArbCoin.highestApyOverview) && Intrinsics.EZpvd(this.historicalRates, fundingRateArbCoin.historicalRates) && Intrinsics.EZpvd((Object) this.nextFundingTime, (Object) fundingRateArbCoin.nextFundingTime) && Intrinsics.EZpvd((Object) this.primary, (Object) fundingRateArbCoin.primary) && Double.compare(this.primarySimilarity, fundingRateArbCoin.primarySimilarity) == 0 && Intrinsics.EZpvd((Object) this.secondary, (Object) fundingRateArbCoin.secondary) && Double.compare(this.secondarySimilarity, fundingRateArbCoin.secondarySimilarity) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApy() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingRate() {
        return this.fundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HighestApyOverview getHighestApyOverview() {
        return this.highestApyOverview;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingRate> getHistoricalRates() {
        return this.historicalRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextFundingTime() {
        return this.nextFundingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public String getPrimary() {
        return this.primary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public double getPrimarySimilarity() {
        return this.primarySimilarity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public String getSecondary() {
        return this.secondary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public double getSecondarySimilarity() {
        return this.secondarySimilarity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.ccy;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fundingRate;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.apy;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.instId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        HighestApyOverview highestApyOverview = this.highestApyOverview;
        int iHashCode5 = highestApyOverview == null ? 0 : highestApyOverview.hashCode();
        int iHashCode6 = this.historicalRates.hashCode();
        int iHashCode7 = this.nextFundingTime.hashCode();
        String str5 = this.primary;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        int iHashCode9 = Double.hashCode(this.primarySimilarity);
        String str6 = this.secondary;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + Double.hashCode(this.secondarySimilarity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPrimary(String str) {
        this.primary = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public void setPrimarySimilarity(double d) {
        this.primarySimilarity = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSecondary(String str) {
        this.secondary = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public void setSecondarySimilarity(double d) {
        this.secondarySimilarity = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FundingRateArbCoin(ccy=" + this.ccy + ", fundingRate=" + this.fundingRate + ", apy=" + this.apy + ", instId=" + this.instId + ", highestApyOverview=" + this.highestApyOverview + ", historicalRates=" + this.historicalRates + ", nextFundingTime=" + this.nextFundingTime + ", primary=" + this.primary + ", primarySimilarity=" + this.primarySimilarity + ", secondary=" + this.secondary + ", secondarySimilarity=" + this.secondarySimilarity + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ccy);
        parcel.writeString(this.fundingRate);
        parcel.writeString(this.apy);
        parcel.writeString(this.instId);
        HighestApyOverview highestApyOverview = this.highestApyOverview;
        if (highestApyOverview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            highestApyOverview.writeToParcel(parcel, i);
        }
        List<FundingRate> list = this.historicalRates;
        parcel.writeInt(list.size());
        Iterator<FundingRate> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextFundingTime);
        parcel.writeString(this.primary);
        parcel.writeDouble(this.primarySimilarity);
        parcel.writeString(this.secondary);
        parcel.writeDouble(this.secondarySimilarity);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.FundingRateArbCoin.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FundingRateArbCoin> serializer() {
            return FundingRateArbCoin$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FundingRateArbCoin(int i, String str, String str2, String str3, String str4, HighestApyOverview highestApyOverview, List list, String str5, String str6, double d, String str7, double d2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str;
        }
        if ((i & 2) == 0) {
            this.fundingRate = null;
        } else {
            this.fundingRate = str2;
        }
        if ((i & 4) == 0) {
            this.apy = null;
        } else {
            this.apy = str3;
        }
        if ((i & 8) == 0) {
            this.instId = null;
        } else {
            this.instId = str4;
        }
        if ((i & 16) == 0) {
            this.highestApyOverview = null;
        } else {
            this.highestApyOverview = highestApyOverview;
        }
        this.historicalRates = (i & 32) == 0 ? yDY.AhwBna() : list;
        this.nextFundingTime = (i & 64) == 0 ? "" : str5;
        this.primary = (i & 128) == 0 ? this.ccy : str6;
        if ((i & 256) == 0) {
            this.primarySimilarity = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.primarySimilarity = d;
        }
        this.secondary = (i & 512) == 0 ? this.ccy : str7;
        if ((i & 1024) == 0) {
            this.secondarySimilarity = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.secondarySimilarity = d2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FundingRateArbCoin fundingRateArbCoin, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || fundingRateArbCoin.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, fundingRateArbCoin.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || fundingRateArbCoin.fundingRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, fundingRateArbCoin.fundingRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || fundingRateArbCoin.apy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, fundingRateArbCoin.apy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || fundingRateArbCoin.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, fundingRateArbCoin.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || fundingRateArbCoin.highestApyOverview != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, HighestApyOverview$$serializer.INSTANCE, fundingRateArbCoin.highestApyOverview);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(fundingRateArbCoin.historicalRates, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], fundingRateArbCoin.historicalRates);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) fundingRateArbCoin.nextFundingTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, fundingRateArbCoin.nextFundingTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) fundingRateArbCoin.getPrimary(), (Object) fundingRateArbCoin.ccy)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, fundingRateArbCoin.getPrimary());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || Double.compare(fundingRateArbCoin.getPrimarySimilarity(), AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 8, fundingRateArbCoin.getPrimarySimilarity());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) fundingRateArbCoin.getSecondary(), (Object) fundingRateArbCoin.ccy)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, fundingRateArbCoin.getSecondary());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Double.compare(fundingRateArbCoin.getSecondarySimilarity(), AudioStats.AUDIO_AMPLITUDE_NONE) == 0) {
            return;
        }
        compositeEncoder.encodeDoubleElement(serialDescriptor, 10, fundingRateArbCoin.getSecondarySimilarity());
    }

    public FundingRateArbCoin(String str, String str2, String str3, String str4, HighestApyOverview highestApyOverview, @NotNull List<FundingRate> list, @NotNull String str5, String str6, double d, String str7, double d2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.ccy = str;
        this.fundingRate = str2;
        this.apy = str3;
        this.instId = str4;
        this.highestApyOverview = highestApyOverview;
        this.historicalRates = list;
        this.nextFundingTime = str5;
        this.primary = str6;
        this.primarySimilarity = d;
        this.secondary = str7;
        this.secondarySimilarity = d2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FundingRateArbCoin(String str, String str2, String str3, String str4, HighestApyOverview highestApyOverview, List list, String str5, String str6, double d, String str7, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str8 = (i & 1) != 0 ? null : str;
        this(str8, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? highestApyOverview : null, (i & 32) != 0 ? yDY.AhwBna() : list, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? str8 : str6, (i & 256) != 0 ? 0.0d : d, (i & 512) != 0 ? str8 : str7, (i & 1024) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE);
    }
}
