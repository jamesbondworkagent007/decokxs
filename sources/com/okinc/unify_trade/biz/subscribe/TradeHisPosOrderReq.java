package com.okinc.unify_trade.biz.subscribe;

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
public final class TradeHisPosOrderReq implements Parcelable {
    private final String ccy;
    private final List<TradeHisPosDedupOrder> dedupOrders;
    private final String endTime;
    private final String instId;
    private final String instType;
    private final String mgnMode;
    private final String pageSize;
    private final String paginateId;
    private final String paginateTime;
    private final String posDirection;
    private final String startTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeHisPosOrderReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(TradeHisPosDedupOrder$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<TradeHisPosOrderReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeHisPosOrderReq createFromParcel(Parcel parcel) {
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
                    arrayList2.add(TradeHisPosDedupOrder.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new TradeHisPosOrderReq(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeHisPosOrderReq[] newArray(int i) {
            return new TradeHisPosOrderReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeHisPosOrderReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeHisPosDedupOrder> component11() {
        return this.dedupOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.posDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.paginateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.paginateId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeHisPosOrderReq copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<TradeHisPosDedupOrder> list) {
        return new TradeHisPosOrderReq(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, list);
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
        if (!(obj instanceof TradeHisPosOrderReq)) {
            return false;
        }
        TradeHisPosOrderReq tradeHisPosOrderReq = (TradeHisPosOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) tradeHisPosOrderReq.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) tradeHisPosOrderReq.instType) && Intrinsics.EZpvd((Object) this.mgnMode, (Object) tradeHisPosOrderReq.mgnMode) && Intrinsics.EZpvd((Object) this.posDirection, (Object) tradeHisPosOrderReq.posDirection) && Intrinsics.EZpvd((Object) this.ccy, (Object) tradeHisPosOrderReq.ccy) && Intrinsics.EZpvd((Object) this.startTime, (Object) tradeHisPosOrderReq.startTime) && Intrinsics.EZpvd((Object) this.endTime, (Object) tradeHisPosOrderReq.endTime) && Intrinsics.EZpvd((Object) this.paginateTime, (Object) tradeHisPosOrderReq.paginateTime) && Intrinsics.EZpvd((Object) this.paginateId, (Object) tradeHisPosOrderReq.paginateId) && Intrinsics.EZpvd((Object) this.pageSize, (Object) tradeHisPosOrderReq.pageSize) && Intrinsics.EZpvd(this.dedupOrders, tradeHisPosOrderReq.dedupOrders);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeHisPosDedupOrder> getDedupOrders() {
        return this.dedupOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndTime() {
        return this.endTime;
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
    public final String getMgnMode() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaginateId() {
        return this.paginateId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaginateTime() {
        return this.paginateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosDirection() {
        return this.posDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.instType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.mgnMode;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.posDirection;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.ccy;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.startTime;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.endTime;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.paginateTime;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.paginateId;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.pageSize;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        List<TradeHisPosDedupOrder> list = this.dedupOrders;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeHisPosOrderReq(instId=" + this.instId + ", instType=" + this.instType + ", mgnMode=" + this.mgnMode + ", posDirection=" + this.posDirection + ", ccy=" + this.ccy + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", paginateTime=" + this.paginateTime + ", paginateId=" + this.paginateId + ", pageSize=" + this.pageSize + ", dedupOrders=" + this.dedupOrders + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.mgnMode);
        parcel.writeString(this.posDirection);
        parcel.writeString(this.ccy);
        parcel.writeString(this.startTime);
        parcel.writeString(this.endTime);
        parcel.writeString(this.paginateTime);
        parcel.writeString(this.paginateId);
        parcel.writeString(this.pageSize);
        List<TradeHisPosDedupOrder> list = this.dedupOrders;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<TradeHisPosDedupOrder> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.TradeHisPosOrderReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeHisPosOrderReq> serializer() {
            return TradeHisPosOrderReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeHisPosOrderReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = null;
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.instType = null;
        } else {
            this.instType = str2;
        }
        if ((i & 4) == 0) {
            this.mgnMode = null;
        } else {
            this.mgnMode = str3;
        }
        if ((i & 8) == 0) {
            this.posDirection = null;
        } else {
            this.posDirection = str4;
        }
        if ((i & 16) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str5;
        }
        if ((i & 32) == 0) {
            this.startTime = null;
        } else {
            this.startTime = str6;
        }
        if ((i & 64) == 0) {
            this.endTime = null;
        } else {
            this.endTime = str7;
        }
        if ((i & 128) == 0) {
            this.paginateTime = null;
        } else {
            this.paginateTime = str8;
        }
        if ((i & 256) == 0) {
            this.paginateId = null;
        } else {
            this.paginateId = str9;
        }
        if ((i & 512) == 0) {
            this.pageSize = null;
        } else {
            this.pageSize = str10;
        }
        if ((i & 1024) == 0) {
            this.dedupOrders = null;
        } else {
            this.dedupOrders = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeHisPosOrderReq tradeHisPosOrderReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tradeHisPosOrderReq.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tradeHisPosOrderReq.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tradeHisPosOrderReq.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tradeHisPosOrderReq.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tradeHisPosOrderReq.mgnMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, tradeHisPosOrderReq.mgnMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tradeHisPosOrderReq.posDirection != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, tradeHisPosOrderReq.posDirection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tradeHisPosOrderReq.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, tradeHisPosOrderReq.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tradeHisPosOrderReq.startTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tradeHisPosOrderReq.startTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tradeHisPosOrderReq.endTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tradeHisPosOrderReq.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || tradeHisPosOrderReq.paginateTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, tradeHisPosOrderReq.paginateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tradeHisPosOrderReq.paginateId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, tradeHisPosOrderReq.paginateId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || tradeHisPosOrderReq.pageSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, tradeHisPosOrderReq.pageSize);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && tradeHisPosOrderReq.dedupOrders == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], tradeHisPosOrderReq.dedupOrders);
    }

    public TradeHisPosOrderReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<TradeHisPosDedupOrder> list) {
        this.instId = str;
        this.instType = str2;
        this.mgnMode = str3;
        this.posDirection = str4;
        this.ccy = str5;
        this.startTime = str6;
        this.endTime = str7;
        this.paginateTime = str8;
        this.paginateId = str9;
        this.pageSize = str10;
        this.dedupOrders = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.subscribe.TradeHisPosDedupOrder>):void (m)] (LINE:159) call: com.okinc.unify_trade.biz.subscribe.TradeHisPosOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TradeHisPosOrderReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) == 0 ? list : null);
    }
}
