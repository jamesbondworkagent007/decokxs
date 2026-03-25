package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CandleResultInfo implements Parcelable {
    public static final int $stable = 0;
    public static final int LIMIT_VALUE_MAX = 1;
    public static final int LIMIT_VALUE_MIN = -1;
    private final String bonusRate;
    private final int limitValue;
    private final String rate;
    private final String timestamp;
    private final String totalReward;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CandleResultInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<CandleResultInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CandleResultInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CandleResultInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CandleResultInfo[] newArray(int i) {
            return new CandleResultInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CandleResultInfo() {
        this((String) null, (String) null, 0, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CandleResultInfo copy$default(CandleResultInfo candleResultInfo, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = candleResultInfo.rate;
        }
        if ((i2 & 2) != 0) {
            str2 = candleResultInfo.timestamp;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = candleResultInfo.limitValue;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = candleResultInfo.bonusRate;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = candleResultInfo.totalReward;
        }
        return candleResultInfo.copy(str, str5, i3, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.limitValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bonusRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totalReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CandleResultInfo copy(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CandleResultInfo(str, str2, i, str3, str4);
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
        if (!(obj instanceof CandleResultInfo)) {
            return false;
        }
        CandleResultInfo candleResultInfo = (CandleResultInfo) obj;
        return Intrinsics.EZpvd((Object) this.rate, (Object) candleResultInfo.rate) && Intrinsics.EZpvd((Object) this.timestamp, (Object) candleResultInfo.timestamp) && this.limitValue == candleResultInfo.limitValue && Intrinsics.EZpvd((Object) this.bonusRate, (Object) candleResultInfo.bonusRate) && Intrinsics.EZpvd((Object) this.totalReward, (Object) candleResultInfo.totalReward);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBonusRate() {
        return this.bonusRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLimitValue() {
        return this.limitValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalReward() {
        return this.totalReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.rate.hashCode();
        int iHashCode2 = this.timestamp.hashCode();
        int iHashCode3 = Integer.hashCode(this.limitValue);
        int iHashCode4 = this.bonusRate.hashCode();
        String str = this.totalReward;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CandleResultInfo(rate=" + this.rate + ", timestamp=" + this.timestamp + ", limitValue=" + this.limitValue + ", bonusRate=" + this.bonusRate + ", totalReward=" + this.totalReward + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.rate);
        parcel.writeString(this.timestamp);
        parcel.writeInt(this.limitValue);
        parcel.writeString(this.bonusRate);
        parcel.writeString(this.totalReward);
    }

    public /* synthetic */ CandleResultInfo(int i, String str, String str2, int i2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rate = "";
        } else {
            this.rate = str;
        }
        if ((i & 2) == 0) {
            this.timestamp = "";
        } else {
            this.timestamp = str2;
        }
        if ((i & 4) == 0) {
            this.limitValue = 0;
        } else {
            this.limitValue = i2;
        }
        if ((i & 8) == 0) {
            this.bonusRate = "";
        } else {
            this.bonusRate = str3;
        }
        if ((i & 16) == 0) {
            this.totalReward = null;
        } else {
            this.totalReward = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(CandleResultInfo candleResultInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) candleResultInfo.rate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, candleResultInfo.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) candleResultInfo.timestamp, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, candleResultInfo.timestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || candleResultInfo.limitValue != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, candleResultInfo.limitValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) candleResultInfo.bonusRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, candleResultInfo.bonusRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && candleResultInfo.totalReward == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, candleResultInfo.totalReward);
    }

    public CandleResultInfo(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.rate = str;
        this.timestamp = str2;
        this.limitValue = i;
        this.bonusRate = str3;
        this.totalReward = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:int:0x0015: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:29) call: com.okinc.business.invest_biz.data.bean.CandleResultInfo.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CandleResultInfo(String str, String str2, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? null : str4);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.CandleResultInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CandleResultInfo> serializer() {
            return CandleResultInfo$$serializer.INSTANCE;
        }
    }
}
