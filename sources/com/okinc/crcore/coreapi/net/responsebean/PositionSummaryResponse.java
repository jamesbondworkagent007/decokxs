package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PositionSummaryResponse {
    private final OrderSummary orders;
    private final PositionSummary positions;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PositionSummaryResponse copy$default(PositionSummaryResponse positionSummaryResponse, OrderSummary orderSummary, PositionSummary positionSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            orderSummary = positionSummaryResponse.orders;
        }
        if ((i & 2) != 0) {
            positionSummary = positionSummaryResponse.positions;
        }
        return positionSummaryResponse.copy(orderSummary, positionSummary);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderSummary component1() {
        return this.orders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PositionSummary component2() {
        return this.positions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PositionSummaryResponse copy(@NotNull OrderSummary orderSummary, @NotNull PositionSummary positionSummary) {
        Intrinsics.checkNotNullParameter(orderSummary, "");
        Intrinsics.checkNotNullParameter(positionSummary, "");
        return new PositionSummaryResponse(orderSummary, positionSummary);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PositionSummaryResponse)) {
            return false;
        }
        PositionSummaryResponse positionSummaryResponse = (PositionSummaryResponse) obj;
        return Intrinsics.EZpvd(this.orders, positionSummaryResponse.orders) && Intrinsics.EZpvd(this.positions, positionSummaryResponse.positions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderSummary getOrders() {
        return this.orders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PositionSummary getPositions() {
        return this.positions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.orders.hashCode() * 31) + this.positions.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PositionSummaryResponse(orders=" + this.orders + ", positions=" + this.positions + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.PositionSummaryResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PositionSummaryResponse> serializer() {
            return PositionSummaryResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PositionSummaryResponse(int i, OrderSummary orderSummary, PositionSummary positionSummary, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PositionSummaryResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.orders = orderSummary;
        this.positions = positionSummary;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(PositionSummaryResponse positionSummaryResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, OrderSummary$$serializer.INSTANCE, positionSummaryResponse.orders);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, PositionSummary$$serializer.INSTANCE, positionSummaryResponse.positions);
    }

    public PositionSummaryResponse(@NotNull OrderSummary orderSummary, @NotNull PositionSummary positionSummary) {
        Intrinsics.checkNotNullParameter(orderSummary, "");
        Intrinsics.checkNotNullParameter(positionSummary, "");
        this.orders = orderSummary;
        this.positions = positionSummary;
    }
}
