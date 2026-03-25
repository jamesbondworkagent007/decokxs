package com.okinc.business.market.data.model.alert;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class AlertCreateResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final int ruleId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AlertCreateResponse copy$default(AlertCreateResponse alertCreateResponse, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = alertCreateResponse.ruleId;
        }
        return alertCreateResponse.EZpvd(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertCreateResponse EZpvd(int i) {
        return new AlertCreateResponse(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AlertCreateResponse) && this.ruleId == ((AlertCreateResponse) obj).ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.ruleId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AlertCreateResponse(ruleId=" + this.ruleId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.alert.AlertCreateResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AlertCreateResponse> serializer() {
            return AlertCreateResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AlertCreateResponse(int i, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, AlertCreateResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.ruleId = i2;
    }

    public AlertCreateResponse(int i) {
        this.ruleId = i;
    }
}
