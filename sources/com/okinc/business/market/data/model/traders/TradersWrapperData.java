package com.okinc.business.market.data.model.traders;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TradersWrapperData {
    public final List<TradersData> list;

    @SerializedName("pageNum")
    private final Integer pageNum;

    @SerializedName("pageSize")
    private final Integer pageSize;

    @SerializedName("t")
    private final Long t;

    @SerializedName("totalPage")
    private final Integer totalPage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TradersData$$serializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradersWrapperData() {
        this((List) null, (Integer) null, (Integer) null, (Long) null, (Integer) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.market.data.model.traders.TradersWrapperData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TradersWrapperData copy$default(TradersWrapperData tradersWrapperData, List list, Integer num, Integer num2, Long l, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tradersWrapperData.list;
        }
        if ((i & 2) != 0) {
            num = tradersWrapperData.pageNum;
        }
        Integer num4 = num;
        if ((i & 4) != 0) {
            num2 = tradersWrapperData.pageSize;
        }
        Integer num5 = num2;
        if ((i & 8) != 0) {
            l = tradersWrapperData.t;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            num3 = tradersWrapperData.totalPage;
        }
        return tradersWrapperData.copydefault(list, num4, num5, l2, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradersData> OLrzqt() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradersWrapperData copydefault(List<TradersData> list, Integer num, Integer num2, Long l, Integer num3) {
        return new TradersWrapperData(list, num, num2, l, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradersWrapperData)) {
            return false;
        }
        TradersWrapperData tradersWrapperData = (TradersWrapperData) obj;
        return Intrinsics.EZpvd(this.list, tradersWrapperData.list) && Intrinsics.EZpvd(this.pageNum, tradersWrapperData.pageNum) && Intrinsics.EZpvd(this.pageSize, tradersWrapperData.pageSize) && Intrinsics.EZpvd(this.t, tradersWrapperData.t) && Intrinsics.EZpvd(this.totalPage, tradersWrapperData.totalPage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<TradersData> list = this.list;
        int iHashCode = list == null ? 0 : list.hashCode();
        Integer num = this.pageNum;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.pageSize;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        Long l = this.t;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        Integer num3 = this.totalPage;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradersWrapperData(list=" + this.list + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", t=" + this.t + ", totalPage=" + this.totalPage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.traders.TradersWrapperData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradersWrapperData> serializer() {
            return TradersWrapperData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradersWrapperData(int i, List list, Integer num, Integer num2, Long l, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        this.list = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.pageNum = null;
        } else {
            this.pageNum = num;
        }
        if ((i & 4) == 0) {
            this.pageSize = null;
        } else {
            this.pageSize = num2;
        }
        if ((i & 8) == 0) {
            this.t = null;
        } else {
            this.t = l;
        }
        if ((i & 16) == 0) {
            this.totalPage = null;
        } else {
            this.totalPage = num3;
        }
    }

    public static final /* synthetic */ void copydefault(TradersWrapperData tradersWrapperData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(tradersWrapperData.list, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], tradersWrapperData.list);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tradersWrapperData.pageNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, tradersWrapperData.pageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tradersWrapperData.pageSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, tradersWrapperData.pageSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tradersWrapperData.t != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, tradersWrapperData.t);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && tradersWrapperData.totalPage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, tradersWrapperData.totalPage);
    }

    public TradersWrapperData(List<TradersData> list, Integer num, Integer num2, Long l, Integer num3) {
        this.list = list;
        this.pageNum = num;
        this.pageSize = num2;
        this.t = l;
        this.totalPage = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r4v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001e: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.util.List<com.okinc.business.market.data.model.traders.TradersData>, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Integer):void (m)] (LINE:9) call: com.okinc.business.market.data.model.traders.TradersWrapperData.<init>(java.util.List, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Integer):void type: THIS */
    public /* synthetic */ TradersWrapperData(List list, Integer num, Integer num2, Long l, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : l, (i & 16) == 0 ? num3 : null);
    }
}
