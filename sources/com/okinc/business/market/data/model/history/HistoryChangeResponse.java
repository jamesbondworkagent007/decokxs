package com.okinc.business.market.data.model.history;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class HistoryChangeResponse {
    private final int hasMore;
    private final List<HistoryChangeData> list;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(HistoryChangeData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HistoryChangeResponse() {
        this(0, (List) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.history.HistoryChangeResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HistoryChangeResponse copy$default(HistoryChangeResponse historyChangeResponse, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = historyChangeResponse.hasMore;
        }
        if ((i2 & 2) != 0) {
            list = historyChangeResponse.list;
        }
        return historyChangeResponse.copy(i, list);
    }

    @SerialName("hasMore")
    public static /* synthetic */ void getHasMore$annotations() {
    }

    @SerialName("list")
    public static /* synthetic */ void getList$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.hasMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HistoryChangeData> component2() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryChangeResponse copy(int i, @NotNull List<HistoryChangeData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new HistoryChangeResponse(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryChangeResponse)) {
            return false;
        }
        HistoryChangeResponse historyChangeResponse = (HistoryChangeResponse) obj;
        return this.hasMore == historyChangeResponse.hasMore && Intrinsics.EZpvd(this.list, historyChangeResponse.list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHasMore() {
        return this.hasMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HistoryChangeData> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.hasMore) * 31) + this.list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryChangeResponse(hasMore=" + this.hasMore + ", list=" + this.list + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.history.HistoryChangeResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HistoryChangeResponse> serializer() {
            return HistoryChangeResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HistoryChangeResponse(int i, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.hasMore = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.list = yDY.AhwBna();
        } else {
            this.list = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(HistoryChangeResponse historyChangeResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || historyChangeResponse.hasMore != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, historyChangeResponse.hasMore);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(historyChangeResponse.list, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], historyChangeResponse.list);
    }

    public HistoryChangeResponse(int i, @NotNull List<HistoryChangeData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.hasMore = i;
        this.list = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r2v0 java.util.List))
 A[MD:(int, java.util.List<com.okinc.business.market.data.model.history.HistoryChangeData>):void (m)] (LINE:9) call: com.okinc.business.market.data.model.history.HistoryChangeResponse.<init>(int, java.util.List):void type: THIS */
    public /* synthetic */ HistoryChangeResponse(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? yDY.AhwBna() : list);
    }
}
