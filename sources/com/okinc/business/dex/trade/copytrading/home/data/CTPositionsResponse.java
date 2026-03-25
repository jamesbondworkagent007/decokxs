package com.okinc.business.dex.trade.copytrading.home.data;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CTPositionsResponse {
    private final String chainId;
    private final List<CTPosition> positions;
    private final String strategyId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(CTPosition$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CTPositionsResponse() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.trade.copytrading.home.data.CTPositionsResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CTPositionsResponse copy$default(CTPositionsResponse cTPositionsResponse, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cTPositionsResponse.strategyId;
        }
        if ((i & 2) != 0) {
            str2 = cTPositionsResponse.chainId;
        }
        if ((i & 4) != 0) {
            list = cTPositionsResponse.positions;
        }
        return cTPositionsResponse.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CTPosition> component3() {
        return this.positions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTPositionsResponse copy(@NotNull String str, @NotNull String str2, @NotNull List<CTPosition> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new CTPositionsResponse(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CTPositionsResponse)) {
            return false;
        }
        CTPositionsResponse cTPositionsResponse = (CTPositionsResponse) obj;
        return Intrinsics.EZpvd((Object) this.strategyId, (Object) cTPositionsResponse.strategyId) && Intrinsics.EZpvd((Object) this.chainId, (Object) cTPositionsResponse.chainId) && Intrinsics.EZpvd(this.positions, cTPositionsResponse.positions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CTPosition> getPositions() {
        return this.positions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyId() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.strategyId.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.positions.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CTPositionsResponse(strategyId=" + this.strategyId + ", chainId=" + this.chainId + ", positions=" + this.positions + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.CTPositionsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CTPositionsResponse> serializer() {
            return CTPositionsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CTPositionsResponse(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.strategyId = "";
        } else {
            this.strategyId = str;
        }
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str2;
        }
        if ((i & 4) == 0) {
            this.positions = yDY.AhwBna();
        } else {
            this.positions = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CTPositionsResponse cTPositionsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) cTPositionsResponse.strategyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, cTPositionsResponse.strategyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) cTPositionsResponse.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, cTPositionsResponse.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(cTPositionsResponse.positions, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], cTPositionsResponse.positions);
    }

    public CTPositionsResponse(@NotNull String str, @NotNull String str2, @NotNull List<CTPosition> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.strategyId = str;
        this.chainId = str2;
        this.positions = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:309)) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.business.dex.trade.copytrading.home.data.CTPosition>):void (m)] (LINE:306) call: com.okinc.business.dex.trade.copytrading.home.data.CTPositionsResponse.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ CTPositionsResponse(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
