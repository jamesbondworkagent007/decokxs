package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class RFQCreateResp implements Parcelable {
    private String allowPartialExecution;
    private String cTime;
    private String clRfqId;
    private List<RFQCreateLeg> legs;
    private String rfqId;
    private String state;
    private String tag;
    private String traderCode;
    private String uTime;
    private String validUntil;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RFQCreateResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(RFQCreateLeg$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<RFQCreateResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RFQCreateResp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
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
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(RFQCreateLeg.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new RFQCreateResp(string, string2, string3, string4, string5, string6, string7, string8, string9, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RFQCreateResp[] newArray(int i) {
            return new RFQCreateResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RFQCreateResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RFQCreateLeg> component10() {
        return this.legs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.validUntil;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.clRfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.allowPartialExecution;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.traderCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.rfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RFQCreateResp copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<RFQCreateLeg> list) {
        return new RFQCreateResp(str, str2, str3, str4, str5, str6, str7, str8, str9, list);
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
        if (!(obj instanceof RFQCreateResp)) {
            return false;
        }
        RFQCreateResp rFQCreateResp = (RFQCreateResp) obj;
        return Intrinsics.EZpvd((Object) this.cTime, (Object) rFQCreateResp.cTime) && Intrinsics.EZpvd((Object) this.uTime, (Object) rFQCreateResp.uTime) && Intrinsics.EZpvd((Object) this.state, (Object) rFQCreateResp.state) && Intrinsics.EZpvd((Object) this.validUntil, (Object) rFQCreateResp.validUntil) && Intrinsics.EZpvd((Object) this.clRfqId, (Object) rFQCreateResp.clRfqId) && Intrinsics.EZpvd((Object) this.tag, (Object) rFQCreateResp.tag) && Intrinsics.EZpvd((Object) this.allowPartialExecution, (Object) rFQCreateResp.allowPartialExecution) && Intrinsics.EZpvd((Object) this.traderCode, (Object) rFQCreateResp.traderCode) && Intrinsics.EZpvd((Object) this.rfqId, (Object) rFQCreateResp.rfqId) && Intrinsics.EZpvd(this.legs, rFQCreateResp.legs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAllowPartialExecution() {
        return this.allowPartialExecution;
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
    public final List<RFQCreateLeg> getLegs() {
        return this.legs;
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
    public final String getTag() {
        return this.tag;
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
        String str = this.cTime;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.uTime;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.state;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.validUntil;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.clRfqId;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tag;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.allowPartialExecution;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.traderCode;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.rfqId;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        List<RFQCreateLeg> list = this.legs;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowPartialExecution(String str) {
        this.allowPartialExecution = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCTime(String str) {
        this.cTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClRfqId(String str) {
        this.clRfqId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLegs(List<RFQCreateLeg> list) {
        this.legs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRfqId(String str) {
        this.rfqId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(String str) {
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(String str) {
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTraderCode(String str) {
        this.traderCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUTime(String str) {
        this.uTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValidUntil(String str) {
        this.validUntil = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RFQCreateResp(cTime=" + this.cTime + ", uTime=" + this.uTime + ", state=" + this.state + ", validUntil=" + this.validUntil + ", clRfqId=" + this.clRfqId + ", tag=" + this.tag + ", allowPartialExecution=" + this.allowPartialExecution + ", traderCode=" + this.traderCode + ", rfqId=" + this.rfqId + ", legs=" + this.legs + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.cTime);
        parcel.writeString(this.uTime);
        parcel.writeString(this.state);
        parcel.writeString(this.validUntil);
        parcel.writeString(this.clRfqId);
        parcel.writeString(this.tag);
        parcel.writeString(this.allowPartialExecution);
        parcel.writeString(this.traderCode);
        parcel.writeString(this.rfqId);
        List<RFQCreateLeg> list = this.legs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<RFQCreateLeg> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RFQCreateResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RFQCreateResp> serializer() {
            return RFQCreateResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RFQCreateResp(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cTime = null;
        } else {
            this.cTime = str;
        }
        if ((i & 2) == 0) {
            this.uTime = null;
        } else {
            this.uTime = str2;
        }
        if ((i & 4) == 0) {
            this.state = null;
        } else {
            this.state = str3;
        }
        if ((i & 8) == 0) {
            this.validUntil = null;
        } else {
            this.validUntil = str4;
        }
        if ((i & 16) == 0) {
            this.clRfqId = null;
        } else {
            this.clRfqId = str5;
        }
        if ((i & 32) == 0) {
            this.tag = null;
        } else {
            this.tag = str6;
        }
        if ((i & 64) == 0) {
            this.allowPartialExecution = null;
        } else {
            this.allowPartialExecution = str7;
        }
        if ((i & 128) == 0) {
            this.traderCode = null;
        } else {
            this.traderCode = str8;
        }
        if ((i & 256) == 0) {
            this.rfqId = null;
        } else {
            this.rfqId = str9;
        }
        if ((i & 512) == 0) {
            this.legs = null;
        } else {
            this.legs = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RFQCreateResp rFQCreateResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rFQCreateResp.cTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, rFQCreateResp.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rFQCreateResp.uTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, rFQCreateResp.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || rFQCreateResp.state != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, rFQCreateResp.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || rFQCreateResp.validUntil != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, rFQCreateResp.validUntil);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || rFQCreateResp.clRfqId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, rFQCreateResp.clRfqId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || rFQCreateResp.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, rFQCreateResp.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || rFQCreateResp.allowPartialExecution != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, rFQCreateResp.allowPartialExecution);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || rFQCreateResp.traderCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, rFQCreateResp.traderCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || rFQCreateResp.rfqId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, rFQCreateResp.rfqId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && rFQCreateResp.legs == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], rFQCreateResp.legs);
    }

    public RFQCreateResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<RFQCreateLeg> list) {
        this.cTime = str;
        this.uTime = str2;
        this.state = str3;
        this.validUntil = str4;
        this.clRfqId = str5;
        this.tag = str6;
        this.allowPartialExecution = str7;
        this.traderCode = str8;
        this.rfqId = str9;
        this.legs = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.RFQCreateLeg>):void (m)] (LINE:5131) call: com.okinc.unify_trade.biz.RFQCreateResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ RFQCreateResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) == 0 ? list : null);
    }
}
