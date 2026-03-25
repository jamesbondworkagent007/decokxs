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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class MarginPerCcyVo implements Parcelable {
    public static final int $stable = 0;
    private final String arbitrageApy;
    private final String extraMargin;
    private final String extraMarginSz;
    private final String floatProfit;
    private final String floatProfitRate;
    private final String gridProfit;
    private final String gridProfitRate;
    private final String investment;
    private final String pnlRatio;
    private final String totalApy;
    private final String totalPnl;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MarginPerCcyVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MarginPerCcyVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginPerCcyVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MarginPerCcyVo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginPerCcyVo[] newArray(int i) {
            return new MarginPerCcyVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarginPerCcyVo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.investment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.arbitrageApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.totalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.gridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.gridProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.extraMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.floatProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.floatProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarginPerCcyVo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new MarginPerCcyVo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
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
        if (!(obj instanceof MarginPerCcyVo)) {
            return false;
        }
        MarginPerCcyVo marginPerCcyVo = (MarginPerCcyVo) obj;
        return Intrinsics.EZpvd((Object) this.investment, (Object) marginPerCcyVo.investment) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) marginPerCcyVo.totalPnl) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) marginPerCcyVo.pnlRatio) && Intrinsics.EZpvd((Object) this.gridProfit, (Object) marginPerCcyVo.gridProfit) && Intrinsics.EZpvd((Object) this.gridProfitRate, (Object) marginPerCcyVo.gridProfitRate) && Intrinsics.EZpvd((Object) this.extraMargin, (Object) marginPerCcyVo.extraMargin) && Intrinsics.EZpvd((Object) this.extraMarginSz, (Object) marginPerCcyVo.extraMarginSz) && Intrinsics.EZpvd((Object) this.floatProfit, (Object) marginPerCcyVo.floatProfit) && Intrinsics.EZpvd((Object) this.floatProfitRate, (Object) marginPerCcyVo.floatProfitRate) && Intrinsics.EZpvd((Object) this.arbitrageApy, (Object) marginPerCcyVo.arbitrageApy) && Intrinsics.EZpvd((Object) this.totalApy, (Object) marginPerCcyVo.totalApy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitrageApy() {
        return this.arbitrageApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtraMargin() {
        return this.extraMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtraMarginSz() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFloatProfit() {
        return this.floatProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFloatProfitRate() {
        return this.floatProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridProfit() {
        return this.gridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridProfitRate() {
        return this.gridProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestment() {
        return this.investment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalApy() {
        return this.totalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.investment.hashCode() * 31) + this.totalPnl.hashCode()) * 31) + this.pnlRatio.hashCode()) * 31) + this.gridProfit.hashCode()) * 31) + this.gridProfitRate.hashCode()) * 31) + this.extraMargin.hashCode()) * 31) + this.extraMarginSz.hashCode()) * 31) + this.floatProfit.hashCode()) * 31) + this.floatProfitRate.hashCode()) * 31) + this.arbitrageApy.hashCode()) * 31) + this.totalApy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarginPerCcyVo(investment=" + this.investment + ", totalPnl=" + this.totalPnl + ", pnlRatio=" + this.pnlRatio + ", gridProfit=" + this.gridProfit + ", gridProfitRate=" + this.gridProfitRate + ", extraMargin=" + this.extraMargin + ", extraMarginSz=" + this.extraMarginSz + ", floatProfit=" + this.floatProfit + ", floatProfitRate=" + this.floatProfitRate + ", arbitrageApy=" + this.arbitrageApy + ", totalApy=" + this.totalApy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.investment);
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.gridProfit);
        parcel.writeString(this.gridProfitRate);
        parcel.writeString(this.extraMargin);
        parcel.writeString(this.extraMarginSz);
        parcel.writeString(this.floatProfit);
        parcel.writeString(this.floatProfitRate);
        parcel.writeString(this.arbitrageApy);
        parcel.writeString(this.totalApy);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MarginPerCcyVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarginPerCcyVo> serializer() {
            return MarginPerCcyVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarginPerCcyVo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.investment = "";
        } else {
            this.investment = str;
        }
        if ((i & 2) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str2;
        }
        if ((i & 4) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str3;
        }
        if ((i & 8) == 0) {
            this.gridProfit = "";
        } else {
            this.gridProfit = str4;
        }
        if ((i & 16) == 0) {
            this.gridProfitRate = "";
        } else {
            this.gridProfitRate = str5;
        }
        if ((i & 32) == 0) {
            this.extraMargin = "";
        } else {
            this.extraMargin = str6;
        }
        if ((i & 64) == 0) {
            this.extraMarginSz = "";
        } else {
            this.extraMarginSz = str7;
        }
        if ((i & 128) == 0) {
            this.floatProfit = "";
        } else {
            this.floatProfit = str8;
        }
        if ((i & 256) == 0) {
            this.floatProfitRate = "";
        } else {
            this.floatProfitRate = str9;
        }
        if ((i & 512) == 0) {
            this.arbitrageApy = "";
        } else {
            this.arbitrageApy = str10;
        }
        if ((i & 1024) == 0) {
            this.totalApy = "";
        } else {
            this.totalApy = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MarginPerCcyVo marginPerCcyVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) marginPerCcyVo.investment, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, marginPerCcyVo.investment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) marginPerCcyVo.totalPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, marginPerCcyVo.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) marginPerCcyVo.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, marginPerCcyVo.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) marginPerCcyVo.gridProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, marginPerCcyVo.gridProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) marginPerCcyVo.gridProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, marginPerCcyVo.gridProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) marginPerCcyVo.extraMargin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, marginPerCcyVo.extraMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) marginPerCcyVo.extraMarginSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, marginPerCcyVo.extraMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) marginPerCcyVo.floatProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, marginPerCcyVo.floatProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) marginPerCcyVo.floatProfitRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, marginPerCcyVo.floatProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) marginPerCcyVo.arbitrageApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, marginPerCcyVo.arbitrageApy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) marginPerCcyVo.totalApy, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, marginPerCcyVo.totalApy);
    }

    public MarginPerCcyVo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.investment = str;
        this.totalPnl = str2;
        this.pnlRatio = str3;
        this.gridProfit = str4;
        this.gridProfitRate = str5;
        this.extraMargin = str6;
        this.extraMarginSz = str7;
        this.floatProfit = str8;
        this.floatProfitRate = str9;
        this.arbitrageApy = str10;
        this.totalApy = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:171) call: com.okinc.unify_trade.biz.MarginPerCcyVo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MarginPerCcyVo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) == 0 ? str11 : "");
    }
}
