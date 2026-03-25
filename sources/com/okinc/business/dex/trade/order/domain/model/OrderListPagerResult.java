package com.okinc.business.dex.trade.order.domain.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class OrderListPagerResult<T> {
    private static final SerialDescriptor $cachedDescriptor;
    private final String cursor;
    private final List<T> dataList;
    private final boolean hasNext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderListPagerResult copy$default(OrderListPagerResult orderListPagerResult, List list, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = orderListPagerResult.dataList;
        }
        if ((i & 2) != 0) {
            str = orderListPagerResult.cursor;
        }
        if ((i & 4) != 0) {
            z = orderListPagerResult.hasNext;
        }
        return orderListPagerResult.copy(list, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<T> component1() {
        return this.dataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.hasNext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderListPagerResult<T> copy(@NotNull List<? extends T> list, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new OrderListPagerResult<>(list, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderListPagerResult)) {
            return false;
        }
        OrderListPagerResult orderListPagerResult = (OrderListPagerResult) obj;
        return Intrinsics.EZpvd(this.dataList, orderListPagerResult.dataList) && Intrinsics.EZpvd((Object) this.cursor, (Object) orderListPagerResult.cursor) && this.hasNext == orderListPagerResult.hasNext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCursor() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<T> getDataList() {
        return this.dataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasNext() {
        return this.hasNext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.dataList.hashCode() * 31) + this.cursor.hashCode()) * 31) + Boolean.hashCode(this.hasNext);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderListPagerResult(dataList=" + this.dataList + ", cursor=" + this.cursor + ", hasNext=" + this.hasNext + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> KSerializer<OrderListPagerResult<T>> serializer(@NotNull KSerializer<T> kSerializer) {
            Intrinsics.checkNotNullParameter(kSerializer, "");
            return new OrderListPagerResult$$serializer(kSerializer);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult", null, 3);
        pluginGeneratedSerialDescriptor.addElement("dataList", false);
        pluginGeneratedSerialDescriptor.addElement("cursor", false);
        pluginGeneratedSerialDescriptor.addElement("hasNext", false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ OrderListPagerResult(int i, List list, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, $cachedDescriptor);
        }
        this.dataList = list;
        this.cursor = str;
        this.hasNext = z;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(OrderListPagerResult orderListPagerResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, new ArrayListSerializer(kSerializer), orderListPagerResult.dataList);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, orderListPagerResult.cursor);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, orderListPagerResult.hasNext);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public OrderListPagerResult(@NotNull List<? extends T> list, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.dataList = list;
        this.cursor = str;
        this.hasNext = z;
    }
}
