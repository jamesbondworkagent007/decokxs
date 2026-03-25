package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class HedgingEstimatesResp implements Parcelable {
    private String estAvgBuyPrice;
    private String estAvgSellPrice;
    private String estFundingRateAPR;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<HedgingEstimatesResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<HedgingEstimatesResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HedgingEstimatesResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HedgingEstimatesResp(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HedgingEstimatesResp[] newArray(int i) {
            return new HedgingEstimatesResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HedgingEstimatesResp() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HedgingEstimatesResp copy$default(HedgingEstimatesResp hedgingEstimatesResp, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hedgingEstimatesResp.estAvgSellPrice;
        }
        if ((i & 2) != 0) {
            str2 = hedgingEstimatesResp.estAvgBuyPrice;
        }
        if ((i & 4) != 0) {
            str3 = hedgingEstimatesResp.estFundingRateAPR;
        }
        return hedgingEstimatesResp.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.estAvgSellPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.estAvgBuyPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.estFundingRateAPR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HedgingEstimatesResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new HedgingEstimatesResp(str, str2, str3);
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
        if (!(obj instanceof HedgingEstimatesResp)) {
            return false;
        }
        HedgingEstimatesResp hedgingEstimatesResp = (HedgingEstimatesResp) obj;
        return Intrinsics.EZpvd((Object) this.estAvgSellPrice, (Object) hedgingEstimatesResp.estAvgSellPrice) && Intrinsics.EZpvd((Object) this.estAvgBuyPrice, (Object) hedgingEstimatesResp.estAvgBuyPrice) && Intrinsics.EZpvd((Object) this.estFundingRateAPR, (Object) hedgingEstimatesResp.estFundingRateAPR);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstAvgBuyPrice() {
        return this.estAvgBuyPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstAvgSellPrice() {
        return this.estAvgSellPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstFundingRateAPR() {
        return this.estFundingRateAPR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.estAvgSellPrice.hashCode() * 31) + this.estAvgBuyPrice.hashCode()) * 31) + this.estFundingRateAPR.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstAvgBuyPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estAvgBuyPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstAvgSellPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estAvgSellPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstFundingRateAPR(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estFundingRateAPR = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HedgingEstimatesResp(estAvgSellPrice=" + this.estAvgSellPrice + ", estAvgBuyPrice=" + this.estAvgBuyPrice + ", estFundingRateAPR=" + this.estFundingRateAPR + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.estAvgSellPrice);
        parcel.writeString(this.estAvgBuyPrice);
        parcel.writeString(this.estFundingRateAPR);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.HedgingEstimatesResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HedgingEstimatesResp> serializer() {
            return HedgingEstimatesResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HedgingEstimatesResp(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.estAvgSellPrice = "";
        } else {
            this.estAvgSellPrice = str;
        }
        if ((i & 2) == 0) {
            this.estAvgBuyPrice = "";
        } else {
            this.estAvgBuyPrice = str2;
        }
        if ((i & 4) == 0) {
            this.estFundingRateAPR = "";
        } else {
            this.estFundingRateAPR = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(HedgingEstimatesResp hedgingEstimatesResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) hedgingEstimatesResp.estAvgSellPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, hedgingEstimatesResp.estAvgSellPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) hedgingEstimatesResp.estAvgBuyPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, hedgingEstimatesResp.estAvgBuyPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) hedgingEstimatesResp.estFundingRateAPR, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, hedgingEstimatesResp.estFundingRateAPR);
    }

    public HedgingEstimatesResp(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.estAvgSellPrice = str;
        this.estAvgBuyPrice = str2;
        this.estFundingRateAPR = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2008) call: com.okinc.unify_trade.biz.HedgingEstimatesResp.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HedgingEstimatesResp(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
