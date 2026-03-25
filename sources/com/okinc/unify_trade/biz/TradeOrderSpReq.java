package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class TradeOrderSpReq implements Parcelable {
    private Boolean isTPLimit;
    private String slOrdPx;
    private String slTriggerPx;
    private String slTriggerPxType;
    private String slTriggerRatio;
    private String tpOrdKind;
    private String tpOrdPx;
    private String tpTriggerPx;
    private String tpTriggerPxType;
    private String tpTriggerRatio;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeOrderSpReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<TradeOrderSpReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeOrderSpReq createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TradeOrderSpReq(string, string2, string3, string4, string5, string6, string7, boolValueOf, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeOrderSpReq[] newArray(int i) {
            return new TradeOrderSpReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeOrderSpReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.slTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tpOrdKind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.isTPLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tpTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeOrderSpReq copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9) {
        return new TradeOrderSpReq(str, str2, str3, str4, str5, str6, str7, bool, str8, str9);
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
        if (!(obj instanceof TradeOrderSpReq)) {
            return false;
        }
        TradeOrderSpReq tradeOrderSpReq = (TradeOrderSpReq) obj;
        return Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) tradeOrderSpReq.tpTriggerPx) && Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) tradeOrderSpReq.tpOrdPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) tradeOrderSpReq.slTriggerPx) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) tradeOrderSpReq.slOrdPx) && Intrinsics.EZpvd((Object) this.tpTriggerPxType, (Object) tradeOrderSpReq.tpTriggerPxType) && Intrinsics.EZpvd((Object) this.slTriggerPxType, (Object) tradeOrderSpReq.slTriggerPxType) && Intrinsics.EZpvd((Object) this.tpOrdKind, (Object) tradeOrderSpReq.tpOrdKind) && Intrinsics.EZpvd(this.isTPLimit, tradeOrderSpReq.isTPLimit) && Intrinsics.EZpvd((Object) this.tpTriggerRatio, (Object) tradeOrderSpReq.tpTriggerRatio) && Intrinsics.EZpvd((Object) this.slTriggerRatio, (Object) tradeOrderSpReq.slTriggerRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlOrdPx() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPxType() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerRatio() {
        return this.slTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrdKind() {
        return this.tpOrdKind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrdPx() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPxType() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerRatio() {
        return this.tpTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tpTriggerPx;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tpOrdPx;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.slTriggerPx;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.slOrdPx;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tpTriggerPxType;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.slTriggerPxType;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tpOrdKind;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        Boolean bool = this.isTPLimit;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        String str8 = this.tpTriggerRatio;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.slTriggerRatio;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTPLimit() {
        return this.isTPLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrdPx(String str) {
        this.slOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPx(String str) {
        this.slTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPxType(String str) {
        this.slTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerRatio(String str) {
        this.slTriggerRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTPLimit(Boolean bool) {
        this.isTPLimit = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrdKind(String str) {
        this.tpOrdKind = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrdPx(String str) {
        this.tpOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPx(String str) {
        this.tpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPxType(String str) {
        this.tpTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerRatio(String str) {
        this.tpTriggerRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeOrderSpReq(tpTriggerPx=" + this.tpTriggerPx + ", tpOrdPx=" + this.tpOrdPx + ", slTriggerPx=" + this.slTriggerPx + ", slOrdPx=" + this.slOrdPx + ", tpTriggerPxType=" + this.tpTriggerPxType + ", slTriggerPxType=" + this.slTriggerPxType + ", tpOrdKind=" + this.tpOrdKind + ", isTPLimit=" + this.isTPLimit + ", tpTriggerRatio=" + this.tpTriggerRatio + ", slTriggerRatio=" + this.slTriggerRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.tpOrdPx);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.slOrdPx);
        parcel.writeString(this.tpTriggerPxType);
        parcel.writeString(this.slTriggerPxType);
        parcel.writeString(this.tpOrdKind);
        Boolean bool = this.isTPLimit;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.tpTriggerRatio);
        parcel.writeString(this.slTriggerRatio);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeOrderSpReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeOrderSpReq> serializer() {
            return TradeOrderSpReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeOrderSpReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tpTriggerPx = null;
        } else {
            this.tpTriggerPx = str;
        }
        if ((i & 2) == 0) {
            this.tpOrdPx = null;
        } else {
            this.tpOrdPx = str2;
        }
        if ((i & 4) == 0) {
            this.slTriggerPx = null;
        } else {
            this.slTriggerPx = str3;
        }
        if ((i & 8) == 0) {
            this.slOrdPx = null;
        } else {
            this.slOrdPx = str4;
        }
        if ((i & 16) == 0) {
            this.tpTriggerPxType = null;
        } else {
            this.tpTriggerPxType = str5;
        }
        if ((i & 32) == 0) {
            this.slTriggerPxType = null;
        } else {
            this.slTriggerPxType = str6;
        }
        if ((i & 64) == 0) {
            this.tpOrdKind = null;
        } else {
            this.tpOrdKind = str7;
        }
        if ((i & 128) == 0) {
            this.isTPLimit = Boolean.FALSE;
        } else {
            this.isTPLimit = bool;
        }
        if ((i & 256) == 0) {
            this.tpTriggerRatio = null;
        } else {
            this.tpTriggerRatio = str8;
        }
        if ((i & 512) == 0) {
            this.slTriggerRatio = null;
        } else {
            this.slTriggerRatio = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeOrderSpReq tradeOrderSpReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tradeOrderSpReq.tpTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tradeOrderSpReq.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tradeOrderSpReq.tpOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tradeOrderSpReq.tpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tradeOrderSpReq.slTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, tradeOrderSpReq.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tradeOrderSpReq.slOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, tradeOrderSpReq.slOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tradeOrderSpReq.tpTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, tradeOrderSpReq.tpTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tradeOrderSpReq.slTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tradeOrderSpReq.slTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tradeOrderSpReq.tpOrdKind != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tradeOrderSpReq.tpOrdKind);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(tradeOrderSpReq.isTPLimit, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, tradeOrderSpReq.isTPLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tradeOrderSpReq.tpTriggerRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, tradeOrderSpReq.tpTriggerRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && tradeOrderSpReq.slTriggerRatio == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, tradeOrderSpReq.slTriggerRatio);
    }

    public TradeOrderSpReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9) {
        this.tpTriggerPx = str;
        this.tpOrdPx = str2;
        this.slTriggerPx = str3;
        this.slOrdPx = str4;
        this.tpTriggerPxType = str5;
        this.slTriggerPxType = str6;
        this.tpOrdKind = str7;
        this.isTPLimit = bool;
        this.tpTriggerRatio = str8;
        this.slTriggerRatio = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:347) call: com.okinc.unify_trade.biz.TradeOrderSpReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradeOrderSpReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? Boolean.FALSE : bool, (i & 256) != 0 ? null : str8, (i & 512) == 0 ? str9 : null);
    }

    public final boolean isTpTriggerRatioValid() {
        return C33129mqd.OLrzqt((CharSequence) this.tpTriggerRatio) && C33129mqd.AhwBna(this.tpTriggerRatio, 0);
    }

    public final boolean isSlTriggerRatioValid() {
        return C33129mqd.OLrzqt((CharSequence) this.slTriggerRatio) && C33129mqd.AhwBna(this.slTriggerRatio, 0);
    }

    public final boolean isOCO() {
        return C33129mqd.OLrzqt((CharSequence) this.tpTriggerPx) && C33129mqd.OLrzqt((CharSequence) this.slTriggerPx);
    }

    public final String getConditionCalPrice() {
        return (C33129mqd.OLrzqt((CharSequence) this.tpTriggerPx) && C33129mqd.OLrzqt((CharSequence) this.tpOrdPx)) ? Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) MultiTransferSignData.DEFAULT_INTERVAL) ? this.tpTriggerPx : this.tpOrdPx : Intrinsics.EZpvd((Object) this.slOrdPx, (Object) MultiTransferSignData.DEFAULT_INTERVAL) ? this.slTriggerPx : this.slOrdPx;
    }

    public final boolean isProfitPosition() {
        return C33129mqd.OLrzqt((CharSequence) this.tpTriggerPx);
    }

    public final boolean isTpValid() {
        if (Intrinsics.EZpvd(this.isTPLimit, Boolean.TRUE)) {
            return C33129mqd.AEQbTJ(this.tpOrdPx, 0);
        }
        return C33129mqd.AEQbTJ(this.tpTriggerPx, 0) || isTpTriggerRatioValid();
    }

    public final boolean isSlValid() {
        return C33129mqd.AEQbTJ(this.slTriggerPx, 0) || isSlTriggerRatioValid();
    }

    public final boolean isValid() {
        return isTpValid() || isSlValid();
    }
}
