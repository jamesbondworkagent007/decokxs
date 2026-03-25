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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class OptionPnlReq implements Parcelable {
    private String chargeUnit;
    private String datumPointPrice;
    private String expireTime;
    private boolean inclRealPos;
    private ArrayList<String> indexPriceArr;
    private String instType;
    private String riskUnit;
    private Long selectTime;
    private ArrayList<OptionPnlReqSimPos> simPos;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OptionPnlReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, new ArrayListSerializer(OptionPnlReqSimPos$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<OptionPnlReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionPnlReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(OptionPnlReqSimPos.CREATOR.createFromParcel(parcel));
                }
            }
            return new OptionPnlReq(z, lValueOf, string, string2, string3, string4, arrayListCreateStringArrayList, string5, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionPnlReq[] newArray(int i) {
            return new OptionPnlReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.inclRealPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.selectTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.riskUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chargeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component7() {
        return this.indexPriceArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.datumPointPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<OptionPnlReqSimPos> component9() {
        return this.simPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionPnlReq copy(boolean z, Long l, String str, String str2, String str3, String str4, @NotNull ArrayList<String> arrayList, String str5, ArrayList<OptionPnlReqSimPos> arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new OptionPnlReq(z, l, str, str2, str3, str4, arrayList, str5, arrayList2);
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
        if (!(obj instanceof OptionPnlReq)) {
            return false;
        }
        OptionPnlReq optionPnlReq = (OptionPnlReq) obj;
        return this.inclRealPos == optionPnlReq.inclRealPos && Intrinsics.EZpvd(this.selectTime, optionPnlReq.selectTime) && Intrinsics.EZpvd((Object) this.expireTime, (Object) optionPnlReq.expireTime) && Intrinsics.EZpvd((Object) this.riskUnit, (Object) optionPnlReq.riskUnit) && Intrinsics.EZpvd((Object) this.instType, (Object) optionPnlReq.instType) && Intrinsics.EZpvd((Object) this.chargeUnit, (Object) optionPnlReq.chargeUnit) && Intrinsics.EZpvd(this.indexPriceArr, optionPnlReq.indexPriceArr) && Intrinsics.EZpvd((Object) this.datumPointPrice, (Object) optionPnlReq.datumPointPrice) && Intrinsics.EZpvd(this.simPos, optionPnlReq.simPos);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChargeUnit() {
        return this.chargeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDatumPointPrice() {
        return this.datumPointPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getInclRealPos() {
        return this.inclRealPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getIndexPriceArr() {
        return this.indexPriceArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskUnit() {
        return this.riskUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getSelectTime() {
        return this.selectTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<OptionPnlReqSimPos> getSimPos() {
        return this.simPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.inclRealPos);
        Long l = this.selectTime;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        String str = this.expireTime;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.riskUnit;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.instType;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.chargeUnit;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        int iHashCode7 = this.indexPriceArr.hashCode();
        String str5 = this.datumPointPrice;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        ArrayList<OptionPnlReqSimPos> arrayList = this.simPos;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChargeUnit(String str) {
        this.chargeUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDatumPointPrice(String str) {
        this.datumPointPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpireTime(String str) {
        this.expireTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInclRealPos(boolean z) {
        this.inclRealPos = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndexPriceArr(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.indexPriceArr = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(String str) {
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskUnit(String str) {
        this.riskUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectTime(Long l) {
        this.selectTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimPos(ArrayList<OptionPnlReqSimPos> arrayList) {
        this.simPos = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OptionPnlReq(inclRealPos=" + this.inclRealPos + ", selectTime=" + this.selectTime + ", expireTime=" + this.expireTime + ", riskUnit=" + this.riskUnit + ", instType=" + this.instType + ", chargeUnit=" + this.chargeUnit + ", indexPriceArr=" + this.indexPriceArr + ", datumPointPrice=" + this.datumPointPrice + ", simPos=" + this.simPos + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.inclRealPos ? 1 : 0);
        Long l = this.selectTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.expireTime);
        parcel.writeString(this.riskUnit);
        parcel.writeString(this.instType);
        parcel.writeString(this.chargeUnit);
        parcel.writeStringList(this.indexPriceArr);
        parcel.writeString(this.datumPointPrice);
        ArrayList<OptionPnlReqSimPos> arrayList = this.simPos;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<OptionPnlReqSimPos> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OptionPnlReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OptionPnlReq> serializer() {
            return OptionPnlReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OptionPnlReq(int i, boolean z, Long l, String str, String str2, String str3, String str4, ArrayList arrayList, String str5, ArrayList arrayList2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, OptionPnlReq$$serializer.INSTANCE.getDescriptor());
        }
        this.inclRealPos = z;
        if ((i & 2) == 0) {
            this.selectTime = 0L;
        } else {
            this.selectTime = l;
        }
        if ((i & 4) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str;
        }
        if ((i & 8) == 0) {
            this.riskUnit = "";
        } else {
            this.riskUnit = str2;
        }
        if ((i & 16) == 0) {
            this.instType = "";
        } else {
            this.instType = str3;
        }
        if ((i & 32) == 0) {
            this.chargeUnit = null;
        } else {
            this.chargeUnit = str4;
        }
        if ((i & 64) == 0) {
            this.indexPriceArr = new ArrayList<>();
        } else {
            this.indexPriceArr = arrayList;
        }
        if ((i & 128) == 0) {
            this.datumPointPrice = "";
        } else {
            this.datumPointPrice = str5;
        }
        if ((i & 256) == 0) {
            this.simPos = null;
        } else {
            this.simPos = arrayList2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OptionPnlReq optionPnlReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, optionPnlReq.inclRealPos);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (l = optionPnlReq.selectTime) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, optionPnlReq.selectTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) optionPnlReq.expireTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, optionPnlReq.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) optionPnlReq.riskUnit, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, optionPnlReq.riskUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) optionPnlReq.instType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, optionPnlReq.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || optionPnlReq.chargeUnit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, optionPnlReq.chargeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(optionPnlReq.indexPriceArr, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], optionPnlReq.indexPriceArr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) optionPnlReq.datumPointPrice, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, optionPnlReq.datumPointPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && optionPnlReq.simPos == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], optionPnlReq.simPos);
    }

    public OptionPnlReq(boolean z, Long l, String str, String str2, String str3, String str4, @NotNull ArrayList<String> arrayList, String str5, ArrayList<OptionPnlReqSimPos> arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.inclRealPos = z;
        this.selectTime = l;
        this.expireTime = str;
        this.riskUnit = str2;
        this.instType = str3;
        this.chargeUnit = str4;
        this.indexPriceArr = arrayList;
        this.datumPointPrice = str5;
        this.simPos = arrayList2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0058: CONSTRUCTOR 
  (r11v0 boolean)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r12v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0034: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:5223) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r17v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0041: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.util.ArrayList) : (null java.util.ArrayList))
 A[MD:(boolean, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<java.lang.String>, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.OptionPnlReqSimPos>):void (m)] (LINE:5216) call: com.okinc.unify_trade.biz.OptionPnlReq.<init>(boolean, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ OptionPnlReq(boolean z, Long l, String str, String str2, String str3, String str4, ArrayList arrayList, String str5, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? 0L : l, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? new ArrayList() : arrayList, (i & 128) == 0 ? str5 : "", (i & 256) == 0 ? arrayList2 : null);
    }
}
