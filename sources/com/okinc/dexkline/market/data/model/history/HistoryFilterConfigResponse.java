package com.okinc.dexkline.market.data.model.history;

import com.okinc.dexkline.market.data.model.PriceRangeConfigData;
import com.okinc.dexkline.market.data.model.PriceRangeConfigData$$serializer;
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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class HistoryFilterConfigResponse {
    private final List<PriceRangeConfigData> config;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(PriceRangeConfigData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HistoryFilterConfigResponse() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.dexkline.market.data.model.history.HistoryFilterConfigResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HistoryFilterConfigResponse copy$default(HistoryFilterConfigResponse historyFilterConfigResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = historyFilterConfigResponse.config;
        }
        return historyFilterConfigResponse.copy(list);
    }

    @SerialName("quoteVolumeConfig")
    public static /* synthetic */ void getConfig$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PriceRangeConfigData> component1() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryFilterConfigResponse copy(@NotNull List<PriceRangeConfigData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new HistoryFilterConfigResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HistoryFilterConfigResponse) && Intrinsics.EZpvd(this.config, ((HistoryFilterConfigResponse) obj).config);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PriceRangeConfigData> getConfig() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.config.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryFilterConfigResponse(config=" + this.config + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.history.HistoryFilterConfigResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HistoryFilterConfigResponse> serializer() {
            return HistoryFilterConfigResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HistoryFilterConfigResponse(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.config = yDY.AhwBna();
        } else {
            this.config = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(HistoryFilterConfigResponse historyFilterConfigResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(historyFilterConfigResponse.config, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], historyFilterConfigResponse.config);
    }

    public HistoryFilterConfigResponse(@NotNull List<PriceRangeConfigData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.config = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.dexkline.market.data.model.PriceRangeConfigData>):void (m)] (LINE:10) call: com.okinc.dexkline.market.data.model.history.HistoryFilterConfigResponse.<init>(java.util.List):void type: THIS */
    public /* synthetic */ HistoryFilterConfigResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
