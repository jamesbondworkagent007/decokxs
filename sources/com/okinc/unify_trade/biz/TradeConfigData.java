package com.okinc.unify_trade.biz;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TradeConfigData {
    private final ArrayList<IdxCcyConfig> idxCcyConfig;
    private final ArrayList<IdxConfig> idxConfig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IdxCcyConfig$$serializer.INSTANCE), new ArrayListSerializer(IdxConfig$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeConfigData() {
        this((ArrayList) null, (ArrayList) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.TradeConfigData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TradeConfigData copy$default(TradeConfigData tradeConfigData, ArrayList arrayList, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = tradeConfigData.idxCcyConfig;
        }
        if ((i & 2) != 0) {
            arrayList2 = tradeConfigData.idxConfig;
        }
        return tradeConfigData.copy(arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<IdxCcyConfig> component1() {
        return this.idxCcyConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<IdxConfig> component2() {
        return this.idxConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeConfigData copy(@NotNull ArrayList<IdxCcyConfig> arrayList, @NotNull ArrayList<IdxConfig> arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        return new TradeConfigData(arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeConfigData)) {
            return false;
        }
        TradeConfigData tradeConfigData = (TradeConfigData) obj;
        return Intrinsics.EZpvd(this.idxCcyConfig, tradeConfigData.idxCcyConfig) && Intrinsics.EZpvd(this.idxConfig, tradeConfigData.idxConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<IdxCcyConfig> getIdxCcyConfig() {
        return this.idxCcyConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<IdxConfig> getIdxConfig() {
        return this.idxConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.idxCcyConfig.hashCode() * 31) + this.idxConfig.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeConfigData(idxCcyConfig=" + this.idxCcyConfig + ", idxConfig=" + this.idxConfig + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeConfigData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeConfigData> serializer() {
            return TradeConfigData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeConfigData(int i, ArrayList arrayList, ArrayList arrayList2, SerializationConstructorMarker serializationConstructorMarker) {
        this.idxCcyConfig = (i & 1) == 0 ? new ArrayList() : arrayList;
        if ((i & 2) == 0) {
            this.idxConfig = new ArrayList<>();
        } else {
            this.idxConfig = arrayList2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeConfigData tradeConfigData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(tradeConfigData.idxCcyConfig, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], tradeConfigData.idxCcyConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(tradeConfigData.idxConfig, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], tradeConfigData.idxConfig);
    }

    public TradeConfigData(@NotNull ArrayList<IdxCcyConfig> arrayList, @NotNull ArrayList<IdxConfig> arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        this.idxCcyConfig = arrayList;
        this.idxConfig = arrayList2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:1183) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:1184) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.ArrayList))
 A[MD:(java.util.ArrayList<com.okinc.unify_trade.biz.IdxCcyConfig>, java.util.ArrayList<com.okinc.unify_trade.biz.IdxConfig>):void (m)] (LINE:1182) call: com.okinc.unify_trade.biz.TradeConfigData.<init>(java.util.ArrayList, java.util.ArrayList):void type: THIS */
    public /* synthetic */ TradeConfigData(ArrayList arrayList, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? new ArrayList() : arrayList2);
    }

    public final void putIdxConfig(@NotNull IdxConfig idxConfig) {
        Intrinsics.checkNotNullParameter(idxConfig, "");
        this.idxConfig.add(idxConfig);
    }

    public final void putIdxCcyConfig(@NotNull IdxCcyConfig idxCcyConfig) {
        Intrinsics.checkNotNullParameter(idxCcyConfig, "");
        this.idxCcyConfig.add(idxCcyConfig);
    }
}
