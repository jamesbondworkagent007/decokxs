package com.okinc.business.dex.trade.copytrading.home.data;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PnLUpdateData {
    public final List<StrategyWithPnL> strategyList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StrategyWithPnL$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.trade.copytrading.home.data.PnLUpdateData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PnLUpdateData copy$default(PnLUpdateData pnLUpdateData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pnLUpdateData.strategyList;
        }
        return pnLUpdateData.EZpvd(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLUpdateData EZpvd(@NotNull List<StrategyWithPnL> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new PnLUpdateData(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PnLUpdateData) && Intrinsics.EZpvd(this.strategyList, ((PnLUpdateData) obj).strategyList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.strategyList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PnLUpdateData(strategyList=" + this.strategyList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.PnLUpdateData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PnLUpdateData> serializer() {
            return PnLUpdateData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PnLUpdateData(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PnLUpdateData$$serializer.INSTANCE.getDescriptor());
        }
        this.strategyList = list;
    }

    public PnLUpdateData(@NotNull List<StrategyWithPnL> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.strategyList = list;
    }
}
