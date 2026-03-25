package com.okinc.unify_trade.biz.subscribe;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class TickerDataGroup {
    private final String instType;
    private final List<TickersData> tickers;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(TickersData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.subscribe.TickerDataGroup */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TickerDataGroup copy$default(TickerDataGroup tickerDataGroup, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tickerDataGroup.instType;
        }
        if ((i & 2) != 0) {
            list = tickerDataGroup.tickers;
        }
        return tickerDataGroup.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TickersData> component2() {
        return this.tickers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TickerDataGroup copy(@NotNull String str, List<TickersData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TickerDataGroup(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TickerDataGroup)) {
            return false;
        }
        TickerDataGroup tickerDataGroup = (TickerDataGroup) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) tickerDataGroup.instType) && Intrinsics.EZpvd(this.tickers, tickerDataGroup.tickers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TickersData> getTickers() {
        return this.tickers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instType.hashCode();
        List<TickersData> list = this.tickers;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TickerDataGroup(instType=" + this.instType + ", tickers=" + this.tickers + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.TickerDataGroup.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TickerDataGroup> serializer() {
            return TickerDataGroup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TickerDataGroup(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TickerDataGroup$$serializer.INSTANCE.getDescriptor());
        }
        this.instType = str;
        this.tickers = list;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TickerDataGroup tickerDataGroup, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tickerDataGroup.instType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], tickerDataGroup.tickers);
    }

    public TickerDataGroup(@NotNull String str, List<TickersData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
        this.tickers = list;
    }
}
