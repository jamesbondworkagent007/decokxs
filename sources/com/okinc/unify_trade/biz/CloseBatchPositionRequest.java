package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class CloseBatchPositionRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String ccy;
    private final String instId;
    private final String mgnMode;
    private final String posSide;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CloseBatchPositionRequest copy$default(CloseBatchPositionRequest closeBatchPositionRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = closeBatchPositionRequest.instId;
        }
        if ((i & 2) != 0) {
            str2 = closeBatchPositionRequest.posSide;
        }
        if ((i & 4) != 0) {
            str3 = closeBatchPositionRequest.mgnMode;
        }
        if ((i & 8) != 0) {
            str4 = closeBatchPositionRequest.ccy;
        }
        return closeBatchPositionRequest.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CloseBatchPositionRequest copy(@NotNull String str, String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CloseBatchPositionRequest(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseBatchPositionRequest)) {
            return false;
        }
        CloseBatchPositionRequest closeBatchPositionRequest = (CloseBatchPositionRequest) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) closeBatchPositionRequest.instId) && Intrinsics.EZpvd((Object) this.posSide, (Object) closeBatchPositionRequest.posSide) && Intrinsics.EZpvd((Object) this.mgnMode, (Object) closeBatchPositionRequest.mgnMode) && Intrinsics.EZpvd((Object) this.ccy, (Object) closeBatchPositionRequest.ccy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnMode() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        String str = this.posSide;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.mgnMode.hashCode();
        String str2 = this.ccy;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CloseBatchPositionRequest(instId=" + this.instId + ", posSide=" + this.posSide + ", mgnMode=" + this.mgnMode + ", ccy=" + this.ccy + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.CloseBatchPositionRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CloseBatchPositionRequest> serializer() {
            return CloseBatchPositionRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CloseBatchPositionRequest(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, CloseBatchPositionRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.instId = str;
        this.posSide = str2;
        this.mgnMode = str3;
        this.ccy = str4;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(CloseBatchPositionRequest closeBatchPositionRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, closeBatchPositionRequest.instId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, closeBatchPositionRequest.posSide);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, closeBatchPositionRequest.mgnMode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, closeBatchPositionRequest.ccy);
    }

    public CloseBatchPositionRequest(@NotNull String str, String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.instId = str;
        this.posSide = str2;
        this.mgnMode = str3;
        this.ccy = str4;
    }
}
