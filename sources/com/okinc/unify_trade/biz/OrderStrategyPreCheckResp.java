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
public final class OrderStrategyPreCheckResp implements Parcelable {
    private String debtAmount;
    private String fee;
    private String feeCcy;
    private String repayAmount;
    private String yearRates;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OrderStrategyPreCheckResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<OrderStrategyPreCheckResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderStrategyPreCheckResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OrderStrategyPreCheckResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderStrategyPreCheckResp[] newArray(int i) {
            return new OrderStrategyPreCheckResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderStrategyPreCheckResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OrderStrategyPreCheckResp copy$default(OrderStrategyPreCheckResp orderStrategyPreCheckResp, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderStrategyPreCheckResp.fee;
        }
        if ((i & 2) != 0) {
            str2 = orderStrategyPreCheckResp.feeCcy;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = orderStrategyPreCheckResp.repayAmount;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = orderStrategyPreCheckResp.debtAmount;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = orderStrategyPreCheckResp.yearRates;
        }
        return orderStrategyPreCheckResp.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.repayAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.debtAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.yearRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderStrategyPreCheckResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new OrderStrategyPreCheckResp(str, str2, str3, str4, str5);
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
        if (!(obj instanceof OrderStrategyPreCheckResp)) {
            return false;
        }
        OrderStrategyPreCheckResp orderStrategyPreCheckResp = (OrderStrategyPreCheckResp) obj;
        return Intrinsics.EZpvd((Object) this.fee, (Object) orderStrategyPreCheckResp.fee) && Intrinsics.EZpvd((Object) this.feeCcy, (Object) orderStrategyPreCheckResp.feeCcy) && Intrinsics.EZpvd((Object) this.repayAmount, (Object) orderStrategyPreCheckResp.repayAmount) && Intrinsics.EZpvd((Object) this.debtAmount, (Object) orderStrategyPreCheckResp.debtAmount) && Intrinsics.EZpvd((Object) this.yearRates, (Object) orderStrategyPreCheckResp.yearRates);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDebtAmount() {
        return this.debtAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeCcy() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRepayAmount() {
        return this.repayAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getYearRates() {
        return this.yearRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.fee.hashCode() * 31) + this.feeCcy.hashCode()) * 31) + this.repayAmount.hashCode()) * 31) + this.debtAmount.hashCode()) * 31) + this.yearRates.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDebtAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.debtAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRepayAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.repayAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setYearRates(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.yearRates = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderStrategyPreCheckResp(fee=" + this.fee + ", feeCcy=" + this.feeCcy + ", repayAmount=" + this.repayAmount + ", debtAmount=" + this.debtAmount + ", yearRates=" + this.yearRates + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fee);
        parcel.writeString(this.feeCcy);
        parcel.writeString(this.repayAmount);
        parcel.writeString(this.debtAmount);
        parcel.writeString(this.yearRates);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OrderStrategyPreCheckResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderStrategyPreCheckResp> serializer() {
            return OrderStrategyPreCheckResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderStrategyPreCheckResp(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fee = "";
        } else {
            this.fee = str;
        }
        if ((i & 2) == 0) {
            this.feeCcy = "";
        } else {
            this.feeCcy = str2;
        }
        if ((i & 4) == 0) {
            this.repayAmount = "";
        } else {
            this.repayAmount = str3;
        }
        if ((i & 8) == 0) {
            this.debtAmount = "";
        } else {
            this.debtAmount = str4;
        }
        if ((i & 16) == 0) {
            this.yearRates = "";
        } else {
            this.yearRates = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OrderStrategyPreCheckResp orderStrategyPreCheckResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) orderStrategyPreCheckResp.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, orderStrategyPreCheckResp.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) orderStrategyPreCheckResp.feeCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, orderStrategyPreCheckResp.feeCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) orderStrategyPreCheckResp.repayAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, orderStrategyPreCheckResp.repayAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) orderStrategyPreCheckResp.debtAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, orderStrategyPreCheckResp.debtAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) orderStrategyPreCheckResp.yearRates, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, orderStrategyPreCheckResp.yearRates);
    }

    public OrderStrategyPreCheckResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.fee = str;
        this.feeCcy = str2;
        this.repayAmount = str3;
        this.debtAmount = str4;
        this.yearRates = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:806) call: com.okinc.unify_trade.biz.OrderStrategyPreCheckResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OrderStrategyPreCheckResp(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
