package com.okinc.business.dex.trade.copytrading.home.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CTSubscribeRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final CTSubscribeRequestParam param;
    private final String requestId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CTSubscribeRequest copy$default(CTSubscribeRequest cTSubscribeRequest, String str, CTSubscribeRequestParam cTSubscribeRequestParam, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cTSubscribeRequest.requestId;
        }
        if ((i & 2) != 0) {
            cTSubscribeRequestParam = cTSubscribeRequest.param;
        }
        return cTSubscribeRequest.copy(str, cTSubscribeRequestParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTSubscribeRequestParam component2() {
        return this.param;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTSubscribeRequest copy(@NotNull String str, @NotNull CTSubscribeRequestParam cTSubscribeRequestParam) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cTSubscribeRequestParam, "");
        return new CTSubscribeRequest(str, cTSubscribeRequestParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CTSubscribeRequest)) {
            return false;
        }
        CTSubscribeRequest cTSubscribeRequest = (CTSubscribeRequest) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) cTSubscribeRequest.requestId) && Intrinsics.EZpvd(this.param, cTSubscribeRequest.param);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTSubscribeRequestParam getParam() {
        return this.param;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.requestId.hashCode() * 31) + this.param.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CTSubscribeRequest(requestId=" + this.requestId + ", param=" + this.param + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CTSubscribeRequest> serializer() {
            return CTSubscribeRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CTSubscribeRequest(int i, String str, CTSubscribeRequestParam cTSubscribeRequestParam, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, CTSubscribeRequest$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.requestId = "";
        } else {
            this.requestId = str;
        }
        this.param = cTSubscribeRequestParam;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CTSubscribeRequest cTSubscribeRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) cTSubscribeRequest.requestId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, cTSubscribeRequest.requestId);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, CTSubscribeRequestParam$$serializer.INSTANCE, cTSubscribeRequest.param);
    }

    public CTSubscribeRequest(@NotNull String str, @NotNull CTSubscribeRequestParam cTSubscribeRequestParam) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cTSubscribeRequestParam, "");
        this.requestId = str;
        this.param = cTSubscribeRequestParam;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeRequestParam)
 A[MD:(java.lang.String, com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeRequestParam):void (m)] (LINE:272) call: com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeRequest.<init>(java.lang.String, com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeRequestParam):void type: THIS */
    public /* synthetic */ CTSubscribeRequest(String str, CTSubscribeRequestParam cTSubscribeRequestParam, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, cTSubscribeRequestParam);
    }
}
