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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SimpleProducts implements Parcelable {
    private String askPx;
    private String breakEvenPx;
    private String expectedRate;
    private String expiry;
    private String instId;
    private boolean isShowStroke;
    private String markPx;
    private String mobility;
    private String oddsType;
    private String riskType;
    private String stk;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SimpleProducts> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SimpleProducts> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleProducts createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SimpleProducts(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleProducts[] newArray(int i) {
            return new SimpleProducts[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleProducts() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.askPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.breakEvenPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.riskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isShowStroke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.markPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mobility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.oddsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.stk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.expectedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleProducts copy(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z) {
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
        return new SimpleProducts(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z);
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
        if (!(obj instanceof SimpleProducts)) {
            return false;
        }
        SimpleProducts simpleProducts = (SimpleProducts) obj;
        return Intrinsics.EZpvd((Object) this.askPx, (Object) simpleProducts.askPx) && Intrinsics.EZpvd((Object) this.expiry, (Object) simpleProducts.expiry) && Intrinsics.EZpvd((Object) this.instId, (Object) simpleProducts.instId) && Intrinsics.EZpvd((Object) this.markPx, (Object) simpleProducts.markPx) && Intrinsics.EZpvd((Object) this.mobility, (Object) simpleProducts.mobility) && Intrinsics.EZpvd((Object) this.oddsType, (Object) simpleProducts.oddsType) && Intrinsics.EZpvd((Object) this.stk, (Object) simpleProducts.stk) && Intrinsics.EZpvd((Object) this.type, (Object) simpleProducts.type) && Intrinsics.EZpvd((Object) this.expectedRate, (Object) simpleProducts.expectedRate) && Intrinsics.EZpvd((Object) this.breakEvenPx, (Object) simpleProducts.breakEvenPx) && Intrinsics.EZpvd((Object) this.riskType, (Object) simpleProducts.riskType) && this.isShowStroke == simpleProducts.isShowStroke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAskPx() {
        return this.askPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBreakEvenPx() {
        return this.breakEvenPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpectedRate() {
        return this.expectedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiry() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarkPx() {
        return this.markPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMobility() {
        return this.mobility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOddsType() {
        return this.oddsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskType() {
        return this.riskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStk() {
        return this.stk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.askPx;
        return ((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.expiry.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.markPx.hashCode()) * 31) + this.mobility.hashCode()) * 31) + this.oddsType.hashCode()) * 31) + this.stk.hashCode()) * 31) + this.type.hashCode()) * 31) + this.expectedRate.hashCode()) * 31) + this.breakEvenPx.hashCode()) * 31) + this.riskType.hashCode()) * 31) + Boolean.hashCode(this.isShowStroke);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowStroke() {
        return this.isShowStroke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAskPx(String str) {
        this.askPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBreakEvenPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.breakEvenPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpectedRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.expectedRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpiry(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.expiry = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarkPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.markPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMobility(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mobility = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOddsType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.oddsType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.riskType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowStroke(boolean z) {
        this.isShowStroke = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStk(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleProducts(askPx=" + this.askPx + ", expiry=" + this.expiry + ", instId=" + this.instId + ", markPx=" + this.markPx + ", mobility=" + this.mobility + ", oddsType=" + this.oddsType + ", stk=" + this.stk + ", type=" + this.type + ", expectedRate=" + this.expectedRate + ", breakEvenPx=" + this.breakEvenPx + ", riskType=" + this.riskType + ", isShowStroke=" + this.isShowStroke + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.askPx);
        parcel.writeString(this.expiry);
        parcel.writeString(this.instId);
        parcel.writeString(this.markPx);
        parcel.writeString(this.mobility);
        parcel.writeString(this.oddsType);
        parcel.writeString(this.stk);
        parcel.writeString(this.type);
        parcel.writeString(this.expectedRate);
        parcel.writeString(this.breakEvenPx);
        parcel.writeString(this.riskType);
        parcel.writeInt(this.isShowStroke ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SimpleProducts.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimpleProducts> serializer() {
            return SimpleProducts$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimpleProducts(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.askPx = "";
        } else {
            this.askPx = str;
        }
        if ((i & 2) == 0) {
            this.expiry = "1622188800000";
        } else {
            this.expiry = str2;
        }
        if ((i & 4) == 0) {
            this.instId = "";
        } else {
            this.instId = str3;
        }
        if ((i & 8) == 0) {
            this.markPx = "";
        } else {
            this.markPx = str4;
        }
        if ((i & 16) == 0) {
            this.mobility = "";
        } else {
            this.mobility = str5;
        }
        if ((i & 32) == 0) {
            this.oddsType = "";
        } else {
            this.oddsType = str6;
        }
        if ((i & 64) == 0) {
            this.stk = "";
        } else {
            this.stk = str7;
        }
        if ((i & 128) == 0) {
            this.type = "";
        } else {
            this.type = str8;
        }
        if ((i & 256) == 0) {
            this.expectedRate = "";
        } else {
            this.expectedRate = str9;
        }
        if ((i & 512) == 0) {
            this.breakEvenPx = "";
        } else {
            this.breakEvenPx = str10;
        }
        if ((i & 1024) == 0) {
            this.riskType = "";
        } else {
            this.riskType = str11;
        }
        if ((i & 2048) == 0) {
            this.isShowStroke = true;
        } else {
            this.isShowStroke = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SimpleProducts simpleProducts, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) simpleProducts.askPx, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, simpleProducts.askPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) simpleProducts.expiry, (Object) "1622188800000")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, simpleProducts.expiry);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) simpleProducts.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, simpleProducts.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) simpleProducts.markPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, simpleProducts.markPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) simpleProducts.mobility, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, simpleProducts.mobility);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) simpleProducts.oddsType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, simpleProducts.oddsType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) simpleProducts.stk, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, simpleProducts.stk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) simpleProducts.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, simpleProducts.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) simpleProducts.expectedRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, simpleProducts.expectedRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) simpleProducts.breakEvenPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, simpleProducts.breakEvenPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) simpleProducts.riskType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, simpleProducts.riskType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && simpleProducts.isShowStroke) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 11, simpleProducts.isShowStroke);
    }

    public SimpleProducts(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z) {
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
        this.askPx = str;
        this.expiry = str2;
        this.instId = str3;
        this.markPx = str4;
        this.mobility = str5;
        this.oddsType = str6;
        this.stk = str7;
        this.type = str8;
        this.expectedRate = str9;
        this.breakEvenPx = str10;
        this.riskType = str11;
        this.isShowStroke = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("1622188800000") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? true : (r25v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:1090) call: com.okinc.unify_trade.biz.SimpleProducts.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ SimpleProducts(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "1622188800000" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) == 0 ? str11 : "", (i & 2048) != 0 ? true : z);
    }
}
