package com.okinc.business.invest_biz.data.repository.defi_dashboard.model;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ProtocolDetailsParams {
    public final List<ProtocolParams> protocols;
    public final String walletAddressList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(ProtocolParams$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.repository.defi_dashboard.model.ProtocolDetailsParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtocolDetailsParams copy$default(ProtocolDetailsParams protocolDetailsParams, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = protocolDetailsParams.walletAddressList;
        }
        if ((i & 2) != 0) {
            list = protocolDetailsParams.protocols;
        }
        return protocolDetailsParams.OLrzqt(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtocolDetailsParams OLrzqt(String str, @NotNull List<ProtocolParams> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ProtocolDetailsParams(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProtocolParams> OLrzqt() {
        return this.protocols;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolDetailsParams)) {
            return false;
        }
        ProtocolDetailsParams protocolDetailsParams = (ProtocolDetailsParams) obj;
        return Intrinsics.EZpvd((Object) this.walletAddressList, (Object) protocolDetailsParams.walletAddressList) && Intrinsics.EZpvd(this.protocols, protocolDetailsParams.protocols);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.walletAddressList;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.protocols.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProtocolDetailsParams(walletAddressList=" + this.walletAddressList + ", protocols=" + this.protocols + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.repository.defi_dashboard.model.ProtocolDetailsParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProtocolDetailsParams> serializer() {
            return ProtocolDetailsParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProtocolDetailsParams(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ProtocolDetailsParams$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAddressList = str;
        this.protocols = list;
    }

    public static final /* synthetic */ void EZpvd(ProtocolDetailsParams protocolDetailsParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, protocolDetailsParams.walletAddressList);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], protocolDetailsParams.protocols);
    }

    public ProtocolDetailsParams(String str, @NotNull List<ProtocolParams> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.walletAddressList = str;
        this.protocols = list;
    }
}
