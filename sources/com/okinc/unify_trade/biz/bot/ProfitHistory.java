package com.okinc.unify_trade.biz.bot;

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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class ProfitHistory implements Parcelable {
    public static final int $stable = 0;
    private final String cTime;
    private final String pnlRatio;
    private final String profitNum;
    private final String timeUnit;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ProfitHistory> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ProfitHistory> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfitHistory createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ProfitHistory(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfitHistory[] newArray(int i) {
            return new ProfitHistory[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProfitHistory() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ProfitHistory copy$default(ProfitHistory profitHistory, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profitHistory.cTime;
        }
        if ((i & 2) != 0) {
            str2 = profitHistory.pnlRatio;
        }
        if ((i & 4) != 0) {
            str3 = profitHistory.profitNum;
        }
        if ((i & 8) != 0) {
            str4 = profitHistory.timeUnit;
        }
        return profitHistory.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.profitNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitHistory copy(String str, String str2, String str3, String str4) {
        return new ProfitHistory(str, str2, str3, str4);
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
        if (!(obj instanceof ProfitHistory)) {
            return false;
        }
        ProfitHistory profitHistory = (ProfitHistory) obj;
        return Intrinsics.EZpvd((Object) this.cTime, (Object) profitHistory.cTime) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) profitHistory.pnlRatio) && Intrinsics.EZpvd((Object) this.profitNum, (Object) profitHistory.profitNum) && Intrinsics.EZpvd((Object) this.timeUnit, (Object) profitHistory.timeUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitNum() {
        return this.profitNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeUnit() {
        return this.timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.cTime;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.pnlRatio;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.profitNum;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.timeUnit;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProfitHistory(cTime=" + this.cTime + ", pnlRatio=" + this.pnlRatio + ", profitNum=" + this.profitNum + ", timeUnit=" + this.timeUnit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.cTime);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.profitNum);
        parcel.writeString(this.timeUnit);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.ProfitHistory.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProfitHistory> serializer() {
            return ProfitHistory$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProfitHistory(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cTime = null;
        } else {
            this.cTime = str;
        }
        if ((i & 2) == 0) {
            this.pnlRatio = null;
        } else {
            this.pnlRatio = str2;
        }
        if ((i & 4) == 0) {
            this.profitNum = null;
        } else {
            this.profitNum = str3;
        }
        if ((i & 8) == 0) {
            this.timeUnit = null;
        } else {
            this.timeUnit = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ProfitHistory profitHistory, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || profitHistory.cTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, profitHistory.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || profitHistory.pnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, profitHistory.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || profitHistory.profitNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, profitHistory.profitNum);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && profitHistory.timeUnit == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, profitHistory.timeUnit);
    }

    public ProfitHistory(String str, String str2, String str3, String str4) {
        this.cTime = str;
        this.pnlRatio = str2;
        this.profitNum = str3;
        this.timeUnit = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:120) call: com.okinc.unify_trade.biz.bot.ProfitHistory.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ProfitHistory(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
