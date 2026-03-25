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
public final class AutoEarnStakingProfitHistory implements Parcelable {
    public static final int $stable = 0;
    private final String amount;
    private final String profit;
    private final String rateRatio;
    private final String time;
    private final String vipLevel;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AutoEarnStakingProfitHistory> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AutoEarnStakingProfitHistory> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoEarnStakingProfitHistory createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AutoEarnStakingProfitHistory(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoEarnStakingProfitHistory[] newArray(int i) {
            return new AutoEarnStakingProfitHistory[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AutoEarnStakingProfitHistory() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AutoEarnStakingProfitHistory copy$default(AutoEarnStakingProfitHistory autoEarnStakingProfitHistory, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoEarnStakingProfitHistory.amount;
        }
        if ((i & 2) != 0) {
            str2 = autoEarnStakingProfitHistory.profit;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = autoEarnStakingProfitHistory.rateRatio;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = autoEarnStakingProfitHistory.vipLevel;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = autoEarnStakingProfitHistory.time;
        }
        return autoEarnStakingProfitHistory.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.rateRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.vipLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoEarnStakingProfitHistory copy(String str, String str2, String str3, String str4, String str5) {
        return new AutoEarnStakingProfitHistory(str, str2, str3, str4, str5);
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
        if (!(obj instanceof AutoEarnStakingProfitHistory)) {
            return false;
        }
        AutoEarnStakingProfitHistory autoEarnStakingProfitHistory = (AutoEarnStakingProfitHistory) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) autoEarnStakingProfitHistory.amount) && Intrinsics.EZpvd((Object) this.profit, (Object) autoEarnStakingProfitHistory.profit) && Intrinsics.EZpvd((Object) this.rateRatio, (Object) autoEarnStakingProfitHistory.rateRatio) && Intrinsics.EZpvd((Object) this.vipLevel, (Object) autoEarnStakingProfitHistory.vipLevel) && Intrinsics.EZpvd((Object) this.time, (Object) autoEarnStakingProfitHistory.time);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfit() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateRatio() {
        return this.rateRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVipLevel() {
        return this.vipLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.amount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.profit;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.rateRatio;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.vipLevel;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.time;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AutoEarnStakingProfitHistory(amount=" + this.amount + ", profit=" + this.profit + ", rateRatio=" + this.rateRatio + ", vipLevel=" + this.vipLevel + ", time=" + this.time + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.amount);
        parcel.writeString(this.profit);
        parcel.writeString(this.rateRatio);
        parcel.writeString(this.vipLevel);
        parcel.writeString(this.time);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingProfitHistory.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AutoEarnStakingProfitHistory> serializer() {
            return AutoEarnStakingProfitHistory$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AutoEarnStakingProfitHistory(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.amount = null;
        } else {
            this.amount = str;
        }
        if ((i & 2) == 0) {
            this.profit = null;
        } else {
            this.profit = str2;
        }
        if ((i & 4) == 0) {
            this.rateRatio = null;
        } else {
            this.rateRatio = str3;
        }
        if ((i & 8) == 0) {
            this.vipLevel = null;
        } else {
            this.vipLevel = str4;
        }
        if ((i & 16) == 0) {
            this.time = null;
        } else {
            this.time = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(AutoEarnStakingProfitHistory autoEarnStakingProfitHistory, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || autoEarnStakingProfitHistory.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, autoEarnStakingProfitHistory.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || autoEarnStakingProfitHistory.profit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, autoEarnStakingProfitHistory.profit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || autoEarnStakingProfitHistory.rateRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, autoEarnStakingProfitHistory.rateRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || autoEarnStakingProfitHistory.vipLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, autoEarnStakingProfitHistory.vipLevel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && autoEarnStakingProfitHistory.time == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, autoEarnStakingProfitHistory.time);
    }

    public AutoEarnStakingProfitHistory(String str, String str2, String str3, String str4, String str5) {
        this.amount = str;
        this.profit = str2;
        this.rateRatio = str3;
        this.vipLevel = str4;
        this.time = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:43) call: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingProfitHistory.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AutoEarnStakingProfitHistory(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
