package com.okinc.business.market.features.holders.domain.repository;

import com.okinc.business.data.model.market.TokenHolderResponseData;
import com.okinc.business.data.model.market.TokenHolderResponseData$$serializer;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class HolderRankingWsUpdate {
    public final List<TokenHolderResponseData> holderRankInfos;
    public final Integer pageNum;
    public final Integer pageSize;
    public final Long t;
    public final Integer totalPage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TokenHolderResponseData$$serializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HolderRankingWsUpdate() {
        this((List) null, (Integer) null, (Integer) null, (Long) null, (Integer) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.market.features.holders.domain.repository.HolderRankingWsUpdate */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HolderRankingWsUpdate copy$default(HolderRankingWsUpdate holderRankingWsUpdate, List list, Integer num, Integer num2, Long l, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = holderRankingWsUpdate.holderRankInfos;
        }
        if ((i & 2) != 0) {
            num = holderRankingWsUpdate.pageNum;
        }
        Integer num4 = num;
        if ((i & 4) != 0) {
            num2 = holderRankingWsUpdate.pageSize;
        }
        Integer num5 = num2;
        if ((i & 8) != 0) {
            l = holderRankingWsUpdate.t;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            num3 = holderRankingWsUpdate.totalPage;
        }
        return holderRankingWsUpdate.KWHzl(list, num4, num5, l2, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer AEQbTJ() {
        return this.totalPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long EZpvd() {
        return this.t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderRankingWsUpdate KWHzl(@NotNull List<TokenHolderResponseData> list, Integer num, Integer num2, Long l, Integer num3) {
        Intrinsics.checkNotNullParameter(list, "");
        return new HolderRankingWsUpdate(list, num, num2, l, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenHolderResponseData> KWHzl() {
        return this.holderRankInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer OLrzqt() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HolderRankingWsUpdate)) {
            return false;
        }
        HolderRankingWsUpdate holderRankingWsUpdate = (HolderRankingWsUpdate) obj;
        return Intrinsics.EZpvd(this.holderRankInfos, holderRankingWsUpdate.holderRankInfos) && Intrinsics.EZpvd(this.pageNum, holderRankingWsUpdate.pageNum) && Intrinsics.EZpvd(this.pageSize, holderRankingWsUpdate.pageSize) && Intrinsics.EZpvd(this.t, holderRankingWsUpdate.t) && Intrinsics.EZpvd(this.totalPage, holderRankingWsUpdate.totalPage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.holderRankInfos.hashCode();
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
        return "HolderRankingWsUpdate(holderRankInfos=" + this.holderRankInfos + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", t=" + this.t + ", totalPage=" + this.totalPage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.holders.domain.repository.HolderRankingWsUpdate.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HolderRankingWsUpdate> serializer() {
            return HolderRankingWsUpdate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HolderRankingWsUpdate(int i, List list, Integer num, Integer num2, Long l, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        this.holderRankInfos = (i & 1) == 0 ? yDY.AhwBna() : list;
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

    public static final /* synthetic */ void KWHzl(HolderRankingWsUpdate holderRankingWsUpdate, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(holderRankingWsUpdate.holderRankInfos, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], holderRankingWsUpdate.holderRankInfos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || holderRankingWsUpdate.pageNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, holderRankingWsUpdate.pageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || holderRankingWsUpdate.pageSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, holderRankingWsUpdate.pageSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || holderRankingWsUpdate.t != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, holderRankingWsUpdate.t);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && holderRankingWsUpdate.totalPage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, holderRankingWsUpdate.totalPage);
    }

    public HolderRankingWsUpdate(@NotNull List<TokenHolderResponseData> list, Integer num, Integer num2, Long l, Integer num3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.holderRankInfos = list;
        this.pageNum = num;
        this.pageSize = num2;
        this.t = l;
        this.totalPage = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:95)) : (r4v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001e: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.util.List<com.okinc.business.data.model.market.TokenHolderResponseData>, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Integer):void (m)] (LINE:93) call: com.okinc.business.market.features.holders.domain.repository.HolderRankingWsUpdate.<init>(java.util.List, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Integer):void type: THIS */
    public /* synthetic */ HolderRankingWsUpdate(List list, Integer num, Integer num2, Long l, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : l, (i & 16) == 0 ? num3 : null);
    }
}
