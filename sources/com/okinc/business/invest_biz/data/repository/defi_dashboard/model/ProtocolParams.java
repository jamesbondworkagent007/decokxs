package com.okinc.business.invest_biz.data.repository.defi_dashboard.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ProtocolParams {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final long analysisPlatformId;
    public final long chainId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ProtocolParams copy$default(ProtocolParams protocolParams, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = protocolParams.analysisPlatformId;
        }
        if ((i & 2) != 0) {
            j2 = protocolParams.chainId;
        }
        return protocolParams.KWHzl(j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtocolParams KWHzl(long j, long j2) {
        return new ProtocolParams(j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolParams)) {
            return false;
        }
        ProtocolParams protocolParams = (ProtocolParams) obj;
        return this.analysisPlatformId == protocolParams.analysisPlatformId && this.chainId == protocolParams.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.analysisPlatformId) * 31) + Long.hashCode(this.chainId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProtocolParams(analysisPlatformId=" + this.analysisPlatformId + ", chainId=" + this.chainId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.repository.defi_dashboard.model.ProtocolParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProtocolParams> serializer() {
            return ProtocolParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProtocolParams(int i, long j, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ProtocolParams$$serializer.INSTANCE.getDescriptor());
        }
        this.analysisPlatformId = j;
        this.chainId = j2;
    }

    public static final /* synthetic */ void EZpvd(ProtocolParams protocolParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, protocolParams.analysisPlatformId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, protocolParams.chainId);
    }

    public ProtocolParams(long j, long j2) {
        this.analysisPlatformId = j;
        this.chainId = j2;
    }
}
