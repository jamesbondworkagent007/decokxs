package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SpotCopySwitchRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String instFamily;
    private final String switchStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpotCopySwitchRequest copy$default(SpotCopySwitchRequest spotCopySwitchRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotCopySwitchRequest.switchStatus;
        }
        if ((i & 2) != 0) {
            str2 = spotCopySwitchRequest.instFamily;
        }
        return spotCopySwitchRequest.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.switchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotCopySwitchRequest copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SpotCopySwitchRequest(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpotCopySwitchRequest)) {
            return false;
        }
        SpotCopySwitchRequest spotCopySwitchRequest = (SpotCopySwitchRequest) obj;
        return Intrinsics.EZpvd((Object) this.switchStatus, (Object) spotCopySwitchRequest.switchStatus) && Intrinsics.EZpvd((Object) this.instFamily, (Object) spotCopySwitchRequest.instFamily);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwitchStatus() {
        return this.switchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.switchStatus.hashCode() * 31) + this.instFamily.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotCopySwitchRequest(switchStatus=" + this.switchStatus + ", instFamily=" + this.instFamily + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpotCopySwitchRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotCopySwitchRequest> serializer() {
            return SpotCopySwitchRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotCopySwitchRequest(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SpotCopySwitchRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.switchStatus = str;
        this.instFamily = str2;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpotCopySwitchRequest spotCopySwitchRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, spotCopySwitchRequest.switchStatus);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, spotCopySwitchRequest.instFamily);
    }

    public SpotCopySwitchRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.switchStatus = str;
        this.instFamily = str2;
    }
}
