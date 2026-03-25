package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class RFQGetQuoteResp implements Parcelable {
    private final String cTime;
    private final String clRfqId;
    private final ArrayList<RFQGetQuoteLeg> legs;
    private final String quoteId;
    private final String quotePrice;
    private final String quoteSide;
    private final String rfqId;
    private final String state;
    private final String strategy;
    private final String traderCode;
    private final String uTime;
    private final String validUntil;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RFQGetQuoteResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(RFQGetQuoteLeg$$serializer.INSTANCE), null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<RFQGetQuoteResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RFQGetQuoteResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(RFQGetQuoteLeg.CREATOR.createFromParcel(parcel));
            }
            return new RFQGetQuoteResp(string, string2, string3, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RFQGetQuoteResp[] newArray(int i) {
            return new RFQGetQuoteResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RFQGetQuoteResp() {
        this((String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.validUntil;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.traderCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.strategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.quotePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RFQGetQuoteLeg> component4() {
        return this.legs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.rfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.quoteSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.clRfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RFQGetQuoteResp copy(String str, String str2, String str3, @NotNull ArrayList<RFQGetQuoteLeg> arrayList, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new RFQGetQuoteResp(str, str2, str3, arrayList, str4, str5, str6, str7, str8, str9, str10, str11);
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
        if (!(obj instanceof RFQGetQuoteResp)) {
            return false;
        }
        RFQGetQuoteResp rFQGetQuoteResp = (RFQGetQuoteResp) obj;
        return Intrinsics.EZpvd((Object) this.validUntil, (Object) rFQGetQuoteResp.validUntil) && Intrinsics.EZpvd((Object) this.cTime, (Object) rFQGetQuoteResp.cTime) && Intrinsics.EZpvd((Object) this.uTime, (Object) rFQGetQuoteResp.uTime) && Intrinsics.EZpvd(this.legs, rFQGetQuoteResp.legs) && Intrinsics.EZpvd((Object) this.quoteId, (Object) rFQGetQuoteResp.quoteId) && Intrinsics.EZpvd((Object) this.rfqId, (Object) rFQGetQuoteResp.rfqId) && Intrinsics.EZpvd((Object) this.quoteSide, (Object) rFQGetQuoteResp.quoteSide) && Intrinsics.EZpvd((Object) this.state, (Object) rFQGetQuoteResp.state) && Intrinsics.EZpvd((Object) this.clRfqId, (Object) rFQGetQuoteResp.clRfqId) && Intrinsics.EZpvd((Object) this.traderCode, (Object) rFQGetQuoteResp.traderCode) && Intrinsics.EZpvd((Object) this.strategy, (Object) rFQGetQuoteResp.strategy) && Intrinsics.EZpvd((Object) this.quotePrice, (Object) rFQGetQuoteResp.quotePrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClRfqId() {
        return this.clRfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RFQGetQuoteLeg> getLegs() {
        return this.legs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuotePrice() {
        return this.quotePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSide() {
        return this.quoteSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRfqId() {
        return this.rfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategy() {
        return this.strategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTraderCode() {
        return this.traderCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValidUntil() {
        return this.validUntil;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.validUntil;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.cTime;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.uTime;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = this.legs.hashCode();
        String str4 = this.quoteId;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.rfqId;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.quoteSide;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.state;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.clRfqId;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.traderCode;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.strategy;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.quotePrice;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RFQGetQuoteResp(validUntil=" + this.validUntil + ", cTime=" + this.cTime + ", uTime=" + this.uTime + ", legs=" + this.legs + ", quoteId=" + this.quoteId + ", rfqId=" + this.rfqId + ", quoteSide=" + this.quoteSide + ", state=" + this.state + ", clRfqId=" + this.clRfqId + ", traderCode=" + this.traderCode + ", strategy=" + this.strategy + ", quotePrice=" + this.quotePrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.validUntil);
        parcel.writeString(this.cTime);
        parcel.writeString(this.uTime);
        ArrayList<RFQGetQuoteLeg> arrayList = this.legs;
        parcel.writeInt(arrayList.size());
        Iterator<RFQGetQuoteLeg> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.quoteId);
        parcel.writeString(this.rfqId);
        parcel.writeString(this.quoteSide);
        parcel.writeString(this.state);
        parcel.writeString(this.clRfqId);
        parcel.writeString(this.traderCode);
        parcel.writeString(this.strategy);
        parcel.writeString(this.quotePrice);
    }

    public /* synthetic */ RFQGetQuoteResp(int i, String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.validUntil = null;
        } else {
            this.validUntil = str;
        }
        if ((i & 2) == 0) {
            this.cTime = null;
        } else {
            this.cTime = str2;
        }
        if ((i & 4) == 0) {
            this.uTime = null;
        } else {
            this.uTime = str3;
        }
        if ((i & 8) == 0) {
            this.legs = new ArrayList<>();
        } else {
            this.legs = arrayList;
        }
        if ((i & 16) == 0) {
            this.quoteId = null;
        } else {
            this.quoteId = str4;
        }
        if ((i & 32) == 0) {
            this.rfqId = null;
        } else {
            this.rfqId = str5;
        }
        if ((i & 64) == 0) {
            this.quoteSide = null;
        } else {
            this.quoteSide = str6;
        }
        if ((i & 128) == 0) {
            this.state = null;
        } else {
            this.state = str7;
        }
        if ((i & 256) == 0) {
            this.clRfqId = null;
        } else {
            this.clRfqId = str8;
        }
        if ((i & 512) == 0) {
            this.traderCode = null;
        } else {
            this.traderCode = str9;
        }
        if ((i & 1024) == 0) {
            this.strategy = null;
        } else {
            this.strategy = str10;
        }
        if ((i & 2048) == 0) {
            this.quotePrice = null;
        } else {
            this.quotePrice = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RFQGetQuoteResp rFQGetQuoteResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rFQGetQuoteResp.validUntil != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, rFQGetQuoteResp.validUntil);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rFQGetQuoteResp.cTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, rFQGetQuoteResp.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || rFQGetQuoteResp.uTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, rFQGetQuoteResp.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(rFQGetQuoteResp.legs, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], rFQGetQuoteResp.legs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || rFQGetQuoteResp.quoteId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, rFQGetQuoteResp.quoteId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || rFQGetQuoteResp.rfqId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, rFQGetQuoteResp.rfqId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || rFQGetQuoteResp.quoteSide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, rFQGetQuoteResp.quoteSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || rFQGetQuoteResp.state != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, rFQGetQuoteResp.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || rFQGetQuoteResp.clRfqId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, rFQGetQuoteResp.clRfqId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || rFQGetQuoteResp.traderCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, rFQGetQuoteResp.traderCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || rFQGetQuoteResp.strategy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, rFQGetQuoteResp.strategy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && rFQGetQuoteResp.quotePrice == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, rFQGetQuoteResp.quotePrice);
    }

    public RFQGetQuoteResp(String str, String str2, String str3, @NotNull ArrayList<RFQGetQuoteLeg> arrayList, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.validUntil = str;
        this.cTime = str2;
        this.uTime = str3;
        this.legs = arrayList;
        this.quoteId = str4;
        this.rfqId = str5;
        this.quoteSide = str6;
        this.state = str7;
        this.clRfqId = str8;
        this.traderCode = str9;
        this.strategy = str10;
        this.quotePrice = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:5320) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r17v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.RFQGetQuoteLeg>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5316) call: com.okinc.unify_trade.biz.RFQGetQuoteResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RFQGetQuoteResp(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new ArrayList() : arrayList, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) == 0 ? str11 : null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RFQGetQuoteResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RFQGetQuoteResp> serializer() {
            return RFQGetQuoteResp$$serializer.INSTANCE;
        }
    }
}
