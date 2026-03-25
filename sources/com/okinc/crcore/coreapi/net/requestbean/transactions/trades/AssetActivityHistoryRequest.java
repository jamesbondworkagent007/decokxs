package com.okinc.crcore.coreapi.net.requestbean.transactions.trades;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AssetActivityHistoryRequest {
    private final List<ActivityCurrency> activityCurrency;
    private final List<Integer> activityType;
    private final int entryPoint;
    private final Long fromTimestamp;
    private final Long offsetEventTime;
    private final Long offsetId;
    private final int pageSize;
    private final int queryType;
    private final Long toTimestamp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(IntSerializer.INSTANCE), new ArrayListSerializer(ActivityCurrency$$serializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.offsetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.offsetEventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component3() {
        return this.activityType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ActivityCurrency> component4() {
        return this.activityCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.queryType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.entryPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.fromTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.toTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetActivityHistoryRequest copy(Long l, Long l2, List<Integer> list, List<ActivityCurrency> list2, int i, int i2, Long l3, Long l4, int i3) {
        return new AssetActivityHistoryRequest(l, l2, list, list2, i, i2, l3, l4, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetActivityHistoryRequest)) {
            return false;
        }
        AssetActivityHistoryRequest assetActivityHistoryRequest = (AssetActivityHistoryRequest) obj;
        return Intrinsics.EZpvd(this.offsetId, assetActivityHistoryRequest.offsetId) && Intrinsics.EZpvd(this.offsetEventTime, assetActivityHistoryRequest.offsetEventTime) && Intrinsics.EZpvd(this.activityType, assetActivityHistoryRequest.activityType) && Intrinsics.EZpvd(this.activityCurrency, assetActivityHistoryRequest.activityCurrency) && this.queryType == assetActivityHistoryRequest.queryType && this.entryPoint == assetActivityHistoryRequest.entryPoint && Intrinsics.EZpvd(this.fromTimestamp, assetActivityHistoryRequest.fromTimestamp) && Intrinsics.EZpvd(this.toTimestamp, assetActivityHistoryRequest.toTimestamp) && this.pageSize == assetActivityHistoryRequest.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ActivityCurrency> getActivityCurrency() {
        return this.activityCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getActivityType() {
        return this.activityType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFromTimestamp() {
        return this.fromTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getOffsetEventTime() {
        return this.offsetEventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getOffsetId() {
        return this.offsetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getQueryType() {
        return this.queryType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getToTimestamp() {
        return this.toTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.offsetId;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.offsetEventTime;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        List<Integer> list = this.activityType;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        List<ActivityCurrency> list2 = this.activityCurrency;
        int iHashCode4 = list2 == null ? 0 : list2.hashCode();
        int iHashCode5 = Integer.hashCode(this.queryType);
        int iHashCode6 = Integer.hashCode(this.entryPoint);
        Long l3 = this.fromTimestamp;
        int iHashCode7 = l3 == null ? 0 : l3.hashCode();
        Long l4 = this.toTimestamp;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (l4 != null ? l4.hashCode() : 0)) * 31) + Integer.hashCode(this.pageSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetActivityHistoryRequest(offsetId=" + this.offsetId + ", offsetEventTime=" + this.offsetEventTime + ", activityType=" + this.activityType + ", activityCurrency=" + this.activityCurrency + ", queryType=" + this.queryType + ", entryPoint=" + this.entryPoint + ", fromTimestamp=" + this.fromTimestamp + ", toTimestamp=" + this.toTimestamp + ", pageSize=" + this.pageSize + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.requestbean.transactions.trades.AssetActivityHistoryRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetActivityHistoryRequest> serializer() {
            return AssetActivityHistoryRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetActivityHistoryRequest(int i, Long l, Long l2, List list, List list2, int i2, int i3, Long l3, Long l4, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if (240 != (i & PsExtractor.VIDEO_STREAM_MASK)) {
            PluginExceptionsKt.throwMissingFieldException(i, PsExtractor.VIDEO_STREAM_MASK, AssetActivityHistoryRequest$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.offsetId = null;
        } else {
            this.offsetId = l;
        }
        if ((i & 2) == 0) {
            this.offsetEventTime = null;
        } else {
            this.offsetEventTime = l2;
        }
        if ((i & 4) == 0) {
            this.activityType = null;
        } else {
            this.activityType = list;
        }
        if ((i & 8) == 0) {
            this.activityCurrency = null;
        } else {
            this.activityCurrency = list2;
        }
        this.queryType = i2;
        this.entryPoint = i3;
        this.fromTimestamp = l3;
        this.toTimestamp = l4;
        if ((i & 256) == 0) {
            this.pageSize = 20;
        } else {
            this.pageSize = i4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(AssetActivityHistoryRequest assetActivityHistoryRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || assetActivityHistoryRequest.offsetId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, assetActivityHistoryRequest.offsetId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || assetActivityHistoryRequest.offsetEventTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, assetActivityHistoryRequest.offsetEventTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || assetActivityHistoryRequest.activityType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], assetActivityHistoryRequest.activityType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || assetActivityHistoryRequest.activityCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], assetActivityHistoryRequest.activityCurrency);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, assetActivityHistoryRequest.queryType);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, assetActivityHistoryRequest.entryPoint);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, longSerializer, assetActivityHistoryRequest.fromTimestamp);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, longSerializer, assetActivityHistoryRequest.toTimestamp);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && assetActivityHistoryRequest.pageSize == 20) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 8, assetActivityHistoryRequest.pageSize);
    }

    public AssetActivityHistoryRequest(Long l, Long l2, List<Integer> list, List<ActivityCurrency> list2, int i, int i2, Long l3, Long l4, int i3) {
        this.offsetId = l;
        this.offsetEventTime = l2;
        this.activityType = list;
        this.activityCurrency = list2;
        this.queryType = i;
        this.entryPoint = i2;
        this.fromTimestamp = l3;
        this.toTimestamp = l4;
        this.pageSize = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r14v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r15v0 java.lang.Long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r16v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0019: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (r18v0 int)
  (r19v0 int)
  (r20v0 java.lang.Long)
  (r21v0 java.lang.Long)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0021: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (20 int) : (r22v0 int))
 A[MD:(java.lang.Long, java.lang.Long, java.util.List<java.lang.Integer>, java.util.List<com.okinc.crcore.coreapi.net.requestbean.transactions.trades.ActivityCurrency>, int, int, java.lang.Long, java.lang.Long, int):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.requestbean.transactions.trades.AssetActivityHistoryRequest.<init>(java.lang.Long, java.lang.Long, java.util.List, java.util.List, int, int, java.lang.Long, java.lang.Long, int):void type: THIS */
    public /* synthetic */ AssetActivityHistoryRequest(Long l, Long l2, List list, List list2, int i, int i2, Long l3, Long l4, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : l, (i4 & 2) != 0 ? null : l2, (i4 & 4) != 0 ? null : list, (i4 & 8) != 0 ? null : list2, i, i2, l3, l4, (i4 & 256) != 0 ? 20 : i3);
    }
}
