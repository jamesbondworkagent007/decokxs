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
public final class TradeEarnUserAssets implements Parcelable {
    public static final int $stable = 0;
    private final String totalProfit;
    private final String valuationUnit;
    private final String valuationUnitSymbol;
    private final String yesterdayProfit;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TradeEarnUserAssets> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<TradeEarnUserAssets> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeEarnUserAssets createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeEarnUserAssets(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeEarnUserAssets[] newArray(int i) {
            return new TradeEarnUserAssets[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeEarnUserAssets() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeEarnUserAssets copy$default(TradeEarnUserAssets tradeEarnUserAssets, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeEarnUserAssets.totalProfit;
        }
        if ((i & 2) != 0) {
            str2 = tradeEarnUserAssets.valuationUnitSymbol;
        }
        if ((i & 4) != 0) {
            str3 = tradeEarnUserAssets.valuationUnit;
        }
        if ((i & 8) != 0) {
            str4 = tradeEarnUserAssets.yesterdayProfit;
        }
        return tradeEarnUserAssets.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.valuationUnitSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.yesterdayProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeEarnUserAssets copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new TradeEarnUserAssets(str, str2, str3, str4);
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
        if (!(obj instanceof TradeEarnUserAssets)) {
            return false;
        }
        TradeEarnUserAssets tradeEarnUserAssets = (TradeEarnUserAssets) obj;
        return Intrinsics.EZpvd((Object) this.totalProfit, (Object) tradeEarnUserAssets.totalProfit) && Intrinsics.EZpvd((Object) this.valuationUnitSymbol, (Object) tradeEarnUserAssets.valuationUnitSymbol) && Intrinsics.EZpvd((Object) this.valuationUnit, (Object) tradeEarnUserAssets.valuationUnit) && Intrinsics.EZpvd((Object) this.yesterdayProfit, (Object) tradeEarnUserAssets.yesterdayProfit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalProfit() {
        return this.totalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationUnit() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationUnitSymbol() {
        return this.valuationUnitSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getYesterdayProfit() {
        return this.yesterdayProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.totalProfit.hashCode() * 31) + this.valuationUnitSymbol.hashCode()) * 31) + this.valuationUnit.hashCode()) * 31) + this.yesterdayProfit.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeEarnUserAssets(totalProfit=" + this.totalProfit + ", valuationUnitSymbol=" + this.valuationUnitSymbol + ", valuationUnit=" + this.valuationUnit + ", yesterdayProfit=" + this.yesterdayProfit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalProfit);
        parcel.writeString(this.valuationUnitSymbol);
        parcel.writeString(this.valuationUnit);
        parcel.writeString(this.yesterdayProfit);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeEarnUserAssets.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeEarnUserAssets> serializer() {
            return TradeEarnUserAssets$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeEarnUserAssets(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalProfit = "";
        } else {
            this.totalProfit = str;
        }
        if ((i & 2) == 0) {
            this.valuationUnitSymbol = "";
        } else {
            this.valuationUnitSymbol = str2;
        }
        if ((i & 4) == 0) {
            this.valuationUnit = "";
        } else {
            this.valuationUnit = str3;
        }
        if ((i & 8) == 0) {
            this.yesterdayProfit = "";
        } else {
            this.yesterdayProfit = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeEarnUserAssets tradeEarnUserAssets, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeEarnUserAssets.totalProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeEarnUserAssets.totalProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradeEarnUserAssets.valuationUnitSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeEarnUserAssets.valuationUnitSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradeEarnUserAssets.valuationUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeEarnUserAssets.valuationUnit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) tradeEarnUserAssets.yesterdayProfit, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeEarnUserAssets.yesterdayProfit);
    }

    public TradeEarnUserAssets(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.totalProfit = str;
        this.valuationUnitSymbol = str2;
        this.valuationUnit = str3;
        this.yesterdayProfit = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5675) call: com.okinc.unify_trade.biz.TradeEarnUserAssets.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradeEarnUserAssets(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
