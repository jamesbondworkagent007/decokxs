package com.okinc.tradingbot.impl.dto;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class DcaPreviewResponse {
    public final DcaPreviewOrderInfo initOrder;
    public final List<DcaPreviewOrderInfo> safetyOrders;
    public final DcaPreviewOrderInfo slOrder;
    public final DcaPreviewOrderInfo tpOrder;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(DcaPreviewOrderInfo$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DcaPreviewResponse() {
        this((DcaPreviewOrderInfo) null, (List) null, (DcaPreviewOrderInfo) null, (DcaPreviewOrderInfo) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.dto.DcaPreviewResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DcaPreviewResponse copy$default(DcaPreviewResponse dcaPreviewResponse, DcaPreviewOrderInfo dcaPreviewOrderInfo, List list, DcaPreviewOrderInfo dcaPreviewOrderInfo2, DcaPreviewOrderInfo dcaPreviewOrderInfo3, int i, Object obj) {
        if ((i & 1) != 0) {
            dcaPreviewOrderInfo = dcaPreviewResponse.initOrder;
        }
        if ((i & 2) != 0) {
            list = dcaPreviewResponse.safetyOrders;
        }
        if ((i & 4) != 0) {
            dcaPreviewOrderInfo2 = dcaPreviewResponse.tpOrder;
        }
        if ((i & 8) != 0) {
            dcaPreviewOrderInfo3 = dcaPreviewResponse.slOrder;
        }
        return dcaPreviewResponse.AEQbTJ(dcaPreviewOrderInfo, list, dcaPreviewOrderInfo2, dcaPreviewOrderInfo3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaPreviewOrderInfo AEQbTJ() {
        return this.initOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaPreviewResponse AEQbTJ(DcaPreviewOrderInfo dcaPreviewOrderInfo, @NotNull List<DcaPreviewOrderInfo> list, DcaPreviewOrderInfo dcaPreviewOrderInfo2, DcaPreviewOrderInfo dcaPreviewOrderInfo3) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DcaPreviewResponse(dcaPreviewOrderInfo, list, dcaPreviewOrderInfo2, dcaPreviewOrderInfo3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaPreviewOrderInfo> EZpvd() {
        return this.safetyOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaPreviewOrderInfo OLrzqt() {
        return this.tpOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaPreviewOrderInfo copydefault() {
        return this.slOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DcaPreviewResponse)) {
            return false;
        }
        DcaPreviewResponse dcaPreviewResponse = (DcaPreviewResponse) obj;
        return Intrinsics.EZpvd(this.initOrder, dcaPreviewResponse.initOrder) && Intrinsics.EZpvd(this.safetyOrders, dcaPreviewResponse.safetyOrders) && Intrinsics.EZpvd(this.tpOrder, dcaPreviewResponse.tpOrder) && Intrinsics.EZpvd(this.slOrder, dcaPreviewResponse.slOrder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DcaPreviewOrderInfo dcaPreviewOrderInfo = this.initOrder;
        int iHashCode = dcaPreviewOrderInfo == null ? 0 : dcaPreviewOrderInfo.hashCode();
        int iHashCode2 = this.safetyOrders.hashCode();
        DcaPreviewOrderInfo dcaPreviewOrderInfo2 = this.tpOrder;
        int iHashCode3 = dcaPreviewOrderInfo2 == null ? 0 : dcaPreviewOrderInfo2.hashCode();
        DcaPreviewOrderInfo dcaPreviewOrderInfo3 = this.slOrder;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (dcaPreviewOrderInfo3 != null ? dcaPreviewOrderInfo3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DcaPreviewResponse(initOrder=" + this.initOrder + ", safetyOrders=" + this.safetyOrders + ", tpOrder=" + this.tpOrder + ", slOrder=" + this.slOrder + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.DcaPreviewResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DcaPreviewResponse> serializer() {
            return DcaPreviewResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DcaPreviewResponse(int i, DcaPreviewOrderInfo dcaPreviewOrderInfo, List list, DcaPreviewOrderInfo dcaPreviewOrderInfo2, DcaPreviewOrderInfo dcaPreviewOrderInfo3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.initOrder = null;
        } else {
            this.initOrder = dcaPreviewOrderInfo;
        }
        if ((i & 2) == 0) {
            this.safetyOrders = yDY.AhwBna();
        } else {
            this.safetyOrders = list;
        }
        if ((i & 4) == 0) {
            this.tpOrder = null;
        } else {
            this.tpOrder = dcaPreviewOrderInfo2;
        }
        if ((i & 8) == 0) {
            this.slOrder = null;
        } else {
            this.slOrder = dcaPreviewOrderInfo3;
        }
    }

    public static final /* synthetic */ void copydefault(DcaPreviewResponse dcaPreviewResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dcaPreviewResponse.initOrder != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, DcaPreviewOrderInfo$$serializer.INSTANCE, dcaPreviewResponse.initOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(dcaPreviewResponse.safetyOrders, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], dcaPreviewResponse.safetyOrders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dcaPreviewResponse.tpOrder != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, DcaPreviewOrderInfo$$serializer.INSTANCE, dcaPreviewResponse.tpOrder);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && dcaPreviewResponse.slOrder == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, DcaPreviewOrderInfo$$serializer.INSTANCE, dcaPreviewResponse.slOrder);
    }

    public DcaPreviewResponse(DcaPreviewOrderInfo dcaPreviewOrderInfo, @NotNull List<DcaPreviewOrderInfo> list, DcaPreviewOrderInfo dcaPreviewOrderInfo2, DcaPreviewOrderInfo dcaPreviewOrderInfo3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.initOrder = dcaPreviewOrderInfo;
        this.safetyOrders = list;
        this.tpOrder = dcaPreviewOrderInfo2;
        this.slOrder = dcaPreviewOrderInfo3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo) : (r2v0 com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r3v0 java.util.List))
  (wrap:com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo:?: TERNARY null = ((wrap:int:0x000e: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo) : (r4v0 com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo))
  (wrap:com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo:?: TERNARY null = ((wrap:int:0x0013: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo) : (r5v0 com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo))
 A[MD:(com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo, java.util.List<com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo>, com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo, com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo):void (m)] (LINE:8) call: com.okinc.tradingbot.impl.dto.DcaPreviewResponse.<init>(com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo, java.util.List, com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo, com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo):void type: THIS */
    public /* synthetic */ DcaPreviewResponse(DcaPreviewOrderInfo dcaPreviewOrderInfo, List list, DcaPreviewOrderInfo dcaPreviewOrderInfo2, DcaPreviewOrderInfo dcaPreviewOrderInfo3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dcaPreviewOrderInfo, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? null : dcaPreviewOrderInfo2, (i & 8) != 0 ? null : dcaPreviewOrderInfo3);
    }
}
