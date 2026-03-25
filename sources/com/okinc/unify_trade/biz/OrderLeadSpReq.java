package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
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
public final class OrderLeadSpReq implements Parcelable {
    private String instType;
    private String slOrdPx;
    private String slTriggerPx;
    private String slTriggerType;
    private String tpOrdPx;
    private String tpTriggerPx;
    private String tpTriggerType;
    private String tradeItemId;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OrderLeadSpReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<OrderLeadSpReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderLeadSpReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OrderLeadSpReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderLeadSpReq[] newArray(int i) {
            return new OrderLeadSpReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderLeadSpReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tradeItemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tpTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.slTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderLeadSpReq copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new OrderLeadSpReq(str, str2, str3, str4, str5, str6, str7, str8, str9);
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
        if (!(obj instanceof OrderLeadSpReq)) {
            return false;
        }
        OrderLeadSpReq orderLeadSpReq = (OrderLeadSpReq) obj;
        return Intrinsics.EZpvd((Object) this.tradeItemId, (Object) orderLeadSpReq.tradeItemId) && Intrinsics.EZpvd((Object) this.type, (Object) orderLeadSpReq.type) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) orderLeadSpReq.tpTriggerPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) orderLeadSpReq.slTriggerPx) && Intrinsics.EZpvd((Object) this.tpTriggerType, (Object) orderLeadSpReq.tpTriggerType) && Intrinsics.EZpvd((Object) this.slTriggerType, (Object) orderLeadSpReq.slTriggerType) && Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) orderLeadSpReq.tpOrdPx) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) orderLeadSpReq.slOrdPx) && Intrinsics.EZpvd((Object) this.instType, (Object) orderLeadSpReq.instType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
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
    public final String getSlTriggerType() {
        return this.slTriggerType;
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
    public final String getTpTriggerType() {
        return this.tpTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeItemId() {
        return this.tradeItemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tradeItemId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.type;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tpTriggerPx;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.slTriggerPx;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tpTriggerType;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.slTriggerType;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tpOrdPx;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.slOrdPx;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.instType;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(String str) {
        this.instType = str;
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
    public final void setSlTriggerType(String str) {
        this.slTriggerType = str;
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
    public final void setTpTriggerType(String str) {
        this.tpTriggerType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeItemId(String str) {
        this.tradeItemId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderLeadSpReq(tradeItemId=" + this.tradeItemId + ", type=" + this.type + ", tpTriggerPx=" + this.tpTriggerPx + ", slTriggerPx=" + this.slTriggerPx + ", tpTriggerType=" + this.tpTriggerType + ", slTriggerType=" + this.slTriggerType + ", tpOrdPx=" + this.tpOrdPx + ", slOrdPx=" + this.slOrdPx + ", instType=" + this.instType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tradeItemId);
        parcel.writeString(this.type);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.tpTriggerType);
        parcel.writeString(this.slTriggerType);
        parcel.writeString(this.tpOrdPx);
        parcel.writeString(this.slOrdPx);
        parcel.writeString(this.instType);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OrderLeadSpReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderLeadSpReq> serializer() {
            return OrderLeadSpReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderLeadSpReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tradeItemId = null;
        } else {
            this.tradeItemId = str;
        }
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.tpTriggerPx = null;
        } else {
            this.tpTriggerPx = str3;
        }
        if ((i & 8) == 0) {
            this.slTriggerPx = null;
        } else {
            this.slTriggerPx = str4;
        }
        if ((i & 16) == 0) {
            this.tpTriggerType = null;
        } else {
            this.tpTriggerType = str5;
        }
        if ((i & 32) == 0) {
            this.slTriggerType = null;
        } else {
            this.slTriggerType = str6;
        }
        if ((i & 64) == 0) {
            this.tpOrdPx = null;
        } else {
            this.tpOrdPx = str7;
        }
        if ((i & 128) == 0) {
            this.slOrdPx = null;
        } else {
            this.slOrdPx = str8;
        }
        if ((i & 256) == 0) {
            this.instType = null;
        } else {
            this.instType = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OrderLeadSpReq orderLeadSpReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || orderLeadSpReq.tradeItemId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, orderLeadSpReq.tradeItemId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || orderLeadSpReq.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, orderLeadSpReq.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || orderLeadSpReq.tpTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, orderLeadSpReq.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || orderLeadSpReq.slTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, orderLeadSpReq.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || orderLeadSpReq.tpTriggerType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, orderLeadSpReq.tpTriggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || orderLeadSpReq.slTriggerType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, orderLeadSpReq.slTriggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || orderLeadSpReq.tpOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, orderLeadSpReq.tpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || orderLeadSpReq.slOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, orderLeadSpReq.slOrdPx);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && orderLeadSpReq.instType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, orderLeadSpReq.instType);
    }

    public OrderLeadSpReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.tradeItemId = str;
        this.type = str2;
        this.tpTriggerPx = str3;
        this.slTriggerPx = str4;
        this.tpTriggerType = str5;
        this.slTriggerType = str6;
        this.tpOrdPx = str7;
        this.slOrdPx = str8;
        this.instType = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3222) call: com.okinc.unify_trade.biz.OrderLeadSpReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OrderLeadSpReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : null);
    }
}
