package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.biz.TradeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyBaseReq implements Parcelable {
    private String ccy;
    private Boolean cxlOnClosePos;
    private String instId;
    private String instType;
    private String ordType;
    private String posSide;
    private Boolean reduceOnly;
    private String side;
    private String sourceAlgoId;
    private String tdMode;
    private TradeType tradeType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StrategyBaseReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.biz.TradeType", TradeType.values()), null, null};

    public static final class Creator implements Parcelable.Creator<StrategyBaseReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyBaseReq createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string7 = parcel.readString();
            TradeType tradeTypeCreateFromParcel = parcel.readInt() == 0 ? null : TradeType.CREATOR.createFromParcel(parcel);
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StrategyBaseReq(string, string2, string3, string4, string5, string6, boolValueOf, string7, tradeTypeCreateFromParcel, string8, boolValueOf2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategyBaseReq[] newArray(int i) {
            return new StrategyBaseReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyBaseReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (TradeType) null, (String) null, (Boolean) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.cxlOnClosePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeType component9() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyBaseReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, Boolean bool, @NotNull String str7, TradeType tradeType, String str8, Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new StrategyBaseReq(str, str2, str3, str4, str5, str6, bool, str7, tradeType, str8, bool2);
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
        if (!(obj instanceof StrategyBaseReq)) {
            return false;
        }
        StrategyBaseReq strategyBaseReq = (StrategyBaseReq) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) strategyBaseReq.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) strategyBaseReq.instType) && Intrinsics.EZpvd((Object) this.tdMode, (Object) strategyBaseReq.tdMode) && Intrinsics.EZpvd((Object) this.side, (Object) strategyBaseReq.side) && Intrinsics.EZpvd((Object) this.posSide, (Object) strategyBaseReq.posSide) && Intrinsics.EZpvd((Object) this.ccy, (Object) strategyBaseReq.ccy) && Intrinsics.EZpvd(this.reduceOnly, strategyBaseReq.reduceOnly) && Intrinsics.EZpvd((Object) this.ordType, (Object) strategyBaseReq.ordType) && this.tradeType == strategyBaseReq.tradeType && Intrinsics.EZpvd((Object) this.sourceAlgoId, (Object) strategyBaseReq.sourceAlgoId) && Intrinsics.EZpvd(this.cxlOnClosePos, strategyBaseReq.cxlOnClosePos);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCxlOnClosePos() {
        return this.cxlOnClosePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceAlgoId() {
        return this.sourceAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeType getTradeType() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        int iHashCode2 = this.instType.hashCode();
        int iHashCode3 = this.tdMode.hashCode();
        String str = this.side;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.posSide;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ccy;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.reduceOnly;
        int iHashCode7 = bool == null ? 0 : bool.hashCode();
        int iHashCode8 = this.ordType.hashCode();
        TradeType tradeType = this.tradeType;
        int iHashCode9 = tradeType == null ? 0 : tradeType.hashCode();
        String str4 = this.sourceAlgoId;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        Boolean bool2 = this.cxlOnClosePos;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCxlOnClosePos(Boolean bool) {
        this.cxlOnClosePos = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(String str) {
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReduceOnly(Boolean bool) {
        this.reduceOnly = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(String str) {
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceAlgoId(String str) {
        this.sourceAlgoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTdMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tdMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeType(TradeType tradeType) {
        this.tradeType = tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyBaseReq(instId=" + this.instId + ", instType=" + this.instType + ", tdMode=" + this.tdMode + ", side=" + this.side + ", posSide=" + this.posSide + ", ccy=" + this.ccy + ", reduceOnly=" + this.reduceOnly + ", ordType=" + this.ordType + ", tradeType=" + this.tradeType + ", sourceAlgoId=" + this.sourceAlgoId + ", cxlOnClosePos=" + this.cxlOnClosePos + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.tdMode);
        parcel.writeString(this.side);
        parcel.writeString(this.posSide);
        parcel.writeString(this.ccy);
        Boolean bool = this.reduceOnly;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.ordType);
        TradeType tradeType = this.tradeType;
        if (tradeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tradeType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.sourceAlgoId);
        Boolean bool2 = this.cxlOnClosePos;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyBaseReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyBaseReq> serializer() {
            return StrategyBaseReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyBaseReq(int i, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, TradeType tradeType, String str8, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.instType = "";
        } else {
            this.instType = str2;
        }
        if ((i & 4) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str3;
        }
        if ((i & 8) == 0) {
            this.side = null;
        } else {
            this.side = str4;
        }
        if ((i & 16) == 0) {
            this.posSide = null;
        } else {
            this.posSide = str5;
        }
        if ((i & 32) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str6;
        }
        if ((i & 64) == 0) {
            this.reduceOnly = null;
        } else {
            this.reduceOnly = bool;
        }
        if ((i & 128) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str7;
        }
        if ((i & 256) == 0) {
            this.tradeType = null;
        } else {
            this.tradeType = tradeType;
        }
        if ((i & 512) == 0) {
            this.sourceAlgoId = null;
        } else {
            this.sourceAlgoId = str8;
        }
        if ((i & 1024) == 0) {
            this.cxlOnClosePos = null;
        } else {
            this.cxlOnClosePos = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyBaseReq strategyBaseReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyBaseReq.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyBaseReq.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyBaseReq.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyBaseReq.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) strategyBaseReq.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, strategyBaseReq.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || strategyBaseReq.side != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, strategyBaseReq.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || strategyBaseReq.posSide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, strategyBaseReq.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || strategyBaseReq.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, strategyBaseReq.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || strategyBaseReq.reduceOnly != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, strategyBaseReq.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) strategyBaseReq.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, strategyBaseReq.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || strategyBaseReq.tradeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], strategyBaseReq.tradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || strategyBaseReq.sourceAlgoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, strategyBaseReq.sourceAlgoId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && strategyBaseReq.cxlOnClosePos == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, strategyBaseReq.cxlOnClosePos);
    }

    public StrategyBaseReq(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, Boolean bool, @NotNull String str7, TradeType tradeType, String str8, Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.instId = str;
        this.instType = str2;
        this.tdMode = str3;
        this.side = str4;
        this.posSide = str5;
        this.ccy = str6;
        this.reduceOnly = bool;
        this.ordType = str7;
        this.tradeType = tradeType;
        this.sourceAlgoId = str8;
        this.cxlOnClosePos = bool2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r24v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:com.okinc.biz.TradeType:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.biz.TradeType) : (r21v0 com.okinc.biz.TradeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, com.okinc.biz.TradeType, java.lang.String, java.lang.Boolean):void (m)] (LINE:606) call: com.okinc.unify_trade.biz.StrategyBaseReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, com.okinc.biz.TradeType, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ StrategyBaseReq(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, TradeType tradeType, String str8, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : bool, (i & 128) == 0 ? str7 : "", (i & 256) != 0 ? null : tradeType, (i & 512) != 0 ? null : str8, (i & 1024) == 0 ? bool2 : null);
    }
}
