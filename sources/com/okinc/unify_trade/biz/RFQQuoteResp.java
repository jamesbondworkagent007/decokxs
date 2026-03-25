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
public final class RFQQuoteResp implements Parcelable {
    private final String blockTdId;
    private final String cTime;
    private final String clQuoteId;
    private final String clRfqId;
    private final ArrayList<RFQQuoteRespLeg> legs;
    private final String mTraderCode;
    private final String quoteId;
    private final String rfqId;
    private final String tTraderCode;
    private final String tag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RFQQuoteResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(RFQQuoteRespLeg$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<RFQQuoteResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RFQQuoteResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(RFQQuoteRespLeg.CREATOR.createFromParcel(parcel));
            }
            return new RFQQuoteResp(string, string2, string3, string4, string5, string6, string7, string8, string9, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RFQQuoteResp[] newArray(int i) {
            return new RFQQuoteResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RFQQuoteResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RFQQuoteRespLeg> component10() {
        return this.legs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.clRfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.clQuoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.blockTdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tTraderCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.mTraderCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RFQQuoteResp copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, @NotNull ArrayList<RFQQuoteRespLeg> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new RFQQuoteResp(str, str2, str3, str4, str5, str6, str7, str8, str9, arrayList);
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
        if (!(obj instanceof RFQQuoteResp)) {
            return false;
        }
        RFQQuoteResp rFQQuoteResp = (RFQQuoteResp) obj;
        return Intrinsics.EZpvd((Object) this.cTime, (Object) rFQQuoteResp.cTime) && Intrinsics.EZpvd((Object) this.rfqId, (Object) rFQQuoteResp.rfqId) && Intrinsics.EZpvd((Object) this.clRfqId, (Object) rFQQuoteResp.clRfqId) && Intrinsics.EZpvd((Object) this.quoteId, (Object) rFQQuoteResp.quoteId) && Intrinsics.EZpvd((Object) this.clQuoteId, (Object) rFQQuoteResp.clQuoteId) && Intrinsics.EZpvd((Object) this.blockTdId, (Object) rFQQuoteResp.blockTdId) && Intrinsics.EZpvd((Object) this.tag, (Object) rFQQuoteResp.tag) && Intrinsics.EZpvd((Object) this.tTraderCode, (Object) rFQQuoteResp.tTraderCode) && Intrinsics.EZpvd((Object) this.mTraderCode, (Object) rFQQuoteResp.mTraderCode) && Intrinsics.EZpvd(this.legs, rFQQuoteResp.legs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBlockTdId() {
        return this.blockTdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClQuoteId() {
        return this.clQuoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClRfqId() {
        return this.clRfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RFQQuoteRespLeg> getLegs() {
        return this.legs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMTraderCode() {
        return this.mTraderCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRfqId() {
        return this.rfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTTraderCode() {
        return this.tTraderCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.cTime;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.rfqId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.clRfqId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.quoteId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.clQuoteId;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.blockTdId;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tag;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.tTraderCode;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.mTraderCode;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str9 != null ? str9.hashCode() : 0)) * 31) + this.legs.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RFQQuoteResp(cTime=" + this.cTime + ", rfqId=" + this.rfqId + ", clRfqId=" + this.clRfqId + ", quoteId=" + this.quoteId + ", clQuoteId=" + this.clQuoteId + ", blockTdId=" + this.blockTdId + ", tag=" + this.tag + ", tTraderCode=" + this.tTraderCode + ", mTraderCode=" + this.mTraderCode + ", legs=" + this.legs + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.cTime);
        parcel.writeString(this.rfqId);
        parcel.writeString(this.clRfqId);
        parcel.writeString(this.quoteId);
        parcel.writeString(this.clQuoteId);
        parcel.writeString(this.blockTdId);
        parcel.writeString(this.tag);
        parcel.writeString(this.tTraderCode);
        parcel.writeString(this.mTraderCode);
        ArrayList<RFQQuoteRespLeg> arrayList = this.legs;
        parcel.writeInt(arrayList.size());
        Iterator<RFQQuoteRespLeg> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RFQQuoteResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RFQQuoteResp> serializer() {
            return RFQQuoteResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RFQQuoteResp(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cTime = null;
        } else {
            this.cTime = str;
        }
        if ((i & 2) == 0) {
            this.rfqId = null;
        } else {
            this.rfqId = str2;
        }
        if ((i & 4) == 0) {
            this.clRfqId = null;
        } else {
            this.clRfqId = str3;
        }
        if ((i & 8) == 0) {
            this.quoteId = null;
        } else {
            this.quoteId = str4;
        }
        if ((i & 16) == 0) {
            this.clQuoteId = null;
        } else {
            this.clQuoteId = str5;
        }
        if ((i & 32) == 0) {
            this.blockTdId = null;
        } else {
            this.blockTdId = str6;
        }
        if ((i & 64) == 0) {
            this.tag = null;
        } else {
            this.tag = str7;
        }
        if ((i & 128) == 0) {
            this.tTraderCode = null;
        } else {
            this.tTraderCode = str8;
        }
        if ((i & 256) == 0) {
            this.mTraderCode = null;
        } else {
            this.mTraderCode = str9;
        }
        if ((i & 512) == 0) {
            this.legs = new ArrayList<>();
        } else {
            this.legs = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RFQQuoteResp rFQQuoteResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rFQQuoteResp.cTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, rFQQuoteResp.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rFQQuoteResp.rfqId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, rFQQuoteResp.rfqId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || rFQQuoteResp.clRfqId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, rFQQuoteResp.clRfqId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || rFQQuoteResp.quoteId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, rFQQuoteResp.quoteId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || rFQQuoteResp.clQuoteId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, rFQQuoteResp.clQuoteId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || rFQQuoteResp.blockTdId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, rFQQuoteResp.blockTdId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || rFQQuoteResp.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, rFQQuoteResp.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || rFQQuoteResp.tTraderCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, rFQQuoteResp.tTraderCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || rFQQuoteResp.mTraderCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, rFQQuoteResp.mTraderCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd(rFQQuoteResp.legs, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], rFQQuoteResp.legs);
    }

    public RFQQuoteResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, @NotNull ArrayList<RFQQuoteRespLeg> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.cTime = str;
        this.rfqId = str2;
        this.clRfqId = str3;
        this.quoteId = str4;
        this.clQuoteId = str5;
        this.blockTdId = str6;
        this.tag = str7;
        this.tTraderCode = str8;
        this.mTraderCode = str9;
        this.legs = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0064: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (null java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0046: ARITH (r22v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:5277) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r21v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.RFQQuoteRespLeg>):void (m)] (LINE:5267) call: com.okinc.unify_trade.biz.RFQQuoteResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ RFQQuoteResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : null, (i & 512) != 0 ? new ArrayList() : arrayList);
    }
}
