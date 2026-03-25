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
public final class RFQQuoteRespLeg implements Parcelable {
    public static final int $stable = 0;
    private final String fee;
    private final String feeCcy;
    private final String instId;
    private final String px;
    private final String side;
    private final String sz;
    private final String tradeId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RFQQuoteRespLeg> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RFQQuoteRespLeg> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RFQQuoteRespLeg createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RFQQuoteRespLeg(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RFQQuoteRespLeg[] newArray(int i) {
            return new RFQQuoteRespLeg[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RFQQuoteRespLeg() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RFQQuoteRespLeg copy$default(RFQQuoteRespLeg rFQQuoteRespLeg, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rFQQuoteRespLeg.instId;
        }
        if ((i & 2) != 0) {
            str2 = rFQQuoteRespLeg.px;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = rFQQuoteRespLeg.sz;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = rFQQuoteRespLeg.side;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = rFQQuoteRespLeg.fee;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = rFQQuoteRespLeg.feeCcy;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = rFQQuoteRespLeg.tradeId;
        }
        return rFQQuoteRespLeg.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RFQQuoteRespLeg copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new RFQQuoteRespLeg(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof RFQQuoteRespLeg)) {
            return false;
        }
        RFQQuoteRespLeg rFQQuoteRespLeg = (RFQQuoteRespLeg) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) rFQQuoteRespLeg.instId) && Intrinsics.EZpvd((Object) this.px, (Object) rFQQuoteRespLeg.px) && Intrinsics.EZpvd((Object) this.sz, (Object) rFQQuoteRespLeg.sz) && Intrinsics.EZpvd((Object) this.side, (Object) rFQQuoteRespLeg.side) && Intrinsics.EZpvd((Object) this.fee, (Object) rFQQuoteRespLeg.fee) && Intrinsics.EZpvd((Object) this.feeCcy, (Object) rFQQuoteRespLeg.feeCcy) && Intrinsics.EZpvd((Object) this.tradeId, (Object) rFQQuoteRespLeg.tradeId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeCcy() {
        return this.feeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeId() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.px;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.sz;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.side;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.fee;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.feeCcy;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tradeId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RFQQuoteRespLeg(instId=" + this.instId + ", px=" + this.px + ", sz=" + this.sz + ", side=" + this.side + ", fee=" + this.fee + ", feeCcy=" + this.feeCcy + ", tradeId=" + this.tradeId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.px);
        parcel.writeString(this.sz);
        parcel.writeString(this.side);
        parcel.writeString(this.fee);
        parcel.writeString(this.feeCcy);
        parcel.writeString(this.tradeId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RFQQuoteRespLeg.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RFQQuoteRespLeg> serializer() {
            return RFQQuoteRespLeg$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RFQQuoteRespLeg(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = null;
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.px = null;
        } else {
            this.px = str2;
        }
        if ((i & 4) == 0) {
            this.sz = null;
        } else {
            this.sz = str3;
        }
        if ((i & 8) == 0) {
            this.side = null;
        } else {
            this.side = str4;
        }
        if ((i & 16) == 0) {
            this.fee = null;
        } else {
            this.fee = str5;
        }
        if ((i & 32) == 0) {
            this.feeCcy = null;
        } else {
            this.feeCcy = str6;
        }
        if ((i & 64) == 0) {
            this.tradeId = null;
        } else {
            this.tradeId = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RFQQuoteRespLeg rFQQuoteRespLeg, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rFQQuoteRespLeg.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, rFQQuoteRespLeg.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rFQQuoteRespLeg.px != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, rFQQuoteRespLeg.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || rFQQuoteRespLeg.sz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, rFQQuoteRespLeg.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || rFQQuoteRespLeg.side != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, rFQQuoteRespLeg.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || rFQQuoteRespLeg.fee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, rFQQuoteRespLeg.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || rFQQuoteRespLeg.feeCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, rFQQuoteRespLeg.feeCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && rFQQuoteRespLeg.tradeId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, rFQQuoteRespLeg.tradeId);
    }

    public RFQQuoteRespLeg(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.instId = str;
        this.px = str2;
        this.sz = str3;
        this.side = str4;
        this.fee = str5;
        this.feeCcy = str6;
        this.tradeId = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5284) call: com.okinc.unify_trade.biz.RFQQuoteRespLeg.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RFQQuoteRespLeg(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
