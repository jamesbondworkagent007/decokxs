package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class YieldHunterSettlementCurrencyResponse implements Parcelable {
    private String estAplRatioHigh;
    private String estAplRatioLow;
    private String settleCcy;
    private final String stkHigh;
    private final String stkLow;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<YieldHunterSettlementCurrencyResponse> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<YieldHunterSettlementCurrencyResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YieldHunterSettlementCurrencyResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new YieldHunterSettlementCurrencyResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YieldHunterSettlementCurrencyResponse[] newArray(int i) {
            return new YieldHunterSettlementCurrencyResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ YieldHunterSettlementCurrencyResponse copy$default(YieldHunterSettlementCurrencyResponse yieldHunterSettlementCurrencyResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = yieldHunterSettlementCurrencyResponse.settleCcy;
        }
        if ((i & 2) != 0) {
            str2 = yieldHunterSettlementCurrencyResponse.estAplRatioLow;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = yieldHunterSettlementCurrencyResponse.estAplRatioHigh;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = yieldHunterSettlementCurrencyResponse.stkLow;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = yieldHunterSettlementCurrencyResponse.stkHigh;
        }
        return yieldHunterSettlementCurrencyResponse.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.settleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.estAplRatioLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.estAplRatioHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.stkLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.stkHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final YieldHunterSettlementCurrencyResponse copy(String str, String str2, String str3, String str4, String str5) {
        return new YieldHunterSettlementCurrencyResponse(str, str2, str3, str4, str5);
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
        if (!(obj instanceof YieldHunterSettlementCurrencyResponse)) {
            return false;
        }
        YieldHunterSettlementCurrencyResponse yieldHunterSettlementCurrencyResponse = (YieldHunterSettlementCurrencyResponse) obj;
        return Intrinsics.EZpvd((Object) this.settleCcy, (Object) yieldHunterSettlementCurrencyResponse.settleCcy) && Intrinsics.EZpvd((Object) this.estAplRatioLow, (Object) yieldHunterSettlementCurrencyResponse.estAplRatioLow) && Intrinsics.EZpvd((Object) this.estAplRatioHigh, (Object) yieldHunterSettlementCurrencyResponse.estAplRatioHigh) && Intrinsics.EZpvd((Object) this.stkLow, (Object) yieldHunterSettlementCurrencyResponse.stkLow) && Intrinsics.EZpvd((Object) this.stkHigh, (Object) yieldHunterSettlementCurrencyResponse.stkHigh);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstAplRatioHigh() {
        return this.estAplRatioHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstAplRatioLow() {
        return this.estAplRatioLow;
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
        String str = this.settleCcy;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.estAplRatioLow;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.estAplRatioHigh;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.stkLow;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.stkHigh;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstAplRatioHigh(String str) {
        this.estAplRatioHigh = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstAplRatioLow(String str) {
        this.estAplRatioLow = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettleCcy(String str) {
        this.settleCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "YieldHunterSettlementCurrencyResponse(settleCcy=" + this.settleCcy + ", estAplRatioLow=" + this.estAplRatioLow + ", estAplRatioHigh=" + this.estAplRatioHigh + ", stkLow=" + this.stkLow + ", stkHigh=" + this.stkHigh + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.settleCcy);
        parcel.writeString(this.estAplRatioLow);
        parcel.writeString(this.estAplRatioHigh);
        parcel.writeString(this.stkLow);
        parcel.writeString(this.stkHigh);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.YieldHunterSettlementCurrencyResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<YieldHunterSettlementCurrencyResponse> serializer() {
            return YieldHunterSettlementCurrencyResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ YieldHunterSettlementCurrencyResponse(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (24 != (i & 24)) {
            PluginExceptionsKt.throwMissingFieldException(i, 24, YieldHunterSettlementCurrencyResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.settleCcy = null;
        } else {
            this.settleCcy = str;
        }
        if ((i & 2) == 0) {
            this.estAplRatioLow = null;
        } else {
            this.estAplRatioLow = str2;
        }
        if ((i & 4) == 0) {
            this.estAplRatioHigh = null;
        } else {
            this.estAplRatioHigh = str3;
        }
        this.stkLow = str4;
        this.stkHigh = str5;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(YieldHunterSettlementCurrencyResponse yieldHunterSettlementCurrencyResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || yieldHunterSettlementCurrencyResponse.settleCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, yieldHunterSettlementCurrencyResponse.settleCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || yieldHunterSettlementCurrencyResponse.estAplRatioLow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, yieldHunterSettlementCurrencyResponse.estAplRatioLow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || yieldHunterSettlementCurrencyResponse.estAplRatioHigh != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, yieldHunterSettlementCurrencyResponse.estAplRatioHigh);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, yieldHunterSettlementCurrencyResponse.stkLow);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, yieldHunterSettlementCurrencyResponse.stkHigh);
    }

    public YieldHunterSettlementCurrencyResponse(String str, String str2, String str3, String str4, String str5) {
        this.settleCcy = str;
        this.estAplRatioLow = str2;
        this.estAplRatioHigh = str3;
        this.stkLow = str4;
        this.stkHigh = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.unify_trade.biz.YieldHunterSettlementCurrencyResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ YieldHunterSettlementCurrencyResponse(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, str5);
    }
}
