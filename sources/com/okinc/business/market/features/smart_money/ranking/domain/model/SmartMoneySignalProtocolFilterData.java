package com.okinc.business.market.features.smart_money.ranking.domain.model;

import com.okinc.business.market.data.model.common.ProtocolInfoData;
import com.okinc.business.market.data.model.common.ProtocolInfoData$$serializer;
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

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class SmartMoneySignalProtocolFilterData {
    public final String chainId;
    public final List<ProtocolInfoData> protocolList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(ProtocolInfoData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartMoneySignalProtocolFilterData() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneySignalProtocolFilterData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SmartMoneySignalProtocolFilterData copy$default(SmartMoneySignalProtocolFilterData smartMoneySignalProtocolFilterData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smartMoneySignalProtocolFilterData.chainId;
        }
        if ((i & 2) != 0) {
            list = smartMoneySignalProtocolFilterData.protocolList;
        }
        return smartMoneySignalProtocolFilterData.copydefault(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProtocolInfoData> EZpvd() {
        return this.protocolList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartMoneySignalProtocolFilterData copydefault(@NotNull String str, @NotNull List<ProtocolInfoData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SmartMoneySignalProtocolFilterData(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartMoneySignalProtocolFilterData)) {
            return false;
        }
        SmartMoneySignalProtocolFilterData smartMoneySignalProtocolFilterData = (SmartMoneySignalProtocolFilterData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) smartMoneySignalProtocolFilterData.chainId) && Intrinsics.EZpvd(this.protocolList, smartMoneySignalProtocolFilterData.protocolList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.chainId.hashCode() * 31) + this.protocolList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartMoneySignalProtocolFilterData(chainId=" + this.chainId + ", protocolList=" + this.protocolList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneySignalProtocolFilterData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartMoneySignalProtocolFilterData> serializer() {
            return SmartMoneySignalProtocolFilterData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmartMoneySignalProtocolFilterData(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.protocolList = yDY.AhwBna();
        } else {
            this.protocolList = list;
        }
    }

    public static final /* synthetic */ void KWHzl(SmartMoneySignalProtocolFilterData smartMoneySignalProtocolFilterData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) smartMoneySignalProtocolFilterData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, smartMoneySignalProtocolFilterData.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(smartMoneySignalProtocolFilterData.protocolList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], smartMoneySignalProtocolFilterData.protocolList);
    }

    public SmartMoneySignalProtocolFilterData(@NotNull String str, @NotNull List<ProtocolInfoData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.chainId = str;
        this.protocolList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:21)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.market.data.model.common.ProtocolInfoData>):void (m)] (LINE:17) call: com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneySignalProtocolFilterData.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ SmartMoneySignalProtocolFilterData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
