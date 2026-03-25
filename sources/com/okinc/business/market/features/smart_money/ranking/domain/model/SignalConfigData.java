package com.okinc.business.market.features.smart_money.ranking.domain.model;

import com.okinc.business.market.data.model.common.ChainInfoData;
import com.okinc.business.market.data.model.common.ChainInfoData$$serializer;
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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class SignalConfigData {
    public final List<ChainInfoData> chains;
    public final List<SmartMoneySignalProtocolFilterData> protocolFilterData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(ChainInfoData$$serializer.INSTANCE), new ArrayListSerializer(SmartMoneySignalProtocolFilterData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.smart_money.ranking.domain.model.SignalConfigData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalConfigData copy$default(SignalConfigData signalConfigData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = signalConfigData.chains;
        }
        if ((i & 2) != 0) {
            list2 = signalConfigData.protocolFilterData;
        }
        return signalConfigData.AEQbTJ(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalConfigData AEQbTJ(@NotNull List<ChainInfoData> list, @NotNull List<SmartMoneySignalProtocolFilterData> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new SignalConfigData(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SmartMoneySignalProtocolFilterData> KWHzl() {
        return this.protocolFilterData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainInfoData> OLrzqt() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalConfigData)) {
            return false;
        }
        SignalConfigData signalConfigData = (SignalConfigData) obj;
        return Intrinsics.EZpvd(this.chains, signalConfigData.chains) && Intrinsics.EZpvd(this.protocolFilterData, signalConfigData.protocolFilterData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.chains.hashCode() * 31) + this.protocolFilterData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalConfigData(chains=" + this.chains + ", protocolFilterData=" + this.protocolFilterData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.smart_money.ranking.domain.model.SignalConfigData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalConfigData> serializer() {
            return SignalConfigData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalConfigData(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, SignalConfigData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.chains = yDY.AhwBna();
        } else {
            this.chains = list;
        }
        this.protocolFilterData = list2;
    }

    public static final /* synthetic */ void copydefault(SignalConfigData signalConfigData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(signalConfigData.chains, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], signalConfigData.chains);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], signalConfigData.protocolFilterData);
    }

    public SignalConfigData(@NotNull List<ChainInfoData> list, @NotNull List<SmartMoneySignalProtocolFilterData> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.chains = list;
        this.protocolFilterData = list2;
    }
}
