package com.okinc.okpaymentapi.data.remote.model.management;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class TradeLimit implements Parcelable {
    public static final int $stable = 0;
    private final String maxChannelLimit;
    private final String maxDexDailyLimit;
    private final String maxTradeLimit;
    private final String minChannelLimit;
    private final String minTradeLimit;
    private final String remainDexDailyLimit;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TradeLimit> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TradeLimit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeLimit createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeLimit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeLimit[] newArray(int i) {
            return new TradeLimit[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeLimit() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeLimit copy$default(TradeLimit tradeLimit, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeLimit.minChannelLimit;
        }
        if ((i & 2) != 0) {
            str2 = tradeLimit.maxChannelLimit;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = tradeLimit.minTradeLimit;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = tradeLimit.maxTradeLimit;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = tradeLimit.maxDexDailyLimit;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = tradeLimit.remainDexDailyLimit;
        }
        return tradeLimit.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.minChannelLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxChannelLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.minTradeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.maxTradeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.maxDexDailyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.remainDexDailyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLimit copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new TradeLimit(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof TradeLimit)) {
            return false;
        }
        TradeLimit tradeLimit = (TradeLimit) obj;
        return Intrinsics.EZpvd((Object) this.minChannelLimit, (Object) tradeLimit.minChannelLimit) && Intrinsics.EZpvd((Object) this.maxChannelLimit, (Object) tradeLimit.maxChannelLimit) && Intrinsics.EZpvd((Object) this.minTradeLimit, (Object) tradeLimit.minTradeLimit) && Intrinsics.EZpvd((Object) this.maxTradeLimit, (Object) tradeLimit.maxTradeLimit) && Intrinsics.EZpvd((Object) this.maxDexDailyLimit, (Object) tradeLimit.maxDexDailyLimit) && Intrinsics.EZpvd((Object) this.remainDexDailyLimit, (Object) tradeLimit.remainDexDailyLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxChannelLimit() {
        return this.maxChannelLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxDexDailyLimit() {
        return this.maxDexDailyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxTradeLimit() {
        return this.maxTradeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinChannelLimit() {
        return this.minChannelLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinTradeLimit() {
        return this.minTradeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemainDexDailyLimit() {
        return this.remainDexDailyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.minChannelLimit.hashCode() * 31) + this.maxChannelLimit.hashCode()) * 31) + this.minTradeLimit.hashCode()) * 31) + this.maxTradeLimit.hashCode()) * 31) + this.maxDexDailyLimit.hashCode()) * 31) + this.remainDexDailyLimit.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeLimit(minChannelLimit=" + this.minChannelLimit + ", maxChannelLimit=" + this.maxChannelLimit + ", minTradeLimit=" + this.minTradeLimit + ", maxTradeLimit=" + this.maxTradeLimit + ", maxDexDailyLimit=" + this.maxDexDailyLimit + ", remainDexDailyLimit=" + this.remainDexDailyLimit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.minChannelLimit);
        parcel.writeString(this.maxChannelLimit);
        parcel.writeString(this.minTradeLimit);
        parcel.writeString(this.maxTradeLimit);
        parcel.writeString(this.maxDexDailyLimit);
        parcel.writeString(this.remainDexDailyLimit);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.TradeLimit.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeLimit> serializer() {
            return TradeLimit$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeLimit(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.minChannelLimit = "";
        } else {
            this.minChannelLimit = str;
        }
        if ((i & 2) == 0) {
            this.maxChannelLimit = "";
        } else {
            this.maxChannelLimit = str2;
        }
        if ((i & 4) == 0) {
            this.minTradeLimit = "";
        } else {
            this.minTradeLimit = str3;
        }
        if ((i & 8) == 0) {
            this.maxTradeLimit = "";
        } else {
            this.maxTradeLimit = str4;
        }
        if ((i & 16) == 0) {
            this.maxDexDailyLimit = "";
        } else {
            this.maxDexDailyLimit = str5;
        }
        if ((i & 32) == 0) {
            this.remainDexDailyLimit = "";
        } else {
            this.remainDexDailyLimit = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(TradeLimit tradeLimit, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeLimit.minChannelLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeLimit.minChannelLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradeLimit.maxChannelLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeLimit.maxChannelLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradeLimit.minTradeLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeLimit.minTradeLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradeLimit.maxTradeLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeLimit.maxTradeLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradeLimit.maxDexDailyLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradeLimit.maxDexDailyLimit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) tradeLimit.remainDexDailyLimit, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, tradeLimit.remainDexDailyLimit);
    }

    public TradeLimit(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.minChannelLimit = str;
        this.maxChannelLimit = str2;
        this.minTradeLimit = str3;
        this.maxTradeLimit = str4;
        this.maxDexDailyLimit = str5;
        this.remainDexDailyLimit = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:254) call: com.okinc.okpaymentapi.data.remote.model.management.TradeLimit.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradeLimit(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
