package com.okinc.business.dex.tee.common.ws.data.domain.model;

import com.okinc.business.dex.trade.copytrading.home.data.CTPosition;
import com.okinc.business.dex.trade.copytrading.home.data.CTPosition$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TeeWsPositionData {
    private final WsPositionParam param;
    private final List<CTPosition> positionDetails;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(CTPosition$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TeeWsPositionData() {
        this((WsPositionParam) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsPositionData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeeWsPositionData copy$default(TeeWsPositionData teeWsPositionData, WsPositionParam wsPositionParam, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            wsPositionParam = teeWsPositionData.param;
        }
        if ((i & 2) != 0) {
            list = teeWsPositionData.positionDetails;
        }
        return teeWsPositionData.copy(wsPositionParam, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WsPositionParam component1() {
        return this.param;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CTPosition> component2() {
        return this.positionDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeWsPositionData copy(WsPositionParam wsPositionParam, List<CTPosition> list) {
        return new TeeWsPositionData(wsPositionParam, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeWsPositionData)) {
            return false;
        }
        TeeWsPositionData teeWsPositionData = (TeeWsPositionData) obj;
        return Intrinsics.EZpvd(this.param, teeWsPositionData.param) && Intrinsics.EZpvd(this.positionDetails, teeWsPositionData.positionDetails);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WsPositionParam getParam() {
        return this.param;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CTPosition> getPositionDetails() {
        return this.positionDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        WsPositionParam wsPositionParam = this.param;
        int iHashCode = wsPositionParam == null ? 0 : wsPositionParam.hashCode();
        List<CTPosition> list = this.positionDetails;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeWsPositionData(param=" + this.param + ", positionDetails=" + this.positionDetails + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsPositionData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TeeWsPositionData> serializer() {
            return TeeWsPositionData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TeeWsPositionData(int i, WsPositionParam wsPositionParam, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.param = null;
        } else {
            this.param = wsPositionParam;
        }
        if ((i & 2) == 0) {
            this.positionDetails = null;
        } else {
            this.positionDetails = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TeeWsPositionData teeWsPositionData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || teeWsPositionData.param != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, WsPositionParam$$serializer.INSTANCE, teeWsPositionData.param);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && teeWsPositionData.positionDetails == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], teeWsPositionData.positionDetails);
    }

    public TeeWsPositionData(WsPositionParam wsPositionParam, List<CTPosition> list) {
        this.param = wsPositionParam;
        this.positionDetails = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.tee.common.ws.data.domain.model.WsPositionParam:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.tee.common.ws.data.domain.model.WsPositionParam) : (r2v0 com.okinc.business.dex.tee.common.ws.data.domain.model.WsPositionParam))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(com.okinc.business.dex.tee.common.ws.data.domain.model.WsPositionParam, java.util.List<com.okinc.business.dex.trade.copytrading.home.data.CTPosition>):void (m)] (LINE:114) call: com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsPositionData.<init>(com.okinc.business.dex.tee.common.ws.data.domain.model.WsPositionParam, java.util.List):void type: THIS */
    public /* synthetic */ TeeWsPositionData(WsPositionParam wsPositionParam, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wsPositionParam, (i & 2) != 0 ? null : list);
    }
}
