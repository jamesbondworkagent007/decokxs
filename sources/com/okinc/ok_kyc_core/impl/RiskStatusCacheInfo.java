package com.okinc.ok_kyc_core.impl;

import com.google.gson.annotations.SerializedName;
import com.okinc.unify_trade.biz.BotWebHook;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class RiskStatusCacheInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @SerializedName(BotWebHook.KEY_ACTION)
    private final int action;

    @SerializedName("timestamp")
    private final long timestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RiskStatusCacheInfo copy$default(RiskStatusCacheInfo riskStatusCacheInfo, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = riskStatusCacheInfo.action;
        }
        if ((i2 & 2) != 0) {
            j = riskStatusCacheInfo.timestamp;
        }
        return riskStatusCacheInfo.copy(i, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskStatusCacheInfo copy(int i, long j) {
        return new RiskStatusCacheInfo(i, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RiskStatusCacheInfo)) {
            return false;
        }
        RiskStatusCacheInfo riskStatusCacheInfo = (RiskStatusCacheInfo) obj;
        return this.action == riskStatusCacheInfo.action && this.timestamp == riskStatusCacheInfo.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAction() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.action) * 31) + Long.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RiskStatusCacheInfo(action=" + this.action + ", timestamp=" + this.timestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.impl.RiskStatusCacheInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RiskStatusCacheInfo> serializer() {
            return RiskStatusCacheInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RiskStatusCacheInfo(int i, int i2, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, RiskStatusCacheInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.action = i2;
        this.timestamp = j;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(RiskStatusCacheInfo riskStatusCacheInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, riskStatusCacheInfo.action);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, riskStatusCacheInfo.timestamp);
    }

    public RiskStatusCacheInfo(int i, long j) {
        this.action = i;
        this.timestamp = j;
    }
}
