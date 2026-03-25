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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class YieldHunterInstrumentRequest implements Parcelable {
    private int estAplRatioRange;
    private int expTimeRange;
    private String optType;
    private String settleCcy;
    private String stkHigh;
    private String stkLow;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<YieldHunterInstrumentRequest> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<YieldHunterInstrumentRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YieldHunterInstrumentRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new YieldHunterInstrumentRequest(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YieldHunterInstrumentRequest[] newArray(int i) {
            return new YieldHunterInstrumentRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public YieldHunterInstrumentRequest() {
        this((String) null, (String) null, 0, 0, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ YieldHunterInstrumentRequest copy$default(YieldHunterInstrumentRequest yieldHunterInstrumentRequest, String str, String str2, int i, int i2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = yieldHunterInstrumentRequest.stkHigh;
        }
        if ((i3 & 2) != 0) {
            str2 = yieldHunterInstrumentRequest.stkLow;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            i = yieldHunterInstrumentRequest.estAplRatioRange;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = yieldHunterInstrumentRequest.expTimeRange;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str3 = yieldHunterInstrumentRequest.optType;
        }
        String str6 = str3;
        if ((i3 & 32) != 0) {
            str4 = yieldHunterInstrumentRequest.settleCcy;
        }
        return yieldHunterInstrumentRequest.copy(str, str5, i4, i5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.stkHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.stkLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.estAplRatioRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.expTimeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.optType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.settleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final YieldHunterInstrumentRequest copy(String str, String str2, int i, int i2, String str3, String str4) {
        return new YieldHunterInstrumentRequest(str, str2, i, i2, str3, str4);
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
        if (!(obj instanceof YieldHunterInstrumentRequest)) {
            return false;
        }
        YieldHunterInstrumentRequest yieldHunterInstrumentRequest = (YieldHunterInstrumentRequest) obj;
        return Intrinsics.EZpvd((Object) this.stkHigh, (Object) yieldHunterInstrumentRequest.stkHigh) && Intrinsics.EZpvd((Object) this.stkLow, (Object) yieldHunterInstrumentRequest.stkLow) && this.estAplRatioRange == yieldHunterInstrumentRequest.estAplRatioRange && this.expTimeRange == yieldHunterInstrumentRequest.expTimeRange && Intrinsics.EZpvd((Object) this.optType, (Object) yieldHunterInstrumentRequest.optType) && Intrinsics.EZpvd((Object) this.settleCcy, (Object) yieldHunterInstrumentRequest.settleCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getEstAplRatioRange() {
        return this.estAplRatioRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getExpTimeRange() {
        return this.expTimeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOptType() {
        return this.optType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettleCcy() {
        return this.settleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStkHigh() {
        return this.stkHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStkLow() {
        return this.stkLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.stkHigh;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.stkLow;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = Integer.hashCode(this.estAplRatioRange);
        int iHashCode4 = Integer.hashCode(this.expTimeRange);
        String str3 = this.optType;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.settleCcy;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstAplRatioRange(int i) {
        this.estAplRatioRange = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpTimeRange(int i) {
        this.expTimeRange = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOptType(String str) {
        this.optType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettleCcy(String str) {
        this.settleCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStkHigh(String str) {
        this.stkHigh = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStkLow(String str) {
        this.stkLow = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "YieldHunterInstrumentRequest(stkHigh=" + this.stkHigh + ", stkLow=" + this.stkLow + ", estAplRatioRange=" + this.estAplRatioRange + ", expTimeRange=" + this.expTimeRange + ", optType=" + this.optType + ", settleCcy=" + this.settleCcy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.stkHigh);
        parcel.writeString(this.stkLow);
        parcel.writeInt(this.estAplRatioRange);
        parcel.writeInt(this.expTimeRange);
        parcel.writeString(this.optType);
        parcel.writeString(this.settleCcy);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.YieldHunterInstrumentRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<YieldHunterInstrumentRequest> serializer() {
            return YieldHunterInstrumentRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ YieldHunterInstrumentRequest(int i, String str, String str2, int i2, int i3, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.stkHigh = null;
        } else {
            this.stkHigh = str;
        }
        if ((i & 2) == 0) {
            this.stkLow = null;
        } else {
            this.stkLow = str2;
        }
        if ((i & 4) == 0) {
            this.estAplRatioRange = 0;
        } else {
            this.estAplRatioRange = i2;
        }
        if ((i & 8) == 0) {
            this.expTimeRange = 0;
        } else {
            this.expTimeRange = i3;
        }
        if ((i & 16) == 0) {
            this.optType = null;
        } else {
            this.optType = str3;
        }
        if ((i & 32) == 0) {
            this.settleCcy = null;
        } else {
            this.settleCcy = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(YieldHunterInstrumentRequest yieldHunterInstrumentRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || yieldHunterInstrumentRequest.stkHigh != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, yieldHunterInstrumentRequest.stkHigh);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || yieldHunterInstrumentRequest.stkLow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, yieldHunterInstrumentRequest.stkLow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || yieldHunterInstrumentRequest.estAplRatioRange != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, yieldHunterInstrumentRequest.estAplRatioRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || yieldHunterInstrumentRequest.expTimeRange != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, yieldHunterInstrumentRequest.expTimeRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || yieldHunterInstrumentRequest.optType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, yieldHunterInstrumentRequest.optType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && yieldHunterInstrumentRequest.settleCcy == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, yieldHunterInstrumentRequest.settleCcy);
    }

    public YieldHunterInstrumentRequest(String str, String str2, int i, int i2, String str3, String str4) {
        this.stkHigh = str;
        this.stkLow = str2;
        this.estAplRatioRange = i;
        this.expTimeRange = i2;
        this.optType = str3;
        this.settleCcy = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.unify_trade.biz.YieldHunterInstrumentRequest.<init>(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ YieldHunterInstrumentRequest(String str, String str2, int i, int i2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4);
    }
}
