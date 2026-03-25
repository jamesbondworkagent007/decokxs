package com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AutoTypeProfit implements Parcelable {
    public static final int $stable = 0;
    private final String ccy;
    private final String profit;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AutoTypeProfit> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AutoTypeProfit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoTypeProfit createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AutoTypeProfit(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoTypeProfit[] newArray(int i) {
            return new AutoTypeProfit[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AutoTypeProfit() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AutoTypeProfit copy$default(AutoTypeProfit autoTypeProfit, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoTypeProfit.profit;
        }
        if ((i & 2) != 0) {
            str2 = autoTypeProfit.ccy;
        }
        return autoTypeProfit.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoTypeProfit copy(String str, String str2) {
        return new AutoTypeProfit(str, str2);
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
        if (!(obj instanceof AutoTypeProfit)) {
            return false;
        }
        AutoTypeProfit autoTypeProfit = (AutoTypeProfit) obj;
        return Intrinsics.EZpvd((Object) this.profit, (Object) autoTypeProfit.profit) && Intrinsics.EZpvd((Object) this.ccy, (Object) autoTypeProfit.ccy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfit() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.profit;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ccy;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AutoTypeProfit(profit=" + this.profit + ", ccy=" + this.ccy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.profit);
        parcel.writeString(this.ccy);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoTypeProfit.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AutoTypeProfit> serializer() {
            return AutoTypeProfit$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AutoTypeProfit(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.profit = null;
        } else {
            this.profit = str;
        }
        if ((i & 2) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(AutoTypeProfit autoTypeProfit, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || autoTypeProfit.profit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, autoTypeProfit.profit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && autoTypeProfit.ccy == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, autoTypeProfit.ccy);
    }

    public AutoTypeProfit(String str, String str2) {
        this.profit = str;
        this.ccy = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:54) call: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoTypeProfit.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AutoTypeProfit(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
