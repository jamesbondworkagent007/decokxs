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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SmartArbPlanLeg implements Parcelable {
    private final String amt;
    private final String avgPx;
    private final ArrayList<SmartArbFeeData> feeList;
    private final String instId;
    private final String instType;
    private final String lever;
    private String liquidPrice;
    private final String mgnRatio;
    private final String pos;
    private final String posCcy;
    private final String side;
    private final String stakePos;
    private final String stakeReward;
    private final String time;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SmartArbPlanLeg> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SmartArbFeeData$$serializer.INSTANCE), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<SmartArbPlanLeg> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbPlanLeg createFromParcel(Parcel parcel) {
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
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(SmartArbFeeData.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new SmartArbPlanLeg(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbPlanLeg[] newArray(int i) {
            return new SmartArbPlanLeg[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartArbPlanLeg() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartArbFeeData> component11() {
        return this.feeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.stakePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.stakeReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.liquidPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.pos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.posCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartArbPlanLeg copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ArrayList<SmartArbFeeData> arrayList, String str11, String str12, String str13, String str14) {
        return new SmartArbPlanLeg(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList, str11, str12, str13, str14);
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
        if (!(obj instanceof SmartArbPlanLeg)) {
            return false;
        }
        SmartArbPlanLeg smartArbPlanLeg = (SmartArbPlanLeg) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) smartArbPlanLeg.type) && Intrinsics.EZpvd((Object) this.instId, (Object) smartArbPlanLeg.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) smartArbPlanLeg.instType) && Intrinsics.EZpvd((Object) this.lever, (Object) smartArbPlanLeg.lever) && Intrinsics.EZpvd((Object) this.amt, (Object) smartArbPlanLeg.amt) && Intrinsics.EZpvd((Object) this.side, (Object) smartArbPlanLeg.side) && Intrinsics.EZpvd((Object) this.avgPx, (Object) smartArbPlanLeg.avgPx) && Intrinsics.EZpvd((Object) this.pos, (Object) smartArbPlanLeg.pos) && Intrinsics.EZpvd((Object) this.posCcy, (Object) smartArbPlanLeg.posCcy) && Intrinsics.EZpvd((Object) this.mgnRatio, (Object) smartArbPlanLeg.mgnRatio) && Intrinsics.EZpvd(this.feeList, smartArbPlanLeg.feeList) && Intrinsics.EZpvd((Object) this.time, (Object) smartArbPlanLeg.time) && Intrinsics.EZpvd((Object) this.stakePos, (Object) smartArbPlanLeg.stakePos) && Intrinsics.EZpvd((Object) this.stakeReward, (Object) smartArbPlanLeg.stakeReward) && Intrinsics.EZpvd((Object) this.liquidPrice, (Object) smartArbPlanLeg.liquidPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmt() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPx() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartArbFeeData> getFeeList() {
        return this.feeList;
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
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidPrice() {
        return this.liquidPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnRatio() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPos() {
        return this.pos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosCcy() {
        return this.posCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakePos() {
        return this.stakePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakeReward() {
        return this.stakeReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.type;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.instId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.instType;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.lever;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.amt;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.side;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.avgPx;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.pos;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.posCcy;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.mgnRatio;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        ArrayList<SmartArbFeeData> arrayList = this.feeList;
        int iHashCode11 = arrayList == null ? 0 : arrayList.hashCode();
        String str11 = this.time;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.stakePos;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.stakeReward;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.liquidPrice;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str14 == null ? 0 : str14.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiquidPrice(String str) {
        this.liquidPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartArbPlanLeg(type=" + this.type + ", instId=" + this.instId + ", instType=" + this.instType + ", lever=" + this.lever + ", amt=" + this.amt + ", side=" + this.side + ", avgPx=" + this.avgPx + ", pos=" + this.pos + ", posCcy=" + this.posCcy + ", mgnRatio=" + this.mgnRatio + ", feeList=" + this.feeList + ", time=" + this.time + ", stakePos=" + this.stakePos + ", stakeReward=" + this.stakeReward + ", liquidPrice=" + this.liquidPrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.lever);
        parcel.writeString(this.amt);
        parcel.writeString(this.side);
        parcel.writeString(this.avgPx);
        parcel.writeString(this.pos);
        parcel.writeString(this.posCcy);
        parcel.writeString(this.mgnRatio);
        ArrayList<SmartArbFeeData> arrayList = this.feeList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<SmartArbFeeData> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.time);
        parcel.writeString(this.stakePos);
        parcel.writeString(this.stakeReward);
        parcel.writeString(this.liquidPrice);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SmartArbPlanLeg.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartArbPlanLeg> serializer() {
            return SmartArbPlanLeg$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmartArbPlanLeg(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ArrayList arrayList, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.instId = null;
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.instType = null;
        } else {
            this.instType = str3;
        }
        if ((i & 8) == 0) {
            this.lever = null;
        } else {
            this.lever = str4;
        }
        if ((i & 16) == 0) {
            this.amt = null;
        } else {
            this.amt = str5;
        }
        if ((i & 32) == 0) {
            this.side = null;
        } else {
            this.side = str6;
        }
        if ((i & 64) == 0) {
            this.avgPx = null;
        } else {
            this.avgPx = str7;
        }
        if ((i & 128) == 0) {
            this.pos = null;
        } else {
            this.pos = str8;
        }
        if ((i & 256) == 0) {
            this.posCcy = null;
        } else {
            this.posCcy = str9;
        }
        if ((i & 512) == 0) {
            this.mgnRatio = null;
        } else {
            this.mgnRatio = str10;
        }
        if ((i & 1024) == 0) {
            this.feeList = null;
        } else {
            this.feeList = arrayList;
        }
        if ((i & 2048) == 0) {
            this.time = null;
        } else {
            this.time = str11;
        }
        if ((i & 4096) == 0) {
            this.stakePos = null;
        } else {
            this.stakePos = str12;
        }
        if ((i & 8192) == 0) {
            this.stakeReward = null;
        } else {
            this.stakeReward = str13;
        }
        if ((i & 16384) == 0) {
            this.liquidPrice = null;
        } else {
            this.liquidPrice = str14;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SmartArbPlanLeg smartArbPlanLeg, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || smartArbPlanLeg.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, smartArbPlanLeg.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || smartArbPlanLeg.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, smartArbPlanLeg.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || smartArbPlanLeg.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, smartArbPlanLeg.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || smartArbPlanLeg.lever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, smartArbPlanLeg.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || smartArbPlanLeg.amt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, smartArbPlanLeg.amt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || smartArbPlanLeg.side != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, smartArbPlanLeg.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || smartArbPlanLeg.avgPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, smartArbPlanLeg.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || smartArbPlanLeg.pos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, smartArbPlanLeg.pos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || smartArbPlanLeg.posCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, smartArbPlanLeg.posCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || smartArbPlanLeg.mgnRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, smartArbPlanLeg.mgnRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || smartArbPlanLeg.feeList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], smartArbPlanLeg.feeList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || smartArbPlanLeg.time != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, smartArbPlanLeg.time);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || smartArbPlanLeg.stakePos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, smartArbPlanLeg.stakePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || smartArbPlanLeg.stakeReward != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, smartArbPlanLeg.stakeReward);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && smartArbPlanLeg.liquidPrice == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, smartArbPlanLeg.liquidPrice);
    }

    public SmartArbPlanLeg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ArrayList<SmartArbFeeData> arrayList, String str11, String str12, String str13, String str14) {
        this.type = str;
        this.instId = str2;
        this.instType = str3;
        this.lever = str4;
        this.amt = str5;
        this.side = str6;
        this.avgPx = str7;
        this.pos = str8;
        this.posCcy = str9;
        this.mgnRatio = str10;
        this.feeList = arrayList;
        this.time = str11;
        this.stakePos = str12;
        this.stakeReward = str13;
        this.liquidPrice = str14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0053: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r27v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.SmartArbFeeData>, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1612) call: com.okinc.unify_trade.biz.SmartArbPlanLeg.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SmartArbPlanLeg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ArrayList arrayList, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : arrayList, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) == 0 ? str14 : null);
    }
}
