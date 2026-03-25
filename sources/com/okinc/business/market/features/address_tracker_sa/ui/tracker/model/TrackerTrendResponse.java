package com.okinc.business.market.features.address_tracker_sa.ui.tracker.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TrackerTrendResponse {
    public final int pageNum;
    public final int pageSize;
    public final List<TrackerTrendItem> resultList;
    public final int totalPage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(TrackerTrendItem$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrackerTrendResponse() {
        this(0, 0, (List) null, 0, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackerTrendResponse copy$default(TrackerTrendResponse trackerTrendResponse, int i, int i2, List list, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = trackerTrendResponse.pageNum;
        }
        if ((i4 & 2) != 0) {
            i2 = trackerTrendResponse.pageSize;
        }
        if ((i4 & 4) != 0) {
            list = trackerTrendResponse.resultList;
        }
        if ((i4 & 8) != 0) {
            i3 = trackerTrendResponse.totalPage;
        }
        return trackerTrendResponse.KWHzl(i, i2, list, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TrackerTrendItem> AEQbTJ() {
        return this.resultList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerTrendResponse KWHzl(int i, int i2, @NotNull List<TrackerTrendItem> list, int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TrackerTrendResponse(i, i2, list, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerTrendResponse)) {
            return false;
        }
        TrackerTrendResponse trackerTrendResponse = (TrackerTrendResponse) obj;
        return this.pageNum == trackerTrendResponse.pageNum && this.pageSize == trackerTrendResponse.pageSize && Intrinsics.EZpvd(this.resultList, trackerTrendResponse.resultList) && this.totalPage == trackerTrendResponse.totalPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.pageNum) * 31) + Integer.hashCode(this.pageSize)) * 31) + this.resultList.hashCode()) * 31) + Integer.hashCode(this.totalPage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerTrendResponse(pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", resultList=" + this.resultList + ", totalPage=" + this.totalPage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackerTrendResponse> serializer() {
            return TrackerTrendResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrackerTrendResponse(int i, int i2, int i3, List list, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pageNum = 1;
        } else {
            this.pageNum = i2;
        }
        if ((i & 2) == 0) {
            this.pageSize = 10;
        } else {
            this.pageSize = i3;
        }
        if ((i & 4) == 0) {
            this.resultList = yDY.AhwBna();
        } else {
            this.resultList = list;
        }
        if ((i & 8) == 0) {
            this.totalPage = 1;
        } else {
            this.totalPage = i4;
        }
    }

    public static final /* synthetic */ void AEQbTJ(TrackerTrendResponse trackerTrendResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || trackerTrendResponse.pageNum != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, trackerTrendResponse.pageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || trackerTrendResponse.pageSize != 10) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, trackerTrendResponse.pageSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(trackerTrendResponse.resultList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], trackerTrendResponse.resultList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && trackerTrendResponse.totalPage == 1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, trackerTrendResponse.totalPage);
    }

    public TrackerTrendResponse(int i, int i2, @NotNull List<TrackerTrendItem> list, int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.pageNum = i;
        this.pageSize = i2;
        this.resultList = list;
        this.totalPage = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (10 int) : (r3v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r4v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r5v0 int))
 A[MD:(int, int, java.util.List<com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendItem>, int):void (m)] (LINE:10) call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendResponse.<init>(int, int, java.util.List, int):void type: THIS */
    public /* synthetic */ TrackerTrendResponse(int i, int i2, List list, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 1 : i, (i4 & 2) != 0 ? 10 : i2, (i4 & 4) != 0 ? yDY.AhwBna() : list, (i4 & 8) != 0 ? 1 : i3);
    }
}
