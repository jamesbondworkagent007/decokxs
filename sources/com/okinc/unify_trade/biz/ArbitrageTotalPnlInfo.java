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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ArbitrageTotalPnlInfo implements Parcelable {
    public static final int $stable = 0;
    private final ArbitrageCostVo arbitrageCostVo;
    private final ArbitrageGainVo arbitrageGainVo;
    private final String interestRate;
    private final String otherPnlRatio;
    private final String totalPnl;
    private final String totalPnlRatio;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ArbitrageTotalPnlInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ArbitrageTotalPnlInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageTotalPnlInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ArbitrageTotalPnlInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ArbitrageGainVo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ArbitrageCostVo.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageTotalPnlInfo[] newArray(int i) {
            return new ArbitrageTotalPnlInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArbitrageTotalPnlInfo() {
        this((String) null, (String) null, (ArbitrageGainVo) null, (ArbitrageCostVo) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ArbitrageTotalPnlInfo copy$default(ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, String str, String str2, ArbitrageGainVo arbitrageGainVo, ArbitrageCostVo arbitrageCostVo, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = arbitrageTotalPnlInfo.totalPnlRatio;
        }
        if ((i & 2) != 0) {
            str2 = arbitrageTotalPnlInfo.totalPnl;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            arbitrageGainVo = arbitrageTotalPnlInfo.arbitrageGainVo;
        }
        ArbitrageGainVo arbitrageGainVo2 = arbitrageGainVo;
        if ((i & 8) != 0) {
            arbitrageCostVo = arbitrageTotalPnlInfo.arbitrageCostVo;
        }
        ArbitrageCostVo arbitrageCostVo2 = arbitrageCostVo;
        if ((i & 16) != 0) {
            str3 = arbitrageTotalPnlInfo.otherPnlRatio;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = arbitrageTotalPnlInfo.interestRate;
        }
        return arbitrageTotalPnlInfo.copy(str, str5, arbitrageGainVo2, arbitrageCostVo2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageGainVo component3() {
        return this.arbitrageGainVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageCostVo component4() {
        return this.arbitrageCostVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.otherPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.interestRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageTotalPnlInfo copy(String str, String str2, ArbitrageGainVo arbitrageGainVo, ArbitrageCostVo arbitrageCostVo, String str3, String str4) {
        return new ArbitrageTotalPnlInfo(str, str2, arbitrageGainVo, arbitrageCostVo, str3, str4);
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
        if (!(obj instanceof ArbitrageTotalPnlInfo)) {
            return false;
        }
        ArbitrageTotalPnlInfo arbitrageTotalPnlInfo = (ArbitrageTotalPnlInfo) obj;
        return Intrinsics.EZpvd((Object) this.totalPnlRatio, (Object) arbitrageTotalPnlInfo.totalPnlRatio) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) arbitrageTotalPnlInfo.totalPnl) && Intrinsics.EZpvd(this.arbitrageGainVo, arbitrageTotalPnlInfo.arbitrageGainVo) && Intrinsics.EZpvd(this.arbitrageCostVo, arbitrageTotalPnlInfo.arbitrageCostVo) && Intrinsics.EZpvd((Object) this.otherPnlRatio, (Object) arbitrageTotalPnlInfo.otherPnlRatio) && Intrinsics.EZpvd((Object) this.interestRate, (Object) arbitrageTotalPnlInfo.interestRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageCostVo getArbitrageCostVo() {
        return this.arbitrageCostVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageGainVo getArbitrageGainVo() {
        return this.arbitrageGainVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterestRate() {
        return this.interestRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOtherPnlRatio() {
        return this.otherPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnlRatio() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.totalPnlRatio;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.totalPnl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        ArbitrageGainVo arbitrageGainVo = this.arbitrageGainVo;
        int iHashCode3 = arbitrageGainVo == null ? 0 : arbitrageGainVo.hashCode();
        ArbitrageCostVo arbitrageCostVo = this.arbitrageCostVo;
        int iHashCode4 = arbitrageCostVo == null ? 0 : arbitrageCostVo.hashCode();
        String str3 = this.otherPnlRatio;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.interestRate;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArbitrageTotalPnlInfo(totalPnlRatio=" + this.totalPnlRatio + ", totalPnl=" + this.totalPnl + ", arbitrageGainVo=" + this.arbitrageGainVo + ", arbitrageCostVo=" + this.arbitrageCostVo + ", otherPnlRatio=" + this.otherPnlRatio + ", interestRate=" + this.interestRate + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalPnlRatio);
        parcel.writeString(this.totalPnl);
        ArbitrageGainVo arbitrageGainVo = this.arbitrageGainVo;
        if (arbitrageGainVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            arbitrageGainVo.writeToParcel(parcel, i);
        }
        ArbitrageCostVo arbitrageCostVo = this.arbitrageCostVo;
        if (arbitrageCostVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            arbitrageCostVo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.otherPnlRatio);
        parcel.writeString(this.interestRate);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbitrageTotalPnlInfo> serializer() {
            return ArbitrageTotalPnlInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ArbitrageTotalPnlInfo(int i, String str, String str2, ArbitrageGainVo arbitrageGainVo, ArbitrageCostVo arbitrageCostVo, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalPnlRatio = null;
        } else {
            this.totalPnlRatio = str;
        }
        if ((i & 2) == 0) {
            this.totalPnl = null;
        } else {
            this.totalPnl = str2;
        }
        if ((i & 4) == 0) {
            this.arbitrageGainVo = null;
        } else {
            this.arbitrageGainVo = arbitrageGainVo;
        }
        if ((i & 8) == 0) {
            this.arbitrageCostVo = null;
        } else {
            this.arbitrageCostVo = arbitrageCostVo;
        }
        if ((i & 16) == 0) {
            this.otherPnlRatio = null;
        } else {
            this.otherPnlRatio = str3;
        }
        if ((i & 32) == 0) {
            this.interestRate = null;
        } else {
            this.interestRate = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || arbitrageTotalPnlInfo.totalPnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, arbitrageTotalPnlInfo.totalPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || arbitrageTotalPnlInfo.totalPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, arbitrageTotalPnlInfo.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || arbitrageTotalPnlInfo.arbitrageGainVo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, ArbitrageGainVo$$serializer.INSTANCE, arbitrageTotalPnlInfo.arbitrageGainVo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || arbitrageTotalPnlInfo.arbitrageCostVo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, ArbitrageCostVo$$serializer.INSTANCE, arbitrageTotalPnlInfo.arbitrageCostVo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || arbitrageTotalPnlInfo.otherPnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, arbitrageTotalPnlInfo.otherPnlRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && arbitrageTotalPnlInfo.interestRate == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, arbitrageTotalPnlInfo.interestRate);
    }

    public ArbitrageTotalPnlInfo(String str, String str2, ArbitrageGainVo arbitrageGainVo, ArbitrageCostVo arbitrageCostVo, String str3, String str4) {
        this.totalPnlRatio = str;
        this.totalPnl = str2;
        this.arbitrageGainVo = arbitrageGainVo;
        this.arbitrageCostVo = arbitrageCostVo;
        this.otherPnlRatio = str3;
        this.interestRate = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.ArbitrageGainVo:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ArbitrageGainVo) : (r8v0 com.okinc.unify_trade.biz.ArbitrageGainVo))
  (wrap:com.okinc.unify_trade.biz.ArbitrageCostVo:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ArbitrageCostVo) : (r9v0 com.okinc.unify_trade.biz.ArbitrageCostVo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ArbitrageGainVo, com.okinc.unify_trade.biz.ArbitrageCostVo, java.lang.String, java.lang.String):void (m)] (LINE:4516) call: com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ArbitrageGainVo, com.okinc.unify_trade.biz.ArbitrageCostVo, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ArbitrageTotalPnlInfo(String str, String str2, ArbitrageGainVo arbitrageGainVo, ArbitrageCostVo arbitrageCostVo, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : arbitrageGainVo, (i & 8) != 0 ? null : arbitrageCostVo, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
