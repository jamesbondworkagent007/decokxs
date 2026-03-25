package com.okinc.business.dex.trade.copytrading.home.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CTSubscribeResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String requestId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CTSubscribeResponse() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CTSubscribeResponse copy$default(CTSubscribeResponse cTSubscribeResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cTSubscribeResponse.requestId;
        }
        return cTSubscribeResponse.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTSubscribeResponse copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CTSubscribeResponse(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CTSubscribeResponse) && Intrinsics.EZpvd((Object) this.requestId, (Object) ((CTSubscribeResponse) obj).requestId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.requestId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CTSubscribeResponse(requestId=" + this.requestId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CTSubscribeResponse> serializer() {
            return CTSubscribeResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CTSubscribeResponse(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.requestId = "";
        } else {
            this.requestId = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CTSubscribeResponse cTSubscribeResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd((Object) cTSubscribeResponse.requestId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cTSubscribeResponse.requestId);
    }

    public CTSubscribeResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.requestId = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:290) call: com.okinc.business.dex.trade.copytrading.home.data.CTSubscribeResponse.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ CTSubscribeResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
